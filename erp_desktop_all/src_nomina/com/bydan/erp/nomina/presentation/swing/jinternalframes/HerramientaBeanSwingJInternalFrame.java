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

import com.bydan.erp.nomina.util.HerramientaConstantesFunciones;
import com.bydan.erp.nomina.util.HerramientaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.HerramientaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.HerramientaBean;
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
public class HerramientaBeanSwingJInternalFrame extends HerramientaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HerramientaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Herramienta> herramientaValidator = new ClassValidator<Herramienta>(Herramienta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Herramienta herramienta;	
	public Herramienta herramientaAux;
	public Herramienta herramientaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Herramienta herramientaTotales;
	public Long idHerramientaActual;
	public Long iIdNuevoHerramienta=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosEmpleadoHerra=false;

	public Boolean getIsTienePermisosEmpleadoHerra() {
		return isTienePermisosEmpleadoHerra;
	}

	public void setIsTienePermisosEmpleadoHerra(Boolean isTienePermisosEmpleadoHerra) {
		this.isTienePermisosEmpleadoHerra= isTienePermisosEmpleadoHerra;
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
	
	public Boolean isPermisoTodoHerramienta;
	public Boolean isPermisoNuevoHerramienta;
	public Boolean isPermisoActualizarHerramienta;
	public Boolean isPermisoActualizarOriginalHerramienta;
	public Boolean isPermisoEliminarHerramienta;
	public Boolean isPermisoGuardarCambiosHerramienta;
	public Boolean isPermisoConsultaHerramienta;
	public Boolean isPermisoBusquedaHerramienta;
	public Boolean isPermisoReporteHerramienta;
	public Boolean isPermisoPaginacionMedioHerramienta;
	public Boolean isPermisoPaginacionAltoHerramienta;
	public Boolean isPermisoPaginacionTodoHerramienta;
	public Boolean isPermisoCopiarHerramienta;
	public Boolean isPermisoVerFormHerramienta;
	public Boolean isPermisoDuplicarHerramienta;
	public Boolean isPermisoOrdenHerramienta;
	
	
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
	
	public HerramientaParameterReturnGeneral herramientaReturnGeneral;
	public HerramientaParameterReturnGeneral herramientaParameterGeneral;
	
	

	public EmpleadoHerraLogic empleadoherraLogic=null;

	public EmpleadoHerraLogic getEmpleadoHerraLogic() {
		return empleadoherraLogic;
	}

	public void setEmpleadoHerraLogic(EmpleadoHerraLogic empleadoherraLogic) {
		this.empleadoherraLogic = empleadoherraLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHerramienta=false;
	public Boolean esParaAccionDesdeFormularioHerramienta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HerramientaSessionBeanAdditional herramientaSessionBeanAdditional=null;
	
	public HerramientaSessionBeanAdditional getHerramientaSessionBeanAdditional() {
		return this.herramientaSessionBeanAdditional;
	}
	
	public void setHerramientaSessionBeanAdditional(HerramientaSessionBeanAdditional herramientaSessionBeanAdditional) {
		try {
			this.herramientaSessionBeanAdditional=herramientaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HerramientaBeanSwingJInternalFrameAdditional herramientaBeanSwingJInternalFrameAdditional=null;
	//public class HerramientaBeanSwingJInternalFrame
	
	public HerramientaBeanSwingJInternalFrameAdditional getHerramientaBeanSwingJInternalFrameAdditional() {
		return this.herramientaBeanSwingJInternalFrameAdditional;
	}
	
	public void setHerramientaBeanSwingJInternalFrameAdditional(HerramientaBeanSwingJInternalFrameAdditional herramientaBeanSwingJInternalFrameAdditional) {
		try {
			this.herramientaBeanSwingJInternalFrameAdditional=herramientaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HerramientaLogic herramientaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Herramienta herramientaBean;
	public HerramientaConstantesFunciones herramientaConstantesFunciones;
	//public HerramientaParameterReturnGeneral herramientaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Herramienta> herramientas;	
	//public List<Herramienta> herramientasEliminados;
	//public List<Herramienta> herramientasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHerramienta=false;
	public Boolean isVisibilidadCeldaDuplicarHerramienta=true;
	public Boolean isVisibilidadCeldaCopiarHerramienta=true;
	public Boolean isVisibilidadCeldaVerFormHerramienta=true;
	public Boolean isVisibilidadCeldaOrdenHerramienta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHerramienta=false;
	public Boolean isVisibilidadCeldaModificarHerramienta=false;
	public Boolean isVisibilidadCeldaActualizarHerramienta=false;
	public Boolean isVisibilidadCeldaEliminarHerramienta=false;
	public Boolean isVisibilidadCeldaCancelarHerramienta=false;
	public Boolean isVisibilidadCeldaGuardarHerramienta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHerramienta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoHerramienta() {
		return this.iIdNuevoHerramienta;
	}

	public void setiIdNuevoHerramienta(Long iIdNuevoHerramienta) {
		this.iIdNuevoHerramienta = iIdNuevoHerramienta;
	}
	
	public Long getidHerramientaActual() {
		return this.idHerramientaActual;
	}

	public void setidHerramientaActual(Long idHerramientaActual) {
		this.idHerramientaActual = idHerramientaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Herramienta getherramienta() {
		return this.herramienta;
	}

	public void setherramienta(Herramienta herramienta) {
		this.herramienta = herramienta;
	}
	
	public Herramienta getherramientaAux() {
		return this.herramientaAux;
	}

	public void setherramientaAux(Herramienta herramientaAux) {
		this.herramientaAux = herramientaAux;
	}				
	
	public Herramienta getherramientaAnterior() {
		return this.herramientaAnterior;
	}

	public void setherramientaAnterior(Herramienta herramientaAnterior) {
		this.herramientaAnterior = herramientaAnterior;
	}	
	
	public Herramienta getherramientaTotales() {
		return this.herramientaTotales;
	}

	public void setherramientaTotales(Herramienta herramientaTotales) {
		this.herramientaTotales = herramientaTotales;
	}	
	
	public Herramienta getherramientaBean() {
		return this.herramientaBean;
	}

	public void setherramientaBean(Herramienta herramientaBean) {
		this.herramientaBean = herramientaBean;
	}	
	
	public HerramientaParameterReturnGeneral getherramientaReturnGeneral() {
		return this.herramientaReturnGeneral;
	}

	public void setherramientaReturnGeneral(HerramientaParameterReturnGeneral herramientaReturnGeneral) {
		this.herramientaReturnGeneral = herramientaReturnGeneral;
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
	
	
	public HerramientaLogic getHerramientaLogic()	{		
		return herramientaLogic;
	}

	public void setHerramientaLogic(HerramientaLogic herramientaLogic) {
		this.herramientaLogic = herramientaLogic;
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
	
	public Boolean getIsEsNuevoHerramienta() {
		return isEsNuevoHerramienta;
	}

	public void setIsEsNuevoHerramienta(Boolean isEsNuevoHerramienta) {
		this.isEsNuevoHerramienta = isEsNuevoHerramienta;
	}

	public Boolean getEsParaAccionDesdeFormularioHerramienta() {
		return esParaAccionDesdeFormularioHerramienta;
	}
	
	public void setEsParaAccionDesdeFormularioHerramienta(Boolean esParaAccionDesdeFormularioHerramienta) {
		this.esParaAccionDesdeFormularioHerramienta = esParaAccionDesdeFormularioHerramienta;
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

			if(this.herramientaSessionBean==null) {
				this.herramientaSessionBean=new HerramientaSessionBean();
			}

			if(!this.herramientaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(herramientaSessionBean.getlidEmpresaActual());
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

					if(this.herramienta!=null) {
						this.herramienta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHerramienta!=null) {
						this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHerramienta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHerramienta!=null) {
						if(this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.getItemCount()>0) {
							this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHerramientaGenerico)throws Exception
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
				jComboBoxid_empresaHerramientaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHerramientaGenerico!=null && jComboBoxid_empresaHerramientaGenerico.getItemCount()>0) {
					jComboBoxid_empresaHerramientaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Herramienta herramienta,JComboBox jComboBoxid_empresaHerramientaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHerramientaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHerramientaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				herramienta.setid_empresa(empresaAux.getId());
				herramienta.setempresa_descripcion(HerramientaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				herramienta.setEmpresa(empresaAux);			}
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

					if(!HerramientaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHerramienta!=null) { 
							this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHerramienta!=null) { 
					}

					if(!HerramientaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormHerramienta!=null) {
							this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHerramienta!=null) {
							this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesHerramienta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HerramientaConstantesFunciones.refrescarForeignKeysDescripcionesHerramienta(this.herramientaLogic.getHerramientas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HerramientaConstantesFunciones.refrescarForeignKeysDescripcionesHerramienta(this.herramientas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//herramientaLogic.setHerramientas(this.herramientas);
			herramientaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public HerramientaParameterReturnGeneral getHerramientaParameterGeneral() {
		return this.herramientaParameterGeneral;
	}
	
	public void setHerramientaParameterGeneral(HerramientaParameterReturnGeneral herramientaParameterGeneral) {
		this.herramientaParameterGeneral = herramientaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHerramienta() {
		return isPermisoTodoHerramienta;
	}

	public void setIsPermisoTodoHerramienta(Boolean isPermisoTodoHerramienta) {
		this.isPermisoTodoHerramienta = isPermisoTodoHerramienta;
	}

	public Boolean getIsPermisoNuevoHerramienta() {
		return isPermisoNuevoHerramienta;
	}

	public void setIsPermisoNuevoHerramienta(Boolean isPermisoNuevoHerramienta) {
		this.isPermisoNuevoHerramienta = isPermisoNuevoHerramienta;
	}

	public Boolean getIsPermisoActualizarHerramienta() {
		return isPermisoActualizarHerramienta;
	}

	public void setIsPermisoActualizarHerramienta(Boolean isPermisoActualizarHerramienta) {
		this.isPermisoActualizarHerramienta = isPermisoActualizarHerramienta;
	}

	public Boolean getIsPermisoEliminarHerramienta() {
		return isPermisoEliminarHerramienta;
	}

	public void setIsPermisoEliminarHerramienta(Boolean isPermisoEliminarHerramienta) {
		this.isPermisoEliminarHerramienta = isPermisoEliminarHerramienta;
	}

	public Boolean getIsPermisoGuardarCambiosHerramienta() {
		return isPermisoGuardarCambiosHerramienta;
	}

	public void setIsPermisoGuardarCambiosHerramienta(Boolean isPermisoGuardarCambiosHerramienta) {
		this.isPermisoGuardarCambiosHerramienta = isPermisoGuardarCambiosHerramienta;
	}
	
	public Boolean getIsPermisoConsultaHerramienta() {
		return isPermisoConsultaHerramienta;
	}

	public void setIsPermisoConsultaHerramienta(Boolean isPermisoConsultaHerramienta) {
		this.isPermisoConsultaHerramienta = isPermisoConsultaHerramienta;
	}

	public Boolean getIsPermisoBusquedaHerramienta() {
		return isPermisoBusquedaHerramienta;
	}

	public void setIsPermisoBusquedaHerramienta(Boolean isPermisoBusquedaHerramienta) {
		this.isPermisoBusquedaHerramienta = isPermisoBusquedaHerramienta;
	}

	public Boolean getIsPermisoReporteHerramienta() {
		return isPermisoReporteHerramienta;
	}

	public void setIsPermisoReporteHerramienta(Boolean isPermisoReporteHerramienta) {
		this.isPermisoReporteHerramienta = isPermisoReporteHerramienta;
	}
	
	public Boolean getIsPermisoPaginacionMedioHerramienta() {
		return isPermisoPaginacionMedioHerramienta;
	}

	public void setIsPermisoPaginacionMedioHerramienta(Boolean isPermisoPaginacionMedioHerramienta) {
		this.isPermisoPaginacionMedioHerramienta = isPermisoPaginacionMedioHerramienta;
	}
	
	public Boolean getIsPermisoPaginacionTodoHerramienta() {
		return isPermisoPaginacionTodoHerramienta;
	}

	public void setIsPermisoPaginacionTodoHerramienta(Boolean isPermisoPaginacionTodoHerramienta) {
		this.isPermisoPaginacionTodoHerramienta = isPermisoPaginacionTodoHerramienta;
	}
	
	public Boolean getIsPermisoPaginacionAltoHerramienta() {
		return isPermisoPaginacionAltoHerramienta;
	}

	public void setIsPermisoPaginacionAltoHerramienta(Boolean isPermisoPaginacionAltoHerramienta) {
		this.isPermisoPaginacionAltoHerramienta = isPermisoPaginacionAltoHerramienta;
	}
	
	public Boolean getIsPermisoCopiarHerramienta() {
		return isPermisoCopiarHerramienta;
	}

	public void setIsPermisoCopiarHerramienta(Boolean isPermisoCopiarHerramienta) {
		this.isPermisoCopiarHerramienta = isPermisoCopiarHerramienta;
	}
	
	public Boolean getIsPermisoVerFormHerramienta() {
		return isPermisoVerFormHerramienta;
	}

	public void setIsPermisoVerFormHerramienta(Boolean isPermisoVerFormHerramienta) {
		this.isPermisoVerFormHerramienta = isPermisoVerFormHerramienta;
	}
	
	public Boolean getIsPermisoDuplicarHerramienta() {
		return isPermisoDuplicarHerramienta;
	}

	public void setIsPermisoDuplicarHerramienta(Boolean isPermisoDuplicarHerramienta) {
		this.isPermisoDuplicarHerramienta = isPermisoDuplicarHerramienta;
	}
	
	public Boolean getIsPermisoOrdenHerramienta() {
		return isPermisoOrdenHerramienta;
	}

	public void setIsPermisoOrdenHerramienta(Boolean isPermisoOrdenHerramienta) {
		this.isPermisoOrdenHerramienta = isPermisoOrdenHerramienta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHerramienta() {
		return isVisibilidadCeldaNuevoHerramienta;
	}

	public void setIsVisibilidadCeldaNuevoHerramienta(Boolean isVisibilidadCeldaNuevoHerramienta) {
		this.isVisibilidadCeldaNuevoHerramienta = isVisibilidadCeldaNuevoHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHerramienta() {
		return isVisibilidadCeldaDuplicarHerramienta;
	}

	public void setIsVisibilidadCeldaDuplicarHerramienta(Boolean isVisibilidadCeldaDuplicarHerramienta) {
		this.isVisibilidadCeldaDuplicarHerramienta = isVisibilidadCeldaDuplicarHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHerramienta() {
		return isVisibilidadCeldaCopiarHerramienta;
	}

	public void setIsVisibilidadCeldaCopiarHerramienta(Boolean isVisibilidadCeldaCopiarHerramienta) {
		this.isVisibilidadCeldaCopiarHerramienta = isVisibilidadCeldaCopiarHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHerramienta() {
		return isVisibilidadCeldaVerFormHerramienta;
	}

	public void setIsVisibilidadCeldaVerFormHerramienta(Boolean isVisibilidadCeldaVerFormHerramienta) {
		this.isVisibilidadCeldaVerFormHerramienta = isVisibilidadCeldaVerFormHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHerramienta() {
		return isVisibilidadCeldaOrdenHerramienta;
	}

	public void setIsVisibilidadCeldaOrdenHerramienta(Boolean isVisibilidadCeldaOrdenHerramienta) {
		this.isVisibilidadCeldaOrdenHerramienta = isVisibilidadCeldaOrdenHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHerramienta() {
		return isVisibilidadCeldaNuevoRelacionesHerramienta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHerramienta(Boolean isVisibilidadCeldaNuevoRelacionesHerramienta) {
		this.isVisibilidadCeldaNuevoRelacionesHerramienta = isVisibilidadCeldaNuevoRelacionesHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHerramienta() {
		return isVisibilidadCeldaModificarHerramienta;
	}

	public void setIsVisibilidadCeldaModificarHerramienta(Boolean isVisibilidadCeldaModificarHerramienta) {
		this.isVisibilidadCeldaModificarHerramienta = isVisibilidadCeldaModificarHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHerramienta() {
		return isVisibilidadCeldaActualizarHerramienta;
	}

	public void setIsVisibilidadCeldaActualizarHerramienta(Boolean isVisibilidadCeldaActualizarHerramienta) {
		this.isVisibilidadCeldaActualizarHerramienta = isVisibilidadCeldaActualizarHerramienta;
	}

	public Boolean getIsVisibilidadCeldaEliminarHerramienta() {
		return isVisibilidadCeldaEliminarHerramienta;
	}

	public void setIsVisibilidadCeldaEliminarHerramienta(Boolean isVisibilidadCeldaEliminarHerramienta) {
		this.isVisibilidadCeldaEliminarHerramienta = isVisibilidadCeldaEliminarHerramienta;
	}

	public Boolean getIsVisibilidadCeldaCancelarHerramienta() {
		return isVisibilidadCeldaCancelarHerramienta;
	}

	public void setIsVisibilidadCeldaCancelarHerramienta(Boolean isVisibilidadCeldaCancelarHerramienta) {
		this.isVisibilidadCeldaCancelarHerramienta = isVisibilidadCeldaCancelarHerramienta;
	}

	public Boolean getIsVisibilidadCeldaGuardarHerramienta() {
		return isVisibilidadCeldaGuardarHerramienta;
	}

	public void setIsVisibilidadCeldaGuardarHerramienta(Boolean isVisibilidadCeldaGuardarHerramienta) {
		this.isVisibilidadCeldaGuardarHerramienta = isVisibilidadCeldaGuardarHerramienta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHerramienta() {
		return isVisibilidadCeldaGuardarCambiosHerramienta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHerramienta(Boolean isVisibilidadCeldaGuardarCambiosHerramienta) {
		this.isVisibilidadCeldaGuardarCambiosHerramienta = isVisibilidadCeldaGuardarCambiosHerramienta;
	}
		
	public HerramientaSessionBean getherramientaSessionBean() {
		return this.herramientaSessionBean;
	}
	
	public void setherramientaSessionBean(HerramientaSessionBean herramientaSessionBean) {
		this.herramientaSessionBean=herramientaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHerramienta(Herramienta herramienta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(herramienta,null);
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
	
	public void bugActualizarReferenciaActual(Herramienta herramienta,Herramienta herramientaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHerramienta(herramienta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		herramientaAux.setId(herramienta.getId());
		herramientaAux.setVersionRow(herramienta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHerramienta();
		
			int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = herramientaValidator.getInvalidValues(this.herramienta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			herramientaLogic.setDatosCliente(datosCliente);
			herramientaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				herramientaAux=new  Herramienta();
				
				herramientaAux.setIsNew(true);
				herramientaAux.setIsChanged(true);
				
				herramientaAux.setHerramientaOriginal(this.herramienta);
				
				herramientaAux.setId(this.herramienta.getId());	
				herramientaAux.setVersionRow(this.herramienta.getVersionRow());	
				herramientaAux.setid_empresa(this.herramienta.getid_empresa());	
				herramientaAux.setnombre(this.herramienta.getnombre());	
				herramientaAux.setdescripcion(this.herramienta.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.herramientaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(herramientaAux,herramientaLogic.getHerramientas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(herramientaAux,herramientas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.herramientaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						herramientaLogic.saveHerramientas();//WithConnection
						//herramientaLogic.getSetVersionRowHerramientas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.herramienta,herramientaAux);
					
					this.refrescarForeignKeysDescripcionesHerramienta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.herramientaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras().addAll(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherrasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherras.addAll(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherrasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								herramientaLogic.saveHerramientaRelaciones(herramientaAux,this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());//WithConnection
								//herramientaLogic.getSetVersionRowHerramientas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.herramienta,herramientaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherras= new ArrayList<EmpleadoHerra>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();}
							herramientaAux.setEmpleadoHerras(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.herramientaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(herramientaAux,herramientaLogic.getHerramientas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(herramientaAux,herramientas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.herramienta,herramientaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				herramientaAux=new  Herramienta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.herramientaSessionBean.getEsGuardarRelacionado() 
					|| (this.herramientaSessionBean.getEsGuardarRelacionado() && this.herramienta.getId()>=0)) {
						
					herramientaAux.setIsNew(false);
				}
				
				herramientaAux.setIsDeleted(false);
			
				herramientaAux.setId(this.herramienta.getId());	
				herramientaAux.setVersionRow(this.herramienta.getVersionRow());	
				herramientaAux.setid_empresa(this.herramienta.getid_empresa());	
				herramientaAux.setnombre(this.herramienta.getnombre());	
				herramientaAux.setdescripcion(this.herramienta.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(herramientaAux,herramientaLogic.getHerramientas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(herramientaAux,herramientas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.herramientaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						herramientaLogic.saveHerramientas();//WithConnection
						//herramientaLogic.getSetVersionRowHerramientas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.herramienta,herramientaAux);
					
					this.refrescarForeignKeysDescripcionesHerramienta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.herramientaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras().addAll(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherrasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherras.addAll(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherrasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								herramientaLogic.saveHerramientaRelaciones(herramientaAux,this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());//WithConnection
								//herramientaLogic.getSetVersionRowHerramientas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.herramienta,herramientaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherras= new ArrayList<EmpleadoHerra>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();}
							herramientaAux.setEmpleadoHerras(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.herramientaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(herramientaAux,herramientaLogic.getHerramientas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(herramientaAux,herramientas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.herramienta,herramientaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				herramientaAux=new  Herramienta();
				
				herramientaAux.setIsNew(false);
				herramientaAux.setIsChanged(false);
				
				herramientaAux.setIsDeleted(true);
				
				herramientaAux.setId(this.herramienta.getId());	
				herramientaAux.setVersionRow(this.herramienta.getVersionRow());	
				herramientaAux.setid_empresa(this.herramienta.getid_empresa());	
				herramientaAux.setnombre(this.herramienta.getnombre());	
				herramientaAux.setdescripcion(this.herramienta.getdescripcion());	
				
				if(this.herramientaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.herramientaAux.getId()>=0) {	
						this.herramientasEliminados.add(herramientaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(herramientaAux,herramientaLogic.getHerramientas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(herramientaAux,herramientas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.herramientaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						herramientaLogic.saveHerramientas();//WithConnection
						//herramientaLogic.getSetVersionRowHerramientas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.herramientaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras().addAll(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherrasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherras.addAll(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherrasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								herramientaLogic.saveHerramientaRelaciones(herramientaAux,this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());//WithConnection
								//herramientaLogic.getSetVersionRowHerramientas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherras= new ArrayList<EmpleadoHerra>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.quitarFilaTotales();}
							herramientaAux.setEmpleadoHerras(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.herramientaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(herramientaAux,herramientaLogic.getHerramientas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(herramientaAux,herramientas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.getHerramientas().addAll(this.herramientasEliminados);
					
					herramientaLogic.saveHerramientas();//WithConnection
					//herramientaLogic.getSetVersionRowHerramientas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHerramienta();
				
				this.herramientasEliminados= new ArrayList<Herramienta>();		
			}
			
			if(this.herramientaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Herramienta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.herramienta=herramientaAux;
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
      		//this.finishProcessHerramienta();
      	}
		
	}	
	
	public void actualizarRelaciones(Herramienta herramientaLocal) throws Exception {
		
		if(this.herramientaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				herramientaLocal.setEmpleadoHerras(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());
			
			} else {
			
				herramientaLocal.setEmpleadoHerras(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherras);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Herramienta herramientaLocal) throws Exception {	
		if(this.herramientaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				herramientaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHerramientaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = herramientaValidator.getInvalidValues(this.herramienta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Herramienta herramienta,List<Herramienta> herramientas) throws Exception {
		try	{		
			HerramientaConstantesFunciones.actualizarLista(herramienta,herramientas,this.herramientaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Herramienta herramienta,List<Herramienta> herramientas) throws Exception {
		try	{			
			HerramientaConstantesFunciones.actualizarSelectedLista(herramienta,herramientas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Herramienta> herramientasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				herramientasLocal=this.herramientaLogic.getHerramientas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				herramientasLocal=this.herramientas;
			}
			//ARCHITECTURE
		
			for(Herramienta herramientaLocal:herramientasLocal) {
				if(this.permiteMantenimiento(herramientaLocal) && herramientaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HerramientaConstantesFunciones.getHerramientaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HerramientaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHerramienta.jLabelid_empresaHerramienta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HerramientaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHerramienta.jLabelnombreHerramienta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HerramientaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHerramienta.jLabeldescripcionHerramienta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHerramienta.jLabelid_empresaHerramienta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHerramienta.jLabelnombreHerramienta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHerramienta.jLabeldescripcionHerramienta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("EmpleadoHerra")) {
			if(this.herramienta==null) {
				this.herramienta= new Herramienta();
			}

			if(this.herramientaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoHerramienta
				this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);

				this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.getempleadoherra().setHerramienta(this.herramienta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoHerramienta--;	
		
		
		this.herramientaAux=new Herramienta();
		
		this.herramientaAux.setId(this.iIdNuevoHerramienta);
		this.herramientaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.herramientaLogic.getHerramientas().add(this.herramientaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.herramientas.add(this.herramientaAux);
		}
		//ARCHITECTURE
		
		this.herramienta=this.herramientaAux;
		
		if(HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHerramienta(this.herramienta);
			this.setVariablesObjetoActualToFormularioForeignKeyHerramienta(this.herramienta);
		}
				
		//this.setDefaultControlesHerramienta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHerramienta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHerramienta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHerramienta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHerramienta(this.herramientaBean,this.herramienta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HerramientaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.herramientaSessionBean.getConGuardarRelaciones()) {
			classes=HerramientaConstantesFunciones.getClassesRelationshipsOfHerramienta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.herramientaReturnGeneral=herramientaLogic.procesarEventosHerramientasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.herramientaLogic.getHerramientas(),this.herramienta,this.herramientaParameterGeneral,this.isEsNuevoHerramienta,classes);//this.herramientaLogic.getHerramienta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHerramienta(this.herramientaReturnGeneral,this.herramientaBean,false);
		
		if(this.herramientaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHerramienta(this.herramientaReturnGeneral.getHerramienta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHerramienta(this.herramientaReturnGeneral.getHerramienta());
		}
		
		if(this.herramientaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHerramienta(this.herramientaReturnGeneral.getHerramienta(),classes);//this.herramientaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHerramienta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHerramienta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HerramientaBeanSwingJInternalFrameAdditional.RecargarFormHerramienta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHerramienta(false);
						
			if(herramientaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.getEsGuardarRelacionado() && EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoHerraActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHerramienta();
			}
			
			this.actualizarVisualTableDatosHerramienta();
			
			this.jTableDatosHerramienta.setRowSelectionInterval(this.getIndiceNuevoHerramienta(), this.getIndiceNuevoHerramienta());
			
			this.seleccionarFilaTablaHerramientaActual();
						
			this.actualizarEstadoCeldasBotonesHerramienta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHerramienta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.setEnabled(isHabilitar && this.herramientaConstantesFunciones.activarnombreHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.setEnabled(isHabilitar && this.herramientaConstantesFunciones.activardescripcionHerramienta);	
		//
		this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setEnabled(isHabilitar && this.herramientaConstantesFunciones.activarid_empresaHerramienta);
	};
	
	public void setDefaultControlesHerramienta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHerramienta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.herramientaSessionBean.setConGuardarRelaciones(true);			
			this.herramientaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.herramientaSessionBean.setConGuardarRelaciones(false);			
			this.herramientaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoHerramienta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
				if(herramientaAux.getId().equals(this.iIdNuevoHerramienta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Herramienta herramientaAux:this.herramientas) {
				if(herramientaAux.getId().equals(this.iIdNuevoHerramienta)) {
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
	
	public int getIndiceActualHerramienta(Herramienta herramienta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
				if(herramientaAux.getId().equals(herramienta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Herramienta herramientaAux:this.herramientas) {
				if(herramientaAux.getId().equals(herramienta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHerramienta(Herramienta herramientaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
				if(herramientaAux.getHerramientaOriginal().getId().equals(herramientaOriginal.getId())) {
					existe=true;
					herramientaOriginal.setId(herramientaAux.getId());
					herramientaOriginal.setVersionRow(herramientaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Herramienta herramientaAux:this.herramientas) {
				if(herramientaAux.getHerramientaOriginal().getId().equals(herramientaOriginal.getId())) {
					existe=true;
					herramientaOriginal.setId(herramientaAux.getId());
					herramientaOriginal.setVersionRow(herramientaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHerramienta(Boolean esParaCancelar) throws Exception {
		herramientasAux=new ArrayList<Herramienta>();
		herramientaAux=new Herramienta();
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
					if(herramientaAux.getId()<0) {
						herramientasAux.add(herramientaAux);
					}		
				}
				this.iIdNuevoHerramienta=0L;
				this.herramientaLogic.getHerramientas().removeAll(herramientasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Herramienta herramientaAux:this.herramientas) {
					if(herramientaAux.getId()<0) {
						herramientasAux.add(herramientaAux);
					}		
				}
				this.iIdNuevoHerramienta=0L;
				this.herramientas.removeAll(herramientasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHerramienta 
					&& this.herramientaLogic.getHerramientas().size()>0
					) {
					herramientaAux=this.herramientaLogic.getHerramientas().get(this.herramientaLogic.getHerramientas().size() - 1);
				
					if(herramientaAux.getId()<0) {
						this.herramientaLogic.getHerramientas().remove(herramientaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHerramienta && this.herramientas.size()>0) {
					herramientaAux=this.herramientas.get(this.herramientas.size() - 1);
				
					if(herramientaAux.getId()<0) {
						this.herramientas.remove(herramientaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHerramienta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(herramienta.getId()<0) {
				this.herramientaLogic.getHerramientas().remove(this.herramienta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(herramienta.getId()<0) {
				this.herramientas.remove(this.herramienta);
			}
		}			
	}
	
	public void setEstadosInicialesHerramienta(List<Herramienta> herramientasAux) throws Exception {
		HerramientaConstantesFunciones.setEstadosInicialesHerramienta(herramientasAux);
	}
	
	public void setEstadosInicialesHerramienta(Herramienta herramientaAux) throws Exception {
		HerramientaConstantesFunciones.setEstadosInicialesHerramienta(herramientaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHerramientaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHerramienta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHerramientaActual()) {
				if(!this.isEsNuevoHerramienta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHerramienta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHerramienta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHerramientaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Herramienta ?", "MANTENIMIENTO DE Herramienta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHerramienta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Herramienta herramienta) throws Exception {
		HerramientaConstantesFunciones.seleccionarAsignar(this.herramienta,herramienta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHerramienta=this.isPermisoActualizarOriginalHerramienta;
			
			
			this.seleccionarAsignar(herramienta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HerramientaConstantesFunciones.quitarEspaciosHerramienta(this.herramienta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHerramienta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.herramientaSessionBean.setsFuncionBusquedaRapida(this.herramientaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHerramienta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHerramienta(esParaCancelar);				
				this.cancelarNuevoHerramienta(esParaCancelar);								
			}
			
			this.herramienta=new Herramienta();
			
			this.inicializarHerramienta();
			
			this.actualizarEstadoCeldasBotonesHerramienta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHerramienta() throws Exception {
		try {
			HerramientaConstantesFunciones.inicializarHerramienta(this.herramienta);
			
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
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.herramientaLogic.getHerramientas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHerramientas(String sAccionBusqueda,List<Herramienta> herramientasParaReportes) throws Exception {
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
					sPathReporteFinal="Herramienta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HerramientaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HerramientaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Herramienta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Herramientas");		
		parameters.put("busquedapor", HerramientaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(EmpleadoHerra.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					HerramientaLogic herramientaLogicAuxiliar=new HerramientaLogic();
					herramientaLogicAuxiliar.setDatosCliente(herramientaLogic.getDatosCliente());				
					herramientaLogicAuxiliar.setHerramientas(herramientasParaReportes);
					
					herramientaLogicAuxiliar.cargarRelacionesLoteForeignKeyHerramientaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					herramientasParaReportes=herramientaLogicAuxiliar.getHerramientas();
					
					//herramientaLogic.getNewConnexionToDeep();
					
					//for (Herramienta herramienta:herramientasParaReportes) {
					//	herramientaLogic.deepLoad(herramienta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//herramientaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//herramientaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileEmpleadoHerra = AuxiliarReportes.class.getResourceAsStream("EmpleadoHerraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleadoherra", reportFileEmpleadoHerra);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHerramienta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HerramientaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HerramientaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHerramienta=new JRBeanArrayDataSource(HerramientaJInternalFrame.TraerHerramientaBeans(herramientasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHerramienta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HerramientaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HerramientaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HerramientaBean.TraerHerramientaBeans(herramientasParaReportes).toArray()));
							
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
				this.generarExcelReporteHerramientas(sAccionBusqueda,sTipoArchivoReporte,herramientasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHerramientas(sAccionBusqueda,sTipoArchivoReporte,herramientasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHerramientaActionPerformed(null);
					//this.generarExcelReporteHerramientas(sAccionBusqueda,sTipoArchivoReporte,herramientasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHerramientas(sAccionBusqueda,sTipoArchivoReporte,herramientasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHerramientas(sAccionBusqueda,sTipoArchivoReporte,herramientasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHerramientas(sAccionBusqueda,sTipoArchivoReporte,herramientasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHerramientas(String sAccionBusqueda,String sTipoArchivoReporte,List<Herramienta> herramientasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"herramienta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Herramientas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHerramienta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Herramienta herramienta : herramientasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HerramientaConstantesFunciones.generarExcelReporteDataHerramienta("NORMAL",row,workbook,herramienta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHerramienta(String sTipo,Row row,Workbook workbook) {
		
		HerramientaConstantesFunciones.generarExcelReporteHeaderHerramienta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHerramientas(String sAccionBusqueda,String sTipoArchivoReporte,List<Herramienta> herramientasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"herramienta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Herramientas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Herramienta herramienta : herramientasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HerramientaConstantesFunciones.getHerramientaDescripcion(herramienta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HerramientaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HerramientaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(herramienta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HerramientaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HerramientaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(herramienta.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HerramientaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HerramientaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(herramienta.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHerramientas(String sAccionBusqueda,String sTipoArchivoReporte,List<Herramienta> herramientasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Herramienta> herramientasRespaldo=null;
		
		classes=HerramientaConstantesFunciones.getClassesRelationshipsOfHerramienta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.herramientaLogic.setDatosCliente(this.datosCliente);
		this.herramientaLogic.setDatosDeep(this.datosDeep);
		this.herramientaLogic.setIsConDeep(true);
		
		herramientasRespaldo=this.herramientaLogic.getHerramientas();
		
		this.herramientaLogic.setHerramientas(herramientasParaReportes);	
		this.herramientaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		herramientasParaReportes=this.herramientaLogic.getHerramientas();
		this.herramientaLogic.setHerramientas(herramientasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"herramienta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Herramientas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHerramienta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Herramienta herramienta : herramientasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHerramienta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HerramientaConstantesFunciones.generarExcelReporteDataHerramienta("NORMAL",row,workbook,herramienta,cellStyleDataAux);
		
			
			


				//EmpleadoHerra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO))) {

				if(herramienta.getEmpleadoHerras()!=null && herramienta.getEmpleadoHerras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoHerraConstantesFunciones.generarExcelReporteHeaderEmpleadoHerra("RELACIONADO",row,workbook);
				}

				if(herramienta.getEmpleadoHerras()!=null) {
					i2=0;
					for(EmpleadoHerra empleadoherra : herramienta.getEmpleadoHerras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoHerraConstantesFunciones.generarExcelReporteDataEmpleadoHerra("RELACIONADO",row,workbook,empleadoherra,cellStyleDataAuxHijo);
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
		cell.setCellValue(HerramientaConstantesFunciones.getHerramientaDescripcion(herramienta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHerramienta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHerramienta() throws Exception {		
		this.startProcessHerramienta(true);
	}
	
	public void startProcessHerramienta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHerramienta ,this.jPanelParametrosReportesHerramienta, this.jScrollPanelDatosHerramienta,this.jPanelPaginacionHerramienta, this.jScrollPanelDatosEdicionHerramienta, this.jPanelAccionesHerramienta,this.jPanelAccionesFormularioHerramienta,this.jmenuBarHerramienta,this.jmenuBarDetalleHerramienta,this.jTtoolBarHerramienta,this.jTtoolBarDetalleHerramienta);		
		
		final JTabbedPane jTabbedPaneBusquedasHerramienta=this.jTabbedPaneBusquedasHerramienta; 
		
		final JPanel jPanelParametrosReportesHerramienta=this.jPanelParametrosReportesHerramienta;
		//final JScrollPane jScrollPanelDatosHerramienta=this.jScrollPanelDatosHerramienta;
		final JTable jTableDatosHerramienta=this.jTableDatosHerramienta;		
		final JPanel jPanelPaginacionHerramienta=this.jPanelPaginacionHerramienta;
		//final JScrollPane jScrollPanelDatosEdicionHerramienta=this.jScrollPanelDatosEdicionHerramienta;
		final JPanel jPanelAccionesHerramienta=this.jPanelAccionesHerramienta;
		
		JPanel jPanelCamposAuxiliarHerramienta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHerramienta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
			jPanelCamposAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jPanelCamposHerramienta;
			jPanelAccionesFormularioAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jPanelAccionesFormularioHerramienta;
		}
		
		final JPanel jPanelCamposHerramienta=jPanelCamposAuxiliarHerramienta;
		final JPanel jPanelAccionesFormularioHerramienta=jPanelAccionesFormularioAuxiliarHerramienta;
		
		
		final JMenuBar jmenuBarHerramienta=this.jmenuBarHerramienta;
		final JToolBar jTtoolBarHerramienta=this.jTtoolBarHerramienta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHerramienta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHerramienta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
			jmenuBarDetalleAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jmenuBarDetalleHerramienta;
			jTtoolBarDetalleAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jTtoolBarDetalleHerramienta;
		}
		
		final JMenuBar jmenuBarDetalleHerramienta=jmenuBarDetalleAuxiliarHerramienta;
		final JToolBar jTtoolBarDetalleHerramienta=jTtoolBarDetalleAuxiliarHerramienta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHerramienta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHerramienta;
			processRunnable.jTableDatos=jTableDatosHerramienta;
			processRunnable.jPanelCampos=jPanelCamposHerramienta;
			processRunnable.jPanelPaginacion=jPanelPaginacionHerramienta;
			processRunnable.jPanelAcciones=jPanelAccionesHerramienta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHerramienta;
			
			
			processRunnable.jmenuBar=jmenuBarHerramienta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHerramienta;
			processRunnable.jTtoolBar=jTtoolBarHerramienta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHerramienta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHerramienta ,jPanelParametrosReportesHerramienta,jTableDatosHerramienta, /*jScrollPanelDatosHerramienta,*/jPanelCamposHerramienta,jPanelPaginacionHerramienta, /*jScrollPanelDatosEdicionHerramienta,*/ jPanelAccionesHerramienta,jPanelAccionesFormularioHerramienta,jmenuBarHerramienta,jmenuBarDetalleHerramienta,jTtoolBarHerramienta,jTtoolBarDetalleHerramienta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHerramienta ,jPanelParametrosReportesHerramienta, jScrollPanelDatosHerramienta,jPanelPaginacionHerramienta, jScrollPanelDatosEdicionHerramienta, jPanelAccionesHerramienta,jPanelAccionesFormularioHerramienta,jmenuBarHerramienta,jmenuBarDetalleHerramienta,jTtoolBarHerramienta,jTtoolBarDetalleHerramienta);
						
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
	
	public void finishProcessHerramienta() {// throws Exception 
		this.finishProcessHerramienta(true);
	}
	
	public void finishProcessHerramienta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHerramienta ,this.jPanelParametrosReportesHerramienta, this.jScrollPanelDatosHerramienta,this.jPanelPaginacionHerramienta, this.jScrollPanelDatosEdicionHerramienta, this.jPanelAccionesHerramienta,this.jPanelAccionesFormularioHerramienta,this.jmenuBarHerramienta,this.jmenuBarDetalleHerramienta,this.jTtoolBarHerramienta,this.jTtoolBarDetalleHerramienta);		
		
		final JTabbedPane jTabbedPaneBusquedasHerramienta=this.jTabbedPaneBusquedasHerramienta; 
		
		final JPanel jPanelParametrosReportesHerramienta=this.jPanelParametrosReportesHerramienta;
		//final JScrollPane jScrollPanelDatosHerramienta=this.jScrollPanelDatosHerramienta;
		final JTable jTableDatosHerramienta=this.jTableDatosHerramienta;		
		final JPanel jPanelPaginacionHerramienta=this.jPanelPaginacionHerramienta;
		//final JScrollPane jScrollPanelDatosEdicionHerramienta=this.jScrollPanelDatosEdicionHerramienta;
		final JPanel jPanelAccionesHerramienta=this.jPanelAccionesHerramienta;
		
		JPanel jPanelCamposAuxiliarHerramienta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHerramienta=new JPanel();
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
			jPanelCamposAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jPanelCamposHerramienta;
			jPanelAccionesFormularioAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jPanelAccionesFormularioHerramienta;
		}
		
		final JPanel jPanelCamposHerramienta=jPanelCamposAuxiliarHerramienta;
		final JPanel jPanelAccionesFormularioHerramienta=jPanelAccionesFormularioAuxiliarHerramienta;
		
		
		final JMenuBar jmenuBarHerramienta=this.jmenuBarHerramienta;		
		final JToolBar jTtoolBarHerramienta=this.jTtoolBarHerramienta;
				
		JMenuBar jmenuBarDetalleAuxiliarHerramienta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHerramienta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
			jmenuBarDetalleAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jmenuBarDetalleHerramienta;
			jTtoolBarDetalleAuxiliarHerramienta=this.jInternalFrameDetalleFormHerramienta.jTtoolBarDetalleHerramienta;		
		}
		
		final JMenuBar jmenuBarDetalleHerramienta=jmenuBarDetalleAuxiliarHerramienta;
		final JToolBar jTtoolBarDetalleHerramienta=jTtoolBarDetalleAuxiliarHerramienta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHerramienta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHerramienta;
			processRunnable.jTableDatos=jTableDatosHerramienta;
			processRunnable.jPanelCampos=jPanelCamposHerramienta;
			processRunnable.jPanelPaginacion=jPanelPaginacionHerramienta;
			processRunnable.jPanelAcciones=jPanelAccionesHerramienta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHerramienta;
			
			
			processRunnable.jmenuBar=jmenuBarHerramienta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHerramienta;
			processRunnable.jTtoolBar=jTtoolBarHerramienta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHerramienta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHerramienta ,jPanelParametrosReportesHerramienta, jTableDatosHerramienta,/*jScrollPanelDatosHerramienta,*/jPanelCamposHerramienta,jPanelPaginacionHerramienta, /*jScrollPanelDatosEdicionHerramienta,*/ jPanelAccionesHerramienta,jPanelAccionesFormularioHerramienta,jmenuBarHerramienta,jmenuBarDetalleHerramienta,jTtoolBarHerramienta,jTtoolBarDetalleHerramienta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHerramienta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHerramienta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHerramienta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHerramienta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHerramienta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHerramienta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHerramienta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHerramienta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHerramienta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.herramientaConstantesFunciones.getsFinalQueryHerramienta();
		String  finalQueryPaginacionTodos=this.herramientaConstantesFunciones.getsFinalQueryHerramienta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HerramientaConstantesFunciones.getArrayColumnasGlobalesNoHerramienta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HerramientaConstantesFunciones.getArrayColumnasGlobalesHerramienta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HerramientaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.herramientasEliminados= new ArrayList<Herramienta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHerramienta();
		
				///*HerramientaSessionBean*/this.herramientaSessionBean=new HerramientaSessionBean();
			
			if(this.herramientaSessionBean==null) {
				this.herramientaSessionBean=new HerramientaSessionBean();
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
					this.iNumeroPaginacion=HerramientaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HerramientaConstantesFunciones.getClassesForeignKeysOfHerramienta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/herramienta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			herramientasAux= new ArrayList<Herramienta>();
			
				
			herramientaLogic.setDatosCliente(this.datosCliente);
			herramientaLogic.setDatosDeep(this.datosDeep);
			herramientaLogic.setIsConDeep(true);
			
			
			herramientaLogic.getHerramientaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					herramientaLogic.getTodosHerramientas(finalQueryGlobal,pagination);
					
					//herramientaLogic.getTodosHerramientasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(herramientaLogic.getHerramientas()==null|| herramientaLogic.getHerramientas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							herramientasAux= new ArrayList<Herramienta>();
							herramientasAux.addAll(herramientaLogic.getHerramientas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							herramientasAux= new ArrayList<Herramienta>();
							herramientasAux.addAll(herramientas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							herramientaLogic.getTodosHerramientas(finalQueryGlobal+"",this.pagination);												
							
							//herramientaLogic.getTodosHerramientasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHerramientas("Todos",herramientaLogic.getHerramientas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							herramientaLogic.setHerramientas(new ArrayList<Herramienta>());					
							herramientaLogic.getHerramientas().addAll(herramientasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							herramientas=new ArrayList<Herramienta>();
							herramientas.addAll(herramientasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHerramienta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHerramienta=this.idActual;
				
				} else if(this.idHerramientaActual!=null && this.idHerramientaActual!=0L) {
					idHerramienta=idHerramientaActual;
				}
				
					
				this.sDetalleReporte=HerramientaConstantesFunciones.getDetalleIndicePorId(idHerramienta);
				
				this.herramientas=new ArrayList<Herramienta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					herramientaLogic.getEntity(idHerramienta);
					
					//herramientaLogic.getEntityWithConnection(idHerramienta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					herramientaLogic.setHerramientas(new ArrayList<Herramienta>());
					herramientaLogic.getHerramientas().add(herramientaLogic.getHerramienta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.herramientas=new ArrayList<Herramienta>();
					this.herramientas.add(herramienta);
				}
				
				if(herramientaLogic.getHerramienta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=HerramientaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					herramientaLogic.getHerramientasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HerramientaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HerramientaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=herramientaLogic.getHerramientas()==null||herramientaLogic.getHerramientas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=herramientas==null|| herramientas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						herramientasAux=new ArrayList<Herramienta>();
						herramientasAux.addAll(herramientaLogic.getHerramientas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							herramientasAux=new ArrayList<Herramienta>();
							herramientasAux.addAll(herramientas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							herramientaLogic.getHerramientasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HerramientaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HerramientaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHerramientas("FK_IdEmpresa",herramientaLogic.getHerramientas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHerramientas("FK_IdEmpresa",herramientas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						herramientaLogic.setHerramientas(new ArrayList<Herramienta>());
						herramientaLogic.getHerramientas().addAll(herramientasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							herramientas=new ArrayList<Herramienta>();
							herramientas.addAll(herramientasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHerramienta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHerramienta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=herramientaLogic.getHerramientas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=herramientas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=herramientaLogic.getHerramientas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=herramientas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Herramienta herramienta) {
		Boolean permite=true;
		
		if(this.herramienta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HerramientaConstantesFunciones.getOrderByListaHerramienta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HerramientaConstantesFunciones.getOrderByListaHerramienta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Herramienta herramienta:herramientaLogic.getHerramientas()) {
				if(herramienta.getsType().equals(Constantes2.S_TOTALES)) {
					herramientaTotales=herramienta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Herramienta herramienta:this.herramientas) {
				if(herramienta.getsType().equals(Constantes2.S_TOTALES)) {
					herramientaTotales=herramienta;
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
			this.herramientaAux=new Herramienta();
			this.herramientaAux.setsType(Constantes2.S_TOTALES);
			this.herramientaAux.setIsNew(false);
			this.herramientaAux.setIsChanged(false);
			this.herramientaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HerramientaConstantesFunciones.TotalizarValoresFilaHerramienta(this.herramientaLogic.getHerramientas(),this.herramientaAux);
				
				this.herramientaLogic.getHerramientas().add(this.herramientaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HerramientaConstantesFunciones.TotalizarValoresFilaHerramienta(this.herramientas,this.herramientaAux);
				
				this.herramientas.add(this.herramientaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		herramientaTotales=new Herramienta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.herramientaLogic.getHerramientas().remove(herramientaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.herramientas.remove(herramientaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		herramientaTotales=new Herramienta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Herramienta herramienta:herramientaLogic.getHerramientas()) {
				if(herramienta.getsType().equals(Constantes2.S_TOTALES)) {
					herramientaTotales=herramienta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HerramientaConstantesFunciones.TotalizarValoresFilaHerramienta(this.herramientaLogic.getHerramientas(),herramientaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Herramienta herramienta:this.herramientas) {
				if(herramienta.getsType().equals(Constantes2.S_TOTALES)) {
					herramientaTotales=herramienta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HerramientaConstantesFunciones.TotalizarValoresFilaHerramienta(this.herramientas,herramientaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHerramientasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHerramientasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					herramientaLogic.getHerramientasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosHerramienta() {
		this.isPermisoTodoHerramienta=false;
		this.isPermisoNuevoHerramienta=false;
		this.isPermisoActualizarHerramienta=false;
		this.isPermisoActualizarOriginalHerramienta=false;
		this.isPermisoEliminarHerramienta=false;
		this.isPermisoGuardarCambiosHerramienta=false;
		this.isPermisoConsultaHerramienta=false;
		this.isPermisoBusquedaHerramienta=false;
		this.isPermisoReporteHerramienta=false;		
		this.isPermisoOrdenHerramienta=false;		
		this.isPermisoPaginacionMedioHerramienta=false;		
		this.isPermisoPaginacionAltoHerramienta=false;
		this.isPermisoPaginacionTodoHerramienta=false;
		this.isPermisoCopiarHerramienta=false;		
		this.isPermisoVerFormHerramienta=false;		
		this.isPermisoDuplicarHerramienta=false;		
		this.isPermisoOrdenHerramienta=false;		
	}
	
	public void setPermisosUsuarioHerramienta(Boolean isPermiso) {
		this.isPermisoTodoHerramienta=isPermiso;
		this.isPermisoNuevoHerramienta=isPermiso;
		this.isPermisoActualizarHerramienta=isPermiso;
		this.isPermisoActualizarOriginalHerramienta=isPermiso;
		this.isPermisoEliminarHerramienta=isPermiso;
		this.isPermisoGuardarCambiosHerramienta=isPermiso;
		this.isPermisoConsultaHerramienta=isPermiso;
		this.isPermisoBusquedaHerramienta=isPermiso;
		this.isPermisoReporteHerramienta=isPermiso;
		this.isPermisoOrdenHerramienta=isPermiso;		
		this.isPermisoPaginacionMedioHerramienta=isPermiso;		
		this.isPermisoPaginacionAltoHerramienta=isPermiso;		
		this.isPermisoPaginacionTodoHerramienta=isPermiso;		
		this.isPermisoCopiarHerramienta=isPermiso;		
		this.isPermisoVerFormHerramienta=isPermiso;		
		this.isPermisoDuplicarHerramienta=isPermiso;
		this.isPermisoOrdenHerramienta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHerramienta(Boolean isPermiso) {
		//this.isPermisoTodoHerramienta=isPermiso;
		this.isPermisoNuevoHerramienta=isPermiso;
		this.isPermisoActualizarHerramienta=isPermiso;
		this.isPermisoActualizarOriginalHerramienta=isPermiso;
		this.isPermisoEliminarHerramienta=isPermiso;
		this.isPermisoGuardarCambiosHerramienta=isPermiso;
		//this.isPermisoConsultaHerramienta=isPermiso;
		//this.isPermisoBusquedaHerramienta=isPermiso;
		//this.isPermisoReporteHerramienta=isPermiso;
		//this.isPermisoOrdenHerramienta=isPermiso;		
		//this.isPermisoPaginacionMedioHerramienta=isPermiso;		
		//this.isPermisoPaginacionAltoHerramienta=isPermiso;		
		//this.isPermisoPaginacionTodoHerramienta=isPermiso;		
		//this.isPermisoCopiarHerramienta=isPermiso;		
		//this.isPermisoDuplicarHerramienta=isPermiso;
		//this.isPermisoOrdenHerramienta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHerramientaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(EmpleadoHerraConstantesFunciones.SNOMBREOPCION);
		
		if(HerramientaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosEmpleadoHerra=false;
		this.isTienePermisosEmpleadoHerra=this.verificarGetPermisosUsuarioOpcionHerramientaClaseRelacionada(this.opcionsRelacionadas,EmpleadoHerraConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebHerramienta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHerramientaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosEmpleadoHerra=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioHerramientaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHerramientaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHerramientaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosEmpleadoHerra && this.jInternalFrameDetalleFormHerramienta!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.remove(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioHerramienta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HerramientaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.herramientaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HerramientaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHerramienta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHerramienta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHerramienta=this.isPermisoActualizarHerramienta;
			this.isPermisoEliminarHerramienta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHerramienta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHerramienta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHerramienta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHerramienta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHerramienta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHerramienta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHerramienta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHerramienta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHerramienta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHerramienta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHerramienta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHerramienta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHerramienta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.herramientaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHerramienta.setToolTipText(this.jTableDatosHerramienta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHerramienta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHerramienta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HerramientaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HerramientaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHerramienta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosEmpleadoHerra && this.herramientaConstantesFunciones.mostrarEmpleadoHerraHerramienta && !HerramientaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado Herra");
			reporte.setsDescripcion("Empleado Herra");
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
	public void inicializarCombosForeignKeyHerramientaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHerramientaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HerramientaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHerramientaListas(false);
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
	
	public void cargarCombosLoteForeignKeyHerramientaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HerramientaParameterReturnGeneral herramientaReturnGeneral=new HerramientaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.herramientaConstantesFunciones.cargarid_empresaHerramienta)
					 || (this.esRecargarFks && this.herramientaConstantesFunciones.cargarid_empresaHerramienta)) {

					if(!this.herramientaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+herramientaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				herramientaReturnGeneral=herramientaLogic.cargarCombosLoteForeignKeyHerramienta(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=herramientaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHerramienta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.herramientaSessionBean==null) {
				this.herramientaSessionBean=new HerramientaSessionBean();
			}

			if(!this.herramientaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyHerramienta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHerramienta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHerramienta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHerramienta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHerramienta(Herramienta herramienta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHerramienta(Herramienta herramienta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHerramienta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHerramienta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHerramienta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHerramienta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHerramienta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHerramienta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHerramienta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHerramienta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta!=null && this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.getItemCount()>0) {
				this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public HerramientaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HerramientaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HerramientaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.herramientaSessionBean=new HerramientaSessionBean(); 
		this.herramientaConstantesFunciones=new HerramientaConstantesFunciones(); 
		this.herramientaBean=new Herramienta();//(this.herramientaConstantesFunciones); 		
		this.herramientaReturnGeneral=new HerramientaParameterReturnGeneral(); 
		
		this.herramientaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.herramientaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HerramientaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HerramientaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HerramientaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHerramienta(true);
			
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
			
			this.herramientaConstantesFunciones=new HerramientaConstantesFunciones(); 
			this.herramientaBean=new Herramienta();//this.herramientaConstantesFunciones); 			
			this.herramientaReturnGeneral=new HerramientaParameterReturnGeneral(); 
		
			HerramientaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Herramienta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.herramienta=new Herramienta();
			this.herramientas = new ArrayList<Herramienta>();
			this.herramientasAux = new ArrayList<Herramienta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic=new HerramientaLogic();
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			//this.herramientaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.herramientaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHerramienta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHerramienta);	
					}
					
					if(this.jInternalFrameImportacionHerramienta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHerramienta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHerramienta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHerramienta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHerramienta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHerramienta);
				this.jInternalFrameDetalleFormHerramienta.setVisible(false);
				this.jInternalFrameDetalleFormHerramienta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHerramienta);
					this.jInternalFrameReporteDinamicoHerramienta.setVisible(false);
					this.jInternalFrameReporteDinamicoHerramienta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHerramienta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHerramienta);
					this.jInternalFrameImportacionHerramienta.setVisible(false);
					this.jInternalFrameImportacionHerramienta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHerramienta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHerramienta);
					this.jInternalFrameOrderByHerramienta.setVisible(false);
					this.jInternalFrameOrderByHerramienta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHerramientaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HerramientaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.herramientaReturnGeneral=new HerramientaParameterReturnGeneral();
			
			this.herramientaParameterGeneral=new HerramientaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.herramientaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(HerramientaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.herramientaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(EmpleadoHerraConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HerramientaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.herramientaSessionBean.getEsGuardarRelacionado(),this.herramientaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HerramientaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.herramientaSessionBean.getEsGuardarRelacionado(),this.herramientaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHerramienta=false;
			this.isVisibilidadCeldaDuplicarHerramienta=true;
			this.isVisibilidadCeldaCopiarHerramienta=true;
			this.isVisibilidadCeldaVerFormHerramienta=true;
			this.isVisibilidadCeldaOrdenHerramienta=true;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
			this.isVisibilidadCeldaModificarHerramienta=false;
			this.isVisibilidadCeldaActualizarHerramienta=false;
			this.isVisibilidadCeldaEliminarHerramienta=false;
			this.isVisibilidadCeldaCancelarHerramienta=false;
			this.isVisibilidadCeldaGuardarHerramienta=false;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHerramienta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHerramienta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHerramienta(false);
			
			this.setPermisosUsuarioHerramienta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.herramientaSessionBean.getEsGuardarRelacionado() 
				|| (this.herramientaSessionBean.getEsGuardarRelacionado() && this.herramientaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHerramientaClasesRelacionadas();
			}
			
			if(this.herramientaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHerramientaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HerramientaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHerramienta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHerramienta();
			}
			
			if(!this.isPermisoBusquedaHerramienta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHerramienta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHerramienta,this.isPermisoPaginacionMedioHerramienta,this.isPermisoPaginacionTodoHerramienta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HerramientaConstantesFunciones.getTiposSeleccionarHerramienta());
				
				this.tiposColumnasSelect=HerramientaConstantesFunciones.getTiposSeleccionarHerramienta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectHerramienta();				
				//this.tiposRelacionesSelect=HerramientaConstantesFunciones.getTiposRelacionesHerramienta(true);
				
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
			//if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHerramienta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioHerramienta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioHerramienta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHerramienta() ;
			
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
			
			
			this.empleadoherraLogic=new EmpleadoHerraLogic(); 
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
				herramientaImplementable= (HerramientaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HerramientaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				herramientaImplementableHome= (HerramientaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HerramientaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.herramientas= new ArrayList<Herramienta>();
			this.herramientasEliminados= new ArrayList<Herramienta>();
						
			this.isEsNuevoHerramienta=false;
			this.esParaAccionDesdeFormularioHerramienta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHerramienta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHerramienta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HerramientaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HerramientaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHerramienta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHerramienta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHerramienta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHerramienta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHerramienta();
			}
			
			HerramientaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHerramienta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHerramienta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHerramienta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHerramienta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Herramienta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHerramienta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHerramienta")) {
				iIndex=this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();	
				
				

				if(sTitle.equals("Empleado Herras")) {
					if(!EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessHerramienta();

						this.cargarParteTabPanelRelacionadaEmpleadoHerra(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHerramienta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaEmpleadoHerra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormHerramienta.cargarSessionConBeanSwingJInternalFrameEmpleadoHerra(false,true,iIndex);
		this.jButtonEmpleadoHerraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleadoHerra();

		//this.jTabbedPaneRelacionesHerramienta.updateUI();
		//this.jTabbedPaneRelacionesHerramienta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesHerramienta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("EmpleadoHerra")) {
				int row=this.jTableDatosHerramienta.getSelectedRow();
				jButtonEmpleadoHerraActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Empleado Herra")) {

					if(this.isTienePermisosEmpleadoHerra && this.herramientaConstantesFunciones.mostrarEmpleadoHerraHerramienta && !HerramientaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleado Herras"+"("+EmpleadoHerraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleado Herras");

						if(herramientaConstantesFunciones.resaltarEmpleadoHerraHerramienta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(herramientaConstantesFunciones.resaltarEmpleadoHerraHerramienta);
						}

						jmenuItem.setEnabled(this.herramientaConstantesFunciones.activarEmpleadoHerraHerramienta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EmpleadoHerra"));

						

						this.jInternalFrameDetalleFormHerramienta.jmenuDetalleHerramienta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyHerramienta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHerramienta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHerramienta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHerramientaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHerramienta();
		
		this.cargarCombosFrameForeignKeyHerramienta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHerramienta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHerramienta();
		}
	}
	
	
	
	public void jButtonNuevoHerramientaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.herramientaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
			
			if(jTableDatosHerramienta.getRowCount()>=1) {
				jTableDatosHerramienta.removeRowSelectionInterval(0, jTableDatosHerramienta.getRowCount()-1);						
			}
			
			this.isEsNuevoHerramienta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHerramienta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHerramienta(true);			
			//this.herramienta=new Herramienta();
			//this.herramienta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHerramienta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHerramienta() ;
			
			if(HerramientaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHerramienta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.herramienta);	
			this.actualizarInformacion("INFO_PADRE",false,this.herramienta);				
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
			if(this.herramientaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Herramienta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHerramientaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHerramienta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHerramienta.getSelectedRows().length;			
			}
			
			herramientasSeleccionados=this.getHerramientasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHerramienta--;			
				//Herramienta herramientaAux= new Herramienta();			
				//herramientaAux.setId(this.iIdNuevoHerramienta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Herramienta herramientaOrigen=new Herramienta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Herramienta herramientaOrigen : herramientasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							herramientaOrigen =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							herramientaOrigen =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHerramienta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.herramienta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHerramienta(herramientaOrigen,this.herramienta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.herramientaLogic.getHerramientas().add(this.herramientaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.herramientas.add(this.herramientaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHerramienta(false);
				
				this.jTableDatosHerramienta.setRowSelectionInterval(this.getIndiceNuevoHerramienta(), this.getIndiceNuevoHerramienta());
				
				int iLastRow =  this.jTableDatosHerramienta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHerramienta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHerramienta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHerramienta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();									
		
			Herramienta herramientaOrigen=new Herramienta();
			Herramienta herramientaDestino=new Herramienta();
				
			herramientasSeleccionados=this.getHerramientasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHerramienta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || herramientasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHerramienta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						herramientaOrigen =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						herramientaOrigen =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						herramientaDestino =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						herramientaDestino =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				herramientaOrigen =herramientasSeleccionados.get(0);
				herramientaDestino =herramientasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHerramienta(herramientaOrigen,herramientaDestino,true,false);
				
				herramientaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(herramientaDestino,herramientaLogic.getHerramientas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(herramientaDestino,herramientas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHerramienta(false);
				
				//this.jTableDatosHerramienta.setRowSelectionInterval(this.getIndiceNuevoHerramienta(), this.getIndiceNuevoHerramienta());
				
				int iLastRow =  this.jTableDatosHerramienta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHerramienta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHerramienta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHerramienta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHerramienta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHerramienta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHerramienta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHerramienta.setVisible(!isVisible);
			this.jPanelPaginacionHerramienta.setVisible(!isVisible);
			this.jPanelAccionesHerramienta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHerramienta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHerramienta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHerramienta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHerramienta();
			
			this.abrirFrameOrderByHerramienta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHerramienta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHerramienta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHerramienta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHerramienta.isMaximum()) {
					this.jInternalFrameDetalleFormHerramienta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHerramienta.setSize(this.jInternalFrameDetalleFormHerramienta.iWidthFormulario,this.jInternalFrameDetalleFormHerramienta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHerramienta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHerramienta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHerramienta.isMaximum()) {
						this.jInternalFrameDetalleFormHerramienta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHerramienta.jContentPaneDetalleHerramienta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHerramienta.jContentPaneDetalleHerramienta.getWidth(),HerramientaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHerramienta.jContentPaneDetalleHerramienta.getWidth(),HerramientaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHerramienta.jContentPaneDetalleHerramienta.getWidth(),HerramientaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleadoHerra();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHerramienta.setVisible(true);
	        this.jInternalFrameDetalleFormHerramienta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHerramienta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHerramienta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHerramienta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHerramienta,false,this);
				} else {
					this.jInternalFrameOrderByHerramienta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHerramienta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHerramienta);
				this.jInternalFrameOrderByHerramienta.setVisible(false);
				this.jInternalFrameOrderByHerramienta.setSelected(false);
				
				this.jInternalFrameOrderByHerramienta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHerramienta"));
				
				this.inicializarActualizarBindingTablaOrderByHerramienta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHerramienta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHerramienta==null) {
				
				this.jInternalFrameImportacionHerramienta=new ImportacionJInternalFrame(HerramientaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHerramienta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHerramienta);
				this.jInternalFrameImportacionHerramienta.setVisible(false);
				this.jInternalFrameImportacionHerramienta.setSelected(false);


				this.jInternalFrameImportacionHerramienta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHerramienta"));
				this.jInternalFrameImportacionHerramienta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHerramienta"));
				this.jInternalFrameImportacionHerramienta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHerramienta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHerramienta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHerramienta==null) {
				this.jInternalFrameReporteDinamicoHerramienta=new ReporteDinamicoJInternalFrame(HerramientaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHerramienta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHerramienta);
				this.jInternalFrameReporteDinamicoHerramienta.setVisible(false);
				this.jInternalFrameReporteDinamicoHerramienta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHerramienta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHerramienta"));
				this.jInternalFrameReporteDinamicoHerramienta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHerramienta"));
				this.jInternalFrameReporteDinamicoHerramienta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHerramienta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHerramienta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaEmpleadoHerra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHerra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormHerramienta.jContentPaneDetalleHerramienta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHerra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHerra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHerra.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleHerramienta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHerramienta);
			
	       	this.jInternalFrameDetalleFormHerramienta.setVisible(false);
	        this.jInternalFrameDetalleFormHerramienta.setSelected(false);
			
			//this.jInternalFrameDetalleFormHerramienta.dispose();
			//this.jInternalFrameDetalleFormHerramienta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHerramienta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHerramienta.setVisible(true);
	        this.jInternalFrameReporteDinamicoHerramienta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHerramienta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHerramienta.setVisible(true);
	        this.jInternalFrameImportacionHerramienta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHerramienta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHerramienta.setVisible(true);
	        this.jInternalFrameOrderByHerramienta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHerramienta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHerramienta.setVisible(false);
	        this.jInternalFrameOrderByHerramienta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHerramienta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHerramienta.setVisible(false);
	        this.jInternalFrameReporteDinamicoHerramienta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHerramienta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHerramienta.setVisible(false);
	        this.jInternalFrameImportacionHerramienta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHerramienta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHerramienta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHerramienta(true);
			//this.isEsNuevoHerramienta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHerramienta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHerramienta(false) ;
			
			if(herramientaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.getEsGuardarRelacionado() && EmpleadoHerraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoHerraActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(HerramientaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHerramienta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHerramienta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHerramientaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHerramienta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHerramienta(true);
			//this.isEsNuevoHerramienta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.herramienta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHerramienta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHerramienta(false) ;
			
			if(HerramientaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHerramienta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHerramienta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHerramienta(false);
			
			//if(!this.isEsNuevoHerramienta) {								
				int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
				
			}
			
			if(this.permiteMantenimiento(this.herramienta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.herramientaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHerramienta=true;
					this.inicializarActualizarBindingTablaHerramienta(false);
					this.isEsNuevoHerramienta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHerramienta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHerramienta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHerramienta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHerramienta(false);
				
				this.habilitarDeshabilitarControlesHerramienta(false);
			
												
				
				if(HerramientaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHerramienta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHerramientaActionPerformed(evt,herramientaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHerramienta(this.herramienta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHerramienta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,herramientaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.herramienta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHerramientaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				this.herramienta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				this.herramienta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.herramienta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.herramientaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HerramientaModel) this.jTableDatosHerramienta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHerramienta=true;
				this.inicializarActualizarBindingTablaHerramienta(false);
				this.isEsNuevoHerramienta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHerramienta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHerramienta(false);
				
				this.habilitarDeshabilitarControlesHerramienta(false);
				
				
				
				if(HerramientaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHerramienta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHerramientaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHerramienta.getRowCount()>=1) {
				jTableDatosHerramienta.removeRowSelectionInterval(0, jTableDatosHerramienta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHerramienta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHerramienta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHerramienta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHerramienta(false) ;
			
			this.isEsNuevoHerramienta=false;
			
			if(HerramientaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHerramienta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHerramientaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHerramienta(false);
				
				//SI ES MANUAL
				if(HerramientaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHerramienta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHerramientaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHerramienta--;			
			//Herramienta herramientaAux= new Herramienta();			
			//herramientaAux.setId(this.iIdNuevoHerramienta);
			
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHerramienta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
			
			this.herramienta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.herramientaLogic.getHerramientas().add(this.herramientaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.herramientas.add(this.herramientaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHerramienta(false);
			
			this.jTableDatosHerramienta.setRowSelectionInterval(this.getIndiceNuevoHerramienta(), this.getIndiceNuevoHerramienta());
			
			int iLastRow =  this.jTableDatosHerramienta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHerramienta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHerramienta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHerramienta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHerramientaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHerramienta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHerramienta(false);
			
			//SI ES MANUAL
			if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHerramienta();
			}
			
			//this.abrirFrameTreeHerramienta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHerramientaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE HerramientaS ?", "MANTENIMIENTO DE Herramienta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHerramienta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHerramienta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.herramientaReturnGeneral=herramientaLogic.procesarImportacionHerramientasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.herramientaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHerramientaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHerramientaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHerramienta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHerramienta.setFileImportacion(this.jInternalFrameImportacionHerramienta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHerramienta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHerramienta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHerramienta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHerramienta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHerramientaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		

		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HerramientaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HerramientaBaseDesign.jrxml";
			
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
			
			this.generarReporteHerramientas("Todos",herramientasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HerramientaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HerramientaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HerramientaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoHerramienta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HerramientaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case HerramientaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case HerramientaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HerramientaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case HerramientaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case HerramientaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HerramientaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case HerramientaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case HerramientaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoHerramientaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"herramienta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Herramientas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HerramientaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HerramientaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Herramienta herramienta:herramientasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(herramienta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HerramientaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HerramientaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Herramienta herramienta:herramientasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(herramienta.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HerramientaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HerramientaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Herramienta herramienta:herramientasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(herramienta.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelHerramienta(row);				
			//	iRow++;
			//}				
			
			//for(Herramienta herramientaAux:herramientasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHerramienta(herramientaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
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
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHerramienta(false);
			
			//SI ES MANUAL
			if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHerramienta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHerramientaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHerramienta(false);
			
			//SI ES MANUAL
			if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHerramienta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHerramientaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHerramienta(false);
			
			//SI ES MANUAL
			if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHerramienta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHerramienta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHerramienta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHerramienta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHerramienta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHerramienta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHerramienta.setMinimumSize(dimensionMinimum);
		this.jTableDatosHerramienta.setMaximumSize(dimensionMaximum);
		this.jTableDatosHerramienta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHerramienta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHerramienta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHerramienta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHerramienta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHerramienta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHerramienta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHerramienta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHerramienta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HerramientaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHerramienta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHerramienta();
		
		this.inicializarActualizarBindingBotonesManualHerramienta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHerramienta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHerramienta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHerramienta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHerramienta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHerramienta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHerramienta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHerramienta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHerramienta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHerramienta.jCheckBoxPostAccionNuevoHerramienta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHerramienta.jCheckBoxPostAccionSinCerrarHerramienta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHerramienta.jCheckBoxPostAccionSinMensajeHerramienta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHerramienta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHerramienta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHerramienta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHerramienta!=null) {
				this.jInternalFrameDetalleFormHerramienta.jCheckBoxPostAccionNuevoHerramienta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHerramienta.jCheckBoxPostAccionSinCerrarHerramienta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHerramienta.jCheckBoxPostAccionSinMensajeHerramienta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHerramienta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHerramienta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHerramienta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHerramienta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHerramienta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHerramienta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHerramienta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHerramienta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHerramienta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHerramienta(Boolean esInicializar) throws Exception {
		try	{	
			if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHerramienta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHerramienta() throws Exception {
		try	{
			if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHerramienta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHerramienta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHerramienta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHerramienta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHerramienta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHerramienta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHerramienta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHerramienta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHerramienta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHerramienta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHerramienta.addItem(reporte);
			}
			
			
			if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHerramienta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHerramienta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHerramienta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHerramienta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHerramienta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHerramienta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHerramienta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHerramienta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHerramienta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHerramienta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHerramienta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
				this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
				this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHerramienta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
				
				if(this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHerramienta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHerramienta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHerramienta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHerramienta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHerramienta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHerramienta(Boolean esInicializar) throws Exception {				
		if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHerramienta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHerramienta() throws Exception {
		this.inicializarActualizarBindingTablaHerramienta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHerramienta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHerramientaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHerramientaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHerramienta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=herramientaLogic.getHerramientas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=herramientas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHerramienta.setModel(new HerramientaModel(this.herramientaLogic.getHerramientas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHerramienta.setModel(new HerramientaModel(this.herramientas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHerramienta!=null && this.jInternalFrameOrderByHerramienta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHerramienta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHerramienta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHerramienta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HerramientaConstantesFunciones.SCLASSWEBTITULO,herramientaConstantesFunciones.resaltarSeleccionarHerramienta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HerramientaConstantesFunciones.SCLASSWEBTITULO,herramientaConstantesFunciones.resaltarSeleccionarHerramienta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHerramienta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHerramienta,HerramientaConstantesFunciones.LABEL_ID));

		if(this.herramientaConstantesFunciones.mostraridHerramienta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HerramientaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.herramientaConstantesFunciones.resaltaridHerramienta,this.herramientaConstantesFunciones.activaridHerramienta,this,true,"idHerramienta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.herramientaConstantesFunciones.resaltaridHerramienta,this.herramientaConstantesFunciones.activaridHerramienta,this,true,"idHerramienta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHerramienta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHerramienta,HerramientaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.herramientaConstantesFunciones.mostrarid_empresaHerramienta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HerramientaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.herramientaConstantesFunciones.resaltarid_empresaHerramienta,this,this.herramientaConstantesFunciones.activarid_empresaHerramienta));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.herramientaConstantesFunciones.resaltarid_empresaHerramienta,this,this.herramientaConstantesFunciones.activarid_empresaHerramienta,false,"id_empresaHerramienta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHerramienta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHerramienta,HerramientaConstantesFunciones.LABEL_NOMBRE));

		if(this.herramientaConstantesFunciones.mostrarnombreHerramienta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HerramientaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.herramientaConstantesFunciones.resaltarnombreHerramienta,this.herramientaConstantesFunciones.activarnombreHerramienta,this,true,"nombreHerramienta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.herramientaConstantesFunciones.resaltarnombreHerramienta,this.herramientaConstantesFunciones.activarnombreHerramienta,this,true,"nombreHerramienta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHerramienta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHerramienta,HerramientaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.herramientaConstantesFunciones.mostrardescripcionHerramienta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HerramientaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.herramientaConstantesFunciones.resaltardescripcionHerramienta,this.herramientaConstantesFunciones.activardescripcionHerramienta,this,true,"descripcionHerramienta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.herramientaConstantesFunciones.resaltardescripcionHerramienta,this.herramientaConstantesFunciones.activardescripcionHerramienta,this,true,"descripcionHerramienta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HerramientaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.herramientaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosEmpleadoHerra && this.herramientaConstantesFunciones.mostrarEmpleadoHerraHerramienta && !HerramientaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleado Herras");
				tableColumn.setHeaderValue("Empleado Herras");
				tableColumn.setCellRenderer(new EmpleadoHerraTableCell(herramientaConstantesFunciones.resaltarEmpleadoHerraHerramienta,this,this.herramientaConstantesFunciones.activarEmpleadoHerraHerramienta));
				tableColumn.setCellEditor(new EmpleadoHerraTableCell(herramientaConstantesFunciones.resaltarEmpleadoHerraHerramienta,this,this.herramientaConstantesFunciones.activarEmpleadoHerraHerramienta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosHerramienta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.herramientaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.herramientaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHerramienta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.herramientaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.herramientaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHerramienta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHerramienta && this.isPermisoGuardarCambiosHerramienta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.herramientaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.herramientaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHerramienta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.herramientaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosHerramienta.addColumn(tableColumn);
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
			
			this.jTableDatosHerramienta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHerramienta && this.isPermisoGuardarCambiosHerramienta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.herramientaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHerramienta && this.isPermisoGuardarCambiosHerramienta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHerramienta.moveColumn(this.jTableDatosHerramienta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHerramienta.moveColumn(this.jTableDatosHerramienta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.herramientaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosHerramienta.moveColumn(this.jTableDatosHerramienta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHerramienta.moveColumn(this.jTableDatosHerramienta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHerramienta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHerramienta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHerramienta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHerramienta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHerramienta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHerramienta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHerramienta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHerramienta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=herramientaLogic.getHerramientas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=herramientas.size()-1;
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
		//this.jTableDatosHerramienta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHerramienta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHerramienta();
			
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
				
				//this.isEsNuevoHerramienta=false;
					
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
				if(this.herramientaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHerramienta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHerramienta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHerramienta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.herramienta.getsType().equals("DUPLICADO")
				   || this.herramienta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHerramienta=true;
				
				} else {
					this.isEsNuevoHerramienta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.herramientaSessionBean.getEsGuardarRelacionado()) {
					if(this.herramienta.getId()>=0 && !this.herramienta.getIsNew()) {						
						this.isEsNuevoHerramienta=false;
						
					} else {
						this.isEsNuevoHerramienta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHerramienta(esRelaciones);						
				
				this.seleccionarHerramienta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.herramienta.getId()<0) {
					this.isEsNuevoHerramienta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHerramienta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHerramienta(evt,rowIndex);
				}	
				
				if(this.herramientaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Herramienta: " + this.dDif); 
					}
				}								
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHerramienta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.herramienta)) {
					if(this.herramienta.getId()>0) {
						this.herramienta.setIsDeleted(true);
						
						this.herramientasEliminados.add(this.herramienta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.herramientaLogic.getHerramientas().remove(this.herramienta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.herramientas.remove(this.herramienta);				
					}
					
					
					((HerramientaModel) this.jTableDatosHerramienta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHerramienta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHerramienta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHerramienta) {
			
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHerramienta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHerramienta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHerramienta(this.herramienta);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.herramientaConstantesFunciones.cargarid_empresaHerramienta || this.herramientaConstantesFunciones.event_dependid_empresaHerramienta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.herramienta.getid_empresa());
									//this.inicializarActualizarBindingHerramienta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(herramienta.getEmpresa()!=null) {
							this.empresasForeignKey.add(herramienta.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.herramienta.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHerramienta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHerramienta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHerramienta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHerramienta(Herramienta herramienta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHerramienta(herramienta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHerramienta(Herramienta herramienta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHerramienta(herramienta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHerramienta(herramienta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHerramienta(herramienta);
	}
	
	public void setVariablesObjetoActualToFormularioHerramienta(Herramienta herramienta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.setText(herramienta.getId().toString());
			this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.setText(herramienta.getnombre());
			this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.setText(herramienta.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Herramienta herramientaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,herramientaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Herramienta herramientaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				herramientaLocal=this.herramienta;
			} else {
				herramientaLocal=this.herramientaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(herramientaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHerramienta(herramientaLocal,true);
					
					if(herramientaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(herramientaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.herramientaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(herramientaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHerramienta(Herramienta herramienta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHerramienta(herramienta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(herramienta);
	}
	
	public void setVariablesFormularioToObjetoActualHerramienta(Herramienta herramienta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHerramienta(herramienta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHerramienta(Herramienta herramienta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.getText()==null || this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.getText()=="" || this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.getText()=="Id") {
				this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.setText("0");
			}

			if(conColumnasBase) {herramienta.setId(Long.parseLong(this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HerramientaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHerramienta.jLabelIdHerramienta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			herramienta.setnombre(this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HerramientaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHerramienta.jLabelnombreHerramienta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			herramienta.setdescripcion(this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HerramientaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHerramienta.jLabeldescripcionHerramienta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHerramienta(Herramienta herramientaBean,Herramienta herramienta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHerramienta(Herramienta herramientaOrigen,Herramienta herramienta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && herramientaOrigen.getId()!=null && !herramientaOrigen.getId().equals(0L))) {herramienta.setId(herramientaOrigen.getId());}}
			if(conDefault || (!conDefault && herramientaOrigen.getnombre()!=null && !herramientaOrigen.getnombre().equals(""))) {herramienta.setnombre(herramientaOrigen.getnombre());}
			if(conDefault || (!conDefault && herramientaOrigen.getdescripcion()!=null && !herramientaOrigen.getdescripcion().equals(""))) {herramienta.setdescripcion(herramientaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHerramienta(Herramienta herramienta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.setText(herramienta.getId().toString());
			this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.setText(herramienta.getnombre());
			this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.setText(herramienta.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHerramienta(HerramientaBean herramientaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.setText(herramientaBean.getId().toString());
			this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.setText(herramientaBean.getnombre());
			this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.setText(herramientaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHerramienta(HerramientaParameterReturnGeneral herramientaReturnGeneral,HerramientaBean herramientaBean,Boolean conDefault) throws Exception { 
		try {
			Herramienta herramientaLocal=new Herramienta();
			
			herramientaLocal=herramientaReturnGeneral.getHerramienta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && herramientaLocal.getId()!=null && !herramientaLocal.getId().equals(0L))) {herramientaBean.setId(herramientaLocal.getId());}}
			if(conDefault || (!conDefault && herramientaLocal.getnombre()!=null && !herramientaLocal.getnombre().equals(""))) {herramientaBean.setnombre(herramientaLocal.getnombre());}
			if(conDefault || (!conDefault && herramientaLocal.getdescripcion()!=null && !herramientaLocal.getdescripcion().equals(""))) {herramientaBean.setdescripcion(herramientaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHerramientaGenerico(Long idHerramientaSeleccionado,JComboBox jComboBoxHerramienta,List<Herramienta> herramientasLocal)throws Exception {
		try {
			Herramienta  herramientaTemp=null;

			for(Herramienta herramientaAux:herramientasLocal) {
				if(herramientaAux.getId()!=null && herramientaAux.getId().equals(idHerramientaSeleccionado)) {
					herramientaTemp=herramientaAux;
					break;
				}
			}

			jComboBoxHerramienta.setSelectedItem(herramientaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHerramientaGenerico(JComboBox jComboBoxHerramienta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHerramienta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHerramienta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHerramienta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHerramienta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHerramienta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHerramienta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("EmpleadoHerra")) {
			jButtonEmpleadoHerraActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			herramienta=(Herramienta) herramientaLogic.getHerramientas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			herramienta =(Herramienta) herramientas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!herramienta.getIsNew() && !herramienta.getIsChanged() && !herramienta.getIsDeleted()) {
				sDescripcion=herramienta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=herramienta.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Herramienta herramientaRow=new Herramienta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			herramientaRow=(Herramienta) herramientaLogic.getHerramientas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			herramientaRow=(Herramienta) herramientas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonEmpleadoHerraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Herramienta herramienta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormHerramienta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.herramienta = (Herramienta)this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.herramienta = (Herramienta)this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(herramienta!=null) {
						this.herramienta = herramienta;
					} else {
						this.herramienta = new Herramienta();
					}
				}

				if(this.isTienePermisosEmpleadoHerra && this.permiteMantenimiento(this.herramienta)) {
					EmpleadoHerraBeanSwingJInternalFrame empleadoherraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFramePopup=new EmpleadoHerraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoherraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFramePopup;
					} else {
						empleadoherraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame;
					}

					List<Herramienta> herramientas=new ArrayList<Herramienta>();
					herramientas.add(this.herramienta);
					if(!esRelacionado) {
						//empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setConGuardarRelaciones(false);
						//empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoherraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormHerramienta.cargarEmpleadoHerraBeanSwingJInternalFrame(herramientas,this.herramienta,empleadoherraBeanSwingJInternalFrame,/*conInicializar,*/empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.getConGuardarRelaciones(),empleadoherraBeanSwingJInternalFrame.empleadoherraSessionBean.getEsGuardarRelacionado());
					empleadoherraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoherraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoHerra("no_relacionado");

						empleadoherraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoHerraConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoHerraConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoherraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderHerramienta=(TitledBorder)this.jScrollPanelDatosHerramienta.getBorder();
						TitledBorder titledBorderEmpleadoHerra=(TitledBorder)empleadoherraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoHerra.getBorder();

						titledBorderEmpleadoHerra.setTitle(titledBorderHerramienta.getTitle() + " -> Empleado Herra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoherraBeanSwingJInternalFrame);
						}

						empleadoherraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoherraBeanSwingJInternalFrame);

						empleadoherraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.herramientaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado Herra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHerramienta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHerramienta.setVisible((this.isVisibilidadCeldaNuevoHerramienta && this.isPermisoNuevoHerramienta));			
			this.jButtonDuplicarHerramienta.setVisible((this.isVisibilidadCeldaDuplicarHerramienta && this.isPermisoDuplicarHerramienta));			
			this.jButtonCopiarHerramienta.setVisible((this.isVisibilidadCeldaCopiarHerramienta && this.isPermisoCopiarHerramienta));
			this.jButtonVerFormHerramienta.setVisible((this.isVisibilidadCeldaVerFormHerramienta && this.isPermisoVerFormHerramienta));
			
			this.jButtonAbrirOrderByHerramienta.setVisible((this.isVisibilidadCeldaOrdenHerramienta && this.isPermisoOrdenHerramienta));			
			
			this.jButtonNuevoRelacionesHerramienta.setVisible((this.isVisibilidadCeldaNuevoRelacionesHerramienta && this.isPermisoNuevoHerramienta));			
			this.jButtonNuevoGuardarCambiosHerramienta.setVisible((this.isVisibilidadCeldaNuevoHerramienta && this.isPermisoNuevoHerramienta && this.isPermisoGuardarCambiosHerramienta));
			
			if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.jInternalFrameDetalleFormHerramienta.jButtonModificarHerramienta.setVisible((this.isVisibilidadCeldaModificarHerramienta && this.isPermisoActualizarHerramienta));	
			this.jInternalFrameDetalleFormHerramienta.jButtonActualizarHerramienta.setVisible((this.isVisibilidadCeldaActualizarHerramienta && this.isPermisoActualizarHerramienta));	
			this.jInternalFrameDetalleFormHerramienta.jButtonEliminarHerramienta.setVisible((this.isVisibilidadCeldaEliminarHerramienta && this.isPermisoEliminarHerramienta));
			this.jInternalFrameDetalleFormHerramienta.jButtonCancelarHerramienta.setVisible(this.isVisibilidadCeldaCancelarHerramienta);							
			this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.setVisible((this.isVisibilidadCeldaGuardarHerramienta && this.isPermisoGuardarCambiosHerramienta));			
			
			}
						
			this.jButtonGuardarCambiosTablaHerramienta.setVisible((this.isVisibilidadCeldaGuardarCambiosHerramienta && this.isPermisoGuardarCambiosHerramienta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHerramienta.setVisible((this.isVisibilidadCeldaNuevoHerramienta && this.isPermisoNuevoHerramienta));						
			this.jButtonDuplicarToolBarHerramienta.setVisible((this.isVisibilidadCeldaDuplicarHerramienta && this.isPermisoDuplicarHerramienta));						
			this.jButtonCopiarToolBarHerramienta.setVisible((this.isVisibilidadCeldaCopiarHerramienta && this.isPermisoCopiarHerramienta));			
			this.jButtonVerFormToolBarHerramienta.setVisible((this.isVisibilidadCeldaVerFormHerramienta && this.isPermisoVerFormHerramienta));			
			this.jButtonAbrirOrderByToolBarHerramienta.setVisible((this.isVisibilidadCeldaOrdenHerramienta && this.isPermisoOrdenHerramienta));
			this.jButtonNuevoRelacionesToolBarHerramienta.setVisible((this.isVisibilidadCeldaNuevoRelacionesHerramienta && this.isPermisoNuevoHerramienta));			
			this.jButtonNuevoGuardarCambiosToolBarHerramienta.setVisible((this.isVisibilidadCeldaNuevoHerramienta && this.isPermisoNuevoHerramienta && this.isPermisoGuardarCambiosHerramienta));			
			
			if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.jInternalFrameDetalleFormHerramienta.jButtonModificarToolBarHerramienta.setVisible((this.isVisibilidadCeldaModificarHerramienta && this.isPermisoActualizarHerramienta));	
			this.jInternalFrameDetalleFormHerramienta.jButtonActualizarToolBarHerramienta.setVisible((this.isVisibilidadCeldaActualizarHerramienta  && this.isPermisoActualizarHerramienta));	
			this.jInternalFrameDetalleFormHerramienta.jButtonEliminarToolBarHerramienta.setVisible((this.isVisibilidadCeldaEliminarHerramienta && this.isPermisoEliminarHerramienta));
			this.jInternalFrameDetalleFormHerramienta.jButtonCancelarToolBarHerramienta.setVisible(this.isVisibilidadCeldaCancelarHerramienta);				
			this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosToolBarHerramienta.setVisible((this.isVisibilidadCeldaGuardarHerramienta && this.isPermisoGuardarCambiosHerramienta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHerramienta.setVisible((this.isVisibilidadCeldaGuardarCambiosHerramienta && this.isPermisoGuardarCambiosHerramienta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHerramienta.setVisible((this.isVisibilidadCeldaNuevoHerramienta && this.isPermisoNuevoHerramienta));			
			this.jMenuItemDuplicarHerramienta.setVisible((this.isVisibilidadCeldaDuplicarHerramienta && this.isPermisoDuplicarHerramienta));			
			this.jMenuItemCopiarHerramienta.setVisible((this.isVisibilidadCeldaCopiarHerramienta && this.isPermisoCopiarHerramienta));			
			this.jMenuItemVerFormHerramienta.setVisible((this.isVisibilidadCeldaVerFormHerramienta && this.isPermisoVerFormHerramienta));			
			this.jMenuItemAbrirOrderByHerramienta.setVisible((this.isVisibilidadCeldaOrdenHerramienta && this.isPermisoOrdenHerramienta));			
			//this.jMenuItemMostrarOcultarHerramienta.setVisible((this.isVisibilidadCeldaOrdenHerramienta && this.isPermisoOrdenHerramienta));
			this.jMenuItemDetalleAbrirOrderByHerramienta.setVisible((this.isVisibilidadCeldaOrdenHerramienta && this.isPermisoOrdenHerramienta));			
			//this.jMenuItemDetalleMostrarOcultarHerramienta.setVisible((this.isVisibilidadCeldaOrdenHerramienta && this.isPermisoOrdenHerramienta));			
			this.jMenuItemNuevoRelacionesHerramienta.setVisible((this.isVisibilidadCeldaNuevoRelacionesHerramienta && this.isPermisoNuevoHerramienta));			
			this.jMenuItemNuevoGuardarCambiosHerramienta.setVisible((this.isVisibilidadCeldaNuevoHerramienta && this.isPermisoNuevoHerramienta && this.isPermisoGuardarCambiosHerramienta));									
			
			if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.jInternalFrameDetalleFormHerramienta.jMenuItemModificarHerramienta.setVisible((this.isVisibilidadCeldaModificarHerramienta && this.isPermisoActualizarHerramienta));	
			this.jInternalFrameDetalleFormHerramienta.jMenuItemActualizarHerramienta.setVisible((this.isVisibilidadCeldaActualizarHerramienta && this.isPermisoActualizarHerramienta));	
			this.jInternalFrameDetalleFormHerramienta.jMenuItemEliminarHerramienta.setVisible((this.isVisibilidadCeldaEliminarHerramienta && this.isPermisoEliminarHerramienta));
			this.jInternalFrameDetalleFormHerramienta.jMenuItemCancelarHerramienta.setVisible(this.isVisibilidadCeldaCancelarHerramienta);				
			}
			
			this.jMenuItemGuardarCambiosHerramienta.setVisible((this.isVisibilidadCeldaGuardarHerramienta && this.isPermisoGuardarCambiosHerramienta));						
			this.jMenuItemGuardarCambiosTablaHerramienta.setVisible((this.isVisibilidadCeldaGuardarCambiosHerramienta && this.isPermisoGuardarCambiosHerramienta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHerramienta=this.jButtonNuevoHerramienta.isVisible();
			this.isVisibilidadCeldaDuplicarHerramienta=this.jButtonDuplicarHerramienta.isVisible();
			this.isVisibilidadCeldaCopiarHerramienta=this.jButtonCopiarHerramienta.isVisible();
			this.isVisibilidadCeldaVerFormHerramienta=this.jButtonVerFormHerramienta.isVisible();
			
			this.isVisibilidadCeldaOrdenHerramienta=this.jButtonAbrirOrderByHerramienta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=this.jButtonNuevoRelacionesHerramienta.isVisible();
			this.isVisibilidadCeldaModificarHerramienta=this.jButtonModificarHerramienta.isVisible();
			
			if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.isVisibilidadCeldaActualizarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonActualizarHerramienta.isVisible();
			this.isVisibilidadCeldaEliminarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonEliminarHerramienta.isVisible();
			this.isVisibilidadCeldaCancelarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonCancelarHerramienta.isVisible();
			this.isVisibilidadCeldaGuardarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHerramienta=this.jButtonGuardarCambiosTablaHerramienta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHerramienta=this.jButtonNuevoToolBarHerramienta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=this.jButtonNuevoRelacionesToolBarHerramienta.isVisible();
			
			if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.isVisibilidadCeldaModificarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonModificarToolBarHerramienta.isVisible();
			this.isVisibilidadCeldaActualizarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonActualizarToolBarHerramienta.isVisible();
			this.isVisibilidadCeldaEliminarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonEliminarToolBarHerramienta.isVisible();
			this.isVisibilidadCeldaCancelarHerramienta=this.jInternalFrameDetalleFormHerramienta.jButtonCancelarToolBarHerramienta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHerramienta=this.jButtonGuardarCambiosToolBarHerramienta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHerramienta=this.jButtonGuardarCambiosTablaToolBarHerramienta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHerramienta=this.jMenuItemNuevoHerramienta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=this.jMenuItemNuevoRelacionesHerramienta.isVisible();
			
			if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.isVisibilidadCeldaModificarHerramienta=this.jInternalFrameDetalleFormHerramienta.jMenuItemModificarHerramienta.isVisible();
			this.isVisibilidadCeldaActualizarHerramienta=this.jInternalFrameDetalleFormHerramienta.jMenuItemActualizarHerramienta.isVisible();
			this.isVisibilidadCeldaEliminarHerramienta=this.jInternalFrameDetalleFormHerramienta.jMenuItemEliminarHerramienta.isVisible();
			this.isVisibilidadCeldaCancelarHerramienta=this.jInternalFrameDetalleFormHerramienta.jMenuItemCancelarHerramienta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHerramienta=this.jMenuItemGuardarCambiosHerramienta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHerramienta=this.jMenuItemGuardarCambiosTablaHerramienta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHerramienta(Boolean esInicializar) {
		if(HerramientaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.herramientaSessionBean.getConGuardarRelaciones()) {
				//if(this.herramientaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHerramienta();
			}
			
			this.inicializarActualizarBindingBotonesManualHerramienta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHerramienta() {
		this.jButtonNuevoHerramienta.setVisible(this.isPermisoNuevoHerramienta);			
		this.jButtonDuplicarHerramienta.setVisible(this.isPermisoDuplicarHerramienta);			
		this.jButtonCopiarHerramienta.setVisible(this.isPermisoCopiarHerramienta);			
		this.jButtonVerFormHerramienta.setVisible(this.isPermisoVerFormHerramienta);			
		
		this.jButtonAbrirOrderByHerramienta.setVisible(this.isPermisoOrdenHerramienta);					
		
		this.jButtonNuevoRelacionesHerramienta.setVisible(this.isPermisoNuevoHerramienta);			
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonModificarHerramienta.setVisible(this.isPermisoActualizarHerramienta);	
			this.jInternalFrameDetalleFormHerramienta.jButtonActualizarHerramienta.setVisible(this.isPermisoActualizarHerramienta);	
			this.jInternalFrameDetalleFormHerramienta.jButtonEliminarHerramienta.setVisible(this.isPermisoEliminarHerramienta);
			this.jInternalFrameDetalleFormHerramienta.jButtonCancelarHerramienta.setVisible(this.isVisibilidadCeldaCancelarHerramienta);						
			this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.setVisible(this.isPermisoGuardarCambiosHerramienta);							
		}
		
		this.jButtonGuardarCambiosTablaHerramienta.setVisible(this.isPermisoActualizarHerramienta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHerramienta() {
		this.jInternalFrameDetalleFormHerramienta.jButtonModificarHerramienta.setVisible(this.isPermisoActualizarHerramienta);	
		this.jInternalFrameDetalleFormHerramienta.jButtonActualizarHerramienta.setVisible(this.isPermisoActualizarHerramienta);	
		this.jInternalFrameDetalleFormHerramienta.jButtonEliminarHerramienta.setVisible(this.isPermisoEliminarHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jButtonCancelarHerramienta.setVisible(this.isVisibilidadCeldaCancelarHerramienta);							
		this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.setVisible((this.isVisibilidadCeldaGuardarHerramienta && this.isPermisoGuardarCambiosHerramienta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHerramienta() {
		if(HerramientaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHerramienta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHerramienta() {
	}
	
	public void jTableDatosHerramientaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHerramienta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHerramientaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHerramienta(this.getherramienta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.herramienta==null) {
						this.herramienta = new Herramienta();
					}

					this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
				}

				if(this.herramienta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.herramienta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHerramienta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHerramientaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHerramienta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHerramienta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHerramienta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHerramienta(this.getherramienta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.herramientaLogic.getConnexion());

				if(this.herramienta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.herramienta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHerramienta=(TitledBorder)this.jScrollPanelDatosHerramienta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHerramienta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHerramientaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHerramienta(this.getherramienta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.herramienta==null) {
						this.herramienta = new Herramienta();
					}

					this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
				}

				if(this.herramienta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.herramienta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHerramienta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreHerramientaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHerramienta(this.getherramienta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.herramienta==null) {
						this.herramienta = new Herramienta();
					}

					this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
				}

				if(this.herramienta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.herramienta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHerramienta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionHerramientaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHerramienta(this.getherramienta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.herramienta==null) {
						this.herramienta = new Herramienta();
					}

					this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);
				}

				if(this.herramienta.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.herramienta.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHerramienta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaHerramientaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHerramienta(false,false);

			this.getHerramientasFK_IdEmpresa();

			this.inicializarActualizarBindingHerramienta(false);

			//if(HerramientaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHerramienta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.herramientaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHerramienta() {
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
		

		if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
			this.jInternalFrameDetalleFormHerramienta.setVisible(false);	    			
			this.jInternalFrameDetalleFormHerramienta.dispose();
			this.jInternalFrameDetalleFormHerramienta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
			this.jInternalFrameReporteDinamicoHerramienta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHerramienta.dispose();
			this.jInternalFrameReporteDinamicoHerramienta=null;
		}
		
		if(this.jInternalFrameImportacionHerramienta!=null) {
			this.jInternalFrameImportacionHerramienta.setVisible(false);	    			
			this.jInternalFrameImportacionHerramienta.dispose();
			this.jInternalFrameImportacionHerramienta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHerramienta();
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
			
			if(sTipo.equals("NuevoHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHerramienta")) {
				jButtonDuplicarHerramientaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHerramienta")) {
				jButtonCopiarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("VerFormHerramienta")) {
				jButtonVerFormHerramientaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHerramienta")) {
				jButtonDuplicarHerramientaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHerramienta")) {
				jButtonDuplicarHerramientaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHerramienta")) {
				jButtonModificarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHerramienta")) {
				jButtonModificarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHerramienta")) {
				jButtonModificarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHerramienta")) {
				jButtonActualizarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHerramienta")) {
				jButtonActualizarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHerramienta")) {
				jButtonActualizarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("EliminarHerramienta")) {
				jButtonEliminarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHerramienta")) {
				jButtonEliminarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHerramienta")) {
				jButtonEliminarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("CancelarHerramienta")) {
				jButtonCancelarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHerramienta")) {
				jButtonCancelarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHerramienta")) {
				jButtonCancelarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("CerrarHerramienta")) {
				jButtonCerrarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHerramienta")) {
				jButtonCerrarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHerramienta")) {
				jButtonCerrarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHerramienta")) {
				jButtonMostrarOcultarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHerramienta")) {
				jButtonCancelarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHerramienta")) {
				jButtonCopiarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHerramienta")) {
				jButtonVerFormHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHerramienta")) {
				jButtonCopiarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHerramienta")) {
				jButtonVerFormHerramientaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHerramienta")) {
				jButtonRecargarInformacionHerramientaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHerramienta")) {
				jButtonRecargarInformacionHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHerramienta")) {
				jButtonRecargarInformacionHerramientaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHerramienta")) {
				jButtonAnterioresHerramientaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHerramienta")) {
				jButtonAnterioresHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHerramienta")) {
				jButtonAnterioresHerramientaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHerramienta")) {
				jButtonSiguientesHerramientaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHerramienta")) {
				jButtonSiguientesHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHerramienta")) {
				jButtonSiguientesHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHerramienta") || sTipo.equals("MenuItemDetalleAbrirOrderByHerramienta")) {
				jButtonAbrirOrderByHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHerramienta") || sTipo.equals("MenuItemDetalleMostrarOcultarHerramienta")) {
				jButtonMostrarOcultarHerramientaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHerramienta")) {
				jButtonNuevoGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHerramienta")) {
				jButtonNuevoGuardarCambiosHerramientaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHerramienta")) {
				jButtonNuevoGuardarCambiosHerramientaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHerramienta")) {
				jButtonCerrarReporteDinamicoHerramientaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHerramienta")) {
				jButtonGenerarReporteDinamicoHerramientaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHerramienta")) {
				
				jButtonGenerarExcelReporteDinamicoHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHerramienta")) {
				jButtonCerrarImportacionHerramientaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHerramienta")) {
				
				jButtonGenerarImportacionHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHerramienta")) {
				
				jButtonAbrirImportacionHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHerramienta")) {
				jComboBoxTiposAccionesHerramientaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHerramienta")) {
				jComboBoxTiposRelacionesHerramientaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHerramienta")) {
				jComboBoxTiposAccionesHerramientaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHerramienta")) {
				
				jComboBoxTiposSeleccionarHerramientaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHerramienta")) {
				jTextFieldValorCampoGeneralHerramientaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHerramienta")) {
				jButtonAbrirOrderByHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHerramienta")) {
				jButtonAbrirOrderByHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHerramienta")) {
				jButtonCerrarOrderByHerramientaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHerramientaBusqueda")) {
				this.jButtonidHerramientaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHerramientaUpdate")) {
				this.jButtonid_empresaHerramientaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHerramientaBusqueda")) {
				this.jButtonid_empresaHerramientaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreHerramientaBusqueda")) {
				this.jButtonnombreHerramientaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionHerramientaBusqueda")) {
				this.jButtondescripcionHerramientaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHerramienta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHerramientaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Herramienta herramientaLocal=null;
			
			if(!this.getEsControlTabla()) {
				herramientaLocal=this.herramienta;
			} else {
				herramientaLocal=this.herramientaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
							
				
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaAnterior =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramientaAnterior =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
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
			
			


			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHerramientaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
								
						
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
								
				
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaAnterior =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramientaAnterior =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaAnterior =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramientaAnterior =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
							
				
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHerramientaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.herramientaAnterior =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.herramientaAnterior =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
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
			
			


			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
								
				
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaAnterior =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramientaAnterior =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHerramientaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHerramienta")) {
					jCheckBoxSeleccionarTodosHerramientaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHerramienta")) {
					jCheckBoxSeleccionadosHerramientaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHerramienta")) {
					
				}
				
				


				
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
												
				
				


				
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHerramientaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.herramientaAnterior =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.herramientaAnterior =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHerramientaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
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
			
			


			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHerramientaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.herramienta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.herramienta);
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
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
				
				


				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Herramienta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Herramienta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHerramientaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.herramientaAnterior =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.herramientaAnterior =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHerramienta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHerramientaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHerramienta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.herramienta =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.herramienta =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.herramienta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHerramienta")) {
				
				}
				
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHerramienta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHerramienta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHerramienta")) {
			
			}
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHerramienta();
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
			if(sTipo.equals("NuevoHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHerramienta")) {
				jButtonDuplicarHerramientaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHerramienta")) {
				jButtonCopiarHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHerramienta")) {
				jButtonVerFormHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHerramienta")) {
				jButtonNuevoHerramientaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHerramienta")) {
				jButtonModificarHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHerramienta")) {
				jButtonActualizarHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHerramienta")) {
				jButtonEliminarHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHerramienta")) {
				jButtonCancelarHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHerramienta")) {
				jButtonCerrarHerramientaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHerramienta")) {
				jButtonGuardarCambiosHerramientaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHerramienta")) {
				jButtonNuevoGuardarCambiosHerramientaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHerramienta")) {
				jButtonAbrirOrderByHerramientaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHerramienta")) {
				jButtonRecargarInformacionHerramientaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHerramienta")) {
				jButtonAnterioresHerramientaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHerramienta")) {
				jButtonSiguientesHerramientaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHerramientaBusqueda")) {
				this.jButtonidHerramientaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHerramientaUpdate")) {
				this.jButtonid_empresaHerramientaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHerramientaBusqueda")) {
				this.jButtonid_empresaHerramientaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreHerramientaBusqueda")) {
				this.jButtonnombreHerramientaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionHerramientaBusqueda")) {
				this.jButtondescripcionHerramientaBusquedaActionPerformed(evt);
			}
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHerramienta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHerramienta")) {
				closingInternalFrameHerramienta();
				
			} else if(sTipo.equals("jButtonCancelarHerramienta")) {
				JInternalFrameBase jInternalFrameDetalleFormHerramienta = (JInternalFrameBase)evt.getSource();
	            	
	            HerramientaBeanSwingJInternalFrame jInternalFrameParent=(HerramientaBeanSwingJInternalFrame)jInternalFrameDetalleFormHerramienta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHerramientaActionPerformed(null);
			}
			
			HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.herramienta,new Object(),this.herramientaParameterGeneral,this.herramientaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHerramienta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHerramienta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHerramienta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.herramienta)) {
			if(!esControlTabla) {
				if(HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);			
				}
				
				if(this.herramientaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHerramienta(this.herramienta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.herramientaReturnGeneral=herramientaLogic.procesarEventosHerramientasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.herramientaLogic.getHerramientas(),this.herramienta,this.herramientaParameterGeneral,this.isEsNuevoHerramienta,classes);//this.herramientaLogic.getHerramienta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHerramienta(this.herramientaReturnGeneral,this.herramientaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.herramientaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHerramienta(classes,this.herramientaReturnGeneral,this.herramientaBean,false);
					}
						
					if(this.herramientaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHerramienta(this.herramientaReturnGeneral.getHerramienta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHerramienta(this.herramientaReturnGeneral.getHerramienta());	
					}
						
					if(this.herramientaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHerramienta(this.herramientaReturnGeneral.getHerramienta(),classes);//this.herramientaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHerramienta(this.herramienta,classes);//this.herramientaBean);									
				}
			
				if(HerramientaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHerramienta(this.herramienta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHerramienta(this.herramienta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.herramientaAnterior!=null) {
						this.herramienta=this.herramientaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.herramientaReturnGeneral=herramientaLogic.procesarEventosHerramientasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.herramientaLogic.getHerramientas(),this.herramienta,this.herramientaParameterGeneral,this.isEsNuevoHerramienta,classes);//this.herramientaLogic.getHerramienta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.herramientaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.herramientaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.herramientaReturnGeneral.getHerramienta(),herramientaLogic.getHerramientas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.herramientaReturnGeneral.getHerramienta(),this.herramientas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHerramienta.repaint();
				
				//((AbstractTableModel) this.jTableDatosHerramienta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHerramienta();
			}
		}
	}
	
	public void actualizarVisualTableDatosHerramienta() throws Exception {
		
		HerramientaModel herramientaModel=(HerramientaModel)this.jTableDatosHerramienta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			herramientaModel.herramientas=this.herramientaLogic.getHerramientas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			herramientaModel.herramientas=this.herramientas;
		}
		
		
		((HerramientaModel) this.jTableDatosHerramienta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHerramienta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getherramientaAnterior(),this.herramientaLogic.getHerramientas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getherramientaAnterior(),this.herramientas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHerramienta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHerramienta(Herramienta herramienta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoHerra.class)) {
					this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.setEmpleadoHerras(herramienta.getEmpleadoHerras());
					this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHerra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
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
										
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.herramienta,new Object(),generalEntityParameterGeneral,this.herramientaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.herramientaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HerramientaConstantesFunciones.getClassesRelationshipsOfHerramienta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HerramientaConstantesFunciones.getClassesRelationshipsFromStringsOfHerramienta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHerramienta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HerramientaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.herramienta,new Object(),generalEntityParameterGeneral,this.herramientaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHerramienta(HerramientaBean herramientaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoHerra.class)) {
					this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.setEmpleadoHerras(herramienta.getEmpleadoHerras());
					this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoHerra(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHerramienta(ArrayList<Classe> classes,HerramientaReturnGeneral herramientaReturnGeneral,HerramientaBean herramientaBean,Boolean conDefault) throws Exception {
		
			this.herramientaBean.setEmpleadoHerras(herramientaReturnGeneral.getHerramienta().getEmpleadoHerras());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHerramienta(Herramienta herramienta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoHerra.class)) {
					herramienta.setEmpleadoHerras(this.jInternalFrameDetalleFormHerramienta.empleadoherraBeanSwingJInternalFrame.empleadoherraLogic.getEmpleadoHerras());
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
		if(!paraTabla && !this.permiteMantenimiento(this.herramienta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHerramienta = new HerramientaDetalleFormJInternalFrame(jDesktopPane,this.herramientaSessionBean.getConGuardarRelaciones(),this.herramientaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHerramienta);
		this.jInternalFrameDetalleFormHerramienta.setVisible(false);
		this.jInternalFrameDetalleFormHerramienta.setSelected(false);						
		
		this.jInternalFrameDetalleFormHerramienta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHerramienta.herramientaLogic=this.herramientaLogic;
		
		this.cargarCombosFrameForeignKeyHerramienta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHerramienta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHerramienta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHerramienta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHerramienta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHerramienta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHerramienta"));
		
		this.jInternalFrameDetalleFormHerramienta.jButtonModificarHerramienta.addActionListener(new ButtonActionListener(this,"ModificarHerramienta"));

		
		this.jInternalFrameDetalleFormHerramienta.jButtonModificarToolBarHerramienta.addActionListener(new ButtonActionListener(this,"ModificarToolBarHerramienta"));
					
		this.jInternalFrameDetalleFormHerramienta.jMenuItemModificarHerramienta.addActionListener(new ButtonActionListener(this,"MenuItemModificarHerramienta"));		
		
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonActualizarHerramienta.addActionListener (new ButtonActionListener(this,"ActualizarHerramienta"));
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonActualizarToolBarHerramienta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHerramienta"));
						
		this.jInternalFrameDetalleFormHerramienta.jMenuItemActualizarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHerramienta"));		
		
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonEliminarHerramienta.addActionListener (new ButtonActionListener(this,"EliminarHerramienta"));
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonEliminarToolBarHerramienta.addActionListener (new ButtonActionListener(this,"EliminarToolBarHerramienta"));
								
		this.jInternalFrameDetalleFormHerramienta.jMenuItemEliminarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHerramienta"));		
		
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonCancelarHerramienta.addActionListener (new ButtonActionListener(this,"CancelarHerramienta"));
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonCancelarToolBarHerramienta.addActionListener (new ButtonActionListener(this,"CancelarToolBarHerramienta"));
					
		this.jInternalFrameDetalleFormHerramienta.jMenuItemCancelarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHerramienta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHerramienta.jMenuItemDetalleCerrarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHerramienta"));		
		
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosToolBarHerramienta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHerramienta"));
		
		
		
		this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosToolBarHerramienta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHerramienta"));
		
		
		
		this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHerramienta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonidHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"idHerramientaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHerramienta.jButtonid_empresaHerramientaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHerramientaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonid_empresaHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHerramientaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonnombreHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"nombreHerramientaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtondescripcionHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHerramientaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHerramienta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHerramienta"));
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHerramienta"));
		}
		
		this.jTableDatosHerramienta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHerramienta"));
		
		this.jTableDatosHerramienta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHerramienta"));
		
		this.jButtonNuevoHerramienta.addActionListener(new ButtonActionListener(this,"NuevoHerramienta"));
		
		this.jButtonDuplicarHerramienta.addActionListener(new ButtonActionListener(this,"DuplicarHerramienta"));
		
		this.jButtonCopiarHerramienta.addActionListener(new ButtonActionListener(this,"CopiarHerramienta"));
		
		this.jButtonVerFormHerramienta.addActionListener(new ButtonActionListener(this,"VerFormHerramienta"));
		
		
		this.jButtonNuevoToolBarHerramienta.addActionListener(new ButtonActionListener(this,"NuevoToolBarHerramienta"));
			
		this.jButtonDuplicarToolBarHerramienta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHerramienta"));
			
		this.jMenuItemNuevoHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHerramienta"));
			
		this.jMenuItemDuplicarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHerramienta"));		
		
		
		this.jButtonNuevoRelacionesHerramienta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHerramienta"));
		
		
		this.jButtonNuevoRelacionesToolBarHerramienta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHerramienta"));
			
		this.jMenuItemNuevoRelacionesHerramienta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHerramienta"));		
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonModificarHerramienta.addActionListener(new ButtonActionListener(this,"ModificarHerramienta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonModificarToolBarHerramienta.addActionListener(new ButtonActionListener(this,"ModificarToolBarHerramienta"));
			
			this.jInternalFrameDetalleFormHerramienta.jMenuItemModificarHerramienta.addActionListener(new ButtonActionListener(this,"MenuItemModificarHerramienta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHerramienta.jButtonActualizarHerramienta.addActionListener (new ButtonActionListener(this,"ActualizarHerramienta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonActualizarToolBarHerramienta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHerramienta"));
				
			this.jInternalFrameDetalleFormHerramienta.jMenuItemActualizarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHerramienta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonEliminarHerramienta.addActionListener (new ButtonActionListener(this,"EliminarHerramienta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonEliminarToolBarHerramienta.addActionListener (new ButtonActionListener(this,"EliminarToolBarHerramienta"));
						
			this.jInternalFrameDetalleFormHerramienta.jMenuItemEliminarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHerramienta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonCancelarHerramienta.addActionListener (new ButtonActionListener(this,"CancelarHerramienta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonCancelarToolBarHerramienta.addActionListener (new ButtonActionListener(this,"CancelarToolBarHerramienta"));
			
			this.jInternalFrameDetalleFormHerramienta.jMenuItemCancelarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHerramienta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHerramienta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHerramienta"));		
		
		
		this.jButtonCerrarHerramienta.addActionListener (new ButtonActionListener(this,"CerrarHerramienta"));
		
		
		this.jButtonCerrarToolBarHerramienta.addActionListener (new ButtonActionListener(this,"CerrarToolBarHerramienta"));
			
		this.jMenuItemCerrarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHerramienta"));
			
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jMenuItemDetalleCerrarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHerramienta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.addActionListener (new ButtonActionListener(this,"GuardarCambiosHerramienta"));
		}
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosToolBarHerramienta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHerramienta"));
		}
		
		this.jButtonCopiarToolBarHerramienta.addActionListener (new ButtonActionListener(this,"CopiarToolBarHerramienta"));
			
		this.jButtonVerFormToolBarHerramienta.addActionListener (new ButtonActionListener(this,"VerFormToolBarHerramienta"));
		
		this.jMenuItemGuardarCambiosHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHerramienta"));
			
		this.jMenuItemCopiarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHerramienta"));		
		
		this.jMenuItemVerFormHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHerramienta"));		
		
		
		this.jButtonGuardarCambiosTablaHerramienta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHerramienta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHerramienta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHerramienta"));
			
		this.jMenuItemGuardarCambiosTablaHerramienta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHerramienta"));		
		
		
		
		this.jButtonRecargarInformacionHerramienta.addActionListener (new ButtonActionListener(this,"RecargarInformacionHerramienta"));
					
		this.jButtonRecargarInformacionToolBarHerramienta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHerramienta"));
		
		this.jMenuItemRecargarInformacionHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHerramienta"));		
		
		
		
		this.jButtonAnterioresHerramienta.addActionListener (new ButtonActionListener(this,"AnterioresHerramienta"));
		
		
		this.jButtonAnterioresToolBarHerramienta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHerramienta"));
		
		this.jMenuItemAnterioresHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHerramienta"));		
		
		
		this.jButtonSiguientesHerramienta.addActionListener (new ButtonActionListener(this,"SiguientesHerramienta"));
		
		
		this.jButtonSiguientesToolBarHerramienta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHerramienta"));
			
		this.jMenuItemSiguientesHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHerramienta"));
			
		this.jMenuItemAbrirOrderByHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHerramienta"));
			
		this.jMenuItemMostrarOcultarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHerramienta"));
			
		this.jMenuItemDetalleAbrirOrderByHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHerramienta"));
			
		this.jMenuItemDetalleMostarOcultarHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHerramienta"));		
		
		
		this.jButtonNuevoGuardarCambiosHerramienta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHerramienta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHerramienta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHerramienta"));
			
		this.jMenuItemNuevoGuardarCambiosHerramienta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHerramienta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHerramienta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHerramienta"));

		this.jCheckBoxSeleccionadosHerramienta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHerramienta"));
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHerramienta"));
		}
		
		
		this.jComboBoxTiposRelacionesHerramienta.addActionListener (new ButtonActionListener(this,"TiposRelacionesHerramienta"));
			
		this.jComboBoxTiposAccionesHerramienta.addActionListener (new ButtonActionListener(this,"TiposAccionesHerramienta"));
					
		this.jComboBoxTiposSeleccionarHerramienta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHerramienta"));
			
		this.jTextFieldValorCampoGeneralHerramienta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHerramienta"));		
		
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonidHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"idHerramientaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHerramienta.jButtonid_empresaHerramientaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHerramientaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonid_empresaHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHerramientaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonnombreHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"nombreHerramientaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtondescripcionHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHerramientaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHerramienta!=null) {
				this.jInternalFrameReporteDinamicoHerramienta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHerramienta"));
				this.jInternalFrameReporteDinamicoHerramienta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHerramienta"));
				this.jInternalFrameReporteDinamicoHerramienta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHerramienta"));
			}
			
			//this.jButtonCerrarReporteDinamicoHerramienta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHerramienta"));				
			//this.jButtonGenerarReporteDinamicoHerramienta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHerramienta"));
			//this.jButtonGenerarExcelReporteDinamicoHerramienta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHerramienta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHerramienta!=null) {
				this.jInternalFrameImportacionHerramienta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHerramienta"));
				this.jInternalFrameImportacionHerramienta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHerramienta"));
				this.jInternalFrameImportacionHerramienta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHerramienta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHerramienta.addActionListener (new ButtonActionListener(this,"AbrirOrderByHerramienta"));
			
			this.jButtonAbrirOrderByToolBarHerramienta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHerramienta"));			
			
			if(this.jInternalFrameOrderByHerramienta!=null) {
				this.jInternalFrameOrderByHerramienta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHerramienta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHerramienta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHerramienta.jTabbedPaneRelacionesHerramienta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHerramienta"));
		
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
            		closingInternalFrameHerramienta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHerramienta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHerramienta = (JInternalFrameBase)event.getSource();
	            	
	            HerramientaBeanSwingJInternalFrame jInternalFrameParent=(HerramientaBeanSwingJInternalFrame)jInternalFrameDetalleFormHerramienta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHerramientaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHerramienta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHerramientaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHerramienta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHerramienta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHerramientaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHerramientaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHerramientaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHerramienta";
		inputMap = this.jButtonNuevoHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHerramientaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHerramientaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHerramientaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHerramientaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHerramienta";
		inputMap = this.jButtonNuevoRelacionesHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHerramientaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHerramienta";
		inputMap = this.jButtonModificarHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHerramientaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHerramienta";
		inputMap = this.jButtonActualizarHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHerramientaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHerramienta";
		inputMap = this.jButtonEliminarHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHerramientaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHerramienta";
		inputMap = this.jButtonCancelarHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHerramientaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHerramienta";
		inputMap = this.jButtonCerrarHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHerramientaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHerramienta";
		inputMap = this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHerramienta.jButtonGuardarCambiosHerramienta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHerramientaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHerramienta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHerramientaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHerramienta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHerramientaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHerramienta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHerramientaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHerramienta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHerramientaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonidHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"idHerramientaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHerramienta.jButtonid_empresaHerramientaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHerramientaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonid_empresaHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHerramientaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtonnombreHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"nombreHerramientaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHerramienta.jButtondescripcionHerramientaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionHerramientaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHerramienta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHerramientaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHerramientaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHerramienta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHerramienta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
					herramientaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Herramienta herramientaAux:herramientas) {
					herramientaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHerramientaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHerramienta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
						herramientaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Herramienta herramientaAux:herramientas) {
						herramientaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Herramienta herramientaAux:herramientas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHerramienta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHerramienta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHerramienta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHerramienta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHerramientaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHerramienta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHerramienta.getSelectedRows();
			
			Herramienta herramientaLocal=new Herramienta();
			
			//this.seleccionarTodosHerramienta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					herramientaLocal =(Herramienta) this.herramientaLogic.getHerramientas().toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					herramientaLocal =(Herramienta) this.herramientas.toArray()[this.jTableDatosHerramienta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				herramientaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
						herramientaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Herramienta herramientaAux:herramientas) {
						herramientaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHerramienta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHerramienta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHerramienta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHerramienta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHerramientaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHerramientaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHerramientaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHerramienta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHerramienta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Herramienta herramientaAux:this.herramientaLogic.getHerramientas()) {
				
						if(sTipoSeleccionar.equals(HerramientaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							herramientaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HerramientaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							herramientaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Herramienta herramientaAux:herramientas) {
					
						if(sTipoSeleccionar.equals(HerramientaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							herramientaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(HerramientaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							herramientaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHerramienta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHerramientaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHerramienta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHerramienta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHerramienta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHerramienta) {				
					conSplash=true;//false;										
					
					//this.startProcessHerramienta(conSplash);
				
					this.generarReporteHerramientasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHerramientasSeleccionados();
				//this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHerramientasSeleccionados(false);
				//this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHerramientasSeleccionados(true);
				//this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHerramienta();
				
				this.exportarHerramientasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHerramientas();
				//this.importarHerramientas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHerramienta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHerramientasSeleccionados();
				//this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Herramienta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHerramienta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHerramienta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHerramienta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.setSelectedIndex(0);					
				}	
			} 			
			else if(HerramientaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHerramienta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHerramienta(conSplash);
					
						//this.actualizarParametrosGeneralHerramienta();
						
						this.generarReporteProcesoAccionHerramientasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HerramientaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO HerramientaS SELECCIONADOS?", "MANTENIMIENTO DE Herramienta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHerramienta();
				
						this.actualizarParametrosGeneralHerramienta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.herramientaReturnGeneral=herramientaLogic.procesarAccionHerramientasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.herramientaLogic.getHerramientas(),this.herramientaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHerramientaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHerramienta();
					
					HerramientaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHerramientaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHerramienta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHerramienta.jComboBoxTiposAccionesFormularioHerramienta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHerramienta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHerramientaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHerramienta();
			
			if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
			Herramienta herramienta=new Herramienta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHerramienta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHerramienta.getSelectedItem();
			
			
			
			
			herramientasSeleccionados=this.getHerramientasSeleccionados(true);
			//this.sTipoAccion;
			
			if(herramientasSeleccionados.size()==1) {
				for(Herramienta herramientaAux:herramientasSeleccionados) {
					herramienta=herramientaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Empleado Herra")) {
					jButtonEmpleadoHerraActionPerformed(null,rowIndex,true,false,herramienta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHerramienta();
			
      		//this.finishProcessHerramienta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHerramientaReturnGeneral() throws Exception {
		if(this.herramientaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.herramientaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.herramientaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.herramientaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.herramientaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.herramientaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHerramienta(false);
		}
		
		if(this.herramientaReturnGeneral.getConRetornoLista() || this.herramientaReturnGeneral.getConRetornoObjeto()) {
			if(this.herramientaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.herramientaLogic.setHerramientas(this.herramientaReturnGeneral.getHerramientas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.herramientaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.herramientaLogic.setHerramienta(this.herramientaReturnGeneral.getHerramienta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHerramienta(false);
		}
	}
	
	public void actualizarParametrosGeneralHerramienta() throws Exception {
		
		
	}
	
	public ArrayList<Herramienta> getHerramientasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHerramienta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Herramienta herramientaAux:herramientaLogic.getHerramientas()) {
					if(herramientaAux.getIsSelected()) {
						herramientasSeleccionados.add(herramientaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Herramienta herramientaAux:this.herramientas) {
					if(herramientaAux.getIsSelected()) {
						herramientasSeleccionados.add(herramientaAux);				
					}
				}
			}
			
			if(herramientasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						herramientasSeleccionados.addAll(this.herramientaLogic.getHerramientas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						herramientasSeleccionados.addAll(this.herramientas);				
					}
				}
			}
		} else {
			herramientasSeleccionados.add(this.herramienta);
		}
		
		return herramientasSeleccionados;
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
	
	public void generarReporteHerramientasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHerramientasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHerramientasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHerramientasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHerramientasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesHerramientasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Herramienta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHerramientasSeleccionados() throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHerramientas("Todos",herramientasSeleccionados);
		
	}	
	
	public void generarReporteNormalHerramientasSeleccionados() throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHerramientas("Todos",herramientasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHerramientasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHerramientas("Todos",herramientasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHerramientasSeleccionados() throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHerramienta();
		
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHerramienta();
		
		
		//this.generarReporteHerramientas("Todos",herramientasSeleccionados ,herramientaImplementable,herramientaImplementableHome);
	}
	
	public void mostrarImportacionHerramientas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHerramienta();
		
		this.abrirFrameImportacionHerramienta();		
		
			
		//this.generarReporteHerramientas("Todos",herramientasSeleccionados ,herramientaImplementable,herramientaImplementableHome);
	}
	
	public void importarHerramientas() throws Exception {		
	
	}
	
	public void exportarHerramientasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHerramientasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHerramientasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHerramientasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Herramienta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHerramientasSeleccionados() throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"herramienta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHerramienta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Herramienta herramientaAux:herramientasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHerramienta(herramientaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//herramientaAux.setsDetalleGeneralEntityReporte(herramientaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHerramienta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HerramientaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HerramientaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HerramientaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HerramientaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HerramientaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHerramienta(Herramienta herramienta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=herramienta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=herramienta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=herramienta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=herramienta.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=herramienta.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHerramientasSeleccionados() throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"herramienta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Herramientas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHerramienta(row);				
				iRow++;
			}				
			
			for(Herramienta herramientaAux:herramientasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHerramienta(herramientaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHerramientasSeleccionados() throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();		
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"herramienta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("herramientas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("herramienta");
			//elementRoot.appendChild(element);
		
			for(Herramienta herramientaAux:herramientasSeleccionados) {
				element = document.createElement("herramienta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHerramienta(herramientaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.herramientaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Herramienta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHerramienta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HerramientaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HerramientaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HerramientaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HerramientaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(HerramientaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHerramienta(Herramienta herramienta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(herramienta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(herramienta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(herramienta.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(herramienta.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlHerramienta(Herramienta herramienta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HerramientaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(herramienta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HerramientaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(herramienta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(HerramientaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(herramienta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(HerramientaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(herramienta.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdescripcion = document.createElement(HerramientaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(herramienta.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoHerramientasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Herramienta> herramientasSeleccionados=new ArrayList<Herramienta>();
		
		herramientasSeleccionados=this.getHerramientasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHerramienta(herramientasSeleccionados);
		
		this.generarReporteHerramientas("Todos",herramientasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHerramienta(ArrayList<Herramienta> herramientasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Herramienta herramientaAux:herramientasSeleccionados) {
				herramientaAux.setsDetalleGeneralEntityReporte(herramientaAux.toString());
			
				if(sTipoSeleccionar.equals(HerramientaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					herramientaAux.setsDescripcionGeneralEntityReporte1(herramientaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HerramientaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					herramientaAux.setsDescripcionGeneralEntityReporte1(herramientaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(HerramientaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					herramientaAux.setsDescripcionGeneralEntityReporte1(herramientaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HerramientaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHerramienta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHerramienta=true;
				this.isVisibilidadCeldaNuevoRelacionesHerramienta=true;
				this.isVisibilidadCeldaGuardarCambiosHerramienta=true;
			}
			
			this.isVisibilidadCeldaModificarHerramienta=false;
			this.isVisibilidadCeldaActualizarHerramienta=false;
			this.isVisibilidadCeldaEliminarHerramienta=false;
			this.isVisibilidadCeldaCancelarHerramienta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHerramienta=true;
				} else {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHerramienta=false;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
			this.isVisibilidadCeldaModificarHerramienta=false;
			this.isVisibilidadCeldaActualizarHerramienta=true;
			this.isVisibilidadCeldaEliminarHerramienta=false;
			this.isVisibilidadCeldaCancelarHerramienta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHerramienta=true;
				} else {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHerramienta=false;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
			this.isVisibilidadCeldaModificarHerramienta=false;
			this.isVisibilidadCeldaActualizarHerramienta=true;
			this.isVisibilidadCeldaEliminarHerramienta=true;
			this.isVisibilidadCeldaCancelarHerramienta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHerramienta=true;
				} else {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHerramienta=false;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
			this.isVisibilidadCeldaModificarHerramienta=false;
			this.isVisibilidadCeldaActualizarHerramienta=true;
			this.isVisibilidadCeldaEliminarHerramienta=false;
			this.isVisibilidadCeldaCancelarHerramienta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				} else {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHerramienta=true;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=true;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=true;
			this.isVisibilidadCeldaModificarHerramienta=false;
			this.isVisibilidadCeldaActualizarHerramienta=false;
			this.isVisibilidadCeldaEliminarHerramienta=false;
			this.isVisibilidadCeldaCancelarHerramienta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHerramienta=true;
				} else {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHerramienta=false;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
			this.isVisibilidadCeldaActualizarHerramienta=false;
			this.isVisibilidadCeldaEliminarHerramienta=false;
			this.isVisibilidadCeldaCancelarHerramienta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				} else {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHerramienta=false;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
			this.isVisibilidadCeldaModificarHerramienta=true;
			this.isVisibilidadCeldaActualizarHerramienta=false;
			this.isVisibilidadCeldaEliminarHerramienta=false;
			this.isVisibilidadCeldaCancelarHerramienta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				} else {
					this.isVisibilidadCeldaGuardarHerramienta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HerramientaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHerramienta=true;
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=true;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=true;
		} else {
			this.actualizarEstadoPanelsHerramienta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHerramienta=false;
			//this.isVisibilidadCeldaVerFormHerramienta=false;
			this.isVisibilidadCeldaDuplicarHerramienta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!herramientaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
		} else {
			this.isVisibilidadCeldaNuevoHerramienta=false;
			this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(herramientaSessionBean.getEsGuardarRelacionado()) {
			if(!herramientaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;												
			}
			
			this.jButtonCerrarHerramienta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHerramienta=false;
		}
		
		if(!this.permiteMantenimiento(this.herramienta)) {
			this.isVisibilidadCeldaActualizarHerramienta=false;
			this.isVisibilidadCeldaEliminarHerramienta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHerramienta() {
		this.isVisibilidadCeldaNuevoHerramienta=false;
		this.isVisibilidadCeldaGuardarCambiosHerramienta=false;
	}
	
	public void actualizarEstadoPanelsHerramienta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHerramienta!=null) {
				this.jScrollPanelDatosEdicionHerramienta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHerramienta!=null) {
				this.jScrollPanelDatosHerramienta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHerramienta!=null) {
				this.jPanelPaginacionHerramienta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHerramienta!=null) {
				this.jScrollPanelDatosEdicionHerramienta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHerramienta!=null) {
				this.jScrollPanelDatosHerramienta.setVisible(false);
			}
			
			if(this.jPanelPaginacionHerramienta!=null) {
				this.jPanelPaginacionHerramienta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHerramienta!=null) {
				this.jScrollPanelDatosEdicionHerramienta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHerramienta!=null) {
				this.jScrollPanelDatosHerramienta.setVisible(false);
			}
			
			if(this.jPanelPaginacionHerramienta!=null) {
				this.jPanelPaginacionHerramienta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHerramienta!=null) {
				this.jScrollPanelDatosEdicionHerramienta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHerramienta!=null) {
				this.jScrollPanelDatosHerramienta.setVisible(false);
			}
			
			if(this.jPanelPaginacionHerramienta!=null) {
				this.jPanelPaginacionHerramienta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHerramienta!=null) {
				this.jScrollPanelDatosEdicionHerramienta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHerramienta!=null) {
				this.jScrollPanelDatosHerramienta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHerramienta!=null) {
				this.jPanelPaginacionHerramienta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHerramienta!=null) {
				this.jScrollPanelDatosEdicionHerramienta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHerramienta!=null) {
				this.jScrollPanelDatosHerramienta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHerramienta!=null) {
				this.jPanelPaginacionHerramienta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHerramienta!=null) {
				this.jScrollPanelDatosEdicionHerramienta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHerramienta!=null) {
				this.jScrollPanelDatosHerramienta.setVisible(true);
			}
			
			if(this.jPanelPaginacionHerramienta!=null) {
				this.jPanelPaginacionHerramienta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.herramientaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHerramienta!=null) {
					this.jTabbedPaneBusquedasHerramienta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.herramientaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHerramienta!=null) {
				this.jTabbedPaneBusquedasHerramienta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHerramienta!=null) {
				this.jPanelParametrosReportesHerramienta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionHerramientaParaEmpleadoHerras() throws Exception {
		Boolean isPaginaPopupEmpleadoHerra=false;

		try {

			if(this.herramientaSessionBean==null) {
				this.herramientaSessionBean=new HerramientaSessionBean();
			}

			if(this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean==null) {
				this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
			}

			this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean.setsPathNavegacionActual(herramientaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleadoHerra=this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoHerra(true);
			this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoHerra(HerramientaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean.setisBusquedaDesdeForeignKeySesionHerramienta(true);
			this.jInternalFrameDetalleFormHerramienta.empleadoherraSessionBean.setlidHerramientaActual(this.idHerramientaActual);

			herramientaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyHerramienta(true);
			herramientaSessionBean.setlIdHerramientaActualForeignKey(this.idHerramientaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HerramientaSessionBean herramientaSessionBean=new HerramientaSessionBean();
		
		if(this.herramientaSessionBean==null) {
			this.herramientaSessionBean=new HerramientaSessionBean();
		}
		
		this.herramientaSessionBean.setsUltimaBusquedaHerramienta(this.getsAccionBusqueda());
		this.herramientaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.herramientaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			herramientaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HerramientaSessionBean herramientaSessionBean=new HerramientaSessionBean();
		
		if(this.herramientaSessionBean==null) {
			this.herramientaSessionBean=new HerramientaSessionBean();
		}
		
		if(this.herramientaSessionBean.getsUltimaBusquedaHerramienta()!=null&&!this.herramientaSessionBean.getsUltimaBusquedaHerramienta().equals("")) {
			this.setsAccionBusqueda(herramientaSessionBean.getsUltimaBusquedaHerramienta());
			this.setiNumeroPaginacion(herramientaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(herramientaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(herramientaSessionBean.getid_empresa());
				herramientaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.herramientaSessionBean.setsUltimaBusquedaHerramienta("");
		this.herramientaSessionBean.setiNumeroPaginacion(HerramientaConstantesFunciones.INUMEROPAGINACION);
		this.herramientaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHerramienta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHerramienta() {
		this.updateBorderResaltarBusquedasFormularioHerramienta();
		this.updateVisibilidadBusquedasFormularioHerramienta();
		this.updateHabilitarBusquedasFormularioHerramienta();
	}
	
	public void updateBorderResaltarBusquedasFormularioHerramienta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHerramienta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHerramienta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHerramienta.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHerramienta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHerramienta.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHerramienta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarHerramienta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioHerramienta() throws Exception {

		if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHerramienta();
		this.updateVisibilidadResaltarControlesFormularioHerramienta();
		this.updateHabilitarResaltarControlesFormularioHerramienta();
		
	}
	
	public void updateBorderResaltarControlesFormularioHerramienta() throws Exception {
		if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.herramientaConstantesFunciones.resaltaridHerramienta!=null && this.jInternalFrameDetalleFormHerramienta!=null) {this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.setBorder(this.herramientaConstantesFunciones.resaltaridHerramienta);}
		if(this.herramientaConstantesFunciones.resaltarid_empresaHerramienta!=null && this.jInternalFrameDetalleFormHerramienta!=null) {this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setBorder(this.herramientaConstantesFunciones.resaltarid_empresaHerramienta);}
		if(this.herramientaConstantesFunciones.resaltarnombreHerramienta!=null && this.jInternalFrameDetalleFormHerramienta!=null) {this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.setBorder(this.herramientaConstantesFunciones.resaltarnombreHerramienta);}
		if(this.herramientaConstantesFunciones.resaltardescripcionHerramienta!=null && this.jInternalFrameDetalleFormHerramienta!=null) {this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.setBorder(this.herramientaConstantesFunciones.resaltardescripcionHerramienta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHerramienta() throws Exception {		
		if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
	
		//this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.setVisible(this.herramientaConstantesFunciones.mostraridHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jPanelidHerramienta.setVisible(this.herramientaConstantesFunciones.mostraridHerramienta);
		//this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setVisible(this.herramientaConstantesFunciones.mostrarid_empresaHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jPanelid_empresaHerramienta.setVisible(this.herramientaConstantesFunciones.mostrarid_empresaHerramienta);
		//this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.setVisible(this.herramientaConstantesFunciones.mostrarnombreHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jPanelnombreHerramienta.setVisible(this.herramientaConstantesFunciones.mostrarnombreHerramienta);
		//this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.setVisible(this.herramientaConstantesFunciones.mostrardescripcionHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jPaneldescripcionHerramienta.setVisible(this.herramientaConstantesFunciones.mostrardescripcionHerramienta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHerramienta() throws Exception {
		if(this.jInternalFrameDetalleFormHerramienta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHerramienta!=null) {
	
		this.jInternalFrameDetalleFormHerramienta.jLabelidHerramienta.setEnabled(this.herramientaConstantesFunciones.activaridHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jComboBoxid_empresaHerramienta.setEnabled(this.herramientaConstantesFunciones.activarid_empresaHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jTextAreanombreHerramienta.setEnabled(this.herramientaConstantesFunciones.activarnombreHerramienta);
		this.jInternalFrameDetalleFormHerramienta.jTextAreadescripcionHerramienta.setEnabled(this.herramientaConstantesFunciones.activardescripcionHerramienta);
		}
	}
	
		
}