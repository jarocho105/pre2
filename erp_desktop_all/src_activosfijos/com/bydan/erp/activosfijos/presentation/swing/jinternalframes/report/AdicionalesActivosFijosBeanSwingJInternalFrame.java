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

//import com.bydan.erp.activosfijos.util.AdicionalesActivosFijosConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.AdicionalesActivosFijosParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.AdicionalesActivosFijosParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.AdicionalesActivosFijosBean;
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
public class AdicionalesActivosFijosBeanSwingJInternalFrame extends AdicionalesActivosFijosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AdicionalesActivosFijosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AdicionalesActivosFijos> adicionalesactivosfijosValidator = new ClassValidator<AdicionalesActivosFijos>(AdicionalesActivosFijos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AdicionalesActivosFijos adicionalesactivosfijos;	
	public AdicionalesActivosFijos adicionalesactivosfijosAux;
	public AdicionalesActivosFijos adicionalesactivosfijosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AdicionalesActivosFijos adicionalesactivosfijosTotales;
	public Long idAdicionalesActivosFijosActual;
	public Long iIdNuevoAdicionalesActivosFijos=0L;
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
	
	public Boolean isPermisoTodoAdicionalesActivosFijos;
	public Boolean isPermisoNuevoAdicionalesActivosFijos;
	public Boolean isPermisoActualizarAdicionalesActivosFijos;
	public Boolean isPermisoActualizarOriginalAdicionalesActivosFijos;
	public Boolean isPermisoEliminarAdicionalesActivosFijos;
	public Boolean isPermisoGuardarCambiosAdicionalesActivosFijos;
	public Boolean isPermisoConsultaAdicionalesActivosFijos;
	public Boolean isPermisoBusquedaAdicionalesActivosFijos;
	public Boolean isPermisoReporteAdicionalesActivosFijos;
	public Boolean isPermisoPaginacionMedioAdicionalesActivosFijos;
	public Boolean isPermisoPaginacionAltoAdicionalesActivosFijos;
	public Boolean isPermisoPaginacionTodoAdicionalesActivosFijos;
	public Boolean isPermisoCopiarAdicionalesActivosFijos;
	public Boolean isPermisoVerFormAdicionalesActivosFijos;
	public Boolean isPermisoDuplicarAdicionalesActivosFijos;
	public Boolean isPermisoOrdenAdicionalesActivosFijos;
	
	
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
	
	public AdicionalesActivosFijosParameterReturnGeneral adicionalesactivosfijosReturnGeneral;
	public AdicionalesActivosFijosParameterReturnGeneral adicionalesactivosfijosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAdicionalesActivosFijos=false;
	public Boolean esParaAccionDesdeFormularioAdicionalesActivosFijos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AdicionalesActivosFijosSessionBeanAdditional adicionalesactivosfijosSessionBeanAdditional=null;
	
	public AdicionalesActivosFijosSessionBeanAdditional getAdicionalesActivosFijosSessionBeanAdditional() {
		return this.adicionalesactivosfijosSessionBeanAdditional;
	}
	
	public void setAdicionalesActivosFijosSessionBeanAdditional(AdicionalesActivosFijosSessionBeanAdditional adicionalesactivosfijosSessionBeanAdditional) {
		try {
			this.adicionalesactivosfijosSessionBeanAdditional=adicionalesactivosfijosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AdicionalesActivosFijosBeanSwingJInternalFrameAdditional adicionalesactivosfijosBeanSwingJInternalFrameAdditional=null;
	//public class AdicionalesActivosFijosBeanSwingJInternalFrame
	
	public AdicionalesActivosFijosBeanSwingJInternalFrameAdditional getAdicionalesActivosFijosBeanSwingJInternalFrameAdditional() {
		return this.adicionalesactivosfijosBeanSwingJInternalFrameAdditional;
	}
	
	public void setAdicionalesActivosFijosBeanSwingJInternalFrameAdditional(AdicionalesActivosFijosBeanSwingJInternalFrameAdditional adicionalesactivosfijosBeanSwingJInternalFrameAdditional) {
		try {
			this.adicionalesactivosfijosBeanSwingJInternalFrameAdditional=adicionalesactivosfijosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AdicionalesActivosFijosLogic adicionalesactivosfijosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AdicionalesActivosFijos adicionalesactivosfijosBean;
	public AdicionalesActivosFijosConstantesFunciones adicionalesactivosfijosConstantesFunciones;
	//public AdicionalesActivosFijosParameterReturnGeneral adicionalesactivosfijosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<AdicionalesActivosFijos> adicionalesactivosfijoss;	
	//public List<AdicionalesActivosFijos> adicionalesactivosfijossEliminados;
	//public List<AdicionalesActivosFijos> adicionalesactivosfijossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
	public Boolean isVisibilidadCeldaDuplicarAdicionalesActivosFijos=true;
	public Boolean isVisibilidadCeldaCopiarAdicionalesActivosFijos=true;
	public Boolean isVisibilidadCeldaVerFormAdicionalesActivosFijos=true;
	public Boolean isVisibilidadCeldaOrdenAdicionalesActivosFijos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
	public Boolean isVisibilidadCeldaModificarAdicionalesActivosFijos=false;
	public Boolean isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
	public Boolean isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
	public Boolean isVisibilidadCeldaCancelarAdicionalesActivosFijos=false;
	public Boolean isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;	
	
	
	public Boolean isVisibilidadBusquedaAdicionalesActivosFijos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoAdicionalesActivosFijos() {
		return this.iIdNuevoAdicionalesActivosFijos;
	}

	public void setiIdNuevoAdicionalesActivosFijos(Long iIdNuevoAdicionalesActivosFijos) {
		this.iIdNuevoAdicionalesActivosFijos = iIdNuevoAdicionalesActivosFijos;
	}
	
	public Long getidAdicionalesActivosFijosActual() {
		return this.idAdicionalesActivosFijosActual;
	}

	public void setidAdicionalesActivosFijosActual(Long idAdicionalesActivosFijosActual) {
		this.idAdicionalesActivosFijosActual = idAdicionalesActivosFijosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AdicionalesActivosFijos getadicionalesactivosfijos() {
		return this.adicionalesactivosfijos;
	}

	public void setadicionalesactivosfijos(AdicionalesActivosFijos adicionalesactivosfijos) {
		this.adicionalesactivosfijos = adicionalesactivosfijos;
	}
	
	public AdicionalesActivosFijos getadicionalesactivosfijosAux() {
		return this.adicionalesactivosfijosAux;
	}

	public void setadicionalesactivosfijosAux(AdicionalesActivosFijos adicionalesactivosfijosAux) {
		this.adicionalesactivosfijosAux = adicionalesactivosfijosAux;
	}				
	
	public AdicionalesActivosFijos getadicionalesactivosfijosAnterior() {
		return this.adicionalesactivosfijosAnterior;
	}

	public void setadicionalesactivosfijosAnterior(AdicionalesActivosFijos adicionalesactivosfijosAnterior) {
		this.adicionalesactivosfijosAnterior = adicionalesactivosfijosAnterior;
	}	
	
	public AdicionalesActivosFijos getadicionalesactivosfijosTotales() {
		return this.adicionalesactivosfijosTotales;
	}

	public void setadicionalesactivosfijosTotales(AdicionalesActivosFijos adicionalesactivosfijosTotales) {
		this.adicionalesactivosfijosTotales = adicionalesactivosfijosTotales;
	}	
	
	public AdicionalesActivosFijos getadicionalesactivosfijosBean() {
		return this.adicionalesactivosfijosBean;
	}

	public void setadicionalesactivosfijosBean(AdicionalesActivosFijos adicionalesactivosfijosBean) {
		this.adicionalesactivosfijosBean = adicionalesactivosfijosBean;
	}	
	
	public AdicionalesActivosFijosParameterReturnGeneral getadicionalesactivosfijosReturnGeneral() {
		return this.adicionalesactivosfijosReturnGeneral;
	}

	public void setadicionalesactivosfijosReturnGeneral(AdicionalesActivosFijosParameterReturnGeneral adicionalesactivosfijosReturnGeneral) {
		this.adicionalesactivosfijosReturnGeneral = adicionalesactivosfijosReturnGeneral;
	}	
	
	
	public Long idBusquedaAdicionalesActivosFijos=0L;

	public Long getidBusquedaAdicionalesActivosFijos() {
		return this.idBusquedaAdicionalesActivosFijos;
	}

	public void setidBusquedaAdicionalesActivosFijos(Long idBusquedaAdicionalesActivosFijos) {
		this.idBusquedaAdicionalesActivosFijos = idBusquedaAdicionalesActivosFijos;
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
	
	
	public AdicionalesActivosFijosLogic getAdicionalesActivosFijosLogic()	{		
		return adicionalesactivosfijosLogic;
	}

	public void setAdicionalesActivosFijosLogic(AdicionalesActivosFijosLogic adicionalesactivosfijosLogic) {
		this.adicionalesactivosfijosLogic = adicionalesactivosfijosLogic;
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
	
	public Boolean getIsEsNuevoAdicionalesActivosFijos() {
		return isEsNuevoAdicionalesActivosFijos;
	}

	public void setIsEsNuevoAdicionalesActivosFijos(Boolean isEsNuevoAdicionalesActivosFijos) {
		this.isEsNuevoAdicionalesActivosFijos = isEsNuevoAdicionalesActivosFijos;
	}

	public Boolean getEsParaAccionDesdeFormularioAdicionalesActivosFijos() {
		return esParaAccionDesdeFormularioAdicionalesActivosFijos;
	}
	
	public void setEsParaAccionDesdeFormularioAdicionalesActivosFijos(Boolean esParaAccionDesdeFormularioAdicionalesActivosFijos) {
		this.esParaAccionDesdeFormularioAdicionalesActivosFijos = esParaAccionDesdeFormularioAdicionalesActivosFijos;
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

			if(this.adicionalesactivosfijosSessionBean==null) {
				this.adicionalesactivosfijosSessionBean=new AdicionalesActivosFijosSessionBean();
			}

			if(!this.adicionalesactivosfijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(adicionalesactivosfijosSessionBean.getlidEmpresaActual());
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

					if(this.adicionalesactivosfijos!=null) {
						this.adicionalesactivosfijos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
						this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAdicionalesActivosFijos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
						if(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.getItemCount()>0) {
							this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAdicionalesActivosFijosGenerico)throws Exception
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
				jComboBoxid_empresaAdicionalesActivosFijosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAdicionalesActivosFijosGenerico!=null && jComboBoxid_empresaAdicionalesActivosFijosGenerico.getItemCount()>0) {
					jComboBoxid_empresaAdicionalesActivosFijosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(AdicionalesActivosFijos adicionalesactivosfijos,JComboBox jComboBoxid_empresaAdicionalesActivosFijosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAdicionalesActivosFijosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAdicionalesActivosFijosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				adicionalesactivosfijos.setid_empresa(empresaAux.getId());
				adicionalesactivosfijos.setempresa_descripcion(AdicionalesActivosFijosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				adicionalesactivosfijos.setEmpresa(empresaAux);			}
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

					if(!AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { 
							this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { 
					}

					if(!AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
							this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
							this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesAdicionalesActivosFijos() throws Exception {
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
		
	public AdicionalesActivosFijosParameterReturnGeneral getAdicionalesActivosFijosParameterGeneral() {
		return this.adicionalesactivosfijosParameterGeneral;
	}
	
	public void setAdicionalesActivosFijosParameterGeneral(AdicionalesActivosFijosParameterReturnGeneral adicionalesactivosfijosParameterGeneral) {
		this.adicionalesactivosfijosParameterGeneral = adicionalesactivosfijosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAdicionalesActivosFijos() {
		return isPermisoTodoAdicionalesActivosFijos;
	}

	public void setIsPermisoTodoAdicionalesActivosFijos(Boolean isPermisoTodoAdicionalesActivosFijos) {
		this.isPermisoTodoAdicionalesActivosFijos = isPermisoTodoAdicionalesActivosFijos;
	}

	public Boolean getIsPermisoNuevoAdicionalesActivosFijos() {
		return isPermisoNuevoAdicionalesActivosFijos;
	}

	public void setIsPermisoNuevoAdicionalesActivosFijos(Boolean isPermisoNuevoAdicionalesActivosFijos) {
		this.isPermisoNuevoAdicionalesActivosFijos = isPermisoNuevoAdicionalesActivosFijos;
	}

	public Boolean getIsPermisoActualizarAdicionalesActivosFijos() {
		return isPermisoActualizarAdicionalesActivosFijos;
	}

	public void setIsPermisoActualizarAdicionalesActivosFijos(Boolean isPermisoActualizarAdicionalesActivosFijos) {
		this.isPermisoActualizarAdicionalesActivosFijos = isPermisoActualizarAdicionalesActivosFijos;
	}

	public Boolean getIsPermisoEliminarAdicionalesActivosFijos() {
		return isPermisoEliminarAdicionalesActivosFijos;
	}

	public void setIsPermisoEliminarAdicionalesActivosFijos(Boolean isPermisoEliminarAdicionalesActivosFijos) {
		this.isPermisoEliminarAdicionalesActivosFijos = isPermisoEliminarAdicionalesActivosFijos;
	}

	public Boolean getIsPermisoGuardarCambiosAdicionalesActivosFijos() {
		return isPermisoGuardarCambiosAdicionalesActivosFijos;
	}

	public void setIsPermisoGuardarCambiosAdicionalesActivosFijos(Boolean isPermisoGuardarCambiosAdicionalesActivosFijos) {
		this.isPermisoGuardarCambiosAdicionalesActivosFijos = isPermisoGuardarCambiosAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoConsultaAdicionalesActivosFijos() {
		return isPermisoConsultaAdicionalesActivosFijos;
	}

	public void setIsPermisoConsultaAdicionalesActivosFijos(Boolean isPermisoConsultaAdicionalesActivosFijos) {
		this.isPermisoConsultaAdicionalesActivosFijos = isPermisoConsultaAdicionalesActivosFijos;
	}

	public Boolean getIsPermisoBusquedaAdicionalesActivosFijos() {
		return isPermisoBusquedaAdicionalesActivosFijos;
	}

	public void setIsPermisoBusquedaAdicionalesActivosFijos(Boolean isPermisoBusquedaAdicionalesActivosFijos) {
		this.isPermisoBusquedaAdicionalesActivosFijos = isPermisoBusquedaAdicionalesActivosFijos;
	}

	public Boolean getIsPermisoReporteAdicionalesActivosFijos() {
		return isPermisoReporteAdicionalesActivosFijos;
	}

	public void setIsPermisoReporteAdicionalesActivosFijos(Boolean isPermisoReporteAdicionalesActivosFijos) {
		this.isPermisoReporteAdicionalesActivosFijos = isPermisoReporteAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionMedioAdicionalesActivosFijos() {
		return isPermisoPaginacionMedioAdicionalesActivosFijos;
	}

	public void setIsPermisoPaginacionMedioAdicionalesActivosFijos(Boolean isPermisoPaginacionMedioAdicionalesActivosFijos) {
		this.isPermisoPaginacionMedioAdicionalesActivosFijos = isPermisoPaginacionMedioAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionTodoAdicionalesActivosFijos() {
		return isPermisoPaginacionTodoAdicionalesActivosFijos;
	}

	public void setIsPermisoPaginacionTodoAdicionalesActivosFijos(Boolean isPermisoPaginacionTodoAdicionalesActivosFijos) {
		this.isPermisoPaginacionTodoAdicionalesActivosFijos = isPermisoPaginacionTodoAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionAltoAdicionalesActivosFijos() {
		return isPermisoPaginacionAltoAdicionalesActivosFijos;
	}

	public void setIsPermisoPaginacionAltoAdicionalesActivosFijos(Boolean isPermisoPaginacionAltoAdicionalesActivosFijos) {
		this.isPermisoPaginacionAltoAdicionalesActivosFijos = isPermisoPaginacionAltoAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoCopiarAdicionalesActivosFijos() {
		return isPermisoCopiarAdicionalesActivosFijos;
	}

	public void setIsPermisoCopiarAdicionalesActivosFijos(Boolean isPermisoCopiarAdicionalesActivosFijos) {
		this.isPermisoCopiarAdicionalesActivosFijos = isPermisoCopiarAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoVerFormAdicionalesActivosFijos() {
		return isPermisoVerFormAdicionalesActivosFijos;
	}

	public void setIsPermisoVerFormAdicionalesActivosFijos(Boolean isPermisoVerFormAdicionalesActivosFijos) {
		this.isPermisoVerFormAdicionalesActivosFijos = isPermisoVerFormAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoDuplicarAdicionalesActivosFijos() {
		return isPermisoDuplicarAdicionalesActivosFijos;
	}

	public void setIsPermisoDuplicarAdicionalesActivosFijos(Boolean isPermisoDuplicarAdicionalesActivosFijos) {
		this.isPermisoDuplicarAdicionalesActivosFijos = isPermisoDuplicarAdicionalesActivosFijos;
	}
	
	public Boolean getIsPermisoOrdenAdicionalesActivosFijos() {
		return isPermisoOrdenAdicionalesActivosFijos;
	}

	public void setIsPermisoOrdenAdicionalesActivosFijos(Boolean isPermisoOrdenAdicionalesActivosFijos) {
		this.isPermisoOrdenAdicionalesActivosFijos = isPermisoOrdenAdicionalesActivosFijos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAdicionalesActivosFijos() {
		return isVisibilidadCeldaNuevoAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoAdicionalesActivosFijos(Boolean isVisibilidadCeldaNuevoAdicionalesActivosFijos) {
		this.isVisibilidadCeldaNuevoAdicionalesActivosFijos = isVisibilidadCeldaNuevoAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAdicionalesActivosFijos() {
		return isVisibilidadCeldaDuplicarAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaDuplicarAdicionalesActivosFijos(Boolean isVisibilidadCeldaDuplicarAdicionalesActivosFijos) {
		this.isVisibilidadCeldaDuplicarAdicionalesActivosFijos = isVisibilidadCeldaDuplicarAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAdicionalesActivosFijos() {
		return isVisibilidadCeldaCopiarAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaCopiarAdicionalesActivosFijos(Boolean isVisibilidadCeldaCopiarAdicionalesActivosFijos) {
		this.isVisibilidadCeldaCopiarAdicionalesActivosFijos = isVisibilidadCeldaCopiarAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAdicionalesActivosFijos() {
		return isVisibilidadCeldaVerFormAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaVerFormAdicionalesActivosFijos(Boolean isVisibilidadCeldaVerFormAdicionalesActivosFijos) {
		this.isVisibilidadCeldaVerFormAdicionalesActivosFijos = isVisibilidadCeldaVerFormAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAdicionalesActivosFijos() {
		return isVisibilidadCeldaOrdenAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaOrdenAdicionalesActivosFijos(Boolean isVisibilidadCeldaOrdenAdicionalesActivosFijos) {
		this.isVisibilidadCeldaOrdenAdicionalesActivosFijos = isVisibilidadCeldaOrdenAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos() {
		return isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos(Boolean isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos) {
		this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos = isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAdicionalesActivosFijos() {
		return isVisibilidadCeldaModificarAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaModificarAdicionalesActivosFijos(Boolean isVisibilidadCeldaModificarAdicionalesActivosFijos) {
		this.isVisibilidadCeldaModificarAdicionalesActivosFijos = isVisibilidadCeldaModificarAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAdicionalesActivosFijos() {
		return isVisibilidadCeldaActualizarAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaActualizarAdicionalesActivosFijos(Boolean isVisibilidadCeldaActualizarAdicionalesActivosFijos) {
		this.isVisibilidadCeldaActualizarAdicionalesActivosFijos = isVisibilidadCeldaActualizarAdicionalesActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaEliminarAdicionalesActivosFijos() {
		return isVisibilidadCeldaEliminarAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaEliminarAdicionalesActivosFijos(Boolean isVisibilidadCeldaEliminarAdicionalesActivosFijos) {
		this.isVisibilidadCeldaEliminarAdicionalesActivosFijos = isVisibilidadCeldaEliminarAdicionalesActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaCancelarAdicionalesActivosFijos() {
		return isVisibilidadCeldaCancelarAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaCancelarAdicionalesActivosFijos(Boolean isVisibilidadCeldaCancelarAdicionalesActivosFijos) {
		this.isVisibilidadCeldaCancelarAdicionalesActivosFijos = isVisibilidadCeldaCancelarAdicionalesActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaGuardarAdicionalesActivosFijos() {
		return isVisibilidadCeldaGuardarAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarAdicionalesActivosFijos(Boolean isVisibilidadCeldaGuardarAdicionalesActivosFijos) {
		this.isVisibilidadCeldaGuardarAdicionalesActivosFijos = isVisibilidadCeldaGuardarAdicionalesActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos() {
		return isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos(Boolean isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos) {
		this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos = isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos;
	}
		
	public AdicionalesActivosFijosSessionBean getadicionalesactivosfijosSessionBean() {
		return this.adicionalesactivosfijosSessionBean;
	}
	
	public void setadicionalesactivosfijosSessionBean(AdicionalesActivosFijosSessionBean adicionalesactivosfijosSessionBean) {
		this.adicionalesactivosfijosSessionBean=adicionalesactivosfijosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaAdicionalesActivosFijos() {
		return this.isVisibilidadBusquedaAdicionalesActivosFijos;
	}

	public void setisVisibilidadBusquedaAdicionalesActivosFijos(Boolean isVisibilidadBusquedaAdicionalesActivosFijos) {
		this.isVisibilidadBusquedaAdicionalesActivosFijos=isVisibilidadBusquedaAdicionalesActivosFijos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(adicionalesactivosfijos,null);
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
	
	public void bugActualizarReferenciaActual(AdicionalesActivosFijos adicionalesactivosfijos,AdicionalesActivosFijos adicionalesactivosfijosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAdicionalesActivosFijos(adicionalesactivosfijos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		adicionalesactivosfijosAux.setId(adicionalesactivosfijos.getId());
		adicionalesactivosfijosAux.setVersionRow(adicionalesactivosfijos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(AdicionalesActivosFijos adicionalesactivosfijosLocal) throws Exception {
		
		if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AdicionalesActivosFijos adicionalesactivosfijosLocal) throws Exception {	
		if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				adicionalesactivosfijosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAdicionalesActivosFijosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = adicionalesactivosfijosValidator.getInvalidValues(this.adicionalesactivosfijos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AdicionalesActivosFijos adicionalesactivosfijos,List<AdicionalesActivosFijos> adicionalesactivosfijoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(AdicionalesActivosFijos adicionalesactivosfijos,List<AdicionalesActivosFijos> adicionalesactivosfijoss) throws Exception {
		try	{			
			AdicionalesActivosFijosConstantesFunciones.actualizarSelectedLista(adicionalesactivosfijos,adicionalesactivosfijoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AdicionalesActivosFijos> adicionalesactivosfijossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				adicionalesactivosfijossLocal=this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				adicionalesactivosfijossLocal=this.adicionalesactivosfijoss;
			}
			//ARCHITECTURE
		
			for(AdicionalesActivosFijos adicionalesactivosfijosLocal:adicionalesactivosfijossLocal) {
				if(this.permiteMantenimiento(adicionalesactivosfijosLocal) && adicionalesactivosfijosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AdicionalesActivosFijosConstantesFunciones.getAdicionalesActivosFijosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcodigo_sub_grupoAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombre_sub_grupoAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcodigo_detalle_grupoAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombre_detalle_grupoAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelclaveAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombreAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelfecha_compraAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelvida_utilAdicionalesActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AdicionalesActivosFijosConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcosto_de_compraAdicionalesActivosFijos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcodigo_sub_grupoAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombre_sub_grupoAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcodigo_detalle_grupoAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombre_detalle_grupoAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelclaveAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombreAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelfecha_compraAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelvida_utilAdicionalesActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcosto_de_compraAdicionalesActivosFijos,"");
		
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
		this.iIdNuevoAdicionalesActivosFijos--;	
		
		
		this.adicionalesactivosfijosAux=new AdicionalesActivosFijos();
		
		this.adicionalesactivosfijosAux.setId(this.iIdNuevoAdicionalesActivosFijos);
		this.adicionalesactivosfijosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().add(this.adicionalesactivosfijosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.adicionalesactivosfijoss.add(this.adicionalesactivosfijosAux);
		}
		//ARCHITECTURE
		
		this.adicionalesactivosfijos=this.adicionalesactivosfijosAux;
		
		if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAdicionalesActivosFijos(this.adicionalesactivosfijos);
			this.setVariablesObjetoActualToFormularioForeignKeyAdicionalesActivosFijos(this.adicionalesactivosfijos);
		}
				
		//this.setDefaultControlesAdicionalesActivosFijos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAdicionalesActivosFijos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAdicionalesActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAdicionalesActivosFijos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijosBean,this.adicionalesactivosfijos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral,this.adicionalesactivosfijosBean,false);
		
		if(this.adicionalesactivosfijosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos());
		}
		
		if(this.adicionalesactivosfijosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos(),classes);//this.adicionalesactivosfijosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAdicionalesActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAdicionalesActivosFijos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.RecargarFormAdicionalesActivosFijos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAdicionalesActivosFijos(false);
						
			if(adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAdicionalesActivosFijos();
			}
			
			this.actualizarVisualTableDatosAdicionalesActivosFijos();
			
			this.jTableDatosAdicionalesActivosFijos.setRowSelectionInterval(this.getIndiceNuevoAdicionalesActivosFijos(), this.getIndiceNuevoAdicionalesActivosFijos());
			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
						
			this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAdicionalesActivosFijos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarcodigo_sub_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarnombre_sub_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarcodigo_detalle_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarnombre_detalle_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarclaveAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarnombreAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarfecha_compraAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarvida_utilAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarcosto_de_compraAdicionalesActivosFijos);	
		//
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setEnabled(isHabilitar && this.adicionalesactivosfijosConstantesFunciones.activarid_empresaAdicionalesActivosFijos);
	};
	
	public void setDefaultControlesAdicionalesActivosFijos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAdicionalesActivosFijos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.adicionalesactivosfijosSessionBean.setConGuardarRelaciones(true);			
			this.adicionalesactivosfijosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.setVisible(true);
			
					
		} else {
			//this.adicionalesactivosfijosSessionBean.setConGuardarRelaciones(false);			
			this.adicionalesactivosfijosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAdicionalesActivosFijos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
				if(adicionalesactivosfijosAux.getId().equals(this.iIdNuevoAdicionalesActivosFijos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijoss) {
				if(adicionalesactivosfijosAux.getId().equals(this.iIdNuevoAdicionalesActivosFijos)) {
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
	
	public int getIndiceActualAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
				if(adicionalesactivosfijosAux.getId().equals(adicionalesactivosfijos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijoss) {
				if(adicionalesactivosfijosAux.getId().equals(adicionalesactivosfijos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
				if(adicionalesactivosfijosAux.getAdicionalesActivosFijosOriginal().getId().equals(adicionalesactivosfijosOriginal.getId())) {
					existe=true;
					adicionalesactivosfijosOriginal.setId(adicionalesactivosfijosAux.getId());
					adicionalesactivosfijosOriginal.setVersionRow(adicionalesactivosfijosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijoss) {
				if(adicionalesactivosfijosAux.getAdicionalesActivosFijosOriginal().getId().equals(adicionalesactivosfijosOriginal.getId())) {
					existe=true;
					adicionalesactivosfijosOriginal.setId(adicionalesactivosfijosAux.getId());
					adicionalesactivosfijosOriginal.setVersionRow(adicionalesactivosfijosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAdicionalesActivosFijos(Boolean esParaCancelar) throws Exception {
		adicionalesactivosfijossAux=new ArrayList<AdicionalesActivosFijos>();
		adicionalesactivosfijosAux=new AdicionalesActivosFijos();
		
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
					if(adicionalesactivosfijosAux.getId()<0) {
						adicionalesactivosfijossAux.add(adicionalesactivosfijosAux);
					}		
				}
				this.iIdNuevoAdicionalesActivosFijos=0L;
				this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().removeAll(adicionalesactivosfijossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijoss) {
					if(adicionalesactivosfijosAux.getId()<0) {
						adicionalesactivosfijossAux.add(adicionalesactivosfijosAux);
					}		
				}
				this.iIdNuevoAdicionalesActivosFijos=0L;
				this.adicionalesactivosfijoss.removeAll(adicionalesactivosfijossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAdicionalesActivosFijos 
					&& this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size()>0
					) {
					adicionalesactivosfijosAux=this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().get(this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size() - 1);
				
					if(adicionalesactivosfijosAux.getId()<0) {
						this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().remove(adicionalesactivosfijosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAdicionalesActivosFijos && this.adicionalesactivosfijoss.size()>0) {
					adicionalesactivosfijosAux=this.adicionalesactivosfijoss.get(this.adicionalesactivosfijoss.size() - 1);
				
					if(adicionalesactivosfijosAux.getId()<0) {
						this.adicionalesactivosfijoss.remove(adicionalesactivosfijosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAdicionalesActivosFijos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(adicionalesactivosfijos.getId()<0) {
				this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().remove(this.adicionalesactivosfijos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(adicionalesactivosfijos.getId()<0) {
				this.adicionalesactivosfijoss.remove(this.adicionalesactivosfijos);
			}
		}			
	}
	
	public void setEstadosInicialesAdicionalesActivosFijos(List<AdicionalesActivosFijos> adicionalesactivosfijossAux) throws Exception {
		AdicionalesActivosFijosConstantesFunciones.setEstadosInicialesAdicionalesActivosFijos(adicionalesactivosfijossAux);
	}
	
	public void setEstadosInicialesAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijosAux) throws Exception {
		AdicionalesActivosFijosConstantesFunciones.setEstadosInicialesAdicionalesActivosFijos(adicionalesactivosfijosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAdicionalesActivosFijosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAdicionalesActivosFijosActual()) {
				if(!this.isEsNuevoAdicionalesActivosFijos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAdicionalesActivosFijos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAdicionalesActivosFijosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Adicionales Activos Fijos ?", "MANTENIMIENTO DE Adicionales Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AdicionalesActivosFijos adicionalesactivosfijos) throws Exception {
		AdicionalesActivosFijosConstantesFunciones.seleccionarAsignar(this.adicionalesactivosfijos,adicionalesactivosfijos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAdicionalesActivosFijos=this.isPermisoActualizarOriginalAdicionalesActivosFijos;
			
			
			this.seleccionarAsignar(adicionalesactivosfijos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.adicionalesactivosfijosSessionBean.setsFuncionBusquedaRapida(this.adicionalesactivosfijosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAdicionalesActivosFijos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAdicionalesActivosFijos(esParaCancelar);				
				this.cancelarNuevoAdicionalesActivosFijos(esParaCancelar);								
			}
			
			this.adicionalesactivosfijos=new AdicionalesActivosFijos();
			
			this.inicializarAdicionalesActivosFijos();
			
			this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAdicionalesActivosFijos() throws Exception {
		try {
			AdicionalesActivosFijosConstantesFunciones.inicializarAdicionalesActivosFijos(this.adicionalesactivosfijos);
			
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
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAdicionalesActivosFijoss(String sAccionBusqueda,List<AdicionalesActivosFijos> adicionalesactivosfijossParaReportes) throws Exception {
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
					sPathReporteFinal="AdicionalesActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AdicionalesActivosFijosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AdicionalesActivosFijosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AdicionalesActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Adicionales Activos Fijoses");		
		parameters.put("busquedapor", AdicionalesActivosFijosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAdicionalesActivosFijos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AdicionalesActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AdicionalesActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAdicionalesActivosFijos=new JRBeanArrayDataSource(AdicionalesActivosFijosJInternalFrame.TraerAdicionalesActivosFijosBeans(adicionalesactivosfijossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAdicionalesActivosFijos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AdicionalesActivosFijosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AdicionalesActivosFijosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AdicionalesActivosFijosBean.TraerAdicionalesActivosFijosBeans(adicionalesactivosfijossParaReportes).toArray()));
							
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
				this.generarExcelReporteAdicionalesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,adicionalesactivosfijossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAdicionalesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,adicionalesactivosfijossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijosActionPerformed(null);
					//this.generarExcelReporteAdicionalesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,adicionalesactivosfijossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAdicionalesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,adicionalesactivosfijossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAdicionalesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,adicionalesactivosfijossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAdicionalesActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,adicionalesactivosfijossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAdicionalesActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<AdicionalesActivosFijos> adicionalesactivosfijossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"adicionalesactivosfijos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AdicionalesActivosFijoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAdicionalesActivosFijos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AdicionalesActivosFijos adicionalesactivosfijos : adicionalesactivosfijossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AdicionalesActivosFijosConstantesFunciones.generarExcelReporteDataAdicionalesActivosFijos("NORMAL",row,workbook,adicionalesactivosfijos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAdicionalesActivosFijos(String sTipo,Row row,Workbook workbook) {
		
		AdicionalesActivosFijosConstantesFunciones.generarExcelReporteHeaderAdicionalesActivosFijos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAdicionalesActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<AdicionalesActivosFijos> adicionalesactivosfijossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"adicionalesactivosfijos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AdicionalesActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AdicionalesActivosFijos adicionalesactivosfijos : adicionalesactivosfijossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.getAdicionalesActivosFijosDescripcion(adicionalesactivosfijos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(adicionalesactivosfijos.getcosto_de_compra());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAdicionalesActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<AdicionalesActivosFijos> adicionalesactivosfijossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AdicionalesActivosFijos> adicionalesactivosfijossRespaldo=null;
		
		classes=AdicionalesActivosFijosConstantesFunciones.getClassesRelationshipsOfAdicionalesActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.adicionalesactivosfijosLogic.setDatosCliente(this.datosCliente);
		this.adicionalesactivosfijosLogic.setDatosDeep(this.datosDeep);
		this.adicionalesactivosfijosLogic.setIsConDeep(true);
		
		adicionalesactivosfijossRespaldo=this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss();
		
		this.adicionalesactivosfijosLogic.setAdicionalesActivosFijoss(adicionalesactivosfijossParaReportes);	
		this.adicionalesactivosfijosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		adicionalesactivosfijossParaReportes=this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss();
		this.adicionalesactivosfijosLogic.setAdicionalesActivosFijoss(adicionalesactivosfijossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"adicionalesactivosfijos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AdicionalesActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAdicionalesActivosFijos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AdicionalesActivosFijos adicionalesactivosfijos : adicionalesactivosfijossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAdicionalesActivosFijos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AdicionalesActivosFijosConstantesFunciones.generarExcelReporteDataAdicionalesActivosFijos("NORMAL",row,workbook,adicionalesactivosfijos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.getAdicionalesActivosFijosDescripcion(adicionalesactivosfijos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAdicionalesActivosFijos() throws Exception {		
		this.startProcessAdicionalesActivosFijos(true);
	}
	
	public void startProcessAdicionalesActivosFijos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAdicionalesActivosFijos ,this.jPanelParametrosReportesAdicionalesActivosFijos, this.jScrollPanelDatosAdicionalesActivosFijos,this.jPanelPaginacionAdicionalesActivosFijos, this.jScrollPanelDatosEdicionAdicionalesActivosFijos, this.jPanelAccionesAdicionalesActivosFijos,this.jPanelAccionesFormularioAdicionalesActivosFijos,this.jmenuBarAdicionalesActivosFijos,this.jmenuBarDetalleAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,this.jTtoolBarDetalleAdicionalesActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasAdicionalesActivosFijos=this.jTabbedPaneBusquedasAdicionalesActivosFijos; 
		
		final JPanel jPanelParametrosReportesAdicionalesActivosFijos=this.jPanelParametrosReportesAdicionalesActivosFijos;
		//final JScrollPane jScrollPanelDatosAdicionalesActivosFijos=this.jScrollPanelDatosAdicionalesActivosFijos;
		final JTable jTableDatosAdicionalesActivosFijos=this.jTableDatosAdicionalesActivosFijos;		
		final JPanel jPanelPaginacionAdicionalesActivosFijos=this.jPanelPaginacionAdicionalesActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionAdicionalesActivosFijos=this.jScrollPanelDatosEdicionAdicionalesActivosFijos;
		final JPanel jPanelAccionesAdicionalesActivosFijos=this.jPanelAccionesAdicionalesActivosFijos;
		
		JPanel jPanelCamposAuxiliarAdicionalesActivosFijos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAdicionalesActivosFijos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			jPanelCamposAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelCamposAdicionalesActivosFijos;
			jPanelAccionesFormularioAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelAccionesFormularioAdicionalesActivosFijos;
		}
		
		final JPanel jPanelCamposAdicionalesActivosFijos=jPanelCamposAuxiliarAdicionalesActivosFijos;
		final JPanel jPanelAccionesFormularioAdicionalesActivosFijos=jPanelAccionesFormularioAuxiliarAdicionalesActivosFijos;
		
		
		final JMenuBar jmenuBarAdicionalesActivosFijos=this.jmenuBarAdicionalesActivosFijos;
		final JToolBar jTtoolBarAdicionalesActivosFijos=this.jTtoolBarAdicionalesActivosFijos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAdicionalesActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAdicionalesActivosFijos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			jmenuBarDetalleAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jmenuBarDetalleAdicionalesActivosFijos;
			jTtoolBarDetalleAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTtoolBarDetalleAdicionalesActivosFijos;
		}
		
		final JMenuBar jmenuBarDetalleAdicionalesActivosFijos=jmenuBarDetalleAuxiliarAdicionalesActivosFijos;
		final JToolBar jTtoolBarDetalleAdicionalesActivosFijos=jTtoolBarDetalleAuxiliarAdicionalesActivosFijos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAdicionalesActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAdicionalesActivosFijos;
			processRunnable.jTableDatos=jTableDatosAdicionalesActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposAdicionalesActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionAdicionalesActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesAdicionalesActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAdicionalesActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarAdicionalesActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAdicionalesActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarAdicionalesActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAdicionalesActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAdicionalesActivosFijos ,jPanelParametrosReportesAdicionalesActivosFijos,jTableDatosAdicionalesActivosFijos, /*jScrollPanelDatosAdicionalesActivosFijos,*/jPanelCamposAdicionalesActivosFijos,jPanelPaginacionAdicionalesActivosFijos, /*jScrollPanelDatosEdicionAdicionalesActivosFijos,*/ jPanelAccionesAdicionalesActivosFijos,jPanelAccionesFormularioAdicionalesActivosFijos,jmenuBarAdicionalesActivosFijos,jmenuBarDetalleAdicionalesActivosFijos,jTtoolBarAdicionalesActivosFijos,jTtoolBarDetalleAdicionalesActivosFijos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAdicionalesActivosFijos ,jPanelParametrosReportesAdicionalesActivosFijos, jScrollPanelDatosAdicionalesActivosFijos,jPanelPaginacionAdicionalesActivosFijos, jScrollPanelDatosEdicionAdicionalesActivosFijos, jPanelAccionesAdicionalesActivosFijos,jPanelAccionesFormularioAdicionalesActivosFijos,jmenuBarAdicionalesActivosFijos,jmenuBarDetalleAdicionalesActivosFijos,jTtoolBarAdicionalesActivosFijos,jTtoolBarDetalleAdicionalesActivosFijos);
						
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
	
	public void finishProcessAdicionalesActivosFijos() {// throws Exception 
		this.finishProcessAdicionalesActivosFijos(true);
	}
	
	public void finishProcessAdicionalesActivosFijos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAdicionalesActivosFijos ,this.jPanelParametrosReportesAdicionalesActivosFijos, this.jScrollPanelDatosAdicionalesActivosFijos,this.jPanelPaginacionAdicionalesActivosFijos, this.jScrollPanelDatosEdicionAdicionalesActivosFijos, this.jPanelAccionesAdicionalesActivosFijos,this.jPanelAccionesFormularioAdicionalesActivosFijos,this.jmenuBarAdicionalesActivosFijos,this.jmenuBarDetalleAdicionalesActivosFijos,this.jTtoolBarAdicionalesActivosFijos,this.jTtoolBarDetalleAdicionalesActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasAdicionalesActivosFijos=this.jTabbedPaneBusquedasAdicionalesActivosFijos; 
		
		final JPanel jPanelParametrosReportesAdicionalesActivosFijos=this.jPanelParametrosReportesAdicionalesActivosFijos;
		//final JScrollPane jScrollPanelDatosAdicionalesActivosFijos=this.jScrollPanelDatosAdicionalesActivosFijos;
		final JTable jTableDatosAdicionalesActivosFijos=this.jTableDatosAdicionalesActivosFijos;		
		final JPanel jPanelPaginacionAdicionalesActivosFijos=this.jPanelPaginacionAdicionalesActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionAdicionalesActivosFijos=this.jScrollPanelDatosEdicionAdicionalesActivosFijos;
		final JPanel jPanelAccionesAdicionalesActivosFijos=this.jPanelAccionesAdicionalesActivosFijos;
		
		JPanel jPanelCamposAuxiliarAdicionalesActivosFijos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAdicionalesActivosFijos=new JPanel();
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			jPanelCamposAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelCamposAdicionalesActivosFijos;
			jPanelAccionesFormularioAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelAccionesFormularioAdicionalesActivosFijos;
		}
		
		final JPanel jPanelCamposAdicionalesActivosFijos=jPanelCamposAuxiliarAdicionalesActivosFijos;
		final JPanel jPanelAccionesFormularioAdicionalesActivosFijos=jPanelAccionesFormularioAuxiliarAdicionalesActivosFijos;
		
		
		final JMenuBar jmenuBarAdicionalesActivosFijos=this.jmenuBarAdicionalesActivosFijos;		
		final JToolBar jTtoolBarAdicionalesActivosFijos=this.jTtoolBarAdicionalesActivosFijos;
				
		JMenuBar jmenuBarDetalleAuxiliarAdicionalesActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAdicionalesActivosFijos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			jmenuBarDetalleAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jmenuBarDetalleAdicionalesActivosFijos;
			jTtoolBarDetalleAuxiliarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTtoolBarDetalleAdicionalesActivosFijos;		
		}
		
		final JMenuBar jmenuBarDetalleAdicionalesActivosFijos=jmenuBarDetalleAuxiliarAdicionalesActivosFijos;
		final JToolBar jTtoolBarDetalleAdicionalesActivosFijos=jTtoolBarDetalleAuxiliarAdicionalesActivosFijos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAdicionalesActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAdicionalesActivosFijos;
			processRunnable.jTableDatos=jTableDatosAdicionalesActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposAdicionalesActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionAdicionalesActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesAdicionalesActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAdicionalesActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarAdicionalesActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAdicionalesActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarAdicionalesActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAdicionalesActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAdicionalesActivosFijos ,jPanelParametrosReportesAdicionalesActivosFijos, jTableDatosAdicionalesActivosFijos,/*jScrollPanelDatosAdicionalesActivosFijos,*/jPanelCamposAdicionalesActivosFijos,jPanelPaginacionAdicionalesActivosFijos, /*jScrollPanelDatosEdicionAdicionalesActivosFijos,*/ jPanelAccionesAdicionalesActivosFijos,jPanelAccionesFormularioAdicionalesActivosFijos,jmenuBarAdicionalesActivosFijos,jmenuBarDetalleAdicionalesActivosFijos,jTtoolBarAdicionalesActivosFijos,jTtoolBarDetalleAdicionalesActivosFijos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAdicionalesActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAdicionalesActivosFijos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAdicionalesActivosFijos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAdicionalesActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAdicionalesActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAdicionalesActivosFijos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAdicionalesActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAdicionalesActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAdicionalesActivosFijos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.adicionalesactivosfijosConstantesFunciones.getsFinalQueryAdicionalesActivosFijos();
		String  finalQueryPaginacionTodos=this.adicionalesactivosfijosConstantesFunciones.getsFinalQueryAdicionalesActivosFijos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AdicionalesActivosFijosConstantesFunciones.getArrayColumnasGlobalesNoAdicionalesActivosFijos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AdicionalesActivosFijosConstantesFunciones.getArrayColumnasGlobalesAdicionalesActivosFijos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AdicionalesActivosFijosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.adicionalesactivosfijossEliminados= new ArrayList<AdicionalesActivosFijos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAdicionalesActivosFijos();
		
				///*AdicionalesActivosFijosSessionBean*/this.adicionalesactivosfijosSessionBean=new AdicionalesActivosFijosSessionBean();
			
			if(this.adicionalesactivosfijosSessionBean==null) {
				this.adicionalesactivosfijosSessionBean=new AdicionalesActivosFijosSessionBean();
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
					this.iNumeroPaginacion=AdicionalesActivosFijosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AdicionalesActivosFijosConstantesFunciones.getClassesForeignKeysOfAdicionalesActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/adicionalesactivosfijos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			adicionalesactivosfijossAux= new ArrayList<AdicionalesActivosFijos>();
			
				
			adicionalesactivosfijosLogic.setDatosCliente(this.datosCliente);
			adicionalesactivosfijosLogic.setDatosDeep(this.datosDeep);
			adicionalesactivosfijosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaAdicionalesActivosFijos")) {
				this.sDetalleReporte=AdicionalesActivosFijosConstantesFunciones.getDetalleIndiceBusquedaAdicionalesActivosFijos(idBusquedaAdicionalesActivosFijos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					adicionalesactivosfijosLogic.getAdicionalesActivosFijossBusquedaAdicionalesActivosFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaAdicionalesActivosFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AdicionalesActivosFijosConstantesFunciones.getDetalleIndiceBusquedaAdicionalesActivosFijos(idBusquedaAdicionalesActivosFijos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AdicionalesActivosFijosConstantesFunciones.getDetalleIndiceBusquedaAdicionalesActivosFijos(idBusquedaAdicionalesActivosFijos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()==null||adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=adicionalesactivosfijoss==null|| adicionalesactivosfijoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						adicionalesactivosfijossAux=new ArrayList<AdicionalesActivosFijos>();
						adicionalesactivosfijossAux.addAll(adicionalesactivosfijosLogic.getAdicionalesActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							adicionalesactivosfijossAux=new ArrayList<AdicionalesActivosFijos>();
							adicionalesactivosfijossAux.addAll(adicionalesactivosfijoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							adicionalesactivosfijosLogic.getAdicionalesActivosFijossBusquedaAdicionalesActivosFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaAdicionalesActivosFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AdicionalesActivosFijosConstantesFunciones.getDetalleIndiceBusquedaAdicionalesActivosFijos(idBusquedaAdicionalesActivosFijos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AdicionalesActivosFijosConstantesFunciones.getDetalleIndiceBusquedaAdicionalesActivosFijos(idBusquedaAdicionalesActivosFijos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAdicionalesActivosFijoss("BusquedaAdicionalesActivosFijos",adicionalesactivosfijosLogic.getAdicionalesActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAdicionalesActivosFijoss("BusquedaAdicionalesActivosFijos",adicionalesactivosfijoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						adicionalesactivosfijosLogic.setAdicionalesActivosFijoss(new ArrayList<AdicionalesActivosFijos>());
						adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().addAll(adicionalesactivosfijossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							adicionalesactivosfijoss=new ArrayList<AdicionalesActivosFijos>();
							adicionalesactivosfijoss.addAll(adicionalesactivosfijossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAdicionalesActivosFijos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAdicionalesActivosFijos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=adicionalesactivosfijoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=adicionalesactivosfijoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AdicionalesActivosFijos adicionalesactivosfijos) {
		Boolean permite=true;
		
		if(this.adicionalesactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AdicionalesActivosFijosConstantesFunciones.getOrderByListaAdicionalesActivosFijos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AdicionalesActivosFijosConstantesFunciones.getOrderByListaAdicionalesActivosFijos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
				if(adicionalesactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					adicionalesactivosfijosTotales=adicionalesactivosfijos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AdicionalesActivosFijos adicionalesactivosfijos:this.adicionalesactivosfijoss) {
				if(adicionalesactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					adicionalesactivosfijosTotales=adicionalesactivosfijos;
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
			this.adicionalesactivosfijosAux=new AdicionalesActivosFijos();
			this.adicionalesactivosfijosAux.setsType(Constantes2.S_TOTALES);
			this.adicionalesactivosfijosAux.setIsNew(false);
			this.adicionalesactivosfijosAux.setIsChanged(false);
			this.adicionalesactivosfijosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//AdicionalesActivosFijosConstantesFunciones.TotalizarValoresFilaAdicionalesActivosFijos(this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss(),this.adicionalesactivosfijosAux);
				
				//this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().add(this.adicionalesactivosfijosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AdicionalesActivosFijosConstantesFunciones.TotalizarValoresFilaAdicionalesActivosFijos(this.adicionalesactivosfijoss,this.adicionalesactivosfijosAux);
				
				this.adicionalesactivosfijoss.add(this.adicionalesactivosfijosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		adicionalesactivosfijosTotales=new AdicionalesActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().remove(adicionalesactivosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.adicionalesactivosfijoss.remove(adicionalesactivosfijosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		adicionalesactivosfijosTotales=new AdicionalesActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
				if(adicionalesactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					adicionalesactivosfijosTotales=adicionalesactivosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AdicionalesActivosFijosConstantesFunciones.TotalizarValoresFilaAdicionalesActivosFijos(this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss(),adicionalesactivosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AdicionalesActivosFijos adicionalesactivosfijos:this.adicionalesactivosfijoss) {
				if(adicionalesactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					adicionalesactivosfijosTotales=adicionalesactivosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AdicionalesActivosFijosConstantesFunciones.TotalizarValoresFilaAdicionalesActivosFijos(this.adicionalesactivosfijoss,adicionalesactivosfijosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAdicionalesActivosFijossBusquedaAdicionalesActivosFijos()throws Exception {
		try {
			sAccionBusqueda="BusquedaAdicionalesActivosFijos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getAdicionalesActivosFijossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAdicionalesActivosFijossBusquedaAdicionalesActivosFijos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//adicionalesactivosfijosLogic.getAdicionalesActivosFijossBusquedaAdicionalesActivosFijos(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getAdicionalesActivosFijossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//adicionalesactivosfijosLogic.getAdicionalesActivosFijossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosAdicionalesActivosFijos() {
		this.isPermisoTodoAdicionalesActivosFijos=false;
		this.isPermisoNuevoAdicionalesActivosFijos=false;
		this.isPermisoActualizarAdicionalesActivosFijos=false;
		this.isPermisoActualizarOriginalAdicionalesActivosFijos=false;
		this.isPermisoEliminarAdicionalesActivosFijos=false;
		this.isPermisoGuardarCambiosAdicionalesActivosFijos=false;
		this.isPermisoConsultaAdicionalesActivosFijos=true;
		this.isPermisoBusquedaAdicionalesActivosFijos=true;
		this.isPermisoReporteAdicionalesActivosFijos=true;
		this.isPermisoOrdenAdicionalesActivosFijos=false;		
		this.isPermisoPaginacionMedioAdicionalesActivosFijos=false;		
		this.isPermisoPaginacionAltoAdicionalesActivosFijos=false;		
		this.isPermisoPaginacionTodoAdicionalesActivosFijos=false;		
		this.isPermisoCopiarAdicionalesActivosFijos=false;		
		this.isPermisoVerFormAdicionalesActivosFijos=false;		
		this.isPermisoDuplicarAdicionalesActivosFijos=false;
		this.isPermisoOrdenAdicionalesActivosFijos=false;
	}
	
	public void setPermisosUsuarioAdicionalesActivosFijos(Boolean isPermiso) {
		this.isPermisoTodoAdicionalesActivosFijos=isPermiso;
		this.isPermisoNuevoAdicionalesActivosFijos=isPermiso;
		this.isPermisoActualizarAdicionalesActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalAdicionalesActivosFijos=isPermiso;
		this.isPermisoEliminarAdicionalesActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosAdicionalesActivosFijos=isPermiso;
		this.isPermisoConsultaAdicionalesActivosFijos=isPermiso;
		this.isPermisoBusquedaAdicionalesActivosFijos=isPermiso;
		this.isPermisoReporteAdicionalesActivosFijos=isPermiso;
		this.isPermisoOrdenAdicionalesActivosFijos=isPermiso;		
		this.isPermisoPaginacionMedioAdicionalesActivosFijos=isPermiso;		
		this.isPermisoPaginacionAltoAdicionalesActivosFijos=isPermiso;		
		this.isPermisoPaginacionTodoAdicionalesActivosFijos=isPermiso;		
		this.isPermisoCopiarAdicionalesActivosFijos=isPermiso;		
		this.isPermisoVerFormAdicionalesActivosFijos=isPermiso;		
		this.isPermisoDuplicarAdicionalesActivosFijos=isPermiso;
		this.isPermisoOrdenAdicionalesActivosFijos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAdicionalesActivosFijos(Boolean isPermiso) {
		//this.isPermisoTodoAdicionalesActivosFijos=isPermiso;
		this.isPermisoNuevoAdicionalesActivosFijos=isPermiso;
		this.isPermisoActualizarAdicionalesActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalAdicionalesActivosFijos=isPermiso;
		this.isPermisoEliminarAdicionalesActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosAdicionalesActivosFijos=isPermiso;
		//this.isPermisoConsultaAdicionalesActivosFijos=isPermiso;
		//this.isPermisoBusquedaAdicionalesActivosFijos=isPermiso;
		//this.isPermisoReporteAdicionalesActivosFijos=isPermiso;
		//this.isPermisoOrdenAdicionalesActivosFijos=isPermiso;		
		//this.isPermisoPaginacionMedioAdicionalesActivosFijos=isPermiso;		
		//this.isPermisoPaginacionAltoAdicionalesActivosFijos=isPermiso;		
		//this.isPermisoPaginacionTodoAdicionalesActivosFijos=isPermiso;		
		//this.isPermisoCopiarAdicionalesActivosFijos=isPermiso;		
		//this.isPermisoDuplicarAdicionalesActivosFijos=isPermiso;
		//this.isPermisoOrdenAdicionalesActivosFijos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAdicionalesActivosFijosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AdicionalesActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAdicionalesActivosFijos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAdicionalesActivosFijosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAdicionalesActivosFijosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAdicionalesActivosFijosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAdicionalesActivosFijosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAdicionalesActivosFijos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AdicionalesActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AdicionalesActivosFijosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAdicionalesActivosFijos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAdicionalesActivosFijos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAdicionalesActivosFijos=this.isPermisoActualizarAdicionalesActivosFijos;
			this.isPermisoEliminarAdicionalesActivosFijos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAdicionalesActivosFijos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAdicionalesActivosFijos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAdicionalesActivosFijos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAdicionalesActivosFijos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAdicionalesActivosFijos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAdicionalesActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAdicionalesActivosFijos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAdicionalesActivosFijos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAdicionalesActivosFijos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAdicionalesActivosFijos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAdicionalesActivosFijos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAdicionalesActivosFijos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAdicionalesActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAdicionalesActivosFijos.setToolTipText(this.jTableDatosAdicionalesActivosFijos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAdicionalesActivosFijos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAdicionalesActivosFijos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AdicionalesActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AdicionalesActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAdicionalesActivosFijos() throws Exception {
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
	public void inicializarCombosForeignKeyAdicionalesActivosFijosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAdicionalesActivosFijosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AdicionalesActivosFijosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyAdicionalesActivosFijos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.adicionalesactivosfijosSessionBean==null) {
				this.adicionalesactivosfijosSessionBean=new AdicionalesActivosFijosSessionBean();
			}

			if(!this.adicionalesactivosfijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyAdicionalesActivosFijos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAdicionalesActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAdicionalesActivosFijos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAdicionalesActivosFijos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAdicionalesActivosFijos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAdicionalesActivosFijos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAdicionalesActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAdicionalesActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAdicionalesActivosFijos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAdicionalesActivosFijos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAdicionalesActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAdicionalesActivosFijos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.getItemCount()>0) {
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public AdicionalesActivosFijosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AdicionalesActivosFijosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AdicionalesActivosFijosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.adicionalesactivosfijosSessionBean=new AdicionalesActivosFijosSessionBean(); 
		this.adicionalesactivosfijosConstantesFunciones=new AdicionalesActivosFijosConstantesFunciones(); 
		this.adicionalesactivosfijosBean=new AdicionalesActivosFijos();//(this.adicionalesactivosfijosConstantesFunciones); 		
		this.adicionalesactivosfijosReturnGeneral=new AdicionalesActivosFijosParameterReturnGeneral(); 
		
		this.adicionalesactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.adicionalesactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AdicionalesActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AdicionalesActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AdicionalesActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAdicionalesActivosFijos(true);
			
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
			
			this.adicionalesactivosfijosConstantesFunciones=new AdicionalesActivosFijosConstantesFunciones(); 
			this.adicionalesactivosfijosBean=new AdicionalesActivosFijos();//this.adicionalesactivosfijosConstantesFunciones); 			
			this.adicionalesactivosfijosReturnGeneral=new AdicionalesActivosFijosParameterReturnGeneral(); 
		
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Adicionales Activos Fijos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.adicionalesactivosfijos=new AdicionalesActivosFijos();
			this.adicionalesactivosfijoss = new ArrayList<AdicionalesActivosFijos>();
			this.adicionalesactivosfijossAux = new ArrayList<AdicionalesActivosFijos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic=new AdicionalesActivosFijosLogic();
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.adicionalesactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.adicionalesactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAdicionalesActivosFijos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAdicionalesActivosFijos);	
					}
					
					if(this.jInternalFrameImportacionAdicionalesActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAdicionalesActivosFijos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAdicionalesActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAdicionalesActivosFijos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAdicionalesActivosFijos);
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.setVisible(false);
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos);
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setVisible(false);
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAdicionalesActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAdicionalesActivosFijos);
					this.jInternalFrameImportacionAdicionalesActivosFijos.setVisible(false);
					this.jInternalFrameImportacionAdicionalesActivosFijos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAdicionalesActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAdicionalesActivosFijos);
					this.jInternalFrameOrderByAdicionalesActivosFijos.setVisible(false);
					this.jInternalFrameOrderByAdicionalesActivosFijos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAdicionalesActivosFijosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AdicionalesActivosFijosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.adicionalesactivosfijosReturnGeneral=new AdicionalesActivosFijosParameterReturnGeneral();
			
			this.adicionalesactivosfijosParameterGeneral=new AdicionalesActivosFijosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.adicionalesactivosfijosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AdicionalesActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AdicionalesActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AdicionalesActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaDuplicarAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaCopiarAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaVerFormAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaOrdenAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
			
			
			this.isVisibilidadBusquedaAdicionalesActivosFijos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAdicionalesActivosFijos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAdicionalesActivosFijos(false);
			
			this.setPermisosUsuarioAdicionalesActivosFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() 
				|| (this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado() && this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAdicionalesActivosFijosClasesRelacionadas();
			}
			
			if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAdicionalesActivosFijosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAdicionalesActivosFijos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAdicionalesActivosFijos();
			}
			
			if(!this.isPermisoBusquedaAdicionalesActivosFijos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AdicionalesActivosFijosConstantesFunciones.getTiposSeleccionarAdicionalesActivosFijos());
				
				this.tiposColumnasSelect=AdicionalesActivosFijosConstantesFunciones.getTiposSeleccionarAdicionalesActivosFijos(true);
				
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
			//if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAdicionalesActivosFijos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioAdicionalesActivosFijos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioAdicionalesActivosFijos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAdicionalesActivosFijos() ;
			
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
				adicionalesactivosfijosImplementable= (AdicionalesActivosFijosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AdicionalesActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				adicionalesactivosfijosImplementableHome= (AdicionalesActivosFijosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AdicionalesActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.adicionalesactivosfijoss= new ArrayList<AdicionalesActivosFijos>();
			this.adicionalesactivosfijossEliminados= new ArrayList<AdicionalesActivosFijos>();
						
			this.isEsNuevoAdicionalesActivosFijos=false;
			this.esParaAccionDesdeFormularioAdicionalesActivosFijos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAdicionalesActivosFijos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAdicionalesActivosFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AdicionalesActivosFijosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAdicionalesActivosFijos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAdicionalesActivosFijos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAdicionalesActivosFijos();
			}
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAdicionalesActivosFijos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAdicionalesActivosFijos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAdicionalesActivosFijos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAdicionalesActivosFijos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AdicionalesActivosFijos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAdicionalesActivosFijos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAdicionalesActivosFijos")) {
				iIndex=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAdicionalesActivosFijos();	
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
	
	public void cargarCombosForeignKeyAdicionalesActivosFijos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAdicionalesActivosFijos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAdicionalesActivosFijos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAdicionalesActivosFijosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAdicionalesActivosFijos();
		
		this.cargarCombosFrameForeignKeyAdicionalesActivosFijos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAdicionalesActivosFijos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAdicionalesActivosFijos();
		}
	}
	
	
	
	public void jButtonNuevoAdicionalesActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
			
			if(jTableDatosAdicionalesActivosFijos.getRowCount()>=1) {
				jTableDatosAdicionalesActivosFijos.removeRowSelectionInterval(0, jTableDatosAdicionalesActivosFijos.getRowCount()-1);						
			}
			
			this.isEsNuevoAdicionalesActivosFijos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAdicionalesActivosFijos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAdicionalesActivosFijos(true);			
			//this.adicionalesactivosfijos=new AdicionalesActivosFijos();
			//this.adicionalesactivosfijos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos() ;
			
			if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAdicionalesActivosFijos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.adicionalesactivosfijos);	
			this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);				
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
			if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AdicionalesActivosFijos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAdicionalesActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAdicionalesActivosFijos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAdicionalesActivosFijos.getSelectedRows().length;			
			}
			
			adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAdicionalesActivosFijos--;			
				//AdicionalesActivosFijos adicionalesactivosfijosAux= new AdicionalesActivosFijos();			
				//adicionalesactivosfijosAux.setId(this.iIdNuevoAdicionalesActivosFijos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AdicionalesActivosFijos adicionalesactivosfijosOrigen=new AdicionalesActivosFijos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AdicionalesActivosFijos adicionalesactivosfijosOrigen : adicionalesactivosfijossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							adicionalesactivosfijosOrigen =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							adicionalesactivosfijosOrigen =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAdicionalesActivosFijos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.adicionalesactivosfijos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAdicionalesActivosFijos(adicionalesactivosfijosOrigen,this.adicionalesactivosfijos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().add(this.adicionalesactivosfijosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijoss.add(this.adicionalesactivosfijosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
				
				this.jTableDatosAdicionalesActivosFijos.setRowSelectionInterval(this.getIndiceNuevoAdicionalesActivosFijos(), this.getIndiceNuevoAdicionalesActivosFijos());
				
				int iLastRow =  this.jTableDatosAdicionalesActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAdicionalesActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAdicionalesActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();									
		
			AdicionalesActivosFijos adicionalesactivosfijosOrigen=new AdicionalesActivosFijos();
			AdicionalesActivosFijos adicionalesactivosfijosDestino=new AdicionalesActivosFijos();
				
			adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAdicionalesActivosFijos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || adicionalesactivosfijossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAdicionalesActivosFijos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						adicionalesactivosfijosOrigen =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						adicionalesactivosfijosOrigen =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						adicionalesactivosfijosDestino =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						adicionalesactivosfijosDestino =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				adicionalesactivosfijosOrigen =adicionalesactivosfijossSeleccionados.get(0);
				adicionalesactivosfijosDestino =adicionalesactivosfijossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAdicionalesActivosFijos(adicionalesactivosfijosOrigen,adicionalesactivosfijosDestino,true,false);
				
				adicionalesactivosfijosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(adicionalesactivosfijosDestino,adicionalesactivosfijosLogic.getAdicionalesActivosFijoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(adicionalesactivosfijosDestino,adicionalesactivosfijoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
				
				//this.jTableDatosAdicionalesActivosFijos.setRowSelectionInterval(this.getIndiceNuevoAdicionalesActivosFijos(), this.getIndiceNuevoAdicionalesActivosFijos());
				
				int iLastRow =  this.jTableDatosAdicionalesActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAdicionalesActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAdicionalesActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAdicionalesActivosFijos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(!isVisible);
			this.jPanelPaginacionAdicionalesActivosFijos.setVisible(!isVisible);
			this.jPanelAccionesAdicionalesActivosFijos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAdicionalesActivosFijos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAdicionalesActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAdicionalesActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAdicionalesActivosFijos();
			
			this.abrirFrameOrderByAdicionalesActivosFijos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAdicionalesActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAdicionalesActivosFijos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAdicionalesActivosFijos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAdicionalesActivosFijos.isMaximum()) {
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAdicionalesActivosFijos.setSize(this.jInternalFrameDetalleFormAdicionalesActivosFijos.iWidthFormulario,this.jInternalFrameDetalleFormAdicionalesActivosFijos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAdicionalesActivosFijos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAdicionalesActivosFijos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAdicionalesActivosFijos.isMaximum()) {
						this.jInternalFrameDetalleFormAdicionalesActivosFijos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jContentPaneDetalleAdicionalesActivosFijos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jContentPaneDetalleAdicionalesActivosFijos.getWidth(),AdicionalesActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jContentPaneDetalleAdicionalesActivosFijos.getWidth(),AdicionalesActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jContentPaneDetalleAdicionalesActivosFijos.getWidth(),AdicionalesActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAdicionalesActivosFijos.setVisible(true);
	        this.jInternalFrameDetalleFormAdicionalesActivosFijos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAdicionalesActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAdicionalesActivosFijos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAdicionalesActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAdicionalesActivosFijos,false,this);
				} else {
					this.jInternalFrameOrderByAdicionalesActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAdicionalesActivosFijos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAdicionalesActivosFijos);
				this.jInternalFrameOrderByAdicionalesActivosFijos.setVisible(false);
				this.jInternalFrameOrderByAdicionalesActivosFijos.setSelected(false);
				
				this.jInternalFrameOrderByAdicionalesActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAdicionalesActivosFijos"));
				
				this.inicializarActualizarBindingTablaOrderByAdicionalesActivosFijos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAdicionalesActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAdicionalesActivosFijos==null) {
				
				this.jInternalFrameImportacionAdicionalesActivosFijos=new ImportacionJInternalFrame(AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAdicionalesActivosFijos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAdicionalesActivosFijos);
				this.jInternalFrameImportacionAdicionalesActivosFijos.setVisible(false);
				this.jInternalFrameImportacionAdicionalesActivosFijos.setSelected(false);


				this.jInternalFrameImportacionAdicionalesActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAdicionalesActivosFijos"));
				this.jInternalFrameImportacionAdicionalesActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAdicionalesActivosFijos"));
				this.jInternalFrameImportacionAdicionalesActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAdicionalesActivosFijos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAdicionalesActivosFijos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos==null) {
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos=new ReporteDinamicoJInternalFrame(AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAdicionalesActivosFijos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos);
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setVisible(false);
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAdicionalesActivosFijos"));
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAdicionalesActivosFijos"));
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAdicionalesActivosFijos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAdicionalesActivosFijos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAdicionalesActivosFijos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAdicionalesActivosFijos);
			
	       	this.jInternalFrameDetalleFormAdicionalesActivosFijos.setVisible(false);
	        this.jInternalFrameDetalleFormAdicionalesActivosFijos.setSelected(false);
			
			//this.jInternalFrameDetalleFormAdicionalesActivosFijos.dispose();
			//this.jInternalFrameDetalleFormAdicionalesActivosFijos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAdicionalesActivosFijos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setVisible(true);
	        this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAdicionalesActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAdicionalesActivosFijos.setVisible(true);
	        this.jInternalFrameImportacionAdicionalesActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAdicionalesActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAdicionalesActivosFijos.setVisible(true);
	        this.jInternalFrameOrderByAdicionalesActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAdicionalesActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAdicionalesActivosFijos.setVisible(false);
	        this.jInternalFrameOrderByAdicionalesActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAdicionalesActivosFijos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setVisible(false);
	        this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAdicionalesActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAdicionalesActivosFijos.setVisible(false);
	        this.jInternalFrameImportacionAdicionalesActivosFijos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAdicionalesActivosFijos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAdicionalesActivosFijos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAdicionalesActivosFijos(true);
			//this.isEsNuevoAdicionalesActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(false) ;
			
			if(adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAdicionalesActivosFijos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAdicionalesActivosFijosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAdicionalesActivosFijos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAdicionalesActivosFijos(true);
			//this.isEsNuevoAdicionalesActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.adicionalesactivosfijos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(false) ;
			
			if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAdicionalesActivosFijos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAdicionalesActivosFijos(false);
			
			//if(!this.isEsNuevoAdicionalesActivosFijos) {								
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				
			}
			
			if(this.permiteMantenimiento(this.adicionalesactivosfijos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAdicionalesActivosFijos=true;
					this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
					this.isEsNuevoAdicionalesActivosFijos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAdicionalesActivosFijos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAdicionalesActivosFijos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(false);
				
				this.habilitarDeshabilitarControlesAdicionalesActivosFijos(false);
			
												
				
				if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAdicionalesActivosFijos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,adicionalesactivosfijosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAdicionalesActivosFijos(this.adicionalesactivosfijos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAdicionalesActivosFijos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,adicionalesactivosfijosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.adicionalesactivosfijos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.adicionalesactivosfijos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.adicionalesactivosfijos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.adicionalesactivosfijos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AdicionalesActivosFijosModel) this.jTableDatosAdicionalesActivosFijos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAdicionalesActivosFijos=true;
				this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
				this.isEsNuevoAdicionalesActivosFijos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(false);
				
				this.habilitarDeshabilitarControlesAdicionalesActivosFijos(false);
				
				
				
				if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAdicionalesActivosFijos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAdicionalesActivosFijos.getRowCount()>=1) {
				jTableDatosAdicionalesActivosFijos.removeRowSelectionInterval(0, jTableDatosAdicionalesActivosFijos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAdicionalesActivosFijos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(false) ;
			
			this.isEsNuevoAdicionalesActivosFijos=false;
			
			if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAdicionalesActivosFijos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				
				//SI ES MANUAL
				if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAdicionalesActivosFijos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAdicionalesActivosFijos--;			
			//AdicionalesActivosFijos adicionalesactivosfijosAux= new AdicionalesActivosFijos();			
			//adicionalesactivosfijosAux.setId(this.iIdNuevoAdicionalesActivosFijos);
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAdicionalesActivosFijos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
			
			this.adicionalesactivosfijos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().add(this.adicionalesactivosfijosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.adicionalesactivosfijoss.add(this.adicionalesactivosfijosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
			
			this.jTableDatosAdicionalesActivosFijos.setRowSelectionInterval(this.getIndiceNuevoAdicionalesActivosFijos(), this.getIndiceNuevoAdicionalesActivosFijos());
			
			int iLastRow =  this.jTableDatosAdicionalesActivosFijos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAdicionalesActivosFijos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAdicionalesActivosFijos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAdicionalesActivosFijos(false);
			
			//SI ES MANUAL
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAdicionalesActivosFijos();
			}
			
			//this.abrirFrameTreeAdicionalesActivosFijos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAdicionalesActivosFijos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAdicionalesActivosFijos.setFileImportacion(this.jInternalFrameImportacionAdicionalesActivosFijos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAdicionalesActivosFijos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAdicionalesActivosFijos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAdicionalesActivosFijos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAdicionalesActivosFijos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		

		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AdicionalesActivosFijosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AdicionalesActivosFijosBaseDesign.jrxml";
			
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
			
			this.generarReporteAdicionalesActivosFijoss("Todos",adicionalesactivosfijossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
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
	
	public void jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"adicionalesactivosfijos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AdicionalesActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(AdicionalesActivosFijos adicionalesactivosfijos:adicionalesactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(adicionalesactivosfijos.getcosto_de_compra());
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
			//	this.getFilaCabeceraExportarExcelAdicionalesActivosFijos(row);				
			//	iRow++;
			//}				
			
			//for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAdicionalesActivosFijos(adicionalesactivosfijosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
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
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAdicionalesActivosFijos(false);
			
			//SI ES MANUAL
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAdicionalesActivosFijos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAdicionalesActivosFijos(false);
			
			//SI ES MANUAL
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAdicionalesActivosFijos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAdicionalesActivosFijos(false);
			
			//SI ES MANUAL
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAdicionalesActivosFijos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAdicionalesActivosFijos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAdicionalesActivosFijos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAdicionalesActivosFijos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAdicionalesActivosFijos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAdicionalesActivosFijos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAdicionalesActivosFijos.setMinimumSize(dimensionMinimum);
		this.jTableDatosAdicionalesActivosFijos.setMaximumSize(dimensionMaximum);
		this.jTableDatosAdicionalesActivosFijos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAdicionalesActivosFijos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAdicionalesActivosFijos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAdicionalesActivosFijos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAdicionalesActivosFijos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAdicionalesActivosFijos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAdicionalesActivosFijos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAdicionalesActivosFijos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAdicionalesActivosFijos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAdicionalesActivosFijos();
		
		this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAdicionalesActivosFijos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAdicionalesActivosFijos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAdicionalesActivosFijos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAdicionalesActivosFijos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAdicionalesActivosFijos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAdicionalesActivosFijos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jCheckBoxPostAccionNuevoAdicionalesActivosFijos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jCheckBoxPostAccionSinCerrarAdicionalesActivosFijos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jCheckBoxPostAccionSinMensajeAdicionalesActivosFijos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAdicionalesActivosFijos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAdicionalesActivosFijos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.jCheckBoxPostAccionNuevoAdicionalesActivosFijos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.jCheckBoxPostAccionSinCerrarAdicionalesActivosFijos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.jCheckBoxPostAccionSinMensajeAdicionalesActivosFijos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAdicionalesActivosFijos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAdicionalesActivosFijos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAdicionalesActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAdicionalesActivosFijos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAdicionalesActivosFijos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAdicionalesActivosFijos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAdicionalesActivosFijos(Boolean esInicializar) throws Exception {
		try	{	
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAdicionalesActivosFijos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAdicionalesActivosFijos() throws Exception {
		try	{
			if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAdicionalesActivosFijos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAdicionalesActivosFijos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAdicionalesActivosFijos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAdicionalesActivosFijos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAdicionalesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAdicionalesActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAdicionalesActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAdicionalesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAdicionalesActivosFijos.addItem(reporte);
			}
			
			
			if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAdicionalesActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAdicionalesActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAdicionalesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAdicionalesActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAdicionalesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAdicionalesActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAdicionalesActivosFijos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAdicionalesActivosFijos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
				
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AdicionalesActivosFijosConstantesFunciones.getTiposSeleccionarAdicionalesActivosFijos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AdicionalesActivosFijosConstantesFunciones.getTiposSeleccionarAdicionalesActivosFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AdicionalesActivosFijosConstantesFunciones.getTiposSeleccionarAdicionalesActivosFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAdicionalesActivosFijos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaAdicionalesActivosFijos=Long.parseLong(this.jLabelidAdicionalesActivosFijosBusquedaAdicionalesActivosFijos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAdicionalesActivosFijos(Boolean esInicializar) throws Exception {				
		if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAdicionalesActivosFijos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAdicionalesActivosFijos() throws Exception {
		this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAdicionalesActivosFijos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAdicionalesActivosFijosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAdicionalesActivosFijos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=adicionalesactivosfijoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAdicionalesActivosFijos.setModel(new AdicionalesActivosFijosModel(this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAdicionalesActivosFijos.setModel(new AdicionalesActivosFijosModel(this.adicionalesactivosfijoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAdicionalesActivosFijos!=null && this.jInternalFrameOrderByAdicionalesActivosFijos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAdicionalesActivosFijos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO,adicionalesactivosfijosConstantesFunciones.resaltarSeleccionarAdicionalesActivosFijos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AdicionalesActivosFijosConstantesFunciones.SCLASSWEBTITULO,adicionalesactivosfijosConstantesFunciones.resaltarSeleccionarAdicionalesActivosFijos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_ID));

		if(this.adicionalesactivosfijosConstantesFunciones.mostraridAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltaridAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activaridAdicionalesActivosFijos,iSizeTabla,this,true,"idAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltaridAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activaridAdicionalesActivosFijos,this,true,"idAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarcodigo_sub_grupoAdicionalesActivosFijos,iSizeTabla,this,true,"codigo_sub_grupoAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarcodigo_sub_grupoAdicionalesActivosFijos,this,true,"codigo_sub_grupoAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarnombre_sub_grupoAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_sub_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarnombre_sub_grupoAdicionalesActivosFijos,iSizeTabla,this,true,"nombre_sub_grupoAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_sub_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarnombre_sub_grupoAdicionalesActivosFijos,this,true,"nombre_sub_grupoAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarcodigo_detalle_grupoAdicionalesActivosFijos,iSizeTabla,this,true,"codigo_detalle_grupoAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarcodigo_detalle_grupoAdicionalesActivosFijos,this,true,"codigo_detalle_grupoAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarnombre_detalle_grupoAdicionalesActivosFijos,iSizeTabla,this,true,"nombre_detalle_grupoAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarnombre_detalle_grupoAdicionalesActivosFijos,this,true,"nombre_detalle_grupoAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarclaveAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarclaveAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarclaveAdicionalesActivosFijos,iSizeTabla,this,true,"claveAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarclaveAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarclaveAdicionalesActivosFijos,this,true,"claveAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarnombreAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarnombreAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarnombreAdicionalesActivosFijos,iSizeTabla,this,true,"nombreAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarnombreAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarnombreAdicionalesActivosFijos,this,true,"nombreAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarfecha_compraAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarfecha_compraAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarfecha_compraAdicionalesActivosFijos,iSizeTabla,this,true,"fecha_compraAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarfecha_compraAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarfecha_compraAdicionalesActivosFijos,this,true,"fecha_compraAdicionalesActivosFijos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarvida_utilAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarvida_utilAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarvida_utilAdicionalesActivosFijos,iSizeTabla,this,true,"vida_utilAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarvida_utilAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarvida_utilAdicionalesActivosFijos,this,true,"vida_utilAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.adicionalesactivosfijosConstantesFunciones.mostrarcosto_de_compraAdicionalesActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarcosto_de_compraAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarcosto_de_compraAdicionalesActivosFijos,iSizeTabla,this,true,"costo_de_compraAdicionalesActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.adicionalesactivosfijosConstantesFunciones.resaltarcosto_de_compraAdicionalesActivosFijos,this.adicionalesactivosfijosConstantesFunciones.activarcosto_de_compraAdicionalesActivosFijos,this,true,"costo_de_compraAdicionalesActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AdicionalesActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAdicionalesActivosFijos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAdicionalesActivosFijos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAdicionalesActivosFijos.addColumn(tableColumn);
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
			
			this.jTableDatosAdicionalesActivosFijos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAdicionalesActivosFijos.moveColumn(this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAdicionalesActivosFijos.moveColumn(this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAdicionalesActivosFijos.moveColumn(this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAdicionalesActivosFijos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAdicionalesActivosFijos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAdicionalesActivosFijos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAdicionalesActivosFijos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAdicionalesActivosFijos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAdicionalesActivosFijos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=adicionalesactivosfijoss.size()-1;
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
		//this.jTableDatosAdicionalesActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAdicionalesActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAdicionalesActivosFijos();
			
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
				
				//this.isEsNuevoAdicionalesActivosFijos=false;
					
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
				if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAdicionalesActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAdicionalesActivosFijos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.adicionalesactivosfijos.getsType().equals("DUPLICADO")
				   || this.adicionalesactivosfijos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAdicionalesActivosFijos=true;
				
				} else {
					this.isEsNuevoAdicionalesActivosFijos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
					if(this.adicionalesactivosfijos.getId()>=0 && !this.adicionalesactivosfijos.getIsNew()) {						
						this.isEsNuevoAdicionalesActivosFijos=false;
						
					} else {
						this.isEsNuevoAdicionalesActivosFijos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAdicionalesActivosFijos(esRelaciones);						
				
				this.seleccionarAdicionalesActivosFijos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.adicionalesactivosfijos.getId()<0) {
					this.isEsNuevoAdicionalesActivosFijos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAdicionalesActivosFijos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAdicionalesActivosFijos(evt,rowIndex);
				}	
				
				if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AdicionalesActivosFijos: " + this.dDif); 
					}
				}								
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAdicionalesActivosFijos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.adicionalesactivosfijos)) {
					if(this.adicionalesactivosfijos.getId()>0) {
						this.adicionalesactivosfijos.setIsDeleted(true);
						
						this.adicionalesactivosfijossEliminados.add(this.adicionalesactivosfijos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().remove(this.adicionalesactivosfijos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijoss.remove(this.adicionalesactivosfijos);				
					}
					
					
					((AdicionalesActivosFijosModel) this.jTableDatosAdicionalesActivosFijos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAdicionalesActivosFijos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAdicionalesActivosFijos) {
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAdicionalesActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAdicionalesActivosFijos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAdicionalesActivosFijos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAdicionalesActivosFijos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAdicionalesActivosFijos(adicionalesactivosfijos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAdicionalesActivosFijos(adicionalesactivosfijos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAdicionalesActivosFijos(adicionalesactivosfijos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAdicionalesActivosFijos(adicionalesactivosfijos);
	}
	
	public void setVariablesObjetoActualToFormularioAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.setText(adicionalesactivosfijos.getId().toString());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.setText(adicionalesactivosfijos.getclave());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.setText(adicionalesactivosfijos.getnombre());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.setDate(adicionalesactivosfijos.getfecha_compra());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.setText(adicionalesactivosfijos.getvida_util().toString());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.setText(adicionalesactivosfijos.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AdicionalesActivosFijos adicionalesactivosfijosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,adicionalesactivosfijosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AdicionalesActivosFijos adicionalesactivosfijosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				adicionalesactivosfijosLocal=this.adicionalesactivosfijos;
			} else {
				adicionalesactivosfijosLocal=this.adicionalesactivosfijosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(adicionalesactivosfijosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAdicionalesActivosFijos(adicionalesactivosfijosLocal,true);
					
					if(adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(adicionalesactivosfijosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(adicionalesactivosfijosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(adicionalesactivosfijos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(adicionalesactivosfijos);
	}
	
	public void setVariablesFormularioToObjetoActualAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(adicionalesactivosfijos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.getText()==null || this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.getText()=="" || this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.getText()=="Id") {
				this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.setText("0");
			}

			if(conColumnasBase) {adicionalesactivosfijos.setId(Long.parseLong(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelIdAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setcodigo_sub_grupo(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcodigo_sub_grupoAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setnombre_sub_grupo(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombre_sub_grupoAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcodigo_detalle_grupoAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setnombre_detalle_grupo(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombre_detalle_grupoAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setclave(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelclaveAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setnombre(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelnombreAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setfecha_compra(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelfecha_compraAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelvida_utilAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			adicionalesactivosfijos.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelcosto_de_compraAdicionalesActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijosBean,AdicionalesActivosFijos adicionalesactivosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijosOrigen,AdicionalesActivosFijos adicionalesactivosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getId()!=null && !adicionalesactivosfijosOrigen.getId().equals(0L))) {adicionalesactivosfijos.setId(adicionalesactivosfijosOrigen.getId());}}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getcodigo_sub_grupo()!=null && !adicionalesactivosfijosOrigen.getcodigo_sub_grupo().equals(""))) {adicionalesactivosfijos.setcodigo_sub_grupo(adicionalesactivosfijosOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getnombre_sub_grupo()!=null && !adicionalesactivosfijosOrigen.getnombre_sub_grupo().equals(""))) {adicionalesactivosfijos.setnombre_sub_grupo(adicionalesactivosfijosOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getcodigo_detalle_grupo()!=null && !adicionalesactivosfijosOrigen.getcodigo_detalle_grupo().equals(""))) {adicionalesactivosfijos.setcodigo_detalle_grupo(adicionalesactivosfijosOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getnombre_detalle_grupo()!=null && !adicionalesactivosfijosOrigen.getnombre_detalle_grupo().equals(""))) {adicionalesactivosfijos.setnombre_detalle_grupo(adicionalesactivosfijosOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getclave()!=null && !adicionalesactivosfijosOrigen.getclave().equals(""))) {adicionalesactivosfijos.setclave(adicionalesactivosfijosOrigen.getclave());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getnombre()!=null && !adicionalesactivosfijosOrigen.getnombre().equals(""))) {adicionalesactivosfijos.setnombre(adicionalesactivosfijosOrigen.getnombre());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getfecha_compra()!=null && !adicionalesactivosfijosOrigen.getfecha_compra().equals(new Date()))) {adicionalesactivosfijos.setfecha_compra(adicionalesactivosfijosOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getvida_util()!=null && !adicionalesactivosfijosOrigen.getvida_util().equals(0.0))) {adicionalesactivosfijos.setvida_util(adicionalesactivosfijosOrigen.getvida_util());}
			if(conDefault || (!conDefault && adicionalesactivosfijosOrigen.getcosto_de_compra()!=null && !adicionalesactivosfijosOrigen.getcosto_de_compra().equals(0.0))) {adicionalesactivosfijos.setcosto_de_compra(adicionalesactivosfijosOrigen.getcosto_de_compra());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.setText(adicionalesactivosfijos.getId().toString());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.setText(adicionalesactivosfijos.getclave());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.setText(adicionalesactivosfijos.getnombre());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.setDate(adicionalesactivosfijos.getfecha_compra());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.setText(adicionalesactivosfijos.getvida_util().toString());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.setText(adicionalesactivosfijos.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAdicionalesActivosFijos(AdicionalesActivosFijosBean adicionalesactivosfijosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getId().toString());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getclave());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getnombre());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.setDate(adicionalesactivosfijosBean.getfecha_compra());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getvida_util().toString());
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.setText(adicionalesactivosfijosBean.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAdicionalesActivosFijos(AdicionalesActivosFijosParameterReturnGeneral adicionalesactivosfijosReturnGeneral,AdicionalesActivosFijosBean adicionalesactivosfijosBean,Boolean conDefault) throws Exception { 
		try {
			AdicionalesActivosFijos adicionalesactivosfijosLocal=new AdicionalesActivosFijos();
			
			adicionalesactivosfijosLocal=adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getId()!=null && !adicionalesactivosfijosLocal.getId().equals(0L))) {adicionalesactivosfijosBean.setId(adicionalesactivosfijosLocal.getId());}}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getcodigo_sub_grupo()!=null && !adicionalesactivosfijosLocal.getcodigo_sub_grupo().equals(""))) {adicionalesactivosfijosBean.setcodigo_sub_grupo(adicionalesactivosfijosLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getnombre_sub_grupo()!=null && !adicionalesactivosfijosLocal.getnombre_sub_grupo().equals(""))) {adicionalesactivosfijosBean.setnombre_sub_grupo(adicionalesactivosfijosLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getcodigo_detalle_grupo()!=null && !adicionalesactivosfijosLocal.getcodigo_detalle_grupo().equals(""))) {adicionalesactivosfijosBean.setcodigo_detalle_grupo(adicionalesactivosfijosLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getnombre_detalle_grupo()!=null && !adicionalesactivosfijosLocal.getnombre_detalle_grupo().equals(""))) {adicionalesactivosfijosBean.setnombre_detalle_grupo(adicionalesactivosfijosLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getclave()!=null && !adicionalesactivosfijosLocal.getclave().equals(""))) {adicionalesactivosfijosBean.setclave(adicionalesactivosfijosLocal.getclave());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getnombre()!=null && !adicionalesactivosfijosLocal.getnombre().equals(""))) {adicionalesactivosfijosBean.setnombre(adicionalesactivosfijosLocal.getnombre());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getfecha_compra()!=null && !adicionalesactivosfijosLocal.getfecha_compra().equals(new Date()))) {adicionalesactivosfijosBean.setfecha_compra(adicionalesactivosfijosLocal.getfecha_compra());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getvida_util()!=null && !adicionalesactivosfijosLocal.getvida_util().equals(0.0))) {adicionalesactivosfijosBean.setvida_util(adicionalesactivosfijosLocal.getvida_util());}
			if(conDefault || (!conDefault && adicionalesactivosfijosLocal.getcosto_de_compra()!=null && !adicionalesactivosfijosLocal.getcosto_de_compra().equals(0.0))) {adicionalesactivosfijosBean.setcosto_de_compra(adicionalesactivosfijosLocal.getcosto_de_compra());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAdicionalesActivosFijosGenerico(Long idAdicionalesActivosFijosSeleccionado,JComboBox jComboBoxAdicionalesActivosFijos,List<AdicionalesActivosFijos> adicionalesactivosfijossLocal)throws Exception {
		try {
			AdicionalesActivosFijos  adicionalesactivosfijosTemp=null;

			for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijossLocal) {
				if(adicionalesactivosfijosAux.getId()!=null && adicionalesactivosfijosAux.getId().equals(idAdicionalesActivosFijosSeleccionado)) {
					adicionalesactivosfijosTemp=adicionalesactivosfijosAux;
					break;
				}
			}

			jComboBoxAdicionalesActivosFijos.setSelectedItem(adicionalesactivosfijosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAdicionalesActivosFijosGenerico(JComboBox jComboBoxAdicionalesActivosFijos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAdicionalesActivosFijos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAdicionalesActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAdicionalesActivosFijos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAdicionalesActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAdicionalesActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAdicionalesActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			adicionalesactivosfijos=(AdicionalesActivosFijos) adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			adicionalesactivosfijos =(AdicionalesActivosFijos) adicionalesactivosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!adicionalesactivosfijos.getIsNew() && !adicionalesactivosfijos.getIsChanged() && !adicionalesactivosfijos.getIsDeleted()) {
				sDescripcion=adicionalesactivosfijos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=adicionalesactivosfijos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AdicionalesActivosFijos adicionalesactivosfijosRow=new AdicionalesActivosFijos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			adicionalesactivosfijosRow=(AdicionalesActivosFijos) adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			adicionalesactivosfijosRow=(AdicionalesActivosFijos) adicionalesactivosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos));			
			this.jButtonDuplicarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarAdicionalesActivosFijos && this.isPermisoDuplicarAdicionalesActivosFijos));			
			this.jButtonCopiarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaCopiarAdicionalesActivosFijos && this.isPermisoCopiarAdicionalesActivosFijos));
			this.jButtonVerFormAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaVerFormAdicionalesActivosFijos && this.isPermisoVerFormAdicionalesActivosFijos));
			
			this.jButtonAbrirOrderByAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaOrdenAdicionalesActivosFijos && this.isPermisoOrdenAdicionalesActivosFijos));			
			
			this.jButtonNuevoRelacionesAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos));			
			this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaModificarAdicionalesActivosFijos && this.isPermisoActualizarAdicionalesActivosFijos));	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaActualizarAdicionalesActivosFijos && this.isPermisoActualizarAdicionalesActivosFijos));	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaEliminarAdicionalesActivosFijos && this.isPermisoEliminarAdicionalesActivosFijos));
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarAdicionalesActivosFijos.setVisible(this.isVisibilidadCeldaCancelarAdicionalesActivosFijos);							
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaGuardarAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));			
			
			}
						
			this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos));						
			this.jButtonDuplicarToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarAdicionalesActivosFijos && this.isPermisoDuplicarAdicionalesActivosFijos));						
			this.jButtonCopiarToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaCopiarAdicionalesActivosFijos && this.isPermisoCopiarAdicionalesActivosFijos));			
			this.jButtonVerFormToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaVerFormAdicionalesActivosFijos && this.isPermisoVerFormAdicionalesActivosFijos));			
			this.jButtonAbrirOrderByToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaOrdenAdicionalesActivosFijos && this.isPermisoOrdenAdicionalesActivosFijos));
			this.jButtonNuevoRelacionesToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos));			
			this.jButtonNuevoGuardarCambiosToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));			
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaModificarAdicionalesActivosFijos && this.isPermisoActualizarAdicionalesActivosFijos));	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaActualizarAdicionalesActivosFijos  && this.isPermisoActualizarAdicionalesActivosFijos));	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaEliminarAdicionalesActivosFijos && this.isPermisoEliminarAdicionalesActivosFijos));
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarToolBarAdicionalesActivosFijos.setVisible(this.isVisibilidadCeldaCancelarAdicionalesActivosFijos);				
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaGuardarAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos));			
			this.jMenuItemDuplicarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarAdicionalesActivosFijos && this.isPermisoDuplicarAdicionalesActivosFijos));			
			this.jMenuItemCopiarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaCopiarAdicionalesActivosFijos && this.isPermisoCopiarAdicionalesActivosFijos));			
			this.jMenuItemVerFormAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaVerFormAdicionalesActivosFijos && this.isPermisoVerFormAdicionalesActivosFijos));			
			this.jMenuItemAbrirOrderByAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaOrdenAdicionalesActivosFijos && this.isPermisoOrdenAdicionalesActivosFijos));			
			//this.jMenuItemMostrarOcultarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaOrdenAdicionalesActivosFijos && this.isPermisoOrdenAdicionalesActivosFijos));
			this.jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaOrdenAdicionalesActivosFijos && this.isPermisoOrdenAdicionalesActivosFijos));			
			//this.jMenuItemDetalleMostrarOcultarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaOrdenAdicionalesActivosFijos && this.isPermisoOrdenAdicionalesActivosFijos));			
			this.jMenuItemNuevoRelacionesAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos));			
			this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaNuevoAdicionalesActivosFijos && this.isPermisoNuevoAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));									
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemModificarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaModificarAdicionalesActivosFijos && this.isPermisoActualizarAdicionalesActivosFijos));	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemActualizarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaActualizarAdicionalesActivosFijos && this.isPermisoActualizarAdicionalesActivosFijos));	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemEliminarAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaEliminarAdicionalesActivosFijos && this.isPermisoEliminarAdicionalesActivosFijos));
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemCancelarAdicionalesActivosFijos.setVisible(this.isVisibilidadCeldaCancelarAdicionalesActivosFijos);				
			}
			
			this.jMenuItemGuardarCambiosAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaGuardarAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));						
			this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=this.jButtonNuevoAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaDuplicarAdicionalesActivosFijos=this.jButtonDuplicarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaCopiarAdicionalesActivosFijos=this.jButtonCopiarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaVerFormAdicionalesActivosFijos=this.jButtonVerFormAdicionalesActivosFijos.isVisible();
			
			this.isVisibilidadCeldaOrdenAdicionalesActivosFijos=this.jButtonAbrirOrderByAdicionalesActivosFijos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=this.jButtonNuevoRelacionesAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=this.jButtonModificarAdicionalesActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=this.jButtonNuevoToolBarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=this.jButtonNuevoRelacionesToolBarAdicionalesActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarToolBarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarToolBarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarToolBarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarToolBarAdicionalesActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=this.jButtonGuardarCambiosToolBarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=this.jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=this.jMenuItemNuevoAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=this.jMenuItemNuevoRelacionesAdicionalesActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemModificarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemActualizarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemEliminarAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemCancelarAdicionalesActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=this.jMenuItemGuardarCambiosAdicionalesActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAdicionalesActivosFijos(Boolean esInicializar) {
		if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
				//if(this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAdicionalesActivosFijos();
			}
			
			this.inicializarActualizarBindingBotonesManualAdicionalesActivosFijos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAdicionalesActivosFijos() {
		this.jButtonNuevoAdicionalesActivosFijos.setVisible(this.isPermisoNuevoAdicionalesActivosFijos);			
		this.jButtonDuplicarAdicionalesActivosFijos.setVisible(this.isPermisoDuplicarAdicionalesActivosFijos);			
		this.jButtonCopiarAdicionalesActivosFijos.setVisible(this.isPermisoCopiarAdicionalesActivosFijos);			
		this.jButtonVerFormAdicionalesActivosFijos.setVisible(this.isPermisoVerFormAdicionalesActivosFijos);			
		
		this.jButtonAbrirOrderByAdicionalesActivosFijos.setVisible(this.isPermisoOrdenAdicionalesActivosFijos);					
		
		this.jButtonNuevoRelacionesAdicionalesActivosFijos.setVisible(this.isPermisoNuevoAdicionalesActivosFijos);			
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarAdicionalesActivosFijos.setVisible(this.isPermisoActualizarAdicionalesActivosFijos);	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarAdicionalesActivosFijos.setVisible(this.isPermisoActualizarAdicionalesActivosFijos);	
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarAdicionalesActivosFijos.setVisible(this.isPermisoEliminarAdicionalesActivosFijos);
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarAdicionalesActivosFijos.setVisible(this.isVisibilidadCeldaCancelarAdicionalesActivosFijos);						
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.setVisible(this.isPermisoGuardarCambiosAdicionalesActivosFijos);							
		}
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.setVisible(this.isPermisoActualizarAdicionalesActivosFijos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAdicionalesActivosFijos() {
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarAdicionalesActivosFijos.setVisible(this.isPermisoActualizarAdicionalesActivosFijos);	
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarAdicionalesActivosFijos.setVisible(this.isPermisoActualizarAdicionalesActivosFijos);	
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarAdicionalesActivosFijos.setVisible(this.isPermisoEliminarAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarAdicionalesActivosFijos.setVisible(this.isVisibilidadCeldaCancelarAdicionalesActivosFijos);							
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.setVisible((this.isVisibilidadCeldaGuardarAdicionalesActivosFijos && this.isPermisoGuardarCambiosAdicionalesActivosFijos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAdicionalesActivosFijos() {
		if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAdicionalesActivosFijos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAdicionalesActivosFijos() {
	}
	
	public void jTableDatosAdicionalesActivosFijosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAdicionalesActivosFijos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.adicionalesactivosfijos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAdicionalesActivosFijosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAdicionalesActivosFijos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAdicionalesActivosFijos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAdicionalesActivosFijos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.adicionalesactivosfijosLogic.getConnexion());

				if(this.adicionalesactivosfijos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.adicionalesactivosfijos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAdicionalesActivosFijos=(TitledBorder)this.jScrollPanelDatosAdicionalesActivosFijos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAdicionalesActivosFijos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.adicionalesactivosfijos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.adicionalesactivosfijos.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.adicionalesactivosfijos.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.adicionalesactivosfijos.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.adicionalesactivosfijos.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.adicionalesactivosfijos.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.adicionalesactivosfijos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.adicionalesactivosfijos.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.adicionalesactivosfijos.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraAdicionalesActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.getadicionalesactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.adicionalesactivosfijos==null) {
						this.adicionalesactivosfijos = new AdicionalesActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);
				}

				if(this.adicionalesactivosfijos.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.adicionalesactivosfijos.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAdicionalesActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);

			this.getAdicionalesActivosFijossBusquedaAdicionalesActivosFijos();

			this.inicializarActualizarBindingAdicionalesActivosFijos(false);

			//if(AdicionalesActivosFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaAdicionalesActivosFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);

			this.getAdicionalesActivosFijossFK_IdEmpresa();

			this.inicializarActualizarBindingAdicionalesActivosFijos(false);

			//if(AdicionalesActivosFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.adicionalesactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAdicionalesActivosFijos() {
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.setVisible(false);	    			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.dispose();
			this.jInternalFrameDetalleFormAdicionalesActivosFijos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
			this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.dispose();
			this.jInternalFrameReporteDinamicoAdicionalesActivosFijos=null;
		}
		
		if(this.jInternalFrameImportacionAdicionalesActivosFijos!=null) {
			this.jInternalFrameImportacionAdicionalesActivosFijos.setVisible(false);	    			
			this.jInternalFrameImportacionAdicionalesActivosFijos.dispose();
			this.jInternalFrameImportacionAdicionalesActivosFijos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAdicionalesActivosFijos();
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
			
			if(sTipo.equals("NuevoAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAdicionalesActivosFijos")) {
				jButtonDuplicarAdicionalesActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAdicionalesActivosFijos")) {
				jButtonCopiarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormAdicionalesActivosFijos")) {
				jButtonVerFormAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAdicionalesActivosFijos")) {
				jButtonDuplicarAdicionalesActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAdicionalesActivosFijos")) {
				jButtonDuplicarAdicionalesActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAdicionalesActivosFijos")) {
				jButtonModificarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAdicionalesActivosFijos")) {
				jButtonModificarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAdicionalesActivosFijos")) {
				jButtonModificarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAdicionalesActivosFijos")) {
				jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAdicionalesActivosFijos")) {
				jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAdicionalesActivosFijos")) {
				jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarAdicionalesActivosFijos")) {
				jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAdicionalesActivosFijos")) {
				jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAdicionalesActivosFijos")) {
				jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarAdicionalesActivosFijos")) {
				jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAdicionalesActivosFijos")) {
				jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAdicionalesActivosFijos")) {
				jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarAdicionalesActivosFijos")) {
				jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAdicionalesActivosFijos")) {
				jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAdicionalesActivosFijos")) {
				jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAdicionalesActivosFijos")) {
				jButtonMostrarOcultarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAdicionalesActivosFijos")) {
				jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAdicionalesActivosFijos")) {
				jButtonCopiarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAdicionalesActivosFijos")) {
				jButtonVerFormAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAdicionalesActivosFijos")) {
				jButtonCopiarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAdicionalesActivosFijos")) {
				jButtonVerFormAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAdicionalesActivosFijos")) {
				jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAdicionalesActivosFijos")) {
				jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAdicionalesActivosFijos")) {
				jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAdicionalesActivosFijos")) {
				jButtonAnterioresAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAdicionalesActivosFijos")) {
				jButtonAnterioresAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAdicionalesActivosFijos")) {
				jButtonAnterioresAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAdicionalesActivosFijos")) {
				jButtonSiguientesAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAdicionalesActivosFijos")) {
				jButtonSiguientesAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAdicionalesActivosFijos")) {
				jButtonSiguientesAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAdicionalesActivosFijos") || sTipo.equals("MenuItemDetalleAbrirOrderByAdicionalesActivosFijos")) {
				jButtonAbrirOrderByAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAdicionalesActivosFijos") || sTipo.equals("MenuItemDetalleMostrarOcultarAdicionalesActivosFijos")) {
				jButtonMostrarOcultarAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAdicionalesActivosFijos")) {
				jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAdicionalesActivosFijos")) {
				jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAdicionalesActivosFijos")) {
				jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAdicionalesActivosFijos")) {
				jButtonCerrarReporteDinamicoAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAdicionalesActivosFijos")) {
				jButtonGenerarReporteDinamicoAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAdicionalesActivosFijos")) {
				
				jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAdicionalesActivosFijos")) {
				jButtonCerrarImportacionAdicionalesActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAdicionalesActivosFijos")) {
				
				jButtonGenerarImportacionAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAdicionalesActivosFijos")) {
				
				jButtonAbrirImportacionAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAdicionalesActivosFijos")) {
				jComboBoxTiposAccionesAdicionalesActivosFijosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAdicionalesActivosFijos")) {
				jComboBoxTiposRelacionesAdicionalesActivosFijosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAdicionalesActivosFijos")) {
				jComboBoxTiposAccionesAdicionalesActivosFijosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAdicionalesActivosFijos")) {
				
				jComboBoxTiposSeleccionarAdicionalesActivosFijosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAdicionalesActivosFijos")) {
				jTextFieldValorCampoGeneralAdicionalesActivosFijosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAdicionalesActivosFijos")) {
				jButtonAbrirOrderByAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAdicionalesActivosFijos")) {
				jButtonAbrirOrderByAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAdicionalesActivosFijos")) {
				jButtonCerrarOrderByAdicionalesActivosFijosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAdicionalesActivosFijosBusqueda")) {
				this.jButtonidAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAdicionalesActivosFijosUpdate")) {
				this.jButtonid_empresaAdicionalesActivosFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAdicionalesActivosFijosBusqueda")) {
				this.jButtonid_empresaAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveAdicionalesActivosFijosBusqueda")) {
				this.jButtonclaveAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAdicionalesActivosFijosBusqueda")) {
				this.jButtonnombreAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraAdicionalesActivosFijosBusqueda")) {
				this.jButtonfecha_compraAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilAdicionalesActivosFijosBusqueda")) {
				this.jButtonvida_utilAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraAdicionalesActivosFijosBusqueda")) {
				this.jButtoncosto_de_compraAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaAdicionalesActivosFijosAdicionalesActivosFijos")) {
				this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijosActionPerformed(evt);
			}
			
			;
			
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAdicionalesActivosFijos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AdicionalesActivosFijos adicionalesactivosfijosLocal=null;
			
			if(!this.getEsControlTabla()) {
				adicionalesactivosfijosLocal=this.adicionalesactivosfijos;
			} else {
				adicionalesactivosfijosLocal=this.adicionalesactivosfijosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
							
				
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
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
			
			


			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAdicionalesActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
								
						
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
								
				
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
							
				
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
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
			
			


			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
								
				
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAdicionalesActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAdicionalesActivosFijos")) {
					jCheckBoxSeleccionarTodosAdicionalesActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAdicionalesActivosFijos")) {
					jCheckBoxSeleccionadosAdicionalesActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAdicionalesActivosFijos")) {
					
				}
				
				


				
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
												
				
				


				
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAdicionalesActivosFijosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
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
			
			


			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.adicionalesactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.adicionalesactivosfijos);
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
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
				
				


				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AdicionalesActivosFijos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AdicionalesActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAdicionalesActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.adicionalesactivosfijosAnterior =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAdicionalesActivosFijos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAdicionalesActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAdicionalesActivosFijos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.adicionalesactivosfijos =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.adicionalesactivosfijos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAdicionalesActivosFijos")) {
				
				}
				
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAdicionalesActivosFijos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAdicionalesActivosFijos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAdicionalesActivosFijos")) {
			
			}
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAdicionalesActivosFijos();
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
			if(sTipo.equals("NuevoAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAdicionalesActivosFijos")) {
				jButtonDuplicarAdicionalesActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAdicionalesActivosFijos")) {
				jButtonCopiarAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAdicionalesActivosFijos")) {
				jButtonVerFormAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAdicionalesActivosFijos")) {
				jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAdicionalesActivosFijos")) {
				jButtonModificarAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAdicionalesActivosFijos")) {
				jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAdicionalesActivosFijos")) {
				jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAdicionalesActivosFijos")) {
				jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAdicionalesActivosFijos")) {
				jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAdicionalesActivosFijos")) {
				jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAdicionalesActivosFijos")) {
				jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAdicionalesActivosFijos")) {
				jButtonAbrirOrderByAdicionalesActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAdicionalesActivosFijos")) {
				jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAdicionalesActivosFijos")) {
				jButtonAnterioresAdicionalesActivosFijosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAdicionalesActivosFijos")) {
				jButtonSiguientesAdicionalesActivosFijosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAdicionalesActivosFijosBusqueda")) {
				this.jButtonidAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAdicionalesActivosFijosUpdate")) {
				this.jButtonid_empresaAdicionalesActivosFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAdicionalesActivosFijosBusqueda")) {
				this.jButtonid_empresaAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtonnombre_sub_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoAdicionalesActivosFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveAdicionalesActivosFijosBusqueda")) {
				this.jButtonclaveAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAdicionalesActivosFijosBusqueda")) {
				this.jButtonnombreAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraAdicionalesActivosFijosBusqueda")) {
				this.jButtonfecha_compraAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilAdicionalesActivosFijosBusqueda")) {
				this.jButtonvida_utilAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraAdicionalesActivosFijosBusqueda")) {
				this.jButtoncosto_de_compraAdicionalesActivosFijosBusquedaActionPerformed(evt);
			}
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAdicionalesActivosFijos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAdicionalesActivosFijos")) {
				closingInternalFrameAdicionalesActivosFijos();
				
			} else if(sTipo.equals("jButtonCancelarAdicionalesActivosFijos")) {
				JInternalFrameBase jInternalFrameDetalleFormAdicionalesActivosFijos = (JInternalFrameBase)evt.getSource();
	            	
	            AdicionalesActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(AdicionalesActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormAdicionalesActivosFijos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAdicionalesActivosFijosActionPerformed(null);
			}
			
			AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.adicionalesactivosfijos,new Object(),this.adicionalesactivosfijosParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAdicionalesActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAdicionalesActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAdicionalesActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.adicionalesactivosfijos)) {
			if(!esControlTabla) {
				if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);			
				}
				
				if(this.adicionalesactivosfijosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral,this.adicionalesactivosfijosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.adicionalesactivosfijosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAdicionalesActivosFijos(classes,this.adicionalesactivosfijosReturnGeneral,this.adicionalesactivosfijosBean,false);
					}
						
					if(this.adicionalesactivosfijosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos());	
					}
						
					if(this.adicionalesactivosfijosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAdicionalesActivosFijos(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos(),classes);//this.adicionalesactivosfijosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAdicionalesActivosFijos(this.adicionalesactivosfijos,classes);//this.adicionalesactivosfijosBean);									
				}
			
				if(AdicionalesActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAdicionalesActivosFijos(this.adicionalesactivosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAdicionalesActivosFijos(this.adicionalesactivosfijos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.adicionalesactivosfijosAnterior!=null) {
						this.adicionalesactivosfijos=this.adicionalesactivosfijosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.adicionalesactivosfijosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos(),adicionalesactivosfijosLogic.getAdicionalesActivosFijoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijos(),this.adicionalesactivosfijoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAdicionalesActivosFijos.repaint();
				
				//((AbstractTableModel) this.jTableDatosAdicionalesActivosFijos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAdicionalesActivosFijos();
			}
		}
	}
	
	public void actualizarVisualTableDatosAdicionalesActivosFijos() throws Exception {
		
		AdicionalesActivosFijosModel adicionalesactivosfijosModel=(AdicionalesActivosFijosModel)this.jTableDatosAdicionalesActivosFijos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			adicionalesactivosfijosModel.adicionalesactivosfijoss=this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			adicionalesactivosfijosModel.adicionalesactivosfijoss=this.adicionalesactivosfijoss;
		}
		
		
		((AdicionalesActivosFijosModel) this.jTableDatosAdicionalesActivosFijos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAdicionalesActivosFijos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getadicionalesactivosfijosAnterior(),this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getadicionalesactivosfijosAnterior(),this.adicionalesactivosfijoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAdicionalesActivosFijos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
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
										
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.adicionalesactivosfijos,new Object(),generalEntityParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AdicionalesActivosFijosConstantesFunciones.getClassesRelationshipsOfAdicionalesActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AdicionalesActivosFijosConstantesFunciones.getClassesRelationshipsFromStringsOfAdicionalesActivosFijos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAdicionalesActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.adicionalesactivosfijos,new Object(),generalEntityParameterGeneral,this.adicionalesactivosfijosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAdicionalesActivosFijos(AdicionalesActivosFijosBean adicionalesactivosfijosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAdicionalesActivosFijos(ArrayList<Classe> classes,AdicionalesActivosFijosReturnGeneral adicionalesactivosfijosReturnGeneral,AdicionalesActivosFijosBean adicionalesactivosfijosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.adicionalesactivosfijos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos = new AdicionalesActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.adicionalesactivosfijosSessionBean.getConGuardarRelaciones(),this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.setVisible(false);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.setSelected(false);						
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.adicionalesactivosfijosLogic=this.adicionalesactivosfijosLogic;
		
		this.cargarCombosFrameForeignKeyAdicionalesActivosFijos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAdicionalesActivosFijos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAdicionalesActivosFijos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAdicionalesActivosFijos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAdicionalesActivosFijos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAdicionalesActivosFijos"));
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarAdicionalesActivosFijos"));

		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarToolBarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarAdicionalesActivosFijos"));
					
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemModificarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarAdicionalesActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarAdicionalesActivosFijos"));
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarToolBarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAdicionalesActivosFijos"));
						
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemActualizarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAdicionalesActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarAdicionalesActivosFijos"));
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarAdicionalesActivosFijos"));
								
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemEliminarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAdicionalesActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarAdicionalesActivosFijos"));
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarAdicionalesActivosFijos"));
					
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemCancelarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAdicionalesActivosFijos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemDetalleCerrarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAdicionalesActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAdicionalesActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAdicionalesActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAdicionalesActivosFijos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonidAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idAdicionalesActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonid_empresaAdicionalesActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAdicionalesActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonid_empresaAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonclaveAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombreAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonfecha_compraAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonvida_utilAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraAdicionalesActivosFijosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAdicionalesActivosFijos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAdicionalesActivosFijos"));
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAdicionalesActivosFijos"));
		}
		
		this.jTableDatosAdicionalesActivosFijos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAdicionalesActivosFijos"));
		
		this.jTableDatosAdicionalesActivosFijos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAdicionalesActivosFijos"));
		
		this.jButtonNuevoAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoAdicionalesActivosFijos"));
		
		this.jButtonDuplicarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarAdicionalesActivosFijos"));
		
		this.jButtonCopiarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"CopiarAdicionalesActivosFijos"));
		
		this.jButtonVerFormAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"VerFormAdicionalesActivosFijos"));
		
		
		this.jButtonNuevoToolBarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoToolBarAdicionalesActivosFijos"));
			
		this.jButtonDuplicarToolBarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAdicionalesActivosFijos"));
			
		this.jMenuItemNuevoAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAdicionalesActivosFijos"));
			
		this.jMenuItemDuplicarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAdicionalesActivosFijos"));		
		
		
		this.jButtonNuevoRelacionesAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAdicionalesActivosFijos"));
		
		
		this.jButtonNuevoRelacionesToolBarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAdicionalesActivosFijos"));
			
		this.jMenuItemNuevoRelacionesAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAdicionalesActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarAdicionalesActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonModificarToolBarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarAdicionalesActivosFijos"));
			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemModificarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarAdicionalesActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarAdicionalesActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonActualizarToolBarAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAdicionalesActivosFijos"));
				
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemActualizarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAdicionalesActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarAdicionalesActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonEliminarToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarAdicionalesActivosFijos"));
						
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemEliminarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAdicionalesActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarAdicionalesActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonCancelarToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarAdicionalesActivosFijos"));
			
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemCancelarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAdicionalesActivosFijos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAdicionalesActivosFijos"));		
		
		
		this.jButtonCerrarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarAdicionalesActivosFijos"));
		
		
		this.jButtonCerrarToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarToolBarAdicionalesActivosFijos"));
			
		this.jMenuItemCerrarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAdicionalesActivosFijos"));
			
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jMenuItemDetalleCerrarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAdicionalesActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosAdicionalesActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAdicionalesActivosFijos"));
		}
		
		this.jButtonCopiarToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CopiarToolBarAdicionalesActivosFijos"));
			
		this.jButtonVerFormToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"VerFormToolBarAdicionalesActivosFijos"));
		
		this.jMenuItemGuardarCambiosAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAdicionalesActivosFijos"));
			
		this.jMenuItemCopiarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAdicionalesActivosFijos"));		
		
		this.jMenuItemVerFormAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAdicionalesActivosFijos"));		
		
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAdicionalesActivosFijos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAdicionalesActivosFijos"));
			
		this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAdicionalesActivosFijos"));		
		
		
		
		this.jButtonRecargarInformacionAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionAdicionalesActivosFijos"));
					
		this.jButtonRecargarInformacionToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAdicionalesActivosFijos"));
		
		this.jMenuItemRecargarInformacionAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAdicionalesActivosFijos"));		
		
		
		
		this.jButtonAnterioresAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresAdicionalesActivosFijos"));
		
		
		this.jButtonAnterioresToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAdicionalesActivosFijos"));
		
		this.jMenuItemAnterioresAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAdicionalesActivosFijos"));		
		
		
		this.jButtonSiguientesAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesAdicionalesActivosFijos"));
		
		
		this.jButtonSiguientesToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAdicionalesActivosFijos"));
			
		this.jMenuItemSiguientesAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAdicionalesActivosFijos"));
			
		this.jMenuItemAbrirOrderByAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAdicionalesActivosFijos"));
			
		this.jMenuItemMostrarOcultarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAdicionalesActivosFijos"));
			
		this.jMenuItemDetalleAbrirOrderByAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAdicionalesActivosFijos"));
			
		this.jMenuItemDetalleMostarOcultarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAdicionalesActivosFijos"));		
		
		
		this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAdicionalesActivosFijos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAdicionalesActivosFijos"));
			
		this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAdicionalesActivosFijos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAdicionalesActivosFijos"));

		this.jCheckBoxSeleccionadosAdicionalesActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAdicionalesActivosFijos"));
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAdicionalesActivosFijos"));
		}
		
		
		this.jComboBoxTiposRelacionesAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"TiposRelacionesAdicionalesActivosFijos"));
			
		this.jComboBoxTiposAccionesAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesAdicionalesActivosFijos"));
					
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAdicionalesActivosFijos"));
			
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAdicionalesActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonidAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idAdicionalesActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonid_empresaAdicionalesActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAdicionalesActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonid_empresaAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonclaveAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombreAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonfecha_compraAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonvida_utilAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraAdicionalesActivosFijosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"BusquedaAdicionalesActivosFijosAdicionalesActivosFijos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAdicionalesActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAdicionalesActivosFijos"));
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAdicionalesActivosFijos"));
				this.jInternalFrameReporteDinamicoAdicionalesActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAdicionalesActivosFijos"));
			}
			
			//this.jButtonCerrarReporteDinamicoAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAdicionalesActivosFijos"));				
			//this.jButtonGenerarReporteDinamicoAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAdicionalesActivosFijos"));
			//this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAdicionalesActivosFijos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAdicionalesActivosFijos!=null) {
				this.jInternalFrameImportacionAdicionalesActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAdicionalesActivosFijos"));
				this.jInternalFrameImportacionAdicionalesActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAdicionalesActivosFijos"));
				this.jInternalFrameImportacionAdicionalesActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAdicionalesActivosFijos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByAdicionalesActivosFijos"));
			
			this.jButtonAbrirOrderByToolBarAdicionalesActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAdicionalesActivosFijos"));			
			
			if(this.jInternalFrameOrderByAdicionalesActivosFijos!=null) {
				this.jInternalFrameOrderByAdicionalesActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAdicionalesActivosFijos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTabbedPaneRelacionesAdicionalesActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAdicionalesActivosFijos"));
		
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
            		closingInternalFrameAdicionalesActivosFijos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAdicionalesActivosFijos = (JInternalFrameBase)event.getSource();
	            	
	            AdicionalesActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(AdicionalesActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormAdicionalesActivosFijos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAdicionalesActivosFijosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAdicionalesActivosFijos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAdicionalesActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAdicionalesActivosFijos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAdicionalesActivosFijos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAdicionalesActivosFijos";
		inputMap = this.jButtonNuevoAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAdicionalesActivosFijos";
		inputMap = this.jButtonNuevoRelacionesAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAdicionalesActivosFijosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAdicionalesActivosFijos";
		inputMap = this.jButtonModificarAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAdicionalesActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAdicionalesActivosFijos";
		inputMap = this.jButtonActualizarAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAdicionalesActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAdicionalesActivosFijos";
		inputMap = this.jButtonEliminarAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAdicionalesActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAdicionalesActivosFijos";
		inputMap = this.jButtonCancelarAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAdicionalesActivosFijos";
		inputMap = this.jButtonCerrarAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAdicionalesActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAdicionalesActivosFijos";
		inputMap = this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonGuardarCambiosAdicionalesActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAdicionalesActivosFijos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAdicionalesActivosFijosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAdicionalesActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAdicionalesActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAdicionalesActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAdicionalesActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAdicionalesActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonidAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idAdicionalesActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonid_empresaAdicionalesActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAdicionalesActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonid_empresaAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncodigo_sub_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombre_sub_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncodigo_detalle_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombre_detalle_grupoAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonclaveAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonnombreAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonfecha_compraAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtonvida_utilAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilAdicionalesActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jButtoncosto_de_compraAdicionalesActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraAdicionalesActivosFijosBusqueda"));
		
		
		this.jButtonBusquedaAdicionalesActivosFijosAdicionalesActivosFijos.addActionListener(new ButtonActionListener(this,"BusquedaAdicionalesActivosFijosAdicionalesActivosFijos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAdicionalesActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAdicionalesActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAdicionalesActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAdicionalesActivosFijos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAdicionalesActivosFijos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
					adicionalesactivosfijosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijoss) {
					adicionalesactivosfijosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAdicionalesActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
						adicionalesactivosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijoss) {
						adicionalesactivosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAdicionalesActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAdicionalesActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAdicionalesActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAdicionalesActivosFijos.getSelectedRows();
			
			AdicionalesActivosFijos adicionalesactivosfijosLocal=new AdicionalesActivosFijos();
			
			//this.seleccionarTodosAdicionalesActivosFijos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					adicionalesactivosfijosLocal =(AdicionalesActivosFijos) this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss().toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					adicionalesactivosfijosLocal =(AdicionalesActivosFijos) this.adicionalesactivosfijoss.toArray()[this.jTableDatosAdicionalesActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				adicionalesactivosfijosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
						adicionalesactivosfijosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijoss) {
						adicionalesactivosfijosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAdicionalesActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAdicionalesActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAdicionalesActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAdicionalesActivosFijosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAdicionalesActivosFijosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAdicionalesActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAdicionalesActivosFijos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
				
						if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							adicionalesactivosfijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							adicionalesactivosfijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							adicionalesactivosfijosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							adicionalesactivosfijosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							adicionalesactivosfijosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijoss) {
					
						if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							adicionalesactivosfijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							adicionalesactivosfijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							adicionalesactivosfijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							adicionalesactivosfijosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							adicionalesactivosfijosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							adicionalesactivosfijosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAdicionalesActivosFijosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAdicionalesActivosFijos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAdicionalesActivosFijos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAdicionalesActivosFijos) {				
					conSplash=true;//false;										
					
					//this.startProcessAdicionalesActivosFijos(conSplash);
				
					this.generarReporteAdicionalesActivosFijossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAdicionalesActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAdicionalesActivosFijossSeleccionados(false);
				//this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAdicionalesActivosFijossSeleccionados(true);
				//this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAdicionalesActivosFijos();
				
				this.exportarAdicionalesActivosFijossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAdicionalesActivosFijoss();
				//this.importarAdicionalesActivosFijoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAdicionalesActivosFijos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAdicionalesActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Adicionales Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAdicionalesActivosFijos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAdicionalesActivosFijos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAdicionalesActivosFijos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setSelectedIndex(0);					
				}	
			} 			
			else if(AdicionalesActivosFijosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAdicionalesActivosFijos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAdicionalesActivosFijos(conSplash);
					
						//this.actualizarParametrosGeneralAdicionalesActivosFijos();
						
						this.generarReporteProcesoAccionAdicionalesActivosFijossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Adicionales Activos FijosES SELECCIONADOS?", "MANTENIMIENTO DE Adicionales Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAdicionalesActivosFijos();
				
						this.actualizarParametrosGeneralAdicionalesActivosFijos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.adicionalesactivosfijosReturnGeneral=adicionalesactivosfijosLogic.procesarAccionAdicionalesActivosFijossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss(),this.adicionalesactivosfijosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAdicionalesActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAdicionalesActivosFijos();
					
					AdicionalesActivosFijosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAdicionalesActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAdicionalesActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxTiposAccionesFormularioAdicionalesActivosFijos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAdicionalesActivosFijos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAdicionalesActivosFijosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAdicionalesActivosFijos();
			
			if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
			AdicionalesActivosFijos adicionalesactivosfijos=new AdicionalesActivosFijos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAdicionalesActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAdicionalesActivosFijos.getSelectedItem();
			
			
			
			
			adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
			//this.sTipoAccion;
			
			if(adicionalesactivosfijossSeleccionados.size()==1) {
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijossSeleccionados) {
					adicionalesactivosfijos=adicionalesactivosfijosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAdicionalesActivosFijos();
			
      		//this.finishProcessAdicionalesActivosFijos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAdicionalesActivosFijosReturnGeneral() throws Exception {
		if(this.adicionalesactivosfijosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.adicionalesactivosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.adicionalesactivosfijosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.adicionalesactivosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.adicionalesactivosfijosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.adicionalesactivosfijosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAdicionalesActivosFijos(false);
		}
		
		if(this.adicionalesactivosfijosReturnGeneral.getConRetornoLista() || this.adicionalesactivosfijosReturnGeneral.getConRetornoObjeto()) {
			if(this.adicionalesactivosfijosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.adicionalesactivosfijosLogic.setAdicionalesActivosFijoss(this.adicionalesactivosfijosReturnGeneral.getAdicionalesActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingAdicionalesActivosFijos(false);
		}
	}
	
	public void actualizarParametrosGeneralAdicionalesActivosFijos() throws Exception {
		
		
	}
	
	public ArrayList<AdicionalesActivosFijos> getAdicionalesActivosFijossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAdicionalesActivosFijos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijosLogic.getAdicionalesActivosFijoss()) {
					if(adicionalesactivosfijosAux.getIsSelected()) {
						adicionalesactivosfijossSeleccionados.add(adicionalesactivosfijosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AdicionalesActivosFijos adicionalesactivosfijosAux:this.adicionalesactivosfijoss) {
					if(adicionalesactivosfijosAux.getIsSelected()) {
						adicionalesactivosfijossSeleccionados.add(adicionalesactivosfijosAux);				
					}
				}
			}
			
			if(adicionalesactivosfijossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						adicionalesactivosfijossSeleccionados.addAll(this.adicionalesactivosfijosLogic.getAdicionalesActivosFijoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						adicionalesactivosfijossSeleccionados.addAll(this.adicionalesactivosfijoss);				
					}
				}
			}
		} else {
			adicionalesactivosfijossSeleccionados.add(this.adicionalesactivosfijos);
		}
		
		return adicionalesactivosfijossSeleccionados;
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
	
	public void generarReporteAdicionalesActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAdicionalesActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAdicionalesActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAdicionalesActivosFijossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAdicionalesActivosFijossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Adicionales Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAdicionalesActivosFijossSeleccionados() throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAdicionalesActivosFijoss("Todos",adicionalesactivosfijossSeleccionados);
		
	}	
	
	public void generarReporteNormalAdicionalesActivosFijossSeleccionados() throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAdicionalesActivosFijoss("Todos",adicionalesactivosfijossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAdicionalesActivosFijossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAdicionalesActivosFijoss("Todos",adicionalesactivosfijossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAdicionalesActivosFijossSeleccionados() throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAdicionalesActivosFijos();
		
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAdicionalesActivosFijos();
		
		
		//this.generarReporteAdicionalesActivosFijoss("Todos",adicionalesactivosfijossSeleccionados ,adicionalesactivosfijosImplementable,adicionalesactivosfijosImplementableHome);
	}
	
	public void mostrarImportacionAdicionalesActivosFijoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAdicionalesActivosFijos();
		
		this.abrirFrameImportacionAdicionalesActivosFijos();		
		
			
		//this.generarReporteAdicionalesActivosFijoss("Todos",adicionalesactivosfijossSeleccionados ,adicionalesactivosfijosImplementable,adicionalesactivosfijosImplementableHome);
	}
	
	public void importarAdicionalesActivosFijoss() throws Exception {		
	
	}
	
	public void exportarAdicionalesActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAdicionalesActivosFijossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAdicionalesActivosFijossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAdicionalesActivosFijossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Adicionales Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAdicionalesActivosFijossSeleccionados() throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"adicionalesactivosfijos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAdicionalesActivosFijos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAdicionalesActivosFijos(adicionalesactivosfijosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//adicionalesactivosfijosAux.setsDetalleGeneralEntityReporte(adicionalesactivosfijosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAdicionalesActivosFijos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=adicionalesactivosfijos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=adicionalesactivosfijos.getcosto_de_compra().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAdicionalesActivosFijossSeleccionados() throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"adicionalesactivosfijos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AdicionalesActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAdicionalesActivosFijos(row);				
				iRow++;
			}				
			
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAdicionalesActivosFijos(adicionalesactivosfijosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAdicionalesActivosFijossSeleccionados() throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();		
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"adicionalesactivosfijos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("adicionalesactivosfijoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("adicionalesactivosfijos");
			//elementRoot.appendChild(element);
		
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijossSeleccionados) {
				element = document.createElement("adicionalesactivosfijos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAdicionalesActivosFijos(adicionalesactivosfijosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Adicionales Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAdicionalesActivosFijos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(AdicionalesActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(adicionalesactivosfijos.getcosto_de_compra());				
	}
	
	public void setFilaDatosExportarXmlAdicionalesActivosFijos(AdicionalesActivosFijos adicionalesactivosfijos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AdicionalesActivosFijosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(adicionalesactivosfijos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AdicionalesActivosFijosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(adicionalesactivosfijos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AdicionalesActivosFijosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(adicionalesactivosfijos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo_sub_grupo = document.createElement(AdicionalesActivosFijosConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(adicionalesactivosfijos.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(AdicionalesActivosFijosConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(adicionalesactivosfijos.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(AdicionalesActivosFijosConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(adicionalesactivosfijos.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(AdicionalesActivosFijosConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(adicionalesactivosfijos.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(AdicionalesActivosFijosConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(adicionalesactivosfijos.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(AdicionalesActivosFijosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(adicionalesactivosfijos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(AdicionalesActivosFijosConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(adicionalesactivosfijos.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(AdicionalesActivosFijosConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(adicionalesactivosfijos.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(AdicionalesActivosFijosConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(adicionalesactivosfijos.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);
	}
	
	public void generarReporteGroupGenericoAdicionalesActivosFijossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados=new ArrayList<AdicionalesActivosFijos>();
		
		adicionalesactivosfijossSeleccionados=this.getAdicionalesActivosFijossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAdicionalesActivosFijos(adicionalesactivosfijossSeleccionados);
		
		this.generarReporteAdicionalesActivosFijoss("Todos",adicionalesactivosfijossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAdicionalesActivosFijos(ArrayList<AdicionalesActivosFijos> adicionalesactivosfijossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AdicionalesActivosFijos adicionalesactivosfijosAux:adicionalesactivosfijossSeleccionados) {
				adicionalesactivosfijosAux.setsDetalleGeneralEntityReporte(adicionalesactivosfijosAux.toString());
			
				if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(adicionalesactivosfijosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(adicionalesactivosfijosAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(adicionalesactivosfijosAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(adicionalesactivosfijosAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(adicionalesactivosfijosAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(adicionalesactivosfijosAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(adicionalesactivosfijosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(AdicionalesActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					adicionalesactivosfijosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(adicionalesactivosfijosAux.getfecha_compra()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AdicionalesActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAdicionalesActivosFijos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=true;
				this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=true;
				this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=true;
			}
			
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaModificarAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AdicionalesActivosFijosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=true;
		} else {
			this.actualizarEstadoPanelsAdicionalesActivosFijos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAdicionalesActivosFijos=false;
			//this.isVisibilidadCeldaVerFormAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaDuplicarAdicionalesActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
		} else {
			this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(!adicionalesactivosfijosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;												
			}
			
			this.jButtonCerrarAdicionalesActivosFijos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
		}
		
		if(!this.permiteMantenimiento(this.adicionalesactivosfijos)) {
			this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
			this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoAdicionalesActivosFijos=false;
		this.isVisibilidadCeldaNuevoRelacionesAdicionalesActivosFijos=false;
		this.isVisibilidadCeldaGuardarCambiosAdicionalesActivosFijos=false;
		//this.isVisibilidadCeldaModificarAdicionalesActivosFijos=true;
		this.isVisibilidadCeldaActualizarAdicionalesActivosFijos=false;
		this.isVisibilidadCeldaEliminarAdicionalesActivosFijos=false;
		//this.isVisibilidadCeldaCancelarAdicionalesActivosFijos=true;			
		this.isVisibilidadCeldaGuardarAdicionalesActivosFijos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAdicionalesActivosFijos() {
	}
	
	public void actualizarEstadoPanelsAdicionalesActivosFijos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAdicionalesActivosFijos!=null) {
				this.jPanelPaginacionAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosAdicionalesActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionAdicionalesActivosFijos!=null) {
				this.jPanelPaginacionAdicionalesActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosAdicionalesActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionAdicionalesActivosFijos!=null) {
				this.jPanelPaginacionAdicionalesActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosAdicionalesActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionAdicionalesActivosFijos!=null) {
				this.jPanelPaginacionAdicionalesActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAdicionalesActivosFijos!=null) {
				this.jPanelPaginacionAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAdicionalesActivosFijos!=null) {
				this.jPanelPaginacionAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosEdicionAdicionalesActivosFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAdicionalesActivosFijos!=null) {
				this.jScrollPanelDatosAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionAdicionalesActivosFijos!=null) {
				this.jPanelPaginacionAdicionalesActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
					this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.adicionalesactivosfijosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAdicionalesActivosFijos!=null) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAdicionalesActivosFijos!=null) {
				this.jPanelParametrosReportesAdicionalesActivosFijos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaAdicionalesActivosFijos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaAdicionalesActivosFijos) {this.jTabbedPaneBusquedasAdicionalesActivosFijos.remove(jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);}
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
			
			this.inicializarActualizarBindingTablaAdicionalesActivosFijos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAdicionalesActivosFijos() {
		this.updateBorderResaltarBusquedasFormularioAdicionalesActivosFijos();
		this.updateVisibilidadBusquedasFormularioAdicionalesActivosFijos();
		this.updateHabilitarBusquedasFormularioAdicionalesActivosFijos();
	}
	
	public void updateBorderResaltarBusquedasFormularioAdicionalesActivosFijos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAdicionalesActivosFijos.getComponents().length>0) {
	

		if(this.adicionalesactivosfijosConstantesFunciones.resaltarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos!=null) {
			index= this.jTabbedPaneBusquedasAdicionalesActivosFijos.indexOfComponent(this.jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAdicionalesActivosFijos.getComponent(index);
				jPanel.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAdicionalesActivosFijos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAdicionalesActivosFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAdicionalesActivosFijos.indexOfComponent(this.jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAdicionalesActivosFijos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
			if(!this.adicionalesactivosfijosConstantesFunciones.mostrarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos && index>-1) {
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAdicionalesActivosFijos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAdicionalesActivosFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAdicionalesActivosFijos.indexOfComponent(this.jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAdicionalesActivosFijos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
				this.jTabbedPaneBusquedasAdicionalesActivosFijos.setEnabledAt(index,this.adicionalesactivosfijosConstantesFunciones.activarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAdicionalesActivosFijos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaAdicionalesActivosFijos")) {
			index= this.jTabbedPaneBusquedasAdicionalesActivosFijos.indexOfComponent(this.jPanelBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);

			this.jTabbedPaneBusquedasAdicionalesActivosFijos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAdicionalesActivosFijos.getComponent(index);

			this.adicionalesactivosfijosConstantesFunciones.setResaltarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos(resaltar);

			jPanel.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarBusquedaAdicionalesActivosFijosAdicionalesActivosFijos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAdicionalesActivosFijos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAdicionalesActivosFijos() throws Exception {

		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAdicionalesActivosFijos();
		this.updateVisibilidadResaltarControlesFormularioAdicionalesActivosFijos();
		this.updateHabilitarResaltarControlesFormularioAdicionalesActivosFijos();
		
	}
	
	public void updateBorderResaltarControlesFormularioAdicionalesActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.adicionalesactivosfijosConstantesFunciones.resaltaridAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltaridAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarid_empresaAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarid_empresaAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_sub_grupoAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_sub_grupoAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarclaveAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarclaveAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarnombreAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarnombreAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarfecha_compraAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarfecha_compraAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarvida_utilAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarvida_utilAdicionalesActivosFijos);}
		if(this.adicionalesactivosfijosConstantesFunciones.resaltarcosto_de_compraAdicionalesActivosFijos!=null && this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.setBorder(this.adicionalesactivosfijosConstantesFunciones.resaltarcosto_de_compraAdicionalesActivosFijos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAdicionalesActivosFijos() throws Exception {		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
	
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostraridAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelidAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostraridAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarid_empresaAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelid_empresaAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarid_empresaAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelcodigo_sub_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarnombre_sub_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelnombre_sub_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarnombre_sub_grupoAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelcodigo_detalle_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelnombre_detalle_grupoAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarclaveAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelclaveAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarclaveAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarnombreAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelnombreAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarnombreAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarfecha_compraAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelfecha_compraAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarfecha_compraAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarvida_utilAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelvida_utilAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarvida_utilAdicionalesActivosFijos);
		//this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarcosto_de_compraAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jPanelcosto_de_compraAdicionalesActivosFijos.setVisible(this.adicionalesactivosfijosConstantesFunciones.mostrarcosto_de_compraAdicionalesActivosFijos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAdicionalesActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAdicionalesActivosFijos!=null) {
	
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jLabelidAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activaridAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jComboBoxid_empresaAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarid_empresaAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_sub_grupoAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarcodigo_sub_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_sub_grupoAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarnombre_sub_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcodigo_detalle_grupoAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarcodigo_detalle_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombre_detalle_grupoAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarnombre_detalle_grupoAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldclaveAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarclaveAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextAreanombreAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarnombreAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jDateChooserfecha_compraAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarfecha_compraAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldvida_utilAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarvida_utilAdicionalesActivosFijos);
		this.jInternalFrameDetalleFormAdicionalesActivosFijos.jTextFieldcosto_de_compraAdicionalesActivosFijos.setEnabled(this.adicionalesactivosfijosConstantesFunciones.activarcosto_de_compraAdicionalesActivosFijos);
		}
	}
	
		
}