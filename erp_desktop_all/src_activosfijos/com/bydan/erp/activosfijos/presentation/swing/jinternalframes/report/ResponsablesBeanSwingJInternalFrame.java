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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.activosfijos.util.ResponsablesConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ResponsablesParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ResponsablesParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ResponsablesBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

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
public class ResponsablesBeanSwingJInternalFrame extends ResponsablesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ResponsablesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Responsables> responsablesValidator = new ClassValidator<Responsables>(Responsables.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Responsables responsables;	
	public Responsables responsablesAux;
	public Responsables responsablesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Responsables responsablesTotales;
	public Long idResponsablesActual;
	public Long iIdNuevoResponsables=0L;
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
	
	public Boolean isPermisoTodoResponsables;
	public Boolean isPermisoNuevoResponsables;
	public Boolean isPermisoActualizarResponsables;
	public Boolean isPermisoActualizarOriginalResponsables;
	public Boolean isPermisoEliminarResponsables;
	public Boolean isPermisoGuardarCambiosResponsables;
	public Boolean isPermisoConsultaResponsables;
	public Boolean isPermisoBusquedaResponsables;
	public Boolean isPermisoReporteResponsables;
	public Boolean isPermisoPaginacionMedioResponsables;
	public Boolean isPermisoPaginacionAltoResponsables;
	public Boolean isPermisoPaginacionTodoResponsables;
	public Boolean isPermisoCopiarResponsables;
	public Boolean isPermisoVerFormResponsables;
	public Boolean isPermisoDuplicarResponsables;
	public Boolean isPermisoOrdenResponsables;
	
	
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
	
	public ResponsablesParameterReturnGeneral responsablesReturnGeneral;
	public ResponsablesParameterReturnGeneral responsablesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoResponsables=false;
	public Boolean esParaAccionDesdeFormularioResponsables=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ResponsablesSessionBeanAdditional responsablesSessionBeanAdditional=null;
	
	public ResponsablesSessionBeanAdditional getResponsablesSessionBeanAdditional() {
		return this.responsablesSessionBeanAdditional;
	}
	
	public void setResponsablesSessionBeanAdditional(ResponsablesSessionBeanAdditional responsablesSessionBeanAdditional) {
		try {
			this.responsablesSessionBeanAdditional=responsablesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ResponsablesBeanSwingJInternalFrameAdditional responsablesBeanSwingJInternalFrameAdditional=null;
	//public class ResponsablesBeanSwingJInternalFrame
	
	public ResponsablesBeanSwingJInternalFrameAdditional getResponsablesBeanSwingJInternalFrameAdditional() {
		return this.responsablesBeanSwingJInternalFrameAdditional;
	}
	
	public void setResponsablesBeanSwingJInternalFrameAdditional(ResponsablesBeanSwingJInternalFrameAdditional responsablesBeanSwingJInternalFrameAdditional) {
		try {
			this.responsablesBeanSwingJInternalFrameAdditional=responsablesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ResponsablesLogic responsablesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Responsables responsablesBean;
	public ResponsablesConstantesFunciones responsablesConstantesFunciones;
	//public ResponsablesParameterReturnGeneral responsablesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Responsables> responsabless;	
	//public List<Responsables> responsablessEliminados;
	//public List<Responsables> responsablessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoResponsables=false;
	public Boolean isVisibilidadCeldaDuplicarResponsables=true;
	public Boolean isVisibilidadCeldaCopiarResponsables=true;
	public Boolean isVisibilidadCeldaVerFormResponsables=true;
	public Boolean isVisibilidadCeldaOrdenResponsables=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesResponsables=false;
	public Boolean isVisibilidadCeldaModificarResponsables=false;
	public Boolean isVisibilidadCeldaActualizarResponsables=false;
	public Boolean isVisibilidadCeldaEliminarResponsables=false;
	public Boolean isVisibilidadCeldaCancelarResponsables=false;
	public Boolean isVisibilidadCeldaGuardarResponsables=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosResponsables=false;	
	
	
	public Boolean isVisibilidadBusquedaResponsables=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoResponsables() {
		return this.iIdNuevoResponsables;
	}

	public void setiIdNuevoResponsables(Long iIdNuevoResponsables) {
		this.iIdNuevoResponsables = iIdNuevoResponsables;
	}
	
	public Long getidResponsablesActual() {
		return this.idResponsablesActual;
	}

	public void setidResponsablesActual(Long idResponsablesActual) {
		this.idResponsablesActual = idResponsablesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Responsables getresponsables() {
		return this.responsables;
	}

	public void setresponsables(Responsables responsables) {
		this.responsables = responsables;
	}
	
	public Responsables getresponsablesAux() {
		return this.responsablesAux;
	}

	public void setresponsablesAux(Responsables responsablesAux) {
		this.responsablesAux = responsablesAux;
	}				
	
	public Responsables getresponsablesAnterior() {
		return this.responsablesAnterior;
	}

	public void setresponsablesAnterior(Responsables responsablesAnterior) {
		this.responsablesAnterior = responsablesAnterior;
	}	
	
	public Responsables getresponsablesTotales() {
		return this.responsablesTotales;
	}

	public void setresponsablesTotales(Responsables responsablesTotales) {
		this.responsablesTotales = responsablesTotales;
	}	
	
	public Responsables getresponsablesBean() {
		return this.responsablesBean;
	}

	public void setresponsablesBean(Responsables responsablesBean) {
		this.responsablesBean = responsablesBean;
	}	
	
	public ResponsablesParameterReturnGeneral getresponsablesReturnGeneral() {
		return this.responsablesReturnGeneral;
	}

	public void setresponsablesReturnGeneral(ResponsablesParameterReturnGeneral responsablesReturnGeneral) {
		this.responsablesReturnGeneral = responsablesReturnGeneral;
	}	
	
	
	public Long idBusquedaResponsables=0L;

	public Long getidBusquedaResponsables() {
		return this.idBusquedaResponsables;
	}

	public void setidBusquedaResponsables(Long idBusquedaResponsables) {
		this.idBusquedaResponsables = idBusquedaResponsables;
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
	
	
	public ResponsablesLogic getResponsablesLogic()	{		
		return responsablesLogic;
	}

	public void setResponsablesLogic(ResponsablesLogic responsablesLogic) {
		this.responsablesLogic = responsablesLogic;
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
	
	public Boolean getIsEsNuevoResponsables() {
		return isEsNuevoResponsables;
	}

	public void setIsEsNuevoResponsables(Boolean isEsNuevoResponsables) {
		this.isEsNuevoResponsables = isEsNuevoResponsables;
	}

	public Boolean getEsParaAccionDesdeFormularioResponsables() {
		return esParaAccionDesdeFormularioResponsables;
	}
	
	public void setEsParaAccionDesdeFormularioResponsables(Boolean esParaAccionDesdeFormularioResponsables) {
		this.esParaAccionDesdeFormularioResponsables = esParaAccionDesdeFormularioResponsables;
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

			if(this.responsablesSessionBean==null) {
				this.responsablesSessionBean=new ResponsablesSessionBean();
			}

			if(!this.responsablesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(responsablesSessionBean.getlidEmpresaActual());
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

					if(this.responsables!=null) {
						this.responsables.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormResponsables!=null) {
						this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaResponsables.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormResponsables!=null) {
						if(this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.getItemCount()>0) {
							this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaResponsablesGenerico)throws Exception
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
				jComboBoxid_empresaResponsablesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaResponsablesGenerico!=null && jComboBoxid_empresaResponsablesGenerico.getItemCount()>0) {
					jComboBoxid_empresaResponsablesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Responsables responsables,JComboBox jComboBoxid_empresaResponsablesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaResponsablesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaResponsablesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				responsables.setid_empresa(empresaAux.getId());
				responsables.setempresa_descripcion(ResponsablesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				responsables.setEmpresa(empresaAux);			}
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

					if(!ResponsablesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormResponsables!=null) { 
							this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormResponsables!=null) { 
					}

					if(!ResponsablesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormResponsables!=null) {
							this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormResponsables!=null) {
							this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesResponsables() throws Exception {
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
		
	public ResponsablesParameterReturnGeneral getResponsablesParameterGeneral() {
		return this.responsablesParameterGeneral;
	}
	
	public void setResponsablesParameterGeneral(ResponsablesParameterReturnGeneral responsablesParameterGeneral) {
		this.responsablesParameterGeneral = responsablesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoResponsables() {
		return isPermisoTodoResponsables;
	}

	public void setIsPermisoTodoResponsables(Boolean isPermisoTodoResponsables) {
		this.isPermisoTodoResponsables = isPermisoTodoResponsables;
	}

	public Boolean getIsPermisoNuevoResponsables() {
		return isPermisoNuevoResponsables;
	}

	public void setIsPermisoNuevoResponsables(Boolean isPermisoNuevoResponsables) {
		this.isPermisoNuevoResponsables = isPermisoNuevoResponsables;
	}

	public Boolean getIsPermisoActualizarResponsables() {
		return isPermisoActualizarResponsables;
	}

	public void setIsPermisoActualizarResponsables(Boolean isPermisoActualizarResponsables) {
		this.isPermisoActualizarResponsables = isPermisoActualizarResponsables;
	}

	public Boolean getIsPermisoEliminarResponsables() {
		return isPermisoEliminarResponsables;
	}

	public void setIsPermisoEliminarResponsables(Boolean isPermisoEliminarResponsables) {
		this.isPermisoEliminarResponsables = isPermisoEliminarResponsables;
	}

	public Boolean getIsPermisoGuardarCambiosResponsables() {
		return isPermisoGuardarCambiosResponsables;
	}

	public void setIsPermisoGuardarCambiosResponsables(Boolean isPermisoGuardarCambiosResponsables) {
		this.isPermisoGuardarCambiosResponsables = isPermisoGuardarCambiosResponsables;
	}
	
	public Boolean getIsPermisoConsultaResponsables() {
		return isPermisoConsultaResponsables;
	}

	public void setIsPermisoConsultaResponsables(Boolean isPermisoConsultaResponsables) {
		this.isPermisoConsultaResponsables = isPermisoConsultaResponsables;
	}

	public Boolean getIsPermisoBusquedaResponsables() {
		return isPermisoBusquedaResponsables;
	}

	public void setIsPermisoBusquedaResponsables(Boolean isPermisoBusquedaResponsables) {
		this.isPermisoBusquedaResponsables = isPermisoBusquedaResponsables;
	}

	public Boolean getIsPermisoReporteResponsables() {
		return isPermisoReporteResponsables;
	}

	public void setIsPermisoReporteResponsables(Boolean isPermisoReporteResponsables) {
		this.isPermisoReporteResponsables = isPermisoReporteResponsables;
	}
	
	public Boolean getIsPermisoPaginacionMedioResponsables() {
		return isPermisoPaginacionMedioResponsables;
	}

	public void setIsPermisoPaginacionMedioResponsables(Boolean isPermisoPaginacionMedioResponsables) {
		this.isPermisoPaginacionMedioResponsables = isPermisoPaginacionMedioResponsables;
	}
	
	public Boolean getIsPermisoPaginacionTodoResponsables() {
		return isPermisoPaginacionTodoResponsables;
	}

	public void setIsPermisoPaginacionTodoResponsables(Boolean isPermisoPaginacionTodoResponsables) {
		this.isPermisoPaginacionTodoResponsables = isPermisoPaginacionTodoResponsables;
	}
	
	public Boolean getIsPermisoPaginacionAltoResponsables() {
		return isPermisoPaginacionAltoResponsables;
	}

	public void setIsPermisoPaginacionAltoResponsables(Boolean isPermisoPaginacionAltoResponsables) {
		this.isPermisoPaginacionAltoResponsables = isPermisoPaginacionAltoResponsables;
	}
	
	public Boolean getIsPermisoCopiarResponsables() {
		return isPermisoCopiarResponsables;
	}

	public void setIsPermisoCopiarResponsables(Boolean isPermisoCopiarResponsables) {
		this.isPermisoCopiarResponsables = isPermisoCopiarResponsables;
	}
	
	public Boolean getIsPermisoVerFormResponsables() {
		return isPermisoVerFormResponsables;
	}

	public void setIsPermisoVerFormResponsables(Boolean isPermisoVerFormResponsables) {
		this.isPermisoVerFormResponsables = isPermisoVerFormResponsables;
	}
	
	public Boolean getIsPermisoDuplicarResponsables() {
		return isPermisoDuplicarResponsables;
	}

	public void setIsPermisoDuplicarResponsables(Boolean isPermisoDuplicarResponsables) {
		this.isPermisoDuplicarResponsables = isPermisoDuplicarResponsables;
	}
	
	public Boolean getIsPermisoOrdenResponsables() {
		return isPermisoOrdenResponsables;
	}

	public void setIsPermisoOrdenResponsables(Boolean isPermisoOrdenResponsables) {
		this.isPermisoOrdenResponsables = isPermisoOrdenResponsables;
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
	
	public Boolean getIsVisibilidadCeldaNuevoResponsables() {
		return isVisibilidadCeldaNuevoResponsables;
	}

	public void setIsVisibilidadCeldaNuevoResponsables(Boolean isVisibilidadCeldaNuevoResponsables) {
		this.isVisibilidadCeldaNuevoResponsables = isVisibilidadCeldaNuevoResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarResponsables() {
		return isVisibilidadCeldaDuplicarResponsables;
	}

	public void setIsVisibilidadCeldaDuplicarResponsables(Boolean isVisibilidadCeldaDuplicarResponsables) {
		this.isVisibilidadCeldaDuplicarResponsables = isVisibilidadCeldaDuplicarResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarResponsables() {
		return isVisibilidadCeldaCopiarResponsables;
	}

	public void setIsVisibilidadCeldaCopiarResponsables(Boolean isVisibilidadCeldaCopiarResponsables) {
		this.isVisibilidadCeldaCopiarResponsables = isVisibilidadCeldaCopiarResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormResponsables() {
		return isVisibilidadCeldaVerFormResponsables;
	}

	public void setIsVisibilidadCeldaVerFormResponsables(Boolean isVisibilidadCeldaVerFormResponsables) {
		this.isVisibilidadCeldaVerFormResponsables = isVisibilidadCeldaVerFormResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenResponsables() {
		return isVisibilidadCeldaOrdenResponsables;
	}

	public void setIsVisibilidadCeldaOrdenResponsables(Boolean isVisibilidadCeldaOrdenResponsables) {
		this.isVisibilidadCeldaOrdenResponsables = isVisibilidadCeldaOrdenResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesResponsables() {
		return isVisibilidadCeldaNuevoRelacionesResponsables;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesResponsables(Boolean isVisibilidadCeldaNuevoRelacionesResponsables) {
		this.isVisibilidadCeldaNuevoRelacionesResponsables = isVisibilidadCeldaNuevoRelacionesResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaModificarResponsables() {
		return isVisibilidadCeldaModificarResponsables;
	}

	public void setIsVisibilidadCeldaModificarResponsables(Boolean isVisibilidadCeldaModificarResponsables) {
		this.isVisibilidadCeldaModificarResponsables = isVisibilidadCeldaModificarResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarResponsables() {
		return isVisibilidadCeldaActualizarResponsables;
	}

	public void setIsVisibilidadCeldaActualizarResponsables(Boolean isVisibilidadCeldaActualizarResponsables) {
		this.isVisibilidadCeldaActualizarResponsables = isVisibilidadCeldaActualizarResponsables;
	}

	public Boolean getIsVisibilidadCeldaEliminarResponsables() {
		return isVisibilidadCeldaEliminarResponsables;
	}

	public void setIsVisibilidadCeldaEliminarResponsables(Boolean isVisibilidadCeldaEliminarResponsables) {
		this.isVisibilidadCeldaEliminarResponsables = isVisibilidadCeldaEliminarResponsables;
	}

	public Boolean getIsVisibilidadCeldaCancelarResponsables() {
		return isVisibilidadCeldaCancelarResponsables;
	}

	public void setIsVisibilidadCeldaCancelarResponsables(Boolean isVisibilidadCeldaCancelarResponsables) {
		this.isVisibilidadCeldaCancelarResponsables = isVisibilidadCeldaCancelarResponsables;
	}

	public Boolean getIsVisibilidadCeldaGuardarResponsables() {
		return isVisibilidadCeldaGuardarResponsables;
	}

	public void setIsVisibilidadCeldaGuardarResponsables(Boolean isVisibilidadCeldaGuardarResponsables) {
		this.isVisibilidadCeldaGuardarResponsables = isVisibilidadCeldaGuardarResponsables;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosResponsables() {
		return isVisibilidadCeldaGuardarCambiosResponsables;
	}

	public void setIsVisibilidadCeldaGuardarCambiosResponsables(Boolean isVisibilidadCeldaGuardarCambiosResponsables) {
		this.isVisibilidadCeldaGuardarCambiosResponsables = isVisibilidadCeldaGuardarCambiosResponsables;
	}
		
	public ResponsablesSessionBean getresponsablesSessionBean() {
		return this.responsablesSessionBean;
	}
	
	public void setresponsablesSessionBean(ResponsablesSessionBean responsablesSessionBean) {
		this.responsablesSessionBean=responsablesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaResponsables() {
		return this.isVisibilidadBusquedaResponsables;
	}

	public void setisVisibilidadBusquedaResponsables(Boolean isVisibilidadBusquedaResponsables) {
		this.isVisibilidadBusquedaResponsables=isVisibilidadBusquedaResponsables;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysResponsables(Responsables responsables)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(responsables,null);
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
	
	public void bugActualizarReferenciaActual(Responsables responsables,Responsables responsablesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalResponsables(responsables);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		responsablesAux.setId(responsables.getId());
		responsablesAux.setVersionRow(responsables.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(Responsables responsablesLocal) throws Exception {
		
		if(this.responsablesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Responsables responsablesLocal) throws Exception {	
		if(this.responsablesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				responsablesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarResponsablesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = responsablesValidator.getInvalidValues(this.responsables);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Responsables responsables,List<Responsables> responsabless) throws Exception {
	}		
	
	public void actualizarSelectedLista(Responsables responsables,List<Responsables> responsabless) throws Exception {
		try	{			
			ResponsablesConstantesFunciones.actualizarSelectedLista(responsables,responsabless);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Responsables> responsablessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				responsablessLocal=this.responsablesLogic.getResponsabless();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				responsablessLocal=this.responsabless;
			}
			//ARCHITECTURE
		
			for(Responsables responsablesLocal:responsablessLocal) {
				if(this.permiteMantenimiento(responsablesLocal) && responsablesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ResponsablesConstantesFunciones.getResponsablesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.CODIGOEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_empleadoResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.NOMBREEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_empleadoResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.APELLIDOEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelapellido_empleadoResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.NOMBREESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_estructuraResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.UBICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelubicacionResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelfechaResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabeldescripcionResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombreResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelclaveResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_sub_grupoResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_sub_grupoResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_detalle_grupoResponsables,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ResponsablesConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_detalle_grupoResponsables,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_empleadoResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelnombre_empleadoResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelapellido_empleadoResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelnombre_estructuraResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelubicacionResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelfechaResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabeldescripcionResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelnombreResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelclaveResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_sub_grupoResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelnombre_sub_grupoResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_detalle_grupoResponsables,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormResponsables.jLabelnombre_detalle_grupoResponsables,"");
		
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
		this.iIdNuevoResponsables--;	
		
		
		this.responsablesAux=new Responsables();
		
		this.responsablesAux.setId(this.iIdNuevoResponsables);
		this.responsablesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.responsablesLogic.getResponsabless().add(this.responsablesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.responsabless.add(this.responsablesAux);
		}
		//ARCHITECTURE
		
		this.responsables=this.responsablesAux;
		
		if(ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioResponsables(this.responsables);
			this.setVariablesObjetoActualToFormularioForeignKeyResponsables(this.responsables);
		}
				
		//this.setDefaultControlesResponsables();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyResponsables();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyResponsables();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsables();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsables(this.responsablesBean,this.responsables,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanResponsables(this.responsablesReturnGeneral,this.responsablesBean,false);
		
		if(this.responsablesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyResponsables(this.responsablesReturnGeneral.getResponsables());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioResponsables(this.responsablesReturnGeneral.getResponsables());
		}
		
		if(this.responsablesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioResponsables(this.responsablesReturnGeneral.getResponsables(),classes);//this.responsablesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualResponsables(this.responsables,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyResponsables();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyResponsables();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ResponsablesBeanSwingJInternalFrameAdditional.RecargarFormResponsables(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingResponsables(false);
						
			if(responsablesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsables();
			}
			
			this.actualizarVisualTableDatosResponsables();
			
			this.jTableDatosResponsables.setRowSelectionInterval(this.getIndiceNuevoResponsables(), this.getIndiceNuevoResponsables());
			
			this.seleccionarFilaTablaResponsablesActual();
						
			this.actualizarEstadoCeldasBotonesResponsables("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesResponsables(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarcodigo_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarnombre_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarapellido_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarnombre_estructuraResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarubicacionResponsables);
		this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarfechaResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activardescripcionResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarnombreResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarclaveResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarcodigo_sub_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarnombre_sub_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarcodigo_detalle_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarnombre_detalle_grupoResponsables);	
		//
		this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setEnabled(isHabilitar && this.responsablesConstantesFunciones.activarid_empresaResponsables);
	};
	
	public void setDefaultControlesResponsables() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoResponsables(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.responsablesSessionBean.setConGuardarRelaciones(true);			
			this.responsablesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.setVisible(true);
			
					
		} else {
			//this.responsablesSessionBean.setConGuardarRelaciones(false);			
			this.responsablesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoResponsables() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
				if(responsablesAux.getId().equals(this.iIdNuevoResponsables)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsables responsablesAux:this.responsabless) {
				if(responsablesAux.getId().equals(this.iIdNuevoResponsables)) {
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
	
	public int getIndiceActualResponsables(Responsables responsables,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
				if(responsablesAux.getId().equals(responsables.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsables responsablesAux:this.responsabless) {
				if(responsablesAux.getId().equals(responsables.getId())) {
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
	
	public void setCamposBaseDesdeOriginalResponsables(Responsables responsablesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
				if(responsablesAux.getResponsablesOriginal().getId().equals(responsablesOriginal.getId())) {
					existe=true;
					responsablesOriginal.setId(responsablesAux.getId());
					responsablesOriginal.setVersionRow(responsablesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsables responsablesAux:this.responsabless) {
				if(responsablesAux.getResponsablesOriginal().getId().equals(responsablesOriginal.getId())) {
					existe=true;
					responsablesOriginal.setId(responsablesAux.getId());
					responsablesOriginal.setVersionRow(responsablesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosResponsables(Boolean esParaCancelar) throws Exception {
		responsablessAux=new ArrayList<Responsables>();
		responsablesAux=new Responsables();
		
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
					if(responsablesAux.getId()<0) {
						responsablessAux.add(responsablesAux);
					}		
				}
				this.iIdNuevoResponsables=0L;
				this.responsablesLogic.getResponsabless().removeAll(responsablessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsables responsablesAux:this.responsabless) {
					if(responsablesAux.getId()<0) {
						responsablessAux.add(responsablesAux);
					}		
				}
				this.iIdNuevoResponsables=0L;
				this.responsabless.removeAll(responsablessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoResponsables 
					&& this.responsablesLogic.getResponsabless().size()>0
					) {
					responsablesAux=this.responsablesLogic.getResponsabless().get(this.responsablesLogic.getResponsabless().size() - 1);
				
					if(responsablesAux.getId()<0) {
						this.responsablesLogic.getResponsabless().remove(responsablesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoResponsables && this.responsabless.size()>0) {
					responsablesAux=this.responsabless.get(this.responsabless.size() - 1);
				
					if(responsablesAux.getId()<0) {
						this.responsabless.remove(responsablesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoResponsables(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(responsables.getId()<0) {
				this.responsablesLogic.getResponsabless().remove(this.responsables);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(responsables.getId()<0) {
				this.responsabless.remove(this.responsables);
			}
		}			
	}
	
	public void setEstadosInicialesResponsables(List<Responsables> responsablessAux) throws Exception {
		ResponsablesConstantesFunciones.setEstadosInicialesResponsables(responsablessAux);
	}
	
	public void setEstadosInicialesResponsables(Responsables responsablesAux) throws Exception {
		ResponsablesConstantesFunciones.setEstadosInicialesResponsables(responsablesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarResponsablesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesResponsables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarResponsablesActual()) {
				if(!this.isEsNuevoResponsables) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesResponsables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoResponsables=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarResponsablesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Responsables ?", "MANTENIMIENTO DE Responsables", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesResponsables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Responsables responsables) throws Exception {
		ResponsablesConstantesFunciones.seleccionarAsignar(this.responsables,responsables);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarResponsables=this.isPermisoActualizarOriginalResponsables;
			
			
			this.seleccionarAsignar(responsables);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesResponsables("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.responsablesSessionBean.setsFuncionBusquedaRapida(this.responsablesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoResponsables) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosResponsables(esParaCancelar);				
				this.cancelarNuevoResponsables(esParaCancelar);								
			}
			
			this.responsables=new Responsables();
			
			this.inicializarResponsables();
			
			this.actualizarEstadoCeldasBotonesResponsables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarResponsables() throws Exception {
		try {
			ResponsablesConstantesFunciones.inicializarResponsables(this.responsables);
			
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
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.responsablesLogic.getResponsabless().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteResponsabless(String sAccionBusqueda,List<Responsables> responsablessParaReportes) throws Exception {
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
					sPathReporteFinal="Responsables"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ResponsablesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ResponsablesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Responsables"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Responsableses");		
		parameters.put("busquedapor", ResponsablesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceResponsables=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ResponsablesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ResponsablesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceResponsables=new JRBeanArrayDataSource(ResponsablesJInternalFrame.TraerResponsablesBeans(responsablessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceResponsables);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ResponsablesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ResponsablesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ResponsablesBean.TraerResponsablesBeans(responsablessParaReportes).toArray()));
							
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
				this.generarExcelReporteResponsabless(sAccionBusqueda,sTipoArchivoReporte,responsablessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalResponsabless(sAccionBusqueda,sTipoArchivoReporte,responsablessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoResponsablesActionPerformed(null);
					//this.generarExcelReporteResponsabless(sAccionBusqueda,sTipoArchivoReporte,responsablessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalResponsabless(sAccionBusqueda,sTipoArchivoReporte,responsablessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesResponsabless(sAccionBusqueda,sTipoArchivoReporte,responsablessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesResponsabless(sAccionBusqueda,sTipoArchivoReporte,responsablessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteResponsabless(String sAccionBusqueda,String sTipoArchivoReporte,List<Responsables> responsablessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsables";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Responsabless");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsables("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Responsables responsables : responsablessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ResponsablesConstantesFunciones.generarExcelReporteDataResponsables("NORMAL",row,workbook,responsables,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderResponsables(String sTipo,Row row,Workbook workbook) {
		
		ResponsablesConstantesFunciones.generarExcelReporteHeaderResponsables(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalResponsabless(String sAccionBusqueda,String sTipoArchivoReporte,List<Responsables> responsablessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsables_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Responsabless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Responsables responsables : responsablessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ResponsablesConstantesFunciones.getResponsablesDescripcion(responsables));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getcodigo_empleado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getnombre_empleado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getapellido_empleado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getnombre_estructura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_UBICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_UBICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getubicacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(responsables.getnombre_detalle_grupo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesResponsabless(String sAccionBusqueda,String sTipoArchivoReporte,List<Responsables> responsablessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Responsables> responsablessRespaldo=null;
		
		classes=ResponsablesConstantesFunciones.getClassesRelationshipsOfResponsables(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.responsablesLogic.setDatosCliente(this.datosCliente);
		this.responsablesLogic.setDatosDeep(this.datosDeep);
		this.responsablesLogic.setIsConDeep(true);
		
		responsablessRespaldo=this.responsablesLogic.getResponsabless();
		
		this.responsablesLogic.setResponsabless(responsablessParaReportes);	
		this.responsablesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		responsablessParaReportes=this.responsablesLogic.getResponsabless();
		this.responsablesLogic.setResponsabless(responsablessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsables_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Responsabless");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderResponsables("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Responsables responsables : responsablessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderResponsables("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ResponsablesConstantesFunciones.generarExcelReporteDataResponsables("NORMAL",row,workbook,responsables,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ResponsablesConstantesFunciones.getResponsablesDescripcion(responsables));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoResponsables.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsables.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessResponsables() throws Exception {		
		this.startProcessResponsables(true);
	}
	
	public void startProcessResponsables(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasResponsables ,this.jPanelParametrosReportesResponsables, this.jScrollPanelDatosResponsables,this.jPanelPaginacionResponsables, this.jScrollPanelDatosEdicionResponsables, this.jPanelAccionesResponsables,this.jPanelAccionesFormularioResponsables,this.jmenuBarResponsables,this.jmenuBarDetalleResponsables,this.jTtoolBarResponsables,this.jTtoolBarDetalleResponsables);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsables=this.jTabbedPaneBusquedasResponsables; 
		
		final JPanel jPanelParametrosReportesResponsables=this.jPanelParametrosReportesResponsables;
		//final JScrollPane jScrollPanelDatosResponsables=this.jScrollPanelDatosResponsables;
		final JTable jTableDatosResponsables=this.jTableDatosResponsables;		
		final JPanel jPanelPaginacionResponsables=this.jPanelPaginacionResponsables;
		//final JScrollPane jScrollPanelDatosEdicionResponsables=this.jScrollPanelDatosEdicionResponsables;
		final JPanel jPanelAccionesResponsables=this.jPanelAccionesResponsables;
		
		JPanel jPanelCamposAuxiliarResponsables=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarResponsables=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
			jPanelCamposAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jPanelCamposResponsables;
			jPanelAccionesFormularioAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jPanelAccionesFormularioResponsables;
		}
		
		final JPanel jPanelCamposResponsables=jPanelCamposAuxiliarResponsables;
		final JPanel jPanelAccionesFormularioResponsables=jPanelAccionesFormularioAuxiliarResponsables;
		
		
		final JMenuBar jmenuBarResponsables=this.jmenuBarResponsables;
		final JToolBar jTtoolBarResponsables=this.jTtoolBarResponsables;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarResponsables=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsables=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
			jmenuBarDetalleAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jmenuBarDetalleResponsables;
			jTtoolBarDetalleAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jTtoolBarDetalleResponsables;
		}
		
		final JMenuBar jmenuBarDetalleResponsables=jmenuBarDetalleAuxiliarResponsables;
		final JToolBar jTtoolBarDetalleResponsables=jTtoolBarDetalleAuxiliarResponsables;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsables;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsables;
			processRunnable.jTableDatos=jTableDatosResponsables;
			processRunnable.jPanelCampos=jPanelCamposResponsables;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsables;
			processRunnable.jPanelAcciones=jPanelAccionesResponsables;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsables;
			
			
			processRunnable.jmenuBar=jmenuBarResponsables;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsables;
			processRunnable.jTtoolBar=jTtoolBarResponsables;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsables;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsables ,jPanelParametrosReportesResponsables,jTableDatosResponsables, /*jScrollPanelDatosResponsables,*/jPanelCamposResponsables,jPanelPaginacionResponsables, /*jScrollPanelDatosEdicionResponsables,*/ jPanelAccionesResponsables,jPanelAccionesFormularioResponsables,jmenuBarResponsables,jmenuBarDetalleResponsables,jTtoolBarResponsables,jTtoolBarDetalleResponsables);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasResponsables ,jPanelParametrosReportesResponsables, jScrollPanelDatosResponsables,jPanelPaginacionResponsables, jScrollPanelDatosEdicionResponsables, jPanelAccionesResponsables,jPanelAccionesFormularioResponsables,jmenuBarResponsables,jmenuBarDetalleResponsables,jTtoolBarResponsables,jTtoolBarDetalleResponsables);
						
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
	
	public void finishProcessResponsables() {// throws Exception 
		this.finishProcessResponsables(true);
	}
	
	public void finishProcessResponsables(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasResponsables ,this.jPanelParametrosReportesResponsables, this.jScrollPanelDatosResponsables,this.jPanelPaginacionResponsables, this.jScrollPanelDatosEdicionResponsables, this.jPanelAccionesResponsables,this.jPanelAccionesFormularioResponsables,this.jmenuBarResponsables,this.jmenuBarDetalleResponsables,this.jTtoolBarResponsables,this.jTtoolBarDetalleResponsables);		
		
		final JTabbedPane jTabbedPaneBusquedasResponsables=this.jTabbedPaneBusquedasResponsables; 
		
		final JPanel jPanelParametrosReportesResponsables=this.jPanelParametrosReportesResponsables;
		//final JScrollPane jScrollPanelDatosResponsables=this.jScrollPanelDatosResponsables;
		final JTable jTableDatosResponsables=this.jTableDatosResponsables;		
		final JPanel jPanelPaginacionResponsables=this.jPanelPaginacionResponsables;
		//final JScrollPane jScrollPanelDatosEdicionResponsables=this.jScrollPanelDatosEdicionResponsables;
		final JPanel jPanelAccionesResponsables=this.jPanelAccionesResponsables;
		
		JPanel jPanelCamposAuxiliarResponsables=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarResponsables=new JPanel();
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
			jPanelCamposAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jPanelCamposResponsables;
			jPanelAccionesFormularioAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jPanelAccionesFormularioResponsables;
		}
		
		final JPanel jPanelCamposResponsables=jPanelCamposAuxiliarResponsables;
		final JPanel jPanelAccionesFormularioResponsables=jPanelAccionesFormularioAuxiliarResponsables;
		
		
		final JMenuBar jmenuBarResponsables=this.jmenuBarResponsables;		
		final JToolBar jTtoolBarResponsables=this.jTtoolBarResponsables;
				
		JMenuBar jmenuBarDetalleAuxiliarResponsables=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarResponsables=new JToolBar();
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
			jmenuBarDetalleAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jmenuBarDetalleResponsables;
			jTtoolBarDetalleAuxiliarResponsables=this.jInternalFrameDetalleFormResponsables.jTtoolBarDetalleResponsables;		
		}
		
		final JMenuBar jmenuBarDetalleResponsables=jmenuBarDetalleAuxiliarResponsables;
		final JToolBar jTtoolBarDetalleResponsables=jTtoolBarDetalleAuxiliarResponsables;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasResponsables;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesResponsables;
			processRunnable.jTableDatos=jTableDatosResponsables;
			processRunnable.jPanelCampos=jPanelCamposResponsables;
			processRunnable.jPanelPaginacion=jPanelPaginacionResponsables;
			processRunnable.jPanelAcciones=jPanelAccionesResponsables;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioResponsables;
			
			
			processRunnable.jmenuBar=jmenuBarResponsables;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleResponsables;
			processRunnable.jTtoolBar=jTtoolBarResponsables;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleResponsables;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasResponsables ,jPanelParametrosReportesResponsables, jTableDatosResponsables,/*jScrollPanelDatosResponsables,*/jPanelCamposResponsables,jPanelPaginacionResponsables, /*jScrollPanelDatosEdicionResponsables,*/ jPanelAccionesResponsables,jPanelAccionesFormularioResponsables,jmenuBarResponsables,jmenuBarDetalleResponsables,jTtoolBarResponsables,jTtoolBarDetalleResponsables));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesResponsables(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarResponsables(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuResponsables(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarResponsables(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarResponsables,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleResponsables,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuResponsables(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarResponsables,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleResponsables,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.responsablesConstantesFunciones.getsFinalQueryResponsables();
		String  finalQueryPaginacionTodos=this.responsablesConstantesFunciones.getsFinalQueryResponsables();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ResponsablesConstantesFunciones.getArrayColumnasGlobalesNoResponsables(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ResponsablesConstantesFunciones.getArrayColumnasGlobalesResponsables(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ResponsablesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.responsablessEliminados= new ArrayList<Responsables>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessResponsables();
		
				///*ResponsablesSessionBean*/this.responsablesSessionBean=new ResponsablesSessionBean();
			
			if(this.responsablesSessionBean==null) {
				this.responsablesSessionBean=new ResponsablesSessionBean();
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
					this.iNumeroPaginacion=ResponsablesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ResponsablesConstantesFunciones.getClassesForeignKeysOfResponsables(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/responsables."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			responsablessAux= new ArrayList<Responsables>();
			
				
			responsablesLogic.setDatosCliente(this.datosCliente);
			responsablesLogic.setDatosDeep(this.datosDeep);
			responsablesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaResponsables")) {
				this.sDetalleReporte=ResponsablesConstantesFunciones.getDetalleIndiceBusquedaResponsables(idBusquedaResponsables);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					responsablesLogic.getResponsablessBusquedaResponsables(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaResponsables);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsablesConstantesFunciones.getDetalleIndiceBusquedaResponsables(idBusquedaResponsables);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsablesConstantesFunciones.getDetalleIndiceBusquedaResponsables(idBusquedaResponsables);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=responsablesLogic.getResponsabless()==null||responsablesLogic.getResponsabless().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=responsabless==null|| responsabless.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablessAux=new ArrayList<Responsables>();
						responsablessAux.addAll(responsablesLogic.getResponsabless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablessAux=new ArrayList<Responsables>();
							responsablessAux.addAll(responsabless);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							responsablesLogic.getResponsablessBusquedaResponsables(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaResponsables);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ResponsablesConstantesFunciones.getDetalleIndiceBusquedaResponsables(idBusquedaResponsables);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ResponsablesConstantesFunciones.getDetalleIndiceBusquedaResponsables(idBusquedaResponsables);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteResponsabless("BusquedaResponsables",responsablesLogic.getResponsabless());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteResponsabless("BusquedaResponsables",responsabless);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesLogic.setResponsabless(new ArrayList<Responsables>());
						responsablesLogic.getResponsabless().addAll(responsablessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsabless=new ArrayList<Responsables>();
							responsabless.addAll(responsablessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesResponsables();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessResponsables();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsablesLogic.getResponsabless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsabless.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=responsablesLogic.getResponsabless().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=responsabless.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Responsables responsables) {
		Boolean permite=true;
		
		if(this.responsables.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ResponsablesConstantesFunciones.getOrderByListaResponsables();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ResponsablesConstantesFunciones.getOrderByListaResponsables();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsables responsables:responsablesLogic.getResponsabless()) {
				if(responsables.getsType().equals(Constantes2.S_TOTALES)) {
					responsablesTotales=responsables;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsables responsables:this.responsabless) {
				if(responsables.getsType().equals(Constantes2.S_TOTALES)) {
					responsablesTotales=responsables;
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
			this.responsablesAux=new Responsables();
			this.responsablesAux.setsType(Constantes2.S_TOTALES);
			this.responsablesAux.setIsNew(false);
			this.responsablesAux.setIsChanged(false);
			this.responsablesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ResponsablesConstantesFunciones.TotalizarValoresFilaResponsables(this.responsablesLogic.getResponsabless(),this.responsablesAux);
				
				//this.responsablesLogic.getResponsabless().add(this.responsablesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ResponsablesConstantesFunciones.TotalizarValoresFilaResponsables(this.responsabless,this.responsablesAux);
				
				this.responsabless.add(this.responsablesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		responsablesTotales=new Responsables();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsablesLogic.getResponsabless().remove(responsablesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.responsabless.remove(responsablesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		responsablesTotales=new Responsables();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Responsables responsables:responsablesLogic.getResponsabless()) {
				if(responsables.getsType().equals(Constantes2.S_TOTALES)) {
					responsablesTotales=responsables;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsablesConstantesFunciones.TotalizarValoresFilaResponsables(this.responsablesLogic.getResponsabless(),responsablesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Responsables responsables:this.responsabless) {
				if(responsables.getsType().equals(Constantes2.S_TOTALES)) {
					responsablesTotales=responsables;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ResponsablesConstantesFunciones.TotalizarValoresFilaResponsables(this.responsabless,responsablesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getResponsablessBusquedaResponsables()throws Exception {
		try {
			sAccionBusqueda="BusquedaResponsables";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getResponsablessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getResponsablessBusquedaResponsables(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//responsablesLogic.getResponsablessBusquedaResponsables(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getResponsablessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//responsablesLogic.getResponsablessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosResponsables() {
		this.isPermisoTodoResponsables=false;
		this.isPermisoNuevoResponsables=false;
		this.isPermisoActualizarResponsables=false;
		this.isPermisoActualizarOriginalResponsables=false;
		this.isPermisoEliminarResponsables=false;
		this.isPermisoGuardarCambiosResponsables=false;
		this.isPermisoConsultaResponsables=true;
		this.isPermisoBusquedaResponsables=true;
		this.isPermisoReporteResponsables=true;
		this.isPermisoOrdenResponsables=false;		
		this.isPermisoPaginacionMedioResponsables=false;		
		this.isPermisoPaginacionAltoResponsables=false;		
		this.isPermisoPaginacionTodoResponsables=false;		
		this.isPermisoCopiarResponsables=false;		
		this.isPermisoVerFormResponsables=false;		
		this.isPermisoDuplicarResponsables=false;
		this.isPermisoOrdenResponsables=false;
	}
	
	public void setPermisosUsuarioResponsables(Boolean isPermiso) {
		this.isPermisoTodoResponsables=isPermiso;
		this.isPermisoNuevoResponsables=isPermiso;
		this.isPermisoActualizarResponsables=isPermiso;
		this.isPermisoActualizarOriginalResponsables=isPermiso;
		this.isPermisoEliminarResponsables=isPermiso;
		this.isPermisoGuardarCambiosResponsables=isPermiso;
		this.isPermisoConsultaResponsables=isPermiso;
		this.isPermisoBusquedaResponsables=isPermiso;
		this.isPermisoReporteResponsables=isPermiso;
		this.isPermisoOrdenResponsables=isPermiso;		
		this.isPermisoPaginacionMedioResponsables=isPermiso;		
		this.isPermisoPaginacionAltoResponsables=isPermiso;		
		this.isPermisoPaginacionTodoResponsables=isPermiso;		
		this.isPermisoCopiarResponsables=isPermiso;		
		this.isPermisoVerFormResponsables=isPermiso;		
		this.isPermisoDuplicarResponsables=isPermiso;
		this.isPermisoOrdenResponsables=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioResponsables(Boolean isPermiso) {
		//this.isPermisoTodoResponsables=isPermiso;
		this.isPermisoNuevoResponsables=isPermiso;
		this.isPermisoActualizarResponsables=isPermiso;
		this.isPermisoActualizarOriginalResponsables=isPermiso;
		this.isPermisoEliminarResponsables=isPermiso;
		this.isPermisoGuardarCambiosResponsables=isPermiso;
		//this.isPermisoConsultaResponsables=isPermiso;
		//this.isPermisoBusquedaResponsables=isPermiso;
		//this.isPermisoReporteResponsables=isPermiso;
		//this.isPermisoOrdenResponsables=isPermiso;		
		//this.isPermisoPaginacionMedioResponsables=isPermiso;		
		//this.isPermisoPaginacionAltoResponsables=isPermiso;		
		//this.isPermisoPaginacionTodoResponsables=isPermiso;		
		//this.isPermisoCopiarResponsables=isPermiso;		
		//this.isPermisoDuplicarResponsables=isPermiso;
		//this.isPermisoOrdenResponsables=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioResponsablesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ResponsablesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebResponsables(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioResponsablesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioResponsablesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionResponsablesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioResponsablesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioResponsables() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ResponsablesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.responsablesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ResponsablesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoResponsables=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarResponsables=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalResponsables=this.isPermisoActualizarResponsables;
			this.isPermisoEliminarResponsables=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosResponsables=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaResponsables=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaResponsables=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoResponsables=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteResponsables=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsables=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioResponsables=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoResponsables=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoResponsables=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarResponsables=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormResponsables=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarResponsables=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenResponsables=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.responsablesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosResponsables.setToolTipText(this.jTableDatosResponsables.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioResponsables(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioResponsables(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ResponsablesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ResponsablesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioResponsables() throws Exception {
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
	public void inicializarCombosForeignKeyResponsablesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyResponsablesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ResponsablesJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyResponsables()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.responsablesSessionBean==null) {
				this.responsablesSessionBean=new ResponsablesSessionBean();
			}

			if(!this.responsablesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyResponsables()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyResponsables(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyResponsables()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyResponsables();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyResponsables(Responsables responsables)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyResponsables(Responsables responsables,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyResponsables()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyResponsables()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyResponsables()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyResponsables()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroResponsables()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyResponsables()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyResponsables(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyResponsables()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables!=null && this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.getItemCount()>0) {
				this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ResponsablesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ResponsablesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ResponsablesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.responsablesSessionBean=new ResponsablesSessionBean(); 
		this.responsablesConstantesFunciones=new ResponsablesConstantesFunciones(); 
		this.responsablesBean=new Responsables();//(this.responsablesConstantesFunciones); 		
		this.responsablesReturnGeneral=new ResponsablesParameterReturnGeneral(); 
		
		this.responsablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ResponsablesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ResponsablesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ResponsablesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessResponsables(true);
			
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
			
			this.responsablesConstantesFunciones=new ResponsablesConstantesFunciones(); 
			this.responsablesBean=new Responsables();//this.responsablesConstantesFunciones); 			
			this.responsablesReturnGeneral=new ResponsablesParameterReturnGeneral(); 
		
			ResponsablesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsables Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.responsables=new Responsables();
			this.responsabless = new ArrayList<Responsables>();
			this.responsablessAux = new ArrayList<Responsables>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic=new ResponsablesLogic();
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			//this.responsablesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.responsablesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormResponsables);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoResponsables!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsables);	
					}
					
					if(this.jInternalFrameImportacionResponsables!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsables);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByResponsables!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByResponsables);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormResponsables!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsables);
				this.jInternalFrameDetalleFormResponsables.setVisible(false);
				this.jInternalFrameDetalleFormResponsables.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoResponsables!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsables);
					this.jInternalFrameReporteDinamicoResponsables.setVisible(false);
					this.jInternalFrameReporteDinamicoResponsables.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionResponsables!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionResponsables);
					this.jInternalFrameImportacionResponsables.setVisible(false);
					this.jInternalFrameImportacionResponsables.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByResponsables!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByResponsables);
					this.jInternalFrameOrderByResponsables.setVisible(false);
					this.jInternalFrameOrderByResponsables.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idResponsablesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ResponsablesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.responsablesReturnGeneral=new ResponsablesParameterReturnGeneral();
			
			this.responsablesParameterGeneral=new ResponsablesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.responsablesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ResponsablesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.responsablesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsablesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsablesSessionBean.getEsGuardarRelacionado(),this.responsablesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ResponsablesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.responsablesSessionBean.getEsGuardarRelacionado(),this.responsablesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoResponsables=false;
			this.isVisibilidadCeldaDuplicarResponsables=true;
			this.isVisibilidadCeldaCopiarResponsables=true;
			this.isVisibilidadCeldaVerFormResponsables=true;
			this.isVisibilidadCeldaOrdenResponsables=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
			this.isVisibilidadCeldaModificarResponsables=false;
			this.isVisibilidadCeldaActualizarResponsables=false;
			this.isVisibilidadCeldaEliminarResponsables=false;
			this.isVisibilidadCeldaCancelarResponsables=false;
			this.isVisibilidadCeldaGuardarResponsables=false;
			this.isVisibilidadCeldaGuardarCambiosResponsables=false;
			
			
			this.isVisibilidadBusquedaResponsables=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesResponsables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosResponsables();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioResponsables(false);
			
			this.setPermisosUsuarioResponsables();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsablesSessionBean.getEsGuardarRelacionado() 
				|| (this.responsablesSessionBean.getEsGuardarRelacionado() && this.responsablesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioResponsablesClasesRelacionadas();
			}
			
			if(this.responsablesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioResponsablesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ResponsablesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosResponsables();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualResponsables();
			}
			
			if(!this.isPermisoBusquedaResponsables) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasResponsables.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ResponsablesConstantesFunciones.getTiposSeleccionarResponsables());
				
				this.tiposColumnasSelect=ResponsablesConstantesFunciones.getTiposSeleccionarResponsables(true);
				
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
			//if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioResponsables();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioResponsables(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioResponsables(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsables() ;
			
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
				responsablesImplementable= (ResponsablesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsablesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				responsablesImplementableHome= (ResponsablesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ResponsablesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.responsabless= new ArrayList<Responsables>();
			this.responsablessEliminados= new ArrayList<Responsables>();
						
			this.isEsNuevoResponsables=false;
			this.esParaAccionDesdeFormularioResponsables=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyResponsables(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroResponsables();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ResponsablesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ResponsablesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesResponsables("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingResponsables(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormResponsables!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioResponsables();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioResponsables();
			}
			
			ResponsablesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasResponsables.getTabCount(); i++) {
					this.jTabbedPaneBusquedasResponsables.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasResponsables.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessResponsables(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Responsables: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectResponsables() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesResponsables")) {
				iIndex=this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosResponsables.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessResponsables();	
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
	
	public void cargarCombosForeignKeyResponsables(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyResponsables(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyResponsables(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyResponsablesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyResponsables();
		
		this.cargarCombosFrameForeignKeyResponsables();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyResponsables();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyResponsables();
		}
	}
	
	
	
	public void jButtonNuevoResponsablesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.responsablesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
			
			if(jTableDatosResponsables.getRowCount()>=1) {
				jTableDatosResponsables.removeRowSelectionInterval(0, jTableDatosResponsables.getRowCount()-1);						
			}
			
			this.isEsNuevoResponsables=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoResponsables(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesResponsables(true);			
			//this.responsables=new Responsables();
			//this.responsables.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsables(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsables() ;
			
			if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsables(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.responsables);	
			this.actualizarInformacion("INFO_PADRE",false,this.responsables);				
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
			if(this.responsablesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Responsables: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarResponsablesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosResponsables.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosResponsables.getSelectedRows().length;			
			}
			
			responsablessSeleccionados=this.getResponsablessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoResponsables--;			
				//Responsables responsablesAux= new Responsables();			
				//responsablesAux.setId(this.iIdNuevoResponsables);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Responsables responsablesOrigen=new Responsables();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Responsables responsablesOrigen : responsablessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							responsablesOrigen =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							responsablesOrigen =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaResponsables();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.responsables.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosResponsables(responsablesOrigen,this.responsables,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsablesLogic.getResponsabless().add(this.responsablesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsabless.add(this.responsablesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaResponsables(false);
				
				this.jTableDatosResponsables.setRowSelectionInterval(this.getIndiceNuevoResponsables(), this.getIndiceNuevoResponsables());
				
				int iLastRow =  this.jTableDatosResponsables.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsables.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsables.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsables(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();									
		
			Responsables responsablesOrigen=new Responsables();
			Responsables responsablesDestino=new Responsables();
				
			responsablessSeleccionados=this.getResponsablessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosResponsables.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || responsablessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosResponsables.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesOrigen =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsablesOrigen =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						responsablesDestino =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						responsablesDestino =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				responsablesOrigen =responsablessSeleccionados.get(0);
				responsablesDestino =responsablessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosResponsables(responsablesOrigen,responsablesDestino,true,false);
				
				responsablesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(responsablesDestino,responsablesLogic.getResponsabless());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(responsablesDestino,responsabless);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaResponsables(false);
				
				//this.jTableDatosResponsables.setRowSelectionInterval(this.getIndiceNuevoResponsables(), this.getIndiceNuevoResponsables());
				
				int iLastRow =  this.jTableDatosResponsables.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosResponsables.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosResponsables.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsables(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormResponsables.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesResponsables.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasResponsables.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesResponsables.setVisible(!isVisible);
			this.jPanelPaginacionResponsables.setVisible(!isVisible);
			this.jPanelAccionesResponsables.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameResponsables();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoResponsables();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionResponsables();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByResponsables();
			
			this.abrirFrameOrderByResponsables();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByResponsables();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleResponsables(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsables);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormResponsables.isMaximum()) {
					this.jInternalFrameDetalleFormResponsables.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormResponsables.setSize(this.jInternalFrameDetalleFormResponsables.iWidthFormulario,this.jInternalFrameDetalleFormResponsables.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormResponsables.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormResponsables.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormResponsables.isMaximum()) {
						this.jInternalFrameDetalleFormResponsables.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormResponsables.jContentPaneDetalleResponsables.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormResponsables.jContentPaneDetalleResponsables.getWidth(),ResponsablesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormResponsables.jContentPaneDetalleResponsables.getWidth(),ResponsablesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormResponsables.jContentPaneDetalleResponsables.getWidth(),ResponsablesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormResponsables.setVisible(true);
	        this.jInternalFrameDetalleFormResponsables.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByResponsables() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByResponsables==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByResponsables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsables,false,this);
				} else {
					this.jInternalFrameOrderByResponsables=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByResponsables,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByResponsables);
				this.jInternalFrameOrderByResponsables.setVisible(false);
				this.jInternalFrameOrderByResponsables.setSelected(false);
				
				this.jInternalFrameOrderByResponsables.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsables"));
				
				this.inicializarActualizarBindingTablaOrderByResponsables();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionResponsables() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionResponsables==null) {
				
				this.jInternalFrameImportacionResponsables=new ImportacionJInternalFrame(ResponsablesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionResponsables);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionResponsables);
				this.jInternalFrameImportacionResponsables.setVisible(false);
				this.jInternalFrameImportacionResponsables.setSelected(false);


				this.jInternalFrameImportacionResponsables.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsables"));
				this.jInternalFrameImportacionResponsables.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsables"));
				this.jInternalFrameImportacionResponsables.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsables"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoResponsables() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoResponsables==null) {
				this.jInternalFrameReporteDinamicoResponsables=new ReporteDinamicoJInternalFrame(ResponsablesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoResponsables);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoResponsables);
				this.jInternalFrameReporteDinamicoResponsables.setVisible(false);
				this.jInternalFrameReporteDinamicoResponsables.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoResponsables.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsables"));
				this.jInternalFrameReporteDinamicoResponsables.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsables"));
				this.jInternalFrameReporteDinamicoResponsables.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsables"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsables();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleResponsables() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormResponsables);
			
	       	this.jInternalFrameDetalleFormResponsables.setVisible(false);
	        this.jInternalFrameDetalleFormResponsables.setSelected(false);
			
			//this.jInternalFrameDetalleFormResponsables.dispose();
			//this.jInternalFrameDetalleFormResponsables=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoResponsables() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoResponsables.setVisible(true);
	        this.jInternalFrameReporteDinamicoResponsables.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionResponsables() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionResponsables.setVisible(true);
	        this.jInternalFrameImportacionResponsables.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByResponsables() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByResponsables.setVisible(true);
	        this.jInternalFrameOrderByResponsables.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByResponsables() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByResponsables.setVisible(false);
	        this.jInternalFrameOrderByResponsables.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoResponsables() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoResponsables.setVisible(false);
	        this.jInternalFrameReporteDinamicoResponsables.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionResponsables() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionResponsables.setVisible(false);
	        this.jInternalFrameImportacionResponsables.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarResponsables(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarResponsables(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesResponsables(true);
			//this.isEsNuevoResponsables=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesResponsables("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsables(false) ;
			
			if(responsablesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsables(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsables(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaResponsablesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarResponsables(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesResponsables(true);
			//this.isEsNuevoResponsables=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.responsables.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesResponsables("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesResponsables(false) ;
			
			if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleResponsables(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsables(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesResponsables(false);
			
			//if(!this.isEsNuevoResponsables) {								
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				
			}
			
			if(this.permiteMantenimiento(this.responsables)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsablesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoResponsables=true;
					this.inicializarActualizarBindingTablaResponsables(false);
					this.isEsNuevoResponsables=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoResponsables=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoResponsables=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsables(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsables(false);
				
				this.habilitarDeshabilitarControlesResponsables(false);
			
												
				
				if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleResponsables();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoResponsablesActionPerformed(evt,responsablesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualResponsables(this.responsables,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosResponsables.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,responsablesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.responsables.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarResponsablesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				this.responsables.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				this.responsables.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.responsables)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.responsablesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ResponsablesModel) this.jTableDatosResponsables.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoResponsables=true;
				this.inicializarActualizarBindingTablaResponsables(false);
				this.isEsNuevoResponsables=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesResponsables(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsables(false);
				
				this.habilitarDeshabilitarControlesResponsables(false);
				
				
				
				if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleResponsables();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarResponsablesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosResponsables.getRowCount()>=1) {
				jTableDatosResponsables.removeRowSelectionInterval(0, jTableDatosResponsables.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesResponsables(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaResponsables(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesResponsables(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualResponsables(false) ;
			
			this.isEsNuevoResponsables=false;
			
			if(ResponsablesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleResponsables();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosResponsablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingResponsables(false);
				
				//SI ES MANUAL
				if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualResponsables();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosResponsablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoResponsables--;			
			//Responsables responsablesAux= new Responsables();			
			//responsablesAux.setId(this.iIdNuevoResponsables);
			
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaResponsables();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
			
			this.responsables.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.responsablesLogic.getResponsabless().add(this.responsablesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.responsabless.add(this.responsablesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaResponsables(false);
			
			this.jTableDatosResponsables.setRowSelectionInterval(this.getIndiceNuevoResponsables(), this.getIndiceNuevoResponsables());
			
			int iLastRow =  this.jTableDatosResponsables.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosResponsables.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosResponsables.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaResponsables(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionResponsablesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingResponsables(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsables(false);
			
			//SI ES MANUAL
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsables();
			}
			
			//this.abrirFrameTreeResponsables();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionResponsablesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionResponsablesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionResponsables.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionResponsables.setFileImportacion(this.jInternalFrameImportacionResponsables.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionResponsables.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionResponsables.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionResponsables.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionResponsables.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoResponsablesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		

		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ResponsablesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ResponsablesBaseDesign.jrxml";
			
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
			
			this.generarReporteResponsabless("Todos",responsablessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidoEmpleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidoEmpleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidoEmpleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidoEmpleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEstructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEstructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEstructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEstructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_UBICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_icacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_icacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_icacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_icacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoResponsables.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoResponsables.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO:
					sNombreCampoCategoria="codigo_empleado";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO:
					sNombreCampoCategoria="nombre_empleado";
					break;

				case ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO:
					sNombreCampoCategoria="apellido_empleado";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					sNombreCampoCategoria="nombre_estructura";
					break;

				case ResponsablesConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoria="ubicacion";
					break;

				case ResponsablesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ResponsablesConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ResponsablesConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoResponsables.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO:
					sNombreCampoCategoriaValor="codigo_empleado";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO:
					sNombreCampoCategoriaValor="nombre_empleado";
					break;

				case ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO:
					sNombreCampoCategoriaValor="apellido_empleado";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					sNombreCampoCategoriaValor="nombre_estructura";
					break;

				case ResponsablesConstantesFunciones.LABEL_UBICACION:
					sNombreCampoCategoriaValor="ubicacion";
					break;

				case ResponsablesConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ResponsablesConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ResponsablesConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoResponsables.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsables.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_empleado");
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_empleado");
					break;

				case ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apello Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido_empleado");
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_estructura");
					break;

				case ResponsablesConstantesFunciones.LABEL_UBICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ubicacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ubicacion");
					break;

				case ResponsablesConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ResponsablesConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ResponsablesConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
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
	
	public void jButtonGenerarExcelReporteDinamicoResponsablesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsables";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Responsabless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ResponsablesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getcodigo_empleado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getnombre_empleado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getapellido_empleado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getnombre_estructura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_UBICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_UBICACION);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getubicacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(Responsables responsables:responsablessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(responsables.getnombre_detalle_grupo());
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
			//	this.getFilaCabeceraExportarExcelResponsables(row);				
			//	iRow++;
			//}				
			
			//for(Responsables responsablesAux:responsablessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelResponsables(responsablesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
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
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsables(false);
			
			//SI ES MANUAL
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualResponsables();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresResponsablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsables(false);
			
			//SI ES MANUAL
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsables();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesResponsablesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingResponsables(false);
			
			//SI ES MANUAL
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualResponsables();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaResponsables() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosResponsables.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosResponsables.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosResponsables.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosResponsables.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosResponsables.setMinimumSize(dimensionMinimum);
		this.jTableDatosResponsables.setMaximumSize(dimensionMaximum);
		this.jTableDatosResponsables.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingResponsables(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingResponsables(esInicializar,true);
	}
	
	public void inicializarActualizarBindingResponsables(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaResponsables(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesResponsables(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasResponsables(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsables(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesResponsables(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ResponsablesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualResponsables() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaResponsables();
		
		this.inicializarActualizarBindingBotonesManualResponsables(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualResponsables();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesResponsables() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualResponsables(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualResponsables(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosResponsables.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosResponsables.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteResponsables.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormResponsables!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormResponsables.jCheckBoxPostAccionNuevoResponsables.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormResponsables.jCheckBoxPostAccionSinCerrarResponsables.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormResponsables.jCheckBoxPostAccionSinMensajeResponsables.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosResponsables.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosResponsables.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteResponsables.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormResponsables!=null) {
				this.jInternalFrameDetalleFormResponsables.jCheckBoxPostAccionNuevoResponsables.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormResponsables.jCheckBoxPostAccionSinCerrarResponsables.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormResponsables.jCheckBoxPostAccionSinMensajeResponsables.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionResponsables.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionResponsables.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesResponsables.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoResponsables!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesResponsables.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesResponsables.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarResponsables.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesResponsables.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoResponsables!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesResponsables.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralResponsables.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesResponsables(Boolean esInicializar) throws Exception {
		try	{	
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualResponsables(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesResponsables() throws Exception {
		try	{
			if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsables();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsables() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualResponsables() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesResponsables.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesResponsables.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesResponsables.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesResponsables.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesResponsables.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesResponsables.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionResponsables.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionResponsables.addItem(reporte);
			}
			
			
			if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionResponsables.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionResponsables.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesResponsables.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesResponsables.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesResponsables.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesResponsables.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarResponsables.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarResponsables.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarResponsables.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsables();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualResponsables() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsables!=null) {
				this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoResponsables!=null) {
				this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoResponsables.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoResponsables!=null) {
				
				if(this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsables.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoResponsables.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoResponsables.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoResponsables.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualResponsables()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaResponsables=Long.parseLong(this.jLabelidResponsablesBusquedaResponsables.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasResponsables(Boolean esInicializar) throws Exception {				
		if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualResponsables();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaResponsables() throws Exception {
		this.inicializarActualizarBindingTablaResponsables(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByResponsables() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosResponsablesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsablesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaResponsables(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=responsablesLogic.getResponsabless().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=responsabless.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosResponsables.setModel(new ResponsablesModel(this.responsablesLogic.getResponsabless(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosResponsables.setModel(new ResponsablesModel(this.responsabless,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByResponsables!=null && this.jInternalFrameOrderByResponsables.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByResponsables();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ResponsablesConstantesFunciones.SCLASSWEBTITULO,responsablesConstantesFunciones.resaltarSeleccionarResponsables,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ResponsablesConstantesFunciones.SCLASSWEBTITULO,responsablesConstantesFunciones.resaltarSeleccionarResponsables,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_ID));

		if(this.responsablesConstantesFunciones.mostraridResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.responsablesConstantesFunciones.resaltaridResponsables,this.responsablesConstantesFunciones.activaridResponsables,this,true,"idResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltaridResponsables,this.responsablesConstantesFunciones.activaridResponsables,this,true,"idResponsables","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO));

		if(this.responsablesConstantesFunciones.mostrarcodigo_empleadoResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarcodigo_empleadoResponsables,this.responsablesConstantesFunciones.activarcodigo_empleadoResponsables,this,true,"codigo_empleadoResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarcodigo_empleadoResponsables,this.responsablesConstantesFunciones.activarcodigo_empleadoResponsables,this,true,"codigo_empleadoResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO));

		if(this.responsablesConstantesFunciones.mostrarnombre_empleadoResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarnombre_empleadoResponsables,this.responsablesConstantesFunciones.activarnombre_empleadoResponsables,this,true,"nombre_empleadoResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarnombre_empleadoResponsables,this.responsablesConstantesFunciones.activarnombre_empleadoResponsables,this,true,"nombre_empleadoResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO));

		if(this.responsablesConstantesFunciones.mostrarapellido_empleadoResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarapellido_empleadoResponsables,this.responsablesConstantesFunciones.activarapellido_empleadoResponsables,this,true,"apellido_empleadoResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarapellido_empleadoResponsables,this.responsablesConstantesFunciones.activarapellido_empleadoResponsables,this,true,"apellido_empleadoResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA));

		if(this.responsablesConstantesFunciones.mostrarnombre_estructuraResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarnombre_estructuraResponsables,this.responsablesConstantesFunciones.activarnombre_estructuraResponsables,this,true,"nombre_estructuraResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarnombre_estructuraResponsables,this.responsablesConstantesFunciones.activarnombre_estructuraResponsables,this,true,"nombre_estructuraResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_UBICACION));

		if(this.responsablesConstantesFunciones.mostrarubicacionResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_UBICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarubicacionResponsables,this.responsablesConstantesFunciones.activarubicacionResponsables,this,true,"ubicacionResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarubicacionResponsables,this.responsablesConstantesFunciones.activarubicacionResponsables,this,true,"ubicacionResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_FECHA));

		if(this.responsablesConstantesFunciones.mostrarfechaResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.responsablesConstantesFunciones.resaltarfechaResponsables,this.responsablesConstantesFunciones.activarfechaResponsables,this,true,"fechaResponsables","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.responsablesConstantesFunciones.resaltarfechaResponsables,this.responsablesConstantesFunciones.activarfechaResponsables,this,true,"fechaResponsables","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_DESCRIPCION));

		if(this.responsablesConstantesFunciones.mostrardescripcionResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltardescripcionResponsables,this.responsablesConstantesFunciones.activardescripcionResponsables,this,true,"descripcionResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltardescripcionResponsables,this.responsablesConstantesFunciones.activardescripcionResponsables,this,true,"descripcionResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_NOMBRE));

		if(this.responsablesConstantesFunciones.mostrarnombreResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarnombreResponsables,this.responsablesConstantesFunciones.activarnombreResponsables,this,true,"nombreResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarnombreResponsables,this.responsablesConstantesFunciones.activarnombreResponsables,this,true,"nombreResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_CLAVE));

		if(this.responsablesConstantesFunciones.mostrarclaveResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarclaveResponsables,this.responsablesConstantesFunciones.activarclaveResponsables,this,true,"claveResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarclaveResponsables,this.responsablesConstantesFunciones.activarclaveResponsables,this,true,"claveResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.responsablesConstantesFunciones.mostrarcodigo_sub_grupoResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarcodigo_sub_grupoResponsables,this.responsablesConstantesFunciones.activarcodigo_sub_grupoResponsables,this,true,"codigo_sub_grupoResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarcodigo_sub_grupoResponsables,this.responsablesConstantesFunciones.activarcodigo_sub_grupoResponsables,this,true,"codigo_sub_grupoResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.responsablesConstantesFunciones.mostrarnombre_sub_grupoResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarnombre_sub_grupoResponsables,this.responsablesConstantesFunciones.activarnombre_sub_grupoResponsables,this,true,"nombre_sub_grupoResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarnombre_sub_grupoResponsables,this.responsablesConstantesFunciones.activarnombre_sub_grupoResponsables,this,true,"nombre_sub_grupoResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.responsablesConstantesFunciones.mostrarcodigo_detalle_grupoResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarcodigo_detalle_grupoResponsables,this.responsablesConstantesFunciones.activarcodigo_detalle_grupoResponsables,this,true,"codigo_detalle_grupoResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarcodigo_detalle_grupoResponsables,this.responsablesConstantesFunciones.activarcodigo_detalle_grupoResponsables,this,true,"codigo_detalle_grupoResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosResponsables,ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.responsablesConstantesFunciones.mostrarnombre_detalle_grupoResponsables && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.responsablesConstantesFunciones.resaltarnombre_detalle_grupoResponsables,this.responsablesConstantesFunciones.activarnombre_detalle_grupoResponsables,this,true,"nombre_detalle_grupoResponsables","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.responsablesConstantesFunciones.resaltarnombre_detalle_grupoResponsables,this.responsablesConstantesFunciones.activarnombre_detalle_grupoResponsables,this,true,"nombre_detalle_grupoResponsables","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ResponsablesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.responsablesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsablesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsablesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsables.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.responsablesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.responsablesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosResponsables.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarResponsables && this.isPermisoGuardarCambiosResponsables) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.responsablesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.responsablesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosResponsables.addColumn(tableColumn);
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
			
			this.jTableDatosResponsables.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsables && this.isPermisoGuardarCambiosResponsables) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarResponsables && this.isPermisoGuardarCambiosResponsables) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosResponsables.moveColumn(this.jTableDatosResponsables.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosResponsables.moveColumn(this.jTableDatosResponsables.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosResponsables.moveColumn(this.jTableDatosResponsables.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosResponsables.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosResponsables.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosResponsables,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosResponsables.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosResponsables.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosResponsables.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosResponsables.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosResponsables.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=responsablesLogic.getResponsabless().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=responsabless.size()-1;
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
		//this.jTableDatosResponsables.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosResponsables.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosResponsables();
			
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
				
				//this.isEsNuevoResponsables=false;
					
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
				if(this.responsablesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormResponsables==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsables.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsables.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.responsables.getsType().equals("DUPLICADO")
				   || this.responsables.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoResponsables=true;
				
				} else {
					this.isEsNuevoResponsables=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.responsablesSessionBean.getEsGuardarRelacionado()) {
					if(this.responsables.getId()>=0 && !this.responsables.getIsNew()) {						
						this.isEsNuevoResponsables=false;
						
					} else {
						this.isEsNuevoResponsables=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoResponsables(esRelaciones);						
				
				this.seleccionarResponsables(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.responsables.getId()<0) {
					this.isEsNuevoResponsables=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarResponsables(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarResponsables(evt,rowIndex);
				}	
				
				if(this.responsablesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Responsables: " + this.dDif); 
					}
				}								
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarResponsables(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.responsables)) {
					if(this.responsables.getId()>0) {
						this.responsables.setIsDeleted(true);
						
						this.responsablessEliminados.add(this.responsables);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.responsablesLogic.getResponsabless().remove(this.responsables);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.responsabless.remove(this.responsables);				
					}
					
					
					((ResponsablesModel) this.jTableDatosResponsables.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaResponsables(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarResponsables(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoResponsables) {
			
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosResponsables.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosResponsables.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioResponsables(this.responsables);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesResponsables("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesResponsables(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualResponsables() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsables(Responsables responsables) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoResponsables(responsables,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoResponsables(Responsables responsables,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioResponsables(responsables);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyResponsables(responsables,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyResponsables(responsables);
	}
	
	public void setVariablesObjetoActualToFormularioResponsables(Responsables responsables) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.setText(responsables.getId().toString());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.setText(responsables.getcodigo_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.setText(responsables.getnombre_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.setText(responsables.getapellido_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.setText(responsables.getnombre_estructura());
			this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.setText(responsables.getubicacion());
			this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.setDate(responsables.getfecha());
			this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.setText(responsables.getdescripcion());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.setText(responsables.getnombre());
			this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.setText(responsables.getclave());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.setText(responsables.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.setText(responsables.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.setText(responsables.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.setText(responsables.getnombre_detalle_grupo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Responsables responsablesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,responsablesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Responsables responsablesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				responsablesLocal=this.responsables;
			} else {
				responsablesLocal=this.responsablesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(responsablesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoResponsables(responsablesLocal,true);
					
					if(responsablesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(responsablesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.responsablesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(responsablesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoResponsables(Responsables responsables,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsables(responsables,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysResponsables(responsables);
	}
	
	public void setVariablesFormularioToObjetoActualResponsables(Responsables responsables,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualResponsables(responsables,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualResponsables(Responsables responsables,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.getText()==null || this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.getText()=="" || this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.getText()=="Id") {
				this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.setText("0");
			}

			if(conColumnasBase) {responsables.setId(Long.parseLong(this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelIdResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setcodigo_empleado(this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_empleadoResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setnombre_empleado(this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_empleadoResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setapellido_empleado(this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelapellido_empleadoResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setnombre_estructura(this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_estructuraResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setubicacion(this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_UBICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelubicacionResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setfecha(this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelfechaResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setdescripcion(this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabeldescripcionResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setnombre(this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombreResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setclave(this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelclaveResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setcodigo_sub_grupo(this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_sub_grupoResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setnombre_sub_grupo(this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_sub_grupoResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelcodigo_detalle_grupoResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			responsables.setnombre_detalle_grupo(this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormResponsables.jLabelnombre_detalle_grupoResponsables,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualResponsables(Responsables responsablesBean,Responsables responsables,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosResponsables(Responsables responsablesOrigen,Responsables responsables,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsablesOrigen.getId()!=null && !responsablesOrigen.getId().equals(0L))) {responsables.setId(responsablesOrigen.getId());}}
			if(conDefault || (!conDefault && responsablesOrigen.getcodigo_empleado()!=null && !responsablesOrigen.getcodigo_empleado().equals(""))) {responsables.setcodigo_empleado(responsablesOrigen.getcodigo_empleado());}
			if(conDefault || (!conDefault && responsablesOrigen.getnombre_empleado()!=null && !responsablesOrigen.getnombre_empleado().equals(""))) {responsables.setnombre_empleado(responsablesOrigen.getnombre_empleado());}
			if(conDefault || (!conDefault && responsablesOrigen.getapellido_empleado()!=null && !responsablesOrigen.getapellido_empleado().equals(""))) {responsables.setapellido_empleado(responsablesOrigen.getapellido_empleado());}
			if(conDefault || (!conDefault && responsablesOrigen.getnombre_estructura()!=null && !responsablesOrigen.getnombre_estructura().equals(""))) {responsables.setnombre_estructura(responsablesOrigen.getnombre_estructura());}
			if(conDefault || (!conDefault && responsablesOrigen.getubicacion()!=null && !responsablesOrigen.getubicacion().equals(""))) {responsables.setubicacion(responsablesOrigen.getubicacion());}
			if(conDefault || (!conDefault && responsablesOrigen.getfecha()!=null && !responsablesOrigen.getfecha().equals(new Date()))) {responsables.setfecha(responsablesOrigen.getfecha());}
			if(conDefault || (!conDefault && responsablesOrigen.getdescripcion()!=null && !responsablesOrigen.getdescripcion().equals(""))) {responsables.setdescripcion(responsablesOrigen.getdescripcion());}
			if(conDefault || (!conDefault && responsablesOrigen.getnombre()!=null && !responsablesOrigen.getnombre().equals(""))) {responsables.setnombre(responsablesOrigen.getnombre());}
			if(conDefault || (!conDefault && responsablesOrigen.getclave()!=null && !responsablesOrigen.getclave().equals(""))) {responsables.setclave(responsablesOrigen.getclave());}
			if(conDefault || (!conDefault && responsablesOrigen.getcodigo_sub_grupo()!=null && !responsablesOrigen.getcodigo_sub_grupo().equals(""))) {responsables.setcodigo_sub_grupo(responsablesOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && responsablesOrigen.getnombre_sub_grupo()!=null && !responsablesOrigen.getnombre_sub_grupo().equals(""))) {responsables.setnombre_sub_grupo(responsablesOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && responsablesOrigen.getcodigo_detalle_grupo()!=null && !responsablesOrigen.getcodigo_detalle_grupo().equals(""))) {responsables.setcodigo_detalle_grupo(responsablesOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && responsablesOrigen.getnombre_detalle_grupo()!=null && !responsablesOrigen.getnombre_detalle_grupo().equals(""))) {responsables.setnombre_detalle_grupo(responsablesOrigen.getnombre_detalle_grupo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsables(Responsables responsables) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.setText(responsables.getId().toString());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.setText(responsables.getcodigo_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.setText(responsables.getnombre_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.setText(responsables.getapellido_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.setText(responsables.getnombre_estructura());
			this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.setText(responsables.getubicacion());
			this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.setDate(responsables.getfecha());
			this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.setText(responsables.getdescripcion());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.setText(responsables.getnombre());
			this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.setText(responsables.getclave());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.setText(responsables.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.setText(responsables.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.setText(responsables.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.setText(responsables.getnombre_detalle_grupo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioResponsables(ResponsablesBean responsablesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.setText(responsablesBean.getId().toString());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.setText(responsablesBean.getcodigo_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.setText(responsablesBean.getnombre_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.setText(responsablesBean.getapellido_empleado());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.setText(responsablesBean.getnombre_estructura());
			this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.setText(responsablesBean.getubicacion());
			this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.setDate(responsablesBean.getfecha());
			this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.setText(responsablesBean.getdescripcion());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.setText(responsablesBean.getnombre());
			this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.setText(responsablesBean.getclave());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.setText(responsablesBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.setText(responsablesBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.setText(responsablesBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.setText(responsablesBean.getnombre_detalle_grupo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanResponsables(ResponsablesParameterReturnGeneral responsablesReturnGeneral,ResponsablesBean responsablesBean,Boolean conDefault) throws Exception { 
		try {
			Responsables responsablesLocal=new Responsables();
			
			responsablesLocal=responsablesReturnGeneral.getResponsables();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && responsablesLocal.getId()!=null && !responsablesLocal.getId().equals(0L))) {responsablesBean.setId(responsablesLocal.getId());}}
			if(conDefault || (!conDefault && responsablesLocal.getcodigo_empleado()!=null && !responsablesLocal.getcodigo_empleado().equals(""))) {responsablesBean.setcodigo_empleado(responsablesLocal.getcodigo_empleado());}
			if(conDefault || (!conDefault && responsablesLocal.getnombre_empleado()!=null && !responsablesLocal.getnombre_empleado().equals(""))) {responsablesBean.setnombre_empleado(responsablesLocal.getnombre_empleado());}
			if(conDefault || (!conDefault && responsablesLocal.getapellido_empleado()!=null && !responsablesLocal.getapellido_empleado().equals(""))) {responsablesBean.setapellido_empleado(responsablesLocal.getapellido_empleado());}
			if(conDefault || (!conDefault && responsablesLocal.getnombre_estructura()!=null && !responsablesLocal.getnombre_estructura().equals(""))) {responsablesBean.setnombre_estructura(responsablesLocal.getnombre_estructura());}
			if(conDefault || (!conDefault && responsablesLocal.getubicacion()!=null && !responsablesLocal.getubicacion().equals(""))) {responsablesBean.setubicacion(responsablesLocal.getubicacion());}
			if(conDefault || (!conDefault && responsablesLocal.getfecha()!=null && !responsablesLocal.getfecha().equals(new Date()))) {responsablesBean.setfecha(responsablesLocal.getfecha());}
			if(conDefault || (!conDefault && responsablesLocal.getdescripcion()!=null && !responsablesLocal.getdescripcion().equals(""))) {responsablesBean.setdescripcion(responsablesLocal.getdescripcion());}
			if(conDefault || (!conDefault && responsablesLocal.getnombre()!=null && !responsablesLocal.getnombre().equals(""))) {responsablesBean.setnombre(responsablesLocal.getnombre());}
			if(conDefault || (!conDefault && responsablesLocal.getclave()!=null && !responsablesLocal.getclave().equals(""))) {responsablesBean.setclave(responsablesLocal.getclave());}
			if(conDefault || (!conDefault && responsablesLocal.getcodigo_sub_grupo()!=null && !responsablesLocal.getcodigo_sub_grupo().equals(""))) {responsablesBean.setcodigo_sub_grupo(responsablesLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && responsablesLocal.getnombre_sub_grupo()!=null && !responsablesLocal.getnombre_sub_grupo().equals(""))) {responsablesBean.setnombre_sub_grupo(responsablesLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && responsablesLocal.getcodigo_detalle_grupo()!=null && !responsablesLocal.getcodigo_detalle_grupo().equals(""))) {responsablesBean.setcodigo_detalle_grupo(responsablesLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && responsablesLocal.getnombre_detalle_grupo()!=null && !responsablesLocal.getnombre_detalle_grupo().equals(""))) {responsablesBean.setnombre_detalle_grupo(responsablesLocal.getnombre_detalle_grupo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxResponsablesGenerico(Long idResponsablesSeleccionado,JComboBox jComboBoxResponsables,List<Responsables> responsablessLocal)throws Exception {
		try {
			Responsables  responsablesTemp=null;

			for(Responsables responsablesAux:responsablessLocal) {
				if(responsablesAux.getId()!=null && responsablesAux.getId().equals(idResponsablesSeleccionado)) {
					responsablesTemp=responsablesAux;
					break;
				}
			}

			jComboBoxResponsables.setSelectedItem(responsablesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxResponsablesGenerico(JComboBox jComboBoxResponsables,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsables.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxResponsables.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxResponsables.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxResponsables.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxResponsables.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxResponsables.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsables=(Responsables) responsablesLogic.getResponsabless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsables =(Responsables) responsabless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!responsables.getIsNew() && !responsables.getIsChanged() && !responsables.getIsDeleted()) {
				sDescripcion=responsables.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=responsables.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Responsables responsablesRow=new Responsables();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsablesRow=(Responsables) responsablesLogic.getResponsabless().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			responsablesRow=(Responsables) responsabless.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualResponsables(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoResponsables.setVisible((this.isVisibilidadCeldaNuevoResponsables && this.isPermisoNuevoResponsables));			
			this.jButtonDuplicarResponsables.setVisible((this.isVisibilidadCeldaDuplicarResponsables && this.isPermisoDuplicarResponsables));			
			this.jButtonCopiarResponsables.setVisible((this.isVisibilidadCeldaCopiarResponsables && this.isPermisoCopiarResponsables));
			this.jButtonVerFormResponsables.setVisible((this.isVisibilidadCeldaVerFormResponsables && this.isPermisoVerFormResponsables));
			
			this.jButtonAbrirOrderByResponsables.setVisible((this.isVisibilidadCeldaOrdenResponsables && this.isPermisoOrdenResponsables));			
			
			this.jButtonNuevoRelacionesResponsables.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsables && this.isPermisoNuevoResponsables));			
			this.jButtonNuevoGuardarCambiosResponsables.setVisible((this.isVisibilidadCeldaNuevoResponsables && this.isPermisoNuevoResponsables && this.isPermisoGuardarCambiosResponsables));
			
			if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.jInternalFrameDetalleFormResponsables.jButtonModificarResponsables.setVisible((this.isVisibilidadCeldaModificarResponsables && this.isPermisoActualizarResponsables));	
			this.jInternalFrameDetalleFormResponsables.jButtonActualizarResponsables.setVisible((this.isVisibilidadCeldaActualizarResponsables && this.isPermisoActualizarResponsables));	
			this.jInternalFrameDetalleFormResponsables.jButtonEliminarResponsables.setVisible((this.isVisibilidadCeldaEliminarResponsables && this.isPermisoEliminarResponsables));
			this.jInternalFrameDetalleFormResponsables.jButtonCancelarResponsables.setVisible(this.isVisibilidadCeldaCancelarResponsables);							
			this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.setVisible((this.isVisibilidadCeldaGuardarResponsables && this.isPermisoGuardarCambiosResponsables));			
			
			}
						
			this.jButtonGuardarCambiosTablaResponsables.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsables && this.isPermisoGuardarCambiosResponsables));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarResponsables.setVisible((this.isVisibilidadCeldaNuevoResponsables && this.isPermisoNuevoResponsables));						
			this.jButtonDuplicarToolBarResponsables.setVisible((this.isVisibilidadCeldaDuplicarResponsables && this.isPermisoDuplicarResponsables));						
			this.jButtonCopiarToolBarResponsables.setVisible((this.isVisibilidadCeldaCopiarResponsables && this.isPermisoCopiarResponsables));			
			this.jButtonVerFormToolBarResponsables.setVisible((this.isVisibilidadCeldaVerFormResponsables && this.isPermisoVerFormResponsables));			
			this.jButtonAbrirOrderByToolBarResponsables.setVisible((this.isVisibilidadCeldaOrdenResponsables && this.isPermisoOrdenResponsables));
			this.jButtonNuevoRelacionesToolBarResponsables.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsables && this.isPermisoNuevoResponsables));			
			this.jButtonNuevoGuardarCambiosToolBarResponsables.setVisible((this.isVisibilidadCeldaNuevoResponsables && this.isPermisoNuevoResponsables && this.isPermisoGuardarCambiosResponsables));			
			
			if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.jInternalFrameDetalleFormResponsables.jButtonModificarToolBarResponsables.setVisible((this.isVisibilidadCeldaModificarResponsables && this.isPermisoActualizarResponsables));	
			this.jInternalFrameDetalleFormResponsables.jButtonActualizarToolBarResponsables.setVisible((this.isVisibilidadCeldaActualizarResponsables  && this.isPermisoActualizarResponsables));	
			this.jInternalFrameDetalleFormResponsables.jButtonEliminarToolBarResponsables.setVisible((this.isVisibilidadCeldaEliminarResponsables && this.isPermisoEliminarResponsables));
			this.jInternalFrameDetalleFormResponsables.jButtonCancelarToolBarResponsables.setVisible(this.isVisibilidadCeldaCancelarResponsables);				
			this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosToolBarResponsables.setVisible((this.isVisibilidadCeldaGuardarResponsables && this.isPermisoGuardarCambiosResponsables));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarResponsables.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsables && this.isPermisoGuardarCambiosResponsables));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoResponsables.setVisible((this.isVisibilidadCeldaNuevoResponsables && this.isPermisoNuevoResponsables));			
			this.jMenuItemDuplicarResponsables.setVisible((this.isVisibilidadCeldaDuplicarResponsables && this.isPermisoDuplicarResponsables));			
			this.jMenuItemCopiarResponsables.setVisible((this.isVisibilidadCeldaCopiarResponsables && this.isPermisoCopiarResponsables));			
			this.jMenuItemVerFormResponsables.setVisible((this.isVisibilidadCeldaVerFormResponsables && this.isPermisoVerFormResponsables));			
			this.jMenuItemAbrirOrderByResponsables.setVisible((this.isVisibilidadCeldaOrdenResponsables && this.isPermisoOrdenResponsables));			
			//this.jMenuItemMostrarOcultarResponsables.setVisible((this.isVisibilidadCeldaOrdenResponsables && this.isPermisoOrdenResponsables));
			this.jMenuItemDetalleAbrirOrderByResponsables.setVisible((this.isVisibilidadCeldaOrdenResponsables && this.isPermisoOrdenResponsables));			
			//this.jMenuItemDetalleMostrarOcultarResponsables.setVisible((this.isVisibilidadCeldaOrdenResponsables && this.isPermisoOrdenResponsables));			
			this.jMenuItemNuevoRelacionesResponsables.setVisible((this.isVisibilidadCeldaNuevoRelacionesResponsables && this.isPermisoNuevoResponsables));			
			this.jMenuItemNuevoGuardarCambiosResponsables.setVisible((this.isVisibilidadCeldaNuevoResponsables && this.isPermisoNuevoResponsables && this.isPermisoGuardarCambiosResponsables));									
			
			if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.jInternalFrameDetalleFormResponsables.jMenuItemModificarResponsables.setVisible((this.isVisibilidadCeldaModificarResponsables && this.isPermisoActualizarResponsables));	
			this.jInternalFrameDetalleFormResponsables.jMenuItemActualizarResponsables.setVisible((this.isVisibilidadCeldaActualizarResponsables && this.isPermisoActualizarResponsables));	
			this.jInternalFrameDetalleFormResponsables.jMenuItemEliminarResponsables.setVisible((this.isVisibilidadCeldaEliminarResponsables && this.isPermisoEliminarResponsables));
			this.jInternalFrameDetalleFormResponsables.jMenuItemCancelarResponsables.setVisible(this.isVisibilidadCeldaCancelarResponsables);				
			}
			
			this.jMenuItemGuardarCambiosResponsables.setVisible((this.isVisibilidadCeldaGuardarResponsables && this.isPermisoGuardarCambiosResponsables));						
			this.jMenuItemGuardarCambiosTablaResponsables.setVisible((this.isVisibilidadCeldaGuardarCambiosResponsables && this.isPermisoGuardarCambiosResponsables));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoResponsables=this.jButtonNuevoResponsables.isVisible();
			this.isVisibilidadCeldaDuplicarResponsables=this.jButtonDuplicarResponsables.isVisible();
			this.isVisibilidadCeldaCopiarResponsables=this.jButtonCopiarResponsables.isVisible();
			this.isVisibilidadCeldaVerFormResponsables=this.jButtonVerFormResponsables.isVisible();
			
			this.isVisibilidadCeldaOrdenResponsables=this.jButtonAbrirOrderByResponsables.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesResponsables=this.jButtonNuevoRelacionesResponsables.isVisible();
			this.isVisibilidadCeldaModificarResponsables=this.jButtonModificarResponsables.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.isVisibilidadCeldaActualizarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonActualizarResponsables.isVisible();
			this.isVisibilidadCeldaEliminarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonEliminarResponsables.isVisible();
			this.isVisibilidadCeldaCancelarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonCancelarResponsables.isVisible();
			this.isVisibilidadCeldaGuardarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosResponsables=this.jButtonGuardarCambiosTablaResponsables.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoResponsables=this.jButtonNuevoToolBarResponsables.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsables=this.jButtonNuevoRelacionesToolBarResponsables.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.isVisibilidadCeldaModificarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonModificarToolBarResponsables.isVisible();
			this.isVisibilidadCeldaActualizarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonActualizarToolBarResponsables.isVisible();
			this.isVisibilidadCeldaEliminarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonEliminarToolBarResponsables.isVisible();
			this.isVisibilidadCeldaCancelarResponsables=this.jInternalFrameDetalleFormResponsables.jButtonCancelarToolBarResponsables.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsables=this.jButtonGuardarCambiosToolBarResponsables.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsables=this.jButtonGuardarCambiosTablaToolBarResponsables.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoResponsables=this.jMenuItemNuevoResponsables.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesResponsables=this.jMenuItemNuevoRelacionesResponsables.isVisible();
			
			if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.isVisibilidadCeldaModificarResponsables=this.jInternalFrameDetalleFormResponsables.jMenuItemModificarResponsables.isVisible();
			this.isVisibilidadCeldaActualizarResponsables=this.jInternalFrameDetalleFormResponsables.jMenuItemActualizarResponsables.isVisible();
			this.isVisibilidadCeldaEliminarResponsables=this.jInternalFrameDetalleFormResponsables.jMenuItemEliminarResponsables.isVisible();
			this.isVisibilidadCeldaCancelarResponsables=this.jInternalFrameDetalleFormResponsables.jMenuItemCancelarResponsables.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarResponsables=this.jMenuItemGuardarCambiosResponsables.isVisible();
			this.isVisibilidadCeldaGuardarCambiosResponsables=this.jMenuItemGuardarCambiosTablaResponsables.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesResponsables(Boolean esInicializar) {
		if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.responsablesSessionBean.getConGuardarRelaciones()) {
				//if(this.responsablesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesResponsables();
			}
			
			this.inicializarActualizarBindingBotonesManualResponsables(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualResponsables() {
		this.jButtonNuevoResponsables.setVisible(this.isPermisoNuevoResponsables);			
		this.jButtonDuplicarResponsables.setVisible(this.isPermisoDuplicarResponsables);			
		this.jButtonCopiarResponsables.setVisible(this.isPermisoCopiarResponsables);			
		this.jButtonVerFormResponsables.setVisible(this.isPermisoVerFormResponsables);			
		
		this.jButtonAbrirOrderByResponsables.setVisible(this.isPermisoOrdenResponsables);					
		
		this.jButtonNuevoRelacionesResponsables.setVisible(this.isPermisoNuevoResponsables);			
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonModificarResponsables.setVisible(this.isPermisoActualizarResponsables);	
			this.jInternalFrameDetalleFormResponsables.jButtonActualizarResponsables.setVisible(this.isPermisoActualizarResponsables);	
			this.jInternalFrameDetalleFormResponsables.jButtonEliminarResponsables.setVisible(this.isPermisoEliminarResponsables);
			this.jInternalFrameDetalleFormResponsables.jButtonCancelarResponsables.setVisible(this.isVisibilidadCeldaCancelarResponsables);						
			this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.setVisible(this.isPermisoGuardarCambiosResponsables);							
		}
		
		this.jButtonGuardarCambiosTablaResponsables.setVisible(this.isPermisoActualizarResponsables);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsables() {
		this.jInternalFrameDetalleFormResponsables.jButtonModificarResponsables.setVisible(this.isPermisoActualizarResponsables);	
		this.jInternalFrameDetalleFormResponsables.jButtonActualizarResponsables.setVisible(this.isPermisoActualizarResponsables);	
		this.jInternalFrameDetalleFormResponsables.jButtonEliminarResponsables.setVisible(this.isPermisoEliminarResponsables);
		this.jInternalFrameDetalleFormResponsables.jButtonCancelarResponsables.setVisible(this.isVisibilidadCeldaCancelarResponsables);							
		this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.setVisible((this.isVisibilidadCeldaGuardarResponsables && this.isPermisoGuardarCambiosResponsables));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosResponsables() {
		if(ResponsablesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualResponsables();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesResponsables() {
	}
	
	public void jTableDatosResponsablesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarResponsables(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.responsables.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaResponsablesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebResponsables(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosResponsables.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosResponsables.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.responsablesLogic.getConnexion());

				if(this.responsables.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.responsables.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderResponsables=(TitledBorder)this.jScrollPanelDatosResponsables.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderResponsables.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.responsables.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_empleadoResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getcodigo_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_empleado like '%"+this.responsables.getcodigo_empleado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_empleadoResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getnombre_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_empleado like '%"+this.responsables.getnombre_empleado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellido_empleadoResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getapellido_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido_empleado like '%"+this.responsables.getapellido_empleado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_estructuraResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getnombre_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_estructura like '%"+this.responsables.getnombre_estructura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonubicacionResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getubicacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ubicacion like '%"+this.responsables.getubicacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.responsables.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.responsables.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.responsables.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.responsables.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.responsables.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.responsables.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.responsables.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoResponsablesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosResponsables.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualResponsables(this.getresponsables(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.responsables==null) {
						this.responsables = new Responsables();
					}

					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);
				}

				if(this.responsables.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.responsables.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingResponsables(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaResponsablesResponsablesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsables(false,false);

			this.getResponsablessBusquedaResponsables();

			this.inicializarActualizarBindingResponsables(false);

			//if(ResponsablesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsables(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaResponsablesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingResponsables(false,false);

			this.getResponsablessFK_IdEmpresa();

			this.inicializarActualizarBindingResponsables(false);

			//if(ResponsablesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingResponsables(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.responsablesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameResponsables() {
		if(this.jInternalFrameDetalleFormResponsables!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
			this.jInternalFrameDetalleFormResponsables.setVisible(false);	    			
			this.jInternalFrameDetalleFormResponsables.dispose();
			this.jInternalFrameDetalleFormResponsables=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoResponsables!=null) {
			this.jInternalFrameReporteDinamicoResponsables.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoResponsables.dispose();
			this.jInternalFrameReporteDinamicoResponsables=null;
		}
		
		if(this.jInternalFrameImportacionResponsables!=null) {
			this.jInternalFrameImportacionResponsables.setVisible(false);	    			
			this.jInternalFrameImportacionResponsables.dispose();
			this.jInternalFrameImportacionResponsables=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessResponsables();
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
			
			if(sTipo.equals("NuevoResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarResponsables")) {
				jButtonDuplicarResponsablesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarResponsables")) {
				jButtonCopiarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("VerFormResponsables")) {
				jButtonVerFormResponsablesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarResponsables")) {
				jButtonDuplicarResponsablesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarResponsables")) {
				jButtonDuplicarResponsablesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarResponsables")) {
				jButtonModificarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarResponsables")) {
				jButtonModificarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarResponsables")) {
				jButtonModificarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarResponsables")) {
				jButtonActualizarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarResponsables")) {
				jButtonActualizarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarResponsables")) {
				jButtonActualizarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("EliminarResponsables")) {
				jButtonEliminarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarResponsables")) {
				jButtonEliminarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarResponsables")) {
				jButtonEliminarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("CancelarResponsables")) {
				jButtonCancelarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarResponsables")) {
				jButtonCancelarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarResponsables")) {
				jButtonCancelarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("CerrarResponsables")) {
				jButtonCerrarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarResponsables")) {
				jButtonCerrarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarResponsables")) {
				jButtonCerrarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarResponsables")) {
				jButtonMostrarOcultarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarResponsables")) {
				jButtonCancelarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarResponsables")) {
				jButtonCopiarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarResponsables")) {
				jButtonVerFormResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarResponsables")) {
				jButtonCopiarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormResponsables")) {
				jButtonVerFormResponsablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionResponsables")) {
				jButtonRecargarInformacionResponsablesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarResponsables")) {
				jButtonRecargarInformacionResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionResponsables")) {
				jButtonRecargarInformacionResponsablesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresResponsables")) {
				jButtonAnterioresResponsablesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarResponsables")) {
				jButtonAnterioresResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreResponsables")) {
				jButtonAnterioresResponsablesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesResponsables")) {
				jButtonSiguientesResponsablesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarResponsables")) {
				jButtonSiguientesResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesResponsables")) {
				jButtonSiguientesResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByResponsables") || sTipo.equals("MenuItemDetalleAbrirOrderByResponsables")) {
				jButtonAbrirOrderByResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarResponsables") || sTipo.equals("MenuItemDetalleMostrarOcultarResponsables")) {
				jButtonMostrarOcultarResponsablesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosResponsables")) {
				jButtonNuevoGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarResponsables")) {
				jButtonNuevoGuardarCambiosResponsablesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosResponsables")) {
				jButtonNuevoGuardarCambiosResponsablesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoResponsables")) {
				jButtonCerrarReporteDinamicoResponsablesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoResponsables")) {
				jButtonGenerarReporteDinamicoResponsablesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoResponsables")) {
				
				jButtonGenerarExcelReporteDinamicoResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionResponsables")) {
				jButtonCerrarImportacionResponsablesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionResponsables")) {
				
				jButtonGenerarImportacionResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionResponsables")) {
				
				jButtonAbrirImportacionResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesResponsables")) {
				jComboBoxTiposAccionesResponsablesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesResponsables")) {
				jComboBoxTiposRelacionesResponsablesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioResponsables")) {
				jComboBoxTiposAccionesResponsablesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarResponsables")) {
				
				jComboBoxTiposSeleccionarResponsablesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralResponsables")) {
				jTextFieldValorCampoGeneralResponsablesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByResponsables")) {
				jButtonAbrirOrderByResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarResponsables")) {
				jButtonAbrirOrderByResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByResponsables")) {
				jButtonCerrarOrderByResponsablesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsablesBusqueda")) {
				this.jButtonidResponsablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsablesUpdate")) {
				this.jButtonid_empresaResponsablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsablesBusqueda")) {
				this.jButtonid_empresaResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_empleadoResponsablesBusqueda")) {
				this.jButtoncodigo_empleadoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empleadoResponsablesBusqueda")) {
				this.jButtonnombre_empleadoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellido_empleadoResponsablesBusqueda")) {
				this.jButtonapellido_empleadoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estructuraResponsablesBusqueda")) {
				this.jButtonnombre_estructuraResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionResponsablesBusqueda")) {
				this.jButtonubicacionResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaResponsablesBusqueda")) {
				this.jButtonfechaResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionResponsablesBusqueda")) {
				this.jButtondescripcionResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreResponsablesBusqueda")) {
				this.jButtonnombreResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveResponsablesBusqueda")) {
				this.jButtonclaveResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoResponsablesBusqueda")) {
				this.jButtoncodigo_sub_grupoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoResponsablesBusqueda")) {
				this.jButtonnombre_sub_grupoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoResponsablesBusqueda")) {
				this.jButtoncodigo_detalle_grupoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoResponsablesBusqueda")) {
				this.jButtonnombre_detalle_grupoResponsablesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaResponsablesResponsables")) {
				this.jButtonBusquedaResponsablesResponsablesActionPerformed(evt);
			}
			
			;
			
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessResponsables();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsablesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Responsables responsablesLocal=null;
			
			if(!this.getEsControlTabla()) {
				responsablesLocal=this.responsables;
			} else {
				responsablesLocal=this.responsablesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
							
				
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesAnterior =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablesAnterior =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
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
			
			


			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsablesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
								
						
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
								
				
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesAnterior =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablesAnterior =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesAnterior =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablesAnterior =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
							
				
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsablesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablesAnterior =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsablesAnterior =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
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
			
			


			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
								
				
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesAnterior =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablesAnterior =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
			
			this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsablesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosResponsables")) {
					jCheckBoxSeleccionarTodosResponsablesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosResponsables")) {
					jCheckBoxSeleccionadosResponsablesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarResponsables")) {
					
				}
				
				


				
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
												
				
				


				
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsablesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.responsablesAnterior =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.responsablesAnterior =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsablesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
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
			
			


			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaResponsablesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.responsables);
				
				this.actualizarInformacion("INFO_PADRE",false,this.responsables);
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
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
				
				


				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Responsables.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Responsables.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaResponsablesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.responsablesAnterior =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.responsablesAnterior =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarResponsables")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosResponsablesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosResponsables.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.responsables =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.responsables =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.responsables);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarResponsables")) {
				
				}
				
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarResponsables")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosResponsables.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarResponsables")) {
			
			}
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessResponsables();
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
			if(sTipo.equals("NuevoResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarResponsables")) {
				jButtonDuplicarResponsablesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarResponsables")) {
				jButtonCopiarResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormResponsables")) {
				jButtonVerFormResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesResponsables")) {
				jButtonNuevoResponsablesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarResponsables")) {
				jButtonModificarResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarResponsables")) {
				jButtonActualizarResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarResponsables")) {
				jButtonEliminarResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarResponsables")) {
				jButtonCancelarResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarResponsables")) {
				jButtonCerrarResponsablesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosResponsables")) {
				jButtonGuardarCambiosResponsablesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosResponsables")) {
				jButtonNuevoGuardarCambiosResponsablesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByResponsables")) {
				jButtonAbrirOrderByResponsablesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionResponsables")) {
				jButtonRecargarInformacionResponsablesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresResponsables")) {
				jButtonAnterioresResponsablesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesResponsables")) {
				jButtonSiguientesResponsablesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idResponsablesBusqueda")) {
				this.jButtonidResponsablesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaResponsablesUpdate")) {
				this.jButtonid_empresaResponsablesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaResponsablesBusqueda")) {
				this.jButtonid_empresaResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_empleadoResponsablesBusqueda")) {
				this.jButtoncodigo_empleadoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empleadoResponsablesBusqueda")) {
				this.jButtonnombre_empleadoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellido_empleadoResponsablesBusqueda")) {
				this.jButtonapellido_empleadoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_estructuraResponsablesBusqueda")) {
				this.jButtonnombre_estructuraResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ubicacionResponsablesBusqueda")) {
				this.jButtonubicacionResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaResponsablesBusqueda")) {
				this.jButtonfechaResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionResponsablesBusqueda")) {
				this.jButtondescripcionResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreResponsablesBusqueda")) {
				this.jButtonnombreResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveResponsablesBusqueda")) {
				this.jButtonclaveResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoResponsablesBusqueda")) {
				this.jButtoncodigo_sub_grupoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoResponsablesBusqueda")) {
				this.jButtonnombre_sub_grupoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoResponsablesBusqueda")) {
				this.jButtoncodigo_detalle_grupoResponsablesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoResponsablesBusqueda")) {
				this.jButtonnombre_detalle_grupoResponsablesBusquedaActionPerformed(evt);
			}
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessResponsables();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameResponsables")) {
				closingInternalFrameResponsables();
				
			} else if(sTipo.equals("jButtonCancelarResponsables")) {
				JInternalFrameBase jInternalFrameDetalleFormResponsables = (JInternalFrameBase)evt.getSource();
	            	
	            ResponsablesBeanSwingJInternalFrame jInternalFrameParent=(ResponsablesBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsables.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarResponsablesActionPerformed(null);
			}
			
			ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.responsables,new Object(),this.responsablesParameterGeneral,this.responsablesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormResponsables(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormResponsables(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormResponsables(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.responsables)) {
			if(!esControlTabla) {
				if(ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);			
				}
				
				if(this.responsablesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualResponsables(this.responsables,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanResponsables(this.responsablesReturnGeneral,this.responsablesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.responsablesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanResponsables(classes,this.responsablesReturnGeneral,this.responsablesBean,false);
					}
						
					if(this.responsablesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyResponsables(this.responsablesReturnGeneral.getResponsables());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioResponsables(this.responsablesReturnGeneral.getResponsables());	
					}
						
					if(this.responsablesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioResponsables(this.responsablesReturnGeneral.getResponsables(),classes);//this.responsablesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioResponsables(this.responsables,classes);//this.responsablesBean);									
				}
			
				if(ResponsablesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualResponsables(this.responsables,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysResponsables(this.responsables);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.responsablesAnterior!=null) {
						this.responsables=this.responsablesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.responsablesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.responsablesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.responsablesReturnGeneral.getResponsables(),responsablesLogic.getResponsabless());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.responsablesReturnGeneral.getResponsables(),this.responsabless);
				}
				//ARCHITECTURE
				
				//this.jTableDatosResponsables.repaint();
				
				//((AbstractTableModel) this.jTableDatosResponsables.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosResponsables();
			}
		}
	}
	
	public void actualizarVisualTableDatosResponsables() throws Exception {
		
		ResponsablesModel responsablesModel=(ResponsablesModel)this.jTableDatosResponsables.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			responsablesModel.responsabless=this.responsablesLogic.getResponsabless();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			responsablesModel.responsabless=this.responsabless;
		}
		
		
		((ResponsablesModel) this.jTableDatosResponsables.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaResponsables() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getresponsablesAnterior(),this.responsablesLogic.getResponsabless());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getresponsablesAnterior(),this.responsabless);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosResponsables();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioResponsables(Responsables responsables,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
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
										
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsables,new Object(),generalEntityParameterGeneral,this.responsablesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.responsablesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ResponsablesConstantesFunciones.getClassesRelationshipsOfResponsables(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ResponsablesConstantesFunciones.getClassesRelationshipsFromStringsOfResponsables(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormResponsables(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ResponsablesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.responsables,new Object(),generalEntityParameterGeneral,this.responsablesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioResponsables(ResponsablesBean responsablesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanResponsables(ArrayList<Classe> classes,ResponsablesReturnGeneral responsablesReturnGeneral,ResponsablesBean responsablesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualResponsables(Responsables responsables,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.responsables)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormResponsables = new ResponsablesDetalleFormJInternalFrame(jDesktopPane,this.responsablesSessionBean.getConGuardarRelaciones(),this.responsablesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormResponsables);
		this.jInternalFrameDetalleFormResponsables.setVisible(false);
		this.jInternalFrameDetalleFormResponsables.setSelected(false);						
		
		this.jInternalFrameDetalleFormResponsables.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormResponsables.responsablesLogic=this.responsablesLogic;
		
		this.cargarCombosFrameForeignKeyResponsables("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleResponsables();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleResponsables();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyResponsables("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyResponsables();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormResponsables.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsables"));
		
		this.jInternalFrameDetalleFormResponsables.jButtonModificarResponsables.addActionListener(new ButtonActionListener(this,"ModificarResponsables"));

		
		this.jInternalFrameDetalleFormResponsables.jButtonModificarToolBarResponsables.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsables"));
					
		this.jInternalFrameDetalleFormResponsables.jMenuItemModificarResponsables.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsables"));		
		
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonActualizarResponsables.addActionListener (new ButtonActionListener(this,"ActualizarResponsables"));
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonActualizarToolBarResponsables.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsables"));
						
		this.jInternalFrameDetalleFormResponsables.jMenuItemActualizarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsables"));		
		
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonEliminarResponsables.addActionListener (new ButtonActionListener(this,"EliminarResponsables"));
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonEliminarToolBarResponsables.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsables"));
								
		this.jInternalFrameDetalleFormResponsables.jMenuItemEliminarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsables"));		
		
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonCancelarResponsables.addActionListener (new ButtonActionListener(this,"CancelarResponsables"));
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonCancelarToolBarResponsables.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsables"));
					
		this.jInternalFrameDetalleFormResponsables.jMenuItemCancelarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsables"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormResponsables.jMenuItemDetalleCerrarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsables"));		
		
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosToolBarResponsables.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsables"));
		
		
		
		this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosToolBarResponsables.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsables"));
		
		
		
		this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsables"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonidResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"idResponsablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsables.jButtonid_empresaResponsablesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonid_empresaResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonapellido_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"apellido_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_estructuraResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estructuraResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonubicacionResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonfechaResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"fechaResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtondescripcionResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"descripcionResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombreResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombreResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonclaveResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"claveResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_sub_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_sub_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_detalle_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_detalle_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoResponsablesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsables"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameResponsables"));
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarResponsables"));
		}
		
		this.jTableDatosResponsables.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarResponsables"));
		
		this.jTableDatosResponsables.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarResponsables"));
		
		this.jButtonNuevoResponsables.addActionListener(new ButtonActionListener(this,"NuevoResponsables"));
		
		this.jButtonDuplicarResponsables.addActionListener(new ButtonActionListener(this,"DuplicarResponsables"));
		
		this.jButtonCopiarResponsables.addActionListener(new ButtonActionListener(this,"CopiarResponsables"));
		
		this.jButtonVerFormResponsables.addActionListener(new ButtonActionListener(this,"VerFormResponsables"));
		
		
		this.jButtonNuevoToolBarResponsables.addActionListener(new ButtonActionListener(this,"NuevoToolBarResponsables"));
			
		this.jButtonDuplicarToolBarResponsables.addActionListener(new ButtonActionListener(this,"DuplicarToolBarResponsables"));
			
		this.jMenuItemNuevoResponsables.addActionListener (new ButtonActionListener(this,"MenuItemNuevoResponsables"));
			
		this.jMenuItemDuplicarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarResponsables"));		
		
		
		this.jButtonNuevoRelacionesResponsables.addActionListener (new ButtonActionListener(this,"NuevoRelacionesResponsables"));
		
		
		this.jButtonNuevoRelacionesToolBarResponsables.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarResponsables"));
			
		this.jMenuItemNuevoRelacionesResponsables.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesResponsables"));		
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonModificarResponsables.addActionListener(new ButtonActionListener(this,"ModificarResponsables"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonModificarToolBarResponsables.addActionListener(new ButtonActionListener(this,"ModificarToolBarResponsables"));
			
			this.jInternalFrameDetalleFormResponsables.jMenuItemModificarResponsables.addActionListener(new ButtonActionListener(this,"MenuItemModificarResponsables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormResponsables.jButtonActualizarResponsables.addActionListener (new ButtonActionListener(this,"ActualizarResponsables"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonActualizarToolBarResponsables.addActionListener(new ButtonActionListener(this,"ActualizarToolBarResponsables"));
				
			this.jInternalFrameDetalleFormResponsables.jMenuItemActualizarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemActualizarResponsables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonEliminarResponsables.addActionListener (new ButtonActionListener(this,"EliminarResponsables"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonEliminarToolBarResponsables.addActionListener (new ButtonActionListener(this,"EliminarToolBarResponsables"));
						
			this.jInternalFrameDetalleFormResponsables.jMenuItemEliminarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemEliminarResponsables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonCancelarResponsables.addActionListener (new ButtonActionListener(this,"CancelarResponsables"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonCancelarToolBarResponsables.addActionListener (new ButtonActionListener(this,"CancelarToolBarResponsables"));
			
			this.jInternalFrameDetalleFormResponsables.jMenuItemCancelarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemCancelarResponsables"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarResponsables.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarResponsables"));		
		
		
		this.jButtonCerrarResponsables.addActionListener (new ButtonActionListener(this,"CerrarResponsables"));
		
		
		this.jButtonCerrarToolBarResponsables.addActionListener (new ButtonActionListener(this,"CerrarToolBarResponsables"));
			
		this.jMenuItemCerrarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemCerrarResponsables"));
			
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jMenuItemDetalleCerrarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarResponsables"));		
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.addActionListener (new ButtonActionListener(this,"GuardarCambiosResponsables"));
		}
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosToolBarResponsables.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarResponsables"));
		}
		
		this.jButtonCopiarToolBarResponsables.addActionListener (new ButtonActionListener(this,"CopiarToolBarResponsables"));
			
		this.jButtonVerFormToolBarResponsables.addActionListener (new ButtonActionListener(this,"VerFormToolBarResponsables"));
		
		this.jMenuItemGuardarCambiosResponsables.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosResponsables"));
			
		this.jMenuItemCopiarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemCopiarResponsables"));		
		
		this.jMenuItemVerFormResponsables.addActionListener (new ButtonActionListener(this,"MenuItemVerFormResponsables"));		
		
		
		this.jButtonGuardarCambiosTablaResponsables.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsables"));
		
		
		this.jButtonGuardarCambiosTablaToolBarResponsables.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarResponsables"));
			
		this.jMenuItemGuardarCambiosTablaResponsables.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaResponsables"));		
		
		
		
		this.jButtonRecargarInformacionResponsables.addActionListener (new ButtonActionListener(this,"RecargarInformacionResponsables"));
					
		this.jButtonRecargarInformacionToolBarResponsables.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarResponsables"));
		
		this.jMenuItemRecargarInformacionResponsables.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionResponsables"));		
		
		
		
		this.jButtonAnterioresResponsables.addActionListener (new ButtonActionListener(this,"AnterioresResponsables"));
		
		
		this.jButtonAnterioresToolBarResponsables.addActionListener (new ButtonActionListener(this,"AnterioresToolBarResponsables"));
		
		this.jMenuItemAnterioresResponsables.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresResponsables"));		
		
		
		this.jButtonSiguientesResponsables.addActionListener (new ButtonActionListener(this,"SiguientesResponsables"));
		
		
		this.jButtonSiguientesToolBarResponsables.addActionListener (new ButtonActionListener(this,"SiguientesToolBarResponsables"));
			
		this.jMenuItemSiguientesResponsables.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesResponsables"));
			
		this.jMenuItemAbrirOrderByResponsables.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByResponsables"));
			
		this.jMenuItemMostrarOcultarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarResponsables"));
			
		this.jMenuItemDetalleAbrirOrderByResponsables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByResponsables"));
			
		this.jMenuItemDetalleMostarOcultarResponsables.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarResponsables"));		
		
		
		this.jButtonNuevoGuardarCambiosResponsables.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosResponsables"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarResponsables.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarResponsables"));
			
		this.jMenuItemNuevoGuardarCambiosResponsables.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosResponsables"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosResponsables.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosResponsables"));

		this.jCheckBoxSeleccionadosResponsables.addItemListener(new CheckBoxItemListener(this,"SeleccionadosResponsables"));
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioResponsables"));
		}
		
		
		this.jComboBoxTiposRelacionesResponsables.addActionListener (new ButtonActionListener(this,"TiposRelacionesResponsables"));
			
		this.jComboBoxTiposAccionesResponsables.addActionListener (new ButtonActionListener(this,"TiposAccionesResponsables"));
					
		this.jComboBoxTiposSeleccionarResponsables.addActionListener (new ButtonActionListener(this,"TiposSeleccionarResponsables"));
			
		this.jTextFieldValorCampoGeneralResponsables.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralResponsables"));		
		
		
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonidResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"idResponsablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsables.jButtonid_empresaResponsablesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonid_empresaResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonapellido_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"apellido_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_estructuraResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estructuraResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonubicacionResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonfechaResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"fechaResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtondescripcionResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"descripcionResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombreResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombreResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonclaveResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"claveResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_sub_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_sub_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_detalle_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_detalle_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoResponsablesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaResponsablesResponsables.addActionListener(new ButtonActionListener(this,"BusquedaResponsablesResponsables"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoResponsables!=null) {
				this.jInternalFrameReporteDinamicoResponsables.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsables"));
				this.jInternalFrameReporteDinamicoResponsables.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsables"));
				this.jInternalFrameReporteDinamicoResponsables.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsables"));
			}
			
			//this.jButtonCerrarReporteDinamicoResponsables.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoResponsables"));				
			//this.jButtonGenerarReporteDinamicoResponsables.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoResponsables"));
			//this.jButtonGenerarExcelReporteDinamicoResponsables.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoResponsables"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionResponsables!=null) {
				this.jInternalFrameImportacionResponsables.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionResponsables"));
				this.jInternalFrameImportacionResponsables.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionResponsables"));
				this.jInternalFrameImportacionResponsables.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionResponsables"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByResponsables.addActionListener (new ButtonActionListener(this,"AbrirOrderByResponsables"));
			
			this.jButtonAbrirOrderByToolBarResponsables.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarResponsables"));			
			
			if(this.jInternalFrameOrderByResponsables!=null) {
				this.jInternalFrameOrderByResponsables.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByResponsables"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormResponsables!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormResponsables.jTabbedPaneRelacionesResponsables.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesResponsables"));
		
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
            		closingInternalFrameResponsables();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormResponsables.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormResponsables = (JInternalFrameBase)event.getSource();
	            	
	            ResponsablesBeanSwingJInternalFrame jInternalFrameParent=(ResponsablesBeanSwingJInternalFrame)jInternalFrameDetalleFormResponsables.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarResponsablesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosResponsables.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosResponsablesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosResponsables.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosResponsables.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsablesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsablesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsablesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoResponsables";
		inputMap = this.jButtonNuevoResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsablesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsablesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsablesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoResponsablesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesResponsables";
		inputMap = this.jButtonNuevoRelacionesResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoResponsablesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarResponsables";
		inputMap = this.jButtonModificarResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarResponsablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarResponsables";
		inputMap = this.jButtonActualizarResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarResponsablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarResponsables";
		inputMap = this.jButtonEliminarResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarResponsablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarResponsables";
		inputMap = this.jButtonCancelarResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarResponsablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarResponsables";
		inputMap = this.jButtonCerrarResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarResponsablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosResponsables";
		inputMap = this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormResponsables.jButtonGuardarCambiosResponsables.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosResponsablesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosResponsables.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosResponsablesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesResponsables.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesResponsablesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarResponsables.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarResponsablesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralResponsables.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralResponsablesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonidResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"idResponsablesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormResponsables.jButtonid_empresaResponsablesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaResponsablesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonid_empresaResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonapellido_empleadoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"apellido_empleadoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_estructuraResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_estructuraResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonubicacionResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"ubicacionResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonfechaResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"fechaResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtondescripcionResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"descripcionResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombreResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombreResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonclaveResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"claveResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_sub_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_sub_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtoncodigo_detalle_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoResponsablesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormResponsables.jButtonnombre_detalle_grupoResponsablesBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoResponsablesBusqueda"));
		
		
		this.jButtonBusquedaResponsablesResponsables.addActionListener(new ButtonActionListener(this,"BusquedaResponsablesResponsables"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionResponsables.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionResponsablesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarResponsablesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarResponsables.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosResponsables(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
					responsablesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsables responsablesAux:responsabless) {
					responsablesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosResponsablesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsables(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
						responsablesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Responsables responsablesAux:responsabless) {
						responsablesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Responsables responsablesAux:responsabless) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaResponsables(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsables.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsables.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsables,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosResponsablesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingResponsables(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosResponsables.getSelectedRows();
			
			Responsables responsablesLocal=new Responsables();
			
			//this.seleccionarTodosResponsables(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					responsablesLocal =(Responsables) this.responsablesLogic.getResponsabless().toArray()[this.jTableDatosResponsables.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					responsablesLocal =(Responsables) this.responsabless.toArray()[this.jTableDatosResponsables.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				responsablesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
						responsablesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Responsables responsablesAux:responsabless) {
						responsablesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaResponsables(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosResponsables.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosResponsables.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosResponsables,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualResponsablesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarResponsablesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralResponsablesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingResponsables(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralResponsables.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Responsables responsablesAux:this.responsablesLogic.getResponsabless()) {
				
						if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO)) {
							existe=true;
							responsablesAux.setcodigo_empleado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO)) {
							existe=true;
							responsablesAux.setnombre_empleado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO)) {
							existe=true;
							responsablesAux.setapellido_empleado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA)) {
							existe=true;
							responsablesAux.setnombre_estructura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							responsablesAux.setubicacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							responsablesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							responsablesAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							responsablesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							responsablesAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							responsablesAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							responsablesAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							responsablesAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							responsablesAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsables responsablesAux:responsabless) {
					
						if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO)) {
							existe=true;
							responsablesAux.setcodigo_empleado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO)) {
							existe=true;
							responsablesAux.setnombre_empleado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO)) {
							existe=true;
							responsablesAux.setapellido_empleado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA)) {
							existe=true;
							responsablesAux.setnombre_estructura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_UBICACION)) {
							existe=true;
							responsablesAux.setubicacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							responsablesAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							responsablesAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							responsablesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							responsablesAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							responsablesAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							responsablesAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							responsablesAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							responsablesAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaResponsables(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesResponsablesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingResponsables(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioResponsables=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesResponsables.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteResponsables) {				
					conSplash=true;//false;										
					
					//this.startProcessResponsables(conSplash);
				
					this.generarReporteResponsablessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoResponsablessSeleccionados();
				//this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsablessSeleccionados(false);
				//this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoResponsablessSeleccionados(true);
				//this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsables();
				
				this.exportarResponsablessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionResponsabless();
				//this.importarResponsabless();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessResponsables();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelResponsablessSeleccionados();
				//this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Responsables", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessResponsables();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoResponsables)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyResponsables(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.setSelectedIndex(0);					
				}	
			} 			
			else if(ResponsablesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteResponsables) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessResponsables(conSplash);
					
						//this.actualizarParametrosGeneralResponsables();
						
						this.generarReporteProcesoAccionResponsablessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ResponsablesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ResponsablesES SELECCIONADOS?", "MANTENIMIENTO DE Responsables", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessResponsables();
				
						this.actualizarParametrosGeneralResponsables();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.responsablesReturnGeneral=responsablesLogic.procesarAccionResponsablessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.responsablesLogic.getResponsabless(),this.responsablesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarResponsablesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralResponsables();
					
					ResponsablesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarResponsablesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesResponsables.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormResponsables.jComboBoxTiposAccionesFormularioResponsables.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessResponsables(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesResponsablesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessResponsables();
			
			if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
			Responsables responsables=new Responsables();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingResponsables(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesResponsables.getSelectedItem();
			
			
			
			
			responsablessSeleccionados=this.getResponsablessSeleccionados(true);
			//this.sTipoAccion;
			
			if(responsablessSeleccionados.size()==1) {
				for(Responsables responsablesAux:responsablessSeleccionados) {
					responsables=responsablesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessResponsables();
			
      		//this.finishProcessResponsables(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarResponsablesReturnGeneral() throws Exception {
		if(this.responsablesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.responsablesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.responsablesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.responsablesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.responsablesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.responsablesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingResponsables(false);
		}
		
		if(this.responsablesReturnGeneral.getConRetornoLista() || this.responsablesReturnGeneral.getConRetornoObjeto()) {
			if(this.responsablesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.responsablesLogic.setResponsabless(this.responsablesReturnGeneral.getResponsabless());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingResponsables(false);
		}
	}
	
	public void actualizarParametrosGeneralResponsables() throws Exception {
		
		
	}
	
	public ArrayList<Responsables> getResponsablessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioResponsables) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Responsables responsablesAux:responsablesLogic.getResponsabless()) {
					if(responsablesAux.getIsSelected()) {
						responsablessSeleccionados.add(responsablesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Responsables responsablesAux:this.responsabless) {
					if(responsablesAux.getIsSelected()) {
						responsablessSeleccionados.add(responsablesAux);				
					}
				}
			}
			
			if(responsablessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						responsablessSeleccionados.addAll(this.responsablesLogic.getResponsabless());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						responsablessSeleccionados.addAll(this.responsabless);				
					}
				}
			}
		} else {
			responsablessSeleccionados.add(this.responsables);
		}
		
		return responsablessSeleccionados;
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
	
	public void generarReporteResponsablessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalResponsablessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoResponsablessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsablessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoResponsablessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Responsables",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesResponsablessSeleccionados() throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteResponsabless("Todos",responsablessSeleccionados);
		
	}	
	
	public void generarReporteNormalResponsablessSeleccionados() throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteResponsabless("Todos",responsablessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionResponsablessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteResponsabless("Todos",responsablessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoResponsablessSeleccionados() throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
		
		
		this.abrirInicializarFrameReporteDinamicoResponsables();
		
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoResponsables();
		
		
		//this.generarReporteResponsabless("Todos",responsablessSeleccionados ,responsablesImplementable,responsablesImplementableHome);
	}
	
	public void mostrarImportacionResponsabless() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionResponsables();
		
		this.abrirFrameImportacionResponsables();		
		
			
		//this.generarReporteResponsabless("Todos",responsablessSeleccionados ,responsablesImplementable,responsablesImplementableHome);
	}
	
	public void importarResponsabless() throws Exception {		
	
	}
	
	public void exportarResponsablessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelResponsablessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoResponsablessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlResponsablessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Responsables",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoResponsablessSeleccionados() throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsables."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarResponsables(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Responsables responsablesAux:responsablessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarResponsables(responsablesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//responsablesAux.setsDetalleGeneralEntityReporte(responsablesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarResponsables(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_UBICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarResponsables(Responsables responsables,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=responsables.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getcodigo_empleado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getnombre_empleado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getapellido_empleado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getnombre_estructura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getubicacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=responsables.getnombre_detalle_grupo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelResponsablessSeleccionados() throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsables.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Responsabless");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelResponsables(row);				
				iRow++;
			}				
			
			for(Responsables responsablesAux:responsablessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelResponsables(responsablesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlResponsablessSeleccionados() throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();		
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"responsables.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("responsabless");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("responsables");
			//elementRoot.appendChild(element);
		
			for(Responsables responsablesAux:responsablessSeleccionados) {
				element = document.createElement("responsables");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlResponsables(responsablesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.responsablesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Responsables",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelResponsables(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_UBICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelResponsables(Responsables responsables,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getcodigo_empleado());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getnombre_empleado());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getapellido_empleado());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getnombre_estructura());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getubicacion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(responsables.getnombre_detalle_grupo());				
	}
	
	public void setFilaDatosExportarXmlResponsables(Responsables responsables,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ResponsablesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(responsables.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ResponsablesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(responsables.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ResponsablesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(responsables.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo_empleado = document.createElement(ResponsablesConstantesFunciones.CODIGOEMPLEADO);
		elementcodigo_empleado.appendChild(document.createTextNode(responsables.getcodigo_empleado().trim()));
		element.appendChild(elementcodigo_empleado);

		Element elementnombre_empleado = document.createElement(ResponsablesConstantesFunciones.NOMBREEMPLEADO);
		elementnombre_empleado.appendChild(document.createTextNode(responsables.getnombre_empleado().trim()));
		element.appendChild(elementnombre_empleado);

		Element elementapellido_empleado = document.createElement(ResponsablesConstantesFunciones.APELLIDOEMPLEADO);
		elementapellido_empleado.appendChild(document.createTextNode(responsables.getapellido_empleado().trim()));
		element.appendChild(elementapellido_empleado);

		Element elementnombre_estructura = document.createElement(ResponsablesConstantesFunciones.NOMBREESTRUCTURA);
		elementnombre_estructura.appendChild(document.createTextNode(responsables.getnombre_estructura().trim()));
		element.appendChild(elementnombre_estructura);

		Element elementubicacion = document.createElement(ResponsablesConstantesFunciones.UBICACION);
		elementubicacion.appendChild(document.createTextNode(responsables.getubicacion().trim()));
		element.appendChild(elementubicacion);

		Element elementfecha = document.createElement(ResponsablesConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(responsables.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdescripcion = document.createElement(ResponsablesConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(responsables.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementnombre = document.createElement(ResponsablesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(responsables.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementclave = document.createElement(ResponsablesConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(responsables.getclave().trim()));
		element.appendChild(elementclave);

		Element elementcodigo_sub_grupo = document.createElement(ResponsablesConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(responsables.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(ResponsablesConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(responsables.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(ResponsablesConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(responsables.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(ResponsablesConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(responsables.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);
	}
	
	public void generarReporteGroupGenericoResponsablessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Responsables> responsablessSeleccionados=new ArrayList<Responsables>();
		
		responsablessSeleccionados=this.getResponsablessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoResponsables(responsablessSeleccionados);
		
		this.generarReporteResponsabless("Todos",responsablessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoResponsables(ArrayList<Responsables> responsablessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Responsables responsablesAux:responsablessSeleccionados) {
				responsablesAux.setsDetalleGeneralEntityReporte(responsablesAux.toString());
			
				if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGOEMPLEADO)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getcodigo_empleado());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREEMPLEADO)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getnombre_empleado());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_APELLIDOEMPLEADO)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getapellido_empleado());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREESTRUCTURA)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getnombre_estructura());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_UBICACION)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getubicacion());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(responsablesAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ResponsablesConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					responsablesAux.setsDescripcionGeneralEntityReporte1(responsablesAux.getnombre_detalle_grupo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ResponsablesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesResponsables(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoResponsables=true;
				this.isVisibilidadCeldaNuevoRelacionesResponsables=true;
				this.isVisibilidadCeldaGuardarCambiosResponsables=true;
			}
			
			this.isVisibilidadCeldaModificarResponsables=false;
			this.isVisibilidadCeldaActualizarResponsables=false;
			this.isVisibilidadCeldaEliminarResponsables=false;
			this.isVisibilidadCeldaCancelarResponsables=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsables=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsables=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoResponsables=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
			this.isVisibilidadCeldaGuardarCambiosResponsables=false;
			this.isVisibilidadCeldaModificarResponsables=false;
			this.isVisibilidadCeldaActualizarResponsables=true;
			this.isVisibilidadCeldaEliminarResponsables=false;
			this.isVisibilidadCeldaCancelarResponsables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsables=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsables=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoResponsables=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
			this.isVisibilidadCeldaGuardarCambiosResponsables=false;
			this.isVisibilidadCeldaModificarResponsables=false;
			this.isVisibilidadCeldaActualizarResponsables=true;
			this.isVisibilidadCeldaEliminarResponsables=true;
			this.isVisibilidadCeldaCancelarResponsables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsables=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsables=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoResponsables=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
			this.isVisibilidadCeldaGuardarCambiosResponsables=false;
			this.isVisibilidadCeldaModificarResponsables=false;
			this.isVisibilidadCeldaActualizarResponsables=true;
			this.isVisibilidadCeldaEliminarResponsables=false;
			this.isVisibilidadCeldaCancelarResponsables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsables=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsables=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoResponsables=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=true;
			this.isVisibilidadCeldaGuardarCambiosResponsables=true;
			this.isVisibilidadCeldaModificarResponsables=false;
			this.isVisibilidadCeldaActualizarResponsables=false;
			this.isVisibilidadCeldaEliminarResponsables=false;
			this.isVisibilidadCeldaCancelarResponsables=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsables=true;
				} else {
					this.isVisibilidadCeldaGuardarResponsables=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoResponsables=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
			this.isVisibilidadCeldaGuardarCambiosResponsables=false;
			this.isVisibilidadCeldaActualizarResponsables=false;
			this.isVisibilidadCeldaEliminarResponsables=false;
			this.isVisibilidadCeldaCancelarResponsables=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsables=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsables=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoResponsables=false;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
			this.isVisibilidadCeldaGuardarCambiosResponsables=false;
			this.isVisibilidadCeldaModificarResponsables=true;
			this.isVisibilidadCeldaActualizarResponsables=false;
			this.isVisibilidadCeldaEliminarResponsables=false;
			this.isVisibilidadCeldaCancelarResponsables=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarResponsables=false;
				} else {
					this.isVisibilidadCeldaGuardarResponsables=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ResponsablesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoResponsables=true;
			this.isVisibilidadCeldaNuevoRelacionesResponsables=true;
			this.isVisibilidadCeldaGuardarCambiosResponsables=true;
		} else {
			this.actualizarEstadoPanelsResponsables(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarResponsables=false;
			//this.isVisibilidadCeldaVerFormResponsables=false;
			this.isVisibilidadCeldaDuplicarResponsables=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!responsablesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
		} else {
			this.isVisibilidadCeldaNuevoResponsables=false;
			this.isVisibilidadCeldaGuardarCambiosResponsables=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(responsablesSessionBean.getEsGuardarRelacionado()) {
			if(!responsablesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesResponsables=false;												
			}
			
			this.jButtonCerrarResponsables.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
		}
		
		if(!this.permiteMantenimiento(this.responsables)) {
			this.isVisibilidadCeldaActualizarResponsables=false;
			this.isVisibilidadCeldaEliminarResponsables=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoResponsables=false;
		this.isVisibilidadCeldaNuevoRelacionesResponsables=false;
		this.isVisibilidadCeldaGuardarCambiosResponsables=false;
		//this.isVisibilidadCeldaModificarResponsables=true;
		this.isVisibilidadCeldaActualizarResponsables=false;
		this.isVisibilidadCeldaEliminarResponsables=false;
		//this.isVisibilidadCeldaCancelarResponsables=true;			
		this.isVisibilidadCeldaGuardarResponsables=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesResponsables() {
	}
	
	public void actualizarEstadoPanelsResponsables(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionResponsables!=null) {
				this.jScrollPanelDatosEdicionResponsables.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsables!=null) {
				this.jScrollPanelDatosResponsables.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsables!=null) {
				this.jPanelPaginacionResponsables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionResponsables!=null) {
				this.jScrollPanelDatosEdicionResponsables.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosResponsables!=null) {
				this.jScrollPanelDatosResponsables.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsables!=null) {
				this.jPanelPaginacionResponsables.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionResponsables!=null) {
				this.jScrollPanelDatosEdicionResponsables.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsables!=null) {
				this.jScrollPanelDatosResponsables.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsables!=null) {
				this.jPanelPaginacionResponsables.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionResponsables!=null) {
				this.jScrollPanelDatosEdicionResponsables.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosResponsables!=null) {
				this.jScrollPanelDatosResponsables.setVisible(false);
			}
			
			if(this.jPanelPaginacionResponsables!=null) {
				this.jPanelPaginacionResponsables.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionResponsables!=null) {
				this.jScrollPanelDatosEdicionResponsables.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsables!=null) {
				this.jScrollPanelDatosResponsables.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsables!=null) {
				this.jPanelPaginacionResponsables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionResponsables!=null) {
				this.jScrollPanelDatosEdicionResponsables.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsables!=null) {
				this.jScrollPanelDatosResponsables.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsables!=null) {
				this.jPanelPaginacionResponsables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionResponsables!=null) {
				this.jScrollPanelDatosEdicionResponsables.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosResponsables!=null) {
				this.jScrollPanelDatosResponsables.setVisible(true);
			}
			
			if(this.jPanelPaginacionResponsables!=null) {
				this.jPanelPaginacionResponsables.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.responsablesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasResponsables!=null) {
					this.jTabbedPaneBusquedasResponsables.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.responsablesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasResponsables!=null) {
				this.jTabbedPaneBusquedasResponsables.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesResponsables!=null) {
				this.jPanelParametrosReportesResponsables.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaResponsables=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaResponsables) {this.jTabbedPaneBusquedasResponsables.remove(jPanelBusquedaResponsablesResponsables);}
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
			
			this.inicializarActualizarBindingTablaResponsables(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioResponsables() {
		this.updateBorderResaltarBusquedasFormularioResponsables();
		this.updateVisibilidadBusquedasFormularioResponsables();
		this.updateHabilitarBusquedasFormularioResponsables();
	}
	
	public void updateBorderResaltarBusquedasFormularioResponsables() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasResponsables.getComponents().length>0) {
	

		if(this.responsablesConstantesFunciones.resaltarBusquedaResponsablesResponsables!=null) {
			index= this.jTabbedPaneBusquedasResponsables.indexOfComponent(this.jPanelBusquedaResponsablesResponsables);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsables.getComponent(index);
				jPanel.setBorder(this.responsablesConstantesFunciones.resaltarBusquedaResponsablesResponsables);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioResponsables() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasResponsables.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsables.indexOfComponent(this.jPanelBusquedaResponsablesResponsables);
			jPanel=(JPanel)this.jTabbedPaneBusquedasResponsables.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.responsablesConstantesFunciones.mostrarBusquedaResponsablesResponsables);
			if(!this.responsablesConstantesFunciones.mostrarBusquedaResponsablesResponsables && index>-1) {
				this.jTabbedPaneBusquedasResponsables.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioResponsables() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasResponsables.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasResponsables.indexOfComponent(this.jPanelBusquedaResponsablesResponsables);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasResponsables.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.responsablesConstantesFunciones.activarBusquedaResponsablesResponsables);
				this.jTabbedPaneBusquedasResponsables.setEnabledAt(index,this.responsablesConstantesFunciones.activarBusquedaResponsablesResponsables);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaResponsables(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaResponsables")) {
			index= this.jTabbedPaneBusquedasResponsables.indexOfComponent(this.jPanelBusquedaResponsablesResponsables);

			this.jTabbedPaneBusquedasResponsables.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasResponsables.getComponent(index);

			this.responsablesConstantesFunciones.setResaltarBusquedaResponsablesResponsables(resaltar);

			jPanel.setBorder(this.responsablesConstantesFunciones.resaltarBusquedaResponsablesResponsables);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarResponsables.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioResponsables() throws Exception {

		if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioResponsables();
		this.updateVisibilidadResaltarControlesFormularioResponsables();
		this.updateHabilitarResaltarControlesFormularioResponsables();
		
	}
	
	public void updateBorderResaltarControlesFormularioResponsables() throws Exception {
		if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.responsablesConstantesFunciones.resaltaridResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.setBorder(this.responsablesConstantesFunciones.resaltaridResponsables);}
		if(this.responsablesConstantesFunciones.resaltarid_empresaResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setBorder(this.responsablesConstantesFunciones.resaltarid_empresaResponsables);}
		if(this.responsablesConstantesFunciones.resaltarcodigo_empleadoResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.setBorder(this.responsablesConstantesFunciones.resaltarcodigo_empleadoResponsables);}
		if(this.responsablesConstantesFunciones.resaltarnombre_empleadoResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.setBorder(this.responsablesConstantesFunciones.resaltarnombre_empleadoResponsables);}
		if(this.responsablesConstantesFunciones.resaltarapellido_empleadoResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.setBorder(this.responsablesConstantesFunciones.resaltarapellido_empleadoResponsables);}
		if(this.responsablesConstantesFunciones.resaltarnombre_estructuraResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.setBorder(this.responsablesConstantesFunciones.resaltarnombre_estructuraResponsables);}
		if(this.responsablesConstantesFunciones.resaltarubicacionResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.setBorder(this.responsablesConstantesFunciones.resaltarubicacionResponsables);}
		if(this.responsablesConstantesFunciones.resaltarfechaResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.setBorder(this.responsablesConstantesFunciones.resaltarfechaResponsables);}
		if(this.responsablesConstantesFunciones.resaltardescripcionResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.setBorder(this.responsablesConstantesFunciones.resaltardescripcionResponsables);}
		if(this.responsablesConstantesFunciones.resaltarnombreResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.setBorder(this.responsablesConstantesFunciones.resaltarnombreResponsables);}
		if(this.responsablesConstantesFunciones.resaltarclaveResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.setBorder(this.responsablesConstantesFunciones.resaltarclaveResponsables);}
		if(this.responsablesConstantesFunciones.resaltarcodigo_sub_grupoResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.setBorder(this.responsablesConstantesFunciones.resaltarcodigo_sub_grupoResponsables);}
		if(this.responsablesConstantesFunciones.resaltarnombre_sub_grupoResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.setBorder(this.responsablesConstantesFunciones.resaltarnombre_sub_grupoResponsables);}
		if(this.responsablesConstantesFunciones.resaltarcodigo_detalle_grupoResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.setBorder(this.responsablesConstantesFunciones.resaltarcodigo_detalle_grupoResponsables);}
		if(this.responsablesConstantesFunciones.resaltarnombre_detalle_grupoResponsables!=null && this.jInternalFrameDetalleFormResponsables!=null) {this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.setBorder(this.responsablesConstantesFunciones.resaltarnombre_detalle_grupoResponsables);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioResponsables() throws Exception {		
		if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
	
		//this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.setVisible(this.responsablesConstantesFunciones.mostraridResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelidResponsables.setVisible(this.responsablesConstantesFunciones.mostraridResponsables);
		//this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setVisible(this.responsablesConstantesFunciones.mostrarid_empresaResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelid_empresaResponsables.setVisible(this.responsablesConstantesFunciones.mostrarid_empresaResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarcodigo_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelcodigo_empleadoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarcodigo_empleadoResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelnombre_empleadoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_empleadoResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarapellido_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelapellido_empleadoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarapellido_empleadoResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_estructuraResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelnombre_estructuraResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_estructuraResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.setVisible(this.responsablesConstantesFunciones.mostrarubicacionResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelubicacionResponsables.setVisible(this.responsablesConstantesFunciones.mostrarubicacionResponsables);
		//this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.setVisible(this.responsablesConstantesFunciones.mostrarfechaResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelfechaResponsables.setVisible(this.responsablesConstantesFunciones.mostrarfechaResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.setVisible(this.responsablesConstantesFunciones.mostrardescripcionResponsables);
		this.jInternalFrameDetalleFormResponsables.jPaneldescripcionResponsables.setVisible(this.responsablesConstantesFunciones.mostrardescripcionResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombreResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelnombreResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombreResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.setVisible(this.responsablesConstantesFunciones.mostrarclaveResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelclaveResponsables.setVisible(this.responsablesConstantesFunciones.mostrarclaveResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarcodigo_sub_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelcodigo_sub_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarcodigo_sub_grupoResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_sub_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelnombre_sub_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_sub_grupoResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarcodigo_detalle_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelcodigo_detalle_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarcodigo_detalle_grupoResponsables);
		//this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_detalle_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jPanelnombre_detalle_grupoResponsables.setVisible(this.responsablesConstantesFunciones.mostrarnombre_detalle_grupoResponsables);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioResponsables() throws Exception {
		if(this.jInternalFrameDetalleFormResponsables==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormResponsables!=null) {
	
		this.jInternalFrameDetalleFormResponsables.jLabelidResponsables.setEnabled(this.responsablesConstantesFunciones.activaridResponsables);
		this.jInternalFrameDetalleFormResponsables.jComboBoxid_empresaResponsables.setEnabled(this.responsablesConstantesFunciones.activarid_empresaResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_empleadoResponsables.setEnabled(this.responsablesConstantesFunciones.activarcodigo_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_empleadoResponsables.setEnabled(this.responsablesConstantesFunciones.activarnombre_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreaapellido_empleadoResponsables.setEnabled(this.responsablesConstantesFunciones.activarapellido_empleadoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_estructuraResponsables.setEnabled(this.responsablesConstantesFunciones.activarnombre_estructuraResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreaubicacionResponsables.setEnabled(this.responsablesConstantesFunciones.activarubicacionResponsables);
		this.jInternalFrameDetalleFormResponsables.jDateChooserfechaResponsables.setEnabled(this.responsablesConstantesFunciones.activarfechaResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreadescripcionResponsables.setEnabled(this.responsablesConstantesFunciones.activardescripcionResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombreResponsables.setEnabled(this.responsablesConstantesFunciones.activarnombreResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextFieldclaveResponsables.setEnabled(this.responsablesConstantesFunciones.activarclaveResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_sub_grupoResponsables.setEnabled(this.responsablesConstantesFunciones.activarcodigo_sub_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_sub_grupoResponsables.setEnabled(this.responsablesConstantesFunciones.activarnombre_sub_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextFieldcodigo_detalle_grupoResponsables.setEnabled(this.responsablesConstantesFunciones.activarcodigo_detalle_grupoResponsables);
		this.jInternalFrameDetalleFormResponsables.jTextAreanombre_detalle_grupoResponsables.setEnabled(this.responsablesConstantesFunciones.activarnombre_detalle_grupoResponsables);
		}
	}
	
		
}