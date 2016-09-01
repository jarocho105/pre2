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

//import com.bydan.erp.activosfijos.util.ActivosFijosPorGruposConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.ActivosFijosPorGruposParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.ActivosFijosPorGruposParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.ActivosFijosPorGruposBean;
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
public class ActivosFijosPorGruposBeanSwingJInternalFrame extends ActivosFijosPorGruposJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ActivosFijosPorGruposBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ActivosFijosPorGrupos> activosfijosporgruposValidator = new ClassValidator<ActivosFijosPorGrupos>(ActivosFijosPorGrupos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ActivosFijosPorGrupos activosfijosporgrupos;	
	public ActivosFijosPorGrupos activosfijosporgruposAux;
	public ActivosFijosPorGrupos activosfijosporgruposAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ActivosFijosPorGrupos activosfijosporgruposTotales;
	public Long idActivosFijosPorGruposActual;
	public Long iIdNuevoActivosFijosPorGrupos=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
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
	
	public Boolean isPermisoTodoActivosFijosPorGrupos;
	public Boolean isPermisoNuevoActivosFijosPorGrupos;
	public Boolean isPermisoActualizarActivosFijosPorGrupos;
	public Boolean isPermisoActualizarOriginalActivosFijosPorGrupos;
	public Boolean isPermisoEliminarActivosFijosPorGrupos;
	public Boolean isPermisoGuardarCambiosActivosFijosPorGrupos;
	public Boolean isPermisoConsultaActivosFijosPorGrupos;
	public Boolean isPermisoBusquedaActivosFijosPorGrupos;
	public Boolean isPermisoReporteActivosFijosPorGrupos;
	public Boolean isPermisoPaginacionMedioActivosFijosPorGrupos;
	public Boolean isPermisoPaginacionAltoActivosFijosPorGrupos;
	public Boolean isPermisoPaginacionTodoActivosFijosPorGrupos;
	public Boolean isPermisoCopiarActivosFijosPorGrupos;
	public Boolean isPermisoVerFormActivosFijosPorGrupos;
	public Boolean isPermisoDuplicarActivosFijosPorGrupos;
	public Boolean isPermisoOrdenActivosFijosPorGrupos;
	
	
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
	
	public ActivosFijosPorGruposParameterReturnGeneral activosfijosporgruposReturnGeneral;
	public ActivosFijosPorGruposParameterReturnGeneral activosfijosporgruposParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoActivosFijosPorGrupos=false;
	public Boolean esParaAccionDesdeFormularioActivosFijosPorGrupos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ActivosFijosPorGruposSessionBeanAdditional activosfijosporgruposSessionBeanAdditional=null;
	
	public ActivosFijosPorGruposSessionBeanAdditional getActivosFijosPorGruposSessionBeanAdditional() {
		return this.activosfijosporgruposSessionBeanAdditional;
	}
	
	public void setActivosFijosPorGruposSessionBeanAdditional(ActivosFijosPorGruposSessionBeanAdditional activosfijosporgruposSessionBeanAdditional) {
		try {
			this.activosfijosporgruposSessionBeanAdditional=activosfijosporgruposSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ActivosFijosPorGruposBeanSwingJInternalFrameAdditional activosfijosporgruposBeanSwingJInternalFrameAdditional=null;
	//public class ActivosFijosPorGruposBeanSwingJInternalFrame
	
	public ActivosFijosPorGruposBeanSwingJInternalFrameAdditional getActivosFijosPorGruposBeanSwingJInternalFrameAdditional() {
		return this.activosfijosporgruposBeanSwingJInternalFrameAdditional;
	}
	
	public void setActivosFijosPorGruposBeanSwingJInternalFrameAdditional(ActivosFijosPorGruposBeanSwingJInternalFrameAdditional activosfijosporgruposBeanSwingJInternalFrameAdditional) {
		try {
			this.activosfijosporgruposBeanSwingJInternalFrameAdditional=activosfijosporgruposBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ActivosFijosPorGruposLogic activosfijosporgruposLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ActivosFijosPorGrupos activosfijosporgruposBean;
	public ActivosFijosPorGruposConstantesFunciones activosfijosporgruposConstantesFunciones;
	//public ActivosFijosPorGruposParameterReturnGeneral activosfijosporgruposReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<ActivosFijosPorGrupos> activosfijosporgruposs;	
	//public List<ActivosFijosPorGrupos> activosfijosporgrupossEliminados;
	//public List<ActivosFijosPorGrupos> activosfijosporgrupossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
	public Boolean isVisibilidadCeldaDuplicarActivosFijosPorGrupos=true;
	public Boolean isVisibilidadCeldaCopiarActivosFijosPorGrupos=true;
	public Boolean isVisibilidadCeldaVerFormActivosFijosPorGrupos=true;
	public Boolean isVisibilidadCeldaOrdenActivosFijosPorGrupos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
	public Boolean isVisibilidadCeldaModificarActivosFijosPorGrupos=false;
	public Boolean isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
	public Boolean isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
	public Boolean isVisibilidadCeldaCancelarActivosFijosPorGrupos=false;
	public Boolean isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;	
	
	
	public Boolean isVisibilidadBusquedaActivosFijosPorGrupos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoActivosFijosPorGrupos() {
		return this.iIdNuevoActivosFijosPorGrupos;
	}

	public void setiIdNuevoActivosFijosPorGrupos(Long iIdNuevoActivosFijosPorGrupos) {
		this.iIdNuevoActivosFijosPorGrupos = iIdNuevoActivosFijosPorGrupos;
	}
	
	public Long getidActivosFijosPorGruposActual() {
		return this.idActivosFijosPorGruposActual;
	}

	public void setidActivosFijosPorGruposActual(Long idActivosFijosPorGruposActual) {
		this.idActivosFijosPorGruposActual = idActivosFijosPorGruposActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ActivosFijosPorGrupos getactivosfijosporgrupos() {
		return this.activosfijosporgrupos;
	}

	public void setactivosfijosporgrupos(ActivosFijosPorGrupos activosfijosporgrupos) {
		this.activosfijosporgrupos = activosfijosporgrupos;
	}
	
	public ActivosFijosPorGrupos getactivosfijosporgruposAux() {
		return this.activosfijosporgruposAux;
	}

	public void setactivosfijosporgruposAux(ActivosFijosPorGrupos activosfijosporgruposAux) {
		this.activosfijosporgruposAux = activosfijosporgruposAux;
	}				
	
	public ActivosFijosPorGrupos getactivosfijosporgruposAnterior() {
		return this.activosfijosporgruposAnterior;
	}

	public void setactivosfijosporgruposAnterior(ActivosFijosPorGrupos activosfijosporgruposAnterior) {
		this.activosfijosporgruposAnterior = activosfijosporgruposAnterior;
	}	
	
	public ActivosFijosPorGrupos getactivosfijosporgruposTotales() {
		return this.activosfijosporgruposTotales;
	}

	public void setactivosfijosporgruposTotales(ActivosFijosPorGrupos activosfijosporgruposTotales) {
		this.activosfijosporgruposTotales = activosfijosporgruposTotales;
	}	
	
	public ActivosFijosPorGrupos getactivosfijosporgruposBean() {
		return this.activosfijosporgruposBean;
	}

	public void setactivosfijosporgruposBean(ActivosFijosPorGrupos activosfijosporgruposBean) {
		this.activosfijosporgruposBean = activosfijosporgruposBean;
	}	
	
	public ActivosFijosPorGruposParameterReturnGeneral getactivosfijosporgruposReturnGeneral() {
		return this.activosfijosporgruposReturnGeneral;
	}

	public void setactivosfijosporgruposReturnGeneral(ActivosFijosPorGruposParameterReturnGeneral activosfijosporgruposReturnGeneral) {
		this.activosfijosporgruposReturnGeneral = activosfijosporgruposReturnGeneral;
	}	
	
	
	public Long idBusquedaActivosFijosPorGrupos=0L;

	public Long getidBusquedaActivosFijosPorGrupos() {
		return this.idBusquedaActivosFijosPorGrupos;
	}

	public void setidBusquedaActivosFijosPorGrupos(Long idBusquedaActivosFijosPorGrupos) {
		this.idBusquedaActivosFijosPorGrupos = idBusquedaActivosFijosPorGrupos;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ActivosFijosPorGruposLogic getActivosFijosPorGruposLogic()	{		
		return activosfijosporgruposLogic;
	}

	public void setActivosFijosPorGruposLogic(ActivosFijosPorGruposLogic activosfijosporgruposLogic) {
		this.activosfijosporgruposLogic = activosfijosporgruposLogic;
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
	
	public Boolean getIsEsNuevoActivosFijosPorGrupos() {
		return isEsNuevoActivosFijosPorGrupos;
	}

	public void setIsEsNuevoActivosFijosPorGrupos(Boolean isEsNuevoActivosFijosPorGrupos) {
		this.isEsNuevoActivosFijosPorGrupos = isEsNuevoActivosFijosPorGrupos;
	}

	public Boolean getEsParaAccionDesdeFormularioActivosFijosPorGrupos() {
		return esParaAccionDesdeFormularioActivosFijosPorGrupos;
	}
	
	public void setEsParaAccionDesdeFormularioActivosFijosPorGrupos(Boolean esParaAccionDesdeFormularioActivosFijosPorGrupos) {
		this.esParaAccionDesdeFormularioActivosFijosPorGrupos = esParaAccionDesdeFormularioActivosFijosPorGrupos;
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

			if(this.activosfijosporgruposSessionBean==null) {
				this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean();
			}

			if(!this.activosfijosporgruposSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(activosfijosporgruposSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.activosfijosporgruposSessionBean==null) {
				this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean();
			}

			if(!this.activosfijosporgruposSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(activosfijosporgruposSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

					if(this.activosfijosporgrupos!=null) {
						this.activosfijosporgrupos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
						this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaActivosFijosPorGrupos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.getItemCount()>0) {
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaActivosFijosPorGruposGenerico)throws Exception
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
				jComboBoxid_empresaActivosFijosPorGruposGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaActivosFijosPorGruposGenerico!=null && jComboBoxid_empresaActivosFijosPorGruposGenerico.getItemCount()>0) {
					jComboBoxid_empresaActivosFijosPorGruposGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.activosfijosporgrupos!=null) {
						this.activosfijosporgrupos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
						this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalActivosFijosPorGrupos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.getItemCount()>0) {
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalActivosFijosPorGruposGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalActivosFijosPorGruposGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalActivosFijosPorGruposGenerico!=null && jComboBoxid_sucursalActivosFijosPorGruposGenerico.getItemCount()>0) {
					jComboBoxid_sucursalActivosFijosPorGruposGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ActivosFijosPorGrupos activosfijosporgrupos,JComboBox jComboBoxid_empresaActivosFijosPorGruposGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaActivosFijosPorGruposGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaActivosFijosPorGruposGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				activosfijosporgrupos.setid_empresa(empresaAux.getId());
				activosfijosporgrupos.setempresa_descripcion(ActivosFijosPorGruposConstantesFunciones.getEmpresaDescripcion(empresaAux));
				activosfijosporgrupos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ActivosFijosPorGrupos activosfijosporgrupos,JComboBox jComboBoxid_sucursalActivosFijosPorGruposGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalActivosFijosPorGruposGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalActivosFijosPorGruposGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				activosfijosporgrupos.setid_sucursal(sucursalAux.getId());
				activosfijosporgrupos.setsucursal_descripcion(ActivosFijosPorGruposConstantesFunciones.getSucursalDescripcion(sucursalAux));
				activosfijosporgrupos.setSucursal(sucursalAux);			}
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

					if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { 
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { 
					}

					if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { 
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { 
					}

					if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesActivosFijosPorGrupos() throws Exception {
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
		
	public ActivosFijosPorGruposParameterReturnGeneral getActivosFijosPorGruposParameterGeneral() {
		return this.activosfijosporgruposParameterGeneral;
	}
	
	public void setActivosFijosPorGruposParameterGeneral(ActivosFijosPorGruposParameterReturnGeneral activosfijosporgruposParameterGeneral) {
		this.activosfijosporgruposParameterGeneral = activosfijosporgruposParameterGeneral;
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
	
	public Boolean getIsPermisoTodoActivosFijosPorGrupos() {
		return isPermisoTodoActivosFijosPorGrupos;
	}

	public void setIsPermisoTodoActivosFijosPorGrupos(Boolean isPermisoTodoActivosFijosPorGrupos) {
		this.isPermisoTodoActivosFijosPorGrupos = isPermisoTodoActivosFijosPorGrupos;
	}

	public Boolean getIsPermisoNuevoActivosFijosPorGrupos() {
		return isPermisoNuevoActivosFijosPorGrupos;
	}

	public void setIsPermisoNuevoActivosFijosPorGrupos(Boolean isPermisoNuevoActivosFijosPorGrupos) {
		this.isPermisoNuevoActivosFijosPorGrupos = isPermisoNuevoActivosFijosPorGrupos;
	}

	public Boolean getIsPermisoActualizarActivosFijosPorGrupos() {
		return isPermisoActualizarActivosFijosPorGrupos;
	}

	public void setIsPermisoActualizarActivosFijosPorGrupos(Boolean isPermisoActualizarActivosFijosPorGrupos) {
		this.isPermisoActualizarActivosFijosPorGrupos = isPermisoActualizarActivosFijosPorGrupos;
	}

	public Boolean getIsPermisoEliminarActivosFijosPorGrupos() {
		return isPermisoEliminarActivosFijosPorGrupos;
	}

	public void setIsPermisoEliminarActivosFijosPorGrupos(Boolean isPermisoEliminarActivosFijosPorGrupos) {
		this.isPermisoEliminarActivosFijosPorGrupos = isPermisoEliminarActivosFijosPorGrupos;
	}

	public Boolean getIsPermisoGuardarCambiosActivosFijosPorGrupos() {
		return isPermisoGuardarCambiosActivosFijosPorGrupos;
	}

	public void setIsPermisoGuardarCambiosActivosFijosPorGrupos(Boolean isPermisoGuardarCambiosActivosFijosPorGrupos) {
		this.isPermisoGuardarCambiosActivosFijosPorGrupos = isPermisoGuardarCambiosActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoConsultaActivosFijosPorGrupos() {
		return isPermisoConsultaActivosFijosPorGrupos;
	}

	public void setIsPermisoConsultaActivosFijosPorGrupos(Boolean isPermisoConsultaActivosFijosPorGrupos) {
		this.isPermisoConsultaActivosFijosPorGrupos = isPermisoConsultaActivosFijosPorGrupos;
	}

	public Boolean getIsPermisoBusquedaActivosFijosPorGrupos() {
		return isPermisoBusquedaActivosFijosPorGrupos;
	}

	public void setIsPermisoBusquedaActivosFijosPorGrupos(Boolean isPermisoBusquedaActivosFijosPorGrupos) {
		this.isPermisoBusquedaActivosFijosPorGrupos = isPermisoBusquedaActivosFijosPorGrupos;
	}

	public Boolean getIsPermisoReporteActivosFijosPorGrupos() {
		return isPermisoReporteActivosFijosPorGrupos;
	}

	public void setIsPermisoReporteActivosFijosPorGrupos(Boolean isPermisoReporteActivosFijosPorGrupos) {
		this.isPermisoReporteActivosFijosPorGrupos = isPermisoReporteActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoPaginacionMedioActivosFijosPorGrupos() {
		return isPermisoPaginacionMedioActivosFijosPorGrupos;
	}

	public void setIsPermisoPaginacionMedioActivosFijosPorGrupos(Boolean isPermisoPaginacionMedioActivosFijosPorGrupos) {
		this.isPermisoPaginacionMedioActivosFijosPorGrupos = isPermisoPaginacionMedioActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoPaginacionTodoActivosFijosPorGrupos() {
		return isPermisoPaginacionTodoActivosFijosPorGrupos;
	}

	public void setIsPermisoPaginacionTodoActivosFijosPorGrupos(Boolean isPermisoPaginacionTodoActivosFijosPorGrupos) {
		this.isPermisoPaginacionTodoActivosFijosPorGrupos = isPermisoPaginacionTodoActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoPaginacionAltoActivosFijosPorGrupos() {
		return isPermisoPaginacionAltoActivosFijosPorGrupos;
	}

	public void setIsPermisoPaginacionAltoActivosFijosPorGrupos(Boolean isPermisoPaginacionAltoActivosFijosPorGrupos) {
		this.isPermisoPaginacionAltoActivosFijosPorGrupos = isPermisoPaginacionAltoActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoCopiarActivosFijosPorGrupos() {
		return isPermisoCopiarActivosFijosPorGrupos;
	}

	public void setIsPermisoCopiarActivosFijosPorGrupos(Boolean isPermisoCopiarActivosFijosPorGrupos) {
		this.isPermisoCopiarActivosFijosPorGrupos = isPermisoCopiarActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoVerFormActivosFijosPorGrupos() {
		return isPermisoVerFormActivosFijosPorGrupos;
	}

	public void setIsPermisoVerFormActivosFijosPorGrupos(Boolean isPermisoVerFormActivosFijosPorGrupos) {
		this.isPermisoVerFormActivosFijosPorGrupos = isPermisoVerFormActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoDuplicarActivosFijosPorGrupos() {
		return isPermisoDuplicarActivosFijosPorGrupos;
	}

	public void setIsPermisoDuplicarActivosFijosPorGrupos(Boolean isPermisoDuplicarActivosFijosPorGrupos) {
		this.isPermisoDuplicarActivosFijosPorGrupos = isPermisoDuplicarActivosFijosPorGrupos;
	}
	
	public Boolean getIsPermisoOrdenActivosFijosPorGrupos() {
		return isPermisoOrdenActivosFijosPorGrupos;
	}

	public void setIsPermisoOrdenActivosFijosPorGrupos(Boolean isPermisoOrdenActivosFijosPorGrupos) {
		this.isPermisoOrdenActivosFijosPorGrupos = isPermisoOrdenActivosFijosPorGrupos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoActivosFijosPorGrupos() {
		return isVisibilidadCeldaNuevoActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaNuevoActivosFijosPorGrupos(Boolean isVisibilidadCeldaNuevoActivosFijosPorGrupos) {
		this.isVisibilidadCeldaNuevoActivosFijosPorGrupos = isVisibilidadCeldaNuevoActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarActivosFijosPorGrupos() {
		return isVisibilidadCeldaDuplicarActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaDuplicarActivosFijosPorGrupos(Boolean isVisibilidadCeldaDuplicarActivosFijosPorGrupos) {
		this.isVisibilidadCeldaDuplicarActivosFijosPorGrupos = isVisibilidadCeldaDuplicarActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarActivosFijosPorGrupos() {
		return isVisibilidadCeldaCopiarActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaCopiarActivosFijosPorGrupos(Boolean isVisibilidadCeldaCopiarActivosFijosPorGrupos) {
		this.isVisibilidadCeldaCopiarActivosFijosPorGrupos = isVisibilidadCeldaCopiarActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormActivosFijosPorGrupos() {
		return isVisibilidadCeldaVerFormActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaVerFormActivosFijosPorGrupos(Boolean isVisibilidadCeldaVerFormActivosFijosPorGrupos) {
		this.isVisibilidadCeldaVerFormActivosFijosPorGrupos = isVisibilidadCeldaVerFormActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenActivosFijosPorGrupos() {
		return isVisibilidadCeldaOrdenActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaOrdenActivosFijosPorGrupos(Boolean isVisibilidadCeldaOrdenActivosFijosPorGrupos) {
		this.isVisibilidadCeldaOrdenActivosFijosPorGrupos = isVisibilidadCeldaOrdenActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos() {
		return isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos(Boolean isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos) {
		this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos = isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarActivosFijosPorGrupos() {
		return isVisibilidadCeldaModificarActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaModificarActivosFijosPorGrupos(Boolean isVisibilidadCeldaModificarActivosFijosPorGrupos) {
		this.isVisibilidadCeldaModificarActivosFijosPorGrupos = isVisibilidadCeldaModificarActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarActivosFijosPorGrupos() {
		return isVisibilidadCeldaActualizarActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaActualizarActivosFijosPorGrupos(Boolean isVisibilidadCeldaActualizarActivosFijosPorGrupos) {
		this.isVisibilidadCeldaActualizarActivosFijosPorGrupos = isVisibilidadCeldaActualizarActivosFijosPorGrupos;
	}

	public Boolean getIsVisibilidadCeldaEliminarActivosFijosPorGrupos() {
		return isVisibilidadCeldaEliminarActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaEliminarActivosFijosPorGrupos(Boolean isVisibilidadCeldaEliminarActivosFijosPorGrupos) {
		this.isVisibilidadCeldaEliminarActivosFijosPorGrupos = isVisibilidadCeldaEliminarActivosFijosPorGrupos;
	}

	public Boolean getIsVisibilidadCeldaCancelarActivosFijosPorGrupos() {
		return isVisibilidadCeldaCancelarActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaCancelarActivosFijosPorGrupos(Boolean isVisibilidadCeldaCancelarActivosFijosPorGrupos) {
		this.isVisibilidadCeldaCancelarActivosFijosPorGrupos = isVisibilidadCeldaCancelarActivosFijosPorGrupos;
	}

	public Boolean getIsVisibilidadCeldaGuardarActivosFijosPorGrupos() {
		return isVisibilidadCeldaGuardarActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaGuardarActivosFijosPorGrupos(Boolean isVisibilidadCeldaGuardarActivosFijosPorGrupos) {
		this.isVisibilidadCeldaGuardarActivosFijosPorGrupos = isVisibilidadCeldaGuardarActivosFijosPorGrupos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos() {
		return isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos(Boolean isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos) {
		this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos = isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos;
	}
		
	public ActivosFijosPorGruposSessionBean getactivosfijosporgruposSessionBean() {
		return this.activosfijosporgruposSessionBean;
	}
	
	public void setactivosfijosporgruposSessionBean(ActivosFijosPorGruposSessionBean activosfijosporgruposSessionBean) {
		this.activosfijosporgruposSessionBean=activosfijosporgruposSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaActivosFijosPorGrupos() {
		return this.isVisibilidadBusquedaActivosFijosPorGrupos;
	}

	public void setisVisibilidadBusquedaActivosFijosPorGrupos(Boolean isVisibilidadBusquedaActivosFijosPorGrupos) {
		this.isVisibilidadBusquedaActivosFijosPorGrupos=isVisibilidadBusquedaActivosFijosPorGrupos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(activosfijosporgrupos,null);
				this.setActualParaGuardarSucursalForeignKey(activosfijosporgrupos,null);
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
	
	public void bugActualizarReferenciaActual(ActivosFijosPorGrupos activosfijosporgrupos,ActivosFijosPorGrupos activosfijosporgruposAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalActivosFijosPorGrupos(activosfijosporgrupos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		activosfijosporgruposAux.setId(activosfijosporgrupos.getId());
		activosfijosporgruposAux.setVersionRow(activosfijosporgrupos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ActivosFijosPorGrupos activosfijosporgruposLocal) throws Exception {
		
		if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ActivosFijosPorGrupos activosfijosporgruposLocal) throws Exception {	
		if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				activosfijosporgruposLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				activosfijosporgruposLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarActivosFijosPorGruposActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = activosfijosporgruposValidator.getInvalidValues(this.activosfijosporgrupos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ActivosFijosPorGrupos activosfijosporgrupos,List<ActivosFijosPorGrupos> activosfijosporgruposs) throws Exception {
	}		
	
	public void actualizarSelectedLista(ActivosFijosPorGrupos activosfijosporgrupos,List<ActivosFijosPorGrupos> activosfijosporgruposs) throws Exception {
		try	{			
			ActivosFijosPorGruposConstantesFunciones.actualizarSelectedLista(activosfijosporgrupos,activosfijosporgruposs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ActivosFijosPorGrupos> activosfijosporgrupossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				activosfijosporgrupossLocal=this.activosfijosporgruposLogic.getActivosFijosPorGruposs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				activosfijosporgrupossLocal=this.activosfijosporgruposs;
			}
			//ARCHITECTURE
		
			for(ActivosFijosPorGrupos activosfijosporgruposLocal:activosfijosporgrupossLocal) {
				if(this.permiteMantenimiento(activosfijosporgruposLocal) && activosfijosporgruposLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ActivosFijosPorGruposConstantesFunciones.getActivosFijosPorGruposLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcodigo_sub_grupoActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombre_sub_grupoActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcodigo_detalle_grupoActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombre_detalle_grupoActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelclaveActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombreActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelfecha_compraActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelvida_utilActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcosto_de_compraActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.MARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelmarcaActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.MODELO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelmodeloActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.COLOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcolorActivosFijosPorGrupos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ActivosFijosPorGruposConstantesFunciones.SERIE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelserieActivosFijosPorGrupos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcodigo_sub_grupoActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombre_sub_grupoActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcodigo_detalle_grupoActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombre_detalle_grupoActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelclaveActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombreActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelfecha_compraActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelvida_utilActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcosto_de_compraActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelmarcaActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelmodeloActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcolorActivosFijosPorGrupos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelserieActivosFijosPorGrupos,"");
		
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
		this.iIdNuevoActivosFijosPorGrupos--;	
		
		
		this.activosfijosporgruposAux=new ActivosFijosPorGrupos();
		
		this.activosfijosporgruposAux.setId(this.iIdNuevoActivosFijosPorGrupos);
		this.activosfijosporgruposAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.activosfijosporgruposLogic.getActivosFijosPorGruposs().add(this.activosfijosporgruposAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.activosfijosporgruposs.add(this.activosfijosporgruposAux);
		}
		//ARCHITECTURE
		
		this.activosfijosporgrupos=this.activosfijosporgruposAux;
		
		if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioActivosFijosPorGrupos(this.activosfijosporgrupos);
			this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorGrupos(this.activosfijosporgrupos);
		}
				
		//this.setDefaultControlesActivosFijosPorGrupos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyActivosFijosPorGrupos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyActivosFijosPorGrupos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijosPorGrupos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActivosFijosPorGrupos(this.activosfijosporgruposBean,this.activosfijosporgrupos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral,this.activosfijosporgruposBean,false);
		
		if(this.activosfijosporgruposReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos());
		}
		
		if(this.activosfijosporgruposReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos(),classes);//this.activosfijosporgruposBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyActivosFijosPorGrupos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyActivosFijosPorGrupos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.RecargarFormActivosFijosPorGrupos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingActivosFijosPorGrupos(false);
						
			if(activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijosPorGrupos();
			}
			
			this.actualizarVisualTableDatosActivosFijosPorGrupos();
			
			this.jTableDatosActivosFijosPorGrupos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorGrupos(), this.getIndiceNuevoActivosFijosPorGrupos());
			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
						
			this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesActivosFijosPorGrupos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarcodigo_sub_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarnombre_sub_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarcodigo_detalle_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarclaveActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarnombreActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarfecha_compraActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarvida_utilActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarcosto_de_compraActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarmarcaActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarmodeloActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarcolorActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarserieActivosFijosPorGrupos);	
		//
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarid_empresaActivosFijosPorGrupos);//
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setEnabled(isHabilitar && this.activosfijosporgruposConstantesFunciones.activarid_sucursalActivosFijosPorGrupos);
	};
	
	public void setDefaultControlesActivosFijosPorGrupos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoActivosFijosPorGrupos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.activosfijosporgruposSessionBean.setConGuardarRelaciones(true);			
			this.activosfijosporgruposSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.setVisible(true);
			
					
		} else {
			//this.activosfijosporgruposSessionBean.setConGuardarRelaciones(false);			
			this.activosfijosporgruposSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoActivosFijosPorGrupos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
				if(activosfijosporgruposAux.getId().equals(this.iIdNuevoActivosFijosPorGrupos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposs) {
				if(activosfijosporgruposAux.getId().equals(this.iIdNuevoActivosFijosPorGrupos)) {
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
	
	public int getIndiceActualActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
				if(activosfijosporgruposAux.getId().equals(activosfijosporgrupos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposs) {
				if(activosfijosporgruposAux.getId().equals(activosfijosporgrupos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgruposOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
				if(activosfijosporgruposAux.getActivosFijosPorGruposOriginal().getId().equals(activosfijosporgruposOriginal.getId())) {
					existe=true;
					activosfijosporgruposOriginal.setId(activosfijosporgruposAux.getId());
					activosfijosporgruposOriginal.setVersionRow(activosfijosporgruposAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposs) {
				if(activosfijosporgruposAux.getActivosFijosPorGruposOriginal().getId().equals(activosfijosporgruposOriginal.getId())) {
					existe=true;
					activosfijosporgruposOriginal.setId(activosfijosporgruposAux.getId());
					activosfijosporgruposOriginal.setVersionRow(activosfijosporgruposAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosActivosFijosPorGrupos(Boolean esParaCancelar) throws Exception {
		activosfijosporgrupossAux=new ArrayList<ActivosFijosPorGrupos>();
		activosfijosporgruposAux=new ActivosFijosPorGrupos();
		
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
					if(activosfijosporgruposAux.getId()<0) {
						activosfijosporgrupossAux.add(activosfijosporgruposAux);
					}		
				}
				this.iIdNuevoActivosFijosPorGrupos=0L;
				this.activosfijosporgruposLogic.getActivosFijosPorGruposs().removeAll(activosfijosporgrupossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposs) {
					if(activosfijosporgruposAux.getId()<0) {
						activosfijosporgrupossAux.add(activosfijosporgruposAux);
					}		
				}
				this.iIdNuevoActivosFijosPorGrupos=0L;
				this.activosfijosporgruposs.removeAll(activosfijosporgrupossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoActivosFijosPorGrupos 
					&& this.activosfijosporgruposLogic.getActivosFijosPorGruposs().size()>0
					) {
					activosfijosporgruposAux=this.activosfijosporgruposLogic.getActivosFijosPorGruposs().get(this.activosfijosporgruposLogic.getActivosFijosPorGruposs().size() - 1);
				
					if(activosfijosporgruposAux.getId()<0) {
						this.activosfijosporgruposLogic.getActivosFijosPorGruposs().remove(activosfijosporgruposAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoActivosFijosPorGrupos && this.activosfijosporgruposs.size()>0) {
					activosfijosporgruposAux=this.activosfijosporgruposs.get(this.activosfijosporgruposs.size() - 1);
				
					if(activosfijosporgruposAux.getId()<0) {
						this.activosfijosporgruposs.remove(activosfijosporgruposAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoActivosFijosPorGrupos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(activosfijosporgrupos.getId()<0) {
				this.activosfijosporgruposLogic.getActivosFijosPorGruposs().remove(this.activosfijosporgrupos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(activosfijosporgrupos.getId()<0) {
				this.activosfijosporgruposs.remove(this.activosfijosporgrupos);
			}
		}			
	}
	
	public void setEstadosInicialesActivosFijosPorGrupos(List<ActivosFijosPorGrupos> activosfijosporgrupossAux) throws Exception {
		ActivosFijosPorGruposConstantesFunciones.setEstadosInicialesActivosFijosPorGrupos(activosfijosporgrupossAux);
	}
	
	public void setEstadosInicialesActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgruposAux) throws Exception {
		ActivosFijosPorGruposConstantesFunciones.setEstadosInicialesActivosFijosPorGrupos(activosfijosporgruposAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarActivosFijosPorGruposActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarActivosFijosPorGruposActual()) {
				if(!this.isEsNuevoActivosFijosPorGrupos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoActivosFijosPorGrupos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarActivosFijosPorGruposActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Activos Fijos Por Grupos ?", "MANTENIMIENTO DE Activos Fijos Por Grupos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ActivosFijosPorGrupos activosfijosporgrupos) throws Exception {
		ActivosFijosPorGruposConstantesFunciones.seleccionarAsignar(this.activosfijosporgrupos,activosfijosporgrupos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarActivosFijosPorGrupos=this.isPermisoActualizarOriginalActivosFijosPorGrupos;
			
			
			this.seleccionarAsignar(activosfijosporgrupos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.activosfijosporgruposSessionBean.setsFuncionBusquedaRapida(this.activosfijosporgruposSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoActivosFijosPorGrupos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosActivosFijosPorGrupos(esParaCancelar);				
				this.cancelarNuevoActivosFijosPorGrupos(esParaCancelar);								
			}
			
			this.activosfijosporgrupos=new ActivosFijosPorGrupos();
			
			this.inicializarActivosFijosPorGrupos();
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarActivosFijosPorGrupos() throws Exception {
		try {
			ActivosFijosPorGruposConstantesFunciones.inicializarActivosFijosPorGrupos(this.activosfijosporgrupos);
			
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
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.activosfijosporgruposLogic.getActivosFijosPorGruposs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteActivosFijosPorGruposs(String sAccionBusqueda,List<ActivosFijosPorGrupos> activosfijosporgrupossParaReportes) throws Exception {
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
					sPathReporteFinal="ActivosFijosPorGrupos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ActivosFijosPorGruposMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ActivosFijosPorGruposMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ActivosFijosPorGrupos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Activos Fijos Por Gruposes");		
		parameters.put("busquedapor", ActivosFijosPorGruposConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceActivosFijosPorGrupos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ActivosFijosPorGruposConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ActivosFijosPorGruposConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceActivosFijosPorGrupos=new JRBeanArrayDataSource(ActivosFijosPorGruposJInternalFrame.TraerActivosFijosPorGruposBeans(activosfijosporgrupossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceActivosFijosPorGrupos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ActivosFijosPorGruposConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ActivosFijosPorGruposConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ActivosFijosPorGruposBean.TraerActivosFijosPorGruposBeans(activosfijosporgrupossParaReportes).toArray()));
							
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
				this.generarExcelReporteActivosFijosPorGruposs(sAccionBusqueda,sTipoArchivoReporte,activosfijosporgrupossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalActivosFijosPorGruposs(sAccionBusqueda,sTipoArchivoReporte,activosfijosporgrupossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGruposActionPerformed(null);
					//this.generarExcelReporteActivosFijosPorGruposs(sAccionBusqueda,sTipoArchivoReporte,activosfijosporgrupossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalActivosFijosPorGruposs(sAccionBusqueda,sTipoArchivoReporte,activosfijosporgrupossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesActivosFijosPorGruposs(sAccionBusqueda,sTipoArchivoReporte,activosfijosporgrupossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesActivosFijosPorGruposs(sAccionBusqueda,sTipoArchivoReporte,activosfijosporgrupossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteActivosFijosPorGruposs(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijosPorGrupos> activosfijosporgrupossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporgrupos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijosPorGruposs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActivosFijosPorGrupos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ActivosFijosPorGrupos activosfijosporgrupos : activosfijosporgrupossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ActivosFijosPorGruposConstantesFunciones.generarExcelReporteDataActivosFijosPorGrupos("NORMAL",row,workbook,activosfijosporgrupos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderActivosFijosPorGrupos(String sTipo,Row row,Workbook workbook) {
		
		ActivosFijosPorGruposConstantesFunciones.generarExcelReporteHeaderActivosFijosPorGrupos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalActivosFijosPorGruposs(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijosPorGrupos> activosfijosporgrupossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporgrupos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijosPorGruposs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ActivosFijosPorGrupos activosfijosporgrupos : activosfijosporgrupossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.getActivosFijosPorGruposDescripcion(activosfijosporgrupos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getcosto_de_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getmarca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getmodelo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getcolor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(activosfijosporgrupos.getserie());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesActivosFijosPorGruposs(String sAccionBusqueda,String sTipoArchivoReporte,List<ActivosFijosPorGrupos> activosfijosporgrupossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ActivosFijosPorGrupos> activosfijosporgrupossRespaldo=null;
		
		classes=ActivosFijosPorGruposConstantesFunciones.getClassesRelationshipsOfActivosFijosPorGrupos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.activosfijosporgruposLogic.setDatosCliente(this.datosCliente);
		this.activosfijosporgruposLogic.setDatosDeep(this.datosDeep);
		this.activosfijosporgruposLogic.setIsConDeep(true);
		
		activosfijosporgrupossRespaldo=this.activosfijosporgruposLogic.getActivosFijosPorGruposs();
		
		this.activosfijosporgruposLogic.setActivosFijosPorGruposs(activosfijosporgrupossParaReportes);	
		this.activosfijosporgruposLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		activosfijosporgrupossParaReportes=this.activosfijosporgruposLogic.getActivosFijosPorGruposs();
		this.activosfijosporgruposLogic.setActivosFijosPorGruposs(activosfijosporgrupossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporgrupos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ActivosFijosPorGruposs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderActivosFijosPorGrupos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ActivosFijosPorGrupos activosfijosporgrupos : activosfijosporgrupossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderActivosFijosPorGrupos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ActivosFijosPorGruposConstantesFunciones.generarExcelReporteDataActivosFijosPorGrupos("NORMAL",row,workbook,activosfijosporgrupos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.getActivosFijosPorGruposDescripcion(activosfijosporgrupos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessActivosFijosPorGrupos() throws Exception {		
		this.startProcessActivosFijosPorGrupos(true);
	}
	
	public void startProcessActivosFijosPorGrupos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasActivosFijosPorGrupos ,this.jPanelParametrosReportesActivosFijosPorGrupos, this.jScrollPanelDatosActivosFijosPorGrupos,this.jPanelPaginacionActivosFijosPorGrupos, this.jScrollPanelDatosEdicionActivosFijosPorGrupos, this.jPanelAccionesActivosFijosPorGrupos,this.jPanelAccionesFormularioActivosFijosPorGrupos,this.jmenuBarActivosFijosPorGrupos,this.jmenuBarDetalleActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,this.jTtoolBarDetalleActivosFijosPorGrupos);		
		
		final JTabbedPane jTabbedPaneBusquedasActivosFijosPorGrupos=this.jTabbedPaneBusquedasActivosFijosPorGrupos; 
		
		final JPanel jPanelParametrosReportesActivosFijosPorGrupos=this.jPanelParametrosReportesActivosFijosPorGrupos;
		//final JScrollPane jScrollPanelDatosActivosFijosPorGrupos=this.jScrollPanelDatosActivosFijosPorGrupos;
		final JTable jTableDatosActivosFijosPorGrupos=this.jTableDatosActivosFijosPorGrupos;		
		final JPanel jPanelPaginacionActivosFijosPorGrupos=this.jPanelPaginacionActivosFijosPorGrupos;
		//final JScrollPane jScrollPanelDatosEdicionActivosFijosPorGrupos=this.jScrollPanelDatosEdicionActivosFijosPorGrupos;
		final JPanel jPanelAccionesActivosFijosPorGrupos=this.jPanelAccionesActivosFijosPorGrupos;
		
		JPanel jPanelCamposAuxiliarActivosFijosPorGrupos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarActivosFijosPorGrupos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			jPanelCamposAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelCamposActivosFijosPorGrupos;
			jPanelAccionesFormularioAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelAccionesFormularioActivosFijosPorGrupos;
		}
		
		final JPanel jPanelCamposActivosFijosPorGrupos=jPanelCamposAuxiliarActivosFijosPorGrupos;
		final JPanel jPanelAccionesFormularioActivosFijosPorGrupos=jPanelAccionesFormularioAuxiliarActivosFijosPorGrupos;
		
		
		final JMenuBar jmenuBarActivosFijosPorGrupos=this.jmenuBarActivosFijosPorGrupos;
		final JToolBar jTtoolBarActivosFijosPorGrupos=this.jTtoolBarActivosFijosPorGrupos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarActivosFijosPorGrupos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActivosFijosPorGrupos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			jmenuBarDetalleAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jmenuBarDetalleActivosFijosPorGrupos;
			jTtoolBarDetalleAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTtoolBarDetalleActivosFijosPorGrupos;
		}
		
		final JMenuBar jmenuBarDetalleActivosFijosPorGrupos=jmenuBarDetalleAuxiliarActivosFijosPorGrupos;
		final JToolBar jTtoolBarDetalleActivosFijosPorGrupos=jTtoolBarDetalleAuxiliarActivosFijosPorGrupos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActivosFijosPorGrupos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActivosFijosPorGrupos;
			processRunnable.jTableDatos=jTableDatosActivosFijosPorGrupos;
			processRunnable.jPanelCampos=jPanelCamposActivosFijosPorGrupos;
			processRunnable.jPanelPaginacion=jPanelPaginacionActivosFijosPorGrupos;
			processRunnable.jPanelAcciones=jPanelAccionesActivosFijosPorGrupos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActivosFijosPorGrupos;
			
			
			processRunnable.jmenuBar=jmenuBarActivosFijosPorGrupos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActivosFijosPorGrupos;
			processRunnable.jTtoolBar=jTtoolBarActivosFijosPorGrupos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActivosFijosPorGrupos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasActivosFijosPorGrupos ,jPanelParametrosReportesActivosFijosPorGrupos,jTableDatosActivosFijosPorGrupos, /*jScrollPanelDatosActivosFijosPorGrupos,*/jPanelCamposActivosFijosPorGrupos,jPanelPaginacionActivosFijosPorGrupos, /*jScrollPanelDatosEdicionActivosFijosPorGrupos,*/ jPanelAccionesActivosFijosPorGrupos,jPanelAccionesFormularioActivosFijosPorGrupos,jmenuBarActivosFijosPorGrupos,jmenuBarDetalleActivosFijosPorGrupos,jTtoolBarActivosFijosPorGrupos,jTtoolBarDetalleActivosFijosPorGrupos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasActivosFijosPorGrupos ,jPanelParametrosReportesActivosFijosPorGrupos, jScrollPanelDatosActivosFijosPorGrupos,jPanelPaginacionActivosFijosPorGrupos, jScrollPanelDatosEdicionActivosFijosPorGrupos, jPanelAccionesActivosFijosPorGrupos,jPanelAccionesFormularioActivosFijosPorGrupos,jmenuBarActivosFijosPorGrupos,jmenuBarDetalleActivosFijosPorGrupos,jTtoolBarActivosFijosPorGrupos,jTtoolBarDetalleActivosFijosPorGrupos);
						
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
	
	public void finishProcessActivosFijosPorGrupos() {// throws Exception 
		this.finishProcessActivosFijosPorGrupos(true);
	}
	
	public void finishProcessActivosFijosPorGrupos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasActivosFijosPorGrupos ,this.jPanelParametrosReportesActivosFijosPorGrupos, this.jScrollPanelDatosActivosFijosPorGrupos,this.jPanelPaginacionActivosFijosPorGrupos, this.jScrollPanelDatosEdicionActivosFijosPorGrupos, this.jPanelAccionesActivosFijosPorGrupos,this.jPanelAccionesFormularioActivosFijosPorGrupos,this.jmenuBarActivosFijosPorGrupos,this.jmenuBarDetalleActivosFijosPorGrupos,this.jTtoolBarActivosFijosPorGrupos,this.jTtoolBarDetalleActivosFijosPorGrupos);		
		
		final JTabbedPane jTabbedPaneBusquedasActivosFijosPorGrupos=this.jTabbedPaneBusquedasActivosFijosPorGrupos; 
		
		final JPanel jPanelParametrosReportesActivosFijosPorGrupos=this.jPanelParametrosReportesActivosFijosPorGrupos;
		//final JScrollPane jScrollPanelDatosActivosFijosPorGrupos=this.jScrollPanelDatosActivosFijosPorGrupos;
		final JTable jTableDatosActivosFijosPorGrupos=this.jTableDatosActivosFijosPorGrupos;		
		final JPanel jPanelPaginacionActivosFijosPorGrupos=this.jPanelPaginacionActivosFijosPorGrupos;
		//final JScrollPane jScrollPanelDatosEdicionActivosFijosPorGrupos=this.jScrollPanelDatosEdicionActivosFijosPorGrupos;
		final JPanel jPanelAccionesActivosFijosPorGrupos=this.jPanelAccionesActivosFijosPorGrupos;
		
		JPanel jPanelCamposAuxiliarActivosFijosPorGrupos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarActivosFijosPorGrupos=new JPanel();
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			jPanelCamposAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelCamposActivosFijosPorGrupos;
			jPanelAccionesFormularioAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelAccionesFormularioActivosFijosPorGrupos;
		}
		
		final JPanel jPanelCamposActivosFijosPorGrupos=jPanelCamposAuxiliarActivosFijosPorGrupos;
		final JPanel jPanelAccionesFormularioActivosFijosPorGrupos=jPanelAccionesFormularioAuxiliarActivosFijosPorGrupos;
		
		
		final JMenuBar jmenuBarActivosFijosPorGrupos=this.jmenuBarActivosFijosPorGrupos;		
		final JToolBar jTtoolBarActivosFijosPorGrupos=this.jTtoolBarActivosFijosPorGrupos;
				
		JMenuBar jmenuBarDetalleAuxiliarActivosFijosPorGrupos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarActivosFijosPorGrupos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			jmenuBarDetalleAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jmenuBarDetalleActivosFijosPorGrupos;
			jTtoolBarDetalleAuxiliarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTtoolBarDetalleActivosFijosPorGrupos;		
		}
		
		final JMenuBar jmenuBarDetalleActivosFijosPorGrupos=jmenuBarDetalleAuxiliarActivosFijosPorGrupos;
		final JToolBar jTtoolBarDetalleActivosFijosPorGrupos=jTtoolBarDetalleAuxiliarActivosFijosPorGrupos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasActivosFijosPorGrupos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesActivosFijosPorGrupos;
			processRunnable.jTableDatos=jTableDatosActivosFijosPorGrupos;
			processRunnable.jPanelCampos=jPanelCamposActivosFijosPorGrupos;
			processRunnable.jPanelPaginacion=jPanelPaginacionActivosFijosPorGrupos;
			processRunnable.jPanelAcciones=jPanelAccionesActivosFijosPorGrupos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioActivosFijosPorGrupos;
			
			
			processRunnable.jmenuBar=jmenuBarActivosFijosPorGrupos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleActivosFijosPorGrupos;
			processRunnable.jTtoolBar=jTtoolBarActivosFijosPorGrupos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleActivosFijosPorGrupos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasActivosFijosPorGrupos ,jPanelParametrosReportesActivosFijosPorGrupos, jTableDatosActivosFijosPorGrupos,/*jScrollPanelDatosActivosFijosPorGrupos,*/jPanelCamposActivosFijosPorGrupos,jPanelPaginacionActivosFijosPorGrupos, /*jScrollPanelDatosEdicionActivosFijosPorGrupos,*/ jPanelAccionesActivosFijosPorGrupos,jPanelAccionesFormularioActivosFijosPorGrupos,jmenuBarActivosFijosPorGrupos,jmenuBarDetalleActivosFijosPorGrupos,jTtoolBarActivosFijosPorGrupos,jTtoolBarDetalleActivosFijosPorGrupos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesActivosFijosPorGrupos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarActivosFijosPorGrupos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuActivosFijosPorGrupos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarActivosFijosPorGrupos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarActivosFijosPorGrupos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleActivosFijosPorGrupos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuActivosFijosPorGrupos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarActivosFijosPorGrupos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleActivosFijosPorGrupos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.activosfijosporgruposConstantesFunciones.getsFinalQueryActivosFijosPorGrupos();
		String  finalQueryPaginacionTodos=this.activosfijosporgruposConstantesFunciones.getsFinalQueryActivosFijosPorGrupos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ActivosFijosPorGruposConstantesFunciones.getArrayColumnasGlobalesNoActivosFijosPorGrupos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ActivosFijosPorGruposConstantesFunciones.getArrayColumnasGlobalesActivosFijosPorGrupos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ActivosFijosPorGruposConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.activosfijosporgrupossEliminados= new ArrayList<ActivosFijosPorGrupos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessActivosFijosPorGrupos();
		
				///*ActivosFijosPorGruposSessionBean*/this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean();
			
			if(this.activosfijosporgruposSessionBean==null) {
				this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean();
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
					this.iNumeroPaginacion=ActivosFijosPorGruposConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ActivosFijosPorGruposConstantesFunciones.getClassesForeignKeysOfActivosFijosPorGrupos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/activosfijosporgrupos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			activosfijosporgrupossAux= new ArrayList<ActivosFijosPorGrupos>();
			
				
			activosfijosporgruposLogic.setDatosCliente(this.datosCliente);
			activosfijosporgruposLogic.setDatosDeep(this.datosDeep);
			activosfijosporgruposLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaActivosFijosPorGrupos")) {
				this.sDetalleReporte=ActivosFijosPorGruposConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorGrupos(idBusquedaActivosFijosPorGrupos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					activosfijosporgruposLogic.getActivosFijosPorGrupossBusquedaActivosFijosPorGrupos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaActivosFijosPorGrupos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActivosFijosPorGruposConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorGrupos(idBusquedaActivosFijosPorGrupos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActivosFijosPorGruposConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorGrupos(idBusquedaActivosFijosPorGrupos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=activosfijosporgruposLogic.getActivosFijosPorGruposs()==null||activosfijosporgruposLogic.getActivosFijosPorGruposs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=activosfijosporgruposs==null|| activosfijosporgruposs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporgrupossAux=new ArrayList<ActivosFijosPorGrupos>();
						activosfijosporgrupossAux.addAll(activosfijosporgruposLogic.getActivosFijosPorGruposs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijosporgrupossAux=new ArrayList<ActivosFijosPorGrupos>();
							activosfijosporgrupossAux.addAll(activosfijosporgruposs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							activosfijosporgruposLogic.getActivosFijosPorGrupossBusquedaActivosFijosPorGrupos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaActivosFijosPorGrupos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ActivosFijosPorGruposConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorGrupos(idBusquedaActivosFijosPorGrupos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ActivosFijosPorGruposConstantesFunciones.getDetalleIndiceBusquedaActivosFijosPorGrupos(idBusquedaActivosFijosPorGrupos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteActivosFijosPorGruposs("BusquedaActivosFijosPorGrupos",activosfijosporgruposLogic.getActivosFijosPorGruposs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteActivosFijosPorGruposs("BusquedaActivosFijosPorGrupos",activosfijosporgruposs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporgruposLogic.setActivosFijosPorGruposs(new ArrayList<ActivosFijosPorGrupos>());
						activosfijosporgruposLogic.getActivosFijosPorGruposs().addAll(activosfijosporgrupossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijosporgruposs=new ArrayList<ActivosFijosPorGrupos>();
							activosfijosporgruposs.addAll(activosfijosporgrupossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesActivosFijosPorGrupos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessActivosFijosPorGrupos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=activosfijosporgruposLogic.getActivosFijosPorGruposs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijosporgruposs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=activosfijosporgruposLogic.getActivosFijosPorGruposs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=activosfijosporgruposs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ActivosFijosPorGrupos activosfijosporgrupos) {
		Boolean permite=true;
		
		if(this.activosfijosporgrupos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ActivosFijosPorGruposConstantesFunciones.getOrderByListaActivosFijosPorGrupos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ActivosFijosPorGruposConstantesFunciones.getOrderByListaActivosFijosPorGrupos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
				if(activosfijosporgrupos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporgruposTotales=activosfijosporgrupos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorGrupos activosfijosporgrupos:this.activosfijosporgruposs) {
				if(activosfijosporgrupos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporgruposTotales=activosfijosporgrupos;
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
			this.activosfijosporgruposAux=new ActivosFijosPorGrupos();
			this.activosfijosporgruposAux.setsType(Constantes2.S_TOTALES);
			this.activosfijosporgruposAux.setIsNew(false);
			this.activosfijosporgruposAux.setIsChanged(false);
			this.activosfijosporgruposAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ActivosFijosPorGruposConstantesFunciones.TotalizarValoresFilaActivosFijosPorGrupos(this.activosfijosporgruposLogic.getActivosFijosPorGruposs(),this.activosfijosporgruposAux);
				
				//this.activosfijosporgruposLogic.getActivosFijosPorGruposs().add(this.activosfijosporgruposAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ActivosFijosPorGruposConstantesFunciones.TotalizarValoresFilaActivosFijosPorGrupos(this.activosfijosporgruposs,this.activosfijosporgruposAux);
				
				this.activosfijosporgruposs.add(this.activosfijosporgruposAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		activosfijosporgruposTotales=new ActivosFijosPorGrupos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.activosfijosporgruposLogic.getActivosFijosPorGruposs().remove(activosfijosporgruposTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.activosfijosporgruposs.remove(activosfijosporgruposTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		activosfijosporgruposTotales=new ActivosFijosPorGrupos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
				if(activosfijosporgrupos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporgruposTotales=activosfijosporgrupos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActivosFijosPorGruposConstantesFunciones.TotalizarValoresFilaActivosFijosPorGrupos(this.activosfijosporgruposLogic.getActivosFijosPorGruposs(),activosfijosporgruposTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ActivosFijosPorGrupos activosfijosporgrupos:this.activosfijosporgruposs) {
				if(activosfijosporgrupos.getsType().equals(Constantes2.S_TOTALES)) {
					activosfijosporgruposTotales=activosfijosporgrupos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ActivosFijosPorGruposConstantesFunciones.TotalizarValoresFilaActivosFijosPorGrupos(this.activosfijosporgruposs,activosfijosporgruposTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getActivosFijosPorGrupossBusquedaActivosFijosPorGrupos()throws Exception {
		try {
			sAccionBusqueda="BusquedaActivosFijosPorGrupos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getActivosFijosPorGrupossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getActivosFijosPorGrupossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getActivosFijosPorGrupossBusquedaActivosFijosPorGrupos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//activosfijosporgruposLogic.getActivosFijosPorGrupossBusquedaActivosFijosPorGrupos(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getActivosFijosPorGrupossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//activosfijosporgruposLogic.getActivosFijosPorGrupossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getActivosFijosPorGrupossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//activosfijosporgruposLogic.getActivosFijosPorGrupossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosActivosFijosPorGrupos() {
		this.isPermisoTodoActivosFijosPorGrupos=false;
		this.isPermisoNuevoActivosFijosPorGrupos=false;
		this.isPermisoActualizarActivosFijosPorGrupos=false;
		this.isPermisoActualizarOriginalActivosFijosPorGrupos=false;
		this.isPermisoEliminarActivosFijosPorGrupos=false;
		this.isPermisoGuardarCambiosActivosFijosPorGrupos=false;
		this.isPermisoConsultaActivosFijosPorGrupos=true;
		this.isPermisoBusquedaActivosFijosPorGrupos=true;
		this.isPermisoReporteActivosFijosPorGrupos=true;
		this.isPermisoOrdenActivosFijosPorGrupos=false;		
		this.isPermisoPaginacionMedioActivosFijosPorGrupos=false;		
		this.isPermisoPaginacionAltoActivosFijosPorGrupos=false;		
		this.isPermisoPaginacionTodoActivosFijosPorGrupos=false;		
		this.isPermisoCopiarActivosFijosPorGrupos=false;		
		this.isPermisoVerFormActivosFijosPorGrupos=false;		
		this.isPermisoDuplicarActivosFijosPorGrupos=false;
		this.isPermisoOrdenActivosFijosPorGrupos=false;
	}
	
	public void setPermisosUsuarioActivosFijosPorGrupos(Boolean isPermiso) {
		this.isPermisoTodoActivosFijosPorGrupos=isPermiso;
		this.isPermisoNuevoActivosFijosPorGrupos=isPermiso;
		this.isPermisoActualizarActivosFijosPorGrupos=isPermiso;
		this.isPermisoActualizarOriginalActivosFijosPorGrupos=isPermiso;
		this.isPermisoEliminarActivosFijosPorGrupos=isPermiso;
		this.isPermisoGuardarCambiosActivosFijosPorGrupos=isPermiso;
		this.isPermisoConsultaActivosFijosPorGrupos=isPermiso;
		this.isPermisoBusquedaActivosFijosPorGrupos=isPermiso;
		this.isPermisoReporteActivosFijosPorGrupos=isPermiso;
		this.isPermisoOrdenActivosFijosPorGrupos=isPermiso;		
		this.isPermisoPaginacionMedioActivosFijosPorGrupos=isPermiso;		
		this.isPermisoPaginacionAltoActivosFijosPorGrupos=isPermiso;		
		this.isPermisoPaginacionTodoActivosFijosPorGrupos=isPermiso;		
		this.isPermisoCopiarActivosFijosPorGrupos=isPermiso;		
		this.isPermisoVerFormActivosFijosPorGrupos=isPermiso;		
		this.isPermisoDuplicarActivosFijosPorGrupos=isPermiso;
		this.isPermisoOrdenActivosFijosPorGrupos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioActivosFijosPorGrupos(Boolean isPermiso) {
		//this.isPermisoTodoActivosFijosPorGrupos=isPermiso;
		this.isPermisoNuevoActivosFijosPorGrupos=isPermiso;
		this.isPermisoActualizarActivosFijosPorGrupos=isPermiso;
		this.isPermisoActualizarOriginalActivosFijosPorGrupos=isPermiso;
		this.isPermisoEliminarActivosFijosPorGrupos=isPermiso;
		this.isPermisoGuardarCambiosActivosFijosPorGrupos=isPermiso;
		//this.isPermisoConsultaActivosFijosPorGrupos=isPermiso;
		//this.isPermisoBusquedaActivosFijosPorGrupos=isPermiso;
		//this.isPermisoReporteActivosFijosPorGrupos=isPermiso;
		//this.isPermisoOrdenActivosFijosPorGrupos=isPermiso;		
		//this.isPermisoPaginacionMedioActivosFijosPorGrupos=isPermiso;		
		//this.isPermisoPaginacionAltoActivosFijosPorGrupos=isPermiso;		
		//this.isPermisoPaginacionTodoActivosFijosPorGrupos=isPermiso;		
		//this.isPermisoCopiarActivosFijosPorGrupos=isPermiso;		
		//this.isPermisoDuplicarActivosFijosPorGrupos=isPermiso;
		//this.isPermisoOrdenActivosFijosPorGrupos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioActivosFijosPorGruposClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ActivosFijosPorGruposJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebActivosFijosPorGrupos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioActivosFijosPorGruposClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioActivosFijosPorGruposClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionActivosFijosPorGruposClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioActivosFijosPorGruposClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioActivosFijosPorGrupos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ActivosFijosPorGruposJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ActivosFijosPorGruposConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoActivosFijosPorGrupos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarActivosFijosPorGrupos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalActivosFijosPorGrupos=this.isPermisoActualizarActivosFijosPorGrupos;
			this.isPermisoEliminarActivosFijosPorGrupos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosActivosFijosPorGrupos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaActivosFijosPorGrupos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaActivosFijosPorGrupos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoActivosFijosPorGrupos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteActivosFijosPorGrupos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActivosFijosPorGrupos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioActivosFijosPorGrupos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoActivosFijosPorGrupos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoActivosFijosPorGrupos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarActivosFijosPorGrupos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormActivosFijosPorGrupos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarActivosFijosPorGrupos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenActivosFijosPorGrupos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosActivosFijosPorGrupos.setToolTipText(this.jTableDatosActivosFijosPorGrupos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioActivosFijosPorGrupos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioActivosFijosPorGrupos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ActivosFijosPorGruposJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ActivosFijosPorGruposJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioActivosFijosPorGrupos() throws Exception {
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
	public void inicializarCombosForeignKeyActivosFijosPorGruposListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyActivosFijosPorGruposListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ActivosFijosPorGruposJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyActivosFijosPorGrupos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.activosfijosporgruposSessionBean==null) {
				this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean();
			}

			if(!this.activosfijosporgruposSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.activosfijosporgruposSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyActivosFijosPorGrupos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyActivosFijosPorGrupos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyActivosFijosPorGrupos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijosPorGrupos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyActivosFijosPorGrupos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyActivosFijosPorGrupos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyActivosFijosPorGrupos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyActivosFijosPorGrupos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroActivosFijosPorGrupos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyActivosFijosPorGrupos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyActivosFijosPorGrupos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyActivosFijosPorGrupos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.getItemCount()>0) {
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.getItemCount()>0) {
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ActivosFijosPorGruposBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ActivosFijosPorGruposBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ActivosFijosPorGruposBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.activosfijosporgruposSessionBean=new ActivosFijosPorGruposSessionBean(); 
		this.activosfijosporgruposConstantesFunciones=new ActivosFijosPorGruposConstantesFunciones(); 
		this.activosfijosporgruposBean=new ActivosFijosPorGrupos();//(this.activosfijosporgruposConstantesFunciones); 		
		this.activosfijosporgruposReturnGeneral=new ActivosFijosPorGruposParameterReturnGeneral(); 
		
		this.activosfijosporgruposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.activosfijosporgruposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ActivosFijosPorGruposBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ActivosFijosPorGruposBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ActivosFijosPorGruposBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessActivosFijosPorGrupos(true);
			
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
			
			this.activosfijosporgruposConstantesFunciones=new ActivosFijosPorGruposConstantesFunciones(); 
			this.activosfijosporgruposBean=new ActivosFijosPorGrupos();//this.activosfijosporgruposConstantesFunciones); 			
			this.activosfijosporgruposReturnGeneral=new ActivosFijosPorGruposParameterReturnGeneral(); 
		
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Activos Fijos Por Grupos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.activosfijosporgrupos=new ActivosFijosPorGrupos();
			this.activosfijosporgruposs = new ArrayList<ActivosFijosPorGrupos>();
			this.activosfijosporgrupossAux = new ArrayList<ActivosFijosPorGrupos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic=new ActivosFijosPorGruposLogic();
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			//this.activosfijosporgruposSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.activosfijosporgruposSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormActivosFijosPorGrupos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActivosFijosPorGrupos);	
					}
					
					if(this.jInternalFrameImportacionActivosFijosPorGrupos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActivosFijosPorGrupos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByActivosFijosPorGrupos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByActivosFijosPorGrupos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormActivosFijosPorGrupos);
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.setVisible(false);
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos);
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setVisible(false);
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionActivosFijosPorGrupos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionActivosFijosPorGrupos);
					this.jInternalFrameImportacionActivosFijosPorGrupos.setVisible(false);
					this.jInternalFrameImportacionActivosFijosPorGrupos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByActivosFijosPorGrupos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByActivosFijosPorGrupos);
					this.jInternalFrameOrderByActivosFijosPorGrupos.setVisible(false);
					this.jInternalFrameOrderByActivosFijosPorGrupos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idActivosFijosPorGruposActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ActivosFijosPorGruposConstantesFunciones.INUMEROPAGINACION;
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
			
			this.activosfijosporgruposReturnGeneral=new ActivosFijosPorGruposParameterReturnGeneral();
			
			this.activosfijosporgruposParameterGeneral=new ActivosFijosPorGruposParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.activosfijosporgruposLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ActivosFijosPorGruposJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActivosFijosPorGruposConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),this.activosfijosporgruposSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ActivosFijosPorGruposConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),this.activosfijosporgruposSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaDuplicarActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaCopiarActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaVerFormActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaOrdenActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
			
			
			this.isVisibilidadBusquedaActivosFijosPorGrupos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosActivosFijosPorGrupos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioActivosFijosPorGrupos(false);
			
			this.setPermisosUsuarioActivosFijosPorGrupos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() 
				|| (this.activosfijosporgruposSessionBean.getEsGuardarRelacionado() && this.activosfijosporgruposSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioActivosFijosPorGruposClasesRelacionadas();
			}
			
			if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioActivosFijosPorGruposClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosActivosFijosPorGrupos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualActivosFijosPorGrupos();
			}
			
			if(!this.isPermisoBusquedaActivosFijosPorGrupos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ActivosFijosPorGruposConstantesFunciones.getTiposSeleccionarActivosFijosPorGrupos());
				
				this.tiposColumnasSelect=ActivosFijosPorGruposConstantesFunciones.getTiposSeleccionarActivosFijosPorGrupos(true);
				
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
			//if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioActivosFijosPorGrupos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioActivosFijosPorGrupos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioActivosFijosPorGrupos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorGrupos() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				activosfijosporgruposImplementable= (ActivosFijosPorGruposImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActivosFijosPorGruposConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				activosfijosporgruposImplementableHome= (ActivosFijosPorGruposImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ActivosFijosPorGruposConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.activosfijosporgruposs= new ArrayList<ActivosFijosPorGrupos>();
			this.activosfijosporgrupossEliminados= new ArrayList<ActivosFijosPorGrupos>();
						
			this.isEsNuevoActivosFijosPorGrupos=false;
			this.esParaAccionDesdeFormularioActivosFijosPorGrupos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyActivosFijosPorGrupos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroActivosFijosPorGrupos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ActivosFijosPorGruposConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingActivosFijosPorGrupos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioActivosFijosPorGrupos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioActivosFijosPorGrupos();
			}
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasActivosFijosPorGrupos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasActivosFijosPorGrupos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasActivosFijosPorGrupos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessActivosFijosPorGrupos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ActivosFijosPorGrupos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectActivosFijosPorGrupos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesActivosFijosPorGrupos")) {
				iIndex=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessActivosFijosPorGrupos();	
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
	
	public void cargarCombosForeignKeyActivosFijosPorGrupos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyActivosFijosPorGrupos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyActivosFijosPorGrupos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyActivosFijosPorGruposListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyActivosFijosPorGrupos();
		
		this.cargarCombosFrameForeignKeyActivosFijosPorGrupos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyActivosFijosPorGrupos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyActivosFijosPorGrupos();
		}
	}
	
	
	
	public void jButtonNuevoActivosFijosPorGruposActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
			
			if(jTableDatosActivosFijosPorGrupos.getRowCount()>=1) {
				jTableDatosActivosFijosPorGrupos.removeRowSelectionInterval(0, jTableDatosActivosFijosPorGrupos.getRowCount()-1);						
			}
			
			this.isEsNuevoActivosFijosPorGrupos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoActivosFijosPorGrupos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesActivosFijosPorGrupos(true);			
			//this.activosfijosporgrupos=new ActivosFijosPorGrupos();
			//this.activosfijosporgrupos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos() ;
			
			if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijosPorGrupos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.activosfijosporgrupos);	
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);				
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
			if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ActivosFijosPorGrupos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarActivosFijosPorGruposActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosActivosFijosPorGrupos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosActivosFijosPorGrupos.getSelectedRows().length;			
			}
			
			activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoActivosFijosPorGrupos--;			
				//ActivosFijosPorGrupos activosfijosporgruposAux= new ActivosFijosPorGrupos();			
				//activosfijosporgruposAux.setId(this.iIdNuevoActivosFijosPorGrupos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ActivosFijosPorGrupos activosfijosporgruposOrigen=new ActivosFijosPorGrupos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ActivosFijosPorGrupos activosfijosporgruposOrigen : activosfijosporgrupossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							activosfijosporgruposOrigen =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							activosfijosporgruposOrigen =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaActivosFijosPorGrupos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.activosfijosporgrupos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosActivosFijosPorGrupos(activosfijosporgruposOrigen,this.activosfijosporgrupos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.activosfijosporgruposLogic.getActivosFijosPorGruposs().add(this.activosfijosporgruposAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.activosfijosporgruposs.add(this.activosfijosporgruposAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
				
				this.jTableDatosActivosFijosPorGrupos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorGrupos(), this.getIndiceNuevoActivosFijosPorGrupos());
				
				int iLastRow =  this.jTableDatosActivosFijosPorGrupos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActivosFijosPorGrupos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActivosFijosPorGrupos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();									
		
			ActivosFijosPorGrupos activosfijosporgruposOrigen=new ActivosFijosPorGrupos();
			ActivosFijosPorGrupos activosfijosporgruposDestino=new ActivosFijosPorGrupos();
				
			activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosActivosFijosPorGrupos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || activosfijosporgrupossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosActivosFijosPorGrupos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporgruposOrigen =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						activosfijosporgruposOrigen =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						activosfijosporgruposDestino =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						activosfijosporgruposDestino =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				activosfijosporgruposOrigen =activosfijosporgrupossSeleccionados.get(0);
				activosfijosporgruposDestino =activosfijosporgrupossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosActivosFijosPorGrupos(activosfijosporgruposOrigen,activosfijosporgruposDestino,true,false);
				
				activosfijosporgruposDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(activosfijosporgruposDestino,activosfijosporgruposLogic.getActivosFijosPorGruposs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(activosfijosporgruposDestino,activosfijosporgruposs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
				
				//this.jTableDatosActivosFijosPorGrupos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorGrupos(), this.getIndiceNuevoActivosFijosPorGrupos());
				
				int iLastRow =  this.jTableDatosActivosFijosPorGrupos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosActivosFijosPorGrupos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosActivosFijosPorGrupos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesActivosFijosPorGrupos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(!isVisible);
			this.jPanelPaginacionActivosFijosPorGrupos.setVisible(!isVisible);
			this.jPanelAccionesActivosFijosPorGrupos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameActivosFijosPorGrupos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoActivosFijosPorGrupos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionActivosFijosPorGrupos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByActivosFijosPorGrupos();
			
			this.abrirFrameOrderByActivosFijosPorGrupos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByActivosFijosPorGrupos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleActivosFijosPorGrupos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormActivosFijosPorGrupos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormActivosFijosPorGrupos.isMaximum()) {
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormActivosFijosPorGrupos.setSize(this.jInternalFrameDetalleFormActivosFijosPorGrupos.iWidthFormulario,this.jInternalFrameDetalleFormActivosFijosPorGrupos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormActivosFijosPorGrupos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormActivosFijosPorGrupos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormActivosFijosPorGrupos.isMaximum()) {
						this.jInternalFrameDetalleFormActivosFijosPorGrupos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jContentPaneDetalleActivosFijosPorGrupos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jContentPaneDetalleActivosFijosPorGrupos.getWidth(),ActivosFijosPorGruposConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jContentPaneDetalleActivosFijosPorGrupos.getWidth(),ActivosFijosPorGruposConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jContentPaneDetalleActivosFijosPorGrupos.getWidth(),ActivosFijosPorGruposConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormActivosFijosPorGrupos.setVisible(true);
	        this.jInternalFrameDetalleFormActivosFijosPorGrupos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByActivosFijosPorGrupos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByActivosFijosPorGrupos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByActivosFijosPorGrupos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorGrupos,false,this);
				} else {
					this.jInternalFrameOrderByActivosFijosPorGrupos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByActivosFijosPorGrupos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByActivosFijosPorGrupos);
				this.jInternalFrameOrderByActivosFijosPorGrupos.setVisible(false);
				this.jInternalFrameOrderByActivosFijosPorGrupos.setSelected(false);
				
				this.jInternalFrameOrderByActivosFijosPorGrupos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActivosFijosPorGrupos"));
				
				this.inicializarActualizarBindingTablaOrderByActivosFijosPorGrupos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionActivosFijosPorGrupos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionActivosFijosPorGrupos==null) {
				
				this.jInternalFrameImportacionActivosFijosPorGrupos=new ImportacionJInternalFrame(ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionActivosFijosPorGrupos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionActivosFijosPorGrupos);
				this.jInternalFrameImportacionActivosFijosPorGrupos.setVisible(false);
				this.jInternalFrameImportacionActivosFijosPorGrupos.setSelected(false);


				this.jInternalFrameImportacionActivosFijosPorGrupos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActivosFijosPorGrupos"));
				this.jInternalFrameImportacionActivosFijosPorGrupos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActivosFijosPorGrupos"));
				this.jInternalFrameImportacionActivosFijosPorGrupos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActivosFijosPorGrupos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoActivosFijosPorGrupos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos==null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos=new ReporteDinamicoJInternalFrame(ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoActivosFijosPorGrupos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos);
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setVisible(false);
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijosPorGrupos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijosPorGrupos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijosPorGrupos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijosPorGrupos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleActivosFijosPorGrupos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormActivosFijosPorGrupos);
			
	       	this.jInternalFrameDetalleFormActivosFijosPorGrupos.setVisible(false);
	        this.jInternalFrameDetalleFormActivosFijosPorGrupos.setSelected(false);
			
			//this.jInternalFrameDetalleFormActivosFijosPorGrupos.dispose();
			//this.jInternalFrameDetalleFormActivosFijosPorGrupos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoActivosFijosPorGrupos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setVisible(true);
	        this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionActivosFijosPorGrupos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionActivosFijosPorGrupos.setVisible(true);
	        this.jInternalFrameImportacionActivosFijosPorGrupos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByActivosFijosPorGrupos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByActivosFijosPorGrupos.setVisible(true);
	        this.jInternalFrameOrderByActivosFijosPorGrupos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByActivosFijosPorGrupos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByActivosFijosPorGrupos.setVisible(false);
	        this.jInternalFrameOrderByActivosFijosPorGrupos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoActivosFijosPorGrupos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setVisible(false);
	        this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionActivosFijosPorGrupos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionActivosFijosPorGrupos.setVisible(false);
	        this.jInternalFrameImportacionActivosFijosPorGrupos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarActivosFijosPorGrupos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarActivosFijosPorGrupos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesActivosFijosPorGrupos(true);
			//this.isEsNuevoActivosFijosPorGrupos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(false) ;
			
			if(activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijosPorGrupos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaActivosFijosPorGruposActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarActivosFijosPorGrupos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesActivosFijosPorGrupos(true);
			//this.isEsNuevoActivosFijosPorGrupos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.activosfijosporgrupos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(false) ;
			
			if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleActivosFijosPorGrupos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesActivosFijosPorGrupos(false);
			
			//if(!this.isEsNuevoActivosFijosPorGrupos) {								
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				
			}
			
			if(this.permiteMantenimiento(this.activosfijosporgrupos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoActivosFijosPorGrupos=true;
					this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
					this.isEsNuevoActivosFijosPorGrupos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoActivosFijosPorGrupos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoActivosFijosPorGrupos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(false);
				
				this.habilitarDeshabilitarControlesActivosFijosPorGrupos(false);
			
												
				
				if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleActivosFijosPorGrupos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoActivosFijosPorGruposActionPerformed(evt,activosfijosporgruposSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualActivosFijosPorGrupos(this.activosfijosporgrupos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosActivosFijosPorGrupos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,activosfijosporgruposSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.activosfijosporgrupos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				this.activosfijosporgrupos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				this.activosfijosporgrupos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.activosfijosporgrupos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ActivosFijosPorGruposModel) this.jTableDatosActivosFijosPorGrupos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoActivosFijosPorGrupos=true;
				this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
				this.isEsNuevoActivosFijosPorGrupos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(false);
				
				this.habilitarDeshabilitarControlesActivosFijosPorGrupos(false);
				
				
				
				if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleActivosFijosPorGrupos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosActivosFijosPorGrupos.getRowCount()>=1) {
				jTableDatosActivosFijosPorGrupos.removeRowSelectionInterval(0, jTableDatosActivosFijosPorGrupos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesActivosFijosPorGrupos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(false) ;
			
			this.isEsNuevoActivosFijosPorGrupos=false;
			
			if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleActivosFijosPorGrupos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				
				//SI ES MANUAL
				if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualActivosFijosPorGrupos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoActivosFijosPorGrupos--;			
			//ActivosFijosPorGrupos activosfijosporgruposAux= new ActivosFijosPorGrupos();			
			//activosfijosporgruposAux.setId(this.iIdNuevoActivosFijosPorGrupos);
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaActivosFijosPorGrupos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
			
			this.activosfijosporgrupos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.activosfijosporgruposLogic.getActivosFijosPorGruposs().add(this.activosfijosporgruposAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.activosfijosporgruposs.add(this.activosfijosporgruposAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
			
			this.jTableDatosActivosFijosPorGrupos.setRowSelectionInterval(this.getIndiceNuevoActivosFijosPorGrupos(), this.getIndiceNuevoActivosFijosPorGrupos());
			
			int iLastRow =  this.jTableDatosActivosFijosPorGrupos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosActivosFijosPorGrupos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosActivosFijosPorGrupos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorGrupos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijosPorGrupos();
			}
			
			//this.abrirFrameTreeActivosFijosPorGrupos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionActivosFijosPorGrupos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionActivosFijosPorGrupos.setFileImportacion(this.jInternalFrameImportacionActivosFijosPorGrupos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionActivosFijosPorGrupos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionActivosFijosPorGrupos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionActivosFijosPorGrupos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionActivosFijosPorGrupos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		

		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ActivosFijosPorGruposBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ActivosFijosPorGruposBaseDesign.jrxml";
			
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
			
			this.generarReporteActivosFijosPorGruposs("Todos",activosfijosporgrupossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_delo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_delo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_delo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_delo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rie_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rie_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rie_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rie_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoria="marca";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoria="modelo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR:
					sNombreCampoCategoria="color";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoria="serie";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoriaValor="marca";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO:
					sNombreCampoCategoriaValor="modelo";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR:
					sNombreCampoCategoriaValor="color";
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE:
					sNombreCampoCategoriaValor="serie";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo De Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"marca");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modelo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"modelo");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Color",sNombreCampoCategoria,sNombreCampoCategoriaValor,"color");
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Serie",sNombreCampoCategoria,sNombreCampoCategoriaValor,"serie");
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
	
	public void jButtonGenerarExcelReporteDinamicoActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporgrupos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ActivosFijosPorGruposs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getcosto_de_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getmarca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getmodelo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getcolor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE);
					iRow++;

					for(ActivosFijosPorGrupos activosfijosporgrupos:activosfijosporgrupossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(activosfijosporgrupos.getserie());
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
			//	this.getFilaCabeceraExportarExcelActivosFijosPorGrupos(row);				
			//	iRow++;
			//}				
			
			//for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgrupossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelActivosFijosPorGrupos(activosfijosporgruposAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
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
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorGrupos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualActivosFijosPorGrupos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorGrupos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActivosFijosPorGrupos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingActivosFijosPorGrupos(false);
			
			//SI ES MANUAL
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualActivosFijosPorGrupos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaActivosFijosPorGrupos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosActivosFijosPorGrupos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosActivosFijosPorGrupos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosActivosFijosPorGrupos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosActivosFijosPorGrupos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosActivosFijosPorGrupos.setMinimumSize(dimensionMinimum);
		this.jTableDatosActivosFijosPorGrupos.setMaximumSize(dimensionMaximum);
		this.jTableDatosActivosFijosPorGrupos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingActivosFijosPorGrupos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingActivosFijosPorGrupos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingActivosFijosPorGrupos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaActivosFijosPorGrupos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasActivosFijosPorGrupos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorGrupos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesActivosFijosPorGrupos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualActivosFijosPorGrupos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaActivosFijosPorGrupos();
		
		this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualActivosFijosPorGrupos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorGrupos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijosPorGrupos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijosPorGrupos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosActivosFijosPorGrupos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteActivosFijosPorGrupos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jCheckBoxPostAccionNuevoActivosFijosPorGrupos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jCheckBoxPostAccionSinCerrarActivosFijosPorGrupos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jCheckBoxPostAccionSinMensajeActivosFijosPorGrupos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosActivosFijosPorGrupos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteActivosFijosPorGrupos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.jCheckBoxPostAccionNuevoActivosFijosPorGrupos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.jCheckBoxPostAccionSinCerrarActivosFijosPorGrupos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.jCheckBoxPostAccionSinMensajeActivosFijosPorGrupos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionActivosFijosPorGrupos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionActivosFijosPorGrupos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesActivosFijosPorGrupos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesActivosFijosPorGrupos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesActivosFijosPorGrupos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralActivosFijosPorGrupos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesActivosFijosPorGrupos(Boolean esInicializar) throws Exception {
		try	{	
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualActivosFijosPorGrupos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesActivosFijosPorGrupos() throws Exception {
		try	{
			if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualActivosFijosPorGrupos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActivosFijosPorGrupos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualActivosFijosPorGrupos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesActivosFijosPorGrupos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesActivosFijosPorGrupos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesActivosFijosPorGrupos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesActivosFijosPorGrupos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionActivosFijosPorGrupos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionActivosFijosPorGrupos.addItem(reporte);
			}
			
			
			if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionActivosFijosPorGrupos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionActivosFijosPorGrupos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesActivosFijosPorGrupos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesActivosFijosPorGrupos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesActivosFijosPorGrupos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesActivosFijosPorGrupos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijosPorGrupos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualActivosFijosPorGrupos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
				
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ActivosFijosPorGruposConstantesFunciones.getTiposSeleccionarActivosFijosPorGrupos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ActivosFijosPorGruposConstantesFunciones.getTiposSeleccionarActivosFijosPorGrupos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ActivosFijosPorGruposConstantesFunciones.getTiposSeleccionarActivosFijosPorGrupos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualActivosFijosPorGrupos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaActivosFijosPorGrupos=Long.parseLong(this.jLabelidActivosFijosPorGruposBusquedaActivosFijosPorGrupos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasActivosFijosPorGrupos(Boolean esInicializar) throws Exception {				
		if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualActivosFijosPorGrupos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaActivosFijosPorGrupos() throws Exception {
		this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByActivosFijosPorGrupos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosActivosFijosPorGruposOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGruposOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaActivosFijosPorGrupos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=activosfijosporgruposLogic.getActivosFijosPorGruposs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=activosfijosporgruposs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosActivosFijosPorGrupos.setModel(new ActivosFijosPorGruposModel(this.activosfijosporgruposLogic.getActivosFijosPorGruposs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosActivosFijosPorGrupos.setModel(new ActivosFijosPorGruposModel(this.activosfijosporgruposs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByActivosFijosPorGrupos!=null && this.jInternalFrameOrderByActivosFijosPorGrupos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByActivosFijosPorGrupos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO,activosfijosporgruposConstantesFunciones.resaltarSeleccionarActivosFijosPorGrupos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ActivosFijosPorGruposConstantesFunciones.SCLASSWEBTITULO,activosfijosporgruposConstantesFunciones.resaltarSeleccionarActivosFijosPorGrupos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_ID));

		if(this.activosfijosporgruposConstantesFunciones.mostraridActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosporgruposConstantesFunciones.resaltaridActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activaridActivosFijosPorGrupos,iSizeTabla,this,true,"idActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltaridActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activaridActivosFijosPorGrupos,this,true,"idActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.activosfijosporgruposConstantesFunciones.mostrarcodigo_sub_grupoActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_sub_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcodigo_sub_grupoActivosFijosPorGrupos,iSizeTabla,this,true,"codigo_sub_grupoActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_sub_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcodigo_sub_grupoActivosFijosPorGrupos,this,true,"codigo_sub_grupoActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.activosfijosporgruposConstantesFunciones.mostrarnombre_sub_grupoActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarnombre_sub_grupoActivosFijosPorGrupos,iSizeTabla,this,true,"nombre_sub_grupoActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarnombre_sub_grupoActivosFijosPorGrupos,this,true,"nombre_sub_grupoActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.activosfijosporgruposConstantesFunciones.mostrarcodigo_detalle_grupoActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_detalle_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcodigo_detalle_grupoActivosFijosPorGrupos,iSizeTabla,this,true,"codigo_detalle_grupoActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_detalle_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcodigo_detalle_grupoActivosFijosPorGrupos,this,true,"codigo_detalle_grupoActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.activosfijosporgruposConstantesFunciones.mostrarnombre_detalle_grupoActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorGrupos,iSizeTabla,this,true,"nombre_detalle_grupoActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorGrupos,this,true,"nombre_detalle_grupoActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE));

		if(this.activosfijosporgruposConstantesFunciones.mostrarclaveActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarclaveActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarclaveActivosFijosPorGrupos,iSizeTabla,this,true,"claveActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarclaveActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarclaveActivosFijosPorGrupos,this,true,"claveActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE));

		if(this.activosfijosporgruposConstantesFunciones.mostrarnombreActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarnombreActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarnombreActivosFijosPorGrupos,iSizeTabla,this,true,"nombreActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarnombreActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarnombreActivosFijosPorGrupos,this,true,"nombreActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.activosfijosporgruposConstantesFunciones.mostrarfecha_compraActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.activosfijosporgruposConstantesFunciones.resaltarfecha_compraActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarfecha_compraActivosFijosPorGrupos,iSizeTabla,this,true,"fecha_compraActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarfecha_compraActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarfecha_compraActivosFijosPorGrupos,this,true,"fecha_compraActivosFijosPorGrupos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL));

		if(this.activosfijosporgruposConstantesFunciones.mostrarvida_utilActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosporgruposConstantesFunciones.resaltarvida_utilActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarvida_utilActivosFijosPorGrupos,iSizeTabla,this,true,"vida_utilActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarvida_utilActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarvida_utilActivosFijosPorGrupos,this,true,"vida_utilActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.activosfijosporgruposConstantesFunciones.mostrarcosto_de_compraActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcosto_de_compraActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcosto_de_compraActivosFijosPorGrupos,iSizeTabla,this,true,"costo_de_compraActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcosto_de_compraActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcosto_de_compraActivosFijosPorGrupos,this,true,"costo_de_compraActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA));

		if(this.activosfijosporgruposConstantesFunciones.mostrarmarcaActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarmarcaActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarmarcaActivosFijosPorGrupos,iSizeTabla,this,true,"marcaActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarmarcaActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarmarcaActivosFijosPorGrupos,this,true,"marcaActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO));

		if(this.activosfijosporgruposConstantesFunciones.mostrarmodeloActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarmodeloActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarmodeloActivosFijosPorGrupos,iSizeTabla,this,true,"modeloActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarmodeloActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarmodeloActivosFijosPorGrupos,this,true,"modeloActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR));

		if(this.activosfijosporgruposConstantesFunciones.mostrarcolorActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcolorActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcolorActivosFijosPorGrupos,iSizeTabla,this,true,"colorActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarcolorActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarcolorActivosFijosPorGrupos,this,true,"colorActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE));

		if(this.activosfijosporgruposConstantesFunciones.mostrarserieActivosFijosPorGrupos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.activosfijosporgruposConstantesFunciones.resaltarserieActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarserieActivosFijosPorGrupos,iSizeTabla,this,true,"serieActivosFijosPorGrupos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.activosfijosporgruposConstantesFunciones.resaltarserieActivosFijosPorGrupos,this.activosfijosporgruposConstantesFunciones.activarserieActivosFijosPorGrupos,this,true,"serieActivosFijosPorGrupos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ActivosFijosPorGruposPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActivosFijosPorGrupos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosActivosFijosPorGrupos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosActivosFijosPorGrupos.addColumn(tableColumn);
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
			
			this.jTableDatosActivosFijosPorGrupos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosActivosFijosPorGrupos.moveColumn(this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosActivosFijosPorGrupos.moveColumn(this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosActivosFijosPorGrupos.moveColumn(this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosActivosFijosPorGrupos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosActivosFijosPorGrupos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosActivosFijosPorGrupos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosActivosFijosPorGrupos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosActivosFijosPorGrupos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosActivosFijosPorGrupos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=activosfijosporgruposLogic.getActivosFijosPorGruposs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=activosfijosporgruposs.size()-1;
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
		//this.jTableDatosActivosFijosPorGrupos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosActivosFijosPorGrupos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosActivosFijosPorGrupos();
			
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
				
				//this.isEsNuevoActivosFijosPorGrupos=false;
					
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
				if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActivosFijosPorGrupos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActivosFijosPorGrupos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.activosfijosporgrupos.getsType().equals("DUPLICADO")
				   || this.activosfijosporgrupos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoActivosFijosPorGrupos=true;
				
				} else {
					this.isEsNuevoActivosFijosPorGrupos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
					if(this.activosfijosporgrupos.getId()>=0 && !this.activosfijosporgrupos.getIsNew()) {						
						this.isEsNuevoActivosFijosPorGrupos=false;
						
					} else {
						this.isEsNuevoActivosFijosPorGrupos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoActivosFijosPorGrupos(esRelaciones);						
				
				this.seleccionarActivosFijosPorGrupos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.activosfijosporgrupos.getId()<0) {
					this.isEsNuevoActivosFijosPorGrupos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarActivosFijosPorGrupos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarActivosFijosPorGrupos(evt,rowIndex);
				}	
				
				if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ActivosFijosPorGrupos: " + this.dDif); 
					}
				}								
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarActivosFijosPorGrupos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.activosfijosporgrupos)) {
					if(this.activosfijosporgrupos.getId()>0) {
						this.activosfijosporgrupos.setIsDeleted(true);
						
						this.activosfijosporgrupossEliminados.add(this.activosfijosporgrupos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.activosfijosporgruposLogic.getActivosFijosPorGruposs().remove(this.activosfijosporgrupos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.activosfijosporgruposs.remove(this.activosfijosporgrupos);				
					}
					
					
					((ActivosFijosPorGruposModel) this.jTableDatosActivosFijosPorGrupos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarActivosFijosPorGrupos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoActivosFijosPorGrupos) {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosActivosFijosPorGrupos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosActivosFijosPorGrupos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioActivosFijosPorGrupos(this.activosfijosporgrupos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesActivosFijosPorGrupos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesActivosFijosPorGrupos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoActivosFijosPorGrupos(activosfijosporgrupos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioActivosFijosPorGrupos(activosfijosporgrupos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyActivosFijosPorGrupos(activosfijosporgrupos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorGrupos(activosfijosporgrupos);
	}
	
	public void setVariablesObjetoActualToFormularioActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.setText(activosfijosporgrupos.getId().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.setText(activosfijosporgrupos.getclave());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.setText(activosfijosporgrupos.getnombre());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.setDate(activosfijosporgrupos.getfecha_compra());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.setText(activosfijosporgrupos.getvida_util().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.setText(activosfijosporgrupos.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.setText(activosfijosporgrupos.getmarca());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.setText(activosfijosporgrupos.getmodelo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.setText(activosfijosporgrupos.getcolor());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.setText(activosfijosporgrupos.getserie());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ActivosFijosPorGrupos activosfijosporgruposLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,activosfijosporgruposLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ActivosFijosPorGrupos activosfijosporgruposLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				activosfijosporgruposLocal=this.activosfijosporgrupos;
			} else {
				activosfijosporgruposLocal=this.activosfijosporgruposAnterior;
			}
		}
		
		if(this.permiteMantenimiento(activosfijosporgruposLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoActivosFijosPorGrupos(activosfijosporgruposLocal,true);
					
					if(activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(activosfijosporgruposLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(activosfijosporgruposLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(activosfijosporgrupos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(activosfijosporgrupos);
	}
	
	public void setVariablesFormularioToObjetoActualActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(activosfijosporgrupos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.getText()==null || this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.getText()=="" || this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.getText()=="Id") {
				this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.setText("0");
			}

			if(conColumnasBase) {activosfijosporgrupos.setId(Long.parseLong(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelIdActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setcodigo_sub_grupo(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcodigo_sub_grupoActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setnombre_sub_grupo(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombre_sub_grupoActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcodigo_detalle_grupoActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setnombre_detalle_grupo(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombre_detalle_grupoActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setclave(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelclaveActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setnombre(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelnombreActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setfecha_compra(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelfecha_compraActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelvida_utilActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcosto_de_compraActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setmarca(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelmarcaActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setmodelo(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelmodeloActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setcolor(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelcolorActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			activosfijosporgrupos.setserie(this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelserieActivosFijosPorGrupos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgruposBean,ActivosFijosPorGrupos activosfijosporgrupos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgruposOrigen,ActivosFijosPorGrupos activosfijosporgrupos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && activosfijosporgruposOrigen.getId()!=null && !activosfijosporgruposOrigen.getId().equals(0L))) {activosfijosporgrupos.setId(activosfijosporgruposOrigen.getId());}}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getcodigo_sub_grupo()!=null && !activosfijosporgruposOrigen.getcodigo_sub_grupo().equals(""))) {activosfijosporgrupos.setcodigo_sub_grupo(activosfijosporgruposOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getnombre_sub_grupo()!=null && !activosfijosporgruposOrigen.getnombre_sub_grupo().equals(""))) {activosfijosporgrupos.setnombre_sub_grupo(activosfijosporgruposOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getcodigo_detalle_grupo()!=null && !activosfijosporgruposOrigen.getcodigo_detalle_grupo().equals(""))) {activosfijosporgrupos.setcodigo_detalle_grupo(activosfijosporgruposOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getnombre_detalle_grupo()!=null && !activosfijosporgruposOrigen.getnombre_detalle_grupo().equals(""))) {activosfijosporgrupos.setnombre_detalle_grupo(activosfijosporgruposOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getclave()!=null && !activosfijosporgruposOrigen.getclave().equals(""))) {activosfijosporgrupos.setclave(activosfijosporgruposOrigen.getclave());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getnombre()!=null && !activosfijosporgruposOrigen.getnombre().equals(""))) {activosfijosporgrupos.setnombre(activosfijosporgruposOrigen.getnombre());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getfecha_compra()!=null && !activosfijosporgruposOrigen.getfecha_compra().equals(new Date()))) {activosfijosporgrupos.setfecha_compra(activosfijosporgruposOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getvida_util()!=null && !activosfijosporgruposOrigen.getvida_util().equals(0.0))) {activosfijosporgrupos.setvida_util(activosfijosporgruposOrigen.getvida_util());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getcosto_de_compra()!=null && !activosfijosporgruposOrigen.getcosto_de_compra().equals(0.0))) {activosfijosporgrupos.setcosto_de_compra(activosfijosporgruposOrigen.getcosto_de_compra());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getmarca()!=null && !activosfijosporgruposOrigen.getmarca().equals(""))) {activosfijosporgrupos.setmarca(activosfijosporgruposOrigen.getmarca());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getmodelo()!=null && !activosfijosporgruposOrigen.getmodelo().equals(""))) {activosfijosporgrupos.setmodelo(activosfijosporgruposOrigen.getmodelo());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getcolor()!=null && !activosfijosporgruposOrigen.getcolor().equals(""))) {activosfijosporgrupos.setcolor(activosfijosporgruposOrigen.getcolor());}
			if(conDefault || (!conDefault && activosfijosporgruposOrigen.getserie()!=null && !activosfijosporgruposOrigen.getserie().equals(""))) {activosfijosporgrupos.setserie(activosfijosporgruposOrigen.getserie());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.setText(activosfijosporgrupos.getId().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setText(activosfijosporgrupos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.setText(activosfijosporgrupos.getclave());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.setText(activosfijosporgrupos.getnombre());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.setDate(activosfijosporgrupos.getfecha_compra());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.setText(activosfijosporgrupos.getvida_util().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.setText(activosfijosporgrupos.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.setText(activosfijosporgrupos.getmarca());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.setText(activosfijosporgrupos.getmodelo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.setText(activosfijosporgrupos.getcolor());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.setText(activosfijosporgrupos.getserie());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioActivosFijosPorGrupos(ActivosFijosPorGruposBean activosfijosporgruposBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.setText(activosfijosporgruposBean.getId().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setText(activosfijosporgruposBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.setText(activosfijosporgruposBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setText(activosfijosporgruposBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setText(activosfijosporgruposBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.setText(activosfijosporgruposBean.getclave());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.setText(activosfijosporgruposBean.getnombre());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.setDate(activosfijosporgruposBean.getfecha_compra());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.setText(activosfijosporgruposBean.getvida_util().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.setText(activosfijosporgruposBean.getcosto_de_compra().toString());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.setText(activosfijosporgruposBean.getmarca());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.setText(activosfijosporgruposBean.getmodelo());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.setText(activosfijosporgruposBean.getcolor());
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.setText(activosfijosporgruposBean.getserie());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanActivosFijosPorGrupos(ActivosFijosPorGruposParameterReturnGeneral activosfijosporgruposReturnGeneral,ActivosFijosPorGruposBean activosfijosporgruposBean,Boolean conDefault) throws Exception { 
		try {
			ActivosFijosPorGrupos activosfijosporgruposLocal=new ActivosFijosPorGrupos();
			
			activosfijosporgruposLocal=activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && activosfijosporgruposLocal.getId()!=null && !activosfijosporgruposLocal.getId().equals(0L))) {activosfijosporgruposBean.setId(activosfijosporgruposLocal.getId());}}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getcodigo_sub_grupo()!=null && !activosfijosporgruposLocal.getcodigo_sub_grupo().equals(""))) {activosfijosporgruposBean.setcodigo_sub_grupo(activosfijosporgruposLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getnombre_sub_grupo()!=null && !activosfijosporgruposLocal.getnombre_sub_grupo().equals(""))) {activosfijosporgruposBean.setnombre_sub_grupo(activosfijosporgruposLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getcodigo_detalle_grupo()!=null && !activosfijosporgruposLocal.getcodigo_detalle_grupo().equals(""))) {activosfijosporgruposBean.setcodigo_detalle_grupo(activosfijosporgruposLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getnombre_detalle_grupo()!=null && !activosfijosporgruposLocal.getnombre_detalle_grupo().equals(""))) {activosfijosporgruposBean.setnombre_detalle_grupo(activosfijosporgruposLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getclave()!=null && !activosfijosporgruposLocal.getclave().equals(""))) {activosfijosporgruposBean.setclave(activosfijosporgruposLocal.getclave());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getnombre()!=null && !activosfijosporgruposLocal.getnombre().equals(""))) {activosfijosporgruposBean.setnombre(activosfijosporgruposLocal.getnombre());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getfecha_compra()!=null && !activosfijosporgruposLocal.getfecha_compra().equals(new Date()))) {activosfijosporgruposBean.setfecha_compra(activosfijosporgruposLocal.getfecha_compra());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getvida_util()!=null && !activosfijosporgruposLocal.getvida_util().equals(0.0))) {activosfijosporgruposBean.setvida_util(activosfijosporgruposLocal.getvida_util());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getcosto_de_compra()!=null && !activosfijosporgruposLocal.getcosto_de_compra().equals(0.0))) {activosfijosporgruposBean.setcosto_de_compra(activosfijosporgruposLocal.getcosto_de_compra());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getmarca()!=null && !activosfijosporgruposLocal.getmarca().equals(""))) {activosfijosporgruposBean.setmarca(activosfijosporgruposLocal.getmarca());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getmodelo()!=null && !activosfijosporgruposLocal.getmodelo().equals(""))) {activosfijosporgruposBean.setmodelo(activosfijosporgruposLocal.getmodelo());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getcolor()!=null && !activosfijosporgruposLocal.getcolor().equals(""))) {activosfijosporgruposBean.setcolor(activosfijosporgruposLocal.getcolor());}
			if(conDefault || (!conDefault && activosfijosporgruposLocal.getserie()!=null && !activosfijosporgruposLocal.getserie().equals(""))) {activosfijosporgruposBean.setserie(activosfijosporgruposLocal.getserie());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxActivosFijosPorGruposGenerico(Long idActivosFijosPorGruposSeleccionado,JComboBox jComboBoxActivosFijosPorGrupos,List<ActivosFijosPorGrupos> activosfijosporgrupossLocal)throws Exception {
		try {
			ActivosFijosPorGrupos  activosfijosporgruposTemp=null;

			for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgrupossLocal) {
				if(activosfijosporgruposAux.getId()!=null && activosfijosporgruposAux.getId().equals(idActivosFijosPorGruposSeleccionado)) {
					activosfijosporgruposTemp=activosfijosporgruposAux;
					break;
				}
			}

			jComboBoxActivosFijosPorGrupos.setSelectedItem(activosfijosporgruposTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxActivosFijosPorGruposGenerico(JComboBox jComboBoxActivosFijosPorGrupos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActivosFijosPorGrupos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxActivosFijosPorGrupos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxActivosFijosPorGrupos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxActivosFijosPorGrupos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxActivosFijosPorGrupos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxActivosFijosPorGrupos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosporgrupos=(ActivosFijosPorGrupos) activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			activosfijosporgrupos =(ActivosFijosPorGrupos) activosfijosporgruposs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!activosfijosporgrupos.getIsNew() && !activosfijosporgrupos.getIsChanged() && !activosfijosporgrupos.getIsDeleted()) {
				sDescripcion=activosfijosporgrupos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=activosfijosporgrupos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!activosfijosporgrupos.getIsNew() && !activosfijosporgrupos.getIsChanged() && !activosfijosporgrupos.getIsDeleted()) {
				sDescripcion=activosfijosporgrupos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=activosfijosporgrupos.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ActivosFijosPorGrupos activosfijosporgruposRow=new ActivosFijosPorGrupos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosporgruposRow=(ActivosFijosPorGrupos) activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			activosfijosporgruposRow=(ActivosFijosPorGrupos) activosfijosporgruposs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos));			
			this.jButtonDuplicarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijosPorGrupos && this.isPermisoDuplicarActivosFijosPorGrupos));			
			this.jButtonCopiarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaCopiarActivosFijosPorGrupos && this.isPermisoCopiarActivosFijosPorGrupos));
			this.jButtonVerFormActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaVerFormActivosFijosPorGrupos && this.isPermisoVerFormActivosFijosPorGrupos));
			
			this.jButtonAbrirOrderByActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorGrupos && this.isPermisoOrdenActivosFijosPorGrupos));			
			
			this.jButtonNuevoRelacionesActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos));			
			this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaModificarActivosFijosPorGrupos && this.isPermisoActualizarActivosFijosPorGrupos));	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaActualizarActivosFijosPorGrupos && this.isPermisoActualizarActivosFijosPorGrupos));	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaEliminarActivosFijosPorGrupos && this.isPermisoEliminarActivosFijosPorGrupos));
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarActivosFijosPorGrupos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorGrupos);							
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));			
			
			}
						
			this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos));						
			this.jButtonDuplicarToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijosPorGrupos && this.isPermisoDuplicarActivosFijosPorGrupos));						
			this.jButtonCopiarToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaCopiarActivosFijosPorGrupos && this.isPermisoCopiarActivosFijosPorGrupos));			
			this.jButtonVerFormToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaVerFormActivosFijosPorGrupos && this.isPermisoVerFormActivosFijosPorGrupos));			
			this.jButtonAbrirOrderByToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorGrupos && this.isPermisoOrdenActivosFijosPorGrupos));
			this.jButtonNuevoRelacionesToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos));			
			this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));			
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaModificarActivosFijosPorGrupos && this.isPermisoActualizarActivosFijosPorGrupos));	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaActualizarActivosFijosPorGrupos  && this.isPermisoActualizarActivosFijosPorGrupos));	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaEliminarActivosFijosPorGrupos && this.isPermisoEliminarActivosFijosPorGrupos));
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarToolBarActivosFijosPorGrupos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorGrupos);				
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos));			
			this.jMenuItemDuplicarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaDuplicarActivosFijosPorGrupos && this.isPermisoDuplicarActivosFijosPorGrupos));			
			this.jMenuItemCopiarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaCopiarActivosFijosPorGrupos && this.isPermisoCopiarActivosFijosPorGrupos));			
			this.jMenuItemVerFormActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaVerFormActivosFijosPorGrupos && this.isPermisoVerFormActivosFijosPorGrupos));			
			this.jMenuItemAbrirOrderByActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorGrupos && this.isPermisoOrdenActivosFijosPorGrupos));			
			//this.jMenuItemMostrarOcultarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorGrupos && this.isPermisoOrdenActivosFijosPorGrupos));
			this.jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorGrupos && this.isPermisoOrdenActivosFijosPorGrupos));			
			//this.jMenuItemDetalleMostrarOcultarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaOrdenActivosFijosPorGrupos && this.isPermisoOrdenActivosFijosPorGrupos));			
			this.jMenuItemNuevoRelacionesActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos));			
			this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaNuevoActivosFijosPorGrupos && this.isPermisoNuevoActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));									
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemModificarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaModificarActivosFijosPorGrupos && this.isPermisoActualizarActivosFijosPorGrupos));	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemActualizarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaActualizarActivosFijosPorGrupos && this.isPermisoActualizarActivosFijosPorGrupos));	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemEliminarActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaEliminarActivosFijosPorGrupos && this.isPermisoEliminarActivosFijosPorGrupos));
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemCancelarActivosFijosPorGrupos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorGrupos);				
			}
			
			this.jMenuItemGuardarCambiosActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));						
			this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=this.jButtonNuevoActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaDuplicarActivosFijosPorGrupos=this.jButtonDuplicarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaCopiarActivosFijosPorGrupos=this.jButtonCopiarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaVerFormActivosFijosPorGrupos=this.jButtonVerFormActivosFijosPorGrupos.isVisible();
			
			this.isVisibilidadCeldaOrdenActivosFijosPorGrupos=this.jButtonAbrirOrderByActivosFijosPorGrupos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=this.jButtonNuevoRelacionesActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=this.jButtonModificarActivosFijosPorGrupos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=this.jButtonNuevoToolBarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=this.jButtonNuevoRelacionesToolBarActivosFijosPorGrupos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarToolBarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarToolBarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarToolBarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarToolBarActivosFijosPorGrupos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=this.jButtonGuardarCambiosToolBarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=this.jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=this.jMenuItemNuevoActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=this.jMenuItemNuevoRelacionesActivosFijosPorGrupos.isVisible();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemModificarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemActualizarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemEliminarActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemCancelarActivosFijosPorGrupos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=this.jMenuItemGuardarCambiosActivosFijosPorGrupos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesActivosFijosPorGrupos(Boolean esInicializar) {
		if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {			
			if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
				//if(this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesActivosFijosPorGrupos();
			}
			
			this.inicializarActualizarBindingBotonesManualActivosFijosPorGrupos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualActivosFijosPorGrupos() {
		this.jButtonNuevoActivosFijosPorGrupos.setVisible(this.isPermisoNuevoActivosFijosPorGrupos);			
		this.jButtonDuplicarActivosFijosPorGrupos.setVisible(this.isPermisoDuplicarActivosFijosPorGrupos);			
		this.jButtonCopiarActivosFijosPorGrupos.setVisible(this.isPermisoCopiarActivosFijosPorGrupos);			
		this.jButtonVerFormActivosFijosPorGrupos.setVisible(this.isPermisoVerFormActivosFijosPorGrupos);			
		
		this.jButtonAbrirOrderByActivosFijosPorGrupos.setVisible(this.isPermisoOrdenActivosFijosPorGrupos);					
		
		this.jButtonNuevoRelacionesActivosFijosPorGrupos.setVisible(this.isPermisoNuevoActivosFijosPorGrupos);			
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarActivosFijosPorGrupos.setVisible(this.isPermisoActualizarActivosFijosPorGrupos);	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarActivosFijosPorGrupos.setVisible(this.isPermisoActualizarActivosFijosPorGrupos);	
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarActivosFijosPorGrupos.setVisible(this.isPermisoEliminarActivosFijosPorGrupos);
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarActivosFijosPorGrupos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorGrupos);						
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.setVisible(this.isPermisoGuardarCambiosActivosFijosPorGrupos);							
		}
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.setVisible(this.isPermisoActualizarActivosFijosPorGrupos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleActivosFijosPorGrupos() {
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarActivosFijosPorGrupos.setVisible(this.isPermisoActualizarActivosFijosPorGrupos);	
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarActivosFijosPorGrupos.setVisible(this.isPermisoActualizarActivosFijosPorGrupos);	
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarActivosFijosPorGrupos.setVisible(this.isPermisoEliminarActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarActivosFijosPorGrupos.setVisible(this.isVisibilidadCeldaCancelarActivosFijosPorGrupos);							
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.setVisible((this.isVisibilidadCeldaGuardarActivosFijosPorGrupos && this.isPermisoGuardarCambiosActivosFijosPorGrupos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosActivosFijosPorGrupos() {
		if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualActivosFijosPorGrupos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesActivosFijosPorGrupos() {
	}
	
	public void jTableDatosActivosFijosPorGruposListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarActivosFijosPorGrupos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.activosfijosporgrupos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaActivosFijosPorGruposUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebActivosFijosPorGrupos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActivosFijosPorGrupos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActivosFijosPorGrupos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.activosfijosporgruposLogic.getConnexion());

				if(this.activosfijosporgrupos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.activosfijosporgrupos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActivosFijosPorGrupos=(TitledBorder)this.jScrollPanelDatosActivosFijosPorGrupos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderActivosFijosPorGrupos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.activosfijosporgrupos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalActivosFijosPorGruposUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebActivosFijosPorGrupos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosActivosFijosPorGrupos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosActivosFijosPorGrupos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.activosfijosporgruposLogic.getConnexion());

				if(this.activosfijosporgrupos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.activosfijosporgrupos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderActivosFijosPorGrupos=(TitledBorder)this.jScrollPanelDatosActivosFijosPorGrupos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderActivosFijosPorGrupos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.activosfijosporgrupos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.activosfijosporgrupos.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.activosfijosporgrupos.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.activosfijosporgrupos.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.activosfijosporgrupos.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.activosfijosporgrupos.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.activosfijosporgrupos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.activosfijosporgrupos.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.activosfijosporgrupos.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.activosfijosporgrupos.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmarcaActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getmarca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where marca like '%"+this.activosfijosporgrupos.getmarca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmodeloActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getmodelo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where modelo like '%"+this.activosfijosporgrupos.getmodelo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncolorActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getcolor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where color like '%"+this.activosfijosporgrupos.getcolor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonserieActivosFijosPorGruposBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.getactivosfijosporgrupos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.activosfijosporgrupos==null) {
						this.activosfijosporgrupos = new ActivosFijosPorGrupos();
					}

					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);
				}

				if(this.activosfijosporgrupos.getserie()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where serie like '%"+this.activosfijosporgrupos.getserie()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingActivosFijosPorGrupos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaActivosFijosPorGruposActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);

			this.getActivosFijosPorGrupossBusquedaActivosFijosPorGrupos();

			this.inicializarActualizarBindingActivosFijosPorGrupos(false);

			//if(ActivosFijosPorGruposBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);

			this.getActivosFijosPorGrupossFK_IdEmpresa();

			this.inicializarActualizarBindingActivosFijosPorGrupos(false);

			//if(ActivosFijosPorGruposBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalActivosFijosPorGruposActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);

			this.getActivosFijosPorGrupossFK_IdSucursal();

			this.inicializarActualizarBindingActivosFijosPorGrupos(false);

			//if(ActivosFijosPorGruposBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.activosfijosporgruposLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameActivosFijosPorGrupos() {
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.setVisible(false);	    			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.dispose();
			this.jInternalFrameDetalleFormActivosFijosPorGrupos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
			this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.dispose();
			this.jInternalFrameReporteDinamicoActivosFijosPorGrupos=null;
		}
		
		if(this.jInternalFrameImportacionActivosFijosPorGrupos!=null) {
			this.jInternalFrameImportacionActivosFijosPorGrupos.setVisible(false);	    			
			this.jInternalFrameImportacionActivosFijosPorGrupos.dispose();
			this.jInternalFrameImportacionActivosFijosPorGrupos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessActivosFijosPorGrupos();
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
			
			if(sTipo.equals("NuevoActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarActivosFijosPorGrupos")) {
				jButtonDuplicarActivosFijosPorGruposActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarActivosFijosPorGrupos")) {
				jButtonCopiarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("VerFormActivosFijosPorGrupos")) {
				jButtonVerFormActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarActivosFijosPorGrupos")) {
				jButtonDuplicarActivosFijosPorGruposActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarActivosFijosPorGrupos")) {
				jButtonDuplicarActivosFijosPorGruposActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarActivosFijosPorGrupos")) {
				jButtonModificarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarActivosFijosPorGrupos")) {
				jButtonModificarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarActivosFijosPorGrupos")) {
				jButtonModificarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("ActualizarActivosFijosPorGrupos")) {
				jButtonActualizarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarActivosFijosPorGrupos")) {
				jButtonActualizarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarActivosFijosPorGrupos")) {
				jButtonActualizarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("EliminarActivosFijosPorGrupos")) {
				jButtonEliminarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarActivosFijosPorGrupos")) {
				jButtonEliminarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarActivosFijosPorGrupos")) {
				jButtonEliminarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("CancelarActivosFijosPorGrupos")) {
				jButtonCancelarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarActivosFijosPorGrupos")) {
				jButtonCancelarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarActivosFijosPorGrupos")) {
				jButtonCancelarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("CerrarActivosFijosPorGrupos")) {
				jButtonCerrarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarActivosFijosPorGrupos")) {
				jButtonCerrarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarActivosFijosPorGrupos")) {
				jButtonCerrarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarActivosFijosPorGrupos")) {
				jButtonMostrarOcultarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarActivosFijosPorGrupos")) {
				jButtonCancelarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarActivosFijosPorGrupos")) {
				jButtonCopiarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarActivosFijosPorGrupos")) {
				jButtonVerFormActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarActivosFijosPorGrupos")) {
				jButtonCopiarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormActivosFijosPorGrupos")) {
				jButtonVerFormActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionActivosFijosPorGrupos")) {
				jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarActivosFijosPorGrupos")) {
				jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionActivosFijosPorGrupos")) {
				jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresActivosFijosPorGrupos")) {
				jButtonAnterioresActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarActivosFijosPorGrupos")) {
				jButtonAnterioresActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreActivosFijosPorGrupos")) {
				jButtonAnterioresActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("SiguientesActivosFijosPorGrupos")) {
				jButtonSiguientesActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarActivosFijosPorGrupos")) {
				jButtonSiguientesActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesActivosFijosPorGrupos")) {
				jButtonSiguientesActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByActivosFijosPorGrupos") || sTipo.equals("MenuItemDetalleAbrirOrderByActivosFijosPorGrupos")) {
				jButtonAbrirOrderByActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarActivosFijosPorGrupos") || sTipo.equals("MenuItemDetalleMostrarOcultarActivosFijosPorGrupos")) {
				jButtonMostrarOcultarActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosActivosFijosPorGrupos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarActivosFijosPorGrupos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosActivosFijosPorGrupos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoActivosFijosPorGrupos")) {
				jButtonCerrarReporteDinamicoActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoActivosFijosPorGrupos")) {
				jButtonGenerarReporteDinamicoActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoActivosFijosPorGrupos")) {
				
				jButtonGenerarExcelReporteDinamicoActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionActivosFijosPorGrupos")) {
				jButtonCerrarImportacionActivosFijosPorGruposActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionActivosFijosPorGrupos")) {
				
				jButtonGenerarImportacionActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionActivosFijosPorGrupos")) {
				
				jButtonAbrirImportacionActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesActivosFijosPorGrupos")) {
				jComboBoxTiposAccionesActivosFijosPorGruposActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesActivosFijosPorGrupos")) {
				jComboBoxTiposRelacionesActivosFijosPorGruposActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioActivosFijosPorGrupos")) {
				jComboBoxTiposAccionesActivosFijosPorGruposActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarActivosFijosPorGrupos")) {
				
				jComboBoxTiposSeleccionarActivosFijosPorGruposActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralActivosFijosPorGrupos")) {
				jTextFieldValorCampoGeneralActivosFijosPorGruposActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByActivosFijosPorGrupos")) {
				jButtonAbrirOrderByActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarActivosFijosPorGrupos")) {
				jButtonAbrirOrderByActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByActivosFijosPorGrupos")) {
				jButtonCerrarOrderByActivosFijosPorGruposActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActivosFijosPorGruposBusqueda")) {
				this.jButtonidActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorGruposUpdate")) {
				this.jButtonid_empresaActivosFijosPorGruposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorGruposBusqueda")) {
				this.jButtonid_empresaActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalActivosFijosPorGruposUpdate")) {
				this.jButtonid_sucursalActivosFijosPorGruposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalActivosFijosPorGruposBusqueda")) {
				this.jButtonid_sucursalActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtonnombre_sub_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveActivosFijosPorGruposBusqueda")) {
				this.jButtonclaveActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreActivosFijosPorGruposBusqueda")) {
				this.jButtonnombreActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraActivosFijosPorGruposBusqueda")) {
				this.jButtonfecha_compraActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilActivosFijosPorGruposBusqueda")) {
				this.jButtonvida_utilActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraActivosFijosPorGruposBusqueda")) {
				this.jButtoncosto_de_compraActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaActivosFijosPorGruposBusqueda")) {
				this.jButtonmarcaActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloActivosFijosPorGruposBusqueda")) {
				this.jButtonmodeloActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("colorActivosFijosPorGruposBusqueda")) {
				this.jButtoncolorActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieActivosFijosPorGruposBusqueda")) {
				this.jButtonserieActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaActivosFijosPorGruposActivosFijosPorGrupos")) {
				this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGruposActionPerformed(evt);
			}
			
			;
			
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessActivosFijosPorGrupos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ActivosFijosPorGrupos activosfijosporgruposLocal=null;
			
			if(!this.getEsControlTabla()) {
				activosfijosporgruposLocal=this.activosfijosporgrupos;
			} else {
				activosfijosporgruposLocal=this.activosfijosporgruposAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
							
				
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
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
			
			


			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorGruposActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
								
						
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
								
				
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
							
				
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
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
			
			


			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
								
				
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorGruposActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosActivosFijosPorGrupos")) {
					jCheckBoxSeleccionarTodosActivosFijosPorGruposItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosActivosFijosPorGrupos")) {
					jCheckBoxSeleccionadosActivosFijosPorGruposItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarActivosFijosPorGrupos")) {
					
				}
				
				


				
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
												
				
				


				
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorGruposActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
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
			
			


			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.activosfijosporgrupos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.activosfijosporgrupos);
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
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
				
				


				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ActivosFijosPorGrupos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ActivosFijosPorGrupos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaActivosFijosPorGruposActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.activosfijosporgruposAnterior =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarActivosFijosPorGrupos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosActivosFijosPorGruposListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosActivosFijosPorGrupos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.activosfijosporgrupos =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.activosfijosporgrupos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarActivosFijosPorGrupos")) {
				
				}
				
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarActivosFijosPorGrupos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosActivosFijosPorGrupos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarActivosFijosPorGrupos")) {
			
			}
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessActivosFijosPorGrupos();
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
			if(sTipo.equals("NuevoActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarActivosFijosPorGrupos")) {
				jButtonDuplicarActivosFijosPorGruposActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarActivosFijosPorGrupos")) {
				jButtonCopiarActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormActivosFijosPorGrupos")) {
				jButtonVerFormActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesActivosFijosPorGrupos")) {
				jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarActivosFijosPorGrupos")) {
				jButtonModificarActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarActivosFijosPorGrupos")) {
				jButtonActualizarActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarActivosFijosPorGrupos")) {
				jButtonEliminarActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarActivosFijosPorGrupos")) {
				jButtonCancelarActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarActivosFijosPorGrupos")) {
				jButtonCerrarActivosFijosPorGruposActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosActivosFijosPorGrupos")) {
				jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosActivosFijosPorGrupos")) {
				jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByActivosFijosPorGrupos")) {
				jButtonAbrirOrderByActivosFijosPorGruposActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionActivosFijosPorGrupos")) {
				jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresActivosFijosPorGrupos")) {
				jButtonAnterioresActivosFijosPorGruposActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesActivosFijosPorGrupos")) {
				jButtonSiguientesActivosFijosPorGruposActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idActivosFijosPorGruposBusqueda")) {
				this.jButtonidActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorGruposUpdate")) {
				this.jButtonid_empresaActivosFijosPorGruposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaActivosFijosPorGruposBusqueda")) {
				this.jButtonid_empresaActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalActivosFijosPorGruposUpdate")) {
				this.jButtonid_sucursalActivosFijosPorGruposUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalActivosFijosPorGruposBusqueda")) {
				this.jButtonid_sucursalActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtoncodigo_sub_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtonnombre_sub_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoActivosFijosPorGruposBusqueda")) {
				this.jButtonnombre_detalle_grupoActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveActivosFijosPorGruposBusqueda")) {
				this.jButtonclaveActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreActivosFijosPorGruposBusqueda")) {
				this.jButtonnombreActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraActivosFijosPorGruposBusqueda")) {
				this.jButtonfecha_compraActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilActivosFijosPorGruposBusqueda")) {
				this.jButtonvida_utilActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraActivosFijosPorGruposBusqueda")) {
				this.jButtoncosto_de_compraActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaActivosFijosPorGruposBusqueda")) {
				this.jButtonmarcaActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("modeloActivosFijosPorGruposBusqueda")) {
				this.jButtonmodeloActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("colorActivosFijosPorGruposBusqueda")) {
				this.jButtoncolorActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("serieActivosFijosPorGruposBusqueda")) {
				this.jButtonserieActivosFijosPorGruposBusquedaActionPerformed(evt);
			}
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessActivosFijosPorGrupos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameActivosFijosPorGrupos")) {
				closingInternalFrameActivosFijosPorGrupos();
				
			} else if(sTipo.equals("jButtonCancelarActivosFijosPorGrupos")) {
				JInternalFrameBase jInternalFrameDetalleFormActivosFijosPorGrupos = (JInternalFrameBase)evt.getSource();
	            	
	            ActivosFijosPorGruposBeanSwingJInternalFrame jInternalFrameParent=(ActivosFijosPorGruposBeanSwingJInternalFrame)jInternalFrameDetalleFormActivosFijosPorGrupos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarActivosFijosPorGruposActionPerformed(null);
			}
			
			ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.activosfijosporgrupos,new Object(),this.activosfijosporgruposParameterGeneral,this.activosfijosporgruposReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormActivosFijosPorGrupos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormActivosFijosPorGrupos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormActivosFijosPorGrupos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.activosfijosporgrupos)) {
			if(!esControlTabla) {
				if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);			
				}
				
				if(this.activosfijosporgruposSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral,this.activosfijosporgruposBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.activosfijosporgruposSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanActivosFijosPorGrupos(classes,this.activosfijosporgruposReturnGeneral,this.activosfijosporgruposBean,false);
					}
						
					if(this.activosfijosporgruposReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos());	
					}
						
					if(this.activosfijosporgruposReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioActivosFijosPorGrupos(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos(),classes);//this.activosfijosporgruposBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioActivosFijosPorGrupos(this.activosfijosporgrupos,classes);//this.activosfijosporgruposBean);									
				}
			
				if(ActivosFijosPorGruposJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualActivosFijosPorGrupos(this.activosfijosporgrupos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysActivosFijosPorGrupos(this.activosfijosporgrupos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.activosfijosporgruposAnterior!=null) {
						this.activosfijosporgrupos=this.activosfijosporgruposAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.activosfijosporgruposSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.activosfijosporgruposSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos(),activosfijosporgruposLogic.getActivosFijosPorGruposs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGrupos(),this.activosfijosporgruposs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosActivosFijosPorGrupos.repaint();
				
				//((AbstractTableModel) this.jTableDatosActivosFijosPorGrupos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosActivosFijosPorGrupos();
			}
		}
	}
	
	public void actualizarVisualTableDatosActivosFijosPorGrupos() throws Exception {
		
		ActivosFijosPorGruposModel activosfijosporgruposModel=(ActivosFijosPorGruposModel)this.jTableDatosActivosFijosPorGrupos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			activosfijosporgruposModel.activosfijosporgruposs=this.activosfijosporgruposLogic.getActivosFijosPorGruposs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			activosfijosporgruposModel.activosfijosporgruposs=this.activosfijosporgruposs;
		}
		
		
		((ActivosFijosPorGruposModel) this.jTableDatosActivosFijosPorGrupos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaActivosFijosPorGrupos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getactivosfijosporgruposAnterior(),this.activosfijosporgruposLogic.getActivosFijosPorGruposs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getactivosfijosporgruposAnterior(),this.activosfijosporgruposs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosActivosFijosPorGrupos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
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
										
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.activosfijosporgrupos,new Object(),generalEntityParameterGeneral,this.activosfijosporgruposReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ActivosFijosPorGruposConstantesFunciones.getClassesRelationshipsOfActivosFijosPorGrupos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ActivosFijosPorGruposConstantesFunciones.getClassesRelationshipsFromStringsOfActivosFijosPorGrupos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormActivosFijosPorGrupos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.activosfijosporgrupos,new Object(),generalEntityParameterGeneral,this.activosfijosporgruposReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioActivosFijosPorGrupos(ActivosFijosPorGruposBean activosfijosporgruposBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanActivosFijosPorGrupos(ArrayList<Classe> classes,ActivosFijosPorGruposReturnGeneral activosfijosporgruposReturnGeneral,ActivosFijosPorGruposBean activosfijosporgruposBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.activosfijosporgrupos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos = new ActivosFijosPorGruposDetalleFormJInternalFrame(jDesktopPane,this.activosfijosporgruposSessionBean.getConGuardarRelaciones(),this.activosfijosporgruposSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.setVisible(false);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.setSelected(false);						
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.activosfijosporgruposLogic=this.activosfijosporgruposLogic;
		
		this.cargarCombosFrameForeignKeyActivosFijosPorGrupos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleActivosFijosPorGrupos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleActivosFijosPorGrupos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyActivosFijosPorGrupos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyActivosFijosPorGrupos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActivosFijosPorGrupos"));
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"ModificarActivosFijosPorGrupos"));

		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarToolBarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"ModificarToolBarActivosFijosPorGrupos"));
					
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemModificarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"MenuItemModificarActivosFijosPorGrupos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"ActualizarActivosFijosPorGrupos"));
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarToolBarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActivosFijosPorGrupos"));
						
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemActualizarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActivosFijosPorGrupos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"EliminarActivosFijosPorGrupos"));
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"EliminarToolBarActivosFijosPorGrupos"));
								
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemEliminarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActivosFijosPorGrupos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CancelarActivosFijosPorGrupos"));
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CancelarToolBarActivosFijosPorGrupos"));
					
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemCancelarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActivosFijosPorGrupos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemDetalleCerrarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActivosFijosPorGrupos"));		
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijosPorGrupos"));
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijosPorGrupos"));
		
		
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActivosFijosPorGrupos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonidActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosPorGruposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_empresaActivosFijosPorGruposUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorGruposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_empresaActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorGruposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_sucursalActivosFijosPorGruposUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalActivosFijosPorGruposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_sucursalActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonclaveActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"claveActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombreActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombreActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonfecha_compraActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonvida_utilActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonmarcaActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"marcaActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonmodeloActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"modeloActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncolorActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"colorActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonserieActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"serieActivosFijosPorGruposBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActivosFijosPorGrupos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameActivosFijosPorGrupos"));
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarActivosFijosPorGrupos"));
		}
		
		this.jTableDatosActivosFijosPorGrupos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarActivosFijosPorGrupos"));
		
		this.jTableDatosActivosFijosPorGrupos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarActivosFijosPorGrupos"));
		
		this.jButtonNuevoActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"NuevoActivosFijosPorGrupos"));
		
		this.jButtonDuplicarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"DuplicarActivosFijosPorGrupos"));
		
		this.jButtonCopiarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"CopiarActivosFijosPorGrupos"));
		
		this.jButtonVerFormActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"VerFormActivosFijosPorGrupos"));
		
		
		this.jButtonNuevoToolBarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"NuevoToolBarActivosFijosPorGrupos"));
			
		this.jButtonDuplicarToolBarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarActivosFijosPorGrupos"));
			
		this.jMenuItemNuevoActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoActivosFijosPorGrupos"));
			
		this.jMenuItemDuplicarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarActivosFijosPorGrupos"));		
		
		
		this.jButtonNuevoRelacionesActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesActivosFijosPorGrupos"));
		
		
		this.jButtonNuevoRelacionesToolBarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarActivosFijosPorGrupos"));
			
		this.jMenuItemNuevoRelacionesActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesActivosFijosPorGrupos"));		
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"ModificarActivosFijosPorGrupos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonModificarToolBarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"ModificarToolBarActivosFijosPorGrupos"));
			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemModificarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"MenuItemModificarActivosFijosPorGrupos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"ActualizarActivosFijosPorGrupos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonActualizarToolBarActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarActivosFijosPorGrupos"));
				
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemActualizarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarActivosFijosPorGrupos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"EliminarActivosFijosPorGrupos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonEliminarToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"EliminarToolBarActivosFijosPorGrupos"));
						
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemEliminarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarActivosFijosPorGrupos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CancelarActivosFijosPorGrupos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonCancelarToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CancelarToolBarActivosFijosPorGrupos"));
			
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemCancelarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarActivosFijosPorGrupos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarActivosFijosPorGrupos"));		
		
		
		this.jButtonCerrarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CerrarActivosFijosPorGrupos"));
		
		
		this.jButtonCerrarToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CerrarToolBarActivosFijosPorGrupos"));
			
		this.jMenuItemCerrarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarActivosFijosPorGrupos"));
			
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jMenuItemDetalleCerrarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarActivosFijosPorGrupos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GuardarCambiosActivosFijosPorGrupos"));
		}
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarActivosFijosPorGrupos"));
		}
		
		this.jButtonCopiarToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CopiarToolBarActivosFijosPorGrupos"));
			
		this.jButtonVerFormToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"VerFormToolBarActivosFijosPorGrupos"));
		
		this.jMenuItemGuardarCambiosActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosActivosFijosPorGrupos"));
			
		this.jMenuItemCopiarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarActivosFijosPorGrupos"));		
		
		this.jMenuItemVerFormActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormActivosFijosPorGrupos"));		
		
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActivosFijosPorGrupos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarActivosFijosPorGrupos"));
			
		this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaActivosFijosPorGrupos"));		
		
		
		
		this.jButtonRecargarInformacionActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"RecargarInformacionActivosFijosPorGrupos"));
					
		this.jButtonRecargarInformacionToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarActivosFijosPorGrupos"));
		
		this.jMenuItemRecargarInformacionActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionActivosFijosPorGrupos"));		
		
		
		
		this.jButtonAnterioresActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"AnterioresActivosFijosPorGrupos"));
		
		
		this.jButtonAnterioresToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarActivosFijosPorGrupos"));
		
		this.jMenuItemAnterioresActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresActivosFijosPorGrupos"));		
		
		
		this.jButtonSiguientesActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"SiguientesActivosFijosPorGrupos"));
		
		
		this.jButtonSiguientesToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarActivosFijosPorGrupos"));
			
		this.jMenuItemSiguientesActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesActivosFijosPorGrupos"));
			
		this.jMenuItemAbrirOrderByActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByActivosFijosPorGrupos"));
			
		this.jMenuItemMostrarOcultarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarActivosFijosPorGrupos"));
			
		this.jMenuItemDetalleAbrirOrderByActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByActivosFijosPorGrupos"));
			
		this.jMenuItemDetalleMostarOcultarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarActivosFijosPorGrupos"));		
		
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosActivosFijosPorGrupos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarActivosFijosPorGrupos"));
			
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosActivosFijosPorGrupos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosActivosFijosPorGrupos"));

		this.jCheckBoxSeleccionadosActivosFijosPorGrupos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosActivosFijosPorGrupos"));
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioActivosFijosPorGrupos"));
		}
		
		
		this.jComboBoxTiposRelacionesActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"TiposRelacionesActivosFijosPorGrupos"));
			
		this.jComboBoxTiposAccionesActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"TiposAccionesActivosFijosPorGrupos"));
					
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarActivosFijosPorGrupos"));
			
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralActivosFijosPorGrupos"));		
		
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonidActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosPorGruposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_empresaActivosFijosPorGruposUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorGruposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_empresaActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorGruposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_sucursalActivosFijosPorGruposUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalActivosFijosPorGruposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_sucursalActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonclaveActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"claveActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombreActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombreActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonfecha_compraActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonvida_utilActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonmarcaActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"marcaActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonmodeloActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"modeloActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncolorActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"colorActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonserieActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"serieActivosFijosPorGruposBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"BusquedaActivosFijosPorGruposActivosFijosPorGrupos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoActivosFijosPorGrupos!=null) {
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijosPorGrupos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijosPorGrupos"));
				this.jInternalFrameReporteDinamicoActivosFijosPorGrupos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijosPorGrupos"));
			}
			
			//this.jButtonCerrarReporteDinamicoActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoActivosFijosPorGrupos"));				
			//this.jButtonGenerarReporteDinamicoActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoActivosFijosPorGrupos"));
			//this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoActivosFijosPorGrupos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionActivosFijosPorGrupos!=null) {
				this.jInternalFrameImportacionActivosFijosPorGrupos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionActivosFijosPorGrupos"));
				this.jInternalFrameImportacionActivosFijosPorGrupos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionActivosFijosPorGrupos"));
				this.jInternalFrameImportacionActivosFijosPorGrupos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionActivosFijosPorGrupos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"AbrirOrderByActivosFijosPorGrupos"));
			
			this.jButtonAbrirOrderByToolBarActivosFijosPorGrupos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarActivosFijosPorGrupos"));			
			
			if(this.jInternalFrameOrderByActivosFijosPorGrupos!=null) {
				this.jInternalFrameOrderByActivosFijosPorGrupos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByActivosFijosPorGrupos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTabbedPaneRelacionesActivosFijosPorGrupos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesActivosFijosPorGrupos"));
		
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
            		closingInternalFrameActivosFijosPorGrupos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormActivosFijosPorGrupos = (JInternalFrameBase)event.getSource();
	            	
	            ActivosFijosPorGruposBeanSwingJInternalFrame jInternalFrameParent=(ActivosFijosPorGruposBeanSwingJInternalFrame)jInternalFrameDetalleFormActivosFijosPorGrupos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarActivosFijosPorGruposActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosActivosFijosPorGrupos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosActivosFijosPorGruposListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosActivosFijosPorGrupos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosActivosFijosPorGrupos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoActivosFijosPorGrupos";
		inputMap = this.jButtonNuevoActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesActivosFijosPorGrupos";
		inputMap = this.jButtonNuevoRelacionesActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoActivosFijosPorGruposActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarActivosFijosPorGrupos";
		inputMap = this.jButtonModificarActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarActivosFijosPorGruposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarActivosFijosPorGrupos";
		inputMap = this.jButtonActualizarActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarActivosFijosPorGruposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarActivosFijosPorGrupos";
		inputMap = this.jButtonEliminarActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarActivosFijosPorGruposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarActivosFijosPorGrupos";
		inputMap = this.jButtonCancelarActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarActivosFijosPorGruposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarActivosFijosPorGrupos";
		inputMap = this.jButtonCerrarActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarActivosFijosPorGruposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosActivosFijosPorGrupos";
		inputMap = this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonGuardarCambiosActivosFijosPorGrupos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosActivosFijosPorGruposActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosActivosFijosPorGrupos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosActivosFijosPorGruposItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesActivosFijosPorGrupos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesActivosFijosPorGruposActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarActivosFijosPorGruposActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralActivosFijosPorGrupos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralActivosFijosPorGruposActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonidActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"idActivosFijosPorGruposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_empresaActivosFijosPorGruposUpdate.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorGruposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_empresaActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaActivosFijosPorGruposBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_sucursalActivosFijosPorGruposUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalActivosFijosPorGruposUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonid_sucursalActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncodigo_sub_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombre_sub_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncodigo_detalle_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombre_detalle_grupoActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonclaveActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"claveActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonnombreActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"nombreActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonfecha_compraActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonvida_utilActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncosto_de_compraActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonmarcaActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"marcaActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonmodeloActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"modeloActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtoncolorActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"colorActivosFijosPorGruposBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jButtonserieActivosFijosPorGruposBusqueda.addActionListener(new ButtonActionListener(this,"serieActivosFijosPorGruposBusqueda"));
		
		
		this.jButtonBusquedaActivosFijosPorGruposActivosFijosPorGrupos.addActionListener(new ButtonActionListener(this,"BusquedaActivosFijosPorGruposActivosFijosPorGrupos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionActivosFijosPorGrupos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionActivosFijosPorGruposActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarActivosFijosPorGruposActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarActivosFijosPorGrupos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosActivosFijosPorGrupos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
					activosfijosporgruposAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgruposs) {
					activosfijosporgruposAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosActivosFijosPorGruposItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
						activosfijosporgruposAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgruposs) {
						activosfijosporgruposAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgruposs) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActivosFijosPorGrupos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActivosFijosPorGrupos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosActivosFijosPorGruposItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosActivosFijosPorGrupos.getSelectedRows();
			
			ActivosFijosPorGrupos activosfijosporgruposLocal=new ActivosFijosPorGrupos();
			
			//this.seleccionarTodosActivosFijosPorGrupos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					activosfijosporgruposLocal =(ActivosFijosPorGrupos) this.activosfijosporgruposLogic.getActivosFijosPorGruposs().toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					activosfijosporgruposLocal =(ActivosFijosPorGrupos) this.activosfijosporgruposs.toArray()[this.jTableDatosActivosFijosPorGrupos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				activosfijosporgruposLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
						activosfijosporgruposAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgruposs) {
						activosfijosporgruposAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosActivosFijosPorGrupos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosActivosFijosPorGrupos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosActivosFijosPorGrupos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualActivosFijosPorGruposItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarActivosFijosPorGruposParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralActivosFijosPorGruposActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralActivosFijosPorGrupos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
				
						if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							activosfijosporgruposAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							activosfijosporgruposAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							activosfijosporgruposAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							activosfijosporgruposAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							activosfijosporgruposAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							activosfijosporgruposAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							activosfijosporgruposAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR)) {
							existe=true;
							activosfijosporgruposAux.setcolor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							activosfijosporgruposAux.setserie(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgruposs) {
					
						if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							activosfijosporgruposAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							activosfijosporgruposAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							activosfijosporgruposAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							activosfijosporgruposAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							activosfijosporgruposAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							activosfijosporgruposAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							activosfijosporgruposAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO)) {
							existe=true;
							activosfijosporgruposAux.setmodelo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR)) {
							existe=true;
							activosfijosporgruposAux.setcolor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE)) {
							existe=true;
							activosfijosporgruposAux.setserie(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesActivosFijosPorGruposActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioActivosFijosPorGrupos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesActivosFijosPorGrupos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteActivosFijosPorGrupos) {				
					conSplash=true;//false;										
					
					//this.startProcessActivosFijosPorGrupos(conSplash);
				
					this.generarReporteActivosFijosPorGrupossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoActivosFijosPorGrupossSeleccionados();
				//this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActivosFijosPorGrupossSeleccionados(false);
				//this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoActivosFijosPorGrupossSeleccionados(true);
				//this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActivosFijosPorGrupos();
				
				this.exportarActivosFijosPorGrupossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionActivosFijosPorGruposs();
				//this.importarActivosFijosPorGruposs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessActivosFijosPorGrupos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelActivosFijosPorGrupossSeleccionados();
				//this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Activos Fijos Por Grupos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessActivosFijosPorGrupos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoActivosFijosPorGrupos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyActivosFijosPorGrupos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setSelectedIndex(0);					
				}	
			} 			
			else if(ActivosFijosPorGruposBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteActivosFijosPorGrupos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessActivosFijosPorGrupos(conSplash);
					
						//this.actualizarParametrosGeneralActivosFijosPorGrupos();
						
						this.generarReporteProcesoAccionActivosFijosPorGrupossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Activos Fijos Por GruposES SELECCIONADOS?", "MANTENIMIENTO DE Activos Fijos Por Grupos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessActivosFijosPorGrupos();
				
						this.actualizarParametrosGeneralActivosFijosPorGrupos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.activosfijosporgruposReturnGeneral=activosfijosporgruposLogic.procesarAccionActivosFijosPorGrupossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.activosfijosporgruposLogic.getActivosFijosPorGruposs(),this.activosfijosporgruposParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarActivosFijosPorGruposReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralActivosFijosPorGrupos();
					
					ActivosFijosPorGruposBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarActivosFijosPorGruposReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesActivosFijosPorGrupos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxTiposAccionesFormularioActivosFijosPorGrupos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessActivosFijosPorGrupos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesActivosFijosPorGruposActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessActivosFijosPorGrupos();
			
			if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
			ActivosFijosPorGrupos activosfijosporgrupos=new ActivosFijosPorGrupos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingActivosFijosPorGrupos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesActivosFijosPorGrupos.getSelectedItem();
			
			
			
			
			activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
			//this.sTipoAccion;
			
			if(activosfijosporgrupossSeleccionados.size()==1) {
				for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgrupossSeleccionados) {
					activosfijosporgrupos=activosfijosporgruposAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessActivosFijosPorGrupos();
			
      		//this.finishProcessActivosFijosPorGrupos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarActivosFijosPorGruposReturnGeneral() throws Exception {
		if(this.activosfijosporgruposReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.activosfijosporgruposReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.activosfijosporgruposReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.activosfijosporgruposReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.activosfijosporgruposReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.activosfijosporgruposReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingActivosFijosPorGrupos(false);
		}
		
		if(this.activosfijosporgruposReturnGeneral.getConRetornoLista() || this.activosfijosporgruposReturnGeneral.getConRetornoObjeto()) {
			if(this.activosfijosporgruposReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.activosfijosporgruposLogic.setActivosFijosPorGruposs(this.activosfijosporgruposReturnGeneral.getActivosFijosPorGruposs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingActivosFijosPorGrupos(false);
		}
	}
	
	public void actualizarParametrosGeneralActivosFijosPorGrupos() throws Exception {
		
		
	}
	
	public ArrayList<ActivosFijosPorGrupos> getActivosFijosPorGrupossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioActivosFijosPorGrupos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgruposLogic.getActivosFijosPorGruposs()) {
					if(activosfijosporgruposAux.getIsSelected()) {
						activosfijosporgrupossSeleccionados.add(activosfijosporgruposAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ActivosFijosPorGrupos activosfijosporgruposAux:this.activosfijosporgruposs) {
					if(activosfijosporgruposAux.getIsSelected()) {
						activosfijosporgrupossSeleccionados.add(activosfijosporgruposAux);				
					}
				}
			}
			
			if(activosfijosporgrupossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						activosfijosporgrupossSeleccionados.addAll(this.activosfijosporgruposLogic.getActivosFijosPorGruposs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						activosfijosporgrupossSeleccionados.addAll(this.activosfijosporgruposs);				
					}
				}
			}
		} else {
			activosfijosporgrupossSeleccionados.add(this.activosfijosporgrupos);
		}
		
		return activosfijosporgrupossSeleccionados;
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
	
	public void generarReporteActivosFijosPorGrupossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalActivosFijosPorGrupossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoActivosFijosPorGrupossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActivosFijosPorGrupossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoActivosFijosPorGrupossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Activos Fijos Por Grupos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesActivosFijosPorGrupossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteActivosFijosPorGruposs("Todos",activosfijosporgrupossSeleccionados);
		
	}	
	
	public void generarReporteNormalActivosFijosPorGrupossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteActivosFijosPorGruposs("Todos",activosfijosporgrupossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionActivosFijosPorGrupossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteActivosFijosPorGruposs("Todos",activosfijosporgrupossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoActivosFijosPorGrupossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoActivosFijosPorGrupos();
		
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoActivosFijosPorGrupos();
		
		
		//this.generarReporteActivosFijosPorGruposs("Todos",activosfijosporgrupossSeleccionados ,activosfijosporgruposImplementable,activosfijosporgruposImplementableHome);
	}
	
	public void mostrarImportacionActivosFijosPorGruposs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionActivosFijosPorGrupos();
		
		this.abrirFrameImportacionActivosFijosPorGrupos();		
		
			
		//this.generarReporteActivosFijosPorGruposs("Todos",activosfijosporgrupossSeleccionados ,activosfijosporgruposImplementable,activosfijosporgruposImplementableHome);
	}
	
	public void importarActivosFijosPorGruposs() throws Exception {		
	
	}
	
	public void exportarActivosFijosPorGrupossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelActivosFijosPorGrupossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoActivosFijosPorGrupossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlActivosFijosPorGrupossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Activos Fijos Por Grupos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoActivosFijosPorGrupossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporgrupos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarActivosFijosPorGrupos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgrupossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarActivosFijosPorGrupos(activosfijosporgruposAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//activosfijosporgruposAux.setsDetalleGeneralEntityReporte(activosfijosporgruposAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarActivosFijosPorGrupos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=activosfijosporgrupos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getcosto_de_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getmarca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getmodelo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getcolor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=activosfijosporgrupos.getserie();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelActivosFijosPorGrupossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporgrupos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ActivosFijosPorGruposs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelActivosFijosPorGrupos(row);				
				iRow++;
			}				
			
			for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgrupossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelActivosFijosPorGrupos(activosfijosporgruposAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlActivosFijosPorGrupossSeleccionados() throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();		
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"activosfijosporgrupos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("activosfijosporgruposs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("activosfijosporgrupos");
			//elementRoot.appendChild(element);
		
			for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgrupossSeleccionados) {
				element = document.createElement("activosfijosporgrupos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlActivosFijosPorGrupos(activosfijosporgruposAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Activos Fijos Por Grupos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelActivosFijosPorGrupos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_COSTODECOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getcosto_de_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getmarca());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getmodelo());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getcolor());
		cell = row.createCell(iColumn++);cell.setCellValue(activosfijosporgrupos.getserie());				
	}
	
	public void setFilaDatosExportarXmlActivosFijosPorGrupos(ActivosFijosPorGrupos activosfijosporgrupos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ActivosFijosPorGruposConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(activosfijosporgrupos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ActivosFijosPorGruposConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(activosfijosporgrupos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ActivosFijosPorGruposConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(activosfijosporgrupos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ActivosFijosPorGruposConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(activosfijosporgrupos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcodigo_sub_grupo = document.createElement(ActivosFijosPorGruposConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(activosfijosporgrupos.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(ActivosFijosPorGruposConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(activosfijosporgrupos.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(ActivosFijosPorGruposConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(activosfijosporgrupos.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(ActivosFijosPorGruposConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(activosfijosporgrupos.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(ActivosFijosPorGruposConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(activosfijosporgrupos.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(ActivosFijosPorGruposConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(activosfijosporgrupos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(ActivosFijosPorGruposConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(activosfijosporgrupos.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(ActivosFijosPorGruposConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(activosfijosporgrupos.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(ActivosFijosPorGruposConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(activosfijosporgrupos.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);

		Element elementmarca = document.createElement(ActivosFijosPorGruposConstantesFunciones.MARCA);
		elementmarca.appendChild(document.createTextNode(activosfijosporgrupos.getmarca().trim()));
		element.appendChild(elementmarca);

		Element elementmodelo = document.createElement(ActivosFijosPorGruposConstantesFunciones.MODELO);
		elementmodelo.appendChild(document.createTextNode(activosfijosporgrupos.getmodelo().trim()));
		element.appendChild(elementmodelo);

		Element elementcolor = document.createElement(ActivosFijosPorGruposConstantesFunciones.COLOR);
		elementcolor.appendChild(document.createTextNode(activosfijosporgrupos.getcolor().trim()));
		element.appendChild(elementcolor);

		Element elementserie = document.createElement(ActivosFijosPorGruposConstantesFunciones.SERIE);
		elementserie.appendChild(document.createTextNode(activosfijosporgrupos.getserie().trim()));
		element.appendChild(elementserie);
	}
	
	public void generarReporteGroupGenericoActivosFijosPorGrupossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados=new ArrayList<ActivosFijosPorGrupos>();
		
		activosfijosporgrupossSeleccionados=this.getActivosFijosPorGrupossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoActivosFijosPorGrupos(activosfijosporgrupossSeleccionados);
		
		this.generarReporteActivosFijosPorGruposs("Todos",activosfijosporgrupossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoActivosFijosPorGrupos(ArrayList<ActivosFijosPorGrupos> activosfijosporgrupossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ActivosFijosPorGrupos activosfijosporgruposAux:activosfijosporgrupossSeleccionados) {
				activosfijosporgruposAux.setsDetalleGeneralEntityReporte(activosfijosporgruposAux.toString());
			
				if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(activosfijosporgruposAux.getfecha_compra()));
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_MARCA)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getmarca());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_MODELO)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getmodelo());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_COLOR)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getcolor());
				}
				 else if(sTipoSeleccionar.equals(ActivosFijosPorGruposConstantesFunciones.LABEL_SERIE)) {
					existe=true;
					activosfijosporgruposAux.setsDescripcionGeneralEntityReporte1(activosfijosporgruposAux.getserie());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ActivosFijosPorGruposConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesActivosFijosPorGrupos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=true;
				this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=true;
				this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=true;
			}
			
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=true;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaModificarActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				} else {
					this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ActivosFijosPorGruposJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=true;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=true;
		} else {
			this.actualizarEstadoPanelsActivosFijosPorGrupos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarActivosFijosPorGrupos=false;
			//this.isVisibilidadCeldaVerFormActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaDuplicarActivosFijosPorGrupos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!activosfijosporgruposSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
		} else {
			this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			if(!activosfijosporgruposSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;												
			}
			
			this.jButtonCerrarActivosFijosPorGrupos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
		}
		
		if(!this.permiteMantenimiento(this.activosfijosporgrupos)) {
			this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
			this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoActivosFijosPorGrupos=false;
		this.isVisibilidadCeldaNuevoRelacionesActivosFijosPorGrupos=false;
		this.isVisibilidadCeldaGuardarCambiosActivosFijosPorGrupos=false;
		//this.isVisibilidadCeldaModificarActivosFijosPorGrupos=true;
		this.isVisibilidadCeldaActualizarActivosFijosPorGrupos=false;
		this.isVisibilidadCeldaEliminarActivosFijosPorGrupos=false;
		//this.isVisibilidadCeldaCancelarActivosFijosPorGrupos=true;			
		this.isVisibilidadCeldaGuardarActivosFijosPorGrupos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesActivosFijosPorGrupos() {
	}
	
	public void actualizarEstadoPanelsActivosFijosPorGrupos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorGrupos!=null) {
				this.jPanelPaginacionActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosActivosFijosPorGrupos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijosPorGrupos!=null) {
				this.jPanelPaginacionActivosFijosPorGrupos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosActivosFijosPorGrupos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijosPorGrupos!=null) {
				this.jPanelPaginacionActivosFijosPorGrupos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosActivosFijosPorGrupos.setVisible(false);
			}
			
			if(this.jPanelPaginacionActivosFijosPorGrupos!=null) {
				this.jPanelPaginacionActivosFijosPorGrupos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorGrupos!=null) {
				this.jPanelPaginacionActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorGrupos!=null) {
				this.jPanelPaginacionActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosEdicionActivosFijosPorGrupos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosActivosFijosPorGrupos!=null) {
				this.jScrollPanelDatosActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelPaginacionActivosFijosPorGrupos!=null) {
				this.jPanelPaginacionActivosFijosPorGrupos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
					this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.activosfijosporgruposSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasActivosFijosPorGrupos!=null) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesActivosFijosPorGrupos!=null) {
				this.jPanelParametrosReportesActivosFijosPorGrupos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaActivosFijosPorGrupos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaActivosFijosPorGrupos) {this.jTabbedPaneBusquedasActivosFijosPorGrupos.remove(jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaActivosFijosPorGrupos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaActivosFijosPorGrupos) {this.jTabbedPaneBusquedasActivosFijosPorGrupos.remove(jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos);}
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
			
			this.inicializarActualizarBindingTablaActivosFijosPorGrupos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioActivosFijosPorGrupos() {
		this.updateBorderResaltarBusquedasFormularioActivosFijosPorGrupos();
		this.updateVisibilidadBusquedasFormularioActivosFijosPorGrupos();
		this.updateHabilitarBusquedasFormularioActivosFijosPorGrupos();
	}
	
	public void updateBorderResaltarBusquedasFormularioActivosFijosPorGrupos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasActivosFijosPorGrupos.getComponents().length>0) {
	

		if(this.activosfijosporgruposConstantesFunciones.resaltarBusquedaActivosFijosPorGruposActivosFijosPorGrupos!=null) {
			index= this.jTabbedPaneBusquedasActivosFijosPorGrupos.indexOfComponent(this.jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorGrupos.getComponent(index);
				jPanel.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioActivosFijosPorGrupos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasActivosFijosPorGrupos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasActivosFijosPorGrupos.indexOfComponent(this.jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorGrupos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
			if(!this.activosfijosporgruposConstantesFunciones.mostrarBusquedaActivosFijosPorGruposActivosFijosPorGrupos && index>-1) {
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioActivosFijosPorGrupos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasActivosFijosPorGrupos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasActivosFijosPorGrupos.indexOfComponent(this.jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorGrupos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.activosfijosporgruposConstantesFunciones.activarBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
				this.jTabbedPaneBusquedasActivosFijosPorGrupos.setEnabledAt(index,this.activosfijosporgruposConstantesFunciones.activarBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaActivosFijosPorGrupos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaActivosFijosPorGrupos")) {
			index= this.jTabbedPaneBusquedasActivosFijosPorGrupos.indexOfComponent(this.jPanelBusquedaActivosFijosPorGruposActivosFijosPorGrupos);

			this.jTabbedPaneBusquedasActivosFijosPorGrupos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasActivosFijosPorGrupos.getComponent(index);

			this.activosfijosporgruposConstantesFunciones.setResaltarBusquedaActivosFijosPorGruposActivosFijosPorGrupos(resaltar);

			jPanel.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarBusquedaActivosFijosPorGruposActivosFijosPorGrupos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarActivosFijosPorGrupos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioActivosFijosPorGrupos() throws Exception {

		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioActivosFijosPorGrupos();
		this.updateVisibilidadResaltarControlesFormularioActivosFijosPorGrupos();
		this.updateHabilitarResaltarControlesFormularioActivosFijosPorGrupos();
		
	}
	
	public void updateBorderResaltarControlesFormularioActivosFijosPorGrupos() throws Exception {
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.activosfijosporgruposConstantesFunciones.resaltaridActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltaridActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarid_empresaActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarid_empresaActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarid_sucursalActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarid_sucursalActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_sub_grupoActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_sub_grupoActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarnombre_sub_grupoActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_detalle_grupoActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarcodigo_detalle_grupoActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarnombre_detalle_grupoActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarclaveActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarclaveActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarnombreActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarnombreActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarfecha_compraActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarfecha_compraActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarvida_utilActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarvida_utilActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarcosto_de_compraActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarcosto_de_compraActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarmarcaActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarmarcaActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarmodeloActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarmodeloActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarcolorActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarcolorActivosFijosPorGrupos);}
		if(this.activosfijosporgruposConstantesFunciones.resaltarserieActivosFijosPorGrupos!=null && this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.setBorder(this.activosfijosporgruposConstantesFunciones.resaltarserieActivosFijosPorGrupos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioActivosFijosPorGrupos() throws Exception {		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
	
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostraridActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelidActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostraridActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarid_empresaActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelid_empresaActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarid_empresaActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarid_sucursalActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelid_sucursalActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarid_sucursalActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcodigo_sub_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelcodigo_sub_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcodigo_sub_grupoActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarnombre_sub_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelnombre_sub_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarnombre_sub_grupoActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcodigo_detalle_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelcodigo_detalle_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcodigo_detalle_grupoActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarnombre_detalle_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelnombre_detalle_grupoActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarnombre_detalle_grupoActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarclaveActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelclaveActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarclaveActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarnombreActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelnombreActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarnombreActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarfecha_compraActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelfecha_compraActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarfecha_compraActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarvida_utilActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelvida_utilActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarvida_utilActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcosto_de_compraActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelcosto_de_compraActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcosto_de_compraActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarmarcaActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelmarcaActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarmarcaActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarmodeloActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelmodeloActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarmodeloActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcolorActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelcolorActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarcolorActivosFijosPorGrupos);
		//this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarserieActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jPanelserieActivosFijosPorGrupos.setVisible(this.activosfijosporgruposConstantesFunciones.mostrarserieActivosFijosPorGrupos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioActivosFijosPorGrupos() throws Exception {
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormActivosFijosPorGrupos!=null) {
	
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jLabelidActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activaridActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_empresaActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarid_empresaActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jComboBoxid_sucursalActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarid_sucursalActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_sub_grupoActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarcodigo_sub_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_sub_grupoActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarnombre_sub_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcodigo_detalle_grupoActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarcodigo_detalle_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombre_detalle_grupoActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarnombre_detalle_grupoActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldclaveActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarclaveActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreanombreActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarnombreActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jDateChooserfecha_compraActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarfecha_compraActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldvida_utilActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarvida_utilActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcosto_de_compraActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarcosto_de_compraActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamarcaActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarmarcaActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextAreamodeloActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarmodeloActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldcolorActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarcolorActivosFijosPorGrupos);
		this.jInternalFrameDetalleFormActivosFijosPorGrupos.jTextFieldserieActivosFijosPorGrupos.setEnabled(this.activosfijosporgruposConstantesFunciones.activarserieActivosFijosPorGrupos);
		}
	}
	
		
}