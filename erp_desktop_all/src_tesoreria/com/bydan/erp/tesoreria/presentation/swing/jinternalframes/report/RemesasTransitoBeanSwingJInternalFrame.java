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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.RemesasTransitoConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.RemesasTransitoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.RemesasTransitoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.RemesasTransitoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class RemesasTransitoBeanSwingJInternalFrame extends RemesasTransitoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RemesasTransitoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RemesasTransito> remesastransitoValidator = new ClassValidator<RemesasTransito>(RemesasTransito.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RemesasTransito remesastransito;	
	public RemesasTransito remesastransitoAux;
	public RemesasTransito remesastransitoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RemesasTransito remesastransitoTotales;
	public Long idRemesasTransitoActual;
	public Long iIdNuevoRemesasTransito=0L;
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
	
	public Boolean isPermisoTodoRemesasTransito;
	public Boolean isPermisoNuevoRemesasTransito;
	public Boolean isPermisoActualizarRemesasTransito;
	public Boolean isPermisoActualizarOriginalRemesasTransito;
	public Boolean isPermisoEliminarRemesasTransito;
	public Boolean isPermisoGuardarCambiosRemesasTransito;
	public Boolean isPermisoConsultaRemesasTransito;
	public Boolean isPermisoBusquedaRemesasTransito;
	public Boolean isPermisoReporteRemesasTransito;
	public Boolean isPermisoPaginacionMedioRemesasTransito;
	public Boolean isPermisoPaginacionAltoRemesasTransito;
	public Boolean isPermisoPaginacionTodoRemesasTransito;
	public Boolean isPermisoCopiarRemesasTransito;
	public Boolean isPermisoVerFormRemesasTransito;
	public Boolean isPermisoDuplicarRemesasTransito;
	public Boolean isPermisoOrdenRemesasTransito;
	
	
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
	
	public RemesasTransitoParameterReturnGeneral remesastransitoReturnGeneral;
	public RemesasTransitoParameterReturnGeneral remesastransitoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRemesasTransito=false;
	public Boolean esParaAccionDesdeFormularioRemesasTransito=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RemesasTransitoSessionBeanAdditional remesastransitoSessionBeanAdditional=null;
	
	public RemesasTransitoSessionBeanAdditional getRemesasTransitoSessionBeanAdditional() {
		return this.remesastransitoSessionBeanAdditional;
	}
	
	public void setRemesasTransitoSessionBeanAdditional(RemesasTransitoSessionBeanAdditional remesastransitoSessionBeanAdditional) {
		try {
			this.remesastransitoSessionBeanAdditional=remesastransitoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RemesasTransitoBeanSwingJInternalFrameAdditional remesastransitoBeanSwingJInternalFrameAdditional=null;
	//public class RemesasTransitoBeanSwingJInternalFrame
	
	public RemesasTransitoBeanSwingJInternalFrameAdditional getRemesasTransitoBeanSwingJInternalFrameAdditional() {
		return this.remesastransitoBeanSwingJInternalFrameAdditional;
	}
	
	public void setRemesasTransitoBeanSwingJInternalFrameAdditional(RemesasTransitoBeanSwingJInternalFrameAdditional remesastransitoBeanSwingJInternalFrameAdditional) {
		try {
			this.remesastransitoBeanSwingJInternalFrameAdditional=remesastransitoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RemesasTransitoLogic remesastransitoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RemesasTransito remesastransitoBean;
	public RemesasTransitoConstantesFunciones remesastransitoConstantesFunciones;
	//public RemesasTransitoParameterReturnGeneral remesastransitoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<RemesasTransito> remesastransitos;	
	//public List<RemesasTransito> remesastransitosEliminados;
	//public List<RemesasTransito> remesastransitosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRemesasTransito=false;
	public Boolean isVisibilidadCeldaDuplicarRemesasTransito=true;
	public Boolean isVisibilidadCeldaCopiarRemesasTransito=true;
	public Boolean isVisibilidadCeldaVerFormRemesasTransito=true;
	public Boolean isVisibilidadCeldaOrdenRemesasTransito=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
	public Boolean isVisibilidadCeldaModificarRemesasTransito=false;
	public Boolean isVisibilidadCeldaActualizarRemesasTransito=false;
	public Boolean isVisibilidadCeldaEliminarRemesasTransito=false;
	public Boolean isVisibilidadCeldaCancelarRemesasTransito=false;
	public Boolean isVisibilidadCeldaGuardarRemesasTransito=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRemesasTransito=false;	
	
	
	public Boolean isVisibilidadBusquedaRemesasTransito=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoRemesasTransito() {
		return this.iIdNuevoRemesasTransito;
	}

	public void setiIdNuevoRemesasTransito(Long iIdNuevoRemesasTransito) {
		this.iIdNuevoRemesasTransito = iIdNuevoRemesasTransito;
	}
	
	public Long getidRemesasTransitoActual() {
		return this.idRemesasTransitoActual;
	}

	public void setidRemesasTransitoActual(Long idRemesasTransitoActual) {
		this.idRemesasTransitoActual = idRemesasTransitoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RemesasTransito getremesastransito() {
		return this.remesastransito;
	}

	public void setremesastransito(RemesasTransito remesastransito) {
		this.remesastransito = remesastransito;
	}
	
	public RemesasTransito getremesastransitoAux() {
		return this.remesastransitoAux;
	}

	public void setremesastransitoAux(RemesasTransito remesastransitoAux) {
		this.remesastransitoAux = remesastransitoAux;
	}				
	
	public RemesasTransito getremesastransitoAnterior() {
		return this.remesastransitoAnterior;
	}

	public void setremesastransitoAnterior(RemesasTransito remesastransitoAnterior) {
		this.remesastransitoAnterior = remesastransitoAnterior;
	}	
	
	public RemesasTransito getremesastransitoTotales() {
		return this.remesastransitoTotales;
	}

	public void setremesastransitoTotales(RemesasTransito remesastransitoTotales) {
		this.remesastransitoTotales = remesastransitoTotales;
	}	
	
	public RemesasTransito getremesastransitoBean() {
		return this.remesastransitoBean;
	}

	public void setremesastransitoBean(RemesasTransito remesastransitoBean) {
		this.remesastransitoBean = remesastransitoBean;
	}	
	
	public RemesasTransitoParameterReturnGeneral getremesastransitoReturnGeneral() {
		return this.remesastransitoReturnGeneral;
	}

	public void setremesastransitoReturnGeneral(RemesasTransitoParameterReturnGeneral remesastransitoReturnGeneral) {
		this.remesastransitoReturnGeneral = remesastransitoReturnGeneral;
	}	
	
	
	public Long idBusquedaRemesasTransito=0L;

	public Long getidBusquedaRemesasTransito() {
		return this.idBusquedaRemesasTransito;
	}

	public void setidBusquedaRemesasTransito(Long idBusquedaRemesasTransito) {
		this.idBusquedaRemesasTransito = idBusquedaRemesasTransito;
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
	
	
	public RemesasTransitoLogic getRemesasTransitoLogic()	{		
		return remesastransitoLogic;
	}

	public void setRemesasTransitoLogic(RemesasTransitoLogic remesastransitoLogic) {
		this.remesastransitoLogic = remesastransitoLogic;
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
	
	public Boolean getIsEsNuevoRemesasTransito() {
		return isEsNuevoRemesasTransito;
	}

	public void setIsEsNuevoRemesasTransito(Boolean isEsNuevoRemesasTransito) {
		this.isEsNuevoRemesasTransito = isEsNuevoRemesasTransito;
	}

	public Boolean getEsParaAccionDesdeFormularioRemesasTransito() {
		return esParaAccionDesdeFormularioRemesasTransito;
	}
	
	public void setEsParaAccionDesdeFormularioRemesasTransito(Boolean esParaAccionDesdeFormularioRemesasTransito) {
		this.esParaAccionDesdeFormularioRemesasTransito = esParaAccionDesdeFormularioRemesasTransito;
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

			if(this.remesastransitoSessionBean==null) {
				this.remesastransitoSessionBean=new RemesasTransitoSessionBean();
			}

			if(!this.remesastransitoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(remesastransitoSessionBean.getlidEmpresaActual());
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

					if(this.remesastransito!=null) {
						this.remesastransito.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
						this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRemesasTransito.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
						if(this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.getItemCount()>0) {
							this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRemesasTransitoGenerico)throws Exception
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
				jComboBoxid_empresaRemesasTransitoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRemesasTransitoGenerico!=null && jComboBoxid_empresaRemesasTransitoGenerico.getItemCount()>0) {
					jComboBoxid_empresaRemesasTransitoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RemesasTransito remesastransito,JComboBox jComboBoxid_empresaRemesasTransitoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRemesasTransitoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRemesasTransitoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				remesastransito.setid_empresa(empresaAux.getId());
				remesastransito.setempresa_descripcion(RemesasTransitoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				remesastransito.setEmpresa(empresaAux);			}
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

					if(!RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRemesasTransito!=null) { 
							this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRemesasTransito!=null) { 
					}

					if(!RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
							this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
							this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesRemesasTransito() throws Exception {
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
		
	public RemesasTransitoParameterReturnGeneral getRemesasTransitoParameterGeneral() {
		return this.remesastransitoParameterGeneral;
	}
	
	public void setRemesasTransitoParameterGeneral(RemesasTransitoParameterReturnGeneral remesastransitoParameterGeneral) {
		this.remesastransitoParameterGeneral = remesastransitoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRemesasTransito() {
		return isPermisoTodoRemesasTransito;
	}

	public void setIsPermisoTodoRemesasTransito(Boolean isPermisoTodoRemesasTransito) {
		this.isPermisoTodoRemesasTransito = isPermisoTodoRemesasTransito;
	}

	public Boolean getIsPermisoNuevoRemesasTransito() {
		return isPermisoNuevoRemesasTransito;
	}

	public void setIsPermisoNuevoRemesasTransito(Boolean isPermisoNuevoRemesasTransito) {
		this.isPermisoNuevoRemesasTransito = isPermisoNuevoRemesasTransito;
	}

	public Boolean getIsPermisoActualizarRemesasTransito() {
		return isPermisoActualizarRemesasTransito;
	}

	public void setIsPermisoActualizarRemesasTransito(Boolean isPermisoActualizarRemesasTransito) {
		this.isPermisoActualizarRemesasTransito = isPermisoActualizarRemesasTransito;
	}

	public Boolean getIsPermisoEliminarRemesasTransito() {
		return isPermisoEliminarRemesasTransito;
	}

	public void setIsPermisoEliminarRemesasTransito(Boolean isPermisoEliminarRemesasTransito) {
		this.isPermisoEliminarRemesasTransito = isPermisoEliminarRemesasTransito;
	}

	public Boolean getIsPermisoGuardarCambiosRemesasTransito() {
		return isPermisoGuardarCambiosRemesasTransito;
	}

	public void setIsPermisoGuardarCambiosRemesasTransito(Boolean isPermisoGuardarCambiosRemesasTransito) {
		this.isPermisoGuardarCambiosRemesasTransito = isPermisoGuardarCambiosRemesasTransito;
	}
	
	public Boolean getIsPermisoConsultaRemesasTransito() {
		return isPermisoConsultaRemesasTransito;
	}

	public void setIsPermisoConsultaRemesasTransito(Boolean isPermisoConsultaRemesasTransito) {
		this.isPermisoConsultaRemesasTransito = isPermisoConsultaRemesasTransito;
	}

	public Boolean getIsPermisoBusquedaRemesasTransito() {
		return isPermisoBusquedaRemesasTransito;
	}

	public void setIsPermisoBusquedaRemesasTransito(Boolean isPermisoBusquedaRemesasTransito) {
		this.isPermisoBusquedaRemesasTransito = isPermisoBusquedaRemesasTransito;
	}

	public Boolean getIsPermisoReporteRemesasTransito() {
		return isPermisoReporteRemesasTransito;
	}

	public void setIsPermisoReporteRemesasTransito(Boolean isPermisoReporteRemesasTransito) {
		this.isPermisoReporteRemesasTransito = isPermisoReporteRemesasTransito;
	}
	
	public Boolean getIsPermisoPaginacionMedioRemesasTransito() {
		return isPermisoPaginacionMedioRemesasTransito;
	}

	public void setIsPermisoPaginacionMedioRemesasTransito(Boolean isPermisoPaginacionMedioRemesasTransito) {
		this.isPermisoPaginacionMedioRemesasTransito = isPermisoPaginacionMedioRemesasTransito;
	}
	
	public Boolean getIsPermisoPaginacionTodoRemesasTransito() {
		return isPermisoPaginacionTodoRemesasTransito;
	}

	public void setIsPermisoPaginacionTodoRemesasTransito(Boolean isPermisoPaginacionTodoRemesasTransito) {
		this.isPermisoPaginacionTodoRemesasTransito = isPermisoPaginacionTodoRemesasTransito;
	}
	
	public Boolean getIsPermisoPaginacionAltoRemesasTransito() {
		return isPermisoPaginacionAltoRemesasTransito;
	}

	public void setIsPermisoPaginacionAltoRemesasTransito(Boolean isPermisoPaginacionAltoRemesasTransito) {
		this.isPermisoPaginacionAltoRemesasTransito = isPermisoPaginacionAltoRemesasTransito;
	}
	
	public Boolean getIsPermisoCopiarRemesasTransito() {
		return isPermisoCopiarRemesasTransito;
	}

	public void setIsPermisoCopiarRemesasTransito(Boolean isPermisoCopiarRemesasTransito) {
		this.isPermisoCopiarRemesasTransito = isPermisoCopiarRemesasTransito;
	}
	
	public Boolean getIsPermisoVerFormRemesasTransito() {
		return isPermisoVerFormRemesasTransito;
	}

	public void setIsPermisoVerFormRemesasTransito(Boolean isPermisoVerFormRemesasTransito) {
		this.isPermisoVerFormRemesasTransito = isPermisoVerFormRemesasTransito;
	}
	
	public Boolean getIsPermisoDuplicarRemesasTransito() {
		return isPermisoDuplicarRemesasTransito;
	}

	public void setIsPermisoDuplicarRemesasTransito(Boolean isPermisoDuplicarRemesasTransito) {
		this.isPermisoDuplicarRemesasTransito = isPermisoDuplicarRemesasTransito;
	}
	
	public Boolean getIsPermisoOrdenRemesasTransito() {
		return isPermisoOrdenRemesasTransito;
	}

	public void setIsPermisoOrdenRemesasTransito(Boolean isPermisoOrdenRemesasTransito) {
		this.isPermisoOrdenRemesasTransito = isPermisoOrdenRemesasTransito;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRemesasTransito() {
		return isVisibilidadCeldaNuevoRemesasTransito;
	}

	public void setIsVisibilidadCeldaNuevoRemesasTransito(Boolean isVisibilidadCeldaNuevoRemesasTransito) {
		this.isVisibilidadCeldaNuevoRemesasTransito = isVisibilidadCeldaNuevoRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRemesasTransito() {
		return isVisibilidadCeldaDuplicarRemesasTransito;
	}

	public void setIsVisibilidadCeldaDuplicarRemesasTransito(Boolean isVisibilidadCeldaDuplicarRemesasTransito) {
		this.isVisibilidadCeldaDuplicarRemesasTransito = isVisibilidadCeldaDuplicarRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRemesasTransito() {
		return isVisibilidadCeldaCopiarRemesasTransito;
	}

	public void setIsVisibilidadCeldaCopiarRemesasTransito(Boolean isVisibilidadCeldaCopiarRemesasTransito) {
		this.isVisibilidadCeldaCopiarRemesasTransito = isVisibilidadCeldaCopiarRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRemesasTransito() {
		return isVisibilidadCeldaVerFormRemesasTransito;
	}

	public void setIsVisibilidadCeldaVerFormRemesasTransito(Boolean isVisibilidadCeldaVerFormRemesasTransito) {
		this.isVisibilidadCeldaVerFormRemesasTransito = isVisibilidadCeldaVerFormRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRemesasTransito() {
		return isVisibilidadCeldaOrdenRemesasTransito;
	}

	public void setIsVisibilidadCeldaOrdenRemesasTransito(Boolean isVisibilidadCeldaOrdenRemesasTransito) {
		this.isVisibilidadCeldaOrdenRemesasTransito = isVisibilidadCeldaOrdenRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRemesasTransito() {
		return isVisibilidadCeldaNuevoRelacionesRemesasTransito;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRemesasTransito(Boolean isVisibilidadCeldaNuevoRelacionesRemesasTransito) {
		this.isVisibilidadCeldaNuevoRelacionesRemesasTransito = isVisibilidadCeldaNuevoRelacionesRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRemesasTransito() {
		return isVisibilidadCeldaModificarRemesasTransito;
	}

	public void setIsVisibilidadCeldaModificarRemesasTransito(Boolean isVisibilidadCeldaModificarRemesasTransito) {
		this.isVisibilidadCeldaModificarRemesasTransito = isVisibilidadCeldaModificarRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRemesasTransito() {
		return isVisibilidadCeldaActualizarRemesasTransito;
	}

	public void setIsVisibilidadCeldaActualizarRemesasTransito(Boolean isVisibilidadCeldaActualizarRemesasTransito) {
		this.isVisibilidadCeldaActualizarRemesasTransito = isVisibilidadCeldaActualizarRemesasTransito;
	}

	public Boolean getIsVisibilidadCeldaEliminarRemesasTransito() {
		return isVisibilidadCeldaEliminarRemesasTransito;
	}

	public void setIsVisibilidadCeldaEliminarRemesasTransito(Boolean isVisibilidadCeldaEliminarRemesasTransito) {
		this.isVisibilidadCeldaEliminarRemesasTransito = isVisibilidadCeldaEliminarRemesasTransito;
	}

	public Boolean getIsVisibilidadCeldaCancelarRemesasTransito() {
		return isVisibilidadCeldaCancelarRemesasTransito;
	}

	public void setIsVisibilidadCeldaCancelarRemesasTransito(Boolean isVisibilidadCeldaCancelarRemesasTransito) {
		this.isVisibilidadCeldaCancelarRemesasTransito = isVisibilidadCeldaCancelarRemesasTransito;
	}

	public Boolean getIsVisibilidadCeldaGuardarRemesasTransito() {
		return isVisibilidadCeldaGuardarRemesasTransito;
	}

	public void setIsVisibilidadCeldaGuardarRemesasTransito(Boolean isVisibilidadCeldaGuardarRemesasTransito) {
		this.isVisibilidadCeldaGuardarRemesasTransito = isVisibilidadCeldaGuardarRemesasTransito;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRemesasTransito() {
		return isVisibilidadCeldaGuardarCambiosRemesasTransito;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRemesasTransito(Boolean isVisibilidadCeldaGuardarCambiosRemesasTransito) {
		this.isVisibilidadCeldaGuardarCambiosRemesasTransito = isVisibilidadCeldaGuardarCambiosRemesasTransito;
	}
		
	public RemesasTransitoSessionBean getremesastransitoSessionBean() {
		return this.remesastransitoSessionBean;
	}
	
	public void setremesastransitoSessionBean(RemesasTransitoSessionBean remesastransitoSessionBean) {
		this.remesastransitoSessionBean=remesastransitoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaRemesasTransito() {
		return this.isVisibilidadBusquedaRemesasTransito;
	}

	public void setisVisibilidadBusquedaRemesasTransito(Boolean isVisibilidadBusquedaRemesasTransito) {
		this.isVisibilidadBusquedaRemesasTransito=isVisibilidadBusquedaRemesasTransito;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(RemesasTransito remesastransito)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(remesastransito,null);
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
	
	public void bugActualizarReferenciaActual(RemesasTransito remesastransito,RemesasTransito remesastransitoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRemesasTransito(remesastransito);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		remesastransitoAux.setId(remesastransito.getId());
		remesastransitoAux.setVersionRow(remesastransito.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(RemesasTransito remesastransitoLocal) throws Exception {
		
		if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RemesasTransito remesastransitoLocal) throws Exception {	
		if(this.remesastransitoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				remesastransitoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRemesasTransitoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = remesastransitoValidator.getInvalidValues(this.remesastransito);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RemesasTransito remesastransito,List<RemesasTransito> remesastransitos) throws Exception {
	}		
	
	public void actualizarSelectedLista(RemesasTransito remesastransito,List<RemesasTransito> remesastransitos) throws Exception {
		try	{			
			RemesasTransitoConstantesFunciones.actualizarSelectedLista(remesastransito,remesastransitos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RemesasTransito> remesastransitosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				remesastransitosLocal=this.remesastransitoLogic.getRemesasTransitos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				remesastransitosLocal=this.remesastransitos;
			}
			//ARCHITECTURE
		
			for(RemesasTransito remesastransitoLocal:remesastransitosLocal) {
				if(this.permiteMantenimiento(remesastransitoLocal) && remesastransitoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RemesasTransitoConstantesFunciones.getRemesasTransitoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.NOMBREBANCO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnombre_bancoRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.NOMBREGIRADOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnombre_giradorRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelfecha_vencimientoRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_cuentaRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_chequeRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.VALORMONTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelvalor_montoRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelvalorRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_mayorRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelcodigoRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.FECHAVENCIMIENTOORIGINAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelfecha_vencimiento_originalRemesasTransito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RemesasTransitoConstantesFunciones.NUMEROCAMBIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_cambioRemesasTransito,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelnombre_bancoRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelnombre_giradorRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelfecha_vencimientoRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_cuentaRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_chequeRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelvalor_montoRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelvalorRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_mayorRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelcodigoRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelfecha_vencimiento_originalRemesasTransito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_cambioRemesasTransito,"");
		
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
		this.iIdNuevoRemesasTransito--;	
		
		
		this.remesastransitoAux=new RemesasTransito();
		
		this.remesastransitoAux.setId(this.iIdNuevoRemesasTransito);
		this.remesastransitoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.remesastransitoLogic.getRemesasTransitos().add(this.remesastransitoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.remesastransitos.add(this.remesastransitoAux);
		}
		//ARCHITECTURE
		
		this.remesastransito=this.remesastransitoAux;
		
		if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRemesasTransito(this.remesastransito);
			this.setVariablesObjetoActualToFormularioForeignKeyRemesasTransito(this.remesastransito);
		}
				
		//this.setDefaultControlesRemesasTransito();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRemesasTransito();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRemesasTransito();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRemesasTransito();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRemesasTransito(this.remesastransitoBean,this.remesastransito,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRemesasTransito(this.remesastransitoReturnGeneral,this.remesastransitoBean,false);
		
		if(this.remesastransitoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRemesasTransito(this.remesastransitoReturnGeneral.getRemesasTransito());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRemesasTransito(this.remesastransitoReturnGeneral.getRemesasTransito());
		}
		
		if(this.remesastransitoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRemesasTransito(this.remesastransitoReturnGeneral.getRemesasTransito(),classes);//this.remesastransitoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRemesasTransito();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRemesasTransito();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.RecargarFormRemesasTransito(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRemesasTransito(false);
						
			if(remesastransitoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRemesasTransito();
			}
			
			this.actualizarVisualTableDatosRemesasTransito();
			
			this.jTableDatosRemesasTransito.setRowSelectionInterval(this.getIndiceNuevoRemesasTransito(), this.getIndiceNuevoRemesasTransito());
			
			this.seleccionarFilaTablaRemesasTransitoActual();
						
			this.actualizarEstadoCeldasBotonesRemesasTransito("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRemesasTransito(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarnombre_bancoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarnombre_giradorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarfecha_vencimientoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarnumero_cuentaRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarnumero_chequeRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarvalor_montoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarvalorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarnumero_mayorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarcodigoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarfecha_vencimiento_originalRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarnumero_cambioRemesasTransito);	
		//
		this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setEnabled(isHabilitar && this.remesastransitoConstantesFunciones.activarid_empresaRemesasTransito);
	};
	
	public void setDefaultControlesRemesasTransito() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRemesasTransito(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.remesastransitoSessionBean.setConGuardarRelaciones(true);			
			this.remesastransitoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.setVisible(true);
			
					
		} else {
			//this.remesastransitoSessionBean.setConGuardarRelaciones(false);			
			this.remesastransitoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoRemesasTransito() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
				if(remesastransitoAux.getId().equals(this.iIdNuevoRemesasTransito)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RemesasTransito remesastransitoAux:this.remesastransitos) {
				if(remesastransitoAux.getId().equals(this.iIdNuevoRemesasTransito)) {
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
	
	public int getIndiceActualRemesasTransito(RemesasTransito remesastransito,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
				if(remesastransitoAux.getId().equals(remesastransito.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RemesasTransito remesastransitoAux:this.remesastransitos) {
				if(remesastransitoAux.getId().equals(remesastransito.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRemesasTransito(RemesasTransito remesastransitoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
				if(remesastransitoAux.getRemesasTransitoOriginal().getId().equals(remesastransitoOriginal.getId())) {
					existe=true;
					remesastransitoOriginal.setId(remesastransitoAux.getId());
					remesastransitoOriginal.setVersionRow(remesastransitoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RemesasTransito remesastransitoAux:this.remesastransitos) {
				if(remesastransitoAux.getRemesasTransitoOriginal().getId().equals(remesastransitoOriginal.getId())) {
					existe=true;
					remesastransitoOriginal.setId(remesastransitoAux.getId());
					remesastransitoOriginal.setVersionRow(remesastransitoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRemesasTransito(Boolean esParaCancelar) throws Exception {
		remesastransitosAux=new ArrayList<RemesasTransito>();
		remesastransitoAux=new RemesasTransito();
		
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
					if(remesastransitoAux.getId()<0) {
						remesastransitosAux.add(remesastransitoAux);
					}		
				}
				this.iIdNuevoRemesasTransito=0L;
				this.remesastransitoLogic.getRemesasTransitos().removeAll(remesastransitosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RemesasTransito remesastransitoAux:this.remesastransitos) {
					if(remesastransitoAux.getId()<0) {
						remesastransitosAux.add(remesastransitoAux);
					}		
				}
				this.iIdNuevoRemesasTransito=0L;
				this.remesastransitos.removeAll(remesastransitosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRemesasTransito 
					&& this.remesastransitoLogic.getRemesasTransitos().size()>0
					) {
					remesastransitoAux=this.remesastransitoLogic.getRemesasTransitos().get(this.remesastransitoLogic.getRemesasTransitos().size() - 1);
				
					if(remesastransitoAux.getId()<0) {
						this.remesastransitoLogic.getRemesasTransitos().remove(remesastransitoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRemesasTransito && this.remesastransitos.size()>0) {
					remesastransitoAux=this.remesastransitos.get(this.remesastransitos.size() - 1);
				
					if(remesastransitoAux.getId()<0) {
						this.remesastransitos.remove(remesastransitoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRemesasTransito(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(remesastransito.getId()<0) {
				this.remesastransitoLogic.getRemesasTransitos().remove(this.remesastransito);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(remesastransito.getId()<0) {
				this.remesastransitos.remove(this.remesastransito);
			}
		}			
	}
	
	public void setEstadosInicialesRemesasTransito(List<RemesasTransito> remesastransitosAux) throws Exception {
		RemesasTransitoConstantesFunciones.setEstadosInicialesRemesasTransito(remesastransitosAux);
	}
	
	public void setEstadosInicialesRemesasTransito(RemesasTransito remesastransitoAux) throws Exception {
		RemesasTransitoConstantesFunciones.setEstadosInicialesRemesasTransito(remesastransitoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRemesasTransitoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRemesasTransito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRemesasTransitoActual()) {
				if(!this.isEsNuevoRemesasTransito) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRemesasTransito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRemesasTransito=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRemesasTransitoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Remesas Transito ?", "MANTENIMIENTO DE Remesas Transito", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRemesasTransito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RemesasTransito remesastransito) throws Exception {
		RemesasTransitoConstantesFunciones.seleccionarAsignar(this.remesastransito,remesastransito);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRemesasTransito=this.isPermisoActualizarOriginalRemesasTransito;
			
			
			this.seleccionarAsignar(remesastransito);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesRemesasTransito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.remesastransitoSessionBean.setsFuncionBusquedaRapida(this.remesastransitoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRemesasTransito) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRemesasTransito(esParaCancelar);				
				this.cancelarNuevoRemesasTransito(esParaCancelar);								
			}
			
			this.remesastransito=new RemesasTransito();
			
			this.inicializarRemesasTransito();
			
			this.actualizarEstadoCeldasBotonesRemesasTransito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRemesasTransito() throws Exception {
		try {
			RemesasTransitoConstantesFunciones.inicializarRemesasTransito(this.remesastransito);
			
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
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.remesastransitoLogic.getRemesasTransitos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRemesasTransitos(String sAccionBusqueda,List<RemesasTransito> remesastransitosParaReportes) throws Exception {
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
					sPathReporteFinal="RemesasTransito"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RemesasTransitoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RemesasTransitoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RemesasTransito"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Remesas Transitos");		
		parameters.put("busquedapor", RemesasTransitoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRemesasTransito=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RemesasTransitoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RemesasTransitoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRemesasTransito=new JRBeanArrayDataSource(RemesasTransitoJInternalFrame.TraerRemesasTransitoBeans(remesastransitosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRemesasTransito);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RemesasTransitoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RemesasTransitoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RemesasTransitoBean.TraerRemesasTransitoBeans(remesastransitosParaReportes).toArray()));
							
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
				this.generarExcelReporteRemesasTransitos(sAccionBusqueda,sTipoArchivoReporte,remesastransitosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRemesasTransitos(sAccionBusqueda,sTipoArchivoReporte,remesastransitosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRemesasTransitoActionPerformed(null);
					//this.generarExcelReporteRemesasTransitos(sAccionBusqueda,sTipoArchivoReporte,remesastransitosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRemesasTransitos(sAccionBusqueda,sTipoArchivoReporte,remesastransitosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRemesasTransitos(sAccionBusqueda,sTipoArchivoReporte,remesastransitosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRemesasTransitos(sAccionBusqueda,sTipoArchivoReporte,remesastransitosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRemesasTransitos(String sAccionBusqueda,String sTipoArchivoReporte,List<RemesasTransito> remesastransitosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"remesastransito";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RemesasTransitos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRemesasTransito("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RemesasTransito remesastransito : remesastransitosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RemesasTransitoConstantesFunciones.generarExcelReporteDataRemesasTransito("NORMAL",row,workbook,remesastransito,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRemesasTransito(String sTipo,Row row,Workbook workbook) {
		
		RemesasTransitoConstantesFunciones.generarExcelReporteHeaderRemesasTransito(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRemesasTransitos(String sAccionBusqueda,String sTipoArchivoReporte,List<RemesasTransito> remesastransitosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"remesastransito_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RemesasTransitos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RemesasTransito remesastransito : remesastransitosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RemesasTransitoConstantesFunciones.getRemesasTransitoDescripcion(remesastransito));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getnombre_banco());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getnombre_girador());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getnumero_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_VALORMONTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_VALORMONTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getvalor_monto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getfecha_vencimiento_original());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(remesastransito.getnumero_cambio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRemesasTransitos(String sAccionBusqueda,String sTipoArchivoReporte,List<RemesasTransito> remesastransitosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RemesasTransito> remesastransitosRespaldo=null;
		
		classes=RemesasTransitoConstantesFunciones.getClassesRelationshipsOfRemesasTransito(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.remesastransitoLogic.setDatosCliente(this.datosCliente);
		this.remesastransitoLogic.setDatosDeep(this.datosDeep);
		this.remesastransitoLogic.setIsConDeep(true);
		
		remesastransitosRespaldo=this.remesastransitoLogic.getRemesasTransitos();
		
		this.remesastransitoLogic.setRemesasTransitos(remesastransitosParaReportes);	
		this.remesastransitoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		remesastransitosParaReportes=this.remesastransitoLogic.getRemesasTransitos();
		this.remesastransitoLogic.setRemesasTransitos(remesastransitosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"remesastransito_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RemesasTransitos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRemesasTransito("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RemesasTransito remesastransito : remesastransitosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRemesasTransito("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RemesasTransitoConstantesFunciones.generarExcelReporteDataRemesasTransito("NORMAL",row,workbook,remesastransito,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(RemesasTransitoConstantesFunciones.getRemesasTransitoDescripcion(remesastransito));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRemesasTransito.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRemesasTransito() throws Exception {		
		this.startProcessRemesasTransito(true);
	}
	
	public void startProcessRemesasTransito(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRemesasTransito ,this.jPanelParametrosReportesRemesasTransito, this.jScrollPanelDatosRemesasTransito,this.jPanelPaginacionRemesasTransito, this.jScrollPanelDatosEdicionRemesasTransito, this.jPanelAccionesRemesasTransito,this.jPanelAccionesFormularioRemesasTransito,this.jmenuBarRemesasTransito,this.jmenuBarDetalleRemesasTransito,this.jTtoolBarRemesasTransito,this.jTtoolBarDetalleRemesasTransito);		
		
		final JTabbedPane jTabbedPaneBusquedasRemesasTransito=this.jTabbedPaneBusquedasRemesasTransito; 
		
		final JPanel jPanelParametrosReportesRemesasTransito=this.jPanelParametrosReportesRemesasTransito;
		//final JScrollPane jScrollPanelDatosRemesasTransito=this.jScrollPanelDatosRemesasTransito;
		final JTable jTableDatosRemesasTransito=this.jTableDatosRemesasTransito;		
		final JPanel jPanelPaginacionRemesasTransito=this.jPanelPaginacionRemesasTransito;
		//final JScrollPane jScrollPanelDatosEdicionRemesasTransito=this.jScrollPanelDatosEdicionRemesasTransito;
		final JPanel jPanelAccionesRemesasTransito=this.jPanelAccionesRemesasTransito;
		
		JPanel jPanelCamposAuxiliarRemesasTransito=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRemesasTransito=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			jPanelCamposAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jPanelCamposRemesasTransito;
			jPanelAccionesFormularioAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jPanelAccionesFormularioRemesasTransito;
		}
		
		final JPanel jPanelCamposRemesasTransito=jPanelCamposAuxiliarRemesasTransito;
		final JPanel jPanelAccionesFormularioRemesasTransito=jPanelAccionesFormularioAuxiliarRemesasTransito;
		
		
		final JMenuBar jmenuBarRemesasTransito=this.jmenuBarRemesasTransito;
		final JToolBar jTtoolBarRemesasTransito=this.jTtoolBarRemesasTransito;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRemesasTransito=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRemesasTransito=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			jmenuBarDetalleAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jmenuBarDetalleRemesasTransito;
			jTtoolBarDetalleAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jTtoolBarDetalleRemesasTransito;
		}
		
		final JMenuBar jmenuBarDetalleRemesasTransito=jmenuBarDetalleAuxiliarRemesasTransito;
		final JToolBar jTtoolBarDetalleRemesasTransito=jTtoolBarDetalleAuxiliarRemesasTransito;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRemesasTransito;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRemesasTransito;
			processRunnable.jTableDatos=jTableDatosRemesasTransito;
			processRunnable.jPanelCampos=jPanelCamposRemesasTransito;
			processRunnable.jPanelPaginacion=jPanelPaginacionRemesasTransito;
			processRunnable.jPanelAcciones=jPanelAccionesRemesasTransito;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRemesasTransito;
			
			
			processRunnable.jmenuBar=jmenuBarRemesasTransito;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRemesasTransito;
			processRunnable.jTtoolBar=jTtoolBarRemesasTransito;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRemesasTransito;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRemesasTransito ,jPanelParametrosReportesRemesasTransito,jTableDatosRemesasTransito, /*jScrollPanelDatosRemesasTransito,*/jPanelCamposRemesasTransito,jPanelPaginacionRemesasTransito, /*jScrollPanelDatosEdicionRemesasTransito,*/ jPanelAccionesRemesasTransito,jPanelAccionesFormularioRemesasTransito,jmenuBarRemesasTransito,jmenuBarDetalleRemesasTransito,jTtoolBarRemesasTransito,jTtoolBarDetalleRemesasTransito);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRemesasTransito ,jPanelParametrosReportesRemesasTransito, jScrollPanelDatosRemesasTransito,jPanelPaginacionRemesasTransito, jScrollPanelDatosEdicionRemesasTransito, jPanelAccionesRemesasTransito,jPanelAccionesFormularioRemesasTransito,jmenuBarRemesasTransito,jmenuBarDetalleRemesasTransito,jTtoolBarRemesasTransito,jTtoolBarDetalleRemesasTransito);
						
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
	
	public void finishProcessRemesasTransito() {// throws Exception 
		this.finishProcessRemesasTransito(true);
	}
	
	public void finishProcessRemesasTransito(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRemesasTransito ,this.jPanelParametrosReportesRemesasTransito, this.jScrollPanelDatosRemesasTransito,this.jPanelPaginacionRemesasTransito, this.jScrollPanelDatosEdicionRemesasTransito, this.jPanelAccionesRemesasTransito,this.jPanelAccionesFormularioRemesasTransito,this.jmenuBarRemesasTransito,this.jmenuBarDetalleRemesasTransito,this.jTtoolBarRemesasTransito,this.jTtoolBarDetalleRemesasTransito);		
		
		final JTabbedPane jTabbedPaneBusquedasRemesasTransito=this.jTabbedPaneBusquedasRemesasTransito; 
		
		final JPanel jPanelParametrosReportesRemesasTransito=this.jPanelParametrosReportesRemesasTransito;
		//final JScrollPane jScrollPanelDatosRemesasTransito=this.jScrollPanelDatosRemesasTransito;
		final JTable jTableDatosRemesasTransito=this.jTableDatosRemesasTransito;		
		final JPanel jPanelPaginacionRemesasTransito=this.jPanelPaginacionRemesasTransito;
		//final JScrollPane jScrollPanelDatosEdicionRemesasTransito=this.jScrollPanelDatosEdicionRemesasTransito;
		final JPanel jPanelAccionesRemesasTransito=this.jPanelAccionesRemesasTransito;
		
		JPanel jPanelCamposAuxiliarRemesasTransito=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRemesasTransito=new JPanel();
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			jPanelCamposAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jPanelCamposRemesasTransito;
			jPanelAccionesFormularioAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jPanelAccionesFormularioRemesasTransito;
		}
		
		final JPanel jPanelCamposRemesasTransito=jPanelCamposAuxiliarRemesasTransito;
		final JPanel jPanelAccionesFormularioRemesasTransito=jPanelAccionesFormularioAuxiliarRemesasTransito;
		
		
		final JMenuBar jmenuBarRemesasTransito=this.jmenuBarRemesasTransito;		
		final JToolBar jTtoolBarRemesasTransito=this.jTtoolBarRemesasTransito;
				
		JMenuBar jmenuBarDetalleAuxiliarRemesasTransito=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRemesasTransito=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			jmenuBarDetalleAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jmenuBarDetalleRemesasTransito;
			jTtoolBarDetalleAuxiliarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jTtoolBarDetalleRemesasTransito;		
		}
		
		final JMenuBar jmenuBarDetalleRemesasTransito=jmenuBarDetalleAuxiliarRemesasTransito;
		final JToolBar jTtoolBarDetalleRemesasTransito=jTtoolBarDetalleAuxiliarRemesasTransito;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRemesasTransito;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRemesasTransito;
			processRunnable.jTableDatos=jTableDatosRemesasTransito;
			processRunnable.jPanelCampos=jPanelCamposRemesasTransito;
			processRunnable.jPanelPaginacion=jPanelPaginacionRemesasTransito;
			processRunnable.jPanelAcciones=jPanelAccionesRemesasTransito;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRemesasTransito;
			
			
			processRunnable.jmenuBar=jmenuBarRemesasTransito;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRemesasTransito;
			processRunnable.jTtoolBar=jTtoolBarRemesasTransito;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRemesasTransito;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRemesasTransito ,jPanelParametrosReportesRemesasTransito, jTableDatosRemesasTransito,/*jScrollPanelDatosRemesasTransito,*/jPanelCamposRemesasTransito,jPanelPaginacionRemesasTransito, /*jScrollPanelDatosEdicionRemesasTransito,*/ jPanelAccionesRemesasTransito,jPanelAccionesFormularioRemesasTransito,jmenuBarRemesasTransito,jmenuBarDetalleRemesasTransito,jTtoolBarRemesasTransito,jTtoolBarDetalleRemesasTransito));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRemesasTransito(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRemesasTransito(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRemesasTransito(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRemesasTransito(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRemesasTransito,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRemesasTransito,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRemesasTransito(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRemesasTransito,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRemesasTransito,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.remesastransitoConstantesFunciones.getsFinalQueryRemesasTransito();
		String  finalQueryPaginacionTodos=this.remesastransitoConstantesFunciones.getsFinalQueryRemesasTransito();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RemesasTransitoConstantesFunciones.getArrayColumnasGlobalesNoRemesasTransito(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RemesasTransitoConstantesFunciones.getArrayColumnasGlobalesRemesasTransito(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RemesasTransitoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.remesastransitosEliminados= new ArrayList<RemesasTransito>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRemesasTransito();
		
				///*RemesasTransitoSessionBean*/this.remesastransitoSessionBean=new RemesasTransitoSessionBean();
			
			if(this.remesastransitoSessionBean==null) {
				this.remesastransitoSessionBean=new RemesasTransitoSessionBean();
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
					this.iNumeroPaginacion=RemesasTransitoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RemesasTransitoConstantesFunciones.getClassesForeignKeysOfRemesasTransito(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/remesastransito."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			remesastransitosAux= new ArrayList<RemesasTransito>();
			
				
			remesastransitoLogic.setDatosCliente(this.datosCliente);
			remesastransitoLogic.setDatosDeep(this.datosDeep);
			remesastransitoLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaRemesasTransito")) {
				this.sDetalleReporte=RemesasTransitoConstantesFunciones.getDetalleIndiceBusquedaRemesasTransito(idBusquedaRemesasTransito);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					remesastransitoLogic.getRemesasTransitosBusquedaRemesasTransito(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaRemesasTransito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RemesasTransitoConstantesFunciones.getDetalleIndiceBusquedaRemesasTransito(idBusquedaRemesasTransito);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RemesasTransitoConstantesFunciones.getDetalleIndiceBusquedaRemesasTransito(idBusquedaRemesasTransito);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=remesastransitoLogic.getRemesasTransitos()==null||remesastransitoLogic.getRemesasTransitos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=remesastransitos==null|| remesastransitos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						remesastransitosAux=new ArrayList<RemesasTransito>();
						remesastransitosAux.addAll(remesastransitoLogic.getRemesasTransitos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							remesastransitosAux=new ArrayList<RemesasTransito>();
							remesastransitosAux.addAll(remesastransitos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							remesastransitoLogic.getRemesasTransitosBusquedaRemesasTransito(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaRemesasTransito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RemesasTransitoConstantesFunciones.getDetalleIndiceBusquedaRemesasTransito(idBusquedaRemesasTransito);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RemesasTransitoConstantesFunciones.getDetalleIndiceBusquedaRemesasTransito(idBusquedaRemesasTransito);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRemesasTransitos("BusquedaRemesasTransito",remesastransitoLogic.getRemesasTransitos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRemesasTransitos("BusquedaRemesasTransito",remesastransitos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						remesastransitoLogic.setRemesasTransitos(new ArrayList<RemesasTransito>());
						remesastransitoLogic.getRemesasTransitos().addAll(remesastransitosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							remesastransitos=new ArrayList<RemesasTransito>();
							remesastransitos.addAll(remesastransitosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRemesasTransito();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRemesasTransito();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=remesastransitoLogic.getRemesasTransitos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=remesastransitos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=remesastransitoLogic.getRemesasTransitos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=remesastransitos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RemesasTransito remesastransito) {
		Boolean permite=true;
		
		if(this.remesastransito.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RemesasTransitoConstantesFunciones.getOrderByListaRemesasTransito();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RemesasTransitoConstantesFunciones.getOrderByListaRemesasTransito();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RemesasTransito remesastransito:remesastransitoLogic.getRemesasTransitos()) {
				if(remesastransito.getsType().equals(Constantes2.S_TOTALES)) {
					remesastransitoTotales=remesastransito;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RemesasTransito remesastransito:this.remesastransitos) {
				if(remesastransito.getsType().equals(Constantes2.S_TOTALES)) {
					remesastransitoTotales=remesastransito;
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
			this.remesastransitoAux=new RemesasTransito();
			this.remesastransitoAux.setsType(Constantes2.S_TOTALES);
			this.remesastransitoAux.setIsNew(false);
			this.remesastransitoAux.setIsChanged(false);
			this.remesastransitoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//RemesasTransitoConstantesFunciones.TotalizarValoresFilaRemesasTransito(this.remesastransitoLogic.getRemesasTransitos(),this.remesastransitoAux);
				
				//this.remesastransitoLogic.getRemesasTransitos().add(this.remesastransitoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RemesasTransitoConstantesFunciones.TotalizarValoresFilaRemesasTransito(this.remesastransitos,this.remesastransitoAux);
				
				this.remesastransitos.add(this.remesastransitoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		remesastransitoTotales=new RemesasTransito();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.remesastransitoLogic.getRemesasTransitos().remove(remesastransitoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.remesastransitos.remove(remesastransitoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		remesastransitoTotales=new RemesasTransito();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RemesasTransito remesastransito:remesastransitoLogic.getRemesasTransitos()) {
				if(remesastransito.getsType().equals(Constantes2.S_TOTALES)) {
					remesastransitoTotales=remesastransito;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RemesasTransitoConstantesFunciones.TotalizarValoresFilaRemesasTransito(this.remesastransitoLogic.getRemesasTransitos(),remesastransitoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RemesasTransito remesastransito:this.remesastransitos) {
				if(remesastransito.getsType().equals(Constantes2.S_TOTALES)) {
					remesastransitoTotales=remesastransito;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RemesasTransitoConstantesFunciones.TotalizarValoresFilaRemesasTransito(this.remesastransitos,remesastransitoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRemesasTransitosBusquedaRemesasTransito()throws Exception {
		try {
			sAccionBusqueda="BusquedaRemesasTransito";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRemesasTransitosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRemesasTransitosBusquedaRemesasTransito(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//remesastransitoLogic.getRemesasTransitosBusquedaRemesasTransito(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRemesasTransitosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//remesastransitoLogic.getRemesasTransitosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosRemesasTransito() {
		this.isPermisoTodoRemesasTransito=false;
		this.isPermisoNuevoRemesasTransito=false;
		this.isPermisoActualizarRemesasTransito=false;
		this.isPermisoActualizarOriginalRemesasTransito=false;
		this.isPermisoEliminarRemesasTransito=false;
		this.isPermisoGuardarCambiosRemesasTransito=false;
		this.isPermisoConsultaRemesasTransito=true;
		this.isPermisoBusquedaRemesasTransito=true;
		this.isPermisoReporteRemesasTransito=true;
		this.isPermisoOrdenRemesasTransito=false;		
		this.isPermisoPaginacionMedioRemesasTransito=false;		
		this.isPermisoPaginacionAltoRemesasTransito=false;		
		this.isPermisoPaginacionTodoRemesasTransito=false;		
		this.isPermisoCopiarRemesasTransito=false;		
		this.isPermisoVerFormRemesasTransito=false;		
		this.isPermisoDuplicarRemesasTransito=false;
		this.isPermisoOrdenRemesasTransito=false;
	}
	
	public void setPermisosUsuarioRemesasTransito(Boolean isPermiso) {
		this.isPermisoTodoRemesasTransito=isPermiso;
		this.isPermisoNuevoRemesasTransito=isPermiso;
		this.isPermisoActualizarRemesasTransito=isPermiso;
		this.isPermisoActualizarOriginalRemesasTransito=isPermiso;
		this.isPermisoEliminarRemesasTransito=isPermiso;
		this.isPermisoGuardarCambiosRemesasTransito=isPermiso;
		this.isPermisoConsultaRemesasTransito=isPermiso;
		this.isPermisoBusquedaRemesasTransito=isPermiso;
		this.isPermisoReporteRemesasTransito=isPermiso;
		this.isPermisoOrdenRemesasTransito=isPermiso;		
		this.isPermisoPaginacionMedioRemesasTransito=isPermiso;		
		this.isPermisoPaginacionAltoRemesasTransito=isPermiso;		
		this.isPermisoPaginacionTodoRemesasTransito=isPermiso;		
		this.isPermisoCopiarRemesasTransito=isPermiso;		
		this.isPermisoVerFormRemesasTransito=isPermiso;		
		this.isPermisoDuplicarRemesasTransito=isPermiso;
		this.isPermisoOrdenRemesasTransito=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRemesasTransito(Boolean isPermiso) {
		//this.isPermisoTodoRemesasTransito=isPermiso;
		this.isPermisoNuevoRemesasTransito=isPermiso;
		this.isPermisoActualizarRemesasTransito=isPermiso;
		this.isPermisoActualizarOriginalRemesasTransito=isPermiso;
		this.isPermisoEliminarRemesasTransito=isPermiso;
		this.isPermisoGuardarCambiosRemesasTransito=isPermiso;
		//this.isPermisoConsultaRemesasTransito=isPermiso;
		//this.isPermisoBusquedaRemesasTransito=isPermiso;
		//this.isPermisoReporteRemesasTransito=isPermiso;
		//this.isPermisoOrdenRemesasTransito=isPermiso;		
		//this.isPermisoPaginacionMedioRemesasTransito=isPermiso;		
		//this.isPermisoPaginacionAltoRemesasTransito=isPermiso;		
		//this.isPermisoPaginacionTodoRemesasTransito=isPermiso;		
		//this.isPermisoCopiarRemesasTransito=isPermiso;		
		//this.isPermisoDuplicarRemesasTransito=isPermiso;
		//this.isPermisoOrdenRemesasTransito=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRemesasTransitoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(RemesasTransitoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebRemesasTransito(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRemesasTransitoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioRemesasTransitoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRemesasTransitoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRemesasTransitoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioRemesasTransito() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RemesasTransitoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RemesasTransitoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRemesasTransito=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRemesasTransito=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRemesasTransito=this.isPermisoActualizarRemesasTransito;
			this.isPermisoEliminarRemesasTransito=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRemesasTransito=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRemesasTransito=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRemesasTransito=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRemesasTransito=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRemesasTransito=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRemesasTransito=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRemesasTransito=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRemesasTransito=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRemesasTransito=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRemesasTransito=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRemesasTransito=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRemesasTransito=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRemesasTransito=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRemesasTransito.setToolTipText(this.jTableDatosRemesasTransito.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRemesasTransito(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRemesasTransito(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RemesasTransitoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RemesasTransitoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRemesasTransito() throws Exception {
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
	public void inicializarCombosForeignKeyRemesasTransitoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRemesasTransitoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RemesasTransitoJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyRemesasTransito()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.remesastransitoSessionBean==null) {
				this.remesastransitoSessionBean=new RemesasTransitoSessionBean();
			}

			if(!this.remesastransitoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyRemesasTransito()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRemesasTransito(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRemesasTransito()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRemesasTransito();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRemesasTransito(RemesasTransito remesastransito)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRemesasTransito(RemesasTransito remesastransito,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRemesasTransito()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRemesasTransito()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRemesasTransito()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRemesasTransito()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRemesasTransito()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRemesasTransito()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRemesasTransito(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRemesasTransito()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.getItemCount()>0) {
				this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public RemesasTransitoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RemesasTransitoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RemesasTransitoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.remesastransitoSessionBean=new RemesasTransitoSessionBean(); 
		this.remesastransitoConstantesFunciones=new RemesasTransitoConstantesFunciones(); 
		this.remesastransitoBean=new RemesasTransito();//(this.remesastransitoConstantesFunciones); 		
		this.remesastransitoReturnGeneral=new RemesasTransitoParameterReturnGeneral(); 
		
		this.remesastransitoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.remesastransitoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RemesasTransitoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RemesasTransitoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RemesasTransitoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRemesasTransito(true);
			
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
			
			this.remesastransitoConstantesFunciones=new RemesasTransitoConstantesFunciones(); 
			this.remesastransitoBean=new RemesasTransito();//this.remesastransitoConstantesFunciones); 			
			this.remesastransitoReturnGeneral=new RemesasTransitoParameterReturnGeneral(); 
		
			RemesasTransitoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Remesas Transito Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.remesastransito=new RemesasTransito();
			this.remesastransitos = new ArrayList<RemesasTransito>();
			this.remesastransitosAux = new ArrayList<RemesasTransito>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic=new RemesasTransitoLogic();
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			//this.remesastransitoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.remesastransitoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRemesasTransito);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRemesasTransito);	
					}
					
					if(this.jInternalFrameImportacionRemesasTransito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRemesasTransito);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRemesasTransito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRemesasTransito);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRemesasTransito);
				this.jInternalFrameDetalleFormRemesasTransito.setVisible(false);
				this.jInternalFrameDetalleFormRemesasTransito.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRemesasTransito);
					this.jInternalFrameReporteDinamicoRemesasTransito.setVisible(false);
					this.jInternalFrameReporteDinamicoRemesasTransito.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRemesasTransito!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRemesasTransito);
					this.jInternalFrameImportacionRemesasTransito.setVisible(false);
					this.jInternalFrameImportacionRemesasTransito.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRemesasTransito!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRemesasTransito);
					this.jInternalFrameOrderByRemesasTransito.setVisible(false);
					this.jInternalFrameOrderByRemesasTransito.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRemesasTransitoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RemesasTransitoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.remesastransitoReturnGeneral=new RemesasTransitoParameterReturnGeneral();
			
			this.remesastransitoParameterGeneral=new RemesasTransitoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.remesastransitoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RemesasTransitoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RemesasTransitoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.remesastransitoSessionBean.getEsGuardarRelacionado(),this.remesastransitoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RemesasTransitoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.remesastransitoSessionBean.getEsGuardarRelacionado(),this.remesastransitoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRemesasTransito=false;
			this.isVisibilidadCeldaDuplicarRemesasTransito=true;
			this.isVisibilidadCeldaCopiarRemesasTransito=true;
			this.isVisibilidadCeldaVerFormRemesasTransito=true;
			this.isVisibilidadCeldaOrdenRemesasTransito=true;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
			this.isVisibilidadCeldaModificarRemesasTransito=false;
			this.isVisibilidadCeldaActualizarRemesasTransito=false;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
			this.isVisibilidadCeldaCancelarRemesasTransito=false;
			this.isVisibilidadCeldaGuardarRemesasTransito=false;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
			
			
			this.isVisibilidadBusquedaRemesasTransito=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRemesasTransito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRemesasTransito();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRemesasTransito(false);
			
			this.setPermisosUsuarioRemesasTransito();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.remesastransitoSessionBean.getEsGuardarRelacionado() 
				|| (this.remesastransitoSessionBean.getEsGuardarRelacionado() && this.remesastransitoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRemesasTransitoClasesRelacionadas();
			}
			
			if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRemesasTransitoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRemesasTransito();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRemesasTransito();
			}
			
			if(!this.isPermisoBusquedaRemesasTransito) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RemesasTransitoConstantesFunciones.getTiposSeleccionarRemesasTransito());
				
				this.tiposColumnasSelect=RemesasTransitoConstantesFunciones.getTiposSeleccionarRemesasTransito(true);
				
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
			//if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRemesasTransito();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioRemesasTransito(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioRemesasTransito(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRemesasTransito() ;
			
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
				remesastransitoImplementable= (RemesasTransitoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RemesasTransitoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				remesastransitoImplementableHome= (RemesasTransitoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RemesasTransitoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.remesastransitos= new ArrayList<RemesasTransito>();
			this.remesastransitosEliminados= new ArrayList<RemesasTransito>();
						
			this.isEsNuevoRemesasTransito=false;
			this.esParaAccionDesdeFormularioRemesasTransito=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRemesasTransito(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRemesasTransito();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RemesasTransitoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RemesasTransitoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRemesasTransito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRemesasTransito(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRemesasTransito();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRemesasTransito();
			}
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRemesasTransito.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRemesasTransito.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRemesasTransito.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRemesasTransito(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RemesasTransito: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRemesasTransito() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRemesasTransito")) {
				iIndex=this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRemesasTransito();	
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
	
	public void cargarCombosForeignKeyRemesasTransito(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRemesasTransito(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRemesasTransito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRemesasTransitoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRemesasTransito();
		
		this.cargarCombosFrameForeignKeyRemesasTransito();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRemesasTransito();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRemesasTransito();
		}
	}
	
	
	
	public void jButtonNuevoRemesasTransitoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
			
			if(jTableDatosRemesasTransito.getRowCount()>=1) {
				jTableDatosRemesasTransito.removeRowSelectionInterval(0, jTableDatosRemesasTransito.getRowCount()-1);						
			}
			
			this.isEsNuevoRemesasTransito=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRemesasTransito(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRemesasTransito(true);			
			//this.remesastransito=new RemesasTransito();
			//this.remesastransito.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRemesasTransito(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRemesasTransito() ;
			
			if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRemesasTransito(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.remesastransito);	
			this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);				
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
			if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RemesasTransito: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRemesasTransitoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRemesasTransito.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRemesasTransito.getSelectedRows().length;			
			}
			
			remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRemesasTransito--;			
				//RemesasTransito remesastransitoAux= new RemesasTransito();			
				//remesastransitoAux.setId(this.iIdNuevoRemesasTransito);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RemesasTransito remesastransitoOrigen=new RemesasTransito();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RemesasTransito remesastransitoOrigen : remesastransitosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							remesastransitoOrigen =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							remesastransitoOrigen =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRemesasTransito();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.remesastransito.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRemesasTransito(remesastransitoOrigen,this.remesastransito,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.remesastransitoLogic.getRemesasTransitos().add(this.remesastransitoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.remesastransitos.add(this.remesastransitoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRemesasTransito(false);
				
				this.jTableDatosRemesasTransito.setRowSelectionInterval(this.getIndiceNuevoRemesasTransito(), this.getIndiceNuevoRemesasTransito());
				
				int iLastRow =  this.jTableDatosRemesasTransito.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRemesasTransito.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRemesasTransito.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRemesasTransito(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();									
		
			RemesasTransito remesastransitoOrigen=new RemesasTransito();
			RemesasTransito remesastransitoDestino=new RemesasTransito();
				
			remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRemesasTransito.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || remesastransitosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRemesasTransito.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						remesastransitoOrigen =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						remesastransitoOrigen =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						remesastransitoDestino =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						remesastransitoDestino =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				remesastransitoOrigen =remesastransitosSeleccionados.get(0);
				remesastransitoDestino =remesastransitosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRemesasTransito(remesastransitoOrigen,remesastransitoDestino,true,false);
				
				remesastransitoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(remesastransitoDestino,remesastransitoLogic.getRemesasTransitos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(remesastransitoDestino,remesastransitos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRemesasTransito(false);
				
				//this.jTableDatosRemesasTransito.setRowSelectionInterval(this.getIndiceNuevoRemesasTransito(), this.getIndiceNuevoRemesasTransito());
				
				int iLastRow =  this.jTableDatosRemesasTransito.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRemesasTransito.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRemesasTransito.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRemesasTransito(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRemesasTransito.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRemesasTransito.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRemesasTransito.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRemesasTransito.setVisible(!isVisible);
			this.jPanelPaginacionRemesasTransito.setVisible(!isVisible);
			this.jPanelAccionesRemesasTransito.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRemesasTransito();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRemesasTransito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRemesasTransito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRemesasTransito();
			
			this.abrirFrameOrderByRemesasTransito();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRemesasTransito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRemesasTransito(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRemesasTransito);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRemesasTransito.isMaximum()) {
					this.jInternalFrameDetalleFormRemesasTransito.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRemesasTransito.setSize(this.jInternalFrameDetalleFormRemesasTransito.iWidthFormulario,this.jInternalFrameDetalleFormRemesasTransito.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRemesasTransito.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRemesasTransito.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRemesasTransito.isMaximum()) {
						this.jInternalFrameDetalleFormRemesasTransito.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRemesasTransito.jContentPaneDetalleRemesasTransito.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRemesasTransito.jContentPaneDetalleRemesasTransito.getWidth(),RemesasTransitoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRemesasTransito.jContentPaneDetalleRemesasTransito.getWidth(),RemesasTransitoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRemesasTransito.jContentPaneDetalleRemesasTransito.getWidth(),RemesasTransitoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRemesasTransito.setVisible(true);
	        this.jInternalFrameDetalleFormRemesasTransito.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRemesasTransito() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRemesasTransito==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRemesasTransito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRemesasTransito,false,this);
				} else {
					this.jInternalFrameOrderByRemesasTransito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRemesasTransito,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRemesasTransito);
				this.jInternalFrameOrderByRemesasTransito.setVisible(false);
				this.jInternalFrameOrderByRemesasTransito.setSelected(false);
				
				this.jInternalFrameOrderByRemesasTransito.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRemesasTransito"));
				
				this.inicializarActualizarBindingTablaOrderByRemesasTransito();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRemesasTransito() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRemesasTransito==null) {
				
				this.jInternalFrameImportacionRemesasTransito=new ImportacionJInternalFrame(RemesasTransitoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRemesasTransito);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRemesasTransito);
				this.jInternalFrameImportacionRemesasTransito.setVisible(false);
				this.jInternalFrameImportacionRemesasTransito.setSelected(false);


				this.jInternalFrameImportacionRemesasTransito.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRemesasTransito"));
				this.jInternalFrameImportacionRemesasTransito.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRemesasTransito"));
				this.jInternalFrameImportacionRemesasTransito.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRemesasTransito"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRemesasTransito() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRemesasTransito==null) {
				this.jInternalFrameReporteDinamicoRemesasTransito=new ReporteDinamicoJInternalFrame(RemesasTransitoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRemesasTransito);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRemesasTransito);
				this.jInternalFrameReporteDinamicoRemesasTransito.setVisible(false);
				this.jInternalFrameReporteDinamicoRemesasTransito.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRemesasTransito.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRemesasTransito"));
				this.jInternalFrameReporteDinamicoRemesasTransito.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRemesasTransito"));
				this.jInternalFrameReporteDinamicoRemesasTransito.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRemesasTransito"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRemesasTransito();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleRemesasTransito() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRemesasTransito);
			
	       	this.jInternalFrameDetalleFormRemesasTransito.setVisible(false);
	        this.jInternalFrameDetalleFormRemesasTransito.setSelected(false);
			
			//this.jInternalFrameDetalleFormRemesasTransito.dispose();
			//this.jInternalFrameDetalleFormRemesasTransito=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRemesasTransito() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRemesasTransito.setVisible(true);
	        this.jInternalFrameReporteDinamicoRemesasTransito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRemesasTransito() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRemesasTransito.setVisible(true);
	        this.jInternalFrameImportacionRemesasTransito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRemesasTransito() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRemesasTransito.setVisible(true);
	        this.jInternalFrameOrderByRemesasTransito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRemesasTransito() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRemesasTransito.setVisible(false);
	        this.jInternalFrameOrderByRemesasTransito.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRemesasTransito() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRemesasTransito.setVisible(false);
	        this.jInternalFrameReporteDinamicoRemesasTransito.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRemesasTransito() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRemesasTransito.setVisible(false);
	        this.jInternalFrameImportacionRemesasTransito.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRemesasTransito(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRemesasTransito(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRemesasTransito(true);
			//this.isEsNuevoRemesasTransito=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRemesasTransito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRemesasTransito(false) ;
			
			if(remesastransitoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRemesasTransito(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRemesasTransito(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRemesasTransitoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRemesasTransito(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRemesasTransito(true);
			//this.isEsNuevoRemesasTransito=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.remesastransito.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRemesasTransito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRemesasTransito(false) ;
			
			if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRemesasTransito(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRemesasTransito(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRemesasTransito(false);
			
			//if(!this.isEsNuevoRemesasTransito) {								
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				
			}
			
			if(this.permiteMantenimiento(this.remesastransito)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRemesasTransito=true;
					this.inicializarActualizarBindingTablaRemesasTransito(false);
					this.isEsNuevoRemesasTransito=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRemesasTransito=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRemesasTransito=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRemesasTransito(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRemesasTransito(false);
				
				this.habilitarDeshabilitarControlesRemesasTransito(false);
			
												
				
				if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRemesasTransito();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRemesasTransitoActionPerformed(evt,remesastransitoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRemesasTransito(this.remesastransito,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRemesasTransito.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,remesastransitoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.remesastransito.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				this.remesastransito.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				this.remesastransito.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.remesastransito)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RemesasTransitoModel) this.jTableDatosRemesasTransito.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRemesasTransito=true;
				this.inicializarActualizarBindingTablaRemesasTransito(false);
				this.isEsNuevoRemesasTransito=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRemesasTransito(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRemesasTransito(false);
				
				this.habilitarDeshabilitarControlesRemesasTransito(false);
				
				
				
				if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRemesasTransito();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRemesasTransito.getRowCount()>=1) {
				jTableDatosRemesasTransito.removeRowSelectionInterval(0, jTableDatosRemesasTransito.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRemesasTransito(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRemesasTransito(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRemesasTransito(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRemesasTransito(false) ;
			
			this.isEsNuevoRemesasTransito=false;
			
			if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRemesasTransito();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRemesasTransito(false);
				
				//SI ES MANUAL
				if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRemesasTransito();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRemesasTransito--;			
			//RemesasTransito remesastransitoAux= new RemesasTransito();			
			//remesastransitoAux.setId(this.iIdNuevoRemesasTransito);
			
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRemesasTransito();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
			
			this.remesastransito.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.remesastransitoLogic.getRemesasTransitos().add(this.remesastransitoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.remesastransitos.add(this.remesastransitoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRemesasTransito(false);
			
			this.jTableDatosRemesasTransito.setRowSelectionInterval(this.getIndiceNuevoRemesasTransito(), this.getIndiceNuevoRemesasTransito());
			
			int iLastRow =  this.jTableDatosRemesasTransito.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRemesasTransito.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRemesasTransito.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRemesasTransito(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRemesasTransito(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRemesasTransito(false);
			
			//SI ES MANUAL
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRemesasTransito();
			}
			
			//this.abrirFrameTreeRemesasTransito();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRemesasTransito.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRemesasTransito.setFileImportacion(this.jInternalFrameImportacionRemesasTransito.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRemesasTransito.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRemesasTransito.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRemesasTransito.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRemesasTransito.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		

		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RemesasTransitoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RemesasTransitoBaseDesign.jrxml";
			
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
			
			this.generarReporteRemesasTransitos("Todos",remesastransitosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreBanco_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreBanco_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreBanco_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreBanco_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreGirador_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreGirador_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreGirador_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreGirador_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALORMONTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorMonto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorMonto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorMonto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorMonto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimientoOriginal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimientoOriginal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimientoOriginal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimientoOriginal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCambio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCambio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCambio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCambio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRemesasTransito.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoria="nombre_banco";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR:
					sNombreCampoCategoria="nombre_girador";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALORMONTO:
					sNombreCampoCategoria="valor_monto";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					sNombreCampoCategoria="fecha_vencimiento_original";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO:
					sNombreCampoCategoria="numero_cambio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO:
					sNombreCampoCategoriaValor="nombre_banco";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR:
					sNombreCampoCategoriaValor="nombre_girador";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALORMONTO:
					sNombreCampoCategoriaValor="valor_monto";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					sNombreCampoCategoriaValor="fecha_vencimiento_original";
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO:
					sNombreCampoCategoriaValor="numero_cambio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Banco",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_banco");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Girador",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_girador");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALORMONTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Monto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_monto");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento Original",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento_original");
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cambio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cambio");
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
	
	public void jButtonGenerarExcelReporteDinamicoRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"remesastransito";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RemesasTransitos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getnombre_banco());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getnombre_girador());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getnumero_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALORMONTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_VALORMONTO);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getvalor_monto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getfecha_vencimiento_original());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO);
					iRow++;

					for(RemesasTransito remesastransito:remesastransitosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(remesastransito.getnumero_cambio());
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
			//	this.getFilaCabeceraExportarExcelRemesasTransito(row);				
			//	iRow++;
			//}				
			
			//for(RemesasTransito remesastransitoAux:remesastransitosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRemesasTransito(remesastransitoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
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
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRemesasTransito(false);
			
			//SI ES MANUAL
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRemesasTransito();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRemesasTransito(false);
			
			//SI ES MANUAL
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRemesasTransito();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRemesasTransito(false);
			
			//SI ES MANUAL
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRemesasTransito();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRemesasTransito() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRemesasTransito.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRemesasTransito.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRemesasTransito.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRemesasTransito.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRemesasTransito.setMinimumSize(dimensionMinimum);
		this.jTableDatosRemesasTransito.setMaximumSize(dimensionMaximum);
		this.jTableDatosRemesasTransito.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRemesasTransito(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRemesasTransito(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRemesasTransito(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRemesasTransito(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRemesasTransito(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRemesasTransito(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRemesasTransito(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRemesasTransito(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRemesasTransito() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRemesasTransito();
		
		this.inicializarActualizarBindingBotonesManualRemesasTransito(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRemesasTransito();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRemesasTransito() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRemesasTransito(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRemesasTransito(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRemesasTransito.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRemesasTransito.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRemesasTransito.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRemesasTransito.jCheckBoxPostAccionNuevoRemesasTransito.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRemesasTransito.jCheckBoxPostAccionSinCerrarRemesasTransito.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRemesasTransito.jCheckBoxPostAccionSinMensajeRemesasTransito.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRemesasTransito.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRemesasTransito.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRemesasTransito.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
				this.jInternalFrameDetalleFormRemesasTransito.jCheckBoxPostAccionNuevoRemesasTransito.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRemesasTransito.jCheckBoxPostAccionSinCerrarRemesasTransito.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRemesasTransito.jCheckBoxPostAccionSinMensajeRemesasTransito.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRemesasTransito.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRemesasTransito.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRemesasTransito.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRemesasTransito.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRemesasTransito.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRemesasTransito.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRemesasTransito.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRemesasTransito.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRemesasTransito.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRemesasTransito(Boolean esInicializar) throws Exception {
		try	{	
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRemesasTransito(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRemesasTransito() throws Exception {
		try	{
			if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRemesasTransito();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRemesasTransito() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRemesasTransito() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRemesasTransito.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRemesasTransito.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRemesasTransito.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRemesasTransito.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRemesasTransito.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRemesasTransito.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRemesasTransito.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRemesasTransito.addItem(reporte);
			}
			
			
			if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRemesasTransito.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRemesasTransito.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRemesasTransito.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRemesasTransito.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRemesasTransito.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRemesasTransito.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRemesasTransito.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRemesasTransito.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRemesasTransito.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRemesasTransito();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRemesasTransito() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
				this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
				this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
				
				if(this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRemesasTransito.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRemesasTransito.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RemesasTransitoConstantesFunciones.getTiposSeleccionarRemesasTransito(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RemesasTransitoConstantesFunciones.getTiposSeleccionarRemesasTransito(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RemesasTransitoConstantesFunciones.getTiposSeleccionarRemesasTransito(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRemesasTransito.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRemesasTransito.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRemesasTransito()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaRemesasTransito=Long.parseLong(this.jLabelidRemesasTransitoBusquedaRemesasTransito.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRemesasTransito(Boolean esInicializar) throws Exception {				
		if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRemesasTransito();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRemesasTransito() throws Exception {
		this.inicializarActualizarBindingTablaRemesasTransito(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRemesasTransito() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRemesasTransitoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransitoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRemesasTransito(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=remesastransitoLogic.getRemesasTransitos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=remesastransitos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRemesasTransito.setModel(new RemesasTransitoModel(this.remesastransitoLogic.getRemesasTransitos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRemesasTransito.setModel(new RemesasTransitoModel(this.remesastransitos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRemesasTransito!=null && this.jInternalFrameOrderByRemesasTransito.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRemesasTransito();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO,remesastransitoConstantesFunciones.resaltarSeleccionarRemesasTransito,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RemesasTransitoConstantesFunciones.SCLASSWEBTITULO,remesastransitoConstantesFunciones.resaltarSeleccionarRemesasTransito,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_ID));

		if(this.remesastransitoConstantesFunciones.mostraridRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.remesastransitoConstantesFunciones.resaltaridRemesasTransito,this.remesastransitoConstantesFunciones.activaridRemesasTransito,iSizeTabla,this,true,"idRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltaridRemesasTransito,this.remesastransitoConstantesFunciones.activaridRemesasTransito,this,true,"idRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO));

		if(this.remesastransitoConstantesFunciones.mostrarnombre_bancoRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.remesastransitoConstantesFunciones.resaltarnombre_bancoRemesasTransito,this.remesastransitoConstantesFunciones.activarnombre_bancoRemesasTransito,iSizeTabla,this,true,"nombre_bancoRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarnombre_bancoRemesasTransito,this.remesastransitoConstantesFunciones.activarnombre_bancoRemesasTransito,this,true,"nombre_bancoRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR));

		if(this.remesastransitoConstantesFunciones.mostrarnombre_giradorRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.remesastransitoConstantesFunciones.resaltarnombre_giradorRemesasTransito,this.remesastransitoConstantesFunciones.activarnombre_giradorRemesasTransito,iSizeTabla,this,true,"nombre_giradorRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarnombre_giradorRemesasTransito,this.remesastransitoConstantesFunciones.activarnombre_giradorRemesasTransito,this,true,"nombre_giradorRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.remesastransitoConstantesFunciones.mostrarfecha_vencimientoRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.remesastransitoConstantesFunciones.resaltarfecha_vencimientoRemesasTransito,this.remesastransitoConstantesFunciones.activarfecha_vencimientoRemesasTransito,iSizeTabla,this,true,"fecha_vencimientoRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.remesastransitoConstantesFunciones.resaltarfecha_vencimientoRemesasTransito,this.remesastransitoConstantesFunciones.activarfecha_vencimientoRemesasTransito,this,true,"fecha_vencimientoRemesasTransito","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.remesastransitoConstantesFunciones.mostrarnumero_cuentaRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_cuentaRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_cuentaRemesasTransito,iSizeTabla,this,true,"numero_cuentaRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_cuentaRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_cuentaRemesasTransito,this,true,"numero_cuentaRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.remesastransitoConstantesFunciones.mostrarnumero_chequeRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_chequeRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_chequeRemesasTransito,iSizeTabla,this,true,"numero_chequeRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_chequeRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_chequeRemesasTransito,this,true,"numero_chequeRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_VALORMONTO));

		if(this.remesastransitoConstantesFunciones.mostrarvalor_montoRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_VALORMONTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.remesastransitoConstantesFunciones.resaltarvalor_montoRemesasTransito,this.remesastransitoConstantesFunciones.activarvalor_montoRemesasTransito,iSizeTabla,this,true,"valor_montoRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarvalor_montoRemesasTransito,this.remesastransitoConstantesFunciones.activarvalor_montoRemesasTransito,this,true,"valor_montoRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_VALOR));

		if(this.remesastransitoConstantesFunciones.mostrarvalorRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.remesastransitoConstantesFunciones.resaltarvalorRemesasTransito,this.remesastransitoConstantesFunciones.activarvalorRemesasTransito,iSizeTabla,this,true,"valorRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarvalorRemesasTransito,this.remesastransitoConstantesFunciones.activarvalorRemesasTransito,this,true,"valorRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.remesastransitoConstantesFunciones.mostrarnumero_mayorRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_mayorRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_mayorRemesasTransito,iSizeTabla,this,true,"numero_mayorRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_mayorRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_mayorRemesasTransito,this,true,"numero_mayorRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_CODIGO));

		if(this.remesastransitoConstantesFunciones.mostrarcodigoRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.remesastransitoConstantesFunciones.resaltarcodigoRemesasTransito,this.remesastransitoConstantesFunciones.activarcodigoRemesasTransito,iSizeTabla,this,true,"codigoRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarcodigoRemesasTransito,this.remesastransitoConstantesFunciones.activarcodigoRemesasTransito,this,true,"codigoRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL));

		if(this.remesastransitoConstantesFunciones.mostrarfecha_vencimiento_originalRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.remesastransitoConstantesFunciones.resaltarfecha_vencimiento_originalRemesasTransito,this.remesastransitoConstantesFunciones.activarfecha_vencimiento_originalRemesasTransito,iSizeTabla,this,true,"fecha_vencimiento_originalRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.remesastransitoConstantesFunciones.resaltarfecha_vencimiento_originalRemesasTransito,this.remesastransitoConstantesFunciones.activarfecha_vencimiento_originalRemesasTransito,this,true,"fecha_vencimiento_originalRemesasTransito","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO));

		if(this.remesastransitoConstantesFunciones.mostrarnumero_cambioRemesasTransito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_cambioRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_cambioRemesasTransito,iSizeTabla,this,true,"numero_cambioRemesasTransito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.remesastransitoConstantesFunciones.resaltarnumero_cambioRemesasTransito,this.remesastransitoConstantesFunciones.activarnumero_cambioRemesasTransito,this,true,"numero_cambioRemesasTransito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RemesasTransitoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.remesastransitoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.remesastransitoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRemesasTransito.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.remesastransitoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.remesastransitoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRemesasTransito.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.remesastransitoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.remesastransitoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRemesasTransito.addColumn(tableColumn);
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
			
			this.jTableDatosRemesasTransito.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRemesasTransito.moveColumn(this.jTableDatosRemesasTransito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRemesasTransito.moveColumn(this.jTableDatosRemesasTransito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRemesasTransito.moveColumn(this.jTableDatosRemesasTransito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRemesasTransito.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRemesasTransito.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRemesasTransito,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRemesasTransito.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRemesasTransito.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRemesasTransito.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRemesasTransito.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRemesasTransito.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=remesastransitoLogic.getRemesasTransitos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=remesastransitos.size()-1;
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
		//this.jTableDatosRemesasTransito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRemesasTransito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRemesasTransito();
			
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
				
				//this.isEsNuevoRemesasTransito=false;
					
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
				if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRemesasTransito==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRemesasTransito.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRemesasTransito.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.remesastransito.getsType().equals("DUPLICADO")
				   || this.remesastransito.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRemesasTransito=true;
				
				} else {
					this.isEsNuevoRemesasTransito=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
					if(this.remesastransito.getId()>=0 && !this.remesastransito.getIsNew()) {						
						this.isEsNuevoRemesasTransito=false;
						
					} else {
						this.isEsNuevoRemesasTransito=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRemesasTransito(esRelaciones);						
				
				this.seleccionarRemesasTransito(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.remesastransito.getId()<0) {
					this.isEsNuevoRemesasTransito=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRemesasTransito(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRemesasTransito(evt,rowIndex);
				}	
				
				if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RemesasTransito: " + this.dDif); 
					}
				}								
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRemesasTransito(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.remesastransito)) {
					if(this.remesastransito.getId()>0) {
						this.remesastransito.setIsDeleted(true);
						
						this.remesastransitosEliminados.add(this.remesastransito);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.remesastransitoLogic.getRemesasTransitos().remove(this.remesastransito);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.remesastransitos.remove(this.remesastransito);				
					}
					
					
					((RemesasTransitoModel) this.jTableDatosRemesasTransito.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRemesasTransito(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRemesasTransito(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRemesasTransito) {
			
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRemesasTransito.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRemesasTransito.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRemesasTransito(this.remesastransito);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRemesasTransito("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRemesasTransito(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRemesasTransito() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRemesasTransito(RemesasTransito remesastransito) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRemesasTransito(remesastransito,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRemesasTransito(RemesasTransito remesastransito,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRemesasTransito(remesastransito);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRemesasTransito(remesastransito,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRemesasTransito(remesastransito);
	}
	
	public void setVariablesObjetoActualToFormularioRemesasTransito(RemesasTransito remesastransito) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.setText(remesastransito.getId().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.setText(remesastransito.getnombre_banco());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.setText(remesastransito.getnombre_girador());
			this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.setDate(remesastransito.getfecha_vencimiento());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.setText(remesastransito.getnumero_cuenta());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.setText(remesastransito.getnumero_cheque());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.setText(remesastransito.getvalor_monto().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.setText(remesastransito.getvalor().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.setText(remesastransito.getnumero_mayor());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.setText(remesastransito.getcodigo());
			this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.setDate(remesastransito.getfecha_vencimiento_original());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.setText(remesastransito.getnumero_cambio().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RemesasTransito remesastransitoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,remesastransitoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RemesasTransito remesastransitoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				remesastransitoLocal=this.remesastransito;
			} else {
				remesastransitoLocal=this.remesastransitoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(remesastransitoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRemesasTransito(remesastransitoLocal,true);
					
					if(remesastransitoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(remesastransitoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(remesastransitoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRemesasTransito(RemesasTransito remesastransito,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRemesasTransito(remesastransito,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(remesastransito);
	}
	
	public void setVariablesFormularioToObjetoActualRemesasTransito(RemesasTransito remesastransito,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRemesasTransito(remesastransito,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRemesasTransito(RemesasTransito remesastransito,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.getText()==null || this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.getText()=="" || this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.getText()=="Id") {
				this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.setText("0");
			}

			if(conColumnasBase) {remesastransito.setId(Long.parseLong(this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelIdRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setnombre_banco(this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnombre_bancoRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setnombre_girador(this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnombre_giradorRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setfecha_vencimiento(this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelfecha_vencimientoRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setnumero_cuenta(this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_cuentaRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setnumero_cheque(this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_chequeRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setvalor_monto(Double.parseDouble(this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_VALORMONTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelvalor_montoRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelvalorRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setnumero_mayor(this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_mayorRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setcodigo(this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelcodigoRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setfecha_vencimiento_original(this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelfecha_vencimiento_originalRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			remesastransito.setnumero_cambio(Integer.parseInt(this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRemesasTransito.jLabelnumero_cambioRemesasTransito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRemesasTransito(RemesasTransito remesastransitoBean,RemesasTransito remesastransito,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRemesasTransito(RemesasTransito remesastransitoOrigen,RemesasTransito remesastransito,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && remesastransitoOrigen.getId()!=null && !remesastransitoOrigen.getId().equals(0L))) {remesastransito.setId(remesastransitoOrigen.getId());}}
			if(conDefault || (!conDefault && remesastransitoOrigen.getnombre_banco()!=null && !remesastransitoOrigen.getnombre_banco().equals(""))) {remesastransito.setnombre_banco(remesastransitoOrigen.getnombre_banco());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getnombre_girador()!=null && !remesastransitoOrigen.getnombre_girador().equals(""))) {remesastransito.setnombre_girador(remesastransitoOrigen.getnombre_girador());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getfecha_vencimiento()!=null && !remesastransitoOrigen.getfecha_vencimiento().equals(new Date()))) {remesastransito.setfecha_vencimiento(remesastransitoOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getnumero_cuenta()!=null && !remesastransitoOrigen.getnumero_cuenta().equals(""))) {remesastransito.setnumero_cuenta(remesastransitoOrigen.getnumero_cuenta());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getnumero_cheque()!=null && !remesastransitoOrigen.getnumero_cheque().equals(""))) {remesastransito.setnumero_cheque(remesastransitoOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getvalor_monto()!=null && !remesastransitoOrigen.getvalor_monto().equals(0.0))) {remesastransito.setvalor_monto(remesastransitoOrigen.getvalor_monto());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getvalor()!=null && !remesastransitoOrigen.getvalor().equals(0.0))) {remesastransito.setvalor(remesastransitoOrigen.getvalor());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getnumero_mayor()!=null && !remesastransitoOrigen.getnumero_mayor().equals(""))) {remesastransito.setnumero_mayor(remesastransitoOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getcodigo()!=null && !remesastransitoOrigen.getcodigo().equals(""))) {remesastransito.setcodigo(remesastransitoOrigen.getcodigo());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getfecha_vencimiento_original()!=null && !remesastransitoOrigen.getfecha_vencimiento_original().equals(new Date()))) {remesastransito.setfecha_vencimiento_original(remesastransitoOrigen.getfecha_vencimiento_original());}
			if(conDefault || (!conDefault && remesastransitoOrigen.getnumero_cambio()!=null && !remesastransitoOrigen.getnumero_cambio().equals(0))) {remesastransito.setnumero_cambio(remesastransitoOrigen.getnumero_cambio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRemesasTransito(RemesasTransito remesastransito) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.setText(remesastransito.getId().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.setText(remesastransito.getnombre_banco());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.setText(remesastransito.getnombre_girador());
			this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.setDate(remesastransito.getfecha_vencimiento());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.setText(remesastransito.getnumero_cuenta());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.setText(remesastransito.getnumero_cheque());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.setText(remesastransito.getvalor_monto().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.setText(remesastransito.getvalor().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.setText(remesastransito.getnumero_mayor());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.setText(remesastransito.getcodigo());
			this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.setDate(remesastransito.getfecha_vencimiento_original());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.setText(remesastransito.getnumero_cambio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRemesasTransito(RemesasTransitoBean remesastransitoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.setText(remesastransitoBean.getId().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.setText(remesastransitoBean.getnombre_banco());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.setText(remesastransitoBean.getnombre_girador());
			this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.setDate(remesastransitoBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.setText(remesastransitoBean.getnumero_cuenta());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.setText(remesastransitoBean.getnumero_cheque());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.setText(remesastransitoBean.getvalor_monto().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.setText(remesastransitoBean.getvalor().toString());
			this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.setText(remesastransitoBean.getnumero_mayor());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.setText(remesastransitoBean.getcodigo());
			this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.setDate(remesastransitoBean.getfecha_vencimiento_original());
			this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.setText(remesastransitoBean.getnumero_cambio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRemesasTransito(RemesasTransitoParameterReturnGeneral remesastransitoReturnGeneral,RemesasTransitoBean remesastransitoBean,Boolean conDefault) throws Exception { 
		try {
			RemesasTransito remesastransitoLocal=new RemesasTransito();
			
			remesastransitoLocal=remesastransitoReturnGeneral.getRemesasTransito();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && remesastransitoLocal.getId()!=null && !remesastransitoLocal.getId().equals(0L))) {remesastransitoBean.setId(remesastransitoLocal.getId());}}
			if(conDefault || (!conDefault && remesastransitoLocal.getnombre_banco()!=null && !remesastransitoLocal.getnombre_banco().equals(""))) {remesastransitoBean.setnombre_banco(remesastransitoLocal.getnombre_banco());}
			if(conDefault || (!conDefault && remesastransitoLocal.getnombre_girador()!=null && !remesastransitoLocal.getnombre_girador().equals(""))) {remesastransitoBean.setnombre_girador(remesastransitoLocal.getnombre_girador());}
			if(conDefault || (!conDefault && remesastransitoLocal.getfecha_vencimiento()!=null && !remesastransitoLocal.getfecha_vencimiento().equals(new Date()))) {remesastransitoBean.setfecha_vencimiento(remesastransitoLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && remesastransitoLocal.getnumero_cuenta()!=null && !remesastransitoLocal.getnumero_cuenta().equals(""))) {remesastransitoBean.setnumero_cuenta(remesastransitoLocal.getnumero_cuenta());}
			if(conDefault || (!conDefault && remesastransitoLocal.getnumero_cheque()!=null && !remesastransitoLocal.getnumero_cheque().equals(""))) {remesastransitoBean.setnumero_cheque(remesastransitoLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && remesastransitoLocal.getvalor_monto()!=null && !remesastransitoLocal.getvalor_monto().equals(0.0))) {remesastransitoBean.setvalor_monto(remesastransitoLocal.getvalor_monto());}
			if(conDefault || (!conDefault && remesastransitoLocal.getvalor()!=null && !remesastransitoLocal.getvalor().equals(0.0))) {remesastransitoBean.setvalor(remesastransitoLocal.getvalor());}
			if(conDefault || (!conDefault && remesastransitoLocal.getnumero_mayor()!=null && !remesastransitoLocal.getnumero_mayor().equals(""))) {remesastransitoBean.setnumero_mayor(remesastransitoLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && remesastransitoLocal.getcodigo()!=null && !remesastransitoLocal.getcodigo().equals(""))) {remesastransitoBean.setcodigo(remesastransitoLocal.getcodigo());}
			if(conDefault || (!conDefault && remesastransitoLocal.getfecha_vencimiento_original()!=null && !remesastransitoLocal.getfecha_vencimiento_original().equals(new Date()))) {remesastransitoBean.setfecha_vencimiento_original(remesastransitoLocal.getfecha_vencimiento_original());}
			if(conDefault || (!conDefault && remesastransitoLocal.getnumero_cambio()!=null && !remesastransitoLocal.getnumero_cambio().equals(0))) {remesastransitoBean.setnumero_cambio(remesastransitoLocal.getnumero_cambio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRemesasTransitoGenerico(Long idRemesasTransitoSeleccionado,JComboBox jComboBoxRemesasTransito,List<RemesasTransito> remesastransitosLocal)throws Exception {
		try {
			RemesasTransito  remesastransitoTemp=null;

			for(RemesasTransito remesastransitoAux:remesastransitosLocal) {
				if(remesastransitoAux.getId()!=null && remesastransitoAux.getId().equals(idRemesasTransitoSeleccionado)) {
					remesastransitoTemp=remesastransitoAux;
					break;
				}
			}

			jComboBoxRemesasTransito.setSelectedItem(remesastransitoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRemesasTransitoGenerico(JComboBox jComboBoxRemesasTransito,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRemesasTransito.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRemesasTransito.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRemesasTransito.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRemesasTransito.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRemesasTransito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRemesasTransito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			remesastransito=(RemesasTransito) remesastransitoLogic.getRemesasTransitos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			remesastransito =(RemesasTransito) remesastransitos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!remesastransito.getIsNew() && !remesastransito.getIsChanged() && !remesastransito.getIsDeleted()) {
				sDescripcion=remesastransito.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=remesastransito.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RemesasTransito remesastransitoRow=new RemesasTransito();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			remesastransitoRow=(RemesasTransito) remesastransitoLogic.getRemesasTransitos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			remesastransitoRow=(RemesasTransito) remesastransitos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRemesasTransito(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRemesasTransito && this.isPermisoNuevoRemesasTransito));			
			this.jButtonDuplicarRemesasTransito.setVisible((this.isVisibilidadCeldaDuplicarRemesasTransito && this.isPermisoDuplicarRemesasTransito));			
			this.jButtonCopiarRemesasTransito.setVisible((this.isVisibilidadCeldaCopiarRemesasTransito && this.isPermisoCopiarRemesasTransito));
			this.jButtonVerFormRemesasTransito.setVisible((this.isVisibilidadCeldaVerFormRemesasTransito && this.isPermisoVerFormRemesasTransito));
			
			this.jButtonAbrirOrderByRemesasTransito.setVisible((this.isVisibilidadCeldaOrdenRemesasTransito && this.isPermisoOrdenRemesasTransito));			
			
			this.jButtonNuevoRelacionesRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRelacionesRemesasTransito && this.isPermisoNuevoRemesasTransito));			
			this.jButtonNuevoGuardarCambiosRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRemesasTransito && this.isPermisoNuevoRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));
			
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarRemesasTransito.setVisible((this.isVisibilidadCeldaModificarRemesasTransito && this.isPermisoActualizarRemesasTransito));	
			this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarRemesasTransito.setVisible((this.isVisibilidadCeldaActualizarRemesasTransito && this.isPermisoActualizarRemesasTransito));	
			this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarRemesasTransito.setVisible((this.isVisibilidadCeldaEliminarRemesasTransito && this.isPermisoEliminarRemesasTransito));
			this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarRemesasTransito.setVisible(this.isVisibilidadCeldaCancelarRemesasTransito);							
			this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.setVisible((this.isVisibilidadCeldaGuardarRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));			
			
			}
						
			this.jButtonGuardarCambiosTablaRemesasTransito.setVisible((this.isVisibilidadCeldaGuardarCambiosRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRemesasTransito && this.isPermisoNuevoRemesasTransito));						
			this.jButtonDuplicarToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaDuplicarRemesasTransito && this.isPermisoDuplicarRemesasTransito));						
			this.jButtonCopiarToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaCopiarRemesasTransito && this.isPermisoCopiarRemesasTransito));			
			this.jButtonVerFormToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaVerFormRemesasTransito && this.isPermisoVerFormRemesasTransito));			
			this.jButtonAbrirOrderByToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaOrdenRemesasTransito && this.isPermisoOrdenRemesasTransito));
			this.jButtonNuevoRelacionesToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRelacionesRemesasTransito && this.isPermisoNuevoRemesasTransito));			
			this.jButtonNuevoGuardarCambiosToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRemesasTransito && this.isPermisoNuevoRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));			
			
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaModificarRemesasTransito && this.isPermisoActualizarRemesasTransito));	
			this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaActualizarRemesasTransito  && this.isPermisoActualizarRemesasTransito));	
			this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaEliminarRemesasTransito && this.isPermisoEliminarRemesasTransito));
			this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarToolBarRemesasTransito.setVisible(this.isVisibilidadCeldaCancelarRemesasTransito);				
			this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaGuardarRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRemesasTransito.setVisible((this.isVisibilidadCeldaGuardarCambiosRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRemesasTransito && this.isPermisoNuevoRemesasTransito));			
			this.jMenuItemDuplicarRemesasTransito.setVisible((this.isVisibilidadCeldaDuplicarRemesasTransito && this.isPermisoDuplicarRemesasTransito));			
			this.jMenuItemCopiarRemesasTransito.setVisible((this.isVisibilidadCeldaCopiarRemesasTransito && this.isPermisoCopiarRemesasTransito));			
			this.jMenuItemVerFormRemesasTransito.setVisible((this.isVisibilidadCeldaVerFormRemesasTransito && this.isPermisoVerFormRemesasTransito));			
			this.jMenuItemAbrirOrderByRemesasTransito.setVisible((this.isVisibilidadCeldaOrdenRemesasTransito && this.isPermisoOrdenRemesasTransito));			
			//this.jMenuItemMostrarOcultarRemesasTransito.setVisible((this.isVisibilidadCeldaOrdenRemesasTransito && this.isPermisoOrdenRemesasTransito));
			this.jMenuItemDetalleAbrirOrderByRemesasTransito.setVisible((this.isVisibilidadCeldaOrdenRemesasTransito && this.isPermisoOrdenRemesasTransito));			
			//this.jMenuItemDetalleMostrarOcultarRemesasTransito.setVisible((this.isVisibilidadCeldaOrdenRemesasTransito && this.isPermisoOrdenRemesasTransito));			
			this.jMenuItemNuevoRelacionesRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRelacionesRemesasTransito && this.isPermisoNuevoRemesasTransito));			
			this.jMenuItemNuevoGuardarCambiosRemesasTransito.setVisible((this.isVisibilidadCeldaNuevoRemesasTransito && this.isPermisoNuevoRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));									
			
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemModificarRemesasTransito.setVisible((this.isVisibilidadCeldaModificarRemesasTransito && this.isPermisoActualizarRemesasTransito));	
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemActualizarRemesasTransito.setVisible((this.isVisibilidadCeldaActualizarRemesasTransito && this.isPermisoActualizarRemesasTransito));	
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemEliminarRemesasTransito.setVisible((this.isVisibilidadCeldaEliminarRemesasTransito && this.isPermisoEliminarRemesasTransito));
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemCancelarRemesasTransito.setVisible(this.isVisibilidadCeldaCancelarRemesasTransito);				
			}
			
			this.jMenuItemGuardarCambiosRemesasTransito.setVisible((this.isVisibilidadCeldaGuardarRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));						
			this.jMenuItemGuardarCambiosTablaRemesasTransito.setVisible((this.isVisibilidadCeldaGuardarCambiosRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRemesasTransito=this.jButtonNuevoRemesasTransito.isVisible();
			this.isVisibilidadCeldaDuplicarRemesasTransito=this.jButtonDuplicarRemesasTransito.isVisible();
			this.isVisibilidadCeldaCopiarRemesasTransito=this.jButtonCopiarRemesasTransito.isVisible();
			this.isVisibilidadCeldaVerFormRemesasTransito=this.jButtonVerFormRemesasTransito.isVisible();
			
			this.isVisibilidadCeldaOrdenRemesasTransito=this.jButtonAbrirOrderByRemesasTransito.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=this.jButtonNuevoRelacionesRemesasTransito.isVisible();
			this.isVisibilidadCeldaModificarRemesasTransito=this.jButtonModificarRemesasTransito.isVisible();
			
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.isVisibilidadCeldaActualizarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarRemesasTransito.isVisible();
			this.isVisibilidadCeldaEliminarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarRemesasTransito.isVisible();
			this.isVisibilidadCeldaCancelarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarRemesasTransito.isVisible();
			this.isVisibilidadCeldaGuardarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=this.jButtonGuardarCambiosTablaRemesasTransito.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRemesasTransito=this.jButtonNuevoToolBarRemesasTransito.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=this.jButtonNuevoRelacionesToolBarRemesasTransito.isVisible();
			
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.isVisibilidadCeldaModificarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarToolBarRemesasTransito.isVisible();
			this.isVisibilidadCeldaActualizarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarToolBarRemesasTransito.isVisible();
			this.isVisibilidadCeldaEliminarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarToolBarRemesasTransito.isVisible();
			this.isVisibilidadCeldaCancelarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarToolBarRemesasTransito.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRemesasTransito=this.jButtonGuardarCambiosToolBarRemesasTransito.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=this.jButtonGuardarCambiosTablaToolBarRemesasTransito.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRemesasTransito=this.jMenuItemNuevoRemesasTransito.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=this.jMenuItemNuevoRelacionesRemesasTransito.isVisible();
			
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.isVisibilidadCeldaModificarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jMenuItemModificarRemesasTransito.isVisible();
			this.isVisibilidadCeldaActualizarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jMenuItemActualizarRemesasTransito.isVisible();
			this.isVisibilidadCeldaEliminarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jMenuItemEliminarRemesasTransito.isVisible();
			this.isVisibilidadCeldaCancelarRemesasTransito=this.jInternalFrameDetalleFormRemesasTransito.jMenuItemCancelarRemesasTransito.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRemesasTransito=this.jMenuItemGuardarCambiosRemesasTransito.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=this.jMenuItemGuardarCambiosTablaRemesasTransito.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRemesasTransito(Boolean esInicializar) {
		if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
				//if(this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRemesasTransito();
			}
			
			this.inicializarActualizarBindingBotonesManualRemesasTransito(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRemesasTransito() {
		this.jButtonNuevoRemesasTransito.setVisible(this.isPermisoNuevoRemesasTransito);			
		this.jButtonDuplicarRemesasTransito.setVisible(this.isPermisoDuplicarRemesasTransito);			
		this.jButtonCopiarRemesasTransito.setVisible(this.isPermisoCopiarRemesasTransito);			
		this.jButtonVerFormRemesasTransito.setVisible(this.isPermisoVerFormRemesasTransito);			
		
		this.jButtonAbrirOrderByRemesasTransito.setVisible(this.isPermisoOrdenRemesasTransito);					
		
		this.jButtonNuevoRelacionesRemesasTransito.setVisible(this.isPermisoNuevoRemesasTransito);			
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarRemesasTransito.setVisible(this.isPermisoActualizarRemesasTransito);	
			this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarRemesasTransito.setVisible(this.isPermisoActualizarRemesasTransito);	
			this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarRemesasTransito.setVisible(this.isPermisoEliminarRemesasTransito);
			this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarRemesasTransito.setVisible(this.isVisibilidadCeldaCancelarRemesasTransito);						
			this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.setVisible(this.isPermisoGuardarCambiosRemesasTransito);							
		}
		
		this.jButtonGuardarCambiosTablaRemesasTransito.setVisible(this.isPermisoActualizarRemesasTransito);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRemesasTransito() {
		this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarRemesasTransito.setVisible(this.isPermisoActualizarRemesasTransito);	
		this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarRemesasTransito.setVisible(this.isPermisoActualizarRemesasTransito);	
		this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarRemesasTransito.setVisible(this.isPermisoEliminarRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarRemesasTransito.setVisible(this.isVisibilidadCeldaCancelarRemesasTransito);							
		this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.setVisible((this.isVisibilidadCeldaGuardarRemesasTransito && this.isPermisoGuardarCambiosRemesasTransito));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRemesasTransito() {
		if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRemesasTransito();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRemesasTransito() {
	}
	
	public void jTableDatosRemesasTransitoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRemesasTransito(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.remesastransito.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRemesasTransitoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRemesasTransito(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRemesasTransito.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRemesasTransito.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.remesastransitoLogic.getConnexion());

				if(this.remesastransito.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.remesastransito.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRemesasTransito=(TitledBorder)this.jScrollPanelDatosRemesasTransito.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRemesasTransito.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.remesastransito.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_bancoRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getnombre_banco()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_banco like '%"+this.remesastransito.getnombre_banco()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_giradorRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getnombre_girador()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_girador like '%"+this.remesastransito.getnombre_girador()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.remesastransito.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.remesastransito.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.remesastransito.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_montoRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getvalor_monto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_monto = "+this.remesastransito.getvalor_monto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.remesastransito.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.remesastransito.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.remesastransito.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimiento_originalRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getfecha_vencimiento_original()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento_original = '"+Funciones2.getStringPostgresDate(this.remesastransito.getfecha_vencimiento_original())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cambioRemesasTransitoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.getremesastransito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.remesastransito==null) {
						this.remesastransito = new RemesasTransito();
					}

					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);
				}

				if(this.remesastransito.getnumero_cambio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cambio = "+this.remesastransito.getnumero_cambio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRemesasTransito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaRemesasTransitoRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRemesasTransito(false,false);

			this.getRemesasTransitosBusquedaRemesasTransito();

			this.inicializarActualizarBindingRemesasTransito(false);

			//if(RemesasTransitoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRemesasTransito(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRemesasTransitoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRemesasTransito(false,false);

			this.getRemesasTransitosFK_IdEmpresa();

			this.inicializarActualizarBindingRemesasTransito(false);

			//if(RemesasTransitoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRemesasTransito(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.remesastransitoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRemesasTransito() {
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
			this.jInternalFrameDetalleFormRemesasTransito.setVisible(false);	    			
			this.jInternalFrameDetalleFormRemesasTransito.dispose();
			this.jInternalFrameDetalleFormRemesasTransito=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
			this.jInternalFrameReporteDinamicoRemesasTransito.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRemesasTransito.dispose();
			this.jInternalFrameReporteDinamicoRemesasTransito=null;
		}
		
		if(this.jInternalFrameImportacionRemesasTransito!=null) {
			this.jInternalFrameImportacionRemesasTransito.setVisible(false);	    			
			this.jInternalFrameImportacionRemesasTransito.dispose();
			this.jInternalFrameImportacionRemesasTransito=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRemesasTransito();
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
			
			if(sTipo.equals("NuevoRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRemesasTransito")) {
				jButtonDuplicarRemesasTransitoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRemesasTransito")) {
				jButtonCopiarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("VerFormRemesasTransito")) {
				jButtonVerFormRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRemesasTransito")) {
				jButtonDuplicarRemesasTransitoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRemesasTransito")) {
				jButtonDuplicarRemesasTransitoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRemesasTransito")) {
				jButtonModificarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRemesasTransito")) {
				jButtonModificarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRemesasTransito")) {
				jButtonModificarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRemesasTransito")) {
				jButtonActualizarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRemesasTransito")) {
				jButtonActualizarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRemesasTransito")) {
				jButtonActualizarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("EliminarRemesasTransito")) {
				jButtonEliminarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRemesasTransito")) {
				jButtonEliminarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRemesasTransito")) {
				jButtonEliminarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("CancelarRemesasTransito")) {
				jButtonCancelarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRemesasTransito")) {
				jButtonCancelarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRemesasTransito")) {
				jButtonCancelarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("CerrarRemesasTransito")) {
				jButtonCerrarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRemesasTransito")) {
				jButtonCerrarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRemesasTransito")) {
				jButtonCerrarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRemesasTransito")) {
				jButtonMostrarOcultarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRemesasTransito")) {
				jButtonCancelarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRemesasTransito")) {
				jButtonCopiarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRemesasTransito")) {
				jButtonVerFormRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRemesasTransito")) {
				jButtonCopiarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRemesasTransito")) {
				jButtonVerFormRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRemesasTransito")) {
				jButtonRecargarInformacionRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRemesasTransito")) {
				jButtonRecargarInformacionRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRemesasTransito")) {
				jButtonRecargarInformacionRemesasTransitoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRemesasTransito")) {
				jButtonAnterioresRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRemesasTransito")) {
				jButtonAnterioresRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRemesasTransito")) {
				jButtonAnterioresRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRemesasTransito")) {
				jButtonSiguientesRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRemesasTransito")) {
				jButtonSiguientesRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRemesasTransito")) {
				jButtonSiguientesRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRemesasTransito") || sTipo.equals("MenuItemDetalleAbrirOrderByRemesasTransito")) {
				jButtonAbrirOrderByRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRemesasTransito") || sTipo.equals("MenuItemDetalleMostrarOcultarRemesasTransito")) {
				jButtonMostrarOcultarRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRemesasTransito")) {
				jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRemesasTransito")) {
				jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRemesasTransito")) {
				jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRemesasTransito")) {
				jButtonCerrarReporteDinamicoRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRemesasTransito")) {
				jButtonGenerarReporteDinamicoRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRemesasTransito")) {
				
				jButtonGenerarExcelReporteDinamicoRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRemesasTransito")) {
				jButtonCerrarImportacionRemesasTransitoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRemesasTransito")) {
				
				jButtonGenerarImportacionRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRemesasTransito")) {
				
				jButtonAbrirImportacionRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRemesasTransito")) {
				jComboBoxTiposAccionesRemesasTransitoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRemesasTransito")) {
				jComboBoxTiposRelacionesRemesasTransitoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRemesasTransito")) {
				jComboBoxTiposAccionesRemesasTransitoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRemesasTransito")) {
				
				jComboBoxTiposSeleccionarRemesasTransitoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRemesasTransito")) {
				jTextFieldValorCampoGeneralRemesasTransitoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRemesasTransito")) {
				jButtonAbrirOrderByRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRemesasTransito")) {
				jButtonAbrirOrderByRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRemesasTransito")) {
				jButtonCerrarOrderByRemesasTransitoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRemesasTransitoBusqueda")) {
				this.jButtonidRemesasTransitoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRemesasTransitoUpdate")) {
				this.jButtonid_empresaRemesasTransitoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRemesasTransitoBusqueda")) {
				this.jButtonid_empresaRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoRemesasTransitoBusqueda")) {
				this.jButtonnombre_bancoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_giradorRemesasTransitoBusqueda")) {
				this.jButtonnombre_giradorRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoRemesasTransitoBusqueda")) {
				this.jButtonfecha_vencimientoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaRemesasTransitoBusqueda")) {
				this.jButtonnumero_cuentaRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeRemesasTransitoBusqueda")) {
				this.jButtonnumero_chequeRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_montoRemesasTransitoBusqueda")) {
				this.jButtonvalor_montoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRemesasTransitoBusqueda")) {
				this.jButtonvalorRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorRemesasTransitoBusqueda")) {
				this.jButtonnumero_mayorRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRemesasTransitoBusqueda")) {
				this.jButtoncodigoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_originalRemesasTransitoBusqueda")) {
				this.jButtonfecha_vencimiento_originalRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cambioRemesasTransitoBusqueda")) {
				this.jButtonnumero_cambioRemesasTransitoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaRemesasTransitoRemesasTransito")) {
				this.jButtonBusquedaRemesasTransitoRemesasTransitoActionPerformed(evt);
			}
			
			;
			
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRemesasTransito();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRemesasTransitoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RemesasTransito remesastransitoLocal=null;
			
			if(!this.getEsControlTabla()) {
				remesastransitoLocal=this.remesastransito;
			} else {
				remesastransitoLocal=this.remesastransitoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
							
				
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
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
			
			


			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRemesasTransitoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
								
						
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
								
				
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
							
				
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRemesasTransitoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransitoAnterior =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.remesastransitoAnterior =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
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
			
			


			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
								
				
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRemesasTransitoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRemesasTransito")) {
					jCheckBoxSeleccionarTodosRemesasTransitoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRemesasTransito")) {
					jCheckBoxSeleccionadosRemesasTransitoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRemesasTransito")) {
					
				}
				
				


				
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
												
				
				


				
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRemesasTransitoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.remesastransitoAnterior =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.remesastransitoAnterior =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRemesasTransitoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
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
			
			


			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRemesasTransitoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.remesastransito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.remesastransito);
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
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
				
				


				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RemesasTransito.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RemesasTransito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRemesasTransitoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.remesastransitoAnterior =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRemesasTransito")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRemesasTransitoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRemesasTransito.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.remesastransito =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.remesastransito =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.remesastransito);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRemesasTransito")) {
				
				}
				
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRemesasTransito")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRemesasTransito.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRemesasTransito")) {
			
			}
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRemesasTransito();
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
			if(sTipo.equals("NuevoRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRemesasTransito")) {
				jButtonDuplicarRemesasTransitoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRemesasTransito")) {
				jButtonCopiarRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRemesasTransito")) {
				jButtonVerFormRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRemesasTransito")) {
				jButtonNuevoRemesasTransitoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRemesasTransito")) {
				jButtonModificarRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRemesasTransito")) {
				jButtonActualizarRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRemesasTransito")) {
				jButtonEliminarRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRemesasTransito")) {
				jButtonCancelarRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRemesasTransito")) {
				jButtonCerrarRemesasTransitoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRemesasTransito")) {
				jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRemesasTransito")) {
				jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRemesasTransito")) {
				jButtonAbrirOrderByRemesasTransitoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRemesasTransito")) {
				jButtonRecargarInformacionRemesasTransitoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRemesasTransito")) {
				jButtonAnterioresRemesasTransitoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRemesasTransito")) {
				jButtonSiguientesRemesasTransitoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRemesasTransitoBusqueda")) {
				this.jButtonidRemesasTransitoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRemesasTransitoUpdate")) {
				this.jButtonid_empresaRemesasTransitoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRemesasTransitoBusqueda")) {
				this.jButtonid_empresaRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_bancoRemesasTransitoBusqueda")) {
				this.jButtonnombre_bancoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_giradorRemesasTransitoBusqueda")) {
				this.jButtonnombre_giradorRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoRemesasTransitoBusqueda")) {
				this.jButtonfecha_vencimientoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaRemesasTransitoBusqueda")) {
				this.jButtonnumero_cuentaRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeRemesasTransitoBusqueda")) {
				this.jButtonnumero_chequeRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_montoRemesasTransitoBusqueda")) {
				this.jButtonvalor_montoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorRemesasTransitoBusqueda")) {
				this.jButtonvalorRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorRemesasTransitoBusqueda")) {
				this.jButtonnumero_mayorRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoRemesasTransitoBusqueda")) {
				this.jButtoncodigoRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimiento_originalRemesasTransitoBusqueda")) {
				this.jButtonfecha_vencimiento_originalRemesasTransitoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cambioRemesasTransitoBusqueda")) {
				this.jButtonnumero_cambioRemesasTransitoBusquedaActionPerformed(evt);
			}
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRemesasTransito();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRemesasTransito")) {
				closingInternalFrameRemesasTransito();
				
			} else if(sTipo.equals("jButtonCancelarRemesasTransito")) {
				JInternalFrameBase jInternalFrameDetalleFormRemesasTransito = (JInternalFrameBase)evt.getSource();
	            	
	            RemesasTransitoBeanSwingJInternalFrame jInternalFrameParent=(RemesasTransitoBeanSwingJInternalFrame)jInternalFrameDetalleFormRemesasTransito.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRemesasTransitoActionPerformed(null);
			}
			
			RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.remesastransito,new Object(),this.remesastransitoParameterGeneral,this.remesastransitoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRemesasTransito(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRemesasTransito(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRemesasTransito(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.remesastransito)) {
			if(!esControlTabla) {
				if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);			
				}
				
				if(this.remesastransitoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRemesasTransito(this.remesastransito,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRemesasTransito(this.remesastransitoReturnGeneral,this.remesastransitoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.remesastransitoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRemesasTransito(classes,this.remesastransitoReturnGeneral,this.remesastransitoBean,false);
					}
						
					if(this.remesastransitoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRemesasTransito(this.remesastransitoReturnGeneral.getRemesasTransito());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRemesasTransito(this.remesastransitoReturnGeneral.getRemesasTransito());	
					}
						
					if(this.remesastransitoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRemesasTransito(this.remesastransitoReturnGeneral.getRemesasTransito(),classes);//this.remesastransitoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRemesasTransito(this.remesastransito,classes);//this.remesastransitoBean);									
				}
			
				if(RemesasTransitoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRemesasTransito(this.remesastransito,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRemesasTransito(this.remesastransito);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.remesastransitoAnterior!=null) {
						this.remesastransito=this.remesastransitoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.remesastransitoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.remesastransitoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.remesastransitoReturnGeneral.getRemesasTransito(),remesastransitoLogic.getRemesasTransitos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.remesastransitoReturnGeneral.getRemesasTransito(),this.remesastransitos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRemesasTransito.repaint();
				
				//((AbstractTableModel) this.jTableDatosRemesasTransito.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRemesasTransito();
			}
		}
	}
	
	public void actualizarVisualTableDatosRemesasTransito() throws Exception {
		
		RemesasTransitoModel remesastransitoModel=(RemesasTransitoModel)this.jTableDatosRemesasTransito.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			remesastransitoModel.remesastransitos=this.remesastransitoLogic.getRemesasTransitos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			remesastransitoModel.remesastransitos=this.remesastransitos;
		}
		
		
		((RemesasTransitoModel) this.jTableDatosRemesasTransito.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRemesasTransito() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getremesastransitoAnterior(),this.remesastransitoLogic.getRemesasTransitos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getremesastransitoAnterior(),this.remesastransitos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRemesasTransito();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRemesasTransito(RemesasTransito remesastransito,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
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
										
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.remesastransito,new Object(),generalEntityParameterGeneral,this.remesastransitoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.remesastransitoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RemesasTransitoConstantesFunciones.getClassesRelationshipsOfRemesasTransito(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RemesasTransitoConstantesFunciones.getClassesRelationshipsFromStringsOfRemesasTransito(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRemesasTransito(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RemesasTransitoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.remesastransito,new Object(),generalEntityParameterGeneral,this.remesastransitoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRemesasTransito(RemesasTransitoBean remesastransitoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRemesasTransito(ArrayList<Classe> classes,RemesasTransitoReturnGeneral remesastransitoReturnGeneral,RemesasTransitoBean remesastransitoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRemesasTransito(RemesasTransito remesastransito,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.remesastransito)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRemesasTransito = new RemesasTransitoDetalleFormJInternalFrame(jDesktopPane,this.remesastransitoSessionBean.getConGuardarRelaciones(),this.remesastransitoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.setVisible(false);
		this.jInternalFrameDetalleFormRemesasTransito.setSelected(false);						
		
		this.jInternalFrameDetalleFormRemesasTransito.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRemesasTransito.remesastransitoLogic=this.remesastransitoLogic;
		
		this.cargarCombosFrameForeignKeyRemesasTransito("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRemesasTransito();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRemesasTransito();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRemesasTransito("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRemesasTransito();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRemesasTransito.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRemesasTransito"));
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarRemesasTransito.addActionListener(new ButtonActionListener(this,"ModificarRemesasTransito"));

		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarToolBarRemesasTransito.addActionListener(new ButtonActionListener(this,"ModificarToolBarRemesasTransito"));
					
		this.jInternalFrameDetalleFormRemesasTransito.jMenuItemModificarRemesasTransito.addActionListener(new ButtonActionListener(this,"MenuItemModificarRemesasTransito"));		
		
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarRemesasTransito.addActionListener (new ButtonActionListener(this,"ActualizarRemesasTransito"));
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarToolBarRemesasTransito.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRemesasTransito"));
						
		this.jInternalFrameDetalleFormRemesasTransito.jMenuItemActualizarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRemesasTransito"));		
		
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarRemesasTransito.addActionListener (new ButtonActionListener(this,"EliminarRemesasTransito"));
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"EliminarToolBarRemesasTransito"));
								
		this.jInternalFrameDetalleFormRemesasTransito.jMenuItemEliminarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRemesasTransito"));		
		
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarRemesasTransito.addActionListener (new ButtonActionListener(this,"CancelarRemesasTransito"));
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"CancelarToolBarRemesasTransito"));
					
		this.jInternalFrameDetalleFormRemesasTransito.jMenuItemCancelarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRemesasTransito"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jMenuItemDetalleCerrarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRemesasTransito"));		
		
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRemesasTransito"));
		
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRemesasTransito"));
		
		
		
		this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRemesasTransito"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonidRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"idRemesasTransitoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRemesasTransito.jButtonid_empresaRemesasTransitoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRemesasTransitoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonid_empresaRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnombre_bancoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnombre_giradorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giradorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonfecha_vencimientoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_cuentaRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_chequeRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonvalor_montoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"valor_montoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonvalorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"valorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_mayorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtoncodigoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"codigoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_originalRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_cambioRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cambioRemesasTransitoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRemesasTransito"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRemesasTransito"));
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRemesasTransito"));
		}
		
		this.jTableDatosRemesasTransito.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRemesasTransito"));
		
		this.jTableDatosRemesasTransito.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRemesasTransito"));
		
		this.jButtonNuevoRemesasTransito.addActionListener(new ButtonActionListener(this,"NuevoRemesasTransito"));
		
		this.jButtonDuplicarRemesasTransito.addActionListener(new ButtonActionListener(this,"DuplicarRemesasTransito"));
		
		this.jButtonCopiarRemesasTransito.addActionListener(new ButtonActionListener(this,"CopiarRemesasTransito"));
		
		this.jButtonVerFormRemesasTransito.addActionListener(new ButtonActionListener(this,"VerFormRemesasTransito"));
		
		
		this.jButtonNuevoToolBarRemesasTransito.addActionListener(new ButtonActionListener(this,"NuevoToolBarRemesasTransito"));
			
		this.jButtonDuplicarToolBarRemesasTransito.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRemesasTransito"));
			
		this.jMenuItemNuevoRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRemesasTransito"));
			
		this.jMenuItemDuplicarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRemesasTransito"));		
		
		
		this.jButtonNuevoRelacionesRemesasTransito.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRemesasTransito"));
		
		
		this.jButtonNuevoRelacionesToolBarRemesasTransito.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRemesasTransito"));
			
		this.jMenuItemNuevoRelacionesRemesasTransito.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRemesasTransito"));		
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarRemesasTransito.addActionListener(new ButtonActionListener(this,"ModificarRemesasTransito"));
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonModificarToolBarRemesasTransito.addActionListener(new ButtonActionListener(this,"ModificarToolBarRemesasTransito"));
			
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemModificarRemesasTransito.addActionListener(new ButtonActionListener(this,"MenuItemModificarRemesasTransito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarRemesasTransito.addActionListener (new ButtonActionListener(this,"ActualizarRemesasTransito"));
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonActualizarToolBarRemesasTransito.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRemesasTransito"));
				
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemActualizarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRemesasTransito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarRemesasTransito.addActionListener (new ButtonActionListener(this,"EliminarRemesasTransito"));
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonEliminarToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"EliminarToolBarRemesasTransito"));
						
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemEliminarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRemesasTransito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarRemesasTransito.addActionListener (new ButtonActionListener(this,"CancelarRemesasTransito"));
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonCancelarToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"CancelarToolBarRemesasTransito"));
			
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemCancelarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRemesasTransito"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRemesasTransito"));		
		
		
		this.jButtonCerrarRemesasTransito.addActionListener (new ButtonActionListener(this,"CerrarRemesasTransito"));
		
		
		this.jButtonCerrarToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"CerrarToolBarRemesasTransito"));
			
		this.jMenuItemCerrarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRemesasTransito"));
			
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jMenuItemDetalleCerrarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRemesasTransito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.addActionListener (new ButtonActionListener(this,"GuardarCambiosRemesasTransito"));
		}
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRemesasTransito"));
		}
		
		this.jButtonCopiarToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"CopiarToolBarRemesasTransito"));
			
		this.jButtonVerFormToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"VerFormToolBarRemesasTransito"));
		
		this.jMenuItemGuardarCambiosRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRemesasTransito"));
			
		this.jMenuItemCopiarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRemesasTransito"));		
		
		this.jMenuItemVerFormRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRemesasTransito"));		
		
		
		this.jButtonGuardarCambiosTablaRemesasTransito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRemesasTransito"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRemesasTransito"));
			
		this.jMenuItemGuardarCambiosTablaRemesasTransito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRemesasTransito"));		
		
		
		
		this.jButtonRecargarInformacionRemesasTransito.addActionListener (new ButtonActionListener(this,"RecargarInformacionRemesasTransito"));
					
		this.jButtonRecargarInformacionToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRemesasTransito"));
		
		this.jMenuItemRecargarInformacionRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRemesasTransito"));		
		
		
		
		this.jButtonAnterioresRemesasTransito.addActionListener (new ButtonActionListener(this,"AnterioresRemesasTransito"));
		
		
		this.jButtonAnterioresToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRemesasTransito"));
		
		this.jMenuItemAnterioresRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRemesasTransito"));		
		
		
		this.jButtonSiguientesRemesasTransito.addActionListener (new ButtonActionListener(this,"SiguientesRemesasTransito"));
		
		
		this.jButtonSiguientesToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRemesasTransito"));
			
		this.jMenuItemSiguientesRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRemesasTransito"));
			
		this.jMenuItemAbrirOrderByRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRemesasTransito"));
			
		this.jMenuItemMostrarOcultarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRemesasTransito"));
			
		this.jMenuItemDetalleAbrirOrderByRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRemesasTransito"));
			
		this.jMenuItemDetalleMostarOcultarRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRemesasTransito"));		
		
		
		this.jButtonNuevoGuardarCambiosRemesasTransito.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRemesasTransito"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRemesasTransito"));
			
		this.jMenuItemNuevoGuardarCambiosRemesasTransito.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRemesasTransito"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRemesasTransito.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRemesasTransito"));

		this.jCheckBoxSeleccionadosRemesasTransito.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRemesasTransito"));
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRemesasTransito"));
		}
		
		
		this.jComboBoxTiposRelacionesRemesasTransito.addActionListener (new ButtonActionListener(this,"TiposRelacionesRemesasTransito"));
			
		this.jComboBoxTiposAccionesRemesasTransito.addActionListener (new ButtonActionListener(this,"TiposAccionesRemesasTransito"));
					
		this.jComboBoxTiposSeleccionarRemesasTransito.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRemesasTransito"));
			
		this.jTextFieldValorCampoGeneralRemesasTransito.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRemesasTransito"));		
		
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonidRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"idRemesasTransitoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRemesasTransito.jButtonid_empresaRemesasTransitoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRemesasTransitoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonid_empresaRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnombre_bancoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnombre_giradorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giradorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonfecha_vencimientoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_cuentaRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_chequeRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonvalor_montoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"valor_montoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonvalorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"valorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_mayorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtoncodigoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"codigoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_originalRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_cambioRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cambioRemesasTransitoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaRemesasTransitoRemesasTransito.addActionListener(new ButtonActionListener(this,"BusquedaRemesasTransitoRemesasTransito"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRemesasTransito!=null) {
				this.jInternalFrameReporteDinamicoRemesasTransito.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRemesasTransito"));
				this.jInternalFrameReporteDinamicoRemesasTransito.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRemesasTransito"));
				this.jInternalFrameReporteDinamicoRemesasTransito.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRemesasTransito"));
			}
			
			//this.jButtonCerrarReporteDinamicoRemesasTransito.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRemesasTransito"));				
			//this.jButtonGenerarReporteDinamicoRemesasTransito.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRemesasTransito"));
			//this.jButtonGenerarExcelReporteDinamicoRemesasTransito.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRemesasTransito"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRemesasTransito!=null) {
				this.jInternalFrameImportacionRemesasTransito.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRemesasTransito"));
				this.jInternalFrameImportacionRemesasTransito.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRemesasTransito"));
				this.jInternalFrameImportacionRemesasTransito.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRemesasTransito"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRemesasTransito.addActionListener (new ButtonActionListener(this,"AbrirOrderByRemesasTransito"));
			
			this.jButtonAbrirOrderByToolBarRemesasTransito.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRemesasTransito"));			
			
			if(this.jInternalFrameOrderByRemesasTransito!=null) {
				this.jInternalFrameOrderByRemesasTransito.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRemesasTransito"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRemesasTransito.jTabbedPaneRelacionesRemesasTransito.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRemesasTransito"));
		
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
            		closingInternalFrameRemesasTransito();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRemesasTransito.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRemesasTransito = (JInternalFrameBase)event.getSource();
	            	
	            RemesasTransitoBeanSwingJInternalFrame jInternalFrameParent=(RemesasTransitoBeanSwingJInternalFrame)jInternalFrameDetalleFormRemesasTransito.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRemesasTransitoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRemesasTransito.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRemesasTransitoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRemesasTransito.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRemesasTransito.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRemesasTransitoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRemesasTransitoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRemesasTransitoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRemesasTransito";
		inputMap = this.jButtonNuevoRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRemesasTransitoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRemesasTransitoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRemesasTransitoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRemesasTransitoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRemesasTransito";
		inputMap = this.jButtonNuevoRelacionesRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRemesasTransitoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRemesasTransito";
		inputMap = this.jButtonModificarRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRemesasTransitoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRemesasTransito";
		inputMap = this.jButtonActualizarRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRemesasTransitoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRemesasTransito";
		inputMap = this.jButtonEliminarRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRemesasTransitoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRemesasTransito";
		inputMap = this.jButtonCancelarRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRemesasTransitoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRemesasTransito";
		inputMap = this.jButtonCerrarRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRemesasTransitoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRemesasTransito";
		inputMap = this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRemesasTransito.jButtonGuardarCambiosRemesasTransito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRemesasTransitoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRemesasTransito.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRemesasTransitoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRemesasTransito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRemesasTransitoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRemesasTransito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRemesasTransitoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRemesasTransito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRemesasTransitoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonidRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"idRemesasTransitoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRemesasTransito.jButtonid_empresaRemesasTransitoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRemesasTransitoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonid_empresaRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnombre_bancoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_bancoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnombre_giradorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_giradorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonfecha_vencimientoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_cuentaRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_chequeRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonvalor_montoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"valor_montoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonvalorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"valorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_mayorRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtoncodigoRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"codigoRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonfecha_vencimiento_originalRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimiento_originalRemesasTransitoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRemesasTransito.jButtonnumero_cambioRemesasTransitoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cambioRemesasTransitoBusqueda"));
		
		
		this.jButtonBusquedaRemesasTransitoRemesasTransito.addActionListener(new ButtonActionListener(this,"BusquedaRemesasTransitoRemesasTransito"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRemesasTransito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRemesasTransitoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRemesasTransitoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRemesasTransito.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRemesasTransito(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
					remesastransitoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RemesasTransito remesastransitoAux:remesastransitos) {
					remesastransitoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRemesasTransitoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRemesasTransito(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
						remesastransitoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RemesasTransito remesastransitoAux:remesastransitos) {
						remesastransitoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RemesasTransito remesastransitoAux:remesastransitos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRemesasTransito(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRemesasTransito.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRemesasTransito.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRemesasTransitoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRemesasTransito(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRemesasTransito.getSelectedRows();
			
			RemesasTransito remesastransitoLocal=new RemesasTransito();
			
			//this.seleccionarTodosRemesasTransito(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					remesastransitoLocal =(RemesasTransito) this.remesastransitoLogic.getRemesasTransitos().toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					remesastransitoLocal =(RemesasTransito) this.remesastransitos.toArray()[this.jTableDatosRemesasTransito.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				remesastransitoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
						remesastransitoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RemesasTransito remesastransitoAux:remesastransitos) {
						remesastransitoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRemesasTransito(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRemesasTransito.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRemesasTransito.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRemesasTransito,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRemesasTransitoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRemesasTransitoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRemesasTransitoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRemesasTransito(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRemesasTransito.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RemesasTransito remesastransitoAux:this.remesastransitoLogic.getRemesasTransitos()) {
				
						if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							remesastransitoAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR)) {
							existe=true;
							remesastransitoAux.setnombre_girador(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							remesastransitoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							remesastransitoAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							remesastransitoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_VALORMONTO)) {
							existe=true;
							remesastransitoAux.setvalor_monto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							remesastransitoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							remesastransitoAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							remesastransitoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL)) {
							existe=true;
							remesastransitoAux.setfecha_vencimiento_original(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO)) {
							existe=true;
							remesastransitoAux.setnumero_cambio(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RemesasTransito remesastransitoAux:remesastransitos) {
					
						if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO)) {
							existe=true;
							remesastransitoAux.setnombre_banco(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR)) {
							existe=true;
							remesastransitoAux.setnombre_girador(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							remesastransitoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							remesastransitoAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							remesastransitoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_VALORMONTO)) {
							existe=true;
							remesastransitoAux.setvalor_monto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							remesastransitoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							remesastransitoAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							remesastransitoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL)) {
							existe=true;
							remesastransitoAux.setfecha_vencimiento_original(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO)) {
							existe=true;
							remesastransitoAux.setnumero_cambio(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRemesasTransito(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRemesasTransitoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRemesasTransito(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRemesasTransito=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRemesasTransito.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRemesasTransito) {				
					conSplash=true;//false;										
					
					//this.startProcessRemesasTransito(conSplash);
				
					this.generarReporteRemesasTransitosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRemesasTransitosSeleccionados();
				//this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRemesasTransitosSeleccionados(false);
				//this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRemesasTransitosSeleccionados(true);
				//this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRemesasTransito();
				
				this.exportarRemesasTransitosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRemesasTransitos();
				//this.importarRemesasTransitos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRemesasTransito();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRemesasTransitosSeleccionados();
				//this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Remesas Transito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRemesasTransito();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRemesasTransito)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRemesasTransito(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.setSelectedIndex(0);					
				}	
			} 			
			else if(RemesasTransitoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRemesasTransito) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRemesasTransito(conSplash);
					
						//this.actualizarParametrosGeneralRemesasTransito();
						
						this.generarReporteProcesoAccionRemesasTransitosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RemesasTransitoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Remesas TransitoS SELECCIONADOS?", "MANTENIMIENTO DE Remesas Transito", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRemesasTransito();
				
						this.actualizarParametrosGeneralRemesasTransito();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.remesastransitoReturnGeneral=remesastransitoLogic.procesarAccionRemesasTransitosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.remesastransitoLogic.getRemesasTransitos(),this.remesastransitoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRemesasTransitoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRemesasTransito();
					
					RemesasTransitoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRemesasTransitoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRemesasTransito.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRemesasTransito.jComboBoxTiposAccionesFormularioRemesasTransito.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRemesasTransito(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRemesasTransitoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRemesasTransito();
			
			if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
			RemesasTransito remesastransito=new RemesasTransito();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRemesasTransito(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRemesasTransito.getSelectedItem();
			
			
			
			
			remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
			//this.sTipoAccion;
			
			if(remesastransitosSeleccionados.size()==1) {
				for(RemesasTransito remesastransitoAux:remesastransitosSeleccionados) {
					remesastransito=remesastransitoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRemesasTransito();
			
      		//this.finishProcessRemesasTransito(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRemesasTransitoReturnGeneral() throws Exception {
		if(this.remesastransitoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.remesastransitoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.remesastransitoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.remesastransitoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.remesastransitoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.remesastransitoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRemesasTransito(false);
		}
		
		if(this.remesastransitoReturnGeneral.getConRetornoLista() || this.remesastransitoReturnGeneral.getConRetornoObjeto()) {
			if(this.remesastransitoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.remesastransitoLogic.setRemesasTransitos(this.remesastransitoReturnGeneral.getRemesasTransitos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingRemesasTransito(false);
		}
	}
	
	public void actualizarParametrosGeneralRemesasTransito() throws Exception {
		
		
	}
	
	public ArrayList<RemesasTransito> getRemesasTransitosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRemesasTransito) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RemesasTransito remesastransitoAux:remesastransitoLogic.getRemesasTransitos()) {
					if(remesastransitoAux.getIsSelected()) {
						remesastransitosSeleccionados.add(remesastransitoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RemesasTransito remesastransitoAux:this.remesastransitos) {
					if(remesastransitoAux.getIsSelected()) {
						remesastransitosSeleccionados.add(remesastransitoAux);				
					}
				}
			}
			
			if(remesastransitosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						remesastransitosSeleccionados.addAll(this.remesastransitoLogic.getRemesasTransitos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						remesastransitosSeleccionados.addAll(this.remesastransitos);				
					}
				}
			}
		} else {
			remesastransitosSeleccionados.add(this.remesastransito);
		}
		
		return remesastransitosSeleccionados;
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
	
	public void generarReporteRemesasTransitosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRemesasTransitosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRemesasTransitosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRemesasTransitosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRemesasTransitosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Remesas Transito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRemesasTransitosSeleccionados() throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRemesasTransitos("Todos",remesastransitosSeleccionados);
		
	}	
	
	public void generarReporteNormalRemesasTransitosSeleccionados() throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRemesasTransitos("Todos",remesastransitosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRemesasTransitosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRemesasTransitos("Todos",remesastransitosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRemesasTransitosSeleccionados() throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRemesasTransito();
		
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRemesasTransito();
		
		
		//this.generarReporteRemesasTransitos("Todos",remesastransitosSeleccionados ,remesastransitoImplementable,remesastransitoImplementableHome);
	}
	
	public void mostrarImportacionRemesasTransitos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRemesasTransito();
		
		this.abrirFrameImportacionRemesasTransito();		
		
			
		//this.generarReporteRemesasTransitos("Todos",remesastransitosSeleccionados ,remesastransitoImplementable,remesastransitoImplementableHome);
	}
	
	public void importarRemesasTransitos() throws Exception {		
	
	}
	
	public void exportarRemesasTransitosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRemesasTransitosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRemesasTransitosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRemesasTransitosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Remesas Transito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRemesasTransitosSeleccionados() throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"remesastransito."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRemesasTransito(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RemesasTransito remesastransitoAux:remesastransitosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRemesasTransito(remesastransitoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//remesastransitoAux.setsDetalleGeneralEntityReporte(remesastransitoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRemesasTransito(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_VALORMONTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRemesasTransito(RemesasTransito remesastransito,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=remesastransito.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getnombre_banco();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getnombre_girador();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getnumero_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getvalor_monto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getfecha_vencimiento_original().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=remesastransito.getnumero_cambio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRemesasTransitosSeleccionados() throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"remesastransito.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RemesasTransitos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRemesasTransito(row);				
				iRow++;
			}				
			
			for(RemesasTransito remesastransitoAux:remesastransitosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRemesasTransito(remesastransitoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRemesasTransitosSeleccionados() throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();		
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"remesastransito.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("remesastransitos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("remesastransito");
			//elementRoot.appendChild(element);
		
			for(RemesasTransito remesastransitoAux:remesastransitosSeleccionados) {
				element = document.createElement("remesastransito");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRemesasTransito(remesastransitoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Remesas Transito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRemesasTransito(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_VALORMONTO);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL);
		cell = row.createCell(iColumn++);cell.setCellValue(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRemesasTransito(RemesasTransito remesastransito,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getnombre_banco());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getnombre_girador());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getnumero_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getvalor_monto());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getfecha_vencimiento_original());
		cell = row.createCell(iColumn++);cell.setCellValue(remesastransito.getnumero_cambio());				
	}
	
	public void setFilaDatosExportarXmlRemesasTransito(RemesasTransito remesastransito,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RemesasTransitoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(remesastransito.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RemesasTransitoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(remesastransito.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RemesasTransitoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(remesastransito.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre_banco = document.createElement(RemesasTransitoConstantesFunciones.NOMBREBANCO);
		elementnombre_banco.appendChild(document.createTextNode(remesastransito.getnombre_banco().trim()));
		element.appendChild(elementnombre_banco);

		Element elementnombre_girador = document.createElement(RemesasTransitoConstantesFunciones.NOMBREGIRADOR);
		elementnombre_girador.appendChild(document.createTextNode(remesastransito.getnombre_girador().trim()));
		element.appendChild(elementnombre_girador);

		Element elementfecha_vencimiento = document.createElement(RemesasTransitoConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(remesastransito.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementnumero_cuenta = document.createElement(RemesasTransitoConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(remesastransito.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);

		Element elementnumero_cheque = document.createElement(RemesasTransitoConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(remesastransito.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementvalor_monto = document.createElement(RemesasTransitoConstantesFunciones.VALORMONTO);
		elementvalor_monto.appendChild(document.createTextNode(remesastransito.getvalor_monto().toString().trim()));
		element.appendChild(elementvalor_monto);

		Element elementvalor = document.createElement(RemesasTransitoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(remesastransito.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero_mayor = document.createElement(RemesasTransitoConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(remesastransito.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementcodigo = document.createElement(RemesasTransitoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(remesastransito.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementfecha_vencimiento_original = document.createElement(RemesasTransitoConstantesFunciones.FECHAVENCIMIENTOORIGINAL);
		elementfecha_vencimiento_original.appendChild(document.createTextNode(remesastransito.getfecha_vencimiento_original().toString().trim()));
		element.appendChild(elementfecha_vencimiento_original);

		Element elementnumero_cambio = document.createElement(RemesasTransitoConstantesFunciones.NUMEROCAMBIO);
		elementnumero_cambio.appendChild(document.createTextNode(remesastransito.getnumero_cambio().toString().trim()));
		element.appendChild(elementnumero_cambio);
	}
	
	public void generarReporteGroupGenericoRemesasTransitosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RemesasTransito> remesastransitosSeleccionados=new ArrayList<RemesasTransito>();
		
		remesastransitosSeleccionados=this.getRemesasTransitosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRemesasTransito(remesastransitosSeleccionados);
		
		this.generarReporteRemesasTransitos("Todos",remesastransitosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRemesasTransito(ArrayList<RemesasTransito> remesastransitosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RemesasTransito remesastransitoAux:remesastransitosSeleccionados) {
				remesastransitoAux.setsDetalleGeneralEntityReporte(remesastransitoAux.toString());
			
				if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NOMBREBANCO)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getnombre_banco());
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NOMBREGIRADOR)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getnombre_girador());
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(remesastransitoAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getnumero_cuenta());
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_FECHAVENCIMIENTOORIGINAL)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(remesastransitoAux.getfecha_vencimiento_original()));
				}
				 else if(sTipoSeleccionar.equals(RemesasTransitoConstantesFunciones.LABEL_NUMEROCAMBIO)) {
					existe=true;
					remesastransitoAux.setsDescripcionGeneralEntityReporte1(remesastransitoAux.getnumero_cambio().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RemesasTransitoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRemesasTransito(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRemesasTransito=true;
				this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=true;
				this.isVisibilidadCeldaGuardarCambiosRemesasTransito=true;
			}
			
			this.isVisibilidadCeldaModificarRemesasTransito=false;
			this.isVisibilidadCeldaActualizarRemesasTransito=false;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
			this.isVisibilidadCeldaCancelarRemesasTransito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRemesasTransito=true;
				} else {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRemesasTransito=false;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
			this.isVisibilidadCeldaModificarRemesasTransito=false;
			this.isVisibilidadCeldaActualizarRemesasTransito=true;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
			this.isVisibilidadCeldaCancelarRemesasTransito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRemesasTransito=true;
				} else {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRemesasTransito=false;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
			this.isVisibilidadCeldaModificarRemesasTransito=false;
			this.isVisibilidadCeldaActualizarRemesasTransito=true;
			this.isVisibilidadCeldaEliminarRemesasTransito=true;
			this.isVisibilidadCeldaCancelarRemesasTransito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRemesasTransito=true;
				} else {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRemesasTransito=false;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
			this.isVisibilidadCeldaModificarRemesasTransito=false;
			this.isVisibilidadCeldaActualizarRemesasTransito=true;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
			this.isVisibilidadCeldaCancelarRemesasTransito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				} else {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRemesasTransito=true;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=true;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=true;
			this.isVisibilidadCeldaModificarRemesasTransito=false;
			this.isVisibilidadCeldaActualizarRemesasTransito=false;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
			this.isVisibilidadCeldaCancelarRemesasTransito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRemesasTransito=true;
				} else {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRemesasTransito=false;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
			this.isVisibilidadCeldaActualizarRemesasTransito=false;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
			this.isVisibilidadCeldaCancelarRemesasTransito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				} else {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRemesasTransito=false;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
			this.isVisibilidadCeldaModificarRemesasTransito=true;
			this.isVisibilidadCeldaActualizarRemesasTransito=false;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
			this.isVisibilidadCeldaCancelarRemesasTransito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				} else {
					this.isVisibilidadCeldaGuardarRemesasTransito=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RemesasTransitoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRemesasTransito=true;
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=true;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=true;
		} else {
			this.actualizarEstadoPanelsRemesasTransito(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRemesasTransito=false;
			//this.isVisibilidadCeldaVerFormRemesasTransito=false;
			this.isVisibilidadCeldaDuplicarRemesasTransito=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!remesastransitoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
		} else {
			this.isVisibilidadCeldaNuevoRemesasTransito=false;
			this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(remesastransitoSessionBean.getEsGuardarRelacionado()) {
			if(!remesastransitoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;												
			}
			
			this.jButtonCerrarRemesasTransito.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
		}
		
		if(!this.permiteMantenimiento(this.remesastransito)) {
			this.isVisibilidadCeldaActualizarRemesasTransito=false;
			this.isVisibilidadCeldaEliminarRemesasTransito=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoRemesasTransito=false;
		this.isVisibilidadCeldaNuevoRelacionesRemesasTransito=false;
		this.isVisibilidadCeldaGuardarCambiosRemesasTransito=false;
		//this.isVisibilidadCeldaModificarRemesasTransito=true;
		this.isVisibilidadCeldaActualizarRemesasTransito=false;
		this.isVisibilidadCeldaEliminarRemesasTransito=false;
		//this.isVisibilidadCeldaCancelarRemesasTransito=true;			
		this.isVisibilidadCeldaGuardarRemesasTransito=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRemesasTransito() {
	}
	
	public void actualizarEstadoPanelsRemesasTransito(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRemesasTransito!=null) {
				this.jScrollPanelDatosEdicionRemesasTransito.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRemesasTransito!=null) {
				this.jScrollPanelDatosRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelPaginacionRemesasTransito!=null) {
				this.jPanelPaginacionRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRemesasTransito!=null) {
				this.jScrollPanelDatosEdicionRemesasTransito.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRemesasTransito!=null) {
				this.jScrollPanelDatosRemesasTransito.setVisible(false);
			}
			
			if(this.jPanelPaginacionRemesasTransito!=null) {
				this.jPanelPaginacionRemesasTransito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRemesasTransito!=null) {
				this.jScrollPanelDatosEdicionRemesasTransito.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRemesasTransito!=null) {
				this.jScrollPanelDatosRemesasTransito.setVisible(false);
			}
			
			if(this.jPanelPaginacionRemesasTransito!=null) {
				this.jPanelPaginacionRemesasTransito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRemesasTransito!=null) {
				this.jScrollPanelDatosEdicionRemesasTransito.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRemesasTransito!=null) {
				this.jScrollPanelDatosRemesasTransito.setVisible(false);
			}
			
			if(this.jPanelPaginacionRemesasTransito!=null) {
				this.jPanelPaginacionRemesasTransito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRemesasTransito!=null) {
				this.jScrollPanelDatosEdicionRemesasTransito.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRemesasTransito!=null) {
				this.jScrollPanelDatosRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelPaginacionRemesasTransito!=null) {
				this.jPanelPaginacionRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRemesasTransito!=null) {
				this.jScrollPanelDatosEdicionRemesasTransito.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRemesasTransito!=null) {
				this.jScrollPanelDatosRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelPaginacionRemesasTransito!=null) {
				this.jPanelPaginacionRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRemesasTransito!=null) {
				this.jScrollPanelDatosEdicionRemesasTransito.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRemesasTransito!=null) {
				this.jScrollPanelDatosRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelPaginacionRemesasTransito!=null) {
				this.jPanelPaginacionRemesasTransito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
					this.jTabbedPaneBusquedasRemesasTransito.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.remesastransitoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRemesasTransito!=null) {
				this.jTabbedPaneBusquedasRemesasTransito.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRemesasTransito!=null) {
				this.jPanelParametrosReportesRemesasTransito.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaRemesasTransito=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaRemesasTransito) {this.jTabbedPaneBusquedasRemesasTransito.remove(jPanelBusquedaRemesasTransitoRemesasTransito);}
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
			
			this.inicializarActualizarBindingTablaRemesasTransito(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRemesasTransito() {
		this.updateBorderResaltarBusquedasFormularioRemesasTransito();
		this.updateVisibilidadBusquedasFormularioRemesasTransito();
		this.updateHabilitarBusquedasFormularioRemesasTransito();
	}
	
	public void updateBorderResaltarBusquedasFormularioRemesasTransito() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRemesasTransito.getComponents().length>0) {
	

		if(this.remesastransitoConstantesFunciones.resaltarBusquedaRemesasTransitoRemesasTransito!=null) {
			index= this.jTabbedPaneBusquedasRemesasTransito.indexOfComponent(this.jPanelBusquedaRemesasTransitoRemesasTransito);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRemesasTransito.getComponent(index);
				jPanel.setBorder(this.remesastransitoConstantesFunciones.resaltarBusquedaRemesasTransitoRemesasTransito);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRemesasTransito() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRemesasTransito.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRemesasTransito.indexOfComponent(this.jPanelBusquedaRemesasTransitoRemesasTransito);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRemesasTransito.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.remesastransitoConstantesFunciones.mostrarBusquedaRemesasTransitoRemesasTransito);
			if(!this.remesastransitoConstantesFunciones.mostrarBusquedaRemesasTransitoRemesasTransito && index>-1) {
				this.jTabbedPaneBusquedasRemesasTransito.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRemesasTransito() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRemesasTransito.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRemesasTransito.indexOfComponent(this.jPanelBusquedaRemesasTransitoRemesasTransito);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRemesasTransito.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.remesastransitoConstantesFunciones.activarBusquedaRemesasTransitoRemesasTransito);
				this.jTabbedPaneBusquedasRemesasTransito.setEnabledAt(index,this.remesastransitoConstantesFunciones.activarBusquedaRemesasTransitoRemesasTransito);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRemesasTransito(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaRemesasTransito")) {
			index= this.jTabbedPaneBusquedasRemesasTransito.indexOfComponent(this.jPanelBusquedaRemesasTransitoRemesasTransito);

			this.jTabbedPaneBusquedasRemesasTransito.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRemesasTransito.getComponent(index);

			this.remesastransitoConstantesFunciones.setResaltarBusquedaRemesasTransitoRemesasTransito(resaltar);

			jPanel.setBorder(this.remesastransitoConstantesFunciones.resaltarBusquedaRemesasTransitoRemesasTransito);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRemesasTransito.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRemesasTransito() throws Exception {

		if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRemesasTransito();
		this.updateVisibilidadResaltarControlesFormularioRemesasTransito();
		this.updateHabilitarResaltarControlesFormularioRemesasTransito();
		
	}
	
	public void updateBorderResaltarControlesFormularioRemesasTransito() throws Exception {
		if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.remesastransitoConstantesFunciones.resaltaridRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltaridRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarid_empresaRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarid_empresaRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarnombre_bancoRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarnombre_bancoRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarnombre_giradorRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarnombre_giradorRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarfecha_vencimientoRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarfecha_vencimientoRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarnumero_cuentaRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarnumero_cuentaRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarnumero_chequeRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarnumero_chequeRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarvalor_montoRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarvalor_montoRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarvalorRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarvalorRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarnumero_mayorRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarnumero_mayorRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarcodigoRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarcodigoRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarfecha_vencimiento_originalRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarfecha_vencimiento_originalRemesasTransito);}
		if(this.remesastransitoConstantesFunciones.resaltarnumero_cambioRemesasTransito!=null && this.jInternalFrameDetalleFormRemesasTransito!=null) {this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.setBorder(this.remesastransitoConstantesFunciones.resaltarnumero_cambioRemesasTransito);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRemesasTransito() throws Exception {		
		if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
	
		//this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostraridRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelidRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostraridRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarid_empresaRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelid_empresaRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarid_empresaRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnombre_bancoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelnombre_bancoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnombre_bancoRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnombre_giradorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelnombre_giradorRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnombre_giradorRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarfecha_vencimientoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelfecha_vencimientoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarfecha_vencimientoRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_cuentaRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelnumero_cuentaRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_cuentaRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_chequeRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelnumero_chequeRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_chequeRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarvalor_montoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelvalor_montoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarvalor_montoRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarvalorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelvalorRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarvalorRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_mayorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelnumero_mayorRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_mayorRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarcodigoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelcodigoRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarcodigoRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarfecha_vencimiento_originalRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelfecha_vencimiento_originalRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarfecha_vencimiento_originalRemesasTransito);
		//this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_cambioRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jPanelnumero_cambioRemesasTransito.setVisible(this.remesastransitoConstantesFunciones.mostrarnumero_cambioRemesasTransito);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRemesasTransito() throws Exception {
		if(this.jInternalFrameDetalleFormRemesasTransito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRemesasTransito!=null) {
	
		this.jInternalFrameDetalleFormRemesasTransito.jLabelidRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activaridRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jComboBoxid_empresaRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarid_empresaRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_bancoRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarnombre_bancoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextAreanombre_giradorRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarnombre_giradorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimientoRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarfecha_vencimientoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cuentaRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarnumero_cuentaRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_chequeRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarnumero_chequeRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalor_montoRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarvalor_montoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldvalorRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarvalorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextAreanumero_mayorRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarnumero_mayorRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldcodigoRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarcodigoRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jDateChooserfecha_vencimiento_originalRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarfecha_vencimiento_originalRemesasTransito);
		this.jInternalFrameDetalleFormRemesasTransito.jTextFieldnumero_cambioRemesasTransito.setEnabled(this.remesastransitoConstantesFunciones.activarnumero_cambioRemesasTransito);
		}
	}
	
		
}