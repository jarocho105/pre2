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

//import com.bydan.erp.activosfijos.util.MantenimientoeActivoFijosConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.MantenimientoeActivoFijosParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.MantenimientoeActivoFijosParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.MantenimientoeActivoFijosBean;
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
public class MantenimientoeActivoFijosBeanSwingJInternalFrame extends MantenimientoeActivoFijosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MantenimientoeActivoFijosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MantenimientoeActivoFijos> mantenimientoeactivofijosValidator = new ClassValidator<MantenimientoeActivoFijos>(MantenimientoeActivoFijos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MantenimientoeActivoFijos mantenimientoeactivofijos;	
	public MantenimientoeActivoFijos mantenimientoeactivofijosAux;
	public MantenimientoeActivoFijos mantenimientoeactivofijosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MantenimientoeActivoFijos mantenimientoeactivofijosTotales;
	public Long idMantenimientoeActivoFijosActual;
	public Long iIdNuevoMantenimientoeActivoFijos=0L;
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
	
	public Boolean isPermisoTodoMantenimientoeActivoFijos;
	public Boolean isPermisoNuevoMantenimientoeActivoFijos;
	public Boolean isPermisoActualizarMantenimientoeActivoFijos;
	public Boolean isPermisoActualizarOriginalMantenimientoeActivoFijos;
	public Boolean isPermisoEliminarMantenimientoeActivoFijos;
	public Boolean isPermisoGuardarCambiosMantenimientoeActivoFijos;
	public Boolean isPermisoConsultaMantenimientoeActivoFijos;
	public Boolean isPermisoBusquedaMantenimientoeActivoFijos;
	public Boolean isPermisoReporteMantenimientoeActivoFijos;
	public Boolean isPermisoPaginacionMedioMantenimientoeActivoFijos;
	public Boolean isPermisoPaginacionAltoMantenimientoeActivoFijos;
	public Boolean isPermisoPaginacionTodoMantenimientoeActivoFijos;
	public Boolean isPermisoCopiarMantenimientoeActivoFijos;
	public Boolean isPermisoVerFormMantenimientoeActivoFijos;
	public Boolean isPermisoDuplicarMantenimientoeActivoFijos;
	public Boolean isPermisoOrdenMantenimientoeActivoFijos;
	
	
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
	
	public MantenimientoeActivoFijosParameterReturnGeneral mantenimientoeactivofijosReturnGeneral;
	public MantenimientoeActivoFijosParameterReturnGeneral mantenimientoeactivofijosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMantenimientoeActivoFijos=false;
	public Boolean esParaAccionDesdeFormularioMantenimientoeActivoFijos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MantenimientoeActivoFijosSessionBeanAdditional mantenimientoeactivofijosSessionBeanAdditional=null;
	
	public MantenimientoeActivoFijosSessionBeanAdditional getMantenimientoeActivoFijosSessionBeanAdditional() {
		return this.mantenimientoeactivofijosSessionBeanAdditional;
	}
	
	public void setMantenimientoeActivoFijosSessionBeanAdditional(MantenimientoeActivoFijosSessionBeanAdditional mantenimientoeactivofijosSessionBeanAdditional) {
		try {
			this.mantenimientoeactivofijosSessionBeanAdditional=mantenimientoeactivofijosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional mantenimientoeactivofijosBeanSwingJInternalFrameAdditional=null;
	//public class MantenimientoeActivoFijosBeanSwingJInternalFrame
	
	public MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional getMantenimientoeActivoFijosBeanSwingJInternalFrameAdditional() {
		return this.mantenimientoeactivofijosBeanSwingJInternalFrameAdditional;
	}
	
	public void setMantenimientoeActivoFijosBeanSwingJInternalFrameAdditional(MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional mantenimientoeactivofijosBeanSwingJInternalFrameAdditional) {
		try {
			this.mantenimientoeactivofijosBeanSwingJInternalFrameAdditional=mantenimientoeactivofijosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MantenimientoeActivoFijosLogic mantenimientoeactivofijosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MantenimientoeActivoFijos mantenimientoeactivofijosBean;
	public MantenimientoeActivoFijosConstantesFunciones mantenimientoeactivofijosConstantesFunciones;
	//public MantenimientoeActivoFijosParameterReturnGeneral mantenimientoeactivofijosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<MantenimientoeActivoFijos> mantenimientoeactivofijoss;	
	//public List<MantenimientoeActivoFijos> mantenimientoeactivofijossEliminados;
	//public List<MantenimientoeActivoFijos> mantenimientoeactivofijossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
	public Boolean isVisibilidadCeldaDuplicarMantenimientoeActivoFijos=true;
	public Boolean isVisibilidadCeldaCopiarMantenimientoeActivoFijos=true;
	public Boolean isVisibilidadCeldaVerFormMantenimientoeActivoFijos=true;
	public Boolean isVisibilidadCeldaOrdenMantenimientoeActivoFijos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
	public Boolean isVisibilidadCeldaModificarMantenimientoeActivoFijos=false;
	public Boolean isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
	public Boolean isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
	public Boolean isVisibilidadCeldaCancelarMantenimientoeActivoFijos=false;
	public Boolean isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;	
	
	
	public Boolean isVisibilidadBusquedaMantenimientoeActivoFijos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoMantenimientoeActivoFijos() {
		return this.iIdNuevoMantenimientoeActivoFijos;
	}

	public void setiIdNuevoMantenimientoeActivoFijos(Long iIdNuevoMantenimientoeActivoFijos) {
		this.iIdNuevoMantenimientoeActivoFijos = iIdNuevoMantenimientoeActivoFijos;
	}
	
	public Long getidMantenimientoeActivoFijosActual() {
		return this.idMantenimientoeActivoFijosActual;
	}

	public void setidMantenimientoeActivoFijosActual(Long idMantenimientoeActivoFijosActual) {
		this.idMantenimientoeActivoFijosActual = idMantenimientoeActivoFijosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MantenimientoeActivoFijos getmantenimientoeactivofijos() {
		return this.mantenimientoeactivofijos;
	}

	public void setmantenimientoeactivofijos(MantenimientoeActivoFijos mantenimientoeactivofijos) {
		this.mantenimientoeactivofijos = mantenimientoeactivofijos;
	}
	
	public MantenimientoeActivoFijos getmantenimientoeactivofijosAux() {
		return this.mantenimientoeactivofijosAux;
	}

	public void setmantenimientoeactivofijosAux(MantenimientoeActivoFijos mantenimientoeactivofijosAux) {
		this.mantenimientoeactivofijosAux = mantenimientoeactivofijosAux;
	}				
	
	public MantenimientoeActivoFijos getmantenimientoeactivofijosAnterior() {
		return this.mantenimientoeactivofijosAnterior;
	}

	public void setmantenimientoeactivofijosAnterior(MantenimientoeActivoFijos mantenimientoeactivofijosAnterior) {
		this.mantenimientoeactivofijosAnterior = mantenimientoeactivofijosAnterior;
	}	
	
	public MantenimientoeActivoFijos getmantenimientoeactivofijosTotales() {
		return this.mantenimientoeactivofijosTotales;
	}

	public void setmantenimientoeactivofijosTotales(MantenimientoeActivoFijos mantenimientoeactivofijosTotales) {
		this.mantenimientoeactivofijosTotales = mantenimientoeactivofijosTotales;
	}	
	
	public MantenimientoeActivoFijos getmantenimientoeactivofijosBean() {
		return this.mantenimientoeactivofijosBean;
	}

	public void setmantenimientoeactivofijosBean(MantenimientoeActivoFijos mantenimientoeactivofijosBean) {
		this.mantenimientoeactivofijosBean = mantenimientoeactivofijosBean;
	}	
	
	public MantenimientoeActivoFijosParameterReturnGeneral getmantenimientoeactivofijosReturnGeneral() {
		return this.mantenimientoeactivofijosReturnGeneral;
	}

	public void setmantenimientoeactivofijosReturnGeneral(MantenimientoeActivoFijosParameterReturnGeneral mantenimientoeactivofijosReturnGeneral) {
		this.mantenimientoeactivofijosReturnGeneral = mantenimientoeactivofijosReturnGeneral;
	}	
	
	
	public Long idBusquedaMantenimientoeActivoFijos=0L;

	public Long getidBusquedaMantenimientoeActivoFijos() {
		return this.idBusquedaMantenimientoeActivoFijos;
	}

	public void setidBusquedaMantenimientoeActivoFijos(Long idBusquedaMantenimientoeActivoFijos) {
		this.idBusquedaMantenimientoeActivoFijos = idBusquedaMantenimientoeActivoFijos;
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
	
	
	public MantenimientoeActivoFijosLogic getMantenimientoeActivoFijosLogic()	{		
		return mantenimientoeactivofijosLogic;
	}

	public void setMantenimientoeActivoFijosLogic(MantenimientoeActivoFijosLogic mantenimientoeactivofijosLogic) {
		this.mantenimientoeactivofijosLogic = mantenimientoeactivofijosLogic;
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
	
	public Boolean getIsEsNuevoMantenimientoeActivoFijos() {
		return isEsNuevoMantenimientoeActivoFijos;
	}

	public void setIsEsNuevoMantenimientoeActivoFijos(Boolean isEsNuevoMantenimientoeActivoFijos) {
		this.isEsNuevoMantenimientoeActivoFijos = isEsNuevoMantenimientoeActivoFijos;
	}

	public Boolean getEsParaAccionDesdeFormularioMantenimientoeActivoFijos() {
		return esParaAccionDesdeFormularioMantenimientoeActivoFijos;
	}
	
	public void setEsParaAccionDesdeFormularioMantenimientoeActivoFijos(Boolean esParaAccionDesdeFormularioMantenimientoeActivoFijos) {
		this.esParaAccionDesdeFormularioMantenimientoeActivoFijos = esParaAccionDesdeFormularioMantenimientoeActivoFijos;
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

			if(this.mantenimientoeactivofijosSessionBean==null) {
				this.mantenimientoeactivofijosSessionBean=new MantenimientoeActivoFijosSessionBean();
			}

			if(!this.mantenimientoeactivofijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(mantenimientoeactivofijosSessionBean.getlidEmpresaActual());
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

					if(this.mantenimientoeactivofijos!=null) {
						this.mantenimientoeactivofijos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
						this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMantenimientoeActivoFijos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
						if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.getItemCount()>0) {
							this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMantenimientoeActivoFijosGenerico)throws Exception
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
				jComboBoxid_empresaMantenimientoeActivoFijosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMantenimientoeActivoFijosGenerico!=null && jComboBoxid_empresaMantenimientoeActivoFijosGenerico.getItemCount()>0) {
					jComboBoxid_empresaMantenimientoeActivoFijosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MantenimientoeActivoFijos mantenimientoeactivofijos,JComboBox jComboBoxid_empresaMantenimientoeActivoFijosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMantenimientoeActivoFijosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMantenimientoeActivoFijosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				mantenimientoeactivofijos.setid_empresa(empresaAux.getId());
				mantenimientoeactivofijos.setempresa_descripcion(MantenimientoeActivoFijosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				mantenimientoeactivofijos.setEmpresa(empresaAux);			}
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

					if(!MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { 
							this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { 
					}

					if(!MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
							this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
							this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesMantenimientoeActivoFijos() throws Exception {
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
		
	public MantenimientoeActivoFijosParameterReturnGeneral getMantenimientoeActivoFijosParameterGeneral() {
		return this.mantenimientoeactivofijosParameterGeneral;
	}
	
	public void setMantenimientoeActivoFijosParameterGeneral(MantenimientoeActivoFijosParameterReturnGeneral mantenimientoeactivofijosParameterGeneral) {
		this.mantenimientoeactivofijosParameterGeneral = mantenimientoeactivofijosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMantenimientoeActivoFijos() {
		return isPermisoTodoMantenimientoeActivoFijos;
	}

	public void setIsPermisoTodoMantenimientoeActivoFijos(Boolean isPermisoTodoMantenimientoeActivoFijos) {
		this.isPermisoTodoMantenimientoeActivoFijos = isPermisoTodoMantenimientoeActivoFijos;
	}

	public Boolean getIsPermisoNuevoMantenimientoeActivoFijos() {
		return isPermisoNuevoMantenimientoeActivoFijos;
	}

	public void setIsPermisoNuevoMantenimientoeActivoFijos(Boolean isPermisoNuevoMantenimientoeActivoFijos) {
		this.isPermisoNuevoMantenimientoeActivoFijos = isPermisoNuevoMantenimientoeActivoFijos;
	}

	public Boolean getIsPermisoActualizarMantenimientoeActivoFijos() {
		return isPermisoActualizarMantenimientoeActivoFijos;
	}

	public void setIsPermisoActualizarMantenimientoeActivoFijos(Boolean isPermisoActualizarMantenimientoeActivoFijos) {
		this.isPermisoActualizarMantenimientoeActivoFijos = isPermisoActualizarMantenimientoeActivoFijos;
	}

	public Boolean getIsPermisoEliminarMantenimientoeActivoFijos() {
		return isPermisoEliminarMantenimientoeActivoFijos;
	}

	public void setIsPermisoEliminarMantenimientoeActivoFijos(Boolean isPermisoEliminarMantenimientoeActivoFijos) {
		this.isPermisoEliminarMantenimientoeActivoFijos = isPermisoEliminarMantenimientoeActivoFijos;
	}

	public Boolean getIsPermisoGuardarCambiosMantenimientoeActivoFijos() {
		return isPermisoGuardarCambiosMantenimientoeActivoFijos;
	}

	public void setIsPermisoGuardarCambiosMantenimientoeActivoFijos(Boolean isPermisoGuardarCambiosMantenimientoeActivoFijos) {
		this.isPermisoGuardarCambiosMantenimientoeActivoFijos = isPermisoGuardarCambiosMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoConsultaMantenimientoeActivoFijos() {
		return isPermisoConsultaMantenimientoeActivoFijos;
	}

	public void setIsPermisoConsultaMantenimientoeActivoFijos(Boolean isPermisoConsultaMantenimientoeActivoFijos) {
		this.isPermisoConsultaMantenimientoeActivoFijos = isPermisoConsultaMantenimientoeActivoFijos;
	}

	public Boolean getIsPermisoBusquedaMantenimientoeActivoFijos() {
		return isPermisoBusquedaMantenimientoeActivoFijos;
	}

	public void setIsPermisoBusquedaMantenimientoeActivoFijos(Boolean isPermisoBusquedaMantenimientoeActivoFijos) {
		this.isPermisoBusquedaMantenimientoeActivoFijos = isPermisoBusquedaMantenimientoeActivoFijos;
	}

	public Boolean getIsPermisoReporteMantenimientoeActivoFijos() {
		return isPermisoReporteMantenimientoeActivoFijos;
	}

	public void setIsPermisoReporteMantenimientoeActivoFijos(Boolean isPermisoReporteMantenimientoeActivoFijos) {
		this.isPermisoReporteMantenimientoeActivoFijos = isPermisoReporteMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoPaginacionMedioMantenimientoeActivoFijos() {
		return isPermisoPaginacionMedioMantenimientoeActivoFijos;
	}

	public void setIsPermisoPaginacionMedioMantenimientoeActivoFijos(Boolean isPermisoPaginacionMedioMantenimientoeActivoFijos) {
		this.isPermisoPaginacionMedioMantenimientoeActivoFijos = isPermisoPaginacionMedioMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoPaginacionTodoMantenimientoeActivoFijos() {
		return isPermisoPaginacionTodoMantenimientoeActivoFijos;
	}

	public void setIsPermisoPaginacionTodoMantenimientoeActivoFijos(Boolean isPermisoPaginacionTodoMantenimientoeActivoFijos) {
		this.isPermisoPaginacionTodoMantenimientoeActivoFijos = isPermisoPaginacionTodoMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoPaginacionAltoMantenimientoeActivoFijos() {
		return isPermisoPaginacionAltoMantenimientoeActivoFijos;
	}

	public void setIsPermisoPaginacionAltoMantenimientoeActivoFijos(Boolean isPermisoPaginacionAltoMantenimientoeActivoFijos) {
		this.isPermisoPaginacionAltoMantenimientoeActivoFijos = isPermisoPaginacionAltoMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoCopiarMantenimientoeActivoFijos() {
		return isPermisoCopiarMantenimientoeActivoFijos;
	}

	public void setIsPermisoCopiarMantenimientoeActivoFijos(Boolean isPermisoCopiarMantenimientoeActivoFijos) {
		this.isPermisoCopiarMantenimientoeActivoFijos = isPermisoCopiarMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoVerFormMantenimientoeActivoFijos() {
		return isPermisoVerFormMantenimientoeActivoFijos;
	}

	public void setIsPermisoVerFormMantenimientoeActivoFijos(Boolean isPermisoVerFormMantenimientoeActivoFijos) {
		this.isPermisoVerFormMantenimientoeActivoFijos = isPermisoVerFormMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoDuplicarMantenimientoeActivoFijos() {
		return isPermisoDuplicarMantenimientoeActivoFijos;
	}

	public void setIsPermisoDuplicarMantenimientoeActivoFijos(Boolean isPermisoDuplicarMantenimientoeActivoFijos) {
		this.isPermisoDuplicarMantenimientoeActivoFijos = isPermisoDuplicarMantenimientoeActivoFijos;
	}
	
	public Boolean getIsPermisoOrdenMantenimientoeActivoFijos() {
		return isPermisoOrdenMantenimientoeActivoFijos;
	}

	public void setIsPermisoOrdenMantenimientoeActivoFijos(Boolean isPermisoOrdenMantenimientoeActivoFijos) {
		this.isPermisoOrdenMantenimientoeActivoFijos = isPermisoOrdenMantenimientoeActivoFijos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMantenimientoeActivoFijos() {
		return isVisibilidadCeldaNuevoMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaNuevoMantenimientoeActivoFijos(Boolean isVisibilidadCeldaNuevoMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos = isVisibilidadCeldaNuevoMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMantenimientoeActivoFijos() {
		return isVisibilidadCeldaDuplicarMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaDuplicarMantenimientoeActivoFijos(Boolean isVisibilidadCeldaDuplicarMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaDuplicarMantenimientoeActivoFijos = isVisibilidadCeldaDuplicarMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMantenimientoeActivoFijos() {
		return isVisibilidadCeldaCopiarMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaCopiarMantenimientoeActivoFijos(Boolean isVisibilidadCeldaCopiarMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaCopiarMantenimientoeActivoFijos = isVisibilidadCeldaCopiarMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMantenimientoeActivoFijos() {
		return isVisibilidadCeldaVerFormMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaVerFormMantenimientoeActivoFijos(Boolean isVisibilidadCeldaVerFormMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaVerFormMantenimientoeActivoFijos = isVisibilidadCeldaVerFormMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMantenimientoeActivoFijos() {
		return isVisibilidadCeldaOrdenMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaOrdenMantenimientoeActivoFijos(Boolean isVisibilidadCeldaOrdenMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos = isVisibilidadCeldaOrdenMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos() {
		return isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos(Boolean isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos = isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMantenimientoeActivoFijos() {
		return isVisibilidadCeldaModificarMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaModificarMantenimientoeActivoFijos(Boolean isVisibilidadCeldaModificarMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaModificarMantenimientoeActivoFijos = isVisibilidadCeldaModificarMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMantenimientoeActivoFijos() {
		return isVisibilidadCeldaActualizarMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaActualizarMantenimientoeActivoFijos(Boolean isVisibilidadCeldaActualizarMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos = isVisibilidadCeldaActualizarMantenimientoeActivoFijos;
	}

	public Boolean getIsVisibilidadCeldaEliminarMantenimientoeActivoFijos() {
		return isVisibilidadCeldaEliminarMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaEliminarMantenimientoeActivoFijos(Boolean isVisibilidadCeldaEliminarMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos = isVisibilidadCeldaEliminarMantenimientoeActivoFijos;
	}

	public Boolean getIsVisibilidadCeldaCancelarMantenimientoeActivoFijos() {
		return isVisibilidadCeldaCancelarMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaCancelarMantenimientoeActivoFijos(Boolean isVisibilidadCeldaCancelarMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos = isVisibilidadCeldaCancelarMantenimientoeActivoFijos;
	}

	public Boolean getIsVisibilidadCeldaGuardarMantenimientoeActivoFijos() {
		return isVisibilidadCeldaGuardarMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaGuardarMantenimientoeActivoFijos(Boolean isVisibilidadCeldaGuardarMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos = isVisibilidadCeldaGuardarMantenimientoeActivoFijos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos() {
		return isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos(Boolean isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos) {
		this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos = isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos;
	}
		
	public MantenimientoeActivoFijosSessionBean getmantenimientoeactivofijosSessionBean() {
		return this.mantenimientoeactivofijosSessionBean;
	}
	
	public void setmantenimientoeactivofijosSessionBean(MantenimientoeActivoFijosSessionBean mantenimientoeactivofijosSessionBean) {
		this.mantenimientoeactivofijosSessionBean=mantenimientoeactivofijosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaMantenimientoeActivoFijos() {
		return this.isVisibilidadBusquedaMantenimientoeActivoFijos;
	}

	public void setisVisibilidadBusquedaMantenimientoeActivoFijos(Boolean isVisibilidadBusquedaMantenimientoeActivoFijos) {
		this.isVisibilidadBusquedaMantenimientoeActivoFijos=isVisibilidadBusquedaMantenimientoeActivoFijos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(mantenimientoeactivofijos,null);
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
	
	public void bugActualizarReferenciaActual(MantenimientoeActivoFijos mantenimientoeactivofijos,MantenimientoeActivoFijos mantenimientoeactivofijosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMantenimientoeActivoFijos(mantenimientoeactivofijos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		mantenimientoeactivofijosAux.setId(mantenimientoeactivofijos.getId());
		mantenimientoeactivofijosAux.setVersionRow(mantenimientoeactivofijos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(MantenimientoeActivoFijos mantenimientoeactivofijosLocal) throws Exception {
		
		if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MantenimientoeActivoFijos mantenimientoeactivofijosLocal) throws Exception {	
		if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				mantenimientoeactivofijosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMantenimientoeActivoFijosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = mantenimientoeactivofijosValidator.getInvalidValues(this.mantenimientoeactivofijos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MantenimientoeActivoFijos mantenimientoeactivofijos,List<MantenimientoeActivoFijos> mantenimientoeactivofijoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(MantenimientoeActivoFijos mantenimientoeactivofijos,List<MantenimientoeActivoFijos> mantenimientoeactivofijoss) throws Exception {
		try	{			
			MantenimientoeActivoFijosConstantesFunciones.actualizarSelectedLista(mantenimientoeactivofijos,mantenimientoeactivofijoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MantenimientoeActivoFijos> mantenimientoeactivofijossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				mantenimientoeactivofijossLocal=this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				mantenimientoeactivofijossLocal=this.mantenimientoeactivofijoss;
			}
			//ARCHITECTURE
		
			for(MantenimientoeActivoFijos mantenimientoeactivofijosLocal:mantenimientoeactivofijossLocal) {
				if(this.permiteMantenimiento(mantenimientoeactivofijosLocal) && mantenimientoeactivofijosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.getMantenimientoeActivoFijosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnumero_documentoMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.CAUSA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcausaMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.REFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelreferenciaMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.TALLER)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabeltallerMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelfecha_inicioMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelfecha_entregaMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcostoMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.RESPONSABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelresponsableMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelobservacionMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabeltipo_movimientoMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelclaveMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnombreMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MantenimientoeActivoFijosConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnombre_detalle_grupoMantenimientoeActivoFijos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnumero_documentoMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcausaMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelreferenciaMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabeltallerMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelfecha_inicioMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelfecha_entregaMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcostoMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelresponsableMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelobservacionMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabeltipo_movimientoMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelclaveMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnombreMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnombre_detalle_grupoMantenimientoeActivoFijos,"");
		
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
		this.iIdNuevoMantenimientoeActivoFijos--;	
		
		
		this.mantenimientoeactivofijosAux=new MantenimientoeActivoFijos();
		
		this.mantenimientoeactivofijosAux.setId(this.iIdNuevoMantenimientoeActivoFijos);
		this.mantenimientoeactivofijosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().add(this.mantenimientoeactivofijosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.mantenimientoeactivofijoss.add(this.mantenimientoeactivofijosAux);
		}
		//ARCHITECTURE
		
		this.mantenimientoeactivofijos=this.mantenimientoeactivofijosAux;
		
		if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
			this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
		}
				
		//this.setDefaultControlesMantenimientoeActivoFijos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMantenimientoeActivoFijos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMantenimientoeActivoFijos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMantenimientoeActivoFijos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijosBean,this.mantenimientoeactivofijos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral,this.mantenimientoeactivofijosBean,false);
		
		if(this.mantenimientoeactivofijosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos());
		}
		
		if(this.mantenimientoeactivofijosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos(),classes);//this.mantenimientoeactivofijosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMantenimientoeActivoFijos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMantenimientoeActivoFijos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.RecargarFormMantenimientoeActivoFijos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
						
			if(mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMantenimientoeActivoFijos();
			}
			
			this.actualizarVisualTableDatosMantenimientoeActivoFijos();
			
			this.jTableDatosMantenimientoeActivoFijos.setRowSelectionInterval(this.getIndiceNuevoMantenimientoeActivoFijos(), this.getIndiceNuevoMantenimientoeActivoFijos());
			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
						
			this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMantenimientoeActivoFijos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarnumero_documentoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarcausaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarreferenciaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activartallerMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarfecha_inicioMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarfecha_entregaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarcostoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarresponsableMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarobservacionMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activartipo_movimientoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarclaveMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarnombreMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarcodigo_detalle_grupoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarnombre_detalle_grupoMantenimientoeActivoFijos);	
		//
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setEnabled(isHabilitar && this.mantenimientoeactivofijosConstantesFunciones.activarid_empresaMantenimientoeActivoFijos);
	};
	
	public void setDefaultControlesMantenimientoeActivoFijos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMantenimientoeActivoFijos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.mantenimientoeactivofijosSessionBean.setConGuardarRelaciones(true);			
			this.mantenimientoeactivofijosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.setVisible(true);
			
					
		} else {
			//this.mantenimientoeactivofijosSessionBean.setConGuardarRelaciones(false);			
			this.mantenimientoeactivofijosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMantenimientoeActivoFijos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
				if(mantenimientoeactivofijosAux.getId().equals(this.iIdNuevoMantenimientoeActivoFijos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijoss) {
				if(mantenimientoeactivofijosAux.getId().equals(this.iIdNuevoMantenimientoeActivoFijos)) {
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
	
	public int getIndiceActualMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
				if(mantenimientoeactivofijosAux.getId().equals(mantenimientoeactivofijos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijoss) {
				if(mantenimientoeactivofijosAux.getId().equals(mantenimientoeactivofijos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
				if(mantenimientoeactivofijosAux.getMantenimientoeActivoFijosOriginal().getId().equals(mantenimientoeactivofijosOriginal.getId())) {
					existe=true;
					mantenimientoeactivofijosOriginal.setId(mantenimientoeactivofijosAux.getId());
					mantenimientoeactivofijosOriginal.setVersionRow(mantenimientoeactivofijosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijoss) {
				if(mantenimientoeactivofijosAux.getMantenimientoeActivoFijosOriginal().getId().equals(mantenimientoeactivofijosOriginal.getId())) {
					existe=true;
					mantenimientoeactivofijosOriginal.setId(mantenimientoeactivofijosAux.getId());
					mantenimientoeactivofijosOriginal.setVersionRow(mantenimientoeactivofijosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMantenimientoeActivoFijos(Boolean esParaCancelar) throws Exception {
		mantenimientoeactivofijossAux=new ArrayList<MantenimientoeActivoFijos>();
		mantenimientoeactivofijosAux=new MantenimientoeActivoFijos();
		
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
					if(mantenimientoeactivofijosAux.getId()<0) {
						mantenimientoeactivofijossAux.add(mantenimientoeactivofijosAux);
					}		
				}
				this.iIdNuevoMantenimientoeActivoFijos=0L;
				this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().removeAll(mantenimientoeactivofijossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijoss) {
					if(mantenimientoeactivofijosAux.getId()<0) {
						mantenimientoeactivofijossAux.add(mantenimientoeactivofijosAux);
					}		
				}
				this.iIdNuevoMantenimientoeActivoFijos=0L;
				this.mantenimientoeactivofijoss.removeAll(mantenimientoeactivofijossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMantenimientoeActivoFijos 
					&& this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size()>0
					) {
					mantenimientoeactivofijosAux=this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().get(this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size() - 1);
				
					if(mantenimientoeactivofijosAux.getId()<0) {
						this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().remove(mantenimientoeactivofijosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMantenimientoeActivoFijos && this.mantenimientoeactivofijoss.size()>0) {
					mantenimientoeactivofijosAux=this.mantenimientoeactivofijoss.get(this.mantenimientoeactivofijoss.size() - 1);
				
					if(mantenimientoeactivofijosAux.getId()<0) {
						this.mantenimientoeactivofijoss.remove(mantenimientoeactivofijosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMantenimientoeActivoFijos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(mantenimientoeactivofijos.getId()<0) {
				this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().remove(this.mantenimientoeactivofijos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(mantenimientoeactivofijos.getId()<0) {
				this.mantenimientoeactivofijoss.remove(this.mantenimientoeactivofijos);
			}
		}			
	}
	
	public void setEstadosInicialesMantenimientoeActivoFijos(List<MantenimientoeActivoFijos> mantenimientoeactivofijossAux) throws Exception {
		MantenimientoeActivoFijosConstantesFunciones.setEstadosInicialesMantenimientoeActivoFijos(mantenimientoeactivofijossAux);
	}
	
	public void setEstadosInicialesMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijosAux) throws Exception {
		MantenimientoeActivoFijosConstantesFunciones.setEstadosInicialesMantenimientoeActivoFijos(mantenimientoeactivofijosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMantenimientoeActivoFijosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMantenimientoeActivoFijosActual()) {
				if(!this.isEsNuevoMantenimientoeActivoFijos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMantenimientoeActivoFijos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMantenimientoeActivoFijosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Mantenimientoe Activo Fijos ?", "MANTENIMIENTO DE Mantenimientoe Activo Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MantenimientoeActivoFijos mantenimientoeactivofijos) throws Exception {
		MantenimientoeActivoFijosConstantesFunciones.seleccionarAsignar(this.mantenimientoeactivofijos,mantenimientoeactivofijos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMantenimientoeActivoFijos=this.isPermisoActualizarOriginalMantenimientoeActivoFijos;
			
			
			this.seleccionarAsignar(mantenimientoeactivofijos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.mantenimientoeactivofijosSessionBean.setsFuncionBusquedaRapida(this.mantenimientoeactivofijosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMantenimientoeActivoFijos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMantenimientoeActivoFijos(esParaCancelar);				
				this.cancelarNuevoMantenimientoeActivoFijos(esParaCancelar);								
			}
			
			this.mantenimientoeactivofijos=new MantenimientoeActivoFijos();
			
			this.inicializarMantenimientoeActivoFijos();
			
			this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMantenimientoeActivoFijos() throws Exception {
		try {
			MantenimientoeActivoFijosConstantesFunciones.inicializarMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
			
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
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMantenimientoeActivoFijoss(String sAccionBusqueda,List<MantenimientoeActivoFijos> mantenimientoeactivofijossParaReportes) throws Exception {
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
					sPathReporteFinal="MantenimientoeActivoFijos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MantenimientoeActivoFijosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MantenimientoeActivoFijosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MantenimientoeActivoFijos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Mantenimientoe Activo Fijoses");		
		parameters.put("busquedapor", MantenimientoeActivoFijosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMantenimientoeActivoFijos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MantenimientoeActivoFijosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MantenimientoeActivoFijosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMantenimientoeActivoFijos=new JRBeanArrayDataSource(MantenimientoeActivoFijosJInternalFrame.TraerMantenimientoeActivoFijosBeans(mantenimientoeactivofijossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMantenimientoeActivoFijos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MantenimientoeActivoFijosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MantenimientoeActivoFijosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MantenimientoeActivoFijosBean.TraerMantenimientoeActivoFijosBeans(mantenimientoeactivofijossParaReportes).toArray()));
							
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
				this.generarExcelReporteMantenimientoeActivoFijoss(sAccionBusqueda,sTipoArchivoReporte,mantenimientoeactivofijossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMantenimientoeActivoFijoss(sAccionBusqueda,sTipoArchivoReporte,mantenimientoeactivofijossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijosActionPerformed(null);
					//this.generarExcelReporteMantenimientoeActivoFijoss(sAccionBusqueda,sTipoArchivoReporte,mantenimientoeactivofijossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMantenimientoeActivoFijoss(sAccionBusqueda,sTipoArchivoReporte,mantenimientoeactivofijossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMantenimientoeActivoFijoss(sAccionBusqueda,sTipoArchivoReporte,mantenimientoeactivofijossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMantenimientoeActivoFijoss(sAccionBusqueda,sTipoArchivoReporte,mantenimientoeactivofijossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMantenimientoeActivoFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MantenimientoeActivoFijos> mantenimientoeactivofijossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoeactivofijos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MantenimientoeActivoFijoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMantenimientoeActivoFijos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MantenimientoeActivoFijos mantenimientoeactivofijos : mantenimientoeactivofijossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MantenimientoeActivoFijosConstantesFunciones.generarExcelReporteDataMantenimientoeActivoFijos("NORMAL",row,workbook,mantenimientoeactivofijos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMantenimientoeActivoFijos(String sTipo,Row row,Workbook workbook) {
		
		MantenimientoeActivoFijosConstantesFunciones.generarExcelReporteHeaderMantenimientoeActivoFijos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMantenimientoeActivoFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MantenimientoeActivoFijos> mantenimientoeactivofijossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoeactivofijos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MantenimientoeActivoFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MantenimientoeActivoFijos mantenimientoeactivofijos : mantenimientoeactivofijossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.getMantenimientoeActivoFijosDescripcion(mantenimientoeactivofijos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getcausa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getreferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.gettaller());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getresponsable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getobservacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mantenimientoeactivofijos.getnombre_detalle_grupo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMantenimientoeActivoFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MantenimientoeActivoFijos> mantenimientoeactivofijossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MantenimientoeActivoFijos> mantenimientoeactivofijossRespaldo=null;
		
		classes=MantenimientoeActivoFijosConstantesFunciones.getClassesRelationshipsOfMantenimientoeActivoFijos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.mantenimientoeactivofijosLogic.setDatosCliente(this.datosCliente);
		this.mantenimientoeactivofijosLogic.setDatosDeep(this.datosDeep);
		this.mantenimientoeactivofijosLogic.setIsConDeep(true);
		
		mantenimientoeactivofijossRespaldo=this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss();
		
		this.mantenimientoeactivofijosLogic.setMantenimientoeActivoFijoss(mantenimientoeactivofijossParaReportes);	
		this.mantenimientoeactivofijosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		mantenimientoeactivofijossParaReportes=this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss();
		this.mantenimientoeactivofijosLogic.setMantenimientoeActivoFijoss(mantenimientoeactivofijossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoeactivofijos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MantenimientoeActivoFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMantenimientoeActivoFijos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MantenimientoeActivoFijos mantenimientoeactivofijos : mantenimientoeactivofijossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMantenimientoeActivoFijos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MantenimientoeActivoFijosConstantesFunciones.generarExcelReporteDataMantenimientoeActivoFijos("NORMAL",row,workbook,mantenimientoeactivofijos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.getMantenimientoeActivoFijosDescripcion(mantenimientoeactivofijos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMantenimientoeActivoFijos() throws Exception {		
		this.startProcessMantenimientoeActivoFijos(true);
	}
	
	public void startProcessMantenimientoeActivoFijos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMantenimientoeActivoFijos ,this.jPanelParametrosReportesMantenimientoeActivoFijos, this.jScrollPanelDatosMantenimientoeActivoFijos,this.jPanelPaginacionMantenimientoeActivoFijos, this.jScrollPanelDatosEdicionMantenimientoeActivoFijos, this.jPanelAccionesMantenimientoeActivoFijos,this.jPanelAccionesFormularioMantenimientoeActivoFijos,this.jmenuBarMantenimientoeActivoFijos,this.jmenuBarDetalleMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,this.jTtoolBarDetalleMantenimientoeActivoFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasMantenimientoeActivoFijos=this.jTabbedPaneBusquedasMantenimientoeActivoFijos; 
		
		final JPanel jPanelParametrosReportesMantenimientoeActivoFijos=this.jPanelParametrosReportesMantenimientoeActivoFijos;
		//final JScrollPane jScrollPanelDatosMantenimientoeActivoFijos=this.jScrollPanelDatosMantenimientoeActivoFijos;
		final JTable jTableDatosMantenimientoeActivoFijos=this.jTableDatosMantenimientoeActivoFijos;		
		final JPanel jPanelPaginacionMantenimientoeActivoFijos=this.jPanelPaginacionMantenimientoeActivoFijos;
		//final JScrollPane jScrollPanelDatosEdicionMantenimientoeActivoFijos=this.jScrollPanelDatosEdicionMantenimientoeActivoFijos;
		final JPanel jPanelAccionesMantenimientoeActivoFijos=this.jPanelAccionesMantenimientoeActivoFijos;
		
		JPanel jPanelCamposAuxiliarMantenimientoeActivoFijos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMantenimientoeActivoFijos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			jPanelCamposAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelCamposMantenimientoeActivoFijos;
			jPanelAccionesFormularioAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelAccionesFormularioMantenimientoeActivoFijos;
		}
		
		final JPanel jPanelCamposMantenimientoeActivoFijos=jPanelCamposAuxiliarMantenimientoeActivoFijos;
		final JPanel jPanelAccionesFormularioMantenimientoeActivoFijos=jPanelAccionesFormularioAuxiliarMantenimientoeActivoFijos;
		
		
		final JMenuBar jmenuBarMantenimientoeActivoFijos=this.jmenuBarMantenimientoeActivoFijos;
		final JToolBar jTtoolBarMantenimientoeActivoFijos=this.jTtoolBarMantenimientoeActivoFijos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMantenimientoeActivoFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMantenimientoeActivoFijos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			jmenuBarDetalleAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jmenuBarDetalleMantenimientoeActivoFijos;
			jTtoolBarDetalleAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTtoolBarDetalleMantenimientoeActivoFijos;
		}
		
		final JMenuBar jmenuBarDetalleMantenimientoeActivoFijos=jmenuBarDetalleAuxiliarMantenimientoeActivoFijos;
		final JToolBar jTtoolBarDetalleMantenimientoeActivoFijos=jTtoolBarDetalleAuxiliarMantenimientoeActivoFijos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMantenimientoeActivoFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMantenimientoeActivoFijos;
			processRunnable.jTableDatos=jTableDatosMantenimientoeActivoFijos;
			processRunnable.jPanelCampos=jPanelCamposMantenimientoeActivoFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionMantenimientoeActivoFijos;
			processRunnable.jPanelAcciones=jPanelAccionesMantenimientoeActivoFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMantenimientoeActivoFijos;
			
			
			processRunnable.jmenuBar=jmenuBarMantenimientoeActivoFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMantenimientoeActivoFijos;
			processRunnable.jTtoolBar=jTtoolBarMantenimientoeActivoFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMantenimientoeActivoFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMantenimientoeActivoFijos ,jPanelParametrosReportesMantenimientoeActivoFijos,jTableDatosMantenimientoeActivoFijos, /*jScrollPanelDatosMantenimientoeActivoFijos,*/jPanelCamposMantenimientoeActivoFijos,jPanelPaginacionMantenimientoeActivoFijos, /*jScrollPanelDatosEdicionMantenimientoeActivoFijos,*/ jPanelAccionesMantenimientoeActivoFijos,jPanelAccionesFormularioMantenimientoeActivoFijos,jmenuBarMantenimientoeActivoFijos,jmenuBarDetalleMantenimientoeActivoFijos,jTtoolBarMantenimientoeActivoFijos,jTtoolBarDetalleMantenimientoeActivoFijos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMantenimientoeActivoFijos ,jPanelParametrosReportesMantenimientoeActivoFijos, jScrollPanelDatosMantenimientoeActivoFijos,jPanelPaginacionMantenimientoeActivoFijos, jScrollPanelDatosEdicionMantenimientoeActivoFijos, jPanelAccionesMantenimientoeActivoFijos,jPanelAccionesFormularioMantenimientoeActivoFijos,jmenuBarMantenimientoeActivoFijos,jmenuBarDetalleMantenimientoeActivoFijos,jTtoolBarMantenimientoeActivoFijos,jTtoolBarDetalleMantenimientoeActivoFijos);
						
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
	
	public void finishProcessMantenimientoeActivoFijos() {// throws Exception 
		this.finishProcessMantenimientoeActivoFijos(true);
	}
	
	public void finishProcessMantenimientoeActivoFijos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMantenimientoeActivoFijos ,this.jPanelParametrosReportesMantenimientoeActivoFijos, this.jScrollPanelDatosMantenimientoeActivoFijos,this.jPanelPaginacionMantenimientoeActivoFijos, this.jScrollPanelDatosEdicionMantenimientoeActivoFijos, this.jPanelAccionesMantenimientoeActivoFijos,this.jPanelAccionesFormularioMantenimientoeActivoFijos,this.jmenuBarMantenimientoeActivoFijos,this.jmenuBarDetalleMantenimientoeActivoFijos,this.jTtoolBarMantenimientoeActivoFijos,this.jTtoolBarDetalleMantenimientoeActivoFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasMantenimientoeActivoFijos=this.jTabbedPaneBusquedasMantenimientoeActivoFijos; 
		
		final JPanel jPanelParametrosReportesMantenimientoeActivoFijos=this.jPanelParametrosReportesMantenimientoeActivoFijos;
		//final JScrollPane jScrollPanelDatosMantenimientoeActivoFijos=this.jScrollPanelDatosMantenimientoeActivoFijos;
		final JTable jTableDatosMantenimientoeActivoFijos=this.jTableDatosMantenimientoeActivoFijos;		
		final JPanel jPanelPaginacionMantenimientoeActivoFijos=this.jPanelPaginacionMantenimientoeActivoFijos;
		//final JScrollPane jScrollPanelDatosEdicionMantenimientoeActivoFijos=this.jScrollPanelDatosEdicionMantenimientoeActivoFijos;
		final JPanel jPanelAccionesMantenimientoeActivoFijos=this.jPanelAccionesMantenimientoeActivoFijos;
		
		JPanel jPanelCamposAuxiliarMantenimientoeActivoFijos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMantenimientoeActivoFijos=new JPanel();
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			jPanelCamposAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelCamposMantenimientoeActivoFijos;
			jPanelAccionesFormularioAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelAccionesFormularioMantenimientoeActivoFijos;
		}
		
		final JPanel jPanelCamposMantenimientoeActivoFijos=jPanelCamposAuxiliarMantenimientoeActivoFijos;
		final JPanel jPanelAccionesFormularioMantenimientoeActivoFijos=jPanelAccionesFormularioAuxiliarMantenimientoeActivoFijos;
		
		
		final JMenuBar jmenuBarMantenimientoeActivoFijos=this.jmenuBarMantenimientoeActivoFijos;		
		final JToolBar jTtoolBarMantenimientoeActivoFijos=this.jTtoolBarMantenimientoeActivoFijos;
				
		JMenuBar jmenuBarDetalleAuxiliarMantenimientoeActivoFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMantenimientoeActivoFijos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			jmenuBarDetalleAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jmenuBarDetalleMantenimientoeActivoFijos;
			jTtoolBarDetalleAuxiliarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTtoolBarDetalleMantenimientoeActivoFijos;		
		}
		
		final JMenuBar jmenuBarDetalleMantenimientoeActivoFijos=jmenuBarDetalleAuxiliarMantenimientoeActivoFijos;
		final JToolBar jTtoolBarDetalleMantenimientoeActivoFijos=jTtoolBarDetalleAuxiliarMantenimientoeActivoFijos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMantenimientoeActivoFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMantenimientoeActivoFijos;
			processRunnable.jTableDatos=jTableDatosMantenimientoeActivoFijos;
			processRunnable.jPanelCampos=jPanelCamposMantenimientoeActivoFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionMantenimientoeActivoFijos;
			processRunnable.jPanelAcciones=jPanelAccionesMantenimientoeActivoFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMantenimientoeActivoFijos;
			
			
			processRunnable.jmenuBar=jmenuBarMantenimientoeActivoFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMantenimientoeActivoFijos;
			processRunnable.jTtoolBar=jTtoolBarMantenimientoeActivoFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMantenimientoeActivoFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMantenimientoeActivoFijos ,jPanelParametrosReportesMantenimientoeActivoFijos, jTableDatosMantenimientoeActivoFijos,/*jScrollPanelDatosMantenimientoeActivoFijos,*/jPanelCamposMantenimientoeActivoFijos,jPanelPaginacionMantenimientoeActivoFijos, /*jScrollPanelDatosEdicionMantenimientoeActivoFijos,*/ jPanelAccionesMantenimientoeActivoFijos,jPanelAccionesFormularioMantenimientoeActivoFijos,jmenuBarMantenimientoeActivoFijos,jmenuBarDetalleMantenimientoeActivoFijos,jTtoolBarMantenimientoeActivoFijos,jTtoolBarDetalleMantenimientoeActivoFijos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMantenimientoeActivoFijos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMantenimientoeActivoFijos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMantenimientoeActivoFijos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMantenimientoeActivoFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMantenimientoeActivoFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMantenimientoeActivoFijos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMantenimientoeActivoFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMantenimientoeActivoFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMantenimientoeActivoFijos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.mantenimientoeactivofijosConstantesFunciones.getsFinalQueryMantenimientoeActivoFijos();
		String  finalQueryPaginacionTodos=this.mantenimientoeactivofijosConstantesFunciones.getsFinalQueryMantenimientoeActivoFijos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MantenimientoeActivoFijosConstantesFunciones.getArrayColumnasGlobalesNoMantenimientoeActivoFijos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MantenimientoeActivoFijosConstantesFunciones.getArrayColumnasGlobalesMantenimientoeActivoFijos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MantenimientoeActivoFijosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.mantenimientoeactivofijossEliminados= new ArrayList<MantenimientoeActivoFijos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMantenimientoeActivoFijos();
		
				///*MantenimientoeActivoFijosSessionBean*/this.mantenimientoeactivofijosSessionBean=new MantenimientoeActivoFijosSessionBean();
			
			if(this.mantenimientoeactivofijosSessionBean==null) {
				this.mantenimientoeactivofijosSessionBean=new MantenimientoeActivoFijosSessionBean();
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
					this.iNumeroPaginacion=MantenimientoeActivoFijosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MantenimientoeActivoFijosConstantesFunciones.getClassesForeignKeysOfMantenimientoeActivoFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/mantenimientoeactivofijos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			mantenimientoeactivofijossAux= new ArrayList<MantenimientoeActivoFijos>();
			
				
			mantenimientoeactivofijosLogic.setDatosCliente(this.datosCliente);
			mantenimientoeactivofijosLogic.setDatosDeep(this.datosDeep);
			mantenimientoeactivofijosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaMantenimientoeActivoFijos")) {
				this.sDetalleReporte=MantenimientoeActivoFijosConstantesFunciones.getDetalleIndiceBusquedaMantenimientoeActivoFijos(idBusquedaMantenimientoeActivoFijos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					mantenimientoeactivofijosLogic.getMantenimientoeActivoFijossBusquedaMantenimientoeActivoFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaMantenimientoeActivoFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoeActivoFijosConstantesFunciones.getDetalleIndiceBusquedaMantenimientoeActivoFijos(idBusquedaMantenimientoeActivoFijos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoeActivoFijosConstantesFunciones.getDetalleIndiceBusquedaMantenimientoeActivoFijos(idBusquedaMantenimientoeActivoFijos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()==null||mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=mantenimientoeactivofijoss==null|| mantenimientoeactivofijoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoeactivofijossAux=new ArrayList<MantenimientoeActivoFijos>();
						mantenimientoeactivofijossAux.addAll(mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoeactivofijossAux=new ArrayList<MantenimientoeActivoFijos>();
							mantenimientoeactivofijossAux.addAll(mantenimientoeactivofijoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							mantenimientoeactivofijosLogic.getMantenimientoeActivoFijossBusquedaMantenimientoeActivoFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaMantenimientoeActivoFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MantenimientoeActivoFijosConstantesFunciones.getDetalleIndiceBusquedaMantenimientoeActivoFijos(idBusquedaMantenimientoeActivoFijos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MantenimientoeActivoFijosConstantesFunciones.getDetalleIndiceBusquedaMantenimientoeActivoFijos(idBusquedaMantenimientoeActivoFijos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMantenimientoeActivoFijoss("BusquedaMantenimientoeActivoFijos",mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMantenimientoeActivoFijoss("BusquedaMantenimientoeActivoFijos",mantenimientoeactivofijoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoeactivofijosLogic.setMantenimientoeActivoFijoss(new ArrayList<MantenimientoeActivoFijos>());
						mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().addAll(mantenimientoeactivofijossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoeactivofijoss=new ArrayList<MantenimientoeActivoFijos>();
							mantenimientoeactivofijoss.addAll(mantenimientoeactivofijossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMantenimientoeActivoFijos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMantenimientoeActivoFijos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mantenimientoeactivofijoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mantenimientoeactivofijoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MantenimientoeActivoFijos mantenimientoeactivofijos) {
		Boolean permite=true;
		
		if(this.mantenimientoeactivofijos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MantenimientoeActivoFijosConstantesFunciones.getOrderByListaMantenimientoeActivoFijos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MantenimientoeActivoFijosConstantesFunciones.getOrderByListaMantenimientoeActivoFijos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
				if(mantenimientoeactivofijos.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoeactivofijosTotales=mantenimientoeactivofijos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijos:this.mantenimientoeactivofijoss) {
				if(mantenimientoeactivofijos.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoeactivofijosTotales=mantenimientoeactivofijos;
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
			this.mantenimientoeactivofijosAux=new MantenimientoeActivoFijos();
			this.mantenimientoeactivofijosAux.setsType(Constantes2.S_TOTALES);
			this.mantenimientoeactivofijosAux.setIsNew(false);
			this.mantenimientoeactivofijosAux.setIsChanged(false);
			this.mantenimientoeactivofijosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//MantenimientoeActivoFijosConstantesFunciones.TotalizarValoresFilaMantenimientoeActivoFijos(this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss(),this.mantenimientoeactivofijosAux);
				
				//this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().add(this.mantenimientoeactivofijosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MantenimientoeActivoFijosConstantesFunciones.TotalizarValoresFilaMantenimientoeActivoFijos(this.mantenimientoeactivofijoss,this.mantenimientoeactivofijosAux);
				
				this.mantenimientoeactivofijoss.add(this.mantenimientoeactivofijosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		mantenimientoeactivofijosTotales=new MantenimientoeActivoFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().remove(mantenimientoeactivofijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mantenimientoeactivofijoss.remove(mantenimientoeactivofijosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		mantenimientoeactivofijosTotales=new MantenimientoeActivoFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
				if(mantenimientoeactivofijos.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoeactivofijosTotales=mantenimientoeactivofijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MantenimientoeActivoFijosConstantesFunciones.TotalizarValoresFilaMantenimientoeActivoFijos(this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss(),mantenimientoeactivofijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MantenimientoeActivoFijos mantenimientoeactivofijos:this.mantenimientoeactivofijoss) {
				if(mantenimientoeactivofijos.getsType().equals(Constantes2.S_TOTALES)) {
					mantenimientoeactivofijosTotales=mantenimientoeactivofijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MantenimientoeActivoFijosConstantesFunciones.TotalizarValoresFilaMantenimientoeActivoFijos(this.mantenimientoeactivofijoss,mantenimientoeactivofijosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMantenimientoeActivoFijossBusquedaMantenimientoeActivoFijos()throws Exception {
		try {
			sAccionBusqueda="BusquedaMantenimientoeActivoFijos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMantenimientoeActivoFijossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMantenimientoeActivoFijossBusquedaMantenimientoeActivoFijos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mantenimientoeactivofijosLogic.getMantenimientoeActivoFijossBusquedaMantenimientoeActivoFijos(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMantenimientoeActivoFijossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mantenimientoeactivofijosLogic.getMantenimientoeActivoFijossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosMantenimientoeActivoFijos() {
		this.isPermisoTodoMantenimientoeActivoFijos=false;
		this.isPermisoNuevoMantenimientoeActivoFijos=false;
		this.isPermisoActualizarMantenimientoeActivoFijos=false;
		this.isPermisoActualizarOriginalMantenimientoeActivoFijos=false;
		this.isPermisoEliminarMantenimientoeActivoFijos=false;
		this.isPermisoGuardarCambiosMantenimientoeActivoFijos=false;
		this.isPermisoConsultaMantenimientoeActivoFijos=true;
		this.isPermisoBusquedaMantenimientoeActivoFijos=true;
		this.isPermisoReporteMantenimientoeActivoFijos=true;
		this.isPermisoOrdenMantenimientoeActivoFijos=false;		
		this.isPermisoPaginacionMedioMantenimientoeActivoFijos=false;		
		this.isPermisoPaginacionAltoMantenimientoeActivoFijos=false;		
		this.isPermisoPaginacionTodoMantenimientoeActivoFijos=false;		
		this.isPermisoCopiarMantenimientoeActivoFijos=false;		
		this.isPermisoVerFormMantenimientoeActivoFijos=false;		
		this.isPermisoDuplicarMantenimientoeActivoFijos=false;
		this.isPermisoOrdenMantenimientoeActivoFijos=false;
	}
	
	public void setPermisosUsuarioMantenimientoeActivoFijos(Boolean isPermiso) {
		this.isPermisoTodoMantenimientoeActivoFijos=isPermiso;
		this.isPermisoNuevoMantenimientoeActivoFijos=isPermiso;
		this.isPermisoActualizarMantenimientoeActivoFijos=isPermiso;
		this.isPermisoActualizarOriginalMantenimientoeActivoFijos=isPermiso;
		this.isPermisoEliminarMantenimientoeActivoFijos=isPermiso;
		this.isPermisoGuardarCambiosMantenimientoeActivoFijos=isPermiso;
		this.isPermisoConsultaMantenimientoeActivoFijos=isPermiso;
		this.isPermisoBusquedaMantenimientoeActivoFijos=isPermiso;
		this.isPermisoReporteMantenimientoeActivoFijos=isPermiso;
		this.isPermisoOrdenMantenimientoeActivoFijos=isPermiso;		
		this.isPermisoPaginacionMedioMantenimientoeActivoFijos=isPermiso;		
		this.isPermisoPaginacionAltoMantenimientoeActivoFijos=isPermiso;		
		this.isPermisoPaginacionTodoMantenimientoeActivoFijos=isPermiso;		
		this.isPermisoCopiarMantenimientoeActivoFijos=isPermiso;		
		this.isPermisoVerFormMantenimientoeActivoFijos=isPermiso;		
		this.isPermisoDuplicarMantenimientoeActivoFijos=isPermiso;
		this.isPermisoOrdenMantenimientoeActivoFijos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMantenimientoeActivoFijos(Boolean isPermiso) {
		//this.isPermisoTodoMantenimientoeActivoFijos=isPermiso;
		this.isPermisoNuevoMantenimientoeActivoFijos=isPermiso;
		this.isPermisoActualizarMantenimientoeActivoFijos=isPermiso;
		this.isPermisoActualizarOriginalMantenimientoeActivoFijos=isPermiso;
		this.isPermisoEliminarMantenimientoeActivoFijos=isPermiso;
		this.isPermisoGuardarCambiosMantenimientoeActivoFijos=isPermiso;
		//this.isPermisoConsultaMantenimientoeActivoFijos=isPermiso;
		//this.isPermisoBusquedaMantenimientoeActivoFijos=isPermiso;
		//this.isPermisoReporteMantenimientoeActivoFijos=isPermiso;
		//this.isPermisoOrdenMantenimientoeActivoFijos=isPermiso;		
		//this.isPermisoPaginacionMedioMantenimientoeActivoFijos=isPermiso;		
		//this.isPermisoPaginacionAltoMantenimientoeActivoFijos=isPermiso;		
		//this.isPermisoPaginacionTodoMantenimientoeActivoFijos=isPermiso;		
		//this.isPermisoCopiarMantenimientoeActivoFijos=isPermiso;		
		//this.isPermisoDuplicarMantenimientoeActivoFijos=isPermiso;
		//this.isPermisoOrdenMantenimientoeActivoFijos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMantenimientoeActivoFijosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MantenimientoeActivoFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMantenimientoeActivoFijos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMantenimientoeActivoFijosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMantenimientoeActivoFijosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMantenimientoeActivoFijosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMantenimientoeActivoFijosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMantenimientoeActivoFijos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MantenimientoeActivoFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MantenimientoeActivoFijosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMantenimientoeActivoFijos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMantenimientoeActivoFijos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMantenimientoeActivoFijos=this.isPermisoActualizarMantenimientoeActivoFijos;
			this.isPermisoEliminarMantenimientoeActivoFijos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMantenimientoeActivoFijos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMantenimientoeActivoFijos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMantenimientoeActivoFijos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMantenimientoeActivoFijos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMantenimientoeActivoFijos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMantenimientoeActivoFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMantenimientoeActivoFijos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMantenimientoeActivoFijos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMantenimientoeActivoFijos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMantenimientoeActivoFijos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMantenimientoeActivoFijos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMantenimientoeActivoFijos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMantenimientoeActivoFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMantenimientoeActivoFijos.setToolTipText(this.jTableDatosMantenimientoeActivoFijos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMantenimientoeActivoFijos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMantenimientoeActivoFijos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MantenimientoeActivoFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MantenimientoeActivoFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMantenimientoeActivoFijos() throws Exception {
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
	public void inicializarCombosForeignKeyMantenimientoeActivoFijosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMantenimientoeActivoFijosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MantenimientoeActivoFijosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyMantenimientoeActivoFijos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.mantenimientoeactivofijosSessionBean==null) {
				this.mantenimientoeactivofijosSessionBean=new MantenimientoeActivoFijosSessionBean();
			}

			if(!this.mantenimientoeactivofijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyMantenimientoeActivoFijos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMantenimientoeActivoFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMantenimientoeActivoFijos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMantenimientoeActivoFijos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMantenimientoeActivoFijos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMantenimientoeActivoFijos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMantenimientoeActivoFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMantenimientoeActivoFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMantenimientoeActivoFijos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMantenimientoeActivoFijos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMantenimientoeActivoFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMantenimientoeActivoFijos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.getItemCount()>0) {
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public MantenimientoeActivoFijosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MantenimientoeActivoFijosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MantenimientoeActivoFijosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.mantenimientoeactivofijosSessionBean=new MantenimientoeActivoFijosSessionBean(); 
		this.mantenimientoeactivofijosConstantesFunciones=new MantenimientoeActivoFijosConstantesFunciones(); 
		this.mantenimientoeactivofijosBean=new MantenimientoeActivoFijos();//(this.mantenimientoeactivofijosConstantesFunciones); 		
		this.mantenimientoeactivofijosReturnGeneral=new MantenimientoeActivoFijosParameterReturnGeneral(); 
		
		this.mantenimientoeactivofijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mantenimientoeactivofijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MantenimientoeActivoFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MantenimientoeActivoFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MantenimientoeActivoFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMantenimientoeActivoFijos(true);
			
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
			
			this.mantenimientoeactivofijosConstantesFunciones=new MantenimientoeActivoFijosConstantesFunciones(); 
			this.mantenimientoeactivofijosBean=new MantenimientoeActivoFijos();//this.mantenimientoeactivofijosConstantesFunciones); 			
			this.mantenimientoeactivofijosReturnGeneral=new MantenimientoeActivoFijosParameterReturnGeneral(); 
		
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mantenimientoe Activo Fijos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.mantenimientoeactivofijos=new MantenimientoeActivoFijos();
			this.mantenimientoeactivofijoss = new ArrayList<MantenimientoeActivoFijos>();
			this.mantenimientoeactivofijossAux = new ArrayList<MantenimientoeActivoFijos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic=new MantenimientoeActivoFijosLogic();
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			//this.mantenimientoeactivofijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.mantenimientoeactivofijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMantenimientoeActivoFijos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos);	
					}
					
					if(this.jInternalFrameImportacionMantenimientoeActivoFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMantenimientoeActivoFijos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMantenimientoeActivoFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMantenimientoeActivoFijos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMantenimientoeActivoFijos);
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setVisible(false);
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos);
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setVisible(false);
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMantenimientoeActivoFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMantenimientoeActivoFijos);
					this.jInternalFrameImportacionMantenimientoeActivoFijos.setVisible(false);
					this.jInternalFrameImportacionMantenimientoeActivoFijos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMantenimientoeActivoFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMantenimientoeActivoFijos);
					this.jInternalFrameOrderByMantenimientoeActivoFijos.setVisible(false);
					this.jInternalFrameOrderByMantenimientoeActivoFijos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMantenimientoeActivoFijosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MantenimientoeActivoFijosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.mantenimientoeactivofijosReturnGeneral=new MantenimientoeActivoFijosParameterReturnGeneral();
			
			this.mantenimientoeactivofijosParameterGeneral=new MantenimientoeActivoFijosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.mantenimientoeactivofijosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MantenimientoeActivoFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MantenimientoeActivoFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MantenimientoeActivoFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaDuplicarMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaCopiarMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaVerFormMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
			
			
			this.isVisibilidadBusquedaMantenimientoeActivoFijos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMantenimientoeActivoFijos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMantenimientoeActivoFijos(false);
			
			this.setPermisosUsuarioMantenimientoeActivoFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() 
				|| (this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado() && this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMantenimientoeActivoFijosClasesRelacionadas();
			}
			
			if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMantenimientoeActivoFijosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMantenimientoeActivoFijos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMantenimientoeActivoFijos();
			}
			
			if(!this.isPermisoBusquedaMantenimientoeActivoFijos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MantenimientoeActivoFijosConstantesFunciones.getTiposSeleccionarMantenimientoeActivoFijos());
				
				this.tiposColumnasSelect=MantenimientoeActivoFijosConstantesFunciones.getTiposSeleccionarMantenimientoeActivoFijos(true);
				
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
			//if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMantenimientoeActivoFijos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioMantenimientoeActivoFijos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioMantenimientoeActivoFijos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoeActivoFijos() ;
			
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
				mantenimientoeactivofijosImplementable= (MantenimientoeActivoFijosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MantenimientoeActivoFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				mantenimientoeactivofijosImplementableHome= (MantenimientoeActivoFijosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MantenimientoeActivoFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.mantenimientoeactivofijoss= new ArrayList<MantenimientoeActivoFijos>();
			this.mantenimientoeactivofijossEliminados= new ArrayList<MantenimientoeActivoFijos>();
						
			this.isEsNuevoMantenimientoeActivoFijos=false;
			this.esParaAccionDesdeFormularioMantenimientoeActivoFijos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMantenimientoeActivoFijos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMantenimientoeActivoFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MantenimientoeActivoFijosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMantenimientoeActivoFijos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMantenimientoeActivoFijos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMantenimientoeActivoFijos();
			}
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMantenimientoeActivoFijos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MantenimientoeActivoFijos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMantenimientoeActivoFijos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMantenimientoeActivoFijos")) {
				iIndex=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMantenimientoeActivoFijos();	
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
	
	public void cargarCombosForeignKeyMantenimientoeActivoFijos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMantenimientoeActivoFijos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMantenimientoeActivoFijos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMantenimientoeActivoFijosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMantenimientoeActivoFijos();
		
		this.cargarCombosFrameForeignKeyMantenimientoeActivoFijos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMantenimientoeActivoFijos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMantenimientoeActivoFijos();
		}
	}
	
	
	
	public void jButtonNuevoMantenimientoeActivoFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
			
			if(jTableDatosMantenimientoeActivoFijos.getRowCount()>=1) {
				jTableDatosMantenimientoeActivoFijos.removeRowSelectionInterval(0, jTableDatosMantenimientoeActivoFijos.getRowCount()-1);						
			}
			
			this.isEsNuevoMantenimientoeActivoFijos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMantenimientoeActivoFijos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMantenimientoeActivoFijos(true);			
			//this.mantenimientoeactivofijos=new MantenimientoeActivoFijos();
			//this.mantenimientoeactivofijos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos() ;
			
			if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMantenimientoeActivoFijos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.mantenimientoeactivofijos);	
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);				
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
			if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MantenimientoeActivoFijos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMantenimientoeActivoFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMantenimientoeActivoFijos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMantenimientoeActivoFijos.getSelectedRows().length;			
			}
			
			mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMantenimientoeActivoFijos--;			
				//MantenimientoeActivoFijos mantenimientoeactivofijosAux= new MantenimientoeActivoFijos();			
				//mantenimientoeactivofijosAux.setId(this.iIdNuevoMantenimientoeActivoFijos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MantenimientoeActivoFijos mantenimientoeactivofijosOrigen=new MantenimientoeActivoFijos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MantenimientoeActivoFijos mantenimientoeactivofijosOrigen : mantenimientoeactivofijossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							mantenimientoeactivofijosOrigen =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mantenimientoeactivofijosOrigen =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMantenimientoeActivoFijos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.mantenimientoeactivofijos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMantenimientoeActivoFijos(mantenimientoeactivofijosOrigen,this.mantenimientoeactivofijos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().add(this.mantenimientoeactivofijosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijoss.add(this.mantenimientoeactivofijosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
				
				this.jTableDatosMantenimientoeActivoFijos.setRowSelectionInterval(this.getIndiceNuevoMantenimientoeActivoFijos(), this.getIndiceNuevoMantenimientoeActivoFijos());
				
				int iLastRow =  this.jTableDatosMantenimientoeActivoFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMantenimientoeActivoFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMantenimientoeActivoFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();									
		
			MantenimientoeActivoFijos mantenimientoeactivofijosOrigen=new MantenimientoeActivoFijos();
			MantenimientoeActivoFijos mantenimientoeactivofijosDestino=new MantenimientoeActivoFijos();
				
			mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMantenimientoeActivoFijos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || mantenimientoeactivofijossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMantenimientoeActivoFijos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoeactivofijosOrigen =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mantenimientoeactivofijosOrigen =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mantenimientoeactivofijosDestino =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mantenimientoeactivofijosDestino =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				mantenimientoeactivofijosOrigen =mantenimientoeactivofijossSeleccionados.get(0);
				mantenimientoeactivofijosDestino =mantenimientoeactivofijossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMantenimientoeActivoFijos(mantenimientoeactivofijosOrigen,mantenimientoeactivofijosDestino,true,false);
				
				mantenimientoeactivofijosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mantenimientoeactivofijosDestino,mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mantenimientoeactivofijosDestino,mantenimientoeactivofijoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
				
				//this.jTableDatosMantenimientoeActivoFijos.setRowSelectionInterval(this.getIndiceNuevoMantenimientoeActivoFijos(), this.getIndiceNuevoMantenimientoeActivoFijos());
				
				int iLastRow =  this.jTableDatosMantenimientoeActivoFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMantenimientoeActivoFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMantenimientoeActivoFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMantenimientoeActivoFijos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(!isVisible);
			this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(!isVisible);
			this.jPanelAccionesMantenimientoeActivoFijos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMantenimientoeActivoFijos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMantenimientoeActivoFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMantenimientoeActivoFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMantenimientoeActivoFijos();
			
			this.abrirFrameOrderByMantenimientoeActivoFijos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMantenimientoeActivoFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMantenimientoeActivoFijos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMantenimientoeActivoFijos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.isMaximum()) {
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setSize(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.iWidthFormulario,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMantenimientoeActivoFijos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMantenimientoeActivoFijos.isMaximum()) {
						this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jContentPaneDetalleMantenimientoeActivoFijos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jContentPaneDetalleMantenimientoeActivoFijos.getWidth(),MantenimientoeActivoFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jContentPaneDetalleMantenimientoeActivoFijos.getWidth(),MantenimientoeActivoFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jContentPaneDetalleMantenimientoeActivoFijos.getWidth(),MantenimientoeActivoFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setVisible(true);
	        this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMantenimientoeActivoFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMantenimientoeActivoFijos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMantenimientoeActivoFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoeActivoFijos,false,this);
				} else {
					this.jInternalFrameOrderByMantenimientoeActivoFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMantenimientoeActivoFijos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMantenimientoeActivoFijos);
				this.jInternalFrameOrderByMantenimientoeActivoFijos.setVisible(false);
				this.jInternalFrameOrderByMantenimientoeActivoFijos.setSelected(false);
				
				this.jInternalFrameOrderByMantenimientoeActivoFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMantenimientoeActivoFijos"));
				
				this.inicializarActualizarBindingTablaOrderByMantenimientoeActivoFijos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMantenimientoeActivoFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMantenimientoeActivoFijos==null) {
				
				this.jInternalFrameImportacionMantenimientoeActivoFijos=new ImportacionJInternalFrame(MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMantenimientoeActivoFijos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMantenimientoeActivoFijos);
				this.jInternalFrameImportacionMantenimientoeActivoFijos.setVisible(false);
				this.jInternalFrameImportacionMantenimientoeActivoFijos.setSelected(false);


				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMantenimientoeActivoFijos"));
				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMantenimientoeActivoFijos"));
				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMantenimientoeActivoFijos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMantenimientoeActivoFijos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos==null) {
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos=new ReporteDinamicoJInternalFrame(MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos);
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setVisible(false);
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMantenimientoeActivoFijos"));
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMantenimientoeActivoFijos"));
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMantenimientoeActivoFijos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMantenimientoeActivoFijos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMantenimientoeActivoFijos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMantenimientoeActivoFijos);
			
	       	this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setVisible(false);
	        this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setSelected(false);
			
			//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.dispose();
			//this.jInternalFrameDetalleFormMantenimientoeActivoFijos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMantenimientoeActivoFijos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setVisible(true);
	        this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMantenimientoeActivoFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMantenimientoeActivoFijos.setVisible(true);
	        this.jInternalFrameImportacionMantenimientoeActivoFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMantenimientoeActivoFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setVisible(true);
	        this.jInternalFrameOrderByMantenimientoeActivoFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMantenimientoeActivoFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMantenimientoeActivoFijos.setVisible(false);
	        this.jInternalFrameOrderByMantenimientoeActivoFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMantenimientoeActivoFijos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setVisible(false);
	        this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMantenimientoeActivoFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMantenimientoeActivoFijos.setVisible(false);
	        this.jInternalFrameImportacionMantenimientoeActivoFijos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMantenimientoeActivoFijos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMantenimientoeActivoFijos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMantenimientoeActivoFijos(true);
			//this.isEsNuevoMantenimientoeActivoFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(false) ;
			
			if(mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMantenimientoeActivoFijos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMantenimientoeActivoFijosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMantenimientoeActivoFijos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMantenimientoeActivoFijos(true);
			//this.isEsNuevoMantenimientoeActivoFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.mantenimientoeactivofijos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(false) ;
			
			if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMantenimientoeActivoFijos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMantenimientoeActivoFijos(false);
			
			//if(!this.isEsNuevoMantenimientoeActivoFijos) {								
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				
			}
			
			if(this.permiteMantenimiento(this.mantenimientoeactivofijos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMantenimientoeActivoFijos=true;
					this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
					this.isEsNuevoMantenimientoeActivoFijos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMantenimientoeActivoFijos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMantenimientoeActivoFijos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(false);
				
				this.habilitarDeshabilitarControlesMantenimientoeActivoFijos(false);
			
												
				
				if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMantenimientoeActivoFijos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,mantenimientoeactivofijosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMantenimientoeActivoFijos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,mantenimientoeactivofijosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.mantenimientoeactivofijos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				this.mantenimientoeactivofijos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				this.mantenimientoeactivofijos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.mantenimientoeactivofijos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MantenimientoeActivoFijosModel) this.jTableDatosMantenimientoeActivoFijos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMantenimientoeActivoFijos=true;
				this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
				this.isEsNuevoMantenimientoeActivoFijos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(false);
				
				this.habilitarDeshabilitarControlesMantenimientoeActivoFijos(false);
				
				
				
				if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMantenimientoeActivoFijos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMantenimientoeActivoFijos.getRowCount()>=1) {
				jTableDatosMantenimientoeActivoFijos.removeRowSelectionInterval(0, jTableDatosMantenimientoeActivoFijos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMantenimientoeActivoFijos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(false) ;
			
			this.isEsNuevoMantenimientoeActivoFijos=false;
			
			if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMantenimientoeActivoFijos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				
				//SI ES MANUAL
				if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMantenimientoeActivoFijos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMantenimientoeActivoFijos--;			
			//MantenimientoeActivoFijos mantenimientoeactivofijosAux= new MantenimientoeActivoFijos();			
			//mantenimientoeactivofijosAux.setId(this.iIdNuevoMantenimientoeActivoFijos);
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMantenimientoeActivoFijos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
			
			this.mantenimientoeactivofijos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().add(this.mantenimientoeactivofijosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.mantenimientoeactivofijoss.add(this.mantenimientoeactivofijosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
			
			this.jTableDatosMantenimientoeActivoFijos.setRowSelectionInterval(this.getIndiceNuevoMantenimientoeActivoFijos(), this.getIndiceNuevoMantenimientoeActivoFijos());
			
			int iLastRow =  this.jTableDatosMantenimientoeActivoFijos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMantenimientoeActivoFijos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMantenimientoeActivoFijos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
			
			//SI ES MANUAL
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMantenimientoeActivoFijos();
			}
			
			//this.abrirFrameTreeMantenimientoeActivoFijos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMantenimientoeActivoFijos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMantenimientoeActivoFijos.setFileImportacion(this.jInternalFrameImportacionMantenimientoeActivoFijos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMantenimientoeActivoFijos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMantenimientoeActivoFijos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		

		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MantenimientoeActivoFijosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MantenimientoeActivoFijosBaseDesign.jrxml";
			
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
			
			this.generarReporteMantenimientoeActivoFijoss("Todos",mantenimientoeactivofijossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_usa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_usa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_usa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_usa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ller_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ller_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ller_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ller_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponsable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponsable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponsable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponsable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
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
		
		if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA:
					sNombreCampoCategoria="causa";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoria="referencia";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER:
					sNombreCampoCategoria="taller";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoria="responsable";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA:
					sNombreCampoCategoriaValor="causa";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoriaValor="referencia";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER:
					sNombreCampoCategoriaValor="taller";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoriaValor="responsable";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Causa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"causa");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Referencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"referencia");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Taller",sNombreCampoCategoria,sNombreCampoCategoriaValor,"taller");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"responsable");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
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
	
	public void jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoeactivofijos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MantenimientoeActivoFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getcausa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getreferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.gettaller());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getresponsable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getobservacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(MantenimientoeActivoFijos mantenimientoeactivofijos:mantenimientoeactivofijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mantenimientoeactivofijos.getnombre_detalle_grupo());
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
			//	this.getFilaCabeceraExportarExcelMantenimientoeActivoFijos(row);				
			//	iRow++;
			//}				
			
			//for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMantenimientoeActivoFijos(mantenimientoeactivofijosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
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
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
			
			//SI ES MANUAL
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMantenimientoeActivoFijos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
			
			//SI ES MANUAL
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMantenimientoeActivoFijos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
			
			//SI ES MANUAL
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMantenimientoeActivoFijos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMantenimientoeActivoFijos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMantenimientoeActivoFijos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMantenimientoeActivoFijos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMantenimientoeActivoFijos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMantenimientoeActivoFijos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMantenimientoeActivoFijos.setMinimumSize(dimensionMinimum);
		this.jTableDatosMantenimientoeActivoFijos.setMaximumSize(dimensionMaximum);
		this.jTableDatosMantenimientoeActivoFijos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMantenimientoeActivoFijos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMantenimientoeActivoFijos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMantenimientoeActivoFijos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMantenimientoeActivoFijos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoeActivoFijos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMantenimientoeActivoFijos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMantenimientoeActivoFijos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMantenimientoeActivoFijos();
		
		this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMantenimientoeActivoFijos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoeActivoFijos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMantenimientoeActivoFijos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMantenimientoeActivoFijos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jCheckBoxPostAccionNuevoMantenimientoeActivoFijos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jCheckBoxPostAccionSinCerrarMantenimientoeActivoFijos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jCheckBoxPostAccionSinMensajeMantenimientoeActivoFijos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMantenimientoeActivoFijos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jCheckBoxPostAccionNuevoMantenimientoeActivoFijos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jCheckBoxPostAccionSinCerrarMantenimientoeActivoFijos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jCheckBoxPostAccionSinMensajeMantenimientoeActivoFijos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMantenimientoeActivoFijos(Boolean esInicializar) throws Exception {
		try	{	
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMantenimientoeActivoFijos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMantenimientoeActivoFijos() throws Exception {
		try	{
			if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMantenimientoeActivoFijos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMantenimientoeActivoFijos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMantenimientoeActivoFijos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMantenimientoeActivoFijos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMantenimientoeActivoFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMantenimientoeActivoFijos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMantenimientoeActivoFijos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.addItem(reporte);
			}
			
			
			if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMantenimientoeActivoFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMantenimientoeActivoFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMantenimientoeActivoFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMantenimientoeActivoFijos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMantenimientoeActivoFijos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
				
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=MantenimientoeActivoFijosConstantesFunciones.getTiposSeleccionarMantenimientoeActivoFijos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=MantenimientoeActivoFijosConstantesFunciones.getTiposSeleccionarMantenimientoeActivoFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=MantenimientoeActivoFijosConstantesFunciones.getTiposSeleccionarMantenimientoeActivoFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMantenimientoeActivoFijos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaMantenimientoeActivoFijos=Long.parseLong(this.jLabelidMantenimientoeActivoFijosBusquedaMantenimientoeActivoFijos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMantenimientoeActivoFijos(Boolean esInicializar) throws Exception {				
		if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMantenimientoeActivoFijos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMantenimientoeActivoFijos() throws Exception {
		this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMantenimientoeActivoFijos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMantenimientoeActivoFijosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMantenimientoeActivoFijos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=mantenimientoeactivofijoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMantenimientoeActivoFijos.setModel(new MantenimientoeActivoFijosModel(this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMantenimientoeActivoFijos.setModel(new MantenimientoeActivoFijosModel(this.mantenimientoeactivofijoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMantenimientoeActivoFijos!=null && this.jInternalFrameOrderByMantenimientoeActivoFijos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMantenimientoeActivoFijos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO,mantenimientoeactivofijosConstantesFunciones.resaltarSeleccionarMantenimientoeActivoFijos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MantenimientoeActivoFijosConstantesFunciones.SCLASSWEBTITULO,mantenimientoeactivofijosConstantesFunciones.resaltarSeleccionarMantenimientoeActivoFijos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_ID));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostraridMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltaridMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activaridMantenimientoeActivoFijos,iSizeTabla,this,true,"idMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltaridMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activaridMantenimientoeActivoFijos,this,true,"idMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarnumero_documentoMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarnumero_documentoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarnumero_documentoMantenimientoeActivoFijos,iSizeTabla,this,true,"numero_documentoMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarnumero_documentoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarnumero_documentoMantenimientoeActivoFijos,this,true,"numero_documentoMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarcausaMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarcausaMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarcausaMantenimientoeActivoFijos,iSizeTabla,this,true,"causaMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarcausaMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarcausaMantenimientoeActivoFijos,this,true,"causaMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarreferenciaMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarreferenciaMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarreferenciaMantenimientoeActivoFijos,iSizeTabla,this,true,"referenciaMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarreferenciaMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarreferenciaMantenimientoeActivoFijos,this,true,"referenciaMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrartallerMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltartallerMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activartallerMantenimientoeActivoFijos,iSizeTabla,this,true,"tallerMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltartallerMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activartallerMantenimientoeActivoFijos,this,true,"tallerMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarfecha_inicioMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_inicioMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarfecha_inicioMantenimientoeActivoFijos,iSizeTabla,this,true,"fecha_inicioMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_inicioMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarfecha_inicioMantenimientoeActivoFijos,this,true,"fecha_inicioMantenimientoeActivoFijos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarfecha_entregaMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_entregaMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarfecha_entregaMantenimientoeActivoFijos,iSizeTabla,this,true,"fecha_entregaMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_entregaMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarfecha_entregaMantenimientoeActivoFijos,this,true,"fecha_entregaMantenimientoeActivoFijos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarcostoMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarcostoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarcostoMantenimientoeActivoFijos,iSizeTabla,this,true,"costoMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarcostoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarcostoMantenimientoeActivoFijos,this,true,"costoMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarresponsableMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarresponsableMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarresponsableMantenimientoeActivoFijos,iSizeTabla,this,true,"responsableMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarresponsableMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarresponsableMantenimientoeActivoFijos,this,true,"responsableMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarobservacionMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarobservacionMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarobservacionMantenimientoeActivoFijos,iSizeTabla,this,true,"observacionMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarobservacionMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarobservacionMantenimientoeActivoFijos,this,true,"observacionMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrartipo_movimientoMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltartipo_movimientoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activartipo_movimientoMantenimientoeActivoFijos,iSizeTabla,this,true,"tipo_movimientoMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltartipo_movimientoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activartipo_movimientoMantenimientoeActivoFijos,this,true,"tipo_movimientoMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarclaveMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarclaveMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarclaveMantenimientoeActivoFijos,iSizeTabla,this,true,"claveMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarclaveMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarclaveMantenimientoeActivoFijos,this,true,"claveMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarnombreMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombreMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarnombreMantenimientoeActivoFijos,iSizeTabla,this,true,"nombreMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombreMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarnombreMantenimientoeActivoFijos,this,true,"nombreMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarcodigo_detalle_grupoMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarcodigo_detalle_grupoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarcodigo_detalle_grupoMantenimientoeActivoFijos,iSizeTabla,this,true,"codigo_detalle_grupoMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarcodigo_detalle_grupoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarcodigo_detalle_grupoMantenimientoeActivoFijos,this,true,"codigo_detalle_grupoMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.mantenimientoeactivofijosConstantesFunciones.mostrarnombre_detalle_grupoMantenimientoeActivoFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombre_detalle_grupoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarnombre_detalle_grupoMantenimientoeActivoFijos,iSizeTabla,this,true,"nombre_detalle_grupoMantenimientoeActivoFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombre_detalle_grupoMantenimientoeActivoFijos,this.mantenimientoeactivofijosConstantesFunciones.activarnombre_detalle_grupoMantenimientoeActivoFijos,this,true,"nombre_detalle_grupoMantenimientoeActivoFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MantenimientoeActivoFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMantenimientoeActivoFijos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMantenimientoeActivoFijos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMantenimientoeActivoFijos.addColumn(tableColumn);
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
			
			this.jTableDatosMantenimientoeActivoFijos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMantenimientoeActivoFijos.moveColumn(this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMantenimientoeActivoFijos.moveColumn(this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMantenimientoeActivoFijos.moveColumn(this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMantenimientoeActivoFijos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMantenimientoeActivoFijos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMantenimientoeActivoFijos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMantenimientoeActivoFijos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMantenimientoeActivoFijos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMantenimientoeActivoFijos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=mantenimientoeactivofijoss.size()-1;
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
		//this.jTableDatosMantenimientoeActivoFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMantenimientoeActivoFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMantenimientoeActivoFijos();
			
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
				
				//this.isEsNuevoMantenimientoeActivoFijos=false;
					
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
				if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMantenimientoeActivoFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.mantenimientoeactivofijos.getsType().equals("DUPLICADO")
				   || this.mantenimientoeactivofijos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMantenimientoeActivoFijos=true;
				
				} else {
					this.isEsNuevoMantenimientoeActivoFijos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
					if(this.mantenimientoeactivofijos.getId()>=0 && !this.mantenimientoeactivofijos.getIsNew()) {						
						this.isEsNuevoMantenimientoeActivoFijos=false;
						
					} else {
						this.isEsNuevoMantenimientoeActivoFijos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMantenimientoeActivoFijos(esRelaciones);						
				
				this.seleccionarMantenimientoeActivoFijos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.mantenimientoeactivofijos.getId()<0) {
					this.isEsNuevoMantenimientoeActivoFijos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMantenimientoeActivoFijos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMantenimientoeActivoFijos(evt,rowIndex);
				}	
				
				if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MantenimientoeActivoFijos: " + this.dDif); 
					}
				}								
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMantenimientoeActivoFijos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.mantenimientoeactivofijos)) {
					if(this.mantenimientoeactivofijos.getId()>0) {
						this.mantenimientoeactivofijos.setIsDeleted(true);
						
						this.mantenimientoeactivofijossEliminados.add(this.mantenimientoeactivofijos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().remove(this.mantenimientoeactivofijos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijoss.remove(this.mantenimientoeactivofijos);				
					}
					
					
					((MantenimientoeActivoFijosModel) this.jTableDatosMantenimientoeActivoFijos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMantenimientoeActivoFijos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMantenimientoeActivoFijos) {
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMantenimientoeActivoFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMantenimientoeActivoFijos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMantenimientoeActivoFijos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMantenimientoeActivoFijos(mantenimientoeactivofijos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMantenimientoeActivoFijos(mantenimientoeactivofijos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMantenimientoeActivoFijos(mantenimientoeactivofijos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoeActivoFijos(mantenimientoeactivofijos);
	}
	
	public void setVariablesObjetoActualToFormularioMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getId().toString());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getnumero_documento());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getcausa());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getreferencia());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.gettaller());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.setDate(mantenimientoeactivofijos.getfecha_inicio());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.setDate(mantenimientoeactivofijos.getfecha_entrega());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getcosto().toString());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getresponsable());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getobservacion());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.gettipo_movimiento());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getclave());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getnombre());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getnombre_detalle_grupo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MantenimientoeActivoFijos mantenimientoeactivofijosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,mantenimientoeactivofijosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MantenimientoeActivoFijos mantenimientoeactivofijosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				mantenimientoeactivofijosLocal=this.mantenimientoeactivofijos;
			} else {
				mantenimientoeactivofijosLocal=this.mantenimientoeactivofijosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(mantenimientoeactivofijosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMantenimientoeActivoFijos(mantenimientoeactivofijosLocal,true);
					
					if(mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(mantenimientoeactivofijosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(mantenimientoeactivofijosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(mantenimientoeactivofijos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(mantenimientoeactivofijos);
	}
	
	public void setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(mantenimientoeactivofijos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.getText()==null || this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.getText()=="" || this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.getText()=="Id") {
				this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.setText("0");
			}

			if(conColumnasBase) {mantenimientoeactivofijos.setId(Long.parseLong(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelIdMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setnumero_documento(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnumero_documentoMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setcausa(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcausaMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setreferencia(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelreferenciaMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.settaller(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabeltallerMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setfecha_inicio(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelfecha_inicioMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setfecha_entrega(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelfecha_entregaMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcostoMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setresponsable(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelresponsableMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setobservacion(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelobservacionMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.settipo_movimiento(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabeltipo_movimientoMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setclave(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelclaveMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setnombre(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnombreMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelcodigo_detalle_grupoMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mantenimientoeactivofijos.setnombre_detalle_grupo(this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelnombre_detalle_grupoMantenimientoeActivoFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijosBean,MantenimientoeActivoFijos mantenimientoeactivofijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijosOrigen,MantenimientoeActivoFijos mantenimientoeactivofijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getId()!=null && !mantenimientoeactivofijosOrigen.getId().equals(0L))) {mantenimientoeactivofijos.setId(mantenimientoeactivofijosOrigen.getId());}}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getnumero_documento()!=null && !mantenimientoeactivofijosOrigen.getnumero_documento().equals(""))) {mantenimientoeactivofijos.setnumero_documento(mantenimientoeactivofijosOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getcausa()!=null && !mantenimientoeactivofijosOrigen.getcausa().equals(""))) {mantenimientoeactivofijos.setcausa(mantenimientoeactivofijosOrigen.getcausa());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getreferencia()!=null && !mantenimientoeactivofijosOrigen.getreferencia().equals(""))) {mantenimientoeactivofijos.setreferencia(mantenimientoeactivofijosOrigen.getreferencia());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.gettaller()!=null && !mantenimientoeactivofijosOrigen.gettaller().equals(""))) {mantenimientoeactivofijos.settaller(mantenimientoeactivofijosOrigen.gettaller());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getfecha_inicio()!=null && !mantenimientoeactivofijosOrigen.getfecha_inicio().equals(new Date()))) {mantenimientoeactivofijos.setfecha_inicio(mantenimientoeactivofijosOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getfecha_entrega()!=null && !mantenimientoeactivofijosOrigen.getfecha_entrega().equals(new Date()))) {mantenimientoeactivofijos.setfecha_entrega(mantenimientoeactivofijosOrigen.getfecha_entrega());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getcosto()!=null && !mantenimientoeactivofijosOrigen.getcosto().equals(0.0))) {mantenimientoeactivofijos.setcosto(mantenimientoeactivofijosOrigen.getcosto());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getresponsable()!=null && !mantenimientoeactivofijosOrigen.getresponsable().equals(""))) {mantenimientoeactivofijos.setresponsable(mantenimientoeactivofijosOrigen.getresponsable());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getobservacion()!=null && !mantenimientoeactivofijosOrigen.getobservacion().equals(""))) {mantenimientoeactivofijos.setobservacion(mantenimientoeactivofijosOrigen.getobservacion());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.gettipo_movimiento()!=null && !mantenimientoeactivofijosOrigen.gettipo_movimiento().equals(""))) {mantenimientoeactivofijos.settipo_movimiento(mantenimientoeactivofijosOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getclave()!=null && !mantenimientoeactivofijosOrigen.getclave().equals(""))) {mantenimientoeactivofijos.setclave(mantenimientoeactivofijosOrigen.getclave());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getnombre()!=null && !mantenimientoeactivofijosOrigen.getnombre().equals(""))) {mantenimientoeactivofijos.setnombre(mantenimientoeactivofijosOrigen.getnombre());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getcodigo_detalle_grupo()!=null && !mantenimientoeactivofijosOrigen.getcodigo_detalle_grupo().equals(""))) {mantenimientoeactivofijos.setcodigo_detalle_grupo(mantenimientoeactivofijosOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosOrigen.getnombre_detalle_grupo()!=null && !mantenimientoeactivofijosOrigen.getnombre_detalle_grupo().equals(""))) {mantenimientoeactivofijos.setnombre_detalle_grupo(mantenimientoeactivofijosOrigen.getnombre_detalle_grupo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getId().toString());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getnumero_documento());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getcausa());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getreferencia());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.gettaller());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.setDate(mantenimientoeactivofijos.getfecha_inicio());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.setDate(mantenimientoeactivofijos.getfecha_entrega());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getcosto().toString());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getresponsable());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getobservacion());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.gettipo_movimiento());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getclave());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getnombre());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setText(mantenimientoeactivofijos.getnombre_detalle_grupo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMantenimientoeActivoFijos(MantenimientoeActivoFijosBean mantenimientoeactivofijosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getId().toString());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getnumero_documento());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getcausa());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getreferencia());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.gettaller());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.setDate(mantenimientoeactivofijosBean.getfecha_inicio());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.setDate(mantenimientoeactivofijosBean.getfecha_entrega());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getcosto().toString());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getresponsable());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getobservacion());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getclave());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getnombre());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setText(mantenimientoeactivofijosBean.getnombre_detalle_grupo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMantenimientoeActivoFijos(MantenimientoeActivoFijosParameterReturnGeneral mantenimientoeactivofijosReturnGeneral,MantenimientoeActivoFijosBean mantenimientoeactivofijosBean,Boolean conDefault) throws Exception { 
		try {
			MantenimientoeActivoFijos mantenimientoeactivofijosLocal=new MantenimientoeActivoFijos();
			
			mantenimientoeactivofijosLocal=mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getId()!=null && !mantenimientoeactivofijosLocal.getId().equals(0L))) {mantenimientoeactivofijosBean.setId(mantenimientoeactivofijosLocal.getId());}}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getnumero_documento()!=null && !mantenimientoeactivofijosLocal.getnumero_documento().equals(""))) {mantenimientoeactivofijosBean.setnumero_documento(mantenimientoeactivofijosLocal.getnumero_documento());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getcausa()!=null && !mantenimientoeactivofijosLocal.getcausa().equals(""))) {mantenimientoeactivofijosBean.setcausa(mantenimientoeactivofijosLocal.getcausa());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getreferencia()!=null && !mantenimientoeactivofijosLocal.getreferencia().equals(""))) {mantenimientoeactivofijosBean.setreferencia(mantenimientoeactivofijosLocal.getreferencia());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.gettaller()!=null && !mantenimientoeactivofijosLocal.gettaller().equals(""))) {mantenimientoeactivofijosBean.settaller(mantenimientoeactivofijosLocal.gettaller());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getfecha_inicio()!=null && !mantenimientoeactivofijosLocal.getfecha_inicio().equals(new Date()))) {mantenimientoeactivofijosBean.setfecha_inicio(mantenimientoeactivofijosLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getfecha_entrega()!=null && !mantenimientoeactivofijosLocal.getfecha_entrega().equals(new Date()))) {mantenimientoeactivofijosBean.setfecha_entrega(mantenimientoeactivofijosLocal.getfecha_entrega());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getcosto()!=null && !mantenimientoeactivofijosLocal.getcosto().equals(0.0))) {mantenimientoeactivofijosBean.setcosto(mantenimientoeactivofijosLocal.getcosto());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getresponsable()!=null && !mantenimientoeactivofijosLocal.getresponsable().equals(""))) {mantenimientoeactivofijosBean.setresponsable(mantenimientoeactivofijosLocal.getresponsable());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getobservacion()!=null && !mantenimientoeactivofijosLocal.getobservacion().equals(""))) {mantenimientoeactivofijosBean.setobservacion(mantenimientoeactivofijosLocal.getobservacion());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.gettipo_movimiento()!=null && !mantenimientoeactivofijosLocal.gettipo_movimiento().equals(""))) {mantenimientoeactivofijosBean.settipo_movimiento(mantenimientoeactivofijosLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getclave()!=null && !mantenimientoeactivofijosLocal.getclave().equals(""))) {mantenimientoeactivofijosBean.setclave(mantenimientoeactivofijosLocal.getclave());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getnombre()!=null && !mantenimientoeactivofijosLocal.getnombre().equals(""))) {mantenimientoeactivofijosBean.setnombre(mantenimientoeactivofijosLocal.getnombre());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getcodigo_detalle_grupo()!=null && !mantenimientoeactivofijosLocal.getcodigo_detalle_grupo().equals(""))) {mantenimientoeactivofijosBean.setcodigo_detalle_grupo(mantenimientoeactivofijosLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && mantenimientoeactivofijosLocal.getnombre_detalle_grupo()!=null && !mantenimientoeactivofijosLocal.getnombre_detalle_grupo().equals(""))) {mantenimientoeactivofijosBean.setnombre_detalle_grupo(mantenimientoeactivofijosLocal.getnombre_detalle_grupo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMantenimientoeActivoFijosGenerico(Long idMantenimientoeActivoFijosSeleccionado,JComboBox jComboBoxMantenimientoeActivoFijos,List<MantenimientoeActivoFijos> mantenimientoeactivofijossLocal)throws Exception {
		try {
			MantenimientoeActivoFijos  mantenimientoeactivofijosTemp=null;

			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijossLocal) {
				if(mantenimientoeactivofijosAux.getId()!=null && mantenimientoeactivofijosAux.getId().equals(idMantenimientoeActivoFijosSeleccionado)) {
					mantenimientoeactivofijosTemp=mantenimientoeactivofijosAux;
					break;
				}
			}

			jComboBoxMantenimientoeActivoFijos.setSelectedItem(mantenimientoeactivofijosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMantenimientoeActivoFijosGenerico(JComboBox jComboBoxMantenimientoeActivoFijos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMantenimientoeActivoFijos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMantenimientoeActivoFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMantenimientoeActivoFijos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMantenimientoeActivoFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMantenimientoeActivoFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMantenimientoeActivoFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mantenimientoeactivofijos=(MantenimientoeActivoFijos) mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mantenimientoeactivofijos =(MantenimientoeActivoFijos) mantenimientoeactivofijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!mantenimientoeactivofijos.getIsNew() && !mantenimientoeactivofijos.getIsChanged() && !mantenimientoeactivofijos.getIsDeleted()) {
				sDescripcion=mantenimientoeactivofijos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=mantenimientoeactivofijos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MantenimientoeActivoFijos mantenimientoeactivofijosRow=new MantenimientoeActivoFijos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mantenimientoeactivofijosRow=(MantenimientoeActivoFijos) mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mantenimientoeactivofijosRow=(MantenimientoeActivoFijos) mantenimientoeactivofijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos));			
			this.jButtonDuplicarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaDuplicarMantenimientoeActivoFijos && this.isPermisoDuplicarMantenimientoeActivoFijos));			
			this.jButtonCopiarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaCopiarMantenimientoeActivoFijos && this.isPermisoCopiarMantenimientoeActivoFijos));
			this.jButtonVerFormMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaVerFormMantenimientoeActivoFijos && this.isPermisoVerFormMantenimientoeActivoFijos));
			
			this.jButtonAbrirOrderByMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos && this.isPermisoOrdenMantenimientoeActivoFijos));			
			
			this.jButtonNuevoRelacionesMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos));			
			this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaModificarMantenimientoeActivoFijos && this.isPermisoActualizarMantenimientoeActivoFijos));	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos && this.isPermisoActualizarMantenimientoeActivoFijos));	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos && this.isPermisoEliminarMantenimientoeActivoFijos));
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarMantenimientoeActivoFijos.setVisible(this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos);							
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));			
			
			}
						
			this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos));						
			this.jButtonDuplicarToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaDuplicarMantenimientoeActivoFijos && this.isPermisoDuplicarMantenimientoeActivoFijos));						
			this.jButtonCopiarToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaCopiarMantenimientoeActivoFijos && this.isPermisoCopiarMantenimientoeActivoFijos));			
			this.jButtonVerFormToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaVerFormMantenimientoeActivoFijos && this.isPermisoVerFormMantenimientoeActivoFijos));			
			this.jButtonAbrirOrderByToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos && this.isPermisoOrdenMantenimientoeActivoFijos));
			this.jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos));			
			this.jButtonNuevoGuardarCambiosToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));			
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaModificarMantenimientoeActivoFijos && this.isPermisoActualizarMantenimientoeActivoFijos));	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos  && this.isPermisoActualizarMantenimientoeActivoFijos));	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos && this.isPermisoEliminarMantenimientoeActivoFijos));
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarToolBarMantenimientoeActivoFijos.setVisible(this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos);				
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos));			
			this.jMenuItemDuplicarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaDuplicarMantenimientoeActivoFijos && this.isPermisoDuplicarMantenimientoeActivoFijos));			
			this.jMenuItemCopiarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaCopiarMantenimientoeActivoFijos && this.isPermisoCopiarMantenimientoeActivoFijos));			
			this.jMenuItemVerFormMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaVerFormMantenimientoeActivoFijos && this.isPermisoVerFormMantenimientoeActivoFijos));			
			this.jMenuItemAbrirOrderByMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos && this.isPermisoOrdenMantenimientoeActivoFijos));			
			//this.jMenuItemMostrarOcultarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos && this.isPermisoOrdenMantenimientoeActivoFijos));
			this.jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos && this.isPermisoOrdenMantenimientoeActivoFijos));			
			//this.jMenuItemDetalleMostrarOcultarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos && this.isPermisoOrdenMantenimientoeActivoFijos));			
			this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos));			
			this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos && this.isPermisoNuevoMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));									
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemModificarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaModificarMantenimientoeActivoFijos && this.isPermisoActualizarMantenimientoeActivoFijos));	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemActualizarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos && this.isPermisoActualizarMantenimientoeActivoFijos));	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemEliminarMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos && this.isPermisoEliminarMantenimientoeActivoFijos));
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemCancelarMantenimientoeActivoFijos.setVisible(this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos);				
			}
			
			this.jMenuItemGuardarCambiosMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));						
			this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=this.jButtonNuevoMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaDuplicarMantenimientoeActivoFijos=this.jButtonDuplicarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaCopiarMantenimientoeActivoFijos=this.jButtonCopiarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaVerFormMantenimientoeActivoFijos=this.jButtonVerFormMantenimientoeActivoFijos.isVisible();
			
			this.isVisibilidadCeldaOrdenMantenimientoeActivoFijos=this.jButtonAbrirOrderByMantenimientoeActivoFijos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=this.jButtonNuevoRelacionesMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=this.jButtonModificarMantenimientoeActivoFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=this.jButtonNuevoToolBarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=this.jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarToolBarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarToolBarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarToolBarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarToolBarMantenimientoeActivoFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=this.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=this.jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=this.jMenuItemNuevoMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemModificarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemActualizarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemEliminarMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemCancelarMantenimientoeActivoFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=this.jMenuItemGuardarCambiosMantenimientoeActivoFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMantenimientoeActivoFijos(Boolean esInicializar) {
		if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
				//if(this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMantenimientoeActivoFijos();
			}
			
			this.inicializarActualizarBindingBotonesManualMantenimientoeActivoFijos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMantenimientoeActivoFijos() {
		this.jButtonNuevoMantenimientoeActivoFijos.setVisible(this.isPermisoNuevoMantenimientoeActivoFijos);			
		this.jButtonDuplicarMantenimientoeActivoFijos.setVisible(this.isPermisoDuplicarMantenimientoeActivoFijos);			
		this.jButtonCopiarMantenimientoeActivoFijos.setVisible(this.isPermisoCopiarMantenimientoeActivoFijos);			
		this.jButtonVerFormMantenimientoeActivoFijos.setVisible(this.isPermisoVerFormMantenimientoeActivoFijos);			
		
		this.jButtonAbrirOrderByMantenimientoeActivoFijos.setVisible(this.isPermisoOrdenMantenimientoeActivoFijos);					
		
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos.setVisible(this.isPermisoNuevoMantenimientoeActivoFijos);			
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarMantenimientoeActivoFijos.setVisible(this.isPermisoActualizarMantenimientoeActivoFijos);	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarMantenimientoeActivoFijos.setVisible(this.isPermisoActualizarMantenimientoeActivoFijos);	
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarMantenimientoeActivoFijos.setVisible(this.isPermisoEliminarMantenimientoeActivoFijos);
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarMantenimientoeActivoFijos.setVisible(this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos);						
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.setVisible(this.isPermisoGuardarCambiosMantenimientoeActivoFijos);							
		}
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.setVisible(this.isPermisoActualizarMantenimientoeActivoFijos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMantenimientoeActivoFijos() {
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarMantenimientoeActivoFijos.setVisible(this.isPermisoActualizarMantenimientoeActivoFijos);	
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarMantenimientoeActivoFijos.setVisible(this.isPermisoActualizarMantenimientoeActivoFijos);	
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarMantenimientoeActivoFijos.setVisible(this.isPermisoEliminarMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarMantenimientoeActivoFijos.setVisible(this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos);							
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.setVisible((this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos && this.isPermisoGuardarCambiosMantenimientoeActivoFijos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMantenimientoeActivoFijos() {
		if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMantenimientoeActivoFijos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMantenimientoeActivoFijos() {
	}
	
	public void jTableDatosMantenimientoeActivoFijosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMantenimientoeActivoFijos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.mantenimientoeactivofijos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMantenimientoeActivoFijosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMantenimientoeActivoFijos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMantenimientoeActivoFijos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMantenimientoeActivoFijos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.mantenimientoeactivofijosLogic.getConnexion());

				if(this.mantenimientoeactivofijos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.mantenimientoeactivofijos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMantenimientoeActivoFijos=(TitledBorder)this.jScrollPanelDatosMantenimientoeActivoFijos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMantenimientoeActivoFijos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.mantenimientoeactivofijos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.mantenimientoeactivofijos.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncausaMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getcausa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where causa like '%"+this.mantenimientoeactivofijos.getcausa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonreferenciaMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getreferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where referencia like '%"+this.mantenimientoeactivofijos.getreferencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontallerMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.gettaller()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where taller like '%"+this.mantenimientoeactivofijos.gettaller()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.mantenimientoeactivofijos.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega = '"+Funciones2.getStringPostgresDate(this.mantenimientoeactivofijos.getfecha_entrega())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.mantenimientoeactivofijos.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonresponsableMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getresponsable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where responsable like '%"+this.mantenimientoeactivofijos.getresponsable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.mantenimientoeactivofijos.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.mantenimientoeactivofijos.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.mantenimientoeactivofijos.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.mantenimientoeactivofijos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.mantenimientoeactivofijos.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.getmantenimientoeactivofijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mantenimientoeactivofijos==null) {
						this.mantenimientoeactivofijos = new MantenimientoeActivoFijos();
					}

					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);
				}

				if(this.mantenimientoeactivofijos.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.mantenimientoeactivofijos.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);

			this.getMantenimientoeActivoFijossBusquedaMantenimientoeActivoFijos();

			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);

			//if(MantenimientoeActivoFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMantenimientoeActivoFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);

			this.getMantenimientoeActivoFijossFK_IdEmpresa();

			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);

			//if(MantenimientoeActivoFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mantenimientoeactivofijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMantenimientoeActivoFijos() {
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setVisible(false);	    			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.dispose();
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
			this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.dispose();
			this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos=null;
		}
		
		if(this.jInternalFrameImportacionMantenimientoeActivoFijos!=null) {
			this.jInternalFrameImportacionMantenimientoeActivoFijos.setVisible(false);	    			
			this.jInternalFrameImportacionMantenimientoeActivoFijos.dispose();
			this.jInternalFrameImportacionMantenimientoeActivoFijos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMantenimientoeActivoFijos();
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
			
			if(sTipo.equals("NuevoMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMantenimientoeActivoFijos")) {
				jButtonDuplicarMantenimientoeActivoFijosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMantenimientoeActivoFijos")) {
				jButtonCopiarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormMantenimientoeActivoFijos")) {
				jButtonVerFormMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMantenimientoeActivoFijos")) {
				jButtonDuplicarMantenimientoeActivoFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMantenimientoeActivoFijos")) {
				jButtonDuplicarMantenimientoeActivoFijosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMantenimientoeActivoFijos")) {
				jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMantenimientoeActivoFijos")) {
				jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMantenimientoeActivoFijos")) {
				jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMantenimientoeActivoFijos")) {
				jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMantenimientoeActivoFijos")) {
				jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMantenimientoeActivoFijos")) {
				jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarMantenimientoeActivoFijos")) {
				jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMantenimientoeActivoFijos")) {
				jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMantenimientoeActivoFijos")) {
				jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarMantenimientoeActivoFijos")) {
				jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMantenimientoeActivoFijos")) {
				jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMantenimientoeActivoFijos")) {
				jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarMantenimientoeActivoFijos")) {
				jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMantenimientoeActivoFijos")) {
				jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMantenimientoeActivoFijos")) {
				jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMantenimientoeActivoFijos")) {
				jButtonMostrarOcultarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMantenimientoeActivoFijos")) {
				jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMantenimientoeActivoFijos")) {
				jButtonCopiarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMantenimientoeActivoFijos")) {
				jButtonVerFormMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMantenimientoeActivoFijos")) {
				jButtonCopiarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMantenimientoeActivoFijos")) {
				jButtonVerFormMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMantenimientoeActivoFijos")) {
				jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMantenimientoeActivoFijos")) {
				jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMantenimientoeActivoFijos")) {
				jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMantenimientoeActivoFijos")) {
				jButtonAnterioresMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMantenimientoeActivoFijos")) {
				jButtonAnterioresMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMantenimientoeActivoFijos")) {
				jButtonAnterioresMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMantenimientoeActivoFijos")) {
				jButtonSiguientesMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMantenimientoeActivoFijos")) {
				jButtonSiguientesMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMantenimientoeActivoFijos")) {
				jButtonSiguientesMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMantenimientoeActivoFijos") || sTipo.equals("MenuItemDetalleAbrirOrderByMantenimientoeActivoFijos")) {
				jButtonAbrirOrderByMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMantenimientoeActivoFijos") || sTipo.equals("MenuItemDetalleMostrarOcultarMantenimientoeActivoFijos")) {
				jButtonMostrarOcultarMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMantenimientoeActivoFijos")) {
				jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMantenimientoeActivoFijos")) {
				jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMantenimientoeActivoFijos")) {
				jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMantenimientoeActivoFijos")) {
				jButtonCerrarReporteDinamicoMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMantenimientoeActivoFijos")) {
				jButtonGenerarReporteDinamicoMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMantenimientoeActivoFijos")) {
				
				jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMantenimientoeActivoFijos")) {
				jButtonCerrarImportacionMantenimientoeActivoFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMantenimientoeActivoFijos")) {
				
				jButtonGenerarImportacionMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMantenimientoeActivoFijos")) {
				
				jButtonAbrirImportacionMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMantenimientoeActivoFijos")) {
				jComboBoxTiposAccionesMantenimientoeActivoFijosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMantenimientoeActivoFijos")) {
				jComboBoxTiposRelacionesMantenimientoeActivoFijosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMantenimientoeActivoFijos")) {
				jComboBoxTiposAccionesMantenimientoeActivoFijosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMantenimientoeActivoFijos")) {
				
				jComboBoxTiposSeleccionarMantenimientoeActivoFijosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMantenimientoeActivoFijos")) {
				jTextFieldValorCampoGeneralMantenimientoeActivoFijosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMantenimientoeActivoFijos")) {
				jButtonAbrirOrderByMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMantenimientoeActivoFijos")) {
				jButtonAbrirOrderByMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMantenimientoeActivoFijos")) {
				jButtonCerrarOrderByMantenimientoeActivoFijosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMantenimientoeActivoFijosBusqueda")) {
				this.jButtonidMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMantenimientoeActivoFijosUpdate")) {
				this.jButtonid_empresaMantenimientoeActivoFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMantenimientoeActivoFijosBusqueda")) {
				this.jButtonid_empresaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoMantenimientoeActivoFijosBusqueda")) {
				this.jButtonnumero_documentoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("causaMantenimientoeActivoFijosBusqueda")) {
				this.jButtoncausaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaMantenimientoeActivoFijosBusqueda")) {
				this.jButtonreferenciaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallerMantenimientoeActivoFijosBusqueda")) {
				this.jButtontallerMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioMantenimientoeActivoFijosBusqueda")) {
				this.jButtonfecha_inicioMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaMantenimientoeActivoFijosBusqueda")) {
				this.jButtonfecha_entregaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoMantenimientoeActivoFijosBusqueda")) {
				this.jButtoncostoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableMantenimientoeActivoFijosBusqueda")) {
				this.jButtonresponsableMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionMantenimientoeActivoFijosBusqueda")) {
				this.jButtonobservacionMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoMantenimientoeActivoFijosBusqueda")) {
				this.jButtontipo_movimientoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveMantenimientoeActivoFijosBusqueda")) {
				this.jButtonclaveMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMantenimientoeActivoFijosBusqueda")) {
				this.jButtonnombreMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoMantenimientoeActivoFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoMantenimientoeActivoFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos")) {
				this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijosActionPerformed(evt);
			}
			
			;
			
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMantenimientoeActivoFijos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MantenimientoeActivoFijos mantenimientoeactivofijosLocal=null;
			
			if(!this.getEsControlTabla()) {
				mantenimientoeactivofijosLocal=this.mantenimientoeactivofijos;
			} else {
				mantenimientoeactivofijosLocal=this.mantenimientoeactivofijosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
							
				
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
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
			
			


			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
								
						
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
								
				
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
							
				
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
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
			
			


			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
								
				
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMantenimientoeActivoFijos")) {
					jCheckBoxSeleccionarTodosMantenimientoeActivoFijosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMantenimientoeActivoFijos")) {
					jCheckBoxSeleccionadosMantenimientoeActivoFijosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMantenimientoeActivoFijos")) {
					
				}
				
				


				
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
												
				
				


				
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
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
			
			


			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mantenimientoeactivofijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mantenimientoeactivofijos);
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
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
				
				


				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MantenimientoeActivoFijos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MantenimientoeActivoFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMantenimientoeActivoFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mantenimientoeactivofijosAnterior =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMantenimientoeActivoFijos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMantenimientoeActivoFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMantenimientoeActivoFijos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.mantenimientoeactivofijos =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.mantenimientoeactivofijos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMantenimientoeActivoFijos")) {
				
				}
				
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMantenimientoeActivoFijos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMantenimientoeActivoFijos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMantenimientoeActivoFijos")) {
			
			}
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMantenimientoeActivoFijos();
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
			if(sTipo.equals("NuevoMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMantenimientoeActivoFijos")) {
				jButtonDuplicarMantenimientoeActivoFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMantenimientoeActivoFijos")) {
				jButtonCopiarMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMantenimientoeActivoFijos")) {
				jButtonVerFormMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMantenimientoeActivoFijos")) {
				jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMantenimientoeActivoFijos")) {
				jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMantenimientoeActivoFijos")) {
				jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMantenimientoeActivoFijos")) {
				jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMantenimientoeActivoFijos")) {
				jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMantenimientoeActivoFijos")) {
				jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMantenimientoeActivoFijos")) {
				jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMantenimientoeActivoFijos")) {
				jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMantenimientoeActivoFijos")) {
				jButtonAbrirOrderByMantenimientoeActivoFijosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMantenimientoeActivoFijos")) {
				jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMantenimientoeActivoFijos")) {
				jButtonAnterioresMantenimientoeActivoFijosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMantenimientoeActivoFijos")) {
				jButtonSiguientesMantenimientoeActivoFijosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMantenimientoeActivoFijosBusqueda")) {
				this.jButtonidMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMantenimientoeActivoFijosUpdate")) {
				this.jButtonid_empresaMantenimientoeActivoFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMantenimientoeActivoFijosBusqueda")) {
				this.jButtonid_empresaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoMantenimientoeActivoFijosBusqueda")) {
				this.jButtonnumero_documentoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("causaMantenimientoeActivoFijosBusqueda")) {
				this.jButtoncausaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaMantenimientoeActivoFijosBusqueda")) {
				this.jButtonreferenciaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallerMantenimientoeActivoFijosBusqueda")) {
				this.jButtontallerMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioMantenimientoeActivoFijosBusqueda")) {
				this.jButtonfecha_inicioMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaMantenimientoeActivoFijosBusqueda")) {
				this.jButtonfecha_entregaMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoMantenimientoeActivoFijosBusqueda")) {
				this.jButtoncostoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableMantenimientoeActivoFijosBusqueda")) {
				this.jButtonresponsableMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionMantenimientoeActivoFijosBusqueda")) {
				this.jButtonobservacionMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoMantenimientoeActivoFijosBusqueda")) {
				this.jButtontipo_movimientoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveMantenimientoeActivoFijosBusqueda")) {
				this.jButtonclaveMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMantenimientoeActivoFijosBusqueda")) {
				this.jButtonnombreMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoMantenimientoeActivoFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoMantenimientoeActivoFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusquedaActionPerformed(evt);
			}
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMantenimientoeActivoFijos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMantenimientoeActivoFijos")) {
				closingInternalFrameMantenimientoeActivoFijos();
				
			} else if(sTipo.equals("jButtonCancelarMantenimientoeActivoFijos")) {
				JInternalFrameBase jInternalFrameDetalleFormMantenimientoeActivoFijos = (JInternalFrameBase)evt.getSource();
	            	
	            MantenimientoeActivoFijosBeanSwingJInternalFrame jInternalFrameParent=(MantenimientoeActivoFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormMantenimientoeActivoFijos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMantenimientoeActivoFijosActionPerformed(null);
			}
			
			MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mantenimientoeactivofijos,new Object(),this.mantenimientoeactivofijosParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMantenimientoeActivoFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMantenimientoeActivoFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMantenimientoeActivoFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.mantenimientoeactivofijos)) {
			if(!esControlTabla) {
				if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);			
				}
				
				if(this.mantenimientoeactivofijosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral,this.mantenimientoeactivofijosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.mantenimientoeactivofijosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMantenimientoeActivoFijos(classes,this.mantenimientoeactivofijosReturnGeneral,this.mantenimientoeactivofijosBean,false);
					}
						
					if(this.mantenimientoeactivofijosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos());	
					}
						
					if(this.mantenimientoeactivofijosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMantenimientoeActivoFijos(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos(),classes);//this.mantenimientoeactivofijosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMantenimientoeActivoFijos(this.mantenimientoeactivofijos,classes);//this.mantenimientoeactivofijosBean);									
				}
			
				if(MantenimientoeActivoFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMantenimientoeActivoFijos(this.mantenimientoeactivofijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMantenimientoeActivoFijos(this.mantenimientoeactivofijos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.mantenimientoeactivofijosAnterior!=null) {
						this.mantenimientoeactivofijos=this.mantenimientoeactivofijosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mantenimientoeactivofijosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos(),mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijos(),this.mantenimientoeactivofijoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMantenimientoeActivoFijos.repaint();
				
				//((AbstractTableModel) this.jTableDatosMantenimientoeActivoFijos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMantenimientoeActivoFijos();
			}
		}
	}
	
	public void actualizarVisualTableDatosMantenimientoeActivoFijos() throws Exception {
		
		MantenimientoeActivoFijosModel mantenimientoeactivofijosModel=(MantenimientoeActivoFijosModel)this.jTableDatosMantenimientoeActivoFijos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mantenimientoeactivofijosModel.mantenimientoeactivofijoss=this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			mantenimientoeactivofijosModel.mantenimientoeactivofijoss=this.mantenimientoeactivofijoss;
		}
		
		
		((MantenimientoeActivoFijosModel) this.jTableDatosMantenimientoeActivoFijos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMantenimientoeActivoFijos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmantenimientoeactivofijosAnterior(),this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmantenimientoeactivofijosAnterior(),this.mantenimientoeactivofijoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMantenimientoeActivoFijos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
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
										
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mantenimientoeactivofijos,new Object(),generalEntityParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MantenimientoeActivoFijosConstantesFunciones.getClassesRelationshipsOfMantenimientoeActivoFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MantenimientoeActivoFijosConstantesFunciones.getClassesRelationshipsFromStringsOfMantenimientoeActivoFijos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMantenimientoeActivoFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mantenimientoeactivofijos,new Object(),generalEntityParameterGeneral,this.mantenimientoeactivofijosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMantenimientoeActivoFijos(MantenimientoeActivoFijosBean mantenimientoeactivofijosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMantenimientoeActivoFijos(ArrayList<Classe> classes,MantenimientoeActivoFijosReturnGeneral mantenimientoeactivofijosReturnGeneral,MantenimientoeActivoFijosBean mantenimientoeactivofijosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.mantenimientoeactivofijos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos = new MantenimientoeActivoFijosDetalleFormJInternalFrame(jDesktopPane,this.mantenimientoeactivofijosSessionBean.getConGuardarRelaciones(),this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setVisible(false);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setSelected(false);						
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.mantenimientoeactivofijosLogic=this.mantenimientoeactivofijosLogic;
		
		this.cargarCombosFrameForeignKeyMantenimientoeActivoFijos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMantenimientoeActivoFijos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMantenimientoeActivoFijos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMantenimientoeActivoFijos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMantenimientoeActivoFijos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMantenimientoeActivoFijos"));
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"ModificarMantenimientoeActivoFijos"));

		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarToolBarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarMantenimientoeActivoFijos"));
					
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemModificarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarMantenimientoeActivoFijos"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"ActualizarMantenimientoeActivoFijos"));
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarToolBarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMantenimientoeActivoFijos"));
						
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemActualizarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMantenimientoeActivoFijos"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"EliminarMantenimientoeActivoFijos"));
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarMantenimientoeActivoFijos"));
								
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemEliminarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMantenimientoeActivoFijos"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CancelarMantenimientoeActivoFijos"));
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarMantenimientoeActivoFijos"));
					
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemCancelarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMantenimientoeActivoFijos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemDetalleCerrarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMantenimientoeActivoFijos"));		
		
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMantenimientoeActivoFijos"));
		
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMantenimientoeActivoFijos"));
		
		
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMantenimientoeActivoFijos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonidMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"idMantenimientoeActivoFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonid_empresaMantenimientoeActivoFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoeActivoFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonid_empresaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncausaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"causaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonreferenciaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"referenciaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtontallerMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"tallerMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncostoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"costoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonresponsableMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"responsableMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonobservacionMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"observacionMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonclaveMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnombreMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoMantenimientoeActivoFijosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMantenimientoeActivoFijos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMantenimientoeActivoFijos"));
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMantenimientoeActivoFijos"));
		}
		
		this.jTableDatosMantenimientoeActivoFijos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMantenimientoeActivoFijos"));
		
		this.jTableDatosMantenimientoeActivoFijos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMantenimientoeActivoFijos"));
		
		this.jButtonNuevoMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"NuevoMantenimientoeActivoFijos"));
		
		this.jButtonDuplicarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"DuplicarMantenimientoeActivoFijos"));
		
		this.jButtonCopiarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"CopiarMantenimientoeActivoFijos"));
		
		this.jButtonVerFormMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"VerFormMantenimientoeActivoFijos"));
		
		
		this.jButtonNuevoToolBarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"NuevoToolBarMantenimientoeActivoFijos"));
			
		this.jButtonDuplicarToolBarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMantenimientoeActivoFijos"));
			
		this.jMenuItemNuevoMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMantenimientoeActivoFijos"));
			
		this.jMenuItemDuplicarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMantenimientoeActivoFijos"));		
		
		
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMantenimientoeActivoFijos"));
		
		
		this.jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMantenimientoeActivoFijos"));
			
		this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMantenimientoeActivoFijos"));		
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"ModificarMantenimientoeActivoFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonModificarToolBarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarMantenimientoeActivoFijos"));
			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemModificarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarMantenimientoeActivoFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"ActualizarMantenimientoeActivoFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonActualizarToolBarMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMantenimientoeActivoFijos"));
				
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemActualizarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMantenimientoeActivoFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"EliminarMantenimientoeActivoFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonEliminarToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarMantenimientoeActivoFijos"));
						
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemEliminarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMantenimientoeActivoFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CancelarMantenimientoeActivoFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonCancelarToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarMantenimientoeActivoFijos"));
			
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemCancelarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMantenimientoeActivoFijos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMantenimientoeActivoFijos"));		
		
		
		this.jButtonCerrarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CerrarMantenimientoeActivoFijos"));
		
		
		this.jButtonCerrarToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CerrarToolBarMantenimientoeActivoFijos"));
			
		this.jMenuItemCerrarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMantenimientoeActivoFijos"));
			
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jMenuItemDetalleCerrarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMantenimientoeActivoFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosMantenimientoeActivoFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMantenimientoeActivoFijos"));
		}
		
		this.jButtonCopiarToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CopiarToolBarMantenimientoeActivoFijos"));
			
		this.jButtonVerFormToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"VerFormToolBarMantenimientoeActivoFijos"));
		
		this.jMenuItemGuardarCambiosMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMantenimientoeActivoFijos"));
			
		this.jMenuItemCopiarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMantenimientoeActivoFijos"));		
		
		this.jMenuItemVerFormMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMantenimientoeActivoFijos"));		
		
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMantenimientoeActivoFijos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMantenimientoeActivoFijos"));
			
		this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMantenimientoeActivoFijos"));		
		
		
		
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionMantenimientoeActivoFijos"));
					
		this.jButtonRecargarInformacionToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMantenimientoeActivoFijos"));
		
		this.jMenuItemRecargarInformacionMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMantenimientoeActivoFijos"));		
		
		
		
		this.jButtonAnterioresMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"AnterioresMantenimientoeActivoFijos"));
		
		
		this.jButtonAnterioresToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMantenimientoeActivoFijos"));
		
		this.jMenuItemAnterioresMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMantenimientoeActivoFijos"));		
		
		
		this.jButtonSiguientesMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"SiguientesMantenimientoeActivoFijos"));
		
		
		this.jButtonSiguientesToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMantenimientoeActivoFijos"));
			
		this.jMenuItemSiguientesMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMantenimientoeActivoFijos"));
			
		this.jMenuItemAbrirOrderByMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMantenimientoeActivoFijos"));
			
		this.jMenuItemMostrarOcultarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMantenimientoeActivoFijos"));
			
		this.jMenuItemDetalleAbrirOrderByMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMantenimientoeActivoFijos"));
			
		this.jMenuItemDetalleMostarOcultarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMantenimientoeActivoFijos"));		
		
		
		this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMantenimientoeActivoFijos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMantenimientoeActivoFijos"));
			
		this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMantenimientoeActivoFijos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMantenimientoeActivoFijos"));

		this.jCheckBoxSeleccionadosMantenimientoeActivoFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMantenimientoeActivoFijos"));
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMantenimientoeActivoFijos"));
		}
		
		
		this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"TiposRelacionesMantenimientoeActivoFijos"));
			
		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesMantenimientoeActivoFijos"));
					
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMantenimientoeActivoFijos"));
			
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMantenimientoeActivoFijos"));		
		
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonidMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"idMantenimientoeActivoFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonid_empresaMantenimientoeActivoFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoeActivoFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonid_empresaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncausaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"causaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonreferenciaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"referenciaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtontallerMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"tallerMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncostoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"costoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonresponsableMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"responsableMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonobservacionMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"observacionMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonclaveMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnombreMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoMantenimientoeActivoFijosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"BusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos!=null) {
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMantenimientoeActivoFijos"));
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMantenimientoeActivoFijos"));
				this.jInternalFrameReporteDinamicoMantenimientoeActivoFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMantenimientoeActivoFijos"));
			}
			
			//this.jButtonCerrarReporteDinamicoMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMantenimientoeActivoFijos"));				
			//this.jButtonGenerarReporteDinamicoMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMantenimientoeActivoFijos"));
			//this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMantenimientoeActivoFijos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMantenimientoeActivoFijos!=null) {
				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMantenimientoeActivoFijos"));
				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMantenimientoeActivoFijos"));
				this.jInternalFrameImportacionMantenimientoeActivoFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMantenimientoeActivoFijos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByMantenimientoeActivoFijos"));
			
			this.jButtonAbrirOrderByToolBarMantenimientoeActivoFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMantenimientoeActivoFijos"));			
			
			if(this.jInternalFrameOrderByMantenimientoeActivoFijos!=null) {
				this.jInternalFrameOrderByMantenimientoeActivoFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMantenimientoeActivoFijos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTabbedPaneRelacionesMantenimientoeActivoFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMantenimientoeActivoFijos"));
		
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
            		closingInternalFrameMantenimientoeActivoFijos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMantenimientoeActivoFijos = (JInternalFrameBase)event.getSource();
	            	
	            MantenimientoeActivoFijosBeanSwingJInternalFrame jInternalFrameParent=(MantenimientoeActivoFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormMantenimientoeActivoFijos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMantenimientoeActivoFijosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMantenimientoeActivoFijos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMantenimientoeActivoFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMantenimientoeActivoFijos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMantenimientoeActivoFijos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMantenimientoeActivoFijos";
		inputMap = this.jButtonNuevoMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMantenimientoeActivoFijos";
		inputMap = this.jButtonNuevoRelacionesMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMantenimientoeActivoFijosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMantenimientoeActivoFijos";
		inputMap = this.jButtonModificarMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMantenimientoeActivoFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMantenimientoeActivoFijos";
		inputMap = this.jButtonActualizarMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMantenimientoeActivoFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMantenimientoeActivoFijos";
		inputMap = this.jButtonEliminarMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMantenimientoeActivoFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMantenimientoeActivoFijos";
		inputMap = this.jButtonCancelarMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMantenimientoeActivoFijos";
		inputMap = this.jButtonCerrarMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMantenimientoeActivoFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMantenimientoeActivoFijos";
		inputMap = this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonGuardarCambiosMantenimientoeActivoFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMantenimientoeActivoFijos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMantenimientoeActivoFijosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMantenimientoeActivoFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMantenimientoeActivoFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMantenimientoeActivoFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMantenimientoeActivoFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonidMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"idMantenimientoeActivoFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonid_empresaMantenimientoeActivoFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoeActivoFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonid_empresaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnumero_documentoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncausaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"causaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonreferenciaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"referenciaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtontallerMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"tallerMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonfecha_inicioMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonfecha_entregaMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncostoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"costoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonresponsableMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"responsableMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonobservacionMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"observacionMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtontipo_movimientoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonclaveMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnombreMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtoncodigo_detalle_grupoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoMantenimientoeActivoFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jButtonnombre_detalle_grupoMantenimientoeActivoFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoMantenimientoeActivoFijosBusqueda"));
		
		
		this.jButtonBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos.addActionListener(new ButtonActionListener(this,"BusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMantenimientoeActivoFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMantenimientoeActivoFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMantenimientoeActivoFijosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMantenimientoeActivoFijos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMantenimientoeActivoFijos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
					mantenimientoeactivofijosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijoss) {
					mantenimientoeactivofijosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMantenimientoeActivoFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
						mantenimientoeactivofijosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijoss) {
						mantenimientoeactivofijosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMantenimientoeActivoFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMantenimientoeActivoFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMantenimientoeActivoFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMantenimientoeActivoFijos.getSelectedRows();
			
			MantenimientoeActivoFijos mantenimientoeactivofijosLocal=new MantenimientoeActivoFijos();
			
			//this.seleccionarTodosMantenimientoeActivoFijos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mantenimientoeactivofijosLocal =(MantenimientoeActivoFijos) this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss().toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					mantenimientoeactivofijosLocal =(MantenimientoeActivoFijos) this.mantenimientoeactivofijoss.toArray()[this.jTableDatosMantenimientoeActivoFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				mantenimientoeactivofijosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
						mantenimientoeactivofijosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijoss) {
						mantenimientoeactivofijosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMantenimientoeActivoFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMantenimientoeActivoFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMantenimientoeActivoFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMantenimientoeActivoFijosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMantenimientoeActivoFijosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMantenimientoeActivoFijosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMantenimientoeActivoFijos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
				
						if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							mantenimientoeactivofijosAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA)) {
							existe=true;
							mantenimientoeactivofijosAux.setcausa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							mantenimientoeactivofijosAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER)) {
							existe=true;
							mantenimientoeactivofijosAux.settaller(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							mantenimientoeactivofijosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							mantenimientoeactivofijosAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							mantenimientoeactivofijosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							mantenimientoeactivofijosAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							mantenimientoeactivofijosAux.setobservacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							mantenimientoeactivofijosAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							mantenimientoeactivofijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							mantenimientoeactivofijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							mantenimientoeactivofijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							mantenimientoeactivofijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijoss) {
					
						if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							mantenimientoeactivofijosAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA)) {
							existe=true;
							mantenimientoeactivofijosAux.setcausa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							mantenimientoeactivofijosAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER)) {
							existe=true;
							mantenimientoeactivofijosAux.settaller(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							mantenimientoeactivofijosAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							mantenimientoeactivofijosAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							mantenimientoeactivofijosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							mantenimientoeactivofijosAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							mantenimientoeactivofijosAux.setobservacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							mantenimientoeactivofijosAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							mantenimientoeactivofijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							mantenimientoeactivofijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							mantenimientoeactivofijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							mantenimientoeactivofijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMantenimientoeActivoFijosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMantenimientoeActivoFijos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMantenimientoeActivoFijos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMantenimientoeActivoFijos) {				
					conSplash=true;//false;										
					
					//this.startProcessMantenimientoeActivoFijos(conSplash);
				
					this.generarReporteMantenimientoeActivoFijossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMantenimientoeActivoFijossSeleccionados();
				//this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMantenimientoeActivoFijossSeleccionados(false);
				//this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMantenimientoeActivoFijossSeleccionados(true);
				//this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMantenimientoeActivoFijos();
				
				this.exportarMantenimientoeActivoFijossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMantenimientoeActivoFijoss();
				//this.importarMantenimientoeActivoFijoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMantenimientoeActivoFijos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMantenimientoeActivoFijossSeleccionados();
				//this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Mantenimientoe Activo Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMantenimientoeActivoFijos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMantenimientoeActivoFijos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMantenimientoeActivoFijos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setSelectedIndex(0);					
				}	
			} 			
			else if(MantenimientoeActivoFijosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMantenimientoeActivoFijos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMantenimientoeActivoFijos(conSplash);
					
						//this.actualizarParametrosGeneralMantenimientoeActivoFijos();
						
						this.generarReporteProcesoAccionMantenimientoeActivoFijossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Mantenimientoe Activo FijosES SELECCIONADOS?", "MANTENIMIENTO DE Mantenimientoe Activo Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMantenimientoeActivoFijos();
				
						this.actualizarParametrosGeneralMantenimientoeActivoFijos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.mantenimientoeactivofijosReturnGeneral=mantenimientoeactivofijosLogic.procesarAccionMantenimientoeActivoFijossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss(),this.mantenimientoeactivofijosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMantenimientoeActivoFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMantenimientoeActivoFijos();
					
					MantenimientoeActivoFijosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMantenimientoeActivoFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMantenimientoeActivoFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxTiposAccionesFormularioMantenimientoeActivoFijos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMantenimientoeActivoFijos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMantenimientoeActivoFijosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMantenimientoeActivoFijos();
			
			if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
			MantenimientoeActivoFijos mantenimientoeactivofijos=new MantenimientoeActivoFijos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMantenimientoeActivoFijos.getSelectedItem();
			
			
			
			
			mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
			//this.sTipoAccion;
			
			if(mantenimientoeactivofijossSeleccionados.size()==1) {
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijossSeleccionados) {
					mantenimientoeactivofijos=mantenimientoeactivofijosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMantenimientoeActivoFijos();
			
      		//this.finishProcessMantenimientoeActivoFijos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMantenimientoeActivoFijosReturnGeneral() throws Exception {
		if(this.mantenimientoeactivofijosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.mantenimientoeactivofijosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.mantenimientoeactivofijosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.mantenimientoeactivofijosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.mantenimientoeactivofijosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.mantenimientoeactivofijosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
		}
		
		if(this.mantenimientoeactivofijosReturnGeneral.getConRetornoLista() || this.mantenimientoeactivofijosReturnGeneral.getConRetornoObjeto()) {
			if(this.mantenimientoeactivofijosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mantenimientoeactivofijosLogic.setMantenimientoeActivoFijoss(this.mantenimientoeactivofijosReturnGeneral.getMantenimientoeActivoFijoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingMantenimientoeActivoFijos(false);
		}
	}
	
	public void actualizarParametrosGeneralMantenimientoeActivoFijos() throws Exception {
		
		
	}
	
	public ArrayList<MantenimientoeActivoFijos> getMantenimientoeActivoFijossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMantenimientoeActivoFijos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss()) {
					if(mantenimientoeactivofijosAux.getIsSelected()) {
						mantenimientoeactivofijossSeleccionados.add(mantenimientoeactivofijosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:this.mantenimientoeactivofijoss) {
					if(mantenimientoeactivofijosAux.getIsSelected()) {
						mantenimientoeactivofijossSeleccionados.add(mantenimientoeactivofijosAux);				
					}
				}
			}
			
			if(mantenimientoeactivofijossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						mantenimientoeactivofijossSeleccionados.addAll(this.mantenimientoeactivofijosLogic.getMantenimientoeActivoFijoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						mantenimientoeactivofijossSeleccionados.addAll(this.mantenimientoeactivofijoss);				
					}
				}
			}
		} else {
			mantenimientoeactivofijossSeleccionados.add(this.mantenimientoeactivofijos);
		}
		
		return mantenimientoeactivofijossSeleccionados;
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
	
	public void generarReporteMantenimientoeActivoFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMantenimientoeActivoFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMantenimientoeActivoFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMantenimientoeActivoFijossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMantenimientoeActivoFijossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Mantenimientoe Activo Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMantenimientoeActivoFijossSeleccionados() throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMantenimientoeActivoFijoss("Todos",mantenimientoeactivofijossSeleccionados);
		
	}	
	
	public void generarReporteNormalMantenimientoeActivoFijossSeleccionados() throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMantenimientoeActivoFijoss("Todos",mantenimientoeactivofijossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMantenimientoeActivoFijossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMantenimientoeActivoFijoss("Todos",mantenimientoeactivofijossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMantenimientoeActivoFijossSeleccionados() throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMantenimientoeActivoFijos();
		
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMantenimientoeActivoFijos();
		
		
		//this.generarReporteMantenimientoeActivoFijoss("Todos",mantenimientoeactivofijossSeleccionados ,mantenimientoeactivofijosImplementable,mantenimientoeactivofijosImplementableHome);
	}
	
	public void mostrarImportacionMantenimientoeActivoFijoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMantenimientoeActivoFijos();
		
		this.abrirFrameImportacionMantenimientoeActivoFijos();		
		
			
		//this.generarReporteMantenimientoeActivoFijoss("Todos",mantenimientoeactivofijossSeleccionados ,mantenimientoeactivofijosImplementable,mantenimientoeactivofijosImplementableHome);
	}
	
	public void importarMantenimientoeActivoFijoss() throws Exception {		
	
	}
	
	public void exportarMantenimientoeActivoFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMantenimientoeActivoFijossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMantenimientoeActivoFijossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMantenimientoeActivoFijossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Mantenimientoe Activo Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMantenimientoeActivoFijossSeleccionados() throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoeactivofijos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMantenimientoeActivoFijos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMantenimientoeActivoFijos(mantenimientoeactivofijosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//mantenimientoeactivofijosAux.setsDetalleGeneralEntityReporte(mantenimientoeactivofijosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMantenimientoeActivoFijos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=mantenimientoeactivofijos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getcausa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getreferencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.gettaller();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getfecha_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getresponsable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getobservacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=mantenimientoeactivofijos.getnombre_detalle_grupo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMantenimientoeActivoFijossSeleccionados() throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoeactivofijos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MantenimientoeActivoFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMantenimientoeActivoFijos(row);				
				iRow++;
			}				
			
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMantenimientoeActivoFijos(mantenimientoeactivofijosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMantenimientoeActivoFijossSeleccionados() throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();		
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mantenimientoeactivofijos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("mantenimientoeactivofijoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("mantenimientoeactivofijos");
			//elementRoot.appendChild(element);
		
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijossSeleccionados) {
				element = document.createElement("mantenimientoeactivofijos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMantenimientoeActivoFijos(mantenimientoeactivofijosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mantenimientoe Activo Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMantenimientoeActivoFijos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getcausa());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getreferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.gettaller());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getresponsable());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getobservacion());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(mantenimientoeactivofijos.getnombre_detalle_grupo());				
	}
	
	public void setFilaDatosExportarXmlMantenimientoeActivoFijos(MantenimientoeActivoFijos mantenimientoeactivofijos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MantenimientoeActivoFijosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(mantenimientoeactivofijos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MantenimientoeActivoFijosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(mantenimientoeactivofijos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MantenimientoeActivoFijosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(mantenimientoeactivofijos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnumero_documento = document.createElement(MantenimientoeActivoFijosConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(mantenimientoeactivofijos.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementcausa = document.createElement(MantenimientoeActivoFijosConstantesFunciones.CAUSA);
		elementcausa.appendChild(document.createTextNode(mantenimientoeactivofijos.getcausa().trim()));
		element.appendChild(elementcausa);

		Element elementreferencia = document.createElement(MantenimientoeActivoFijosConstantesFunciones.REFERENCIA);
		elementreferencia.appendChild(document.createTextNode(mantenimientoeactivofijos.getreferencia().trim()));
		element.appendChild(elementreferencia);

		Element elementtaller = document.createElement(MantenimientoeActivoFijosConstantesFunciones.TALLER);
		elementtaller.appendChild(document.createTextNode(mantenimientoeactivofijos.gettaller().trim()));
		element.appendChild(elementtaller);

		Element elementfecha_inicio = document.createElement(MantenimientoeActivoFijosConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(mantenimientoeactivofijos.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_entrega = document.createElement(MantenimientoeActivoFijosConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(mantenimientoeactivofijos.getfecha_entrega().toString().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementcosto = document.createElement(MantenimientoeActivoFijosConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(mantenimientoeactivofijos.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementresponsable = document.createElement(MantenimientoeActivoFijosConstantesFunciones.RESPONSABLE);
		elementresponsable.appendChild(document.createTextNode(mantenimientoeactivofijos.getresponsable().trim()));
		element.appendChild(elementresponsable);

		Element elementobservacion = document.createElement(MantenimientoeActivoFijosConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(mantenimientoeactivofijos.getobservacion().trim()));
		element.appendChild(elementobservacion);

		Element elementtipo_movimiento = document.createElement(MantenimientoeActivoFijosConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(mantenimientoeactivofijos.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementclave = document.createElement(MantenimientoeActivoFijosConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(mantenimientoeactivofijos.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(MantenimientoeActivoFijosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(mantenimientoeactivofijos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_detalle_grupo = document.createElement(MantenimientoeActivoFijosConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(mantenimientoeactivofijos.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(MantenimientoeActivoFijosConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(mantenimientoeactivofijos.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);
	}
	
	public void generarReporteGroupGenericoMantenimientoeActivoFijossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados=new ArrayList<MantenimientoeActivoFijos>();
		
		mantenimientoeactivofijossSeleccionados=this.getMantenimientoeActivoFijossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMantenimientoeActivoFijos(mantenimientoeactivofijossSeleccionados);
		
		this.generarReporteMantenimientoeActivoFijoss("Todos",mantenimientoeactivofijossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMantenimientoeActivoFijos(ArrayList<MantenimientoeActivoFijos> mantenimientoeactivofijossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MantenimientoeActivoFijos mantenimientoeactivofijosAux:mantenimientoeactivofijossSeleccionados) {
				mantenimientoeactivofijosAux.setsDetalleGeneralEntityReporte(mantenimientoeactivofijosAux.toString());
			
				if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getnumero_documento());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CAUSA)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getcausa());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_REFERENCIA)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getreferencia());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_TALLER)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.gettaller());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(mantenimientoeactivofijosAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(mantenimientoeactivofijosAux.getfecha_entrega()));
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_RESPONSABLE)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getresponsable());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getobservacion());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.gettipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(MantenimientoeActivoFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					mantenimientoeactivofijosAux.setsDescripcionGeneralEntityReporte1(mantenimientoeactivofijosAux.getnombre_detalle_grupo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MantenimientoeActivoFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMantenimientoeActivoFijos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=true;
				this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=true;
				this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=true;
			}
			
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MantenimientoeActivoFijosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=true;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=true;
		} else {
			this.actualizarEstadoPanelsMantenimientoeActivoFijos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMantenimientoeActivoFijos=false;
			//this.isVisibilidadCeldaVerFormMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaDuplicarMantenimientoeActivoFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
		} else {
			this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			if(!mantenimientoeactivofijosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;												
			}
			
			this.jButtonCerrarMantenimientoeActivoFijos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
		}
		
		if(!this.permiteMantenimiento(this.mantenimientoeactivofijos)) {
			this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
			this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoMantenimientoeActivoFijos=false;
		this.isVisibilidadCeldaNuevoRelacionesMantenimientoeActivoFijos=false;
		this.isVisibilidadCeldaGuardarCambiosMantenimientoeActivoFijos=false;
		//this.isVisibilidadCeldaModificarMantenimientoeActivoFijos=true;
		this.isVisibilidadCeldaActualizarMantenimientoeActivoFijos=false;
		this.isVisibilidadCeldaEliminarMantenimientoeActivoFijos=false;
		//this.isVisibilidadCeldaCancelarMantenimientoeActivoFijos=true;			
		this.isVisibilidadCeldaGuardarMantenimientoeActivoFijos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMantenimientoeActivoFijos() {
	}
	
	public void actualizarEstadoPanelsMantenimientoeActivoFijos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoeActivoFijos!=null) {
				this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosMantenimientoeActivoFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionMantenimientoeActivoFijos!=null) {
				this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosMantenimientoeActivoFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionMantenimientoeActivoFijos!=null) {
				this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosMantenimientoeActivoFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionMantenimientoeActivoFijos!=null) {
				this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoeActivoFijos!=null) {
				this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoeActivoFijos!=null) {
				this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosEdicionMantenimientoeActivoFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMantenimientoeActivoFijos!=null) {
				this.jScrollPanelDatosMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionMantenimientoeActivoFijos!=null) {
				this.jPanelPaginacionMantenimientoeActivoFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
					this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.mantenimientoeactivofijosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos!=null) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMantenimientoeActivoFijos!=null) {
				this.jPanelParametrosReportesMantenimientoeActivoFijos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaMantenimientoeActivoFijos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaMantenimientoeActivoFijos) {this.jTabbedPaneBusquedasMantenimientoeActivoFijos.remove(jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);}
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
			
			this.inicializarActualizarBindingTablaMantenimientoeActivoFijos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMantenimientoeActivoFijos() {
		this.updateBorderResaltarBusquedasFormularioMantenimientoeActivoFijos();
		this.updateVisibilidadBusquedasFormularioMantenimientoeActivoFijos();
		this.updateHabilitarBusquedasFormularioMantenimientoeActivoFijos();
	}
	
	public void updateBorderResaltarBusquedasFormularioMantenimientoeActivoFijos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getComponents().length>0) {
	

		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos!=null) {
			index= this.jTabbedPaneBusquedasMantenimientoeActivoFijos.indexOfComponent(this.jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getComponent(index);
				jPanel.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMantenimientoeActivoFijos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMantenimientoeActivoFijos.indexOfComponent(this.jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
			if(!this.mantenimientoeactivofijosConstantesFunciones.mostrarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos && index>-1) {
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMantenimientoeActivoFijos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMantenimientoeActivoFijos.indexOfComponent(this.jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
				this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setEnabledAt(index,this.mantenimientoeactivofijosConstantesFunciones.activarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMantenimientoeActivoFijos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaMantenimientoeActivoFijos")) {
			index= this.jTabbedPaneBusquedasMantenimientoeActivoFijos.indexOfComponent(this.jPanelBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);

			this.jTabbedPaneBusquedasMantenimientoeActivoFijos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMantenimientoeActivoFijos.getComponent(index);

			this.mantenimientoeactivofijosConstantesFunciones.setResaltarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos(resaltar);

			jPanel.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarBusquedaMantenimientoeActivoFijosMantenimientoeActivoFijos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMantenimientoeActivoFijos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMantenimientoeActivoFijos() throws Exception {

		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMantenimientoeActivoFijos();
		this.updateVisibilidadResaltarControlesFormularioMantenimientoeActivoFijos();
		this.updateHabilitarResaltarControlesFormularioMantenimientoeActivoFijos();
		
	}
	
	public void updateBorderResaltarControlesFormularioMantenimientoeActivoFijos() throws Exception {
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltaridMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltaridMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarid_empresaMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarid_empresaMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarnumero_documentoMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarnumero_documentoMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarcausaMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarcausaMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarreferenciaMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarreferenciaMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltartallerMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltartallerMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_inicioMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_inicioMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_entregaMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarfecha_entregaMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarcostoMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarcostoMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarresponsableMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarresponsableMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarobservacionMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarobservacionMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltartipo_movimientoMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltartipo_movimientoMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarclaveMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarclaveMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombreMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombreMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarcodigo_detalle_grupoMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarcodigo_detalle_grupoMantenimientoeActivoFijos);}
		if(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombre_detalle_grupoMantenimientoeActivoFijos!=null && this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setBorder(this.mantenimientoeactivofijosConstantesFunciones.resaltarnombre_detalle_grupoMantenimientoeActivoFijos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMantenimientoeActivoFijos() throws Exception {		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
	
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostraridMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelidMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostraridMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarid_empresaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelid_empresaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarid_empresaMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarnumero_documentoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelnumero_documentoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarnumero_documentoMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarcausaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelcausaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarcausaMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarreferenciaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelreferenciaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarreferenciaMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrartallerMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPaneltallerMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrartallerMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarfecha_inicioMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelfecha_inicioMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarfecha_inicioMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarfecha_entregaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelfecha_entregaMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarfecha_entregaMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarcostoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelcostoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarcostoMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarresponsableMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelresponsableMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarresponsableMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarobservacionMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelobservacionMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarobservacionMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrartipo_movimientoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPaneltipo_movimientoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrartipo_movimientoMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarclaveMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelclaveMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarclaveMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarnombreMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelnombreMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarnombreMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarcodigo_detalle_grupoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelcodigo_detalle_grupoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarcodigo_detalle_grupoMantenimientoeActivoFijos);
		//this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarnombre_detalle_grupoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jPanelnombre_detalle_grupoMantenimientoeActivoFijos.setVisible(this.mantenimientoeactivofijosConstantesFunciones.mostrarnombre_detalle_grupoMantenimientoeActivoFijos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMantenimientoeActivoFijos() throws Exception {
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMantenimientoeActivoFijos!=null) {
	
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jLabelidMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activaridMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jComboBoxid_empresaMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarid_empresaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldnumero_documentoMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarnumero_documentoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreacausaMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarcausaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreareferenciaMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarreferenciaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatallerMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activartallerMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_inicioMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarfecha_inicioMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jDateChooserfecha_entregaMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarfecha_entregaMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcostoMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarcostoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextArearesponsableMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarresponsableMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreaobservacionMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarobservacionMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreatipo_movimientoMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activartipo_movimientoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldclaveMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarclaveMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombreMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarnombreMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextFieldcodigo_detalle_grupoMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarcodigo_detalle_grupoMantenimientoeActivoFijos);
		this.jInternalFrameDetalleFormMantenimientoeActivoFijos.jTextAreanombre_detalle_grupoMantenimientoeActivoFijos.setEnabled(this.mantenimientoeactivofijosConstantesFunciones.activarnombre_detalle_grupoMantenimientoeActivoFijos);
		}
	}
	
		
}