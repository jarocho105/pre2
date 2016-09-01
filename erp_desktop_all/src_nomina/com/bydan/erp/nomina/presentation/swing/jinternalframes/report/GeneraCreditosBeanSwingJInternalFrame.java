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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.GeneraCreditosConstantesFunciones;
import com.bydan.erp.nomina.util.report.GeneraCreditosParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.GeneraCreditosParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.GeneraCreditosBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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
public class GeneraCreditosBeanSwingJInternalFrame extends GeneraCreditosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GeneraCreditosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GeneraCreditos> generacreditosValidator = new ClassValidator<GeneraCreditos>(GeneraCreditos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GeneraCreditos generacreditos;	
	public GeneraCreditos generacreditosAux;
	public GeneraCreditos generacreditosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GeneraCreditos generacreditosTotales;
	public Long idGeneraCreditosActual;
	public Long iIdNuevoGeneraCreditos=0L;
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
	
	public Boolean isPermisoTodoGeneraCreditos;
	public Boolean isPermisoNuevoGeneraCreditos;
	public Boolean isPermisoActualizarGeneraCreditos;
	public Boolean isPermisoActualizarOriginalGeneraCreditos;
	public Boolean isPermisoEliminarGeneraCreditos;
	public Boolean isPermisoGuardarCambiosGeneraCreditos;
	public Boolean isPermisoConsultaGeneraCreditos;
	public Boolean isPermisoBusquedaGeneraCreditos;
	public Boolean isPermisoReporteGeneraCreditos;
	public Boolean isPermisoPaginacionMedioGeneraCreditos;
	public Boolean isPermisoPaginacionAltoGeneraCreditos;
	public Boolean isPermisoPaginacionTodoGeneraCreditos;
	public Boolean isPermisoCopiarGeneraCreditos;
	public Boolean isPermisoVerFormGeneraCreditos;
	public Boolean isPermisoDuplicarGeneraCreditos;
	public Boolean isPermisoOrdenGeneraCreditos;
	
	
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
	
	public GeneraCreditosParameterReturnGeneral generacreditosReturnGeneral;
	public GeneraCreditosParameterReturnGeneral generacreditosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGeneraCreditos=false;
	public Boolean esParaAccionDesdeFormularioGeneraCreditos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GeneraCreditosSessionBeanAdditional generacreditosSessionBeanAdditional=null;
	
	public GeneraCreditosSessionBeanAdditional getGeneraCreditosSessionBeanAdditional() {
		return this.generacreditosSessionBeanAdditional;
	}
	
	public void setGeneraCreditosSessionBeanAdditional(GeneraCreditosSessionBeanAdditional generacreditosSessionBeanAdditional) {
		try {
			this.generacreditosSessionBeanAdditional=generacreditosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GeneraCreditosBeanSwingJInternalFrameAdditional generacreditosBeanSwingJInternalFrameAdditional=null;
	//public class GeneraCreditosBeanSwingJInternalFrame
	
	public GeneraCreditosBeanSwingJInternalFrameAdditional getGeneraCreditosBeanSwingJInternalFrameAdditional() {
		return this.generacreditosBeanSwingJInternalFrameAdditional;
	}
	
	public void setGeneraCreditosBeanSwingJInternalFrameAdditional(GeneraCreditosBeanSwingJInternalFrameAdditional generacreditosBeanSwingJInternalFrameAdditional) {
		try {
			this.generacreditosBeanSwingJInternalFrameAdditional=generacreditosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GeneraCreditosLogic generacreditosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GeneraCreditos generacreditosBean;
	public GeneraCreditosConstantesFunciones generacreditosConstantesFunciones;
	//public GeneraCreditosParameterReturnGeneral generacreditosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<GeneraCreditos> generacreditoss;	
	//public List<GeneraCreditos> generacreditossEliminados;
	//public List<GeneraCreditos> generacreditossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGeneraCreditos=false;
	public Boolean isVisibilidadCeldaDuplicarGeneraCreditos=true;
	public Boolean isVisibilidadCeldaCopiarGeneraCreditos=true;
	public Boolean isVisibilidadCeldaVerFormGeneraCreditos=true;
	public Boolean isVisibilidadCeldaOrdenGeneraCreditos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
	public Boolean isVisibilidadCeldaModificarGeneraCreditos=false;
	public Boolean isVisibilidadCeldaActualizarGeneraCreditos=false;
	public Boolean isVisibilidadCeldaEliminarGeneraCreditos=false;
	public Boolean isVisibilidadCeldaCancelarGeneraCreditos=false;
	public Boolean isVisibilidadCeldaGuardarGeneraCreditos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;	
	
	
	public Boolean isVisibilidadBusquedaGeneraCreditos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoGeneraCreditos() {
		return this.iIdNuevoGeneraCreditos;
	}

	public void setiIdNuevoGeneraCreditos(Long iIdNuevoGeneraCreditos) {
		this.iIdNuevoGeneraCreditos = iIdNuevoGeneraCreditos;
	}
	
	public Long getidGeneraCreditosActual() {
		return this.idGeneraCreditosActual;
	}

	public void setidGeneraCreditosActual(Long idGeneraCreditosActual) {
		this.idGeneraCreditosActual = idGeneraCreditosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GeneraCreditos getgeneracreditos() {
		return this.generacreditos;
	}

	public void setgeneracreditos(GeneraCreditos generacreditos) {
		this.generacreditos = generacreditos;
	}
	
	public GeneraCreditos getgeneracreditosAux() {
		return this.generacreditosAux;
	}

	public void setgeneracreditosAux(GeneraCreditos generacreditosAux) {
		this.generacreditosAux = generacreditosAux;
	}				
	
	public GeneraCreditos getgeneracreditosAnterior() {
		return this.generacreditosAnterior;
	}

	public void setgeneracreditosAnterior(GeneraCreditos generacreditosAnterior) {
		this.generacreditosAnterior = generacreditosAnterior;
	}	
	
	public GeneraCreditos getgeneracreditosTotales() {
		return this.generacreditosTotales;
	}

	public void setgeneracreditosTotales(GeneraCreditos generacreditosTotales) {
		this.generacreditosTotales = generacreditosTotales;
	}	
	
	public GeneraCreditos getgeneracreditosBean() {
		return this.generacreditosBean;
	}

	public void setgeneracreditosBean(GeneraCreditos generacreditosBean) {
		this.generacreditosBean = generacreditosBean;
	}	
	
	public GeneraCreditosParameterReturnGeneral getgeneracreditosReturnGeneral() {
		return this.generacreditosReturnGeneral;
	}

	public void setgeneracreditosReturnGeneral(GeneraCreditosParameterReturnGeneral generacreditosReturnGeneral) {
		this.generacreditosReturnGeneral = generacreditosReturnGeneral;
	}	
	
	
	public Long idBusquedaGeneraCreditos=0L;

	public Long getidBusquedaGeneraCreditos() {
		return this.idBusquedaGeneraCreditos;
	}

	public void setidBusquedaGeneraCreditos(Long idBusquedaGeneraCreditos) {
		this.idBusquedaGeneraCreditos = idBusquedaGeneraCreditos;
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
	
	
	public GeneraCreditosLogic getGeneraCreditosLogic()	{		
		return generacreditosLogic;
	}

	public void setGeneraCreditosLogic(GeneraCreditosLogic generacreditosLogic) {
		this.generacreditosLogic = generacreditosLogic;
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
	
	public Boolean getIsEsNuevoGeneraCreditos() {
		return isEsNuevoGeneraCreditos;
	}

	public void setIsEsNuevoGeneraCreditos(Boolean isEsNuevoGeneraCreditos) {
		this.isEsNuevoGeneraCreditos = isEsNuevoGeneraCreditos;
	}

	public Boolean getEsParaAccionDesdeFormularioGeneraCreditos() {
		return esParaAccionDesdeFormularioGeneraCreditos;
	}
	
	public void setEsParaAccionDesdeFormularioGeneraCreditos(Boolean esParaAccionDesdeFormularioGeneraCreditos) {
		this.esParaAccionDesdeFormularioGeneraCreditos = esParaAccionDesdeFormularioGeneraCreditos;
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

			if(this.generacreditosSessionBean==null) {
				this.generacreditosSessionBean=new GeneraCreditosSessionBean();
			}

			if(!this.generacreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(generacreditosSessionBean.getlidEmpresaActual());
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

					if(this.generacreditos!=null) {
						this.generacreditos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
						this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGeneraCreditos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
						if(this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.getItemCount()>0) {
							this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGeneraCreditosGenerico)throws Exception
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
				jComboBoxid_empresaGeneraCreditosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGeneraCreditosGenerico!=null && jComboBoxid_empresaGeneraCreditosGenerico.getItemCount()>0) {
					jComboBoxid_empresaGeneraCreditosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GeneraCreditos generacreditos,JComboBox jComboBoxid_empresaGeneraCreditosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGeneraCreditosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGeneraCreditosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				generacreditos.setid_empresa(empresaAux.getId());
				generacreditos.setempresa_descripcion(GeneraCreditosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				generacreditos.setEmpresa(empresaAux);			}
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

					if(!GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { 
							this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { 
					}

					if(!GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
							this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
							this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesGeneraCreditos() throws Exception {
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
		
	public GeneraCreditosParameterReturnGeneral getGeneraCreditosParameterGeneral() {
		return this.generacreditosParameterGeneral;
	}
	
	public void setGeneraCreditosParameterGeneral(GeneraCreditosParameterReturnGeneral generacreditosParameterGeneral) {
		this.generacreditosParameterGeneral = generacreditosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGeneraCreditos() {
		return isPermisoTodoGeneraCreditos;
	}

	public void setIsPermisoTodoGeneraCreditos(Boolean isPermisoTodoGeneraCreditos) {
		this.isPermisoTodoGeneraCreditos = isPermisoTodoGeneraCreditos;
	}

	public Boolean getIsPermisoNuevoGeneraCreditos() {
		return isPermisoNuevoGeneraCreditos;
	}

	public void setIsPermisoNuevoGeneraCreditos(Boolean isPermisoNuevoGeneraCreditos) {
		this.isPermisoNuevoGeneraCreditos = isPermisoNuevoGeneraCreditos;
	}

	public Boolean getIsPermisoActualizarGeneraCreditos() {
		return isPermisoActualizarGeneraCreditos;
	}

	public void setIsPermisoActualizarGeneraCreditos(Boolean isPermisoActualizarGeneraCreditos) {
		this.isPermisoActualizarGeneraCreditos = isPermisoActualizarGeneraCreditos;
	}

	public Boolean getIsPermisoEliminarGeneraCreditos() {
		return isPermisoEliminarGeneraCreditos;
	}

	public void setIsPermisoEliminarGeneraCreditos(Boolean isPermisoEliminarGeneraCreditos) {
		this.isPermisoEliminarGeneraCreditos = isPermisoEliminarGeneraCreditos;
	}

	public Boolean getIsPermisoGuardarCambiosGeneraCreditos() {
		return isPermisoGuardarCambiosGeneraCreditos;
	}

	public void setIsPermisoGuardarCambiosGeneraCreditos(Boolean isPermisoGuardarCambiosGeneraCreditos) {
		this.isPermisoGuardarCambiosGeneraCreditos = isPermisoGuardarCambiosGeneraCreditos;
	}
	
	public Boolean getIsPermisoConsultaGeneraCreditos() {
		return isPermisoConsultaGeneraCreditos;
	}

	public void setIsPermisoConsultaGeneraCreditos(Boolean isPermisoConsultaGeneraCreditos) {
		this.isPermisoConsultaGeneraCreditos = isPermisoConsultaGeneraCreditos;
	}

	public Boolean getIsPermisoBusquedaGeneraCreditos() {
		return isPermisoBusquedaGeneraCreditos;
	}

	public void setIsPermisoBusquedaGeneraCreditos(Boolean isPermisoBusquedaGeneraCreditos) {
		this.isPermisoBusquedaGeneraCreditos = isPermisoBusquedaGeneraCreditos;
	}

	public Boolean getIsPermisoReporteGeneraCreditos() {
		return isPermisoReporteGeneraCreditos;
	}

	public void setIsPermisoReporteGeneraCreditos(Boolean isPermisoReporteGeneraCreditos) {
		this.isPermisoReporteGeneraCreditos = isPermisoReporteGeneraCreditos;
	}
	
	public Boolean getIsPermisoPaginacionMedioGeneraCreditos() {
		return isPermisoPaginacionMedioGeneraCreditos;
	}

	public void setIsPermisoPaginacionMedioGeneraCreditos(Boolean isPermisoPaginacionMedioGeneraCreditos) {
		this.isPermisoPaginacionMedioGeneraCreditos = isPermisoPaginacionMedioGeneraCreditos;
	}
	
	public Boolean getIsPermisoPaginacionTodoGeneraCreditos() {
		return isPermisoPaginacionTodoGeneraCreditos;
	}

	public void setIsPermisoPaginacionTodoGeneraCreditos(Boolean isPermisoPaginacionTodoGeneraCreditos) {
		this.isPermisoPaginacionTodoGeneraCreditos = isPermisoPaginacionTodoGeneraCreditos;
	}
	
	public Boolean getIsPermisoPaginacionAltoGeneraCreditos() {
		return isPermisoPaginacionAltoGeneraCreditos;
	}

	public void setIsPermisoPaginacionAltoGeneraCreditos(Boolean isPermisoPaginacionAltoGeneraCreditos) {
		this.isPermisoPaginacionAltoGeneraCreditos = isPermisoPaginacionAltoGeneraCreditos;
	}
	
	public Boolean getIsPermisoCopiarGeneraCreditos() {
		return isPermisoCopiarGeneraCreditos;
	}

	public void setIsPermisoCopiarGeneraCreditos(Boolean isPermisoCopiarGeneraCreditos) {
		this.isPermisoCopiarGeneraCreditos = isPermisoCopiarGeneraCreditos;
	}
	
	public Boolean getIsPermisoVerFormGeneraCreditos() {
		return isPermisoVerFormGeneraCreditos;
	}

	public void setIsPermisoVerFormGeneraCreditos(Boolean isPermisoVerFormGeneraCreditos) {
		this.isPermisoVerFormGeneraCreditos = isPermisoVerFormGeneraCreditos;
	}
	
	public Boolean getIsPermisoDuplicarGeneraCreditos() {
		return isPermisoDuplicarGeneraCreditos;
	}

	public void setIsPermisoDuplicarGeneraCreditos(Boolean isPermisoDuplicarGeneraCreditos) {
		this.isPermisoDuplicarGeneraCreditos = isPermisoDuplicarGeneraCreditos;
	}
	
	public Boolean getIsPermisoOrdenGeneraCreditos() {
		return isPermisoOrdenGeneraCreditos;
	}

	public void setIsPermisoOrdenGeneraCreditos(Boolean isPermisoOrdenGeneraCreditos) {
		this.isPermisoOrdenGeneraCreditos = isPermisoOrdenGeneraCreditos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGeneraCreditos() {
		return isVisibilidadCeldaNuevoGeneraCreditos;
	}

	public void setIsVisibilidadCeldaNuevoGeneraCreditos(Boolean isVisibilidadCeldaNuevoGeneraCreditos) {
		this.isVisibilidadCeldaNuevoGeneraCreditos = isVisibilidadCeldaNuevoGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGeneraCreditos() {
		return isVisibilidadCeldaDuplicarGeneraCreditos;
	}

	public void setIsVisibilidadCeldaDuplicarGeneraCreditos(Boolean isVisibilidadCeldaDuplicarGeneraCreditos) {
		this.isVisibilidadCeldaDuplicarGeneraCreditos = isVisibilidadCeldaDuplicarGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGeneraCreditos() {
		return isVisibilidadCeldaCopiarGeneraCreditos;
	}

	public void setIsVisibilidadCeldaCopiarGeneraCreditos(Boolean isVisibilidadCeldaCopiarGeneraCreditos) {
		this.isVisibilidadCeldaCopiarGeneraCreditos = isVisibilidadCeldaCopiarGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGeneraCreditos() {
		return isVisibilidadCeldaVerFormGeneraCreditos;
	}

	public void setIsVisibilidadCeldaVerFormGeneraCreditos(Boolean isVisibilidadCeldaVerFormGeneraCreditos) {
		this.isVisibilidadCeldaVerFormGeneraCreditos = isVisibilidadCeldaVerFormGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGeneraCreditos() {
		return isVisibilidadCeldaOrdenGeneraCreditos;
	}

	public void setIsVisibilidadCeldaOrdenGeneraCreditos(Boolean isVisibilidadCeldaOrdenGeneraCreditos) {
		this.isVisibilidadCeldaOrdenGeneraCreditos = isVisibilidadCeldaOrdenGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGeneraCreditos() {
		return isVisibilidadCeldaNuevoRelacionesGeneraCreditos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGeneraCreditos(Boolean isVisibilidadCeldaNuevoRelacionesGeneraCreditos) {
		this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos = isVisibilidadCeldaNuevoRelacionesGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGeneraCreditos() {
		return isVisibilidadCeldaModificarGeneraCreditos;
	}

	public void setIsVisibilidadCeldaModificarGeneraCreditos(Boolean isVisibilidadCeldaModificarGeneraCreditos) {
		this.isVisibilidadCeldaModificarGeneraCreditos = isVisibilidadCeldaModificarGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGeneraCreditos() {
		return isVisibilidadCeldaActualizarGeneraCreditos;
	}

	public void setIsVisibilidadCeldaActualizarGeneraCreditos(Boolean isVisibilidadCeldaActualizarGeneraCreditos) {
		this.isVisibilidadCeldaActualizarGeneraCreditos = isVisibilidadCeldaActualizarGeneraCreditos;
	}

	public Boolean getIsVisibilidadCeldaEliminarGeneraCreditos() {
		return isVisibilidadCeldaEliminarGeneraCreditos;
	}

	public void setIsVisibilidadCeldaEliminarGeneraCreditos(Boolean isVisibilidadCeldaEliminarGeneraCreditos) {
		this.isVisibilidadCeldaEliminarGeneraCreditos = isVisibilidadCeldaEliminarGeneraCreditos;
	}

	public Boolean getIsVisibilidadCeldaCancelarGeneraCreditos() {
		return isVisibilidadCeldaCancelarGeneraCreditos;
	}

	public void setIsVisibilidadCeldaCancelarGeneraCreditos(Boolean isVisibilidadCeldaCancelarGeneraCreditos) {
		this.isVisibilidadCeldaCancelarGeneraCreditos = isVisibilidadCeldaCancelarGeneraCreditos;
	}

	public Boolean getIsVisibilidadCeldaGuardarGeneraCreditos() {
		return isVisibilidadCeldaGuardarGeneraCreditos;
	}

	public void setIsVisibilidadCeldaGuardarGeneraCreditos(Boolean isVisibilidadCeldaGuardarGeneraCreditos) {
		this.isVisibilidadCeldaGuardarGeneraCreditos = isVisibilidadCeldaGuardarGeneraCreditos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGeneraCreditos() {
		return isVisibilidadCeldaGuardarCambiosGeneraCreditos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGeneraCreditos(Boolean isVisibilidadCeldaGuardarCambiosGeneraCreditos) {
		this.isVisibilidadCeldaGuardarCambiosGeneraCreditos = isVisibilidadCeldaGuardarCambiosGeneraCreditos;
	}
		
	public GeneraCreditosSessionBean getgeneracreditosSessionBean() {
		return this.generacreditosSessionBean;
	}
	
	public void setgeneracreditosSessionBean(GeneraCreditosSessionBean generacreditosSessionBean) {
		this.generacreditosSessionBean=generacreditosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaGeneraCreditos() {
		return this.isVisibilidadBusquedaGeneraCreditos;
	}

	public void setisVisibilidadBusquedaGeneraCreditos(Boolean isVisibilidadBusquedaGeneraCreditos) {
		this.isVisibilidadBusquedaGeneraCreditos=isVisibilidadBusquedaGeneraCreditos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(GeneraCreditos generacreditos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(generacreditos,null);
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
	
	public void bugActualizarReferenciaActual(GeneraCreditos generacreditos,GeneraCreditos generacreditosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGeneraCreditos(generacreditos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		generacreditosAux.setId(generacreditos.getId());
		generacreditosAux.setVersionRow(generacreditos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(GeneraCreditos generacreditosLocal) throws Exception {
		
		if(this.generacreditosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GeneraCreditos generacreditosLocal) throws Exception {	
		if(this.generacreditosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				generacreditosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGeneraCreditosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = generacreditosValidator.getInvalidValues(this.generacreditos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GeneraCreditos generacreditos,List<GeneraCreditos> generacreditoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(GeneraCreditos generacreditos,List<GeneraCreditos> generacreditoss) throws Exception {
		try	{			
			GeneraCreditosConstantesFunciones.actualizarSelectedLista(generacreditos,generacreditoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GeneraCreditos> generacreditossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				generacreditossLocal=this.generacreditosLogic.getGeneraCreditoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				generacreditossLocal=this.generacreditoss;
			}
			//ARCHITECTURE
		
			for(GeneraCreditos generacreditosLocal:generacreditossLocal) {
				if(this.permiteMantenimiento(generacreditosLocal) && generacreditosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GeneraCreditosConstantesFunciones.getGeneraCreditosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelcodigoGeneraCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelnombre_completoGeneraCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.FECHAVENCE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelfecha_venceGeneraCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelfecha_emisionGeneraCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelnumero_facturaGeneraCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.DEBITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabeldebito_mone_localGeneraCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.CREDITOMONELOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelcredito_mone_localGeneraCreditos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GeneraCreditosConstantesFunciones.SALDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelsaldoGeneraCreditos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabelcodigoGeneraCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabelnombre_completoGeneraCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabelfecha_venceGeneraCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabelfecha_emisionGeneraCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabelnumero_facturaGeneraCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabeldebito_mone_localGeneraCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabelcredito_mone_localGeneraCreditos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGeneraCreditos.jLabelsaldoGeneraCreditos,"");
		
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
		this.iIdNuevoGeneraCreditos--;	
		
		
		this.generacreditosAux=new GeneraCreditos();
		
		this.generacreditosAux.setId(this.iIdNuevoGeneraCreditos);
		this.generacreditosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.generacreditosLogic.getGeneraCreditoss().add(this.generacreditosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.generacreditoss.add(this.generacreditosAux);
		}
		//ARCHITECTURE
		
		this.generacreditos=this.generacreditosAux;
		
		if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGeneraCreditos(this.generacreditos);
			this.setVariablesObjetoActualToFormularioForeignKeyGeneraCreditos(this.generacreditos);
		}
				
		//this.setDefaultControlesGeneraCreditos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGeneraCreditos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGeneraCreditos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGeneraCreditos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGeneraCreditos(this.generacreditosBean,this.generacreditos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGeneraCreditos(this.generacreditosReturnGeneral,this.generacreditosBean,false);
		
		if(this.generacreditosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGeneraCreditos(this.generacreditosReturnGeneral.getGeneraCreditos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGeneraCreditos(this.generacreditosReturnGeneral.getGeneraCreditos());
		}
		
		if(this.generacreditosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGeneraCreditos(this.generacreditosReturnGeneral.getGeneraCreditos(),classes);//this.generacreditosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGeneraCreditos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGeneraCreditos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.RecargarFormGeneraCreditos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGeneraCreditos(false);
						
			if(generacreditosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGeneraCreditos();
			}
			
			this.actualizarVisualTableDatosGeneraCreditos();
			
			this.jTableDatosGeneraCreditos.setRowSelectionInterval(this.getIndiceNuevoGeneraCreditos(), this.getIndiceNuevoGeneraCreditos());
			
			this.seleccionarFilaTablaGeneraCreditosActual();
						
			this.actualizarEstadoCeldasBotonesGeneraCreditos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGeneraCreditos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarcodigoGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarnombre_completoGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarfecha_venceGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarfecha_emisionGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarnumero_facturaGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activardebito_mone_localGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarcredito_mone_localGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarsaldoGeneraCreditos);	
		//
		this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setEnabled(isHabilitar && this.generacreditosConstantesFunciones.activarid_empresaGeneraCreditos);
	};
	
	public void setDefaultControlesGeneraCreditos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGeneraCreditos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.generacreditosSessionBean.setConGuardarRelaciones(true);			
			this.generacreditosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.setVisible(true);
			
					
		} else {
			//this.generacreditosSessionBean.setConGuardarRelaciones(false);			
			this.generacreditosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoGeneraCreditos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
				if(generacreditosAux.getId().equals(this.iIdNuevoGeneraCreditos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GeneraCreditos generacreditosAux:this.generacreditoss) {
				if(generacreditosAux.getId().equals(this.iIdNuevoGeneraCreditos)) {
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
	
	public int getIndiceActualGeneraCreditos(GeneraCreditos generacreditos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
				if(generacreditosAux.getId().equals(generacreditos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GeneraCreditos generacreditosAux:this.generacreditoss) {
				if(generacreditosAux.getId().equals(generacreditos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGeneraCreditos(GeneraCreditos generacreditosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
				if(generacreditosAux.getGeneraCreditosOriginal().getId().equals(generacreditosOriginal.getId())) {
					existe=true;
					generacreditosOriginal.setId(generacreditosAux.getId());
					generacreditosOriginal.setVersionRow(generacreditosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GeneraCreditos generacreditosAux:this.generacreditoss) {
				if(generacreditosAux.getGeneraCreditosOriginal().getId().equals(generacreditosOriginal.getId())) {
					existe=true;
					generacreditosOriginal.setId(generacreditosAux.getId());
					generacreditosOriginal.setVersionRow(generacreditosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGeneraCreditos(Boolean esParaCancelar) throws Exception {
		generacreditossAux=new ArrayList<GeneraCreditos>();
		generacreditosAux=new GeneraCreditos();
		
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
					if(generacreditosAux.getId()<0) {
						generacreditossAux.add(generacreditosAux);
					}		
				}
				this.iIdNuevoGeneraCreditos=0L;
				this.generacreditosLogic.getGeneraCreditoss().removeAll(generacreditossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GeneraCreditos generacreditosAux:this.generacreditoss) {
					if(generacreditosAux.getId()<0) {
						generacreditossAux.add(generacreditosAux);
					}		
				}
				this.iIdNuevoGeneraCreditos=0L;
				this.generacreditoss.removeAll(generacreditossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGeneraCreditos 
					&& this.generacreditosLogic.getGeneraCreditoss().size()>0
					) {
					generacreditosAux=this.generacreditosLogic.getGeneraCreditoss().get(this.generacreditosLogic.getGeneraCreditoss().size() - 1);
				
					if(generacreditosAux.getId()<0) {
						this.generacreditosLogic.getGeneraCreditoss().remove(generacreditosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGeneraCreditos && this.generacreditoss.size()>0) {
					generacreditosAux=this.generacreditoss.get(this.generacreditoss.size() - 1);
				
					if(generacreditosAux.getId()<0) {
						this.generacreditoss.remove(generacreditosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGeneraCreditos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(generacreditos.getId()<0) {
				this.generacreditosLogic.getGeneraCreditoss().remove(this.generacreditos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(generacreditos.getId()<0) {
				this.generacreditoss.remove(this.generacreditos);
			}
		}			
	}
	
	public void setEstadosInicialesGeneraCreditos(List<GeneraCreditos> generacreditossAux) throws Exception {
		GeneraCreditosConstantesFunciones.setEstadosInicialesGeneraCreditos(generacreditossAux);
	}
	
	public void setEstadosInicialesGeneraCreditos(GeneraCreditos generacreditosAux) throws Exception {
		GeneraCreditosConstantesFunciones.setEstadosInicialesGeneraCreditos(generacreditosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGeneraCreditosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGeneraCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGeneraCreditosActual()) {
				if(!this.isEsNuevoGeneraCreditos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGeneraCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGeneraCreditos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGeneraCreditosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Genera Creditos ?", "MANTENIMIENTO DE Genera Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGeneraCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GeneraCreditos generacreditos) throws Exception {
		GeneraCreditosConstantesFunciones.seleccionarAsignar(this.generacreditos,generacreditos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGeneraCreditos=this.isPermisoActualizarOriginalGeneraCreditos;
			
			
			this.seleccionarAsignar(generacreditos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesGeneraCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.generacreditosSessionBean.setsFuncionBusquedaRapida(this.generacreditosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGeneraCreditos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGeneraCreditos(esParaCancelar);				
				this.cancelarNuevoGeneraCreditos(esParaCancelar);								
			}
			
			this.generacreditos=new GeneraCreditos();
			
			this.inicializarGeneraCreditos();
			
			this.actualizarEstadoCeldasBotonesGeneraCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGeneraCreditos() throws Exception {
		try {
			GeneraCreditosConstantesFunciones.inicializarGeneraCreditos(this.generacreditos);
			
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
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.generacreditosLogic.getGeneraCreditoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGeneraCreditoss(String sAccionBusqueda,List<GeneraCreditos> generacreditossParaReportes) throws Exception {
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
					sPathReporteFinal="GeneraCreditos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GeneraCreditosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GeneraCreditosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GeneraCreditos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Genera Creditoses");		
		parameters.put("busquedapor", GeneraCreditosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGeneraCreditos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GeneraCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GeneraCreditosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGeneraCreditos=new JRBeanArrayDataSource(GeneraCreditosJInternalFrame.TraerGeneraCreditosBeans(generacreditossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGeneraCreditos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GeneraCreditosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GeneraCreditosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GeneraCreditosBean.TraerGeneraCreditosBeans(generacreditossParaReportes).toArray()));
							
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
				this.generarExcelReporteGeneraCreditoss(sAccionBusqueda,sTipoArchivoReporte,generacreditossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGeneraCreditoss(sAccionBusqueda,sTipoArchivoReporte,generacreditossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGeneraCreditosActionPerformed(null);
					//this.generarExcelReporteGeneraCreditoss(sAccionBusqueda,sTipoArchivoReporte,generacreditossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGeneraCreditoss(sAccionBusqueda,sTipoArchivoReporte,generacreditossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGeneraCreditoss(sAccionBusqueda,sTipoArchivoReporte,generacreditossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGeneraCreditoss(sAccionBusqueda,sTipoArchivoReporte,generacreditossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGeneraCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<GeneraCreditos> generacreditossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"generacreditos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GeneraCreditoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGeneraCreditos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GeneraCreditos generacreditos : generacreditossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GeneraCreditosConstantesFunciones.generarExcelReporteDataGeneraCreditos("NORMAL",row,workbook,generacreditos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGeneraCreditos(String sTipo,Row row,Workbook workbook) {
		
		GeneraCreditosConstantesFunciones.generarExcelReporteHeaderGeneraCreditos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGeneraCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<GeneraCreditos> generacreditossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"generacreditos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GeneraCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GeneraCreditos generacreditos : generacreditossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GeneraCreditosConstantesFunciones.getGeneraCreditosDescripcion(generacreditos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getfecha_vence());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getdebito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getcredito_mone_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GeneraCreditosConstantesFunciones.LABEL_SALDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_SALDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(generacreditos.getsaldo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGeneraCreditoss(String sAccionBusqueda,String sTipoArchivoReporte,List<GeneraCreditos> generacreditossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GeneraCreditos> generacreditossRespaldo=null;
		
		classes=GeneraCreditosConstantesFunciones.getClassesRelationshipsOfGeneraCreditos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.generacreditosLogic.setDatosCliente(this.datosCliente);
		this.generacreditosLogic.setDatosDeep(this.datosDeep);
		this.generacreditosLogic.setIsConDeep(true);
		
		generacreditossRespaldo=this.generacreditosLogic.getGeneraCreditoss();
		
		this.generacreditosLogic.setGeneraCreditoss(generacreditossParaReportes);	
		this.generacreditosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		generacreditossParaReportes=this.generacreditosLogic.getGeneraCreditoss();
		this.generacreditosLogic.setGeneraCreditoss(generacreditossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"generacreditos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GeneraCreditoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGeneraCreditos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GeneraCreditos generacreditos : generacreditossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGeneraCreditos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GeneraCreditosConstantesFunciones.generarExcelReporteDataGeneraCreditos("NORMAL",row,workbook,generacreditos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(GeneraCreditosConstantesFunciones.getGeneraCreditosDescripcion(generacreditos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGeneraCreditos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGeneraCreditos() throws Exception {		
		this.startProcessGeneraCreditos(true);
	}
	
	public void startProcessGeneraCreditos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGeneraCreditos ,this.jPanelParametrosReportesGeneraCreditos, this.jScrollPanelDatosGeneraCreditos,this.jPanelPaginacionGeneraCreditos, this.jScrollPanelDatosEdicionGeneraCreditos, this.jPanelAccionesGeneraCreditos,this.jPanelAccionesFormularioGeneraCreditos,this.jmenuBarGeneraCreditos,this.jmenuBarDetalleGeneraCreditos,this.jTtoolBarGeneraCreditos,this.jTtoolBarDetalleGeneraCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasGeneraCreditos=this.jTabbedPaneBusquedasGeneraCreditos; 
		
		final JPanel jPanelParametrosReportesGeneraCreditos=this.jPanelParametrosReportesGeneraCreditos;
		//final JScrollPane jScrollPanelDatosGeneraCreditos=this.jScrollPanelDatosGeneraCreditos;
		final JTable jTableDatosGeneraCreditos=this.jTableDatosGeneraCreditos;		
		final JPanel jPanelPaginacionGeneraCreditos=this.jPanelPaginacionGeneraCreditos;
		//final JScrollPane jScrollPanelDatosEdicionGeneraCreditos=this.jScrollPanelDatosEdicionGeneraCreditos;
		final JPanel jPanelAccionesGeneraCreditos=this.jPanelAccionesGeneraCreditos;
		
		JPanel jPanelCamposAuxiliarGeneraCreditos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGeneraCreditos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			jPanelCamposAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jPanelCamposGeneraCreditos;
			jPanelAccionesFormularioAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jPanelAccionesFormularioGeneraCreditos;
		}
		
		final JPanel jPanelCamposGeneraCreditos=jPanelCamposAuxiliarGeneraCreditos;
		final JPanel jPanelAccionesFormularioGeneraCreditos=jPanelAccionesFormularioAuxiliarGeneraCreditos;
		
		
		final JMenuBar jmenuBarGeneraCreditos=this.jmenuBarGeneraCreditos;
		final JToolBar jTtoolBarGeneraCreditos=this.jTtoolBarGeneraCreditos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGeneraCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGeneraCreditos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			jmenuBarDetalleAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jmenuBarDetalleGeneraCreditos;
			jTtoolBarDetalleAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jTtoolBarDetalleGeneraCreditos;
		}
		
		final JMenuBar jmenuBarDetalleGeneraCreditos=jmenuBarDetalleAuxiliarGeneraCreditos;
		final JToolBar jTtoolBarDetalleGeneraCreditos=jTtoolBarDetalleAuxiliarGeneraCreditos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGeneraCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGeneraCreditos;
			processRunnable.jTableDatos=jTableDatosGeneraCreditos;
			processRunnable.jPanelCampos=jPanelCamposGeneraCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionGeneraCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesGeneraCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGeneraCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarGeneraCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGeneraCreditos;
			processRunnable.jTtoolBar=jTtoolBarGeneraCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGeneraCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGeneraCreditos ,jPanelParametrosReportesGeneraCreditos,jTableDatosGeneraCreditos, /*jScrollPanelDatosGeneraCreditos,*/jPanelCamposGeneraCreditos,jPanelPaginacionGeneraCreditos, /*jScrollPanelDatosEdicionGeneraCreditos,*/ jPanelAccionesGeneraCreditos,jPanelAccionesFormularioGeneraCreditos,jmenuBarGeneraCreditos,jmenuBarDetalleGeneraCreditos,jTtoolBarGeneraCreditos,jTtoolBarDetalleGeneraCreditos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGeneraCreditos ,jPanelParametrosReportesGeneraCreditos, jScrollPanelDatosGeneraCreditos,jPanelPaginacionGeneraCreditos, jScrollPanelDatosEdicionGeneraCreditos, jPanelAccionesGeneraCreditos,jPanelAccionesFormularioGeneraCreditos,jmenuBarGeneraCreditos,jmenuBarDetalleGeneraCreditos,jTtoolBarGeneraCreditos,jTtoolBarDetalleGeneraCreditos);
						
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
	
	public void finishProcessGeneraCreditos() {// throws Exception 
		this.finishProcessGeneraCreditos(true);
	}
	
	public void finishProcessGeneraCreditos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGeneraCreditos ,this.jPanelParametrosReportesGeneraCreditos, this.jScrollPanelDatosGeneraCreditos,this.jPanelPaginacionGeneraCreditos, this.jScrollPanelDatosEdicionGeneraCreditos, this.jPanelAccionesGeneraCreditos,this.jPanelAccionesFormularioGeneraCreditos,this.jmenuBarGeneraCreditos,this.jmenuBarDetalleGeneraCreditos,this.jTtoolBarGeneraCreditos,this.jTtoolBarDetalleGeneraCreditos);		
		
		final JTabbedPane jTabbedPaneBusquedasGeneraCreditos=this.jTabbedPaneBusquedasGeneraCreditos; 
		
		final JPanel jPanelParametrosReportesGeneraCreditos=this.jPanelParametrosReportesGeneraCreditos;
		//final JScrollPane jScrollPanelDatosGeneraCreditos=this.jScrollPanelDatosGeneraCreditos;
		final JTable jTableDatosGeneraCreditos=this.jTableDatosGeneraCreditos;		
		final JPanel jPanelPaginacionGeneraCreditos=this.jPanelPaginacionGeneraCreditos;
		//final JScrollPane jScrollPanelDatosEdicionGeneraCreditos=this.jScrollPanelDatosEdicionGeneraCreditos;
		final JPanel jPanelAccionesGeneraCreditos=this.jPanelAccionesGeneraCreditos;
		
		JPanel jPanelCamposAuxiliarGeneraCreditos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGeneraCreditos=new JPanel();
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			jPanelCamposAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jPanelCamposGeneraCreditos;
			jPanelAccionesFormularioAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jPanelAccionesFormularioGeneraCreditos;
		}
		
		final JPanel jPanelCamposGeneraCreditos=jPanelCamposAuxiliarGeneraCreditos;
		final JPanel jPanelAccionesFormularioGeneraCreditos=jPanelAccionesFormularioAuxiliarGeneraCreditos;
		
		
		final JMenuBar jmenuBarGeneraCreditos=this.jmenuBarGeneraCreditos;		
		final JToolBar jTtoolBarGeneraCreditos=this.jTtoolBarGeneraCreditos;
				
		JMenuBar jmenuBarDetalleAuxiliarGeneraCreditos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGeneraCreditos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			jmenuBarDetalleAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jmenuBarDetalleGeneraCreditos;
			jTtoolBarDetalleAuxiliarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jTtoolBarDetalleGeneraCreditos;		
		}
		
		final JMenuBar jmenuBarDetalleGeneraCreditos=jmenuBarDetalleAuxiliarGeneraCreditos;
		final JToolBar jTtoolBarDetalleGeneraCreditos=jTtoolBarDetalleAuxiliarGeneraCreditos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGeneraCreditos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGeneraCreditos;
			processRunnable.jTableDatos=jTableDatosGeneraCreditos;
			processRunnable.jPanelCampos=jPanelCamposGeneraCreditos;
			processRunnable.jPanelPaginacion=jPanelPaginacionGeneraCreditos;
			processRunnable.jPanelAcciones=jPanelAccionesGeneraCreditos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGeneraCreditos;
			
			
			processRunnable.jmenuBar=jmenuBarGeneraCreditos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGeneraCreditos;
			processRunnable.jTtoolBar=jTtoolBarGeneraCreditos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGeneraCreditos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGeneraCreditos ,jPanelParametrosReportesGeneraCreditos, jTableDatosGeneraCreditos,/*jScrollPanelDatosGeneraCreditos,*/jPanelCamposGeneraCreditos,jPanelPaginacionGeneraCreditos, /*jScrollPanelDatosEdicionGeneraCreditos,*/ jPanelAccionesGeneraCreditos,jPanelAccionesFormularioGeneraCreditos,jmenuBarGeneraCreditos,jmenuBarDetalleGeneraCreditos,jTtoolBarGeneraCreditos,jTtoolBarDetalleGeneraCreditos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGeneraCreditos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGeneraCreditos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGeneraCreditos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGeneraCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGeneraCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGeneraCreditos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGeneraCreditos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGeneraCreditos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGeneraCreditos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.generacreditosConstantesFunciones.getsFinalQueryGeneraCreditos();
		String  finalQueryPaginacionTodos=this.generacreditosConstantesFunciones.getsFinalQueryGeneraCreditos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GeneraCreditosConstantesFunciones.getArrayColumnasGlobalesNoGeneraCreditos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GeneraCreditosConstantesFunciones.getArrayColumnasGlobalesGeneraCreditos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GeneraCreditosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.generacreditossEliminados= new ArrayList<GeneraCreditos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGeneraCreditos();
		
				///*GeneraCreditosSessionBean*/this.generacreditosSessionBean=new GeneraCreditosSessionBean();
			
			if(this.generacreditosSessionBean==null) {
				this.generacreditosSessionBean=new GeneraCreditosSessionBean();
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
					this.iNumeroPaginacion=GeneraCreditosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GeneraCreditosConstantesFunciones.getClassesForeignKeysOfGeneraCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/generacreditos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			generacreditossAux= new ArrayList<GeneraCreditos>();
			
				
			generacreditosLogic.setDatosCliente(this.datosCliente);
			generacreditosLogic.setDatosDeep(this.datosDeep);
			generacreditosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaGeneraCreditos")) {
				this.sDetalleReporte=GeneraCreditosConstantesFunciones.getDetalleIndiceBusquedaGeneraCreditos(idBusquedaGeneraCreditos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					generacreditosLogic.getGeneraCreditossBusquedaGeneraCreditos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaGeneraCreditos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GeneraCreditosConstantesFunciones.getDetalleIndiceBusquedaGeneraCreditos(idBusquedaGeneraCreditos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GeneraCreditosConstantesFunciones.getDetalleIndiceBusquedaGeneraCreditos(idBusquedaGeneraCreditos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=generacreditosLogic.getGeneraCreditoss()==null||generacreditosLogic.getGeneraCreditoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=generacreditoss==null|| generacreditoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						generacreditossAux=new ArrayList<GeneraCreditos>();
						generacreditossAux.addAll(generacreditosLogic.getGeneraCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							generacreditossAux=new ArrayList<GeneraCreditos>();
							generacreditossAux.addAll(generacreditoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							generacreditosLogic.getGeneraCreditossBusquedaGeneraCreditos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaGeneraCreditos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GeneraCreditosConstantesFunciones.getDetalleIndiceBusquedaGeneraCreditos(idBusquedaGeneraCreditos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GeneraCreditosConstantesFunciones.getDetalleIndiceBusquedaGeneraCreditos(idBusquedaGeneraCreditos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGeneraCreditoss("BusquedaGeneraCreditos",generacreditosLogic.getGeneraCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGeneraCreditoss("BusquedaGeneraCreditos",generacreditoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						generacreditosLogic.setGeneraCreditoss(new ArrayList<GeneraCreditos>());
						generacreditosLogic.getGeneraCreditoss().addAll(generacreditossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							generacreditoss=new ArrayList<GeneraCreditos>();
							generacreditoss.addAll(generacreditossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGeneraCreditos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGeneraCreditos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=generacreditosLogic.getGeneraCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=generacreditoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=generacreditosLogic.getGeneraCreditoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=generacreditoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GeneraCreditos generacreditos) {
		Boolean permite=true;
		
		if(this.generacreditos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GeneraCreditosConstantesFunciones.getOrderByListaGeneraCreditos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GeneraCreditosConstantesFunciones.getOrderByListaGeneraCreditos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GeneraCreditos generacreditos:generacreditosLogic.getGeneraCreditoss()) {
				if(generacreditos.getsType().equals(Constantes2.S_TOTALES)) {
					generacreditosTotales=generacreditos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GeneraCreditos generacreditos:this.generacreditoss) {
				if(generacreditos.getsType().equals(Constantes2.S_TOTALES)) {
					generacreditosTotales=generacreditos;
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
			this.generacreditosAux=new GeneraCreditos();
			this.generacreditosAux.setsType(Constantes2.S_TOTALES);
			this.generacreditosAux.setIsNew(false);
			this.generacreditosAux.setIsChanged(false);
			this.generacreditosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//GeneraCreditosConstantesFunciones.TotalizarValoresFilaGeneraCreditos(this.generacreditosLogic.getGeneraCreditoss(),this.generacreditosAux);
				
				//this.generacreditosLogic.getGeneraCreditoss().add(this.generacreditosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GeneraCreditosConstantesFunciones.TotalizarValoresFilaGeneraCreditos(this.generacreditoss,this.generacreditosAux);
				
				this.generacreditoss.add(this.generacreditosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		generacreditosTotales=new GeneraCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.generacreditosLogic.getGeneraCreditoss().remove(generacreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.generacreditoss.remove(generacreditosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		generacreditosTotales=new GeneraCreditos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GeneraCreditos generacreditos:generacreditosLogic.getGeneraCreditoss()) {
				if(generacreditos.getsType().equals(Constantes2.S_TOTALES)) {
					generacreditosTotales=generacreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GeneraCreditosConstantesFunciones.TotalizarValoresFilaGeneraCreditos(this.generacreditosLogic.getGeneraCreditoss(),generacreditosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GeneraCreditos generacreditos:this.generacreditoss) {
				if(generacreditos.getsType().equals(Constantes2.S_TOTALES)) {
					generacreditosTotales=generacreditos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GeneraCreditosConstantesFunciones.TotalizarValoresFilaGeneraCreditos(this.generacreditoss,generacreditosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGeneraCreditossBusquedaGeneraCreditos()throws Exception {
		try {
			sAccionBusqueda="BusquedaGeneraCreditos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGeneraCreditossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGeneraCreditossBusquedaGeneraCreditos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//generacreditosLogic.getGeneraCreditossBusquedaGeneraCreditos(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGeneraCreditossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//generacreditosLogic.getGeneraCreditossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosGeneraCreditos() {
		this.isPermisoTodoGeneraCreditos=false;
		this.isPermisoNuevoGeneraCreditos=false;
		this.isPermisoActualizarGeneraCreditos=false;
		this.isPermisoActualizarOriginalGeneraCreditos=false;
		this.isPermisoEliminarGeneraCreditos=false;
		this.isPermisoGuardarCambiosGeneraCreditos=false;
		this.isPermisoConsultaGeneraCreditos=true;
		this.isPermisoBusquedaGeneraCreditos=true;
		this.isPermisoReporteGeneraCreditos=true;
		this.isPermisoOrdenGeneraCreditos=false;		
		this.isPermisoPaginacionMedioGeneraCreditos=false;		
		this.isPermisoPaginacionAltoGeneraCreditos=false;		
		this.isPermisoPaginacionTodoGeneraCreditos=false;		
		this.isPermisoCopiarGeneraCreditos=false;		
		this.isPermisoVerFormGeneraCreditos=false;		
		this.isPermisoDuplicarGeneraCreditos=false;
		this.isPermisoOrdenGeneraCreditos=false;
	}
	
	public void setPermisosUsuarioGeneraCreditos(Boolean isPermiso) {
		this.isPermisoTodoGeneraCreditos=isPermiso;
		this.isPermisoNuevoGeneraCreditos=isPermiso;
		this.isPermisoActualizarGeneraCreditos=isPermiso;
		this.isPermisoActualizarOriginalGeneraCreditos=isPermiso;
		this.isPermisoEliminarGeneraCreditos=isPermiso;
		this.isPermisoGuardarCambiosGeneraCreditos=isPermiso;
		this.isPermisoConsultaGeneraCreditos=isPermiso;
		this.isPermisoBusquedaGeneraCreditos=isPermiso;
		this.isPermisoReporteGeneraCreditos=isPermiso;
		this.isPermisoOrdenGeneraCreditos=isPermiso;		
		this.isPermisoPaginacionMedioGeneraCreditos=isPermiso;		
		this.isPermisoPaginacionAltoGeneraCreditos=isPermiso;		
		this.isPermisoPaginacionTodoGeneraCreditos=isPermiso;		
		this.isPermisoCopiarGeneraCreditos=isPermiso;		
		this.isPermisoVerFormGeneraCreditos=isPermiso;		
		this.isPermisoDuplicarGeneraCreditos=isPermiso;
		this.isPermisoOrdenGeneraCreditos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGeneraCreditos(Boolean isPermiso) {
		//this.isPermisoTodoGeneraCreditos=isPermiso;
		this.isPermisoNuevoGeneraCreditos=isPermiso;
		this.isPermisoActualizarGeneraCreditos=isPermiso;
		this.isPermisoActualizarOriginalGeneraCreditos=isPermiso;
		this.isPermisoEliminarGeneraCreditos=isPermiso;
		this.isPermisoGuardarCambiosGeneraCreditos=isPermiso;
		//this.isPermisoConsultaGeneraCreditos=isPermiso;
		//this.isPermisoBusquedaGeneraCreditos=isPermiso;
		//this.isPermisoReporteGeneraCreditos=isPermiso;
		//this.isPermisoOrdenGeneraCreditos=isPermiso;		
		//this.isPermisoPaginacionMedioGeneraCreditos=isPermiso;		
		//this.isPermisoPaginacionAltoGeneraCreditos=isPermiso;		
		//this.isPermisoPaginacionTodoGeneraCreditos=isPermiso;		
		//this.isPermisoCopiarGeneraCreditos=isPermiso;		
		//this.isPermisoDuplicarGeneraCreditos=isPermiso;
		//this.isPermisoOrdenGeneraCreditos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGeneraCreditosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(GeneraCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebGeneraCreditos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGeneraCreditosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioGeneraCreditosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGeneraCreditosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGeneraCreditosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioGeneraCreditos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GeneraCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.generacreditosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GeneraCreditosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGeneraCreditos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGeneraCreditos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGeneraCreditos=this.isPermisoActualizarGeneraCreditos;
			this.isPermisoEliminarGeneraCreditos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGeneraCreditos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGeneraCreditos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGeneraCreditos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGeneraCreditos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGeneraCreditos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGeneraCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGeneraCreditos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGeneraCreditos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGeneraCreditos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGeneraCreditos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGeneraCreditos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGeneraCreditos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGeneraCreditos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.generacreditosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGeneraCreditos.setToolTipText(this.jTableDatosGeneraCreditos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGeneraCreditos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGeneraCreditos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GeneraCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GeneraCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGeneraCreditos() throws Exception {
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
	public void inicializarCombosForeignKeyGeneraCreditosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGeneraCreditosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GeneraCreditosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyGeneraCreditos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.generacreditosSessionBean==null) {
				this.generacreditosSessionBean=new GeneraCreditosSessionBean();
			}

			if(!this.generacreditosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyGeneraCreditos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGeneraCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGeneraCreditos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGeneraCreditos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGeneraCreditos(GeneraCreditos generacreditos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGeneraCreditos(GeneraCreditos generacreditos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGeneraCreditos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGeneraCreditos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGeneraCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGeneraCreditos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGeneraCreditos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGeneraCreditos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGeneraCreditos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGeneraCreditos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.getItemCount()>0) {
				this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public GeneraCreditosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GeneraCreditosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GeneraCreditosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.generacreditosSessionBean=new GeneraCreditosSessionBean(); 
		this.generacreditosConstantesFunciones=new GeneraCreditosConstantesFunciones(); 
		this.generacreditosBean=new GeneraCreditos();//(this.generacreditosConstantesFunciones); 		
		this.generacreditosReturnGeneral=new GeneraCreditosParameterReturnGeneral(); 
		
		this.generacreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.generacreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GeneraCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GeneraCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GeneraCreditosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGeneraCreditos(true);
			
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
			
			this.generacreditosConstantesFunciones=new GeneraCreditosConstantesFunciones(); 
			this.generacreditosBean=new GeneraCreditos();//this.generacreditosConstantesFunciones); 			
			this.generacreditosReturnGeneral=new GeneraCreditosParameterReturnGeneral(); 
		
			GeneraCreditosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Genera Creditos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.generacreditos=new GeneraCreditos();
			this.generacreditoss = new ArrayList<GeneraCreditos>();
			this.generacreditossAux = new ArrayList<GeneraCreditos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic=new GeneraCreditosLogic();
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.generacreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.generacreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGeneraCreditos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGeneraCreditos);	
					}
					
					if(this.jInternalFrameImportacionGeneraCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGeneraCreditos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGeneraCreditos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGeneraCreditos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGeneraCreditos);
				this.jInternalFrameDetalleFormGeneraCreditos.setVisible(false);
				this.jInternalFrameDetalleFormGeneraCreditos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGeneraCreditos);
					this.jInternalFrameReporteDinamicoGeneraCreditos.setVisible(false);
					this.jInternalFrameReporteDinamicoGeneraCreditos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGeneraCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGeneraCreditos);
					this.jInternalFrameImportacionGeneraCreditos.setVisible(false);
					this.jInternalFrameImportacionGeneraCreditos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGeneraCreditos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGeneraCreditos);
					this.jInternalFrameOrderByGeneraCreditos.setVisible(false);
					this.jInternalFrameOrderByGeneraCreditos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGeneraCreditosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GeneraCreditosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.generacreditosReturnGeneral=new GeneraCreditosParameterReturnGeneral();
			
			this.generacreditosParameterGeneral=new GeneraCreditosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.generacreditosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GeneraCreditosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.generacreditosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GeneraCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.generacreditosSessionBean.getEsGuardarRelacionado(),this.generacreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GeneraCreditosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.generacreditosSessionBean.getEsGuardarRelacionado(),this.generacreditosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGeneraCreditos=false;
			this.isVisibilidadCeldaDuplicarGeneraCreditos=true;
			this.isVisibilidadCeldaCopiarGeneraCreditos=true;
			this.isVisibilidadCeldaVerFormGeneraCreditos=true;
			this.isVisibilidadCeldaOrdenGeneraCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
			this.isVisibilidadCeldaModificarGeneraCreditos=false;
			this.isVisibilidadCeldaActualizarGeneraCreditos=false;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
			this.isVisibilidadCeldaCancelarGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
			
			
			this.isVisibilidadBusquedaGeneraCreditos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGeneraCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGeneraCreditos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGeneraCreditos(false);
			
			this.setPermisosUsuarioGeneraCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.generacreditosSessionBean.getEsGuardarRelacionado() 
				|| (this.generacreditosSessionBean.getEsGuardarRelacionado() && this.generacreditosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGeneraCreditosClasesRelacionadas();
			}
			
			if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGeneraCreditosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGeneraCreditos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGeneraCreditos();
			}
			
			if(!this.isPermisoBusquedaGeneraCreditos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GeneraCreditosConstantesFunciones.getTiposSeleccionarGeneraCreditos());
				
				this.tiposColumnasSelect=GeneraCreditosConstantesFunciones.getTiposSeleccionarGeneraCreditos(true);
				
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
			//if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGeneraCreditos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioGeneraCreditos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioGeneraCreditos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGeneraCreditos() ;
			
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
				generacreditosImplementable= (GeneraCreditosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GeneraCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				generacreditosImplementableHome= (GeneraCreditosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GeneraCreditosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.generacreditoss= new ArrayList<GeneraCreditos>();
			this.generacreditossEliminados= new ArrayList<GeneraCreditos>();
						
			this.isEsNuevoGeneraCreditos=false;
			this.esParaAccionDesdeFormularioGeneraCreditos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGeneraCreditos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGeneraCreditos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GeneraCreditosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GeneraCreditosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGeneraCreditos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGeneraCreditos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGeneraCreditos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGeneraCreditos();
			}
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGeneraCreditos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGeneraCreditos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGeneraCreditos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGeneraCreditos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GeneraCreditos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGeneraCreditos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGeneraCreditos")) {
				iIndex=this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGeneraCreditos();	
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
	
	public void cargarCombosForeignKeyGeneraCreditos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGeneraCreditos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGeneraCreditos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGeneraCreditosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGeneraCreditos();
		
		this.cargarCombosFrameForeignKeyGeneraCreditos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGeneraCreditos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGeneraCreditos();
		}
	}
	
	
	
	public void jButtonNuevoGeneraCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
			
			if(jTableDatosGeneraCreditos.getRowCount()>=1) {
				jTableDatosGeneraCreditos.removeRowSelectionInterval(0, jTableDatosGeneraCreditos.getRowCount()-1);						
			}
			
			this.isEsNuevoGeneraCreditos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGeneraCreditos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGeneraCreditos(true);			
			//this.generacreditos=new GeneraCreditos();
			//this.generacreditos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGeneraCreditos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGeneraCreditos() ;
			
			if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGeneraCreditos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.generacreditos);	
			this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);				
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
			if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GeneraCreditos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGeneraCreditosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGeneraCreditos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGeneraCreditos.getSelectedRows().length;			
			}
			
			generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGeneraCreditos--;			
				//GeneraCreditos generacreditosAux= new GeneraCreditos();			
				//generacreditosAux.setId(this.iIdNuevoGeneraCreditos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GeneraCreditos generacreditosOrigen=new GeneraCreditos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GeneraCreditos generacreditosOrigen : generacreditossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							generacreditosOrigen =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							generacreditosOrigen =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGeneraCreditos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.generacreditos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGeneraCreditos(generacreditosOrigen,this.generacreditos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.generacreditosLogic.getGeneraCreditoss().add(this.generacreditosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.generacreditoss.add(this.generacreditosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGeneraCreditos(false);
				
				this.jTableDatosGeneraCreditos.setRowSelectionInterval(this.getIndiceNuevoGeneraCreditos(), this.getIndiceNuevoGeneraCreditos());
				
				int iLastRow =  this.jTableDatosGeneraCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGeneraCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGeneraCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGeneraCreditos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();									
		
			GeneraCreditos generacreditosOrigen=new GeneraCreditos();
			GeneraCreditos generacreditosDestino=new GeneraCreditos();
				
			generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGeneraCreditos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || generacreditossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGeneraCreditos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						generacreditosOrigen =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						generacreditosOrigen =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						generacreditosDestino =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						generacreditosDestino =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				generacreditosOrigen =generacreditossSeleccionados.get(0);
				generacreditosDestino =generacreditossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGeneraCreditos(generacreditosOrigen,generacreditosDestino,true,false);
				
				generacreditosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(generacreditosDestino,generacreditosLogic.getGeneraCreditoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(generacreditosDestino,generacreditoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGeneraCreditos(false);
				
				//this.jTableDatosGeneraCreditos.setRowSelectionInterval(this.getIndiceNuevoGeneraCreditos(), this.getIndiceNuevoGeneraCreditos());
				
				int iLastRow =  this.jTableDatosGeneraCreditos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGeneraCreditos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGeneraCreditos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGeneraCreditos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGeneraCreditos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGeneraCreditos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGeneraCreditos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGeneraCreditos.setVisible(!isVisible);
			this.jPanelPaginacionGeneraCreditos.setVisible(!isVisible);
			this.jPanelAccionesGeneraCreditos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGeneraCreditos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGeneraCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGeneraCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGeneraCreditos();
			
			this.abrirFrameOrderByGeneraCreditos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGeneraCreditos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGeneraCreditos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGeneraCreditos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGeneraCreditos.isMaximum()) {
					this.jInternalFrameDetalleFormGeneraCreditos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGeneraCreditos.setSize(this.jInternalFrameDetalleFormGeneraCreditos.iWidthFormulario,this.jInternalFrameDetalleFormGeneraCreditos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGeneraCreditos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGeneraCreditos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGeneraCreditos.isMaximum()) {
						this.jInternalFrameDetalleFormGeneraCreditos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGeneraCreditos.jContentPaneDetalleGeneraCreditos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGeneraCreditos.jContentPaneDetalleGeneraCreditos.getWidth(),GeneraCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGeneraCreditos.jContentPaneDetalleGeneraCreditos.getWidth(),GeneraCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGeneraCreditos.jContentPaneDetalleGeneraCreditos.getWidth(),GeneraCreditosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGeneraCreditos.setVisible(true);
	        this.jInternalFrameDetalleFormGeneraCreditos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGeneraCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGeneraCreditos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGeneraCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGeneraCreditos,false,this);
				} else {
					this.jInternalFrameOrderByGeneraCreditos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGeneraCreditos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGeneraCreditos);
				this.jInternalFrameOrderByGeneraCreditos.setVisible(false);
				this.jInternalFrameOrderByGeneraCreditos.setSelected(false);
				
				this.jInternalFrameOrderByGeneraCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGeneraCreditos"));
				
				this.inicializarActualizarBindingTablaOrderByGeneraCreditos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGeneraCreditos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGeneraCreditos==null) {
				
				this.jInternalFrameImportacionGeneraCreditos=new ImportacionJInternalFrame(GeneraCreditosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGeneraCreditos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGeneraCreditos);
				this.jInternalFrameImportacionGeneraCreditos.setVisible(false);
				this.jInternalFrameImportacionGeneraCreditos.setSelected(false);


				this.jInternalFrameImportacionGeneraCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGeneraCreditos"));
				this.jInternalFrameImportacionGeneraCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGeneraCreditos"));
				this.jInternalFrameImportacionGeneraCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGeneraCreditos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGeneraCreditos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGeneraCreditos==null) {
				this.jInternalFrameReporteDinamicoGeneraCreditos=new ReporteDinamicoJInternalFrame(GeneraCreditosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGeneraCreditos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGeneraCreditos);
				this.jInternalFrameReporteDinamicoGeneraCreditos.setVisible(false);
				this.jInternalFrameReporteDinamicoGeneraCreditos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGeneraCreditos"));
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGeneraCreditos"));
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGeneraCreditos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGeneraCreditos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleGeneraCreditos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGeneraCreditos);
			
	       	this.jInternalFrameDetalleFormGeneraCreditos.setVisible(false);
	        this.jInternalFrameDetalleFormGeneraCreditos.setSelected(false);
			
			//this.jInternalFrameDetalleFormGeneraCreditos.dispose();
			//this.jInternalFrameDetalleFormGeneraCreditos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGeneraCreditos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGeneraCreditos.setVisible(true);
	        this.jInternalFrameReporteDinamicoGeneraCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGeneraCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGeneraCreditos.setVisible(true);
	        this.jInternalFrameImportacionGeneraCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGeneraCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGeneraCreditos.setVisible(true);
	        this.jInternalFrameOrderByGeneraCreditos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGeneraCreditos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGeneraCreditos.setVisible(false);
	        this.jInternalFrameOrderByGeneraCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGeneraCreditos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGeneraCreditos.setVisible(false);
	        this.jInternalFrameReporteDinamicoGeneraCreditos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGeneraCreditos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGeneraCreditos.setVisible(false);
	        this.jInternalFrameImportacionGeneraCreditos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGeneraCreditos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGeneraCreditos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGeneraCreditos(true);
			//this.isEsNuevoGeneraCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGeneraCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGeneraCreditos(false) ;
			
			if(generacreditosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGeneraCreditos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGeneraCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGeneraCreditosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGeneraCreditos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGeneraCreditos(true);
			//this.isEsNuevoGeneraCreditos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.generacreditos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGeneraCreditos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGeneraCreditos(false) ;
			
			if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGeneraCreditos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGeneraCreditos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGeneraCreditos(false);
			
			//if(!this.isEsNuevoGeneraCreditos) {								
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				
			}
			
			if(this.permiteMantenimiento(this.generacreditos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGeneraCreditos=true;
					this.inicializarActualizarBindingTablaGeneraCreditos(false);
					this.isEsNuevoGeneraCreditos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGeneraCreditos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGeneraCreditos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGeneraCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGeneraCreditos(false);
				
				this.habilitarDeshabilitarControlesGeneraCreditos(false);
			
												
				
				if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGeneraCreditos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGeneraCreditosActionPerformed(evt,generacreditosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGeneraCreditos(this.generacreditos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGeneraCreditos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,generacreditosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.generacreditos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				this.generacreditos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				this.generacreditos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.generacreditos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GeneraCreditosModel) this.jTableDatosGeneraCreditos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGeneraCreditos=true;
				this.inicializarActualizarBindingTablaGeneraCreditos(false);
				this.isEsNuevoGeneraCreditos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGeneraCreditos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGeneraCreditos(false);
				
				this.habilitarDeshabilitarControlesGeneraCreditos(false);
				
				
				
				if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGeneraCreditos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGeneraCreditos.getRowCount()>=1) {
				jTableDatosGeneraCreditos.removeRowSelectionInterval(0, jTableDatosGeneraCreditos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGeneraCreditos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGeneraCreditos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGeneraCreditos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGeneraCreditos(false) ;
			
			this.isEsNuevoGeneraCreditos=false;
			
			if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGeneraCreditos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGeneraCreditos(false);
				
				//SI ES MANUAL
				if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGeneraCreditos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGeneraCreditos--;			
			//GeneraCreditos generacreditosAux= new GeneraCreditos();			
			//generacreditosAux.setId(this.iIdNuevoGeneraCreditos);
			
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGeneraCreditos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
			
			this.generacreditos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.generacreditosLogic.getGeneraCreditoss().add(this.generacreditosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.generacreditoss.add(this.generacreditosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGeneraCreditos(false);
			
			this.jTableDatosGeneraCreditos.setRowSelectionInterval(this.getIndiceNuevoGeneraCreditos(), this.getIndiceNuevoGeneraCreditos());
			
			int iLastRow =  this.jTableDatosGeneraCreditos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGeneraCreditos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGeneraCreditos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGeneraCreditos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGeneraCreditos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGeneraCreditos(false);
			
			//SI ES MANUAL
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGeneraCreditos();
			}
			
			//this.abrirFrameTreeGeneraCreditos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGeneraCreditos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGeneraCreditos.setFileImportacion(this.jInternalFrameImportacionGeneraCreditos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGeneraCreditos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGeneraCreditos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGeneraCreditos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGeneraCreditos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		

		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GeneraCreditosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GeneraCreditosBaseDesign.jrxml";
			
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
			
			this.generarReporteGeneraCreditoss("Todos",generacreditossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GeneraCreditosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVence_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVence_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVence_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVence_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoMoneLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoMoneLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoMoneLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoMoneLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GeneraCreditosConstantesFunciones.LABEL_SALDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ldo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ldo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ldo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ldo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoGeneraCreditos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GeneraCreditosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoria="fecha_vence";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoria="debito_mone_local";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoria="credito_mone_local";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoria="saldo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GeneraCreditosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE:
					sNombreCampoCategoriaValor="fecha_vence";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					sNombreCampoCategoriaValor="debito_mone_local";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					sNombreCampoCategoriaValor="credito_mone_local";
					break;

				case GeneraCreditosConstantesFunciones.LABEL_SALDO:
					sNombreCampoCategoriaValor="saldo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GeneraCreditosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vence",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vence");
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_mone_local");
					break;

				case GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Mone Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_mone_local");
					break;

				case GeneraCreditosConstantesFunciones.LABEL_SALDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Saldo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"saldo");
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
	
	public void jButtonGenerarExcelReporteDinamicoGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"generacreditos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GeneraCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getfecha_vence());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getdebito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getcredito_mone_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GeneraCreditosConstantesFunciones.LABEL_SALDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_SALDO);
					iRow++;

					for(GeneraCreditos generacreditos:generacreditossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(generacreditos.getsaldo());
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
			//	this.getFilaCabeceraExportarExcelGeneraCreditos(row);				
			//	iRow++;
			//}				
			
			//for(GeneraCreditos generacreditosAux:generacreditossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGeneraCreditos(generacreditosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			GeneraCreditosBeanSwingJInternalFrameAdditional.ProcesarInformacionGeneraCreditos(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGeneraCreditos(false);
			
			//SI ES MANUAL
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGeneraCreditos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGeneraCreditos(false);
			
			//SI ES MANUAL
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGeneraCreditos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGeneraCreditos(false);
			
			//SI ES MANUAL
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGeneraCreditos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGeneraCreditos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGeneraCreditos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGeneraCreditos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGeneraCreditos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGeneraCreditos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGeneraCreditos.setMinimumSize(dimensionMinimum);
		this.jTableDatosGeneraCreditos.setMaximumSize(dimensionMaximum);
		this.jTableDatosGeneraCreditos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGeneraCreditos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGeneraCreditos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGeneraCreditos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGeneraCreditos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGeneraCreditos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGeneraCreditos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGeneraCreditos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGeneraCreditos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGeneraCreditos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGeneraCreditos();
		
		this.inicializarActualizarBindingBotonesManualGeneraCreditos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGeneraCreditos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGeneraCreditos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGeneraCreditos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGeneraCreditos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGeneraCreditos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGeneraCreditos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGeneraCreditos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGeneraCreditos.jCheckBoxPostAccionNuevoGeneraCreditos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGeneraCreditos.jCheckBoxPostAccionSinCerrarGeneraCreditos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGeneraCreditos.jCheckBoxPostAccionSinMensajeGeneraCreditos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGeneraCreditos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGeneraCreditos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGeneraCreditos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
				this.jInternalFrameDetalleFormGeneraCreditos.jCheckBoxPostAccionNuevoGeneraCreditos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGeneraCreditos.jCheckBoxPostAccionSinCerrarGeneraCreditos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGeneraCreditos.jCheckBoxPostAccionSinMensajeGeneraCreditos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGeneraCreditos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGeneraCreditos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGeneraCreditos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGeneraCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGeneraCreditos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGeneraCreditos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGeneraCreditos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGeneraCreditos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGeneraCreditos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGeneraCreditos(Boolean esInicializar) throws Exception {
		try	{	
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGeneraCreditos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGeneraCreditos() throws Exception {
		try	{
			if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGeneraCreditos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGeneraCreditos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGeneraCreditos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGeneraCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGeneraCreditos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGeneraCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGeneraCreditos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGeneraCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGeneraCreditos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGeneraCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGeneraCreditos.addItem(reporte);
			}
			
			
			if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGeneraCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGeneraCreditos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGeneraCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGeneraCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGeneraCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGeneraCreditos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGeneraCreditos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGeneraCreditos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGeneraCreditos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGeneraCreditos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGeneraCreditos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
				
				if(this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGeneraCreditos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=GeneraCreditosConstantesFunciones.getTiposSeleccionarGeneraCreditos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=GeneraCreditosConstantesFunciones.getTiposSeleccionarGeneraCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=GeneraCreditosConstantesFunciones.getTiposSeleccionarGeneraCreditos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoGeneraCreditos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGeneraCreditos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaGeneraCreditos=Long.parseLong(this.jLabelidGeneraCreditosBusquedaGeneraCreditos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGeneraCreditos(Boolean esInicializar) throws Exception {				
		if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGeneraCreditos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGeneraCreditos() throws Exception {
		this.inicializarActualizarBindingTablaGeneraCreditos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGeneraCreditos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGeneraCreditosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGeneraCreditos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=generacreditosLogic.getGeneraCreditoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=generacreditoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGeneraCreditos.setModel(new GeneraCreditosModel(this.generacreditosLogic.getGeneraCreditoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGeneraCreditos.setModel(new GeneraCreditosModel(this.generacreditoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGeneraCreditos!=null && this.jInternalFrameOrderByGeneraCreditos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGeneraCreditos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO,generacreditosConstantesFunciones.resaltarSeleccionarGeneraCreditos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GeneraCreditosConstantesFunciones.SCLASSWEBTITULO,generacreditosConstantesFunciones.resaltarSeleccionarGeneraCreditos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_CODIGO));

		if(this.generacreditosConstantesFunciones.mostrarcodigoGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.generacreditosConstantesFunciones.resaltarcodigoGeneraCreditos,this.generacreditosConstantesFunciones.activarcodigoGeneraCreditos,iSizeTabla,this,true,"codigoGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.generacreditosConstantesFunciones.resaltarcodigoGeneraCreditos,this.generacreditosConstantesFunciones.activarcodigoGeneraCreditos,this,true,"codigoGeneraCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.generacreditosConstantesFunciones.mostrarnombre_completoGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.generacreditosConstantesFunciones.resaltarnombre_completoGeneraCreditos,this.generacreditosConstantesFunciones.activarnombre_completoGeneraCreditos,iSizeTabla,this,true,"nombre_completoGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.generacreditosConstantesFunciones.resaltarnombre_completoGeneraCreditos,this.generacreditosConstantesFunciones.activarnombre_completoGeneraCreditos,this,true,"nombre_completoGeneraCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE));

		if(this.generacreditosConstantesFunciones.mostrarfecha_venceGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.generacreditosConstantesFunciones.resaltarfecha_venceGeneraCreditos,this.generacreditosConstantesFunciones.activarfecha_venceGeneraCreditos,iSizeTabla,this,true,"fecha_venceGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.generacreditosConstantesFunciones.resaltarfecha_venceGeneraCreditos,this.generacreditosConstantesFunciones.activarfecha_venceGeneraCreditos,this,true,"fecha_venceGeneraCreditos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.generacreditosConstantesFunciones.mostrarfecha_emisionGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.generacreditosConstantesFunciones.resaltarfecha_emisionGeneraCreditos,this.generacreditosConstantesFunciones.activarfecha_emisionGeneraCreditos,iSizeTabla,this,true,"fecha_emisionGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.generacreditosConstantesFunciones.resaltarfecha_emisionGeneraCreditos,this.generacreditosConstantesFunciones.activarfecha_emisionGeneraCreditos,this,true,"fecha_emisionGeneraCreditos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.generacreditosConstantesFunciones.mostrarnumero_facturaGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.generacreditosConstantesFunciones.resaltarnumero_facturaGeneraCreditos,this.generacreditosConstantesFunciones.activarnumero_facturaGeneraCreditos,iSizeTabla,this,true,"numero_facturaGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.generacreditosConstantesFunciones.resaltarnumero_facturaGeneraCreditos,this.generacreditosConstantesFunciones.activarnumero_facturaGeneraCreditos,this,true,"numero_facturaGeneraCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL));

		if(this.generacreditosConstantesFunciones.mostrardebito_mone_localGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.generacreditosConstantesFunciones.resaltardebito_mone_localGeneraCreditos,this.generacreditosConstantesFunciones.activardebito_mone_localGeneraCreditos,iSizeTabla,this,true,"debito_mone_localGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.generacreditosConstantesFunciones.resaltardebito_mone_localGeneraCreditos,this.generacreditosConstantesFunciones.activardebito_mone_localGeneraCreditos,this,true,"debito_mone_localGeneraCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL));

		if(this.generacreditosConstantesFunciones.mostrarcredito_mone_localGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.generacreditosConstantesFunciones.resaltarcredito_mone_localGeneraCreditos,this.generacreditosConstantesFunciones.activarcredito_mone_localGeneraCreditos,iSizeTabla,this,true,"credito_mone_localGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.generacreditosConstantesFunciones.resaltarcredito_mone_localGeneraCreditos,this.generacreditosConstantesFunciones.activarcredito_mone_localGeneraCreditos,this,true,"credito_mone_localGeneraCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,GeneraCreditosConstantesFunciones.LABEL_SALDO));

		if(this.generacreditosConstantesFunciones.mostrarsaldoGeneraCreditos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GeneraCreditosConstantesFunciones.LABEL_SALDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.generacreditosConstantesFunciones.resaltarsaldoGeneraCreditos,this.generacreditosConstantesFunciones.activarsaldoGeneraCreditos,iSizeTabla,this,true,"saldoGeneraCreditos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.generacreditosConstantesFunciones.resaltarsaldoGeneraCreditos,this.generacreditosConstantesFunciones.activarsaldoGeneraCreditos,this,true,"saldoGeneraCreditos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GeneraCreditosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.generacreditosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.generacreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.generacreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGeneraCreditos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.generacreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.generacreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGeneraCreditos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.generacreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.generacreditosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGeneraCreditos.addColumn(tableColumn);
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
			
			this.jTableDatosGeneraCreditos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGeneraCreditos.moveColumn(this.jTableDatosGeneraCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGeneraCreditos.moveColumn(this.jTableDatosGeneraCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGeneraCreditos.moveColumn(this.jTableDatosGeneraCreditos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGeneraCreditos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGeneraCreditos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGeneraCreditos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGeneraCreditos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGeneraCreditos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGeneraCreditos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGeneraCreditos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGeneraCreditos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=generacreditosLogic.getGeneraCreditoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=generacreditoss.size()-1;
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
		//this.jTableDatosGeneraCreditos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGeneraCreditos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGeneraCreditos();
			
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
				
				//this.isEsNuevoGeneraCreditos=false;
					
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
				if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGeneraCreditos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGeneraCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGeneraCreditos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.generacreditos.getsType().equals("DUPLICADO")
				   || this.generacreditos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGeneraCreditos=true;
				
				} else {
					this.isEsNuevoGeneraCreditos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.generacreditosSessionBean.getEsGuardarRelacionado()) {
					if(this.generacreditos.getId()>=0 && !this.generacreditos.getIsNew()) {						
						this.isEsNuevoGeneraCreditos=false;
						
					} else {
						this.isEsNuevoGeneraCreditos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGeneraCreditos(esRelaciones);						
				
				this.seleccionarGeneraCreditos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.generacreditos.getId()<0) {
					this.isEsNuevoGeneraCreditos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGeneraCreditos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGeneraCreditos(evt,rowIndex);
				}	
				
				if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GeneraCreditos: " + this.dDif); 
					}
				}								
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGeneraCreditos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.generacreditos)) {
					if(this.generacreditos.getId()>0) {
						this.generacreditos.setIsDeleted(true);
						
						this.generacreditossEliminados.add(this.generacreditos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.generacreditosLogic.getGeneraCreditoss().remove(this.generacreditos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.generacreditoss.remove(this.generacreditos);				
					}
					
					
					((GeneraCreditosModel) this.jTableDatosGeneraCreditos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGeneraCreditos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGeneraCreditos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGeneraCreditos) {
			
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGeneraCreditos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGeneraCreditos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGeneraCreditos(this.generacreditos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGeneraCreditos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGeneraCreditos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGeneraCreditos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGeneraCreditos(GeneraCreditos generacreditos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGeneraCreditos(generacreditos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGeneraCreditos(GeneraCreditos generacreditos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGeneraCreditos(generacreditos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGeneraCreditos(generacreditos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGeneraCreditos(generacreditos);
	}
	
	public void setVariablesObjetoActualToFormularioGeneraCreditos(GeneraCreditos generacreditos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.setText(generacreditos.getcodigo());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.setText(generacreditos.getnombre_completo());
			this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.setDate(generacreditos.getfecha_vence());
			this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.setDate(generacreditos.getfecha_emision());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.setText(generacreditos.getnumero_factura());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.setText(generacreditos.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.setText(generacreditos.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.setText(generacreditos.getsaldo().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GeneraCreditos generacreditosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,generacreditosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GeneraCreditos generacreditosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				generacreditosLocal=this.generacreditos;
			} else {
				generacreditosLocal=this.generacreditosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(generacreditosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGeneraCreditos(generacreditosLocal,true);
					
					if(generacreditosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(generacreditosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.generacreditosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(generacreditosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGeneraCreditos(GeneraCreditos generacreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGeneraCreditos(generacreditos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(generacreditos);
	}
	
	public void setVariablesFormularioToObjetoActualGeneraCreditos(GeneraCreditos generacreditos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGeneraCreditos(generacreditos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGeneraCreditos(GeneraCreditos generacreditos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			generacreditos.setcodigo(this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelcodigoGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			generacreditos.setnombre_completo(this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelnombre_completoGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			generacreditos.setfecha_vence(this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelfecha_venceGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			generacreditos.setfecha_emision(this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelfecha_emisionGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			generacreditos.setnumero_factura(this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelnumero_facturaGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			generacreditos.setdebito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabeldebito_mone_localGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			generacreditos.setcredito_mone_local(Double.parseDouble(this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelcredito_mone_localGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			generacreditos.setsaldo(Double.parseDouble(this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GeneraCreditosConstantesFunciones.LABEL_SALDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGeneraCreditos.jLabelsaldoGeneraCreditos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGeneraCreditos(GeneraCreditos generacreditosBean,GeneraCreditos generacreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGeneraCreditos(GeneraCreditos generacreditosOrigen,GeneraCreditos generacreditos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && generacreditosOrigen.getId()!=null && !generacreditosOrigen.getId().equals(0L))) {generacreditos.setId(generacreditosOrigen.getId());}}
			if(conDefault || (!conDefault && generacreditosOrigen.getcodigo()!=null && !generacreditosOrigen.getcodigo().equals(""))) {generacreditos.setcodigo(generacreditosOrigen.getcodigo());}
			if(conDefault || (!conDefault && generacreditosOrigen.getnombre_completo()!=null && !generacreditosOrigen.getnombre_completo().equals(""))) {generacreditos.setnombre_completo(generacreditosOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && generacreditosOrigen.getfecha_vence()!=null && !generacreditosOrigen.getfecha_vence().equals(new Date()))) {generacreditos.setfecha_vence(generacreditosOrigen.getfecha_vence());}
			if(conDefault || (!conDefault && generacreditosOrigen.getfecha_emision()!=null && !generacreditosOrigen.getfecha_emision().equals(new Date()))) {generacreditos.setfecha_emision(generacreditosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && generacreditosOrigen.getnumero_factura()!=null && !generacreditosOrigen.getnumero_factura().equals(""))) {generacreditos.setnumero_factura(generacreditosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && generacreditosOrigen.getdebito_mone_local()!=null && !generacreditosOrigen.getdebito_mone_local().equals(0.0))) {generacreditos.setdebito_mone_local(generacreditosOrigen.getdebito_mone_local());}
			if(conDefault || (!conDefault && generacreditosOrigen.getcredito_mone_local()!=null && !generacreditosOrigen.getcredito_mone_local().equals(0.0))) {generacreditos.setcredito_mone_local(generacreditosOrigen.getcredito_mone_local());}
			if(conDefault || (!conDefault && generacreditosOrigen.getsaldo()!=null && !generacreditosOrigen.getsaldo().equals(0.0))) {generacreditos.setsaldo(generacreditosOrigen.getsaldo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGeneraCreditos(GeneraCreditos generacreditos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.setText(generacreditos.getcodigo());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.setText(generacreditos.getnombre_completo());
			this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.setDate(generacreditos.getfecha_vence());
			this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.setDate(generacreditos.getfecha_emision());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.setText(generacreditos.getnumero_factura());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.setText(generacreditos.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.setText(generacreditos.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.setText(generacreditos.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGeneraCreditos(GeneraCreditosBean generacreditosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.setText(generacreditosBean.getcodigo());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.setText(generacreditosBean.getnombre_completo());
			this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.setDate(generacreditosBean.getfecha_vence());
			this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.setDate(generacreditosBean.getfecha_emision());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.setText(generacreditosBean.getnumero_factura());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.setText(generacreditosBean.getdebito_mone_local().toString());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.setText(generacreditosBean.getcredito_mone_local().toString());
			this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.setText(generacreditosBean.getsaldo().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGeneraCreditos(GeneraCreditosParameterReturnGeneral generacreditosReturnGeneral,GeneraCreditosBean generacreditosBean,Boolean conDefault) throws Exception { 
		try {
			GeneraCreditos generacreditosLocal=new GeneraCreditos();
			
			generacreditosLocal=generacreditosReturnGeneral.getGeneraCreditos();
			
			
			if(conDefault || (!conDefault && generacreditosLocal.getcodigo()!=null && !generacreditosLocal.getcodigo().equals(""))) {generacreditosBean.setcodigo(generacreditosLocal.getcodigo());}
			if(conDefault || (!conDefault && generacreditosLocal.getnombre_completo()!=null && !generacreditosLocal.getnombre_completo().equals(""))) {generacreditosBean.setnombre_completo(generacreditosLocal.getnombre_completo());}
			if(conDefault || (!conDefault && generacreditosLocal.getfecha_vence()!=null && !generacreditosLocal.getfecha_vence().equals(new Date()))) {generacreditosBean.setfecha_vence(generacreditosLocal.getfecha_vence());}
			if(conDefault || (!conDefault && generacreditosLocal.getfecha_emision()!=null && !generacreditosLocal.getfecha_emision().equals(new Date()))) {generacreditosBean.setfecha_emision(generacreditosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && generacreditosLocal.getnumero_factura()!=null && !generacreditosLocal.getnumero_factura().equals(""))) {generacreditosBean.setnumero_factura(generacreditosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && generacreditosLocal.getdebito_mone_local()!=null && !generacreditosLocal.getdebito_mone_local().equals(0.0))) {generacreditosBean.setdebito_mone_local(generacreditosLocal.getdebito_mone_local());}
			if(conDefault || (!conDefault && generacreditosLocal.getcredito_mone_local()!=null && !generacreditosLocal.getcredito_mone_local().equals(0.0))) {generacreditosBean.setcredito_mone_local(generacreditosLocal.getcredito_mone_local());}
			if(conDefault || (!conDefault && generacreditosLocal.getsaldo()!=null && !generacreditosLocal.getsaldo().equals(0.0))) {generacreditosBean.setsaldo(generacreditosLocal.getsaldo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGeneraCreditosGenerico(Long idGeneraCreditosSeleccionado,JComboBox jComboBoxGeneraCreditos,List<GeneraCreditos> generacreditossLocal)throws Exception {
		try {
			GeneraCreditos  generacreditosTemp=null;

			for(GeneraCreditos generacreditosAux:generacreditossLocal) {
				if(generacreditosAux.getId()!=null && generacreditosAux.getId().equals(idGeneraCreditosSeleccionado)) {
					generacreditosTemp=generacreditosAux;
					break;
				}
			}

			jComboBoxGeneraCreditos.setSelectedItem(generacreditosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGeneraCreditosGenerico(JComboBox jComboBoxGeneraCreditos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGeneraCreditos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGeneraCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGeneraCreditos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGeneraCreditos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGeneraCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGeneraCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			generacreditos=(GeneraCreditos) generacreditosLogic.getGeneraCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			generacreditos =(GeneraCreditos) generacreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!generacreditos.getIsNew() && !generacreditos.getIsChanged() && !generacreditos.getIsDeleted()) {
				sDescripcion=generacreditos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=generacreditos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GeneraCreditos generacreditosRow=new GeneraCreditos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			generacreditosRow=(GeneraCreditos) generacreditosLogic.getGeneraCreditoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			generacreditosRow=(GeneraCreditos) generacreditoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGeneraCreditos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoGeneraCreditos && this.isPermisoNuevoGeneraCreditos));			
			this.jButtonDuplicarGeneraCreditos.setVisible((this.isVisibilidadCeldaDuplicarGeneraCreditos && this.isPermisoDuplicarGeneraCreditos));			
			this.jButtonCopiarGeneraCreditos.setVisible((this.isVisibilidadCeldaCopiarGeneraCreditos && this.isPermisoCopiarGeneraCreditos));
			this.jButtonVerFormGeneraCreditos.setVisible((this.isVisibilidadCeldaVerFormGeneraCreditos && this.isPermisoVerFormGeneraCreditos));
			
			this.jButtonAbrirOrderByGeneraCreditos.setVisible((this.isVisibilidadCeldaOrdenGeneraCreditos && this.isPermisoOrdenGeneraCreditos));			
			
			this.jButtonNuevoRelacionesGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos && this.isPermisoNuevoGeneraCreditos));			
			this.jButtonNuevoGuardarCambiosGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoGeneraCreditos && this.isPermisoNuevoGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));
			
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarGeneraCreditos.setVisible((this.isVisibilidadCeldaModificarGeneraCreditos && this.isPermisoActualizarGeneraCreditos));	
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarGeneraCreditos.setVisible((this.isVisibilidadCeldaActualizarGeneraCreditos && this.isPermisoActualizarGeneraCreditos));	
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarGeneraCreditos.setVisible((this.isVisibilidadCeldaEliminarGeneraCreditos && this.isPermisoEliminarGeneraCreditos));
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarGeneraCreditos.setVisible(this.isVisibilidadCeldaCancelarGeneraCreditos);							
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.setVisible((this.isVisibilidadCeldaGuardarGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));			
			
			}
						
			this.jButtonGuardarCambiosTablaGeneraCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoGeneraCreditos && this.isPermisoNuevoGeneraCreditos));						
			this.jButtonDuplicarToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaDuplicarGeneraCreditos && this.isPermisoDuplicarGeneraCreditos));						
			this.jButtonCopiarToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaCopiarGeneraCreditos && this.isPermisoCopiarGeneraCreditos));			
			this.jButtonVerFormToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaVerFormGeneraCreditos && this.isPermisoVerFormGeneraCreditos));			
			this.jButtonAbrirOrderByToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaOrdenGeneraCreditos && this.isPermisoOrdenGeneraCreditos));
			this.jButtonNuevoRelacionesToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos && this.isPermisoNuevoGeneraCreditos));			
			this.jButtonNuevoGuardarCambiosToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoGeneraCreditos && this.isPermisoNuevoGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));			
			
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaModificarGeneraCreditos && this.isPermisoActualizarGeneraCreditos));	
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaActualizarGeneraCreditos  && this.isPermisoActualizarGeneraCreditos));	
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaEliminarGeneraCreditos && this.isPermisoEliminarGeneraCreditos));
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarToolBarGeneraCreditos.setVisible(this.isVisibilidadCeldaCancelarGeneraCreditos);				
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaGuardarGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGeneraCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoGeneraCreditos && this.isPermisoNuevoGeneraCreditos));			
			this.jMenuItemDuplicarGeneraCreditos.setVisible((this.isVisibilidadCeldaDuplicarGeneraCreditos && this.isPermisoDuplicarGeneraCreditos));			
			this.jMenuItemCopiarGeneraCreditos.setVisible((this.isVisibilidadCeldaCopiarGeneraCreditos && this.isPermisoCopiarGeneraCreditos));			
			this.jMenuItemVerFormGeneraCreditos.setVisible((this.isVisibilidadCeldaVerFormGeneraCreditos && this.isPermisoVerFormGeneraCreditos));			
			this.jMenuItemAbrirOrderByGeneraCreditos.setVisible((this.isVisibilidadCeldaOrdenGeneraCreditos && this.isPermisoOrdenGeneraCreditos));			
			//this.jMenuItemMostrarOcultarGeneraCreditos.setVisible((this.isVisibilidadCeldaOrdenGeneraCreditos && this.isPermisoOrdenGeneraCreditos));
			this.jMenuItemDetalleAbrirOrderByGeneraCreditos.setVisible((this.isVisibilidadCeldaOrdenGeneraCreditos && this.isPermisoOrdenGeneraCreditos));			
			//this.jMenuItemDetalleMostrarOcultarGeneraCreditos.setVisible((this.isVisibilidadCeldaOrdenGeneraCreditos && this.isPermisoOrdenGeneraCreditos));			
			this.jMenuItemNuevoRelacionesGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos && this.isPermisoNuevoGeneraCreditos));			
			this.jMenuItemNuevoGuardarCambiosGeneraCreditos.setVisible((this.isVisibilidadCeldaNuevoGeneraCreditos && this.isPermisoNuevoGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));									
			
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemModificarGeneraCreditos.setVisible((this.isVisibilidadCeldaModificarGeneraCreditos && this.isPermisoActualizarGeneraCreditos));	
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemActualizarGeneraCreditos.setVisible((this.isVisibilidadCeldaActualizarGeneraCreditos && this.isPermisoActualizarGeneraCreditos));	
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemEliminarGeneraCreditos.setVisible((this.isVisibilidadCeldaEliminarGeneraCreditos && this.isPermisoEliminarGeneraCreditos));
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemCancelarGeneraCreditos.setVisible(this.isVisibilidadCeldaCancelarGeneraCreditos);				
			}
			
			this.jMenuItemGuardarCambiosGeneraCreditos.setVisible((this.isVisibilidadCeldaGuardarGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));						
			this.jMenuItemGuardarCambiosTablaGeneraCreditos.setVisible((this.isVisibilidadCeldaGuardarCambiosGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGeneraCreditos=this.jButtonNuevoGeneraCreditos.isVisible();
			this.isVisibilidadCeldaDuplicarGeneraCreditos=this.jButtonDuplicarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaCopiarGeneraCreditos=this.jButtonCopiarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaVerFormGeneraCreditos=this.jButtonVerFormGeneraCreditos.isVisible();
			
			this.isVisibilidadCeldaOrdenGeneraCreditos=this.jButtonAbrirOrderByGeneraCreditos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=this.jButtonNuevoRelacionesGeneraCreditos.isVisible();
			this.isVisibilidadCeldaModificarGeneraCreditos=this.jButtonModificarGeneraCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.isVisibilidadCeldaActualizarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaEliminarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaCancelarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaGuardarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=this.jButtonGuardarCambiosTablaGeneraCreditos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGeneraCreditos=this.jButtonNuevoToolBarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=this.jButtonNuevoRelacionesToolBarGeneraCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.isVisibilidadCeldaModificarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarToolBarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaActualizarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarToolBarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaEliminarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarToolBarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaCancelarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarToolBarGeneraCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGeneraCreditos=this.jButtonGuardarCambiosToolBarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=this.jButtonGuardarCambiosTablaToolBarGeneraCreditos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGeneraCreditos=this.jMenuItemNuevoGeneraCreditos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=this.jMenuItemNuevoRelacionesGeneraCreditos.isVisible();
			
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.isVisibilidadCeldaModificarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemModificarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaActualizarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemActualizarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaEliminarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemEliminarGeneraCreditos.isVisible();
			this.isVisibilidadCeldaCancelarGeneraCreditos=this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemCancelarGeneraCreditos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGeneraCreditos=this.jMenuItemGuardarCambiosGeneraCreditos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=this.jMenuItemGuardarCambiosTablaGeneraCreditos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGeneraCreditos(Boolean esInicializar) {
		if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
				//if(this.generacreditosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGeneraCreditos();
			}
			
			this.inicializarActualizarBindingBotonesManualGeneraCreditos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGeneraCreditos() {
		this.jButtonNuevoGeneraCreditos.setVisible(this.isPermisoNuevoGeneraCreditos);			
		this.jButtonDuplicarGeneraCreditos.setVisible(this.isPermisoDuplicarGeneraCreditos);			
		this.jButtonCopiarGeneraCreditos.setVisible(this.isPermisoCopiarGeneraCreditos);			
		this.jButtonVerFormGeneraCreditos.setVisible(this.isPermisoVerFormGeneraCreditos);			
		
		this.jButtonAbrirOrderByGeneraCreditos.setVisible(this.isPermisoOrdenGeneraCreditos);					
		
		this.jButtonNuevoRelacionesGeneraCreditos.setVisible(this.isPermisoNuevoGeneraCreditos);			
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarGeneraCreditos.setVisible(this.isPermisoActualizarGeneraCreditos);	
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarGeneraCreditos.setVisible(this.isPermisoActualizarGeneraCreditos);	
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarGeneraCreditos.setVisible(this.isPermisoEliminarGeneraCreditos);
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarGeneraCreditos.setVisible(this.isVisibilidadCeldaCancelarGeneraCreditos);						
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.setVisible(this.isPermisoGuardarCambiosGeneraCreditos);							
		}
		
		this.jButtonGuardarCambiosTablaGeneraCreditos.setVisible(this.isPermisoActualizarGeneraCreditos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGeneraCreditos() {
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarGeneraCreditos.setVisible(this.isPermisoActualizarGeneraCreditos);	
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarGeneraCreditos.setVisible(this.isPermisoActualizarGeneraCreditos);	
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarGeneraCreditos.setVisible(this.isPermisoEliminarGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarGeneraCreditos.setVisible(this.isVisibilidadCeldaCancelarGeneraCreditos);							
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.setVisible((this.isVisibilidadCeldaGuardarGeneraCreditos && this.isPermisoGuardarCambiosGeneraCreditos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGeneraCreditos() {
		if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGeneraCreditos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGeneraCreditos() {
	}
	
	public void jTableDatosGeneraCreditosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGeneraCreditos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.generacreditos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGeneraCreditosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGeneraCreditos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGeneraCreditos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGeneraCreditos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.generacreditosLogic.getConnexion());

				if(this.generacreditos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.generacreditos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGeneraCreditos=(TitledBorder)this.jScrollPanelDatosGeneraCreditos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGeneraCreditos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.generacreditos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.generacreditos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.generacreditos.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_venceGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getfecha_vence()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vence = '"+Funciones2.getStringPostgresDate(this.generacreditos.getfecha_vence())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.generacreditos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.generacreditos.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_mone_localGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getdebito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_mone_local = "+this.generacreditos.getdebito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_mone_localGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getcredito_mone_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_mone_local = "+this.generacreditos.getcredito_mone_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsaldoGeneraCreditosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.getgeneracreditos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.generacreditos==null) {
						this.generacreditos = new GeneraCreditos();
					}

					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);
				}

				if(this.generacreditos.getsaldo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where saldo = "+this.generacreditos.getsaldo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGeneraCreditos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaGeneraCreditosGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGeneraCreditos(false,false);

			this.getGeneraCreditossBusquedaGeneraCreditos();

			this.inicializarActualizarBindingGeneraCreditos(false);

			//if(GeneraCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGeneraCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGeneraCreditosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGeneraCreditos(false,false);

			this.getGeneraCreditossFK_IdEmpresa();

			this.inicializarActualizarBindingGeneraCreditos(false);

			//if(GeneraCreditosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGeneraCreditos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.generacreditosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGeneraCreditos() {
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
			this.jInternalFrameDetalleFormGeneraCreditos.setVisible(false);	    			
			this.jInternalFrameDetalleFormGeneraCreditos.dispose();
			this.jInternalFrameDetalleFormGeneraCreditos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
			this.jInternalFrameReporteDinamicoGeneraCreditos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGeneraCreditos.dispose();
			this.jInternalFrameReporteDinamicoGeneraCreditos=null;
		}
		
		if(this.jInternalFrameImportacionGeneraCreditos!=null) {
			this.jInternalFrameImportacionGeneraCreditos.setVisible(false);	    			
			this.jInternalFrameImportacionGeneraCreditos.dispose();
			this.jInternalFrameImportacionGeneraCreditos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGeneraCreditos();
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
			
			if(sTipo.equals("NuevoGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGeneraCreditos")) {
				jButtonDuplicarGeneraCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGeneraCreditos")) {
				jButtonCopiarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormGeneraCreditos")) {
				jButtonVerFormGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGeneraCreditos")) {
				jButtonDuplicarGeneraCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGeneraCreditos")) {
				jButtonDuplicarGeneraCreditosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGeneraCreditos")) {
				jButtonModificarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGeneraCreditos")) {
				jButtonModificarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGeneraCreditos")) {
				jButtonModificarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGeneraCreditos")) {
				jButtonActualizarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGeneraCreditos")) {
				jButtonActualizarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGeneraCreditos")) {
				jButtonActualizarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarGeneraCreditos")) {
				jButtonEliminarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGeneraCreditos")) {
				jButtonEliminarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGeneraCreditos")) {
				jButtonEliminarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarGeneraCreditos")) {
				jButtonCancelarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGeneraCreditos")) {
				jButtonCancelarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGeneraCreditos")) {
				jButtonCancelarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarGeneraCreditos")) {
				jButtonCerrarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGeneraCreditos")) {
				jButtonCerrarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGeneraCreditos")) {
				jButtonCerrarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGeneraCreditos")) {
				jButtonMostrarOcultarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGeneraCreditos")) {
				jButtonCancelarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGeneraCreditos")) {
				jButtonCopiarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGeneraCreditos")) {
				jButtonVerFormGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGeneraCreditos")) {
				jButtonCopiarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGeneraCreditos")) {
				jButtonVerFormGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGeneraCreditos")) {
				jButtonRecargarInformacionGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGeneraCreditos")) {
				jButtonRecargarInformacionGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGeneraCreditos")) {
				jButtonRecargarInformacionGeneraCreditosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGeneraCreditos")) {
				jButtonAnterioresGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGeneraCreditos")) {
				jButtonAnterioresGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGeneraCreditos")) {
				jButtonAnterioresGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGeneraCreditos")) {
				jButtonSiguientesGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGeneraCreditos")) {
				jButtonSiguientesGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGeneraCreditos")) {
				jButtonSiguientesGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGeneraCreditos") || sTipo.equals("MenuItemDetalleAbrirOrderByGeneraCreditos")) {
				jButtonAbrirOrderByGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGeneraCreditos") || sTipo.equals("MenuItemDetalleMostrarOcultarGeneraCreditos")) {
				jButtonMostrarOcultarGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGeneraCreditos")) {
				jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGeneraCreditos")) {
				jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGeneraCreditos")) {
				jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionGeneraCreditos")) {
				jButtonProcesarInformacionGeneraCreditosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGeneraCreditos")) {
				jButtonCerrarReporteDinamicoGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGeneraCreditos")) {
				jButtonGenerarReporteDinamicoGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGeneraCreditos")) {
				
				jButtonGenerarExcelReporteDinamicoGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGeneraCreditos")) {
				jButtonCerrarImportacionGeneraCreditosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGeneraCreditos")) {
				
				jButtonGenerarImportacionGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGeneraCreditos")) {
				
				jButtonAbrirImportacionGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGeneraCreditos")) {
				jComboBoxTiposAccionesGeneraCreditosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGeneraCreditos")) {
				jComboBoxTiposRelacionesGeneraCreditosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGeneraCreditos")) {
				jComboBoxTiposAccionesGeneraCreditosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGeneraCreditos")) {
				
				jComboBoxTiposSeleccionarGeneraCreditosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGeneraCreditos")) {
				jTextFieldValorCampoGeneralGeneraCreditosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGeneraCreditos")) {
				jButtonAbrirOrderByGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGeneraCreditos")) {
				jButtonAbrirOrderByGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGeneraCreditos")) {
				jButtonCerrarOrderByGeneraCreditosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGeneraCreditosBusqueda")) {
				this.jButtonidGeneraCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGeneraCreditosUpdate")) {
				this.jButtonid_empresaGeneraCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGeneraCreditosBusqueda")) {
				this.jButtonid_empresaGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGeneraCreditosBusqueda")) {
				this.jButtoncodigoGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoGeneraCreditosBusqueda")) {
				this.jButtonnombre_completoGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceGeneraCreditosBusqueda")) {
				this.jButtonfecha_venceGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionGeneraCreditosBusqueda")) {
				this.jButtonfecha_emisionGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaGeneraCreditosBusqueda")) {
				this.jButtonnumero_facturaGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localGeneraCreditosBusqueda")) {
				this.jButtondebito_mone_localGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localGeneraCreditosBusqueda")) {
				this.jButtoncredito_mone_localGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoGeneraCreditosBusqueda")) {
				this.jButtonsaldoGeneraCreditosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaGeneraCreditosGeneraCreditos")) {
				this.jButtonBusquedaGeneraCreditosGeneraCreditosActionPerformed(evt);
			}
			
			;
			
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGeneraCreditos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGeneraCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GeneraCreditos generacreditosLocal=null;
			
			if(!this.getEsControlTabla()) {
				generacreditosLocal=this.generacreditos;
			} else {
				generacreditosLocal=this.generacreditosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
							
				
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
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
			
			


			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGeneraCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
								
						
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
								
				
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
							
				
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGeneraCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditosAnterior =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.generacreditosAnterior =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
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
			
			


			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
								
				
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGeneraCreditosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGeneraCreditos")) {
					jCheckBoxSeleccionarTodosGeneraCreditosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGeneraCreditos")) {
					jCheckBoxSeleccionadosGeneraCreditosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGeneraCreditos")) {
					
				}
				
				


				
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
												
				
				


				
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGeneraCreditosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.generacreditosAnterior =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.generacreditosAnterior =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGeneraCreditosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
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
			
			


			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGeneraCreditosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.generacreditos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.generacreditos);
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
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
				
				


				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GeneraCreditos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GeneraCreditos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGeneraCreditosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.generacreditosAnterior =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGeneraCreditos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGeneraCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGeneraCreditos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.generacreditos =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.generacreditos =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.generacreditos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGeneraCreditos")) {
				
				}
				
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGeneraCreditos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGeneraCreditos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGeneraCreditos")) {
			
			}
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGeneraCreditos();
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
			if(sTipo.equals("NuevoGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGeneraCreditos")) {
				jButtonDuplicarGeneraCreditosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGeneraCreditos")) {
				jButtonCopiarGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGeneraCreditos")) {
				jButtonVerFormGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGeneraCreditos")) {
				jButtonNuevoGeneraCreditosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGeneraCreditos")) {
				jButtonModificarGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGeneraCreditos")) {
				jButtonActualizarGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGeneraCreditos")) {
				jButtonEliminarGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGeneraCreditos")) {
				jButtonCancelarGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGeneraCreditos")) {
				jButtonCerrarGeneraCreditosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGeneraCreditos")) {
				jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGeneraCreditos")) {
				jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGeneraCreditos")) {
				jButtonAbrirOrderByGeneraCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGeneraCreditos")) {
				jButtonRecargarInformacionGeneraCreditosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGeneraCreditos")) {
				jButtonAnterioresGeneraCreditosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGeneraCreditos")) {
				jButtonSiguientesGeneraCreditosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGeneraCreditosBusqueda")) {
				this.jButtonidGeneraCreditosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGeneraCreditosUpdate")) {
				this.jButtonid_empresaGeneraCreditosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGeneraCreditosBusqueda")) {
				this.jButtonid_empresaGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoGeneraCreditosBusqueda")) {
				this.jButtoncodigoGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoGeneraCreditosBusqueda")) {
				this.jButtonnombre_completoGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_venceGeneraCreditosBusqueda")) {
				this.jButtonfecha_venceGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionGeneraCreditosBusqueda")) {
				this.jButtonfecha_emisionGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaGeneraCreditosBusqueda")) {
				this.jButtonnumero_facturaGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_mone_localGeneraCreditosBusqueda")) {
				this.jButtondebito_mone_localGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_mone_localGeneraCreditosBusqueda")) {
				this.jButtoncredito_mone_localGeneraCreditosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("saldoGeneraCreditosBusqueda")) {
				this.jButtonsaldoGeneraCreditosBusquedaActionPerformed(evt);
			}
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGeneraCreditos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGeneraCreditos")) {
				closingInternalFrameGeneraCreditos();
				
			} else if(sTipo.equals("jButtonCancelarGeneraCreditos")) {
				JInternalFrameBase jInternalFrameDetalleFormGeneraCreditos = (JInternalFrameBase)evt.getSource();
	            	
	            GeneraCreditosBeanSwingJInternalFrame jInternalFrameParent=(GeneraCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormGeneraCreditos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGeneraCreditosActionPerformed(null);
			}
			
			GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.generacreditos,new Object(),this.generacreditosParameterGeneral,this.generacreditosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGeneraCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGeneraCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGeneraCreditos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.generacreditos)) {
			if(!esControlTabla) {
				if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);			
				}
				
				if(this.generacreditosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGeneraCreditos(this.generacreditos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGeneraCreditos(this.generacreditosReturnGeneral,this.generacreditosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.generacreditosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGeneraCreditos(classes,this.generacreditosReturnGeneral,this.generacreditosBean,false);
					}
						
					if(this.generacreditosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGeneraCreditos(this.generacreditosReturnGeneral.getGeneraCreditos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGeneraCreditos(this.generacreditosReturnGeneral.getGeneraCreditos());	
					}
						
					if(this.generacreditosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGeneraCreditos(this.generacreditosReturnGeneral.getGeneraCreditos(),classes);//this.generacreditosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGeneraCreditos(this.generacreditos,classes);//this.generacreditosBean);									
				}
			
				if(GeneraCreditosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGeneraCreditos(this.generacreditos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGeneraCreditos(this.generacreditos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.generacreditosAnterior!=null) {
						this.generacreditos=this.generacreditosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.generacreditosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.generacreditosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.generacreditosReturnGeneral.getGeneraCreditos(),generacreditosLogic.getGeneraCreditoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.generacreditosReturnGeneral.getGeneraCreditos(),this.generacreditoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGeneraCreditos.repaint();
				
				//((AbstractTableModel) this.jTableDatosGeneraCreditos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGeneraCreditos();
			}
		}
	}
	
	public void actualizarVisualTableDatosGeneraCreditos() throws Exception {
		
		GeneraCreditosModel generacreditosModel=(GeneraCreditosModel)this.jTableDatosGeneraCreditos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			generacreditosModel.generacreditoss=this.generacreditosLogic.getGeneraCreditoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			generacreditosModel.generacreditoss=this.generacreditoss;
		}
		
		
		((GeneraCreditosModel) this.jTableDatosGeneraCreditos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGeneraCreditos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgeneracreditosAnterior(),this.generacreditosLogic.getGeneraCreditoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgeneracreditosAnterior(),this.generacreditoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGeneraCreditos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGeneraCreditos(GeneraCreditos generacreditos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
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
										
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.generacreditos,new Object(),generalEntityParameterGeneral,this.generacreditosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.generacreditosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GeneraCreditosConstantesFunciones.getClassesRelationshipsOfGeneraCreditos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GeneraCreditosConstantesFunciones.getClassesRelationshipsFromStringsOfGeneraCreditos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGeneraCreditos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GeneraCreditosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.generacreditos,new Object(),generalEntityParameterGeneral,this.generacreditosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGeneraCreditos(GeneraCreditosBean generacreditosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGeneraCreditos(ArrayList<Classe> classes,GeneraCreditosReturnGeneral generacreditosReturnGeneral,GeneraCreditosBean generacreditosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGeneraCreditos(GeneraCreditos generacreditos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.generacreditos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGeneraCreditos = new GeneraCreditosDetalleFormJInternalFrame(jDesktopPane,this.generacreditosSessionBean.getConGuardarRelaciones(),this.generacreditosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.setVisible(false);
		this.jInternalFrameDetalleFormGeneraCreditos.setSelected(false);						
		
		this.jInternalFrameDetalleFormGeneraCreditos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGeneraCreditos.generacreditosLogic=this.generacreditosLogic;
		
		this.cargarCombosFrameForeignKeyGeneraCreditos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGeneraCreditos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGeneraCreditos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGeneraCreditos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGeneraCreditos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGeneraCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGeneraCreditos"));
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarGeneraCreditos.addActionListener(new ButtonActionListener(this,"ModificarGeneraCreditos"));

		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarToolBarGeneraCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarGeneraCreditos"));
					
		this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemModificarGeneraCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarGeneraCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarGeneraCreditos.addActionListener (new ButtonActionListener(this,"ActualizarGeneraCreditos"));
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarToolBarGeneraCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGeneraCreditos"));
						
		this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemActualizarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGeneraCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarGeneraCreditos.addActionListener (new ButtonActionListener(this,"EliminarGeneraCreditos"));
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarGeneraCreditos"));
								
		this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemEliminarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGeneraCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarGeneraCreditos.addActionListener (new ButtonActionListener(this,"CancelarGeneraCreditos"));
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarGeneraCreditos"));
					
		this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemCancelarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGeneraCreditos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemDetalleCerrarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGeneraCreditos"));		
		
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGeneraCreditos"));
		
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGeneraCreditos"));
		
		
		
		this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGeneraCreditos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonidGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idGeneraCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonid_empresaGeneraCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGeneraCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonid_empresaGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtoncodigoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"codigoGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonnombre_completoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonfecha_venceGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonfecha_emisionGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonnumero_facturaGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtondebito_mone_localGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtoncredito_mone_localGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonsaldoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"saldoGeneraCreditosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGeneraCreditos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGeneraCreditos"));
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGeneraCreditos"));
		}
		
		this.jTableDatosGeneraCreditos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGeneraCreditos"));
		
		this.jTableDatosGeneraCreditos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGeneraCreditos"));
		
		this.jButtonNuevoGeneraCreditos.addActionListener(new ButtonActionListener(this,"NuevoGeneraCreditos"));
		
		this.jButtonDuplicarGeneraCreditos.addActionListener(new ButtonActionListener(this,"DuplicarGeneraCreditos"));
		
		this.jButtonCopiarGeneraCreditos.addActionListener(new ButtonActionListener(this,"CopiarGeneraCreditos"));
		
		this.jButtonVerFormGeneraCreditos.addActionListener(new ButtonActionListener(this,"VerFormGeneraCreditos"));
		
		
		this.jButtonNuevoToolBarGeneraCreditos.addActionListener(new ButtonActionListener(this,"NuevoToolBarGeneraCreditos"));
			
		this.jButtonDuplicarToolBarGeneraCreditos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGeneraCreditos"));
			
		this.jMenuItemNuevoGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGeneraCreditos"));
			
		this.jMenuItemDuplicarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGeneraCreditos"));		
		
		
		this.jButtonNuevoRelacionesGeneraCreditos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGeneraCreditos"));
		
		
		this.jButtonNuevoRelacionesToolBarGeneraCreditos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGeneraCreditos"));
			
		this.jMenuItemNuevoRelacionesGeneraCreditos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGeneraCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarGeneraCreditos.addActionListener(new ButtonActionListener(this,"ModificarGeneraCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonModificarToolBarGeneraCreditos.addActionListener(new ButtonActionListener(this,"ModificarToolBarGeneraCreditos"));
			
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemModificarGeneraCreditos.addActionListener(new ButtonActionListener(this,"MenuItemModificarGeneraCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarGeneraCreditos.addActionListener (new ButtonActionListener(this,"ActualizarGeneraCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonActualizarToolBarGeneraCreditos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGeneraCreditos"));
				
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemActualizarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGeneraCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarGeneraCreditos.addActionListener (new ButtonActionListener(this,"EliminarGeneraCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonEliminarToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"EliminarToolBarGeneraCreditos"));
						
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemEliminarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGeneraCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarGeneraCreditos.addActionListener (new ButtonActionListener(this,"CancelarGeneraCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonCancelarToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"CancelarToolBarGeneraCreditos"));
			
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemCancelarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGeneraCreditos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGeneraCreditos"));		
		
		
		this.jButtonCerrarGeneraCreditos.addActionListener (new ButtonActionListener(this,"CerrarGeneraCreditos"));
		
		
		this.jButtonCerrarToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"CerrarToolBarGeneraCreditos"));
			
		this.jMenuItemCerrarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGeneraCreditos"));
			
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jMenuItemDetalleCerrarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGeneraCreditos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosGeneraCreditos"));
		}
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGeneraCreditos"));
		}
		
		this.jButtonCopiarToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"CopiarToolBarGeneraCreditos"));
			
		this.jButtonVerFormToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"VerFormToolBarGeneraCreditos"));
		
		this.jMenuItemGuardarCambiosGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGeneraCreditos"));
			
		this.jMenuItemCopiarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGeneraCreditos"));		
		
		this.jMenuItemVerFormGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGeneraCreditos"));		
		
		
		this.jButtonGuardarCambiosTablaGeneraCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGeneraCreditos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGeneraCreditos"));
			
		this.jMenuItemGuardarCambiosTablaGeneraCreditos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGeneraCreditos"));		
		
		
		
		this.jButtonRecargarInformacionGeneraCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionGeneraCreditos"));
					
		this.jButtonRecargarInformacionToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGeneraCreditos"));
		
		this.jMenuItemRecargarInformacionGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGeneraCreditos"));		
		
		
		
		this.jButtonAnterioresGeneraCreditos.addActionListener (new ButtonActionListener(this,"AnterioresGeneraCreditos"));
		
		
		this.jButtonAnterioresToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGeneraCreditos"));
		
		this.jMenuItemAnterioresGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGeneraCreditos"));		
		
		
		this.jButtonSiguientesGeneraCreditos.addActionListener (new ButtonActionListener(this,"SiguientesGeneraCreditos"));
		
		
		this.jButtonSiguientesToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGeneraCreditos"));
			
		this.jMenuItemSiguientesGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGeneraCreditos"));
			
		this.jMenuItemAbrirOrderByGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGeneraCreditos"));
			
		this.jMenuItemMostrarOcultarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGeneraCreditos"));
			
		this.jMenuItemDetalleAbrirOrderByGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGeneraCreditos"));
			
		this.jMenuItemDetalleMostarOcultarGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGeneraCreditos"));		
		
		
		this.jButtonNuevoGuardarCambiosGeneraCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGeneraCreditos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGeneraCreditos"));
			
		this.jMenuItemNuevoGuardarCambiosGeneraCreditos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGeneraCreditos"));		
		
		
		this.jButtonProcesarInformacionGeneraCreditos.addActionListener (new ButtonActionListener(this,"ProcesarInformacionGeneraCreditos"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGeneraCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGeneraCreditos"));

		this.jCheckBoxSeleccionadosGeneraCreditos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGeneraCreditos"));
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGeneraCreditos"));
		}
		
		
		this.jComboBoxTiposRelacionesGeneraCreditos.addActionListener (new ButtonActionListener(this,"TiposRelacionesGeneraCreditos"));
			
		this.jComboBoxTiposAccionesGeneraCreditos.addActionListener (new ButtonActionListener(this,"TiposAccionesGeneraCreditos"));
					
		this.jComboBoxTiposSeleccionarGeneraCreditos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGeneraCreditos"));
			
		this.jTextFieldValorCampoGeneralGeneraCreditos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGeneraCreditos"));		
		
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonidGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idGeneraCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonid_empresaGeneraCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGeneraCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonid_empresaGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtoncodigoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"codigoGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonnombre_completoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonfecha_venceGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonfecha_emisionGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonnumero_facturaGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtondebito_mone_localGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtoncredito_mone_localGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonsaldoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"saldoGeneraCreditosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaGeneraCreditosGeneraCreditos.addActionListener(new ButtonActionListener(this,"BusquedaGeneraCreditosGeneraCreditos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGeneraCreditos!=null) {
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGeneraCreditos"));
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGeneraCreditos"));
				this.jInternalFrameReporteDinamicoGeneraCreditos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGeneraCreditos"));
			}
			
			//this.jButtonCerrarReporteDinamicoGeneraCreditos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGeneraCreditos"));				
			//this.jButtonGenerarReporteDinamicoGeneraCreditos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGeneraCreditos"));
			//this.jButtonGenerarExcelReporteDinamicoGeneraCreditos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGeneraCreditos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGeneraCreditos!=null) {
				this.jInternalFrameImportacionGeneraCreditos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGeneraCreditos"));
				this.jInternalFrameImportacionGeneraCreditos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGeneraCreditos"));
				this.jInternalFrameImportacionGeneraCreditos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGeneraCreditos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGeneraCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByGeneraCreditos"));
			
			this.jButtonAbrirOrderByToolBarGeneraCreditos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGeneraCreditos"));			
			
			if(this.jInternalFrameOrderByGeneraCreditos!=null) {
				this.jInternalFrameOrderByGeneraCreditos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGeneraCreditos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGeneraCreditos.jTabbedPaneRelacionesGeneraCreditos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGeneraCreditos"));
		
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
            		closingInternalFrameGeneraCreditos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGeneraCreditos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGeneraCreditos = (JInternalFrameBase)event.getSource();
	            	
	            GeneraCreditosBeanSwingJInternalFrame jInternalFrameParent=(GeneraCreditosBeanSwingJInternalFrame)jInternalFrameDetalleFormGeneraCreditos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGeneraCreditosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGeneraCreditos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGeneraCreditosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGeneraCreditos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGeneraCreditos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGeneraCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGeneraCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGeneraCreditosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGeneraCreditos";
		inputMap = this.jButtonNuevoGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGeneraCreditosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGeneraCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGeneraCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGeneraCreditosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGeneraCreditos";
		inputMap = this.jButtonNuevoRelacionesGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGeneraCreditosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGeneraCreditos";
		inputMap = this.jButtonModificarGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGeneraCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGeneraCreditos";
		inputMap = this.jButtonActualizarGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGeneraCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGeneraCreditos";
		inputMap = this.jButtonEliminarGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGeneraCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGeneraCreditos";
		inputMap = this.jButtonCancelarGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGeneraCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGeneraCreditos";
		inputMap = this.jButtonCerrarGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGeneraCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGeneraCreditos";
		inputMap = this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonGuardarCambiosGeneraCreditos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGeneraCreditosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGeneraCreditos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGeneraCreditosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGeneraCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGeneraCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGeneraCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGeneraCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGeneraCreditos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGeneraCreditosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonidGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"idGeneraCreditosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonid_empresaGeneraCreditosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGeneraCreditosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonid_empresaGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtoncodigoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"codigoGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonnombre_completoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonfecha_venceGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_venceGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonfecha_emisionGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonnumero_facturaGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtondebito_mone_localGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"debito_mone_localGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtoncredito_mone_localGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"credito_mone_localGeneraCreditosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGeneraCreditos.jButtonsaldoGeneraCreditosBusqueda.addActionListener(new ButtonActionListener(this,"saldoGeneraCreditosBusqueda"));
		
		
		this.jButtonBusquedaGeneraCreditosGeneraCreditos.addActionListener(new ButtonActionListener(this,"BusquedaGeneraCreditosGeneraCreditos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGeneraCreditos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGeneraCreditosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGeneraCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGeneraCreditos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGeneraCreditos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
					generacreditosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GeneraCreditos generacreditosAux:generacreditoss) {
					generacreditosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGeneraCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGeneraCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
						generacreditosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GeneraCreditos generacreditosAux:generacreditoss) {
						generacreditosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GeneraCreditos generacreditosAux:generacreditoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGeneraCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGeneraCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGeneraCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGeneraCreditosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGeneraCreditos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGeneraCreditos.getSelectedRows();
			
			GeneraCreditos generacreditosLocal=new GeneraCreditos();
			
			//this.seleccionarTodosGeneraCreditos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generacreditosLocal =(GeneraCreditos) this.generacreditosLogic.getGeneraCreditoss().toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generacreditosLocal =(GeneraCreditos) this.generacreditoss.toArray()[this.jTableDatosGeneraCreditos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				generacreditosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
						generacreditosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GeneraCreditos generacreditosAux:generacreditoss) {
						generacreditosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGeneraCreditos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGeneraCreditos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGeneraCreditos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGeneraCreditos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGeneraCreditosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGeneraCreditosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGeneraCreditosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGeneraCreditos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGeneraCreditos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GeneraCreditos generacreditosAux:this.generacreditosLogic.getGeneraCreditoss()) {
				
						if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							generacreditosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							generacreditosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							generacreditosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							generacreditosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							generacreditosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							generacreditosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							generacreditosAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							generacreditosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GeneraCreditos generacreditosAux:generacreditoss) {
					
						if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							generacreditosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							generacreditosAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE)) {
							existe=true;
							generacreditosAux.setfecha_vence(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							generacreditosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							generacreditosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL)) {
							existe=true;
							generacreditosAux.setdebito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL)) {
							existe=true;
							generacreditosAux.setcredito_mone_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_SALDO)) {
							existe=true;
							generacreditosAux.setsaldo(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGeneraCreditos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGeneraCreditosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGeneraCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGeneraCreditos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGeneraCreditos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGeneraCreditos) {				
					conSplash=true;//false;										
					
					//this.startProcessGeneraCreditos(conSplash);
				
					this.generarReporteGeneraCreditossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGeneraCreditossSeleccionados();
				//this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGeneraCreditossSeleccionados(false);
				//this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGeneraCreditossSeleccionados(true);
				//this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGeneraCreditos();
				
				this.exportarGeneraCreditossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGeneraCreditoss();
				//this.importarGeneraCreditoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGeneraCreditos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGeneraCreditossSeleccionados();
				//this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Genera Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGeneraCreditos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGeneraCreditos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGeneraCreditos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.setSelectedIndex(0);					
				}	
			} 			
			else if(GeneraCreditosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGeneraCreditos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGeneraCreditos(conSplash);
					
						//this.actualizarParametrosGeneralGeneraCreditos();
						
						this.generarReporteProcesoAccionGeneraCreditossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GeneraCreditosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Genera CreditosES SELECCIONADOS?", "MANTENIMIENTO DE Genera Creditos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGeneraCreditos();
				
						this.actualizarParametrosGeneralGeneraCreditos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.generacreditosReturnGeneral=generacreditosLogic.procesarAccionGeneraCreditossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.generacreditosLogic.getGeneraCreditoss(),this.generacreditosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGeneraCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGeneraCreditos();
					
					GeneraCreditosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGeneraCreditosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGeneraCreditos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxTiposAccionesFormularioGeneraCreditos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGeneraCreditos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGeneraCreditosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGeneraCreditos();
			
			if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
			GeneraCreditos generacreditos=new GeneraCreditos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGeneraCreditos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGeneraCreditos.getSelectedItem();
			
			
			
			
			generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
			//this.sTipoAccion;
			
			if(generacreditossSeleccionados.size()==1) {
				for(GeneraCreditos generacreditosAux:generacreditossSeleccionados) {
					generacreditos=generacreditosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGeneraCreditos();
			
      		//this.finishProcessGeneraCreditos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGeneraCreditosReturnGeneral() throws Exception {
		if(this.generacreditosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.generacreditosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.generacreditosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.generacreditosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.generacreditosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.generacreditosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGeneraCreditos(false);
		}
		
		if(this.generacreditosReturnGeneral.getConRetornoLista() || this.generacreditosReturnGeneral.getConRetornoObjeto()) {
			if(this.generacreditosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.generacreditosLogic.setGeneraCreditoss(this.generacreditosReturnGeneral.getGeneraCreditoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingGeneraCreditos(false);
		}
	}
	
	public void actualizarParametrosGeneralGeneraCreditos() throws Exception {
		
		
	}
	
	public ArrayList<GeneraCreditos> getGeneraCreditossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGeneraCreditos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GeneraCreditos generacreditosAux:generacreditosLogic.getGeneraCreditoss()) {
					if(generacreditosAux.getIsSelected()) {
						generacreditossSeleccionados.add(generacreditosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GeneraCreditos generacreditosAux:this.generacreditoss) {
					if(generacreditosAux.getIsSelected()) {
						generacreditossSeleccionados.add(generacreditosAux);				
					}
				}
			}
			
			if(generacreditossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						generacreditossSeleccionados.addAll(this.generacreditosLogic.getGeneraCreditoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						generacreditossSeleccionados.addAll(this.generacreditoss);				
					}
				}
			}
		} else {
			generacreditossSeleccionados.add(this.generacreditos);
		}
		
		return generacreditossSeleccionados;
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
	
	public void generarReporteGeneraCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGeneraCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGeneraCreditossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGeneraCreditossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGeneraCreditossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Genera Creditos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGeneraCreditossSeleccionados() throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGeneraCreditoss("Todos",generacreditossSeleccionados);
		
	}	
	
	public void generarReporteNormalGeneraCreditossSeleccionados() throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGeneraCreditoss("Todos",generacreditossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGeneraCreditossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGeneraCreditoss("Todos",generacreditossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGeneraCreditossSeleccionados() throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGeneraCreditos();
		
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGeneraCreditos();
		
		
		//this.generarReporteGeneraCreditoss("Todos",generacreditossSeleccionados ,generacreditosImplementable,generacreditosImplementableHome);
	}
	
	public void mostrarImportacionGeneraCreditoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGeneraCreditos();
		
		this.abrirFrameImportacionGeneraCreditos();		
		
			
		//this.generarReporteGeneraCreditoss("Todos",generacreditossSeleccionados ,generacreditosImplementable,generacreditosImplementableHome);
	}
	
	public void importarGeneraCreditoss() throws Exception {		
	
	}
	
	public void exportarGeneraCreditossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGeneraCreditossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGeneraCreditossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGeneraCreditossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Genera Creditos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGeneraCreditossSeleccionados() throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"generacreditos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGeneraCreditos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GeneraCreditos generacreditosAux:generacreditossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGeneraCreditos(generacreditosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//generacreditosAux.setsDetalleGeneralEntityReporte(generacreditosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGeneraCreditos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GeneraCreditosConstantesFunciones.LABEL_SALDO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGeneraCreditos(GeneraCreditos generacreditos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=generacreditos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getfecha_vence().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getdebito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getcredito_mone_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=generacreditos.getsaldo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGeneraCreditossSeleccionados() throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"generacreditos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GeneraCreditoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGeneraCreditos(row);				
				iRow++;
			}				
			
			for(GeneraCreditos generacreditosAux:generacreditossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGeneraCreditos(generacreditosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGeneraCreditossSeleccionados() throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();		
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"generacreditos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("generacreditoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("generacreditos");
			//elementRoot.appendChild(element);
		
			for(GeneraCreditos generacreditosAux:generacreditossSeleccionados) {
				element = document.createElement("generacreditos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGeneraCreditos(generacreditosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Genera Creditos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGeneraCreditos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_DEBITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_CREDITOMONELOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(GeneraCreditosConstantesFunciones.LABEL_SALDO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGeneraCreditos(GeneraCreditos generacreditos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getfecha_vence());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getdebito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getcredito_mone_local());
		cell = row.createCell(iColumn++);cell.setCellValue(generacreditos.getsaldo());				
	}
	
	public void setFilaDatosExportarXmlGeneraCreditos(GeneraCreditos generacreditos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GeneraCreditosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(generacreditos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GeneraCreditosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(generacreditos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GeneraCreditosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(generacreditos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(GeneraCreditosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(generacreditos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_completo = document.createElement(GeneraCreditosConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(generacreditos.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementfecha_vence = document.createElement(GeneraCreditosConstantesFunciones.FECHAVENCE);
		elementfecha_vence.appendChild(document.createTextNode(generacreditos.getfecha_vence().toString().trim()));
		element.appendChild(elementfecha_vence);

		Element elementfecha_emision = document.createElement(GeneraCreditosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(generacreditos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_factura = document.createElement(GeneraCreditosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(generacreditos.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementdebito_mone_local = document.createElement(GeneraCreditosConstantesFunciones.DEBITOMONELOCAL);
		elementdebito_mone_local.appendChild(document.createTextNode(generacreditos.getdebito_mone_local().toString().trim()));
		element.appendChild(elementdebito_mone_local);

		Element elementcredito_mone_local = document.createElement(GeneraCreditosConstantesFunciones.CREDITOMONELOCAL);
		elementcredito_mone_local.appendChild(document.createTextNode(generacreditos.getcredito_mone_local().toString().trim()));
		element.appendChild(elementcredito_mone_local);

		Element elementsaldo = document.createElement(GeneraCreditosConstantesFunciones.SALDO);
		elementsaldo.appendChild(document.createTextNode(generacreditos.getsaldo().toString().trim()));
		element.appendChild(elementsaldo);
	}
	
	public void generarReporteGroupGenericoGeneraCreditossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GeneraCreditos> generacreditossSeleccionados=new ArrayList<GeneraCreditos>();
		
		generacreditossSeleccionados=this.getGeneraCreditossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGeneraCreditos(generacreditossSeleccionados);
		
		this.generarReporteGeneraCreditoss("Todos",generacreditossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGeneraCreditos(ArrayList<GeneraCreditos> generacreditossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GeneraCreditos generacreditosAux:generacreditossSeleccionados) {
				generacreditosAux.setsDetalleGeneralEntityReporte(generacreditosAux.toString());
			
				if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					generacreditosAux.setsDescripcionGeneralEntityReporte1(generacreditosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					generacreditosAux.setsDescripcionGeneralEntityReporte1(generacreditosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					generacreditosAux.setsDescripcionGeneralEntityReporte1(generacreditosAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_FECHAVENCE)) {
					existe=true;
					generacreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(generacreditosAux.getfecha_vence()));
				}
				 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					generacreditosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(generacreditosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(GeneraCreditosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					generacreditosAux.setsDescripcionGeneralEntityReporte1(generacreditosAux.getnumero_factura());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GeneraCreditosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGeneraCreditos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGeneraCreditos=true;
				this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=true;
				this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=true;
			}
			
			this.isVisibilidadCeldaModificarGeneraCreditos=false;
			this.isVisibilidadCeldaActualizarGeneraCreditos=false;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
			this.isVisibilidadCeldaCancelarGeneraCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGeneraCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGeneraCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
			this.isVisibilidadCeldaModificarGeneraCreditos=false;
			this.isVisibilidadCeldaActualizarGeneraCreditos=true;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
			this.isVisibilidadCeldaCancelarGeneraCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGeneraCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGeneraCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
			this.isVisibilidadCeldaModificarGeneraCreditos=false;
			this.isVisibilidadCeldaActualizarGeneraCreditos=true;
			this.isVisibilidadCeldaEliminarGeneraCreditos=true;
			this.isVisibilidadCeldaCancelarGeneraCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGeneraCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGeneraCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
			this.isVisibilidadCeldaModificarGeneraCreditos=false;
			this.isVisibilidadCeldaActualizarGeneraCreditos=true;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
			this.isVisibilidadCeldaCancelarGeneraCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGeneraCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=true;
			this.isVisibilidadCeldaModificarGeneraCreditos=false;
			this.isVisibilidadCeldaActualizarGeneraCreditos=false;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
			this.isVisibilidadCeldaCancelarGeneraCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGeneraCreditos=true;
				} else {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGeneraCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
			this.isVisibilidadCeldaActualizarGeneraCreditos=false;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
			this.isVisibilidadCeldaCancelarGeneraCreditos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGeneraCreditos=false;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
			this.isVisibilidadCeldaModificarGeneraCreditos=true;
			this.isVisibilidadCeldaActualizarGeneraCreditos=false;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
			this.isVisibilidadCeldaCancelarGeneraCreditos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				} else {
					this.isVisibilidadCeldaGuardarGeneraCreditos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GeneraCreditosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGeneraCreditos=true;
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=true;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=true;
		} else {
			this.actualizarEstadoPanelsGeneraCreditos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGeneraCreditos=false;
			//this.isVisibilidadCeldaVerFormGeneraCreditos=false;
			this.isVisibilidadCeldaDuplicarGeneraCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!generacreditosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
		} else {
			this.isVisibilidadCeldaNuevoGeneraCreditos=false;
			this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(generacreditosSessionBean.getEsGuardarRelacionado()) {
			if(!generacreditosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;												
			}
			
			this.jButtonCerrarGeneraCreditos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
		}
		
		if(!this.permiteMantenimiento(this.generacreditos)) {
			this.isVisibilidadCeldaActualizarGeneraCreditos=false;
			this.isVisibilidadCeldaEliminarGeneraCreditos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoGeneraCreditos=false;
		this.isVisibilidadCeldaNuevoRelacionesGeneraCreditos=false;
		this.isVisibilidadCeldaGuardarCambiosGeneraCreditos=false;
		//this.isVisibilidadCeldaModificarGeneraCreditos=true;
		this.isVisibilidadCeldaActualizarGeneraCreditos=false;
		this.isVisibilidadCeldaEliminarGeneraCreditos=false;
		//this.isVisibilidadCeldaCancelarGeneraCreditos=true;			
		this.isVisibilidadCeldaGuardarGeneraCreditos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGeneraCreditos() {
	}
	
	public void actualizarEstadoPanelsGeneraCreditos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGeneraCreditos!=null) {
				this.jScrollPanelDatosEdicionGeneraCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGeneraCreditos!=null) {
				this.jScrollPanelDatosGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionGeneraCreditos!=null) {
				this.jPanelPaginacionGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGeneraCreditos!=null) {
				this.jScrollPanelDatosEdicionGeneraCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGeneraCreditos!=null) {
				this.jScrollPanelDatosGeneraCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionGeneraCreditos!=null) {
				this.jPanelPaginacionGeneraCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGeneraCreditos!=null) {
				this.jScrollPanelDatosEdicionGeneraCreditos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGeneraCreditos!=null) {
				this.jScrollPanelDatosGeneraCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionGeneraCreditos!=null) {
				this.jPanelPaginacionGeneraCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGeneraCreditos!=null) {
				this.jScrollPanelDatosEdicionGeneraCreditos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGeneraCreditos!=null) {
				this.jScrollPanelDatosGeneraCreditos.setVisible(false);
			}
			
			if(this.jPanelPaginacionGeneraCreditos!=null) {
				this.jPanelPaginacionGeneraCreditos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGeneraCreditos!=null) {
				this.jScrollPanelDatosEdicionGeneraCreditos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGeneraCreditos!=null) {
				this.jScrollPanelDatosGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionGeneraCreditos!=null) {
				this.jPanelPaginacionGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGeneraCreditos!=null) {
				this.jScrollPanelDatosEdicionGeneraCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGeneraCreditos!=null) {
				this.jScrollPanelDatosGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionGeneraCreditos!=null) {
				this.jPanelPaginacionGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGeneraCreditos!=null) {
				this.jScrollPanelDatosEdicionGeneraCreditos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGeneraCreditos!=null) {
				this.jScrollPanelDatosGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelPaginacionGeneraCreditos!=null) {
				this.jPanelPaginacionGeneraCreditos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
					this.jTabbedPaneBusquedasGeneraCreditos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.generacreditosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGeneraCreditos!=null) {
				this.jTabbedPaneBusquedasGeneraCreditos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGeneraCreditos!=null) {
				this.jPanelParametrosReportesGeneraCreditos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaGeneraCreditos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaGeneraCreditos) {this.jTabbedPaneBusquedasGeneraCreditos.remove(jPanelBusquedaGeneraCreditosGeneraCreditos);}
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
			
			this.inicializarActualizarBindingTablaGeneraCreditos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGeneraCreditos() {
		this.updateBorderResaltarBusquedasFormularioGeneraCreditos();
		this.updateVisibilidadBusquedasFormularioGeneraCreditos();
		this.updateHabilitarBusquedasFormularioGeneraCreditos();
	}
	
	public void updateBorderResaltarBusquedasFormularioGeneraCreditos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGeneraCreditos.getComponents().length>0) {
	

		if(this.generacreditosConstantesFunciones.resaltarBusquedaGeneraCreditosGeneraCreditos!=null) {
			index= this.jTabbedPaneBusquedasGeneraCreditos.indexOfComponent(this.jPanelBusquedaGeneraCreditosGeneraCreditos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGeneraCreditos.getComponent(index);
				jPanel.setBorder(this.generacreditosConstantesFunciones.resaltarBusquedaGeneraCreditosGeneraCreditos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGeneraCreditos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGeneraCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGeneraCreditos.indexOfComponent(this.jPanelBusquedaGeneraCreditosGeneraCreditos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGeneraCreditos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.generacreditosConstantesFunciones.mostrarBusquedaGeneraCreditosGeneraCreditos);
			if(!this.generacreditosConstantesFunciones.mostrarBusquedaGeneraCreditosGeneraCreditos && index>-1) {
				this.jTabbedPaneBusquedasGeneraCreditos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGeneraCreditos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGeneraCreditos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGeneraCreditos.indexOfComponent(this.jPanelBusquedaGeneraCreditosGeneraCreditos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGeneraCreditos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.generacreditosConstantesFunciones.activarBusquedaGeneraCreditosGeneraCreditos);
				this.jTabbedPaneBusquedasGeneraCreditos.setEnabledAt(index,this.generacreditosConstantesFunciones.activarBusquedaGeneraCreditosGeneraCreditos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGeneraCreditos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaGeneraCreditos")) {
			index= this.jTabbedPaneBusquedasGeneraCreditos.indexOfComponent(this.jPanelBusquedaGeneraCreditosGeneraCreditos);

			this.jTabbedPaneBusquedasGeneraCreditos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGeneraCreditos.getComponent(index);

			this.generacreditosConstantesFunciones.setResaltarBusquedaGeneraCreditosGeneraCreditos(resaltar);

			jPanel.setBorder(this.generacreditosConstantesFunciones.resaltarBusquedaGeneraCreditosGeneraCreditos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGeneraCreditos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGeneraCreditos() throws Exception {

		if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGeneraCreditos();
		this.updateVisibilidadResaltarControlesFormularioGeneraCreditos();
		this.updateHabilitarResaltarControlesFormularioGeneraCreditos();
		
	}
	
	public void updateBorderResaltarControlesFormularioGeneraCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.generacreditosConstantesFunciones.resaltaridGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jLabelidGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltaridGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarid_empresaGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarid_empresaGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarcodigoGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarcodigoGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarnombre_completoGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarnombre_completoGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarfecha_venceGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarfecha_venceGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarfecha_emisionGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarfecha_emisionGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarnumero_facturaGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarnumero_facturaGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltardebito_mone_localGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltardebito_mone_localGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarcredito_mone_localGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarcredito_mone_localGeneraCreditos);}
		if(this.generacreditosConstantesFunciones.resaltarsaldoGeneraCreditos!=null && this.jInternalFrameDetalleFormGeneraCreditos!=null) {this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.setBorder(this.generacreditosConstantesFunciones.resaltarsaldoGeneraCreditos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGeneraCreditos() throws Exception {		
		if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
	
		//this.jInternalFrameDetalleFormGeneraCreditos.jLabelidGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostraridGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelidGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostraridGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarid_empresaGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelid_empresaGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarid_empresaGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarcodigoGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelcodigoGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarcodigoGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarnombre_completoGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelnombre_completoGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarnombre_completoGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarfecha_venceGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelfecha_venceGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarfecha_venceGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarfecha_emisionGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelfecha_emisionGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarfecha_emisionGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarnumero_facturaGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelnumero_facturaGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarnumero_facturaGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrardebito_mone_localGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPaneldebito_mone_localGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrardebito_mone_localGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarcredito_mone_localGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelcredito_mone_localGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarcredito_mone_localGeneraCreditos);
		//this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarsaldoGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jPanelsaldoGeneraCreditos.setVisible(this.generacreditosConstantesFunciones.mostrarsaldoGeneraCreditos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGeneraCreditos() throws Exception {
		if(this.jInternalFrameDetalleFormGeneraCreditos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGeneraCreditos!=null) {
	
		this.jInternalFrameDetalleFormGeneraCreditos.jLabelidGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activaridGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jComboBoxid_empresaGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarid_empresaGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcodigoGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarcodigoGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextAreanombre_completoGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarnombre_completoGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_venceGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarfecha_venceGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jDateChooserfecha_emisionGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarfecha_emisionGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldnumero_facturaGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarnumero_facturaGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFielddebito_mone_localGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activardebito_mone_localGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldcredito_mone_localGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarcredito_mone_localGeneraCreditos);
		this.jInternalFrameDetalleFormGeneraCreditos.jTextFieldsaldoGeneraCreditos.setEnabled(this.generacreditosConstantesFunciones.activarsaldoGeneraCreditos);
		}
	}
	
		
}