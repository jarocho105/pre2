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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;




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

import com.bydan.erp.comisiones.util.TipoComisionConfigConstantesFunciones;
import com.bydan.erp.comisiones.util.TipoComisionConfigParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.TipoComisionConfigParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.TipoComisionConfigBean;
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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoComisionConfigBeanSwingJInternalFrame extends TipoComisionConfigJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoComisionConfigBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoComisionConfig> tipocomisionconfigValidator = new ClassValidator<TipoComisionConfig>(TipoComisionConfig.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoComisionConfig tipocomisionconfig;	
	public TipoComisionConfig tipocomisionconfigAux;
	public TipoComisionConfig tipocomisionconfigAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoComisionConfig tipocomisionconfigTotales;
	public Long idTipoComisionConfigActual;
	public Long iIdNuevoTipoComisionConfig=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosComisionConfig=false;

	public Boolean getIsTienePermisosComisionConfig() {
		return isTienePermisosComisionConfig;
	}

	public void setIsTienePermisosComisionConfig(Boolean isTienePermisosComisionConfig) {
		this.isTienePermisosComisionConfig= isTienePermisosComisionConfig;
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
	
	public Boolean isPermisoTodoTipoComisionConfig;
	public Boolean isPermisoNuevoTipoComisionConfig;
	public Boolean isPermisoActualizarTipoComisionConfig;
	public Boolean isPermisoActualizarOriginalTipoComisionConfig;
	public Boolean isPermisoEliminarTipoComisionConfig;
	public Boolean isPermisoGuardarCambiosTipoComisionConfig;
	public Boolean isPermisoConsultaTipoComisionConfig;
	public Boolean isPermisoBusquedaTipoComisionConfig;
	public Boolean isPermisoReporteTipoComisionConfig;
	public Boolean isPermisoPaginacionMedioTipoComisionConfig;
	public Boolean isPermisoPaginacionAltoTipoComisionConfig;
	public Boolean isPermisoPaginacionTodoTipoComisionConfig;
	public Boolean isPermisoCopiarTipoComisionConfig;
	public Boolean isPermisoVerFormTipoComisionConfig;
	public Boolean isPermisoDuplicarTipoComisionConfig;
	public Boolean isPermisoOrdenTipoComisionConfig;
	
	
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
	
	public TipoComisionConfigParameterReturnGeneral tipocomisionconfigReturnGeneral;
	public TipoComisionConfigParameterReturnGeneral tipocomisionconfigParameterGeneral;
	
	

	public ComisionConfigLogic comisionconfigLogic=null;

	public ComisionConfigLogic getComisionConfigLogic() {
		return comisionconfigLogic;
	}

	public void setComisionConfigLogic(ComisionConfigLogic comisionconfigLogic) {
		this.comisionconfigLogic = comisionconfigLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoComisionConfig=false;
	public Boolean esParaAccionDesdeFormularioTipoComisionConfig=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoComisionConfigSessionBeanAdditional tipocomisionconfigSessionBeanAdditional=null;
	
	public TipoComisionConfigSessionBeanAdditional getTipoComisionConfigSessionBeanAdditional() {
		return this.tipocomisionconfigSessionBeanAdditional;
	}
	
	public void setTipoComisionConfigSessionBeanAdditional(TipoComisionConfigSessionBeanAdditional tipocomisionconfigSessionBeanAdditional) {
		try {
			this.tipocomisionconfigSessionBeanAdditional=tipocomisionconfigSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoComisionConfigBeanSwingJInternalFrameAdditional tipocomisionconfigBeanSwingJInternalFrameAdditional=null;
	//public class TipoComisionConfigBeanSwingJInternalFrame
	
	public TipoComisionConfigBeanSwingJInternalFrameAdditional getTipoComisionConfigBeanSwingJInternalFrameAdditional() {
		return this.tipocomisionconfigBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoComisionConfigBeanSwingJInternalFrameAdditional(TipoComisionConfigBeanSwingJInternalFrameAdditional tipocomisionconfigBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocomisionconfigBeanSwingJInternalFrameAdditional=tipocomisionconfigBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoComisionConfigLogic tipocomisionconfigLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoComisionConfig tipocomisionconfigBean;
	public TipoComisionConfigConstantesFunciones tipocomisionconfigConstantesFunciones;
	//public TipoComisionConfigParameterReturnGeneral tipocomisionconfigReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoComisionConfig> tipocomisionconfigs;	
	//public List<TipoComisionConfig> tipocomisionconfigsEliminados;
	//public List<TipoComisionConfig> tipocomisionconfigsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoComisionConfig=false;
	public Boolean isVisibilidadCeldaDuplicarTipoComisionConfig=true;
	public Boolean isVisibilidadCeldaCopiarTipoComisionConfig=true;
	public Boolean isVisibilidadCeldaVerFormTipoComisionConfig=true;
	public Boolean isVisibilidadCeldaOrdenTipoComisionConfig=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
	public Boolean isVisibilidadCeldaModificarTipoComisionConfig=false;
	public Boolean isVisibilidadCeldaActualizarTipoComisionConfig=false;
	public Boolean isVisibilidadCeldaEliminarTipoComisionConfig=false;
	public Boolean isVisibilidadCeldaCancelarTipoComisionConfig=false;
	public Boolean isVisibilidadCeldaGuardarTipoComisionConfig=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoComisionConfig() {
		return this.iIdNuevoTipoComisionConfig;
	}

	public void setiIdNuevoTipoComisionConfig(Long iIdNuevoTipoComisionConfig) {
		this.iIdNuevoTipoComisionConfig = iIdNuevoTipoComisionConfig;
	}
	
	public Long getidTipoComisionConfigActual() {
		return this.idTipoComisionConfigActual;
	}

	public void setidTipoComisionConfigActual(Long idTipoComisionConfigActual) {
		this.idTipoComisionConfigActual = idTipoComisionConfigActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoComisionConfig gettipocomisionconfig() {
		return this.tipocomisionconfig;
	}

	public void settipocomisionconfig(TipoComisionConfig tipocomisionconfig) {
		this.tipocomisionconfig = tipocomisionconfig;
	}
	
	public TipoComisionConfig gettipocomisionconfigAux() {
		return this.tipocomisionconfigAux;
	}

	public void settipocomisionconfigAux(TipoComisionConfig tipocomisionconfigAux) {
		this.tipocomisionconfigAux = tipocomisionconfigAux;
	}				
	
	public TipoComisionConfig gettipocomisionconfigAnterior() {
		return this.tipocomisionconfigAnterior;
	}

	public void settipocomisionconfigAnterior(TipoComisionConfig tipocomisionconfigAnterior) {
		this.tipocomisionconfigAnterior = tipocomisionconfigAnterior;
	}	
	
	public TipoComisionConfig gettipocomisionconfigTotales() {
		return this.tipocomisionconfigTotales;
	}

	public void settipocomisionconfigTotales(TipoComisionConfig tipocomisionconfigTotales) {
		this.tipocomisionconfigTotales = tipocomisionconfigTotales;
	}	
	
	public TipoComisionConfig gettipocomisionconfigBean() {
		return this.tipocomisionconfigBean;
	}

	public void settipocomisionconfigBean(TipoComisionConfig tipocomisionconfigBean) {
		this.tipocomisionconfigBean = tipocomisionconfigBean;
	}	
	
	public TipoComisionConfigParameterReturnGeneral gettipocomisionconfigReturnGeneral() {
		return this.tipocomisionconfigReturnGeneral;
	}

	public void settipocomisionconfigReturnGeneral(TipoComisionConfigParameterReturnGeneral tipocomisionconfigReturnGeneral) {
		this.tipocomisionconfigReturnGeneral = tipocomisionconfigReturnGeneral;
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
	
	
	public TipoComisionConfigLogic getTipoComisionConfigLogic()	{		
		return tipocomisionconfigLogic;
	}

	public void setTipoComisionConfigLogic(TipoComisionConfigLogic tipocomisionconfigLogic) {
		this.tipocomisionconfigLogic = tipocomisionconfigLogic;
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
	
	public Boolean getIsEsNuevoTipoComisionConfig() {
		return isEsNuevoTipoComisionConfig;
	}

	public void setIsEsNuevoTipoComisionConfig(Boolean isEsNuevoTipoComisionConfig) {
		this.isEsNuevoTipoComisionConfig = isEsNuevoTipoComisionConfig;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoComisionConfig() {
		return esParaAccionDesdeFormularioTipoComisionConfig;
	}
	
	public void setEsParaAccionDesdeFormularioTipoComisionConfig(Boolean esParaAccionDesdeFormularioTipoComisionConfig) {
		this.esParaAccionDesdeFormularioTipoComisionConfig = esParaAccionDesdeFormularioTipoComisionConfig;
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

			if(this.tipocomisionconfigSessionBean==null) {
				this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
			}

			if(!this.tipocomisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocomisionconfigSessionBean.getlidEmpresaActual());
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

					if(this.tipocomisionconfig!=null) {
						this.tipocomisionconfig.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
						this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoComisionConfig.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
						if(this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoComisionConfigGenerico)throws Exception
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
				jComboBoxid_empresaTipoComisionConfigGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoComisionConfigGenerico!=null && jComboBoxid_empresaTipoComisionConfigGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoComisionConfigGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoComisionConfig tipocomisionconfig,JComboBox jComboBoxid_empresaTipoComisionConfigGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoComisionConfigGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoComisionConfigGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocomisionconfig.setid_empresa(empresaAux.getId());
				tipocomisionconfig.setempresa_descripcion(TipoComisionConfigConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocomisionconfig.setEmpresa(empresaAux);			}
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

					if(!TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { 
							this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { 
					}

					if(!TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
							this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
							this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoComisionConfig() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoComisionConfigConstantesFunciones.refrescarForeignKeysDescripcionesTipoComisionConfig(this.tipocomisionconfigLogic.getTipoComisionConfigs());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoComisionConfigConstantesFunciones.refrescarForeignKeysDescripcionesTipoComisionConfig(this.tipocomisionconfigs);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocomisionconfigLogic.setTipoComisionConfigs(this.tipocomisionconfigs);
			tipocomisionconfigLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoComisionConfigParameterReturnGeneral getTipoComisionConfigParameterGeneral() {
		return this.tipocomisionconfigParameterGeneral;
	}
	
	public void setTipoComisionConfigParameterGeneral(TipoComisionConfigParameterReturnGeneral tipocomisionconfigParameterGeneral) {
		this.tipocomisionconfigParameterGeneral = tipocomisionconfigParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoComisionConfig() {
		return isPermisoTodoTipoComisionConfig;
	}

	public void setIsPermisoTodoTipoComisionConfig(Boolean isPermisoTodoTipoComisionConfig) {
		this.isPermisoTodoTipoComisionConfig = isPermisoTodoTipoComisionConfig;
	}

	public Boolean getIsPermisoNuevoTipoComisionConfig() {
		return isPermisoNuevoTipoComisionConfig;
	}

	public void setIsPermisoNuevoTipoComisionConfig(Boolean isPermisoNuevoTipoComisionConfig) {
		this.isPermisoNuevoTipoComisionConfig = isPermisoNuevoTipoComisionConfig;
	}

	public Boolean getIsPermisoActualizarTipoComisionConfig() {
		return isPermisoActualizarTipoComisionConfig;
	}

	public void setIsPermisoActualizarTipoComisionConfig(Boolean isPermisoActualizarTipoComisionConfig) {
		this.isPermisoActualizarTipoComisionConfig = isPermisoActualizarTipoComisionConfig;
	}

	public Boolean getIsPermisoEliminarTipoComisionConfig() {
		return isPermisoEliminarTipoComisionConfig;
	}

	public void setIsPermisoEliminarTipoComisionConfig(Boolean isPermisoEliminarTipoComisionConfig) {
		this.isPermisoEliminarTipoComisionConfig = isPermisoEliminarTipoComisionConfig;
	}

	public Boolean getIsPermisoGuardarCambiosTipoComisionConfig() {
		return isPermisoGuardarCambiosTipoComisionConfig;
	}

	public void setIsPermisoGuardarCambiosTipoComisionConfig(Boolean isPermisoGuardarCambiosTipoComisionConfig) {
		this.isPermisoGuardarCambiosTipoComisionConfig = isPermisoGuardarCambiosTipoComisionConfig;
	}
	
	public Boolean getIsPermisoConsultaTipoComisionConfig() {
		return isPermisoConsultaTipoComisionConfig;
	}

	public void setIsPermisoConsultaTipoComisionConfig(Boolean isPermisoConsultaTipoComisionConfig) {
		this.isPermisoConsultaTipoComisionConfig = isPermisoConsultaTipoComisionConfig;
	}

	public Boolean getIsPermisoBusquedaTipoComisionConfig() {
		return isPermisoBusquedaTipoComisionConfig;
	}

	public void setIsPermisoBusquedaTipoComisionConfig(Boolean isPermisoBusquedaTipoComisionConfig) {
		this.isPermisoBusquedaTipoComisionConfig = isPermisoBusquedaTipoComisionConfig;
	}

	public Boolean getIsPermisoReporteTipoComisionConfig() {
		return isPermisoReporteTipoComisionConfig;
	}

	public void setIsPermisoReporteTipoComisionConfig(Boolean isPermisoReporteTipoComisionConfig) {
		this.isPermisoReporteTipoComisionConfig = isPermisoReporteTipoComisionConfig;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoComisionConfig() {
		return isPermisoPaginacionMedioTipoComisionConfig;
	}

	public void setIsPermisoPaginacionMedioTipoComisionConfig(Boolean isPermisoPaginacionMedioTipoComisionConfig) {
		this.isPermisoPaginacionMedioTipoComisionConfig = isPermisoPaginacionMedioTipoComisionConfig;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoComisionConfig() {
		return isPermisoPaginacionTodoTipoComisionConfig;
	}

	public void setIsPermisoPaginacionTodoTipoComisionConfig(Boolean isPermisoPaginacionTodoTipoComisionConfig) {
		this.isPermisoPaginacionTodoTipoComisionConfig = isPermisoPaginacionTodoTipoComisionConfig;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoComisionConfig() {
		return isPermisoPaginacionAltoTipoComisionConfig;
	}

	public void setIsPermisoPaginacionAltoTipoComisionConfig(Boolean isPermisoPaginacionAltoTipoComisionConfig) {
		this.isPermisoPaginacionAltoTipoComisionConfig = isPermisoPaginacionAltoTipoComisionConfig;
	}
	
	public Boolean getIsPermisoCopiarTipoComisionConfig() {
		return isPermisoCopiarTipoComisionConfig;
	}

	public void setIsPermisoCopiarTipoComisionConfig(Boolean isPermisoCopiarTipoComisionConfig) {
		this.isPermisoCopiarTipoComisionConfig = isPermisoCopiarTipoComisionConfig;
	}
	
	public Boolean getIsPermisoVerFormTipoComisionConfig() {
		return isPermisoVerFormTipoComisionConfig;
	}

	public void setIsPermisoVerFormTipoComisionConfig(Boolean isPermisoVerFormTipoComisionConfig) {
		this.isPermisoVerFormTipoComisionConfig = isPermisoVerFormTipoComisionConfig;
	}
	
	public Boolean getIsPermisoDuplicarTipoComisionConfig() {
		return isPermisoDuplicarTipoComisionConfig;
	}

	public void setIsPermisoDuplicarTipoComisionConfig(Boolean isPermisoDuplicarTipoComisionConfig) {
		this.isPermisoDuplicarTipoComisionConfig = isPermisoDuplicarTipoComisionConfig;
	}
	
	public Boolean getIsPermisoOrdenTipoComisionConfig() {
		return isPermisoOrdenTipoComisionConfig;
	}

	public void setIsPermisoOrdenTipoComisionConfig(Boolean isPermisoOrdenTipoComisionConfig) {
		this.isPermisoOrdenTipoComisionConfig = isPermisoOrdenTipoComisionConfig;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoComisionConfig() {
		return isVisibilidadCeldaNuevoTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaNuevoTipoComisionConfig(Boolean isVisibilidadCeldaNuevoTipoComisionConfig) {
		this.isVisibilidadCeldaNuevoTipoComisionConfig = isVisibilidadCeldaNuevoTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoComisionConfig() {
		return isVisibilidadCeldaDuplicarTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaDuplicarTipoComisionConfig(Boolean isVisibilidadCeldaDuplicarTipoComisionConfig) {
		this.isVisibilidadCeldaDuplicarTipoComisionConfig = isVisibilidadCeldaDuplicarTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoComisionConfig() {
		return isVisibilidadCeldaCopiarTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaCopiarTipoComisionConfig(Boolean isVisibilidadCeldaCopiarTipoComisionConfig) {
		this.isVisibilidadCeldaCopiarTipoComisionConfig = isVisibilidadCeldaCopiarTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoComisionConfig() {
		return isVisibilidadCeldaVerFormTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaVerFormTipoComisionConfig(Boolean isVisibilidadCeldaVerFormTipoComisionConfig) {
		this.isVisibilidadCeldaVerFormTipoComisionConfig = isVisibilidadCeldaVerFormTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoComisionConfig() {
		return isVisibilidadCeldaOrdenTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaOrdenTipoComisionConfig(Boolean isVisibilidadCeldaOrdenTipoComisionConfig) {
		this.isVisibilidadCeldaOrdenTipoComisionConfig = isVisibilidadCeldaOrdenTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoComisionConfig() {
		return isVisibilidadCeldaNuevoRelacionesTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoComisionConfig(Boolean isVisibilidadCeldaNuevoRelacionesTipoComisionConfig) {
		this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig = isVisibilidadCeldaNuevoRelacionesTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoComisionConfig() {
		return isVisibilidadCeldaModificarTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaModificarTipoComisionConfig(Boolean isVisibilidadCeldaModificarTipoComisionConfig) {
		this.isVisibilidadCeldaModificarTipoComisionConfig = isVisibilidadCeldaModificarTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoComisionConfig() {
		return isVisibilidadCeldaActualizarTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaActualizarTipoComisionConfig(Boolean isVisibilidadCeldaActualizarTipoComisionConfig) {
		this.isVisibilidadCeldaActualizarTipoComisionConfig = isVisibilidadCeldaActualizarTipoComisionConfig;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoComisionConfig() {
		return isVisibilidadCeldaEliminarTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaEliminarTipoComisionConfig(Boolean isVisibilidadCeldaEliminarTipoComisionConfig) {
		this.isVisibilidadCeldaEliminarTipoComisionConfig = isVisibilidadCeldaEliminarTipoComisionConfig;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoComisionConfig() {
		return isVisibilidadCeldaCancelarTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaCancelarTipoComisionConfig(Boolean isVisibilidadCeldaCancelarTipoComisionConfig) {
		this.isVisibilidadCeldaCancelarTipoComisionConfig = isVisibilidadCeldaCancelarTipoComisionConfig;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoComisionConfig() {
		return isVisibilidadCeldaGuardarTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaGuardarTipoComisionConfig(Boolean isVisibilidadCeldaGuardarTipoComisionConfig) {
		this.isVisibilidadCeldaGuardarTipoComisionConfig = isVisibilidadCeldaGuardarTipoComisionConfig;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoComisionConfig() {
		return isVisibilidadCeldaGuardarCambiosTipoComisionConfig;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoComisionConfig(Boolean isVisibilidadCeldaGuardarCambiosTipoComisionConfig) {
		this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig = isVisibilidadCeldaGuardarCambiosTipoComisionConfig;
	}
		
	public TipoComisionConfigSessionBean gettipocomisionconfigSessionBean() {
		return this.tipocomisionconfigSessionBean;
	}
	
	public void settipocomisionconfigSessionBean(TipoComisionConfigSessionBean tipocomisionconfigSessionBean) {
		this.tipocomisionconfigSessionBean=tipocomisionconfigSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(TipoComisionConfig tipocomisionconfig)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocomisionconfig,null);
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
	
	public void bugActualizarReferenciaActual(TipoComisionConfig tipocomisionconfig,TipoComisionConfig tipocomisionconfigAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoComisionConfig(tipocomisionconfig);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocomisionconfigAux.setId(tipocomisionconfig.getId());
		tipocomisionconfigAux.setVersionRow(tipocomisionconfig.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoComisionConfig();
		
			int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocomisionconfigValidator.getInvalidValues(this.tipocomisionconfig);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocomisionconfigLogic.setDatosCliente(datosCliente);
			tipocomisionconfigLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocomisionconfigAux=new  TipoComisionConfig();
				
				tipocomisionconfigAux.setIsNew(true);
				tipocomisionconfigAux.setIsChanged(true);
				
				tipocomisionconfigAux.setTipoComisionConfigOriginal(this.tipocomisionconfig);
				
				tipocomisionconfigAux.setId(this.tipocomisionconfig.getId());	
				tipocomisionconfigAux.setVersionRow(this.tipocomisionconfig.getVersionRow());	
				tipocomisionconfigAux.setid_empresa(this.tipocomisionconfig.getid_empresa());	
				tipocomisionconfigAux.setcodigo(this.tipocomisionconfig.getcodigo());	
				tipocomisionconfigAux.setnombre(this.tipocomisionconfig.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocomisionconfigAux,tipocomisionconfigLogic.getTipoComisionConfigs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomisionconfigAux,tipocomisionconfigs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomisionconfigLogic.saveTipoComisionConfigs();//WithConnection
						//tipocomisionconfigLogic.getSetVersionRowTipoComisionConfigs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocomisionconfig,tipocomisionconfigAux);
					
					this.refrescarForeignKeysDescripcionesTipoComisionConfig();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs().addAll(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigs.addAll(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocomisionconfigLogic.saveTipoComisionConfigRelaciones(tipocomisionconfigAux,this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());//WithConnection
								//tipocomisionconfigLogic.getSetVersionRowTipoComisionConfigs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocomisionconfig,tipocomisionconfigAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigs= new ArrayList<ComisionConfig>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocomisionconfigAux.setComisionConfigs(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocomisionconfigAux,tipocomisionconfigLogic.getTipoComisionConfigs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocomisionconfigAux,tipocomisionconfigs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocomisionconfig,tipocomisionconfigAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocomisionconfigAux=new  TipoComisionConfig();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocomisionconfigSessionBean.getEsGuardarRelacionado() && this.tipocomisionconfig.getId()>=0)) {
						
					tipocomisionconfigAux.setIsNew(false);
				}
				
				tipocomisionconfigAux.setIsDeleted(false);
			
				tipocomisionconfigAux.setId(this.tipocomisionconfig.getId());	
				tipocomisionconfigAux.setVersionRow(this.tipocomisionconfig.getVersionRow());	
				tipocomisionconfigAux.setid_empresa(this.tipocomisionconfig.getid_empresa());	
				tipocomisionconfigAux.setcodigo(this.tipocomisionconfig.getcodigo());	
				tipocomisionconfigAux.setnombre(this.tipocomisionconfig.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocomisionconfigAux,tipocomisionconfigLogic.getTipoComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomisionconfigAux,tipocomisionconfigs);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomisionconfigLogic.saveTipoComisionConfigs();//WithConnection
						//tipocomisionconfigLogic.getSetVersionRowTipoComisionConfigs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocomisionconfig,tipocomisionconfigAux);
					
					this.refrescarForeignKeysDescripcionesTipoComisionConfig();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs().addAll(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigs.addAll(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocomisionconfigLogic.saveTipoComisionConfigRelaciones(tipocomisionconfigAux,this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());//WithConnection
								//tipocomisionconfigLogic.getSetVersionRowTipoComisionConfigs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocomisionconfig,tipocomisionconfigAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigs= new ArrayList<ComisionConfig>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocomisionconfigAux.setComisionConfigs(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocomisionconfigAux,tipocomisionconfigLogic.getTipoComisionConfigs());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocomisionconfigAux,tipocomisionconfigs);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocomisionconfig,tipocomisionconfigAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocomisionconfigAux=new  TipoComisionConfig();
				
				tipocomisionconfigAux.setIsNew(false);
				tipocomisionconfigAux.setIsChanged(false);
				
				tipocomisionconfigAux.setIsDeleted(true);
				
				tipocomisionconfigAux.setId(this.tipocomisionconfig.getId());	
				tipocomisionconfigAux.setVersionRow(this.tipocomisionconfig.getVersionRow());	
				tipocomisionconfigAux.setid_empresa(this.tipocomisionconfig.getid_empresa());	
				tipocomisionconfigAux.setcodigo(this.tipocomisionconfig.getcodigo());	
				tipocomisionconfigAux.setnombre(this.tipocomisionconfig.getnombre());	
				
				if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocomisionconfigAux.getId()>=0) {	
						this.tipocomisionconfigsEliminados.add(tipocomisionconfigAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocomisionconfigAux,tipocomisionconfigLogic.getTipoComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomisionconfigAux,tipocomisionconfigs);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomisionconfigLogic.saveTipoComisionConfigs();//WithConnection
						//tipocomisionconfigLogic.getSetVersionRowTipoComisionConfigs();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs().addAll(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigs.addAll(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisioncateBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionmarcaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionlineaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisionpenaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jInternalFrameDetalleFormComisionConfig.comisiongrupoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocomisionconfigLogic.saveTipoComisionConfigRelaciones(tipocomisionconfigAux,this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());//WithConnection
								//tipocomisionconfigLogic.getSetVersionRowTipoComisionConfigs();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(new ArrayList<ComisionConfig>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigs= new ArrayList<ComisionConfig>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocomisionconfigAux.setComisionConfigs(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocomisionconfigAux,tipocomisionconfigLogic.getTipoComisionConfigs());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocomisionconfigAux,tipocomisionconfigs);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.getTipoComisionConfigs().addAll(this.tipocomisionconfigsEliminados);
					
					tipocomisionconfigLogic.saveTipoComisionConfigs();//WithConnection
					//tipocomisionconfigLogic.getSetVersionRowTipoComisionConfigs();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoComisionConfig();
				
				this.tipocomisionconfigsEliminados= new ArrayList<TipoComisionConfig>();		
			}
			
			if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Comision Config GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocomisionconfig=tipocomisionconfigAux;
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
      		//this.finishProcessTipoComisionConfig();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoComisionConfig tipocomisionconfigLocal) throws Exception {
		
		if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocomisionconfigLocal.setComisionConfigs(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
			
			} else {
			
				tipocomisionconfigLocal.setComisionConfigs(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigs);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoComisionConfig tipocomisionconfigLocal) throws Exception {	
		if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocomisionconfigLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoComisionConfigActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocomisionconfigValidator.getInvalidValues(this.tipocomisionconfig);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoComisionConfig tipocomisionconfig,List<TipoComisionConfig> tipocomisionconfigs) throws Exception {
		try	{		
			TipoComisionConfigConstantesFunciones.actualizarLista(tipocomisionconfig,tipocomisionconfigs,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoComisionConfig tipocomisionconfig,List<TipoComisionConfig> tipocomisionconfigs) throws Exception {
		try	{			
			TipoComisionConfigConstantesFunciones.actualizarSelectedLista(tipocomisionconfig,tipocomisionconfigs);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoComisionConfig> tipocomisionconfigsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocomisionconfigsLocal=this.tipocomisionconfigLogic.getTipoComisionConfigs();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocomisionconfigsLocal=this.tipocomisionconfigs;
			}
			//ARCHITECTURE
		
			for(TipoComisionConfig tipocomisionconfigLocal:tipocomisionconfigsLocal) {
				if(this.permiteMantenimiento(tipocomisionconfigLocal) && tipocomisionconfigLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoComisionConfigConstantesFunciones.getTipoComisionConfigLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoComisionConfigConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelid_empresaTipoComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoComisionConfigConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelcodigoTipoComisionConfig,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoComisionConfigConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelnombreTipoComisionConfig,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelid_empresaTipoComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelcodigoTipoComisionConfig,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelnombreTipoComisionConfig,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ComisionConfig")) {
			if(this.tipocomisionconfig==null) {
				this.tipocomisionconfig= new TipoComisionConfig();
			}

			if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoComisionConfig
				this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);

				this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.getcomisionconfig().setTipoComisionConfig(this.tipocomisionconfig);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoComisionConfig--;	
		
		
		this.tipocomisionconfigAux=new TipoComisionConfig();
		
		this.tipocomisionconfigAux.setId(this.iIdNuevoTipoComisionConfig);
		this.tipocomisionconfigAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocomisionconfigLogic.getTipoComisionConfigs().add(this.tipocomisionconfigAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocomisionconfigs.add(this.tipocomisionconfigAux);
		}
		//ARCHITECTURE
		
		this.tipocomisionconfig=this.tipocomisionconfigAux;
		
		if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoComisionConfig(this.tipocomisionconfig);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoComisionConfig(this.tipocomisionconfig);
		}
				
		//this.setDefaultControlesTipoComisionConfig();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoComisionConfig();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoComisionConfig();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoComisionConfig();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoComisionConfig(this.tipocomisionconfigBean,this.tipocomisionconfig,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoComisionConfigConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
			classes=TipoComisionConfigConstantesFunciones.getClassesRelationshipsOfTipoComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocomisionconfigReturnGeneral=tipocomisionconfigLogic.procesarEventosTipoComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocomisionconfigLogic.getTipoComisionConfigs(),this.tipocomisionconfig,this.tipocomisionconfigParameterGeneral,this.isEsNuevoTipoComisionConfig,classes);//this.tipocomisionconfigLogic.getTipoComisionConfig()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoComisionConfig(this.tipocomisionconfigReturnGeneral,this.tipocomisionconfigBean,false);
		
		if(this.tipocomisionconfigReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoComisionConfig(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoComisionConfig(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig());
		}
		
		if(this.tipocomisionconfigReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoComisionConfig(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig(),classes);//this.tipocomisionconfigBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoComisionConfig();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoComisionConfig();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.RecargarFormTipoComisionConfig(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoComisionConfig(false);
						
			if(tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getEsGuardarRelacionado() && ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionConfigActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoComisionConfig();
			}
			
			this.actualizarVisualTableDatosTipoComisionConfig();
			
			this.jTableDatosTipoComisionConfig.setRowSelectionInterval(this.getIndiceNuevoTipoComisionConfig(), this.getIndiceNuevoTipoComisionConfig());
			
			this.seleccionarFilaTablaTipoComisionConfigActual();
						
			this.actualizarEstadoCeldasBotonesTipoComisionConfig("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoComisionConfig(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.setEnabled(isHabilitar && this.tipocomisionconfigConstantesFunciones.activarcodigoTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.setEnabled(isHabilitar && this.tipocomisionconfigConstantesFunciones.activarnombreTipoComisionConfig);	
		//
		this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setEnabled(isHabilitar && this.tipocomisionconfigConstantesFunciones.activarid_empresaTipoComisionConfig);
	};
	
	public void setDefaultControlesTipoComisionConfig() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoComisionConfig(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocomisionconfigSessionBean.setConGuardarRelaciones(true);			
			this.tipocomisionconfigSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocomisionconfigSessionBean.setConGuardarRelaciones(false);			
			this.tipocomisionconfigSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoComisionConfig() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
				if(tipocomisionconfigAux.getId().equals(this.iIdNuevoTipoComisionConfig)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigs) {
				if(tipocomisionconfigAux.getId().equals(this.iIdNuevoTipoComisionConfig)) {
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
	
	public int getIndiceActualTipoComisionConfig(TipoComisionConfig tipocomisionconfig,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
				if(tipocomisionconfigAux.getId().equals(tipocomisionconfig.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigs) {
				if(tipocomisionconfigAux.getId().equals(tipocomisionconfig.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoComisionConfig(TipoComisionConfig tipocomisionconfigOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
				if(tipocomisionconfigAux.getTipoComisionConfigOriginal().getId().equals(tipocomisionconfigOriginal.getId())) {
					existe=true;
					tipocomisionconfigOriginal.setId(tipocomisionconfigAux.getId());
					tipocomisionconfigOriginal.setVersionRow(tipocomisionconfigAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigs) {
				if(tipocomisionconfigAux.getTipoComisionConfigOriginal().getId().equals(tipocomisionconfigOriginal.getId())) {
					existe=true;
					tipocomisionconfigOriginal.setId(tipocomisionconfigAux.getId());
					tipocomisionconfigOriginal.setVersionRow(tipocomisionconfigAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoComisionConfig(Boolean esParaCancelar) throws Exception {
		tipocomisionconfigsAux=new ArrayList<TipoComisionConfig>();
		tipocomisionconfigAux=new TipoComisionConfig();
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
					if(tipocomisionconfigAux.getId()<0) {
						tipocomisionconfigsAux.add(tipocomisionconfigAux);
					}		
				}
				this.iIdNuevoTipoComisionConfig=0L;
				this.tipocomisionconfigLogic.getTipoComisionConfigs().removeAll(tipocomisionconfigsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigs) {
					if(tipocomisionconfigAux.getId()<0) {
						tipocomisionconfigsAux.add(tipocomisionconfigAux);
					}		
				}
				this.iIdNuevoTipoComisionConfig=0L;
				this.tipocomisionconfigs.removeAll(tipocomisionconfigsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoComisionConfig 
					&& this.tipocomisionconfigLogic.getTipoComisionConfigs().size()>0
					) {
					tipocomisionconfigAux=this.tipocomisionconfigLogic.getTipoComisionConfigs().get(this.tipocomisionconfigLogic.getTipoComisionConfigs().size() - 1);
				
					if(tipocomisionconfigAux.getId()<0) {
						this.tipocomisionconfigLogic.getTipoComisionConfigs().remove(tipocomisionconfigAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoComisionConfig && this.tipocomisionconfigs.size()>0) {
					tipocomisionconfigAux=this.tipocomisionconfigs.get(this.tipocomisionconfigs.size() - 1);
				
					if(tipocomisionconfigAux.getId()<0) {
						this.tipocomisionconfigs.remove(tipocomisionconfigAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoComisionConfig(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocomisionconfig.getId()<0) {
				this.tipocomisionconfigLogic.getTipoComisionConfigs().remove(this.tipocomisionconfig);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocomisionconfig.getId()<0) {
				this.tipocomisionconfigs.remove(this.tipocomisionconfig);
			}
		}			
	}
	
	public void setEstadosInicialesTipoComisionConfig(List<TipoComisionConfig> tipocomisionconfigsAux) throws Exception {
		TipoComisionConfigConstantesFunciones.setEstadosInicialesTipoComisionConfig(tipocomisionconfigsAux);
	}
	
	public void setEstadosInicialesTipoComisionConfig(TipoComisionConfig tipocomisionconfigAux) throws Exception {
		TipoComisionConfigConstantesFunciones.setEstadosInicialesTipoComisionConfig(tipocomisionconfigAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoComisionConfigActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoComisionConfigActual()) {
				if(!this.isEsNuevoTipoComisionConfig) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoComisionConfig=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoComisionConfigActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Comision Config ?", "MANTENIMIENTO DE Tipo Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoComisionConfig tipocomisionconfig) throws Exception {
		TipoComisionConfigConstantesFunciones.seleccionarAsignar(this.tipocomisionconfig,tipocomisionconfig);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoComisionConfig=this.isPermisoActualizarOriginalTipoComisionConfig;
			
			
			this.seleccionarAsignar(tipocomisionconfig);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoComisionConfigConstantesFunciones.quitarEspaciosTipoComisionConfig(this.tipocomisionconfig,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoComisionConfig("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocomisionconfigSessionBean.setsFuncionBusquedaRapida(this.tipocomisionconfigSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoComisionConfig) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoComisionConfig(esParaCancelar);				
				this.cancelarNuevoTipoComisionConfig(esParaCancelar);								
			}
			
			this.tipocomisionconfig=new TipoComisionConfig();
			
			this.inicializarTipoComisionConfig();
			
			this.actualizarEstadoCeldasBotonesTipoComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoComisionConfig() throws Exception {
		try {
			TipoComisionConfigConstantesFunciones.inicializarTipoComisionConfig(this.tipocomisionconfig);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocomisionconfigLogic.getTipoComisionConfigs().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoComisionConfigs(String sAccionBusqueda,List<TipoComisionConfig> tipocomisionconfigsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoComisionConfig"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoComisionConfigMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoComisionConfigMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoComisionConfig"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Comision Configes");		
		parameters.put("busquedapor", TipoComisionConfigConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ComisionConfig.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoComisionConfigLogic tipocomisionconfigLogicAuxiliar=new TipoComisionConfigLogic();
					tipocomisionconfigLogicAuxiliar.setDatosCliente(tipocomisionconfigLogic.getDatosCliente());				
					tipocomisionconfigLogicAuxiliar.setTipoComisionConfigs(tipocomisionconfigsParaReportes);
					
					tipocomisionconfigLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoComisionConfigWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocomisionconfigsParaReportes=tipocomisionconfigLogicAuxiliar.getTipoComisionConfigs();
					
					//tipocomisionconfigLogic.getNewConnexionToDeep();
					
					//for (TipoComisionConfig tipocomisionconfig:tipocomisionconfigsParaReportes) {
					//	tipocomisionconfigLogic.deepLoad(tipocomisionconfig, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocomisionconfigLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocomisionconfigLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileComisionConfig = AuxiliarReportes.class.getResourceAsStream("ComisionConfigDetalleRelacionesDesign.jasper");
			parameters.put("subreport_comisionconfig", reportFileComisionConfig);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoComisionConfig=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoComisionConfigConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoComisionConfig=new JRBeanArrayDataSource(TipoComisionConfigJInternalFrame.TraerTipoComisionConfigBeans(tipocomisionconfigsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoComisionConfig);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoComisionConfigConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoComisionConfigConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoComisionConfigBean.TraerTipoComisionConfigBeans(tipocomisionconfigsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,tipocomisionconfigsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,tipocomisionconfigsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoComisionConfigActionPerformed(null);
					//this.generarExcelReporteTipoComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,tipocomisionconfigsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,tipocomisionconfigsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,tipocomisionconfigsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoComisionConfigs(sAccionBusqueda,sTipoArchivoReporte,tipocomisionconfigsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoComisionConfigs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoComisionConfig> tipocomisionconfigsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomisionconfig";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoComisionConfigs");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoComisionConfig("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoComisionConfig tipocomisionconfig : tipocomisionconfigsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoComisionConfigConstantesFunciones.generarExcelReporteDataTipoComisionConfig("NORMAL",row,workbook,tipocomisionconfig,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoComisionConfig(String sTipo,Row row,Workbook workbook) {
		
		TipoComisionConfigConstantesFunciones.generarExcelReporteHeaderTipoComisionConfig(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoComisionConfigs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoComisionConfig> tipocomisionconfigsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomisionconfig_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoComisionConfigs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoComisionConfig tipocomisionconfig : tipocomisionconfigsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoComisionConfigConstantesFunciones.getTipoComisionConfigDescripcion(tipocomisionconfig));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocomisionconfig.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComisionConfigConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocomisionconfig.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocomisionconfig.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoComisionConfigs(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoComisionConfig> tipocomisionconfigsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoComisionConfig> tipocomisionconfigsRespaldo=null;
		
		classes=TipoComisionConfigConstantesFunciones.getClassesRelationshipsOfTipoComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocomisionconfigLogic.setDatosCliente(this.datosCliente);
		this.tipocomisionconfigLogic.setDatosDeep(this.datosDeep);
		this.tipocomisionconfigLogic.setIsConDeep(true);
		
		tipocomisionconfigsRespaldo=this.tipocomisionconfigLogic.getTipoComisionConfigs();
		
		this.tipocomisionconfigLogic.setTipoComisionConfigs(tipocomisionconfigsParaReportes);	
		this.tipocomisionconfigLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocomisionconfigsParaReportes=this.tipocomisionconfigLogic.getTipoComisionConfigs();
		this.tipocomisionconfigLogic.setTipoComisionConfigs(tipocomisionconfigsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomisionconfig_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoComisionConfigs");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoComisionConfig("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoComisionConfig tipocomisionconfig : tipocomisionconfigsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoComisionConfig("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoComisionConfigConstantesFunciones.generarExcelReporteDataTipoComisionConfig("NORMAL",row,workbook,tipocomisionconfig,cellStyleDataAux);
		
			
			


				//ComisionConfig
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ComisionConfigConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocomisionconfig.getComisionConfigs()!=null && tipocomisionconfig.getComisionConfigs().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ComisionConfigConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ComisionConfigConstantesFunciones.generarExcelReporteHeaderComisionConfig("RELACIONADO",row,workbook);
				}

				if(tipocomisionconfig.getComisionConfigs()!=null) {
					i2=0;
					for(ComisionConfig comisionconfig : tipocomisionconfig.getComisionConfigs()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ComisionConfigConstantesFunciones.generarExcelReporteDataComisionConfig("RELACIONADO",row,workbook,comisionconfig,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoComisionConfigConstantesFunciones.getTipoComisionConfigDescripcion(tipocomisionconfig));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoComisionConfig() throws Exception {		
		this.startProcessTipoComisionConfig(true);
	}
	
	public void startProcessTipoComisionConfig(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoComisionConfig ,this.jPanelParametrosReportesTipoComisionConfig, this.jScrollPanelDatosTipoComisionConfig,this.jPanelPaginacionTipoComisionConfig, this.jScrollPanelDatosEdicionTipoComisionConfig, this.jPanelAccionesTipoComisionConfig,this.jPanelAccionesFormularioTipoComisionConfig,this.jmenuBarTipoComisionConfig,this.jmenuBarDetalleTipoComisionConfig,this.jTtoolBarTipoComisionConfig,this.jTtoolBarDetalleTipoComisionConfig);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoComisionConfig=this.jTabbedPaneBusquedasTipoComisionConfig; 
		
		final JPanel jPanelParametrosReportesTipoComisionConfig=this.jPanelParametrosReportesTipoComisionConfig;
		//final JScrollPane jScrollPanelDatosTipoComisionConfig=this.jScrollPanelDatosTipoComisionConfig;
		final JTable jTableDatosTipoComisionConfig=this.jTableDatosTipoComisionConfig;		
		final JPanel jPanelPaginacionTipoComisionConfig=this.jPanelPaginacionTipoComisionConfig;
		//final JScrollPane jScrollPanelDatosEdicionTipoComisionConfig=this.jScrollPanelDatosEdicionTipoComisionConfig;
		final JPanel jPanelAccionesTipoComisionConfig=this.jPanelAccionesTipoComisionConfig;
		
		JPanel jPanelCamposAuxiliarTipoComisionConfig=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoComisionConfig=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			jPanelCamposAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jPanelCamposTipoComisionConfig;
			jPanelAccionesFormularioAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jPanelAccionesFormularioTipoComisionConfig;
		}
		
		final JPanel jPanelCamposTipoComisionConfig=jPanelCamposAuxiliarTipoComisionConfig;
		final JPanel jPanelAccionesFormularioTipoComisionConfig=jPanelAccionesFormularioAuxiliarTipoComisionConfig;
		
		
		final JMenuBar jmenuBarTipoComisionConfig=this.jmenuBarTipoComisionConfig;
		final JToolBar jTtoolBarTipoComisionConfig=this.jTtoolBarTipoComisionConfig;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoComisionConfig=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoComisionConfig=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			jmenuBarDetalleAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jmenuBarDetalleTipoComisionConfig;
			jTtoolBarDetalleAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jTtoolBarDetalleTipoComisionConfig;
		}
		
		final JMenuBar jmenuBarDetalleTipoComisionConfig=jmenuBarDetalleAuxiliarTipoComisionConfig;
		final JToolBar jTtoolBarDetalleTipoComisionConfig=jTtoolBarDetalleAuxiliarTipoComisionConfig;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoComisionConfig;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoComisionConfig;
			processRunnable.jTableDatos=jTableDatosTipoComisionConfig;
			processRunnable.jPanelCampos=jPanelCamposTipoComisionConfig;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoComisionConfig;
			processRunnable.jPanelAcciones=jPanelAccionesTipoComisionConfig;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoComisionConfig;
			
			
			processRunnable.jmenuBar=jmenuBarTipoComisionConfig;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoComisionConfig;
			processRunnable.jTtoolBar=jTtoolBarTipoComisionConfig;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoComisionConfig;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoComisionConfig ,jPanelParametrosReportesTipoComisionConfig,jTableDatosTipoComisionConfig, /*jScrollPanelDatosTipoComisionConfig,*/jPanelCamposTipoComisionConfig,jPanelPaginacionTipoComisionConfig, /*jScrollPanelDatosEdicionTipoComisionConfig,*/ jPanelAccionesTipoComisionConfig,jPanelAccionesFormularioTipoComisionConfig,jmenuBarTipoComisionConfig,jmenuBarDetalleTipoComisionConfig,jTtoolBarTipoComisionConfig,jTtoolBarDetalleTipoComisionConfig);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoComisionConfig ,jPanelParametrosReportesTipoComisionConfig, jScrollPanelDatosTipoComisionConfig,jPanelPaginacionTipoComisionConfig, jScrollPanelDatosEdicionTipoComisionConfig, jPanelAccionesTipoComisionConfig,jPanelAccionesFormularioTipoComisionConfig,jmenuBarTipoComisionConfig,jmenuBarDetalleTipoComisionConfig,jTtoolBarTipoComisionConfig,jTtoolBarDetalleTipoComisionConfig);
						
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
	
	public void finishProcessTipoComisionConfig() {// throws Exception 
		this.finishProcessTipoComisionConfig(true);
	}
	
	public void finishProcessTipoComisionConfig(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoComisionConfig ,this.jPanelParametrosReportesTipoComisionConfig, this.jScrollPanelDatosTipoComisionConfig,this.jPanelPaginacionTipoComisionConfig, this.jScrollPanelDatosEdicionTipoComisionConfig, this.jPanelAccionesTipoComisionConfig,this.jPanelAccionesFormularioTipoComisionConfig,this.jmenuBarTipoComisionConfig,this.jmenuBarDetalleTipoComisionConfig,this.jTtoolBarTipoComisionConfig,this.jTtoolBarDetalleTipoComisionConfig);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoComisionConfig=this.jTabbedPaneBusquedasTipoComisionConfig; 
		
		final JPanel jPanelParametrosReportesTipoComisionConfig=this.jPanelParametrosReportesTipoComisionConfig;
		//final JScrollPane jScrollPanelDatosTipoComisionConfig=this.jScrollPanelDatosTipoComisionConfig;
		final JTable jTableDatosTipoComisionConfig=this.jTableDatosTipoComisionConfig;		
		final JPanel jPanelPaginacionTipoComisionConfig=this.jPanelPaginacionTipoComisionConfig;
		//final JScrollPane jScrollPanelDatosEdicionTipoComisionConfig=this.jScrollPanelDatosEdicionTipoComisionConfig;
		final JPanel jPanelAccionesTipoComisionConfig=this.jPanelAccionesTipoComisionConfig;
		
		JPanel jPanelCamposAuxiliarTipoComisionConfig=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoComisionConfig=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			jPanelCamposAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jPanelCamposTipoComisionConfig;
			jPanelAccionesFormularioAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jPanelAccionesFormularioTipoComisionConfig;
		}
		
		final JPanel jPanelCamposTipoComisionConfig=jPanelCamposAuxiliarTipoComisionConfig;
		final JPanel jPanelAccionesFormularioTipoComisionConfig=jPanelAccionesFormularioAuxiliarTipoComisionConfig;
		
		
		final JMenuBar jmenuBarTipoComisionConfig=this.jmenuBarTipoComisionConfig;		
		final JToolBar jTtoolBarTipoComisionConfig=this.jTtoolBarTipoComisionConfig;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoComisionConfig=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoComisionConfig=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			jmenuBarDetalleAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jmenuBarDetalleTipoComisionConfig;
			jTtoolBarDetalleAuxiliarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jTtoolBarDetalleTipoComisionConfig;		
		}
		
		final JMenuBar jmenuBarDetalleTipoComisionConfig=jmenuBarDetalleAuxiliarTipoComisionConfig;
		final JToolBar jTtoolBarDetalleTipoComisionConfig=jTtoolBarDetalleAuxiliarTipoComisionConfig;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoComisionConfig;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoComisionConfig;
			processRunnable.jTableDatos=jTableDatosTipoComisionConfig;
			processRunnable.jPanelCampos=jPanelCamposTipoComisionConfig;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoComisionConfig;
			processRunnable.jPanelAcciones=jPanelAccionesTipoComisionConfig;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoComisionConfig;
			
			
			processRunnable.jmenuBar=jmenuBarTipoComisionConfig;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoComisionConfig;
			processRunnable.jTtoolBar=jTtoolBarTipoComisionConfig;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoComisionConfig;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoComisionConfig ,jPanelParametrosReportesTipoComisionConfig, jTableDatosTipoComisionConfig,/*jScrollPanelDatosTipoComisionConfig,*/jPanelCamposTipoComisionConfig,jPanelPaginacionTipoComisionConfig, /*jScrollPanelDatosEdicionTipoComisionConfig,*/ jPanelAccionesTipoComisionConfig,jPanelAccionesFormularioTipoComisionConfig,jmenuBarTipoComisionConfig,jmenuBarDetalleTipoComisionConfig,jTtoolBarTipoComisionConfig,jTtoolBarDetalleTipoComisionConfig));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoComisionConfig(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoComisionConfig(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoComisionConfig(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoComisionConfig(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoComisionConfig,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoComisionConfig,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoComisionConfig(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoComisionConfig,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoComisionConfig,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocomisionconfigConstantesFunciones.getsFinalQueryTipoComisionConfig();
		String  finalQueryPaginacionTodos=this.tipocomisionconfigConstantesFunciones.getsFinalQueryTipoComisionConfig();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoComisionConfigConstantesFunciones.getArrayColumnasGlobalesNoTipoComisionConfig(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoComisionConfigConstantesFunciones.getArrayColumnasGlobalesTipoComisionConfig(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoComisionConfigConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocomisionconfigsEliminados= new ArrayList<TipoComisionConfig>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoComisionConfig();
		
				///*TipoComisionConfigSessionBean*/this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
			
			if(this.tipocomisionconfigSessionBean==null) {
				this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
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
					this.iNumeroPaginacion=TipoComisionConfigConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoComisionConfigConstantesFunciones.getClassesForeignKeysOfTipoComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocomisionconfig."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocomisionconfigsAux= new ArrayList<TipoComisionConfig>();
			
				
			tipocomisionconfigLogic.setDatosCliente(this.datosCliente);
			tipocomisionconfigLogic.setDatosDeep(this.datosDeep);
			tipocomisionconfigLogic.setIsConDeep(true);
			
			
			tipocomisionconfigLogic.getTipoComisionConfigDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocomisionconfigLogic.getTodosTipoComisionConfigs(finalQueryGlobal,pagination);
					
					//tipocomisionconfigLogic.getTodosTipoComisionConfigsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocomisionconfigLogic.getTipoComisionConfigs()==null|| tipocomisionconfigLogic.getTipoComisionConfigs().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomisionconfigsAux= new ArrayList<TipoComisionConfig>();
							tipocomisionconfigsAux.addAll(tipocomisionconfigLogic.getTipoComisionConfigs());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomisionconfigsAux= new ArrayList<TipoComisionConfig>();
							tipocomisionconfigsAux.addAll(tipocomisionconfigs);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomisionconfigLogic.getTodosTipoComisionConfigs(finalQueryGlobal+"",this.pagination);												
							
							//tipocomisionconfigLogic.getTodosTipoComisionConfigsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigLogic.getTipoComisionConfigs() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocomisionconfigLogic.setTipoComisionConfigs(new ArrayList<TipoComisionConfig>());					
							tipocomisionconfigLogic.getTipoComisionConfigs().addAll(tipocomisionconfigsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomisionconfigs=new ArrayList<TipoComisionConfig>();
							tipocomisionconfigs.addAll(tipocomisionconfigsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoComisionConfig=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoComisionConfig=this.idActual;
				
				} else if(this.idTipoComisionConfigActual!=null && this.idTipoComisionConfigActual!=0L) {
					idTipoComisionConfig=idTipoComisionConfigActual;
				}
				
					
				this.sDetalleReporte=TipoComisionConfigConstantesFunciones.getDetalleIndicePorId(idTipoComisionConfig);
				
				this.tipocomisionconfigs=new ArrayList<TipoComisionConfig>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocomisionconfigLogic.getEntity(idTipoComisionConfig);
					
					//tipocomisionconfigLogic.getEntityWithConnection(idTipoComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomisionconfigLogic.setTipoComisionConfigs(new ArrayList<TipoComisionConfig>());
					tipocomisionconfigLogic.getTipoComisionConfigs().add(tipocomisionconfigLogic.getTipoComisionConfig());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocomisionconfigs=new ArrayList<TipoComisionConfig>();
					this.tipocomisionconfigs.add(tipocomisionconfig);
				}
				
				if(tipocomisionconfigLogic.getTipoComisionConfig()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocomisionconfigLogic.getTipoComisionConfigsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocomisionconfigLogic.getTipoComisionConfigs()==null||tipocomisionconfigLogic.getTipoComisionConfigs().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocomisionconfigs==null|| tipocomisionconfigs.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomisionconfigsAux=new ArrayList<TipoComisionConfig>();
						tipocomisionconfigsAux.addAll(tipocomisionconfigLogic.getTipoComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomisionconfigsAux=new ArrayList<TipoComisionConfig>();
							tipocomisionconfigsAux.addAll(tipocomisionconfigs);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocomisionconfigLogic.getTipoComisionConfigsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoComisionConfigConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoComisionConfigs("FK_IdEmpresa",tipocomisionconfigLogic.getTipoComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoComisionConfigs("FK_IdEmpresa",tipocomisionconfigs);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomisionconfigLogic.setTipoComisionConfigs(new ArrayList<TipoComisionConfig>());
						tipocomisionconfigLogic.getTipoComisionConfigs().addAll(tipocomisionconfigsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomisionconfigs=new ArrayList<TipoComisionConfig>();
							tipocomisionconfigs.addAll(tipocomisionconfigsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoComisionConfig();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoComisionConfig();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocomisionconfigLogic.getTipoComisionConfigs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocomisionconfigs.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocomisionconfigLogic.getTipoComisionConfigs().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocomisionconfigs.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoComisionConfig tipocomisionconfig) {
		Boolean permite=true;
		
		if(this.tipocomisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoComisionConfigConstantesFunciones.getOrderByListaTipoComisionConfig();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoComisionConfigConstantesFunciones.getOrderByListaTipoComisionConfig();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComisionConfig tipocomisionconfig:tipocomisionconfigLogic.getTipoComisionConfigs()) {
				if(tipocomisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomisionconfigTotales=tipocomisionconfig;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComisionConfig tipocomisionconfig:this.tipocomisionconfigs) {
				if(tipocomisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomisionconfigTotales=tipocomisionconfig;
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
			this.tipocomisionconfigAux=new TipoComisionConfig();
			this.tipocomisionconfigAux.setsType(Constantes2.S_TOTALES);
			this.tipocomisionconfigAux.setIsNew(false);
			this.tipocomisionconfigAux.setIsChanged(false);
			this.tipocomisionconfigAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoComisionConfigConstantesFunciones.TotalizarValoresFilaTipoComisionConfig(this.tipocomisionconfigLogic.getTipoComisionConfigs(),this.tipocomisionconfigAux);
				
				this.tipocomisionconfigLogic.getTipoComisionConfigs().add(this.tipocomisionconfigAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoComisionConfigConstantesFunciones.TotalizarValoresFilaTipoComisionConfig(this.tipocomisionconfigs,this.tipocomisionconfigAux);
				
				this.tipocomisionconfigs.add(this.tipocomisionconfigAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocomisionconfigTotales=new TipoComisionConfig();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocomisionconfigLogic.getTipoComisionConfigs().remove(tipocomisionconfigTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocomisionconfigs.remove(tipocomisionconfigTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocomisionconfigTotales=new TipoComisionConfig();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoComisionConfig tipocomisionconfig:tipocomisionconfigLogic.getTipoComisionConfigs()) {
				if(tipocomisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomisionconfigTotales=tipocomisionconfig;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoComisionConfigConstantesFunciones.TotalizarValoresFilaTipoComisionConfig(this.tipocomisionconfigLogic.getTipoComisionConfigs(),tipocomisionconfigTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoComisionConfig tipocomisionconfig:this.tipocomisionconfigs) {
				if(tipocomisionconfig.getsType().equals(Constantes2.S_TOTALES)) {
					tipocomisionconfigTotales=tipocomisionconfig;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoComisionConfigConstantesFunciones.TotalizarValoresFilaTipoComisionConfig(this.tipocomisionconfigs,tipocomisionconfigTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoComisionConfigsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoComisionConfigsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomisionconfigLogic.getTipoComisionConfigsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoComisionConfig() {
		this.isPermisoTodoTipoComisionConfig=false;
		this.isPermisoNuevoTipoComisionConfig=false;
		this.isPermisoActualizarTipoComisionConfig=false;
		this.isPermisoActualizarOriginalTipoComisionConfig=false;
		this.isPermisoEliminarTipoComisionConfig=false;
		this.isPermisoGuardarCambiosTipoComisionConfig=false;
		this.isPermisoConsultaTipoComisionConfig=false;
		this.isPermisoBusquedaTipoComisionConfig=false;
		this.isPermisoReporteTipoComisionConfig=false;		
		this.isPermisoOrdenTipoComisionConfig=false;		
		this.isPermisoPaginacionMedioTipoComisionConfig=false;		
		this.isPermisoPaginacionAltoTipoComisionConfig=false;
		this.isPermisoPaginacionTodoTipoComisionConfig=false;
		this.isPermisoCopiarTipoComisionConfig=false;		
		this.isPermisoVerFormTipoComisionConfig=false;		
		this.isPermisoDuplicarTipoComisionConfig=false;		
		this.isPermisoOrdenTipoComisionConfig=false;		
	}
	
	public void setPermisosUsuarioTipoComisionConfig(Boolean isPermiso) {
		this.isPermisoTodoTipoComisionConfig=isPermiso;
		this.isPermisoNuevoTipoComisionConfig=isPermiso;
		this.isPermisoActualizarTipoComisionConfig=isPermiso;
		this.isPermisoActualizarOriginalTipoComisionConfig=isPermiso;
		this.isPermisoEliminarTipoComisionConfig=isPermiso;
		this.isPermisoGuardarCambiosTipoComisionConfig=isPermiso;
		this.isPermisoConsultaTipoComisionConfig=isPermiso;
		this.isPermisoBusquedaTipoComisionConfig=isPermiso;
		this.isPermisoReporteTipoComisionConfig=isPermiso;
		this.isPermisoOrdenTipoComisionConfig=isPermiso;		
		this.isPermisoPaginacionMedioTipoComisionConfig=isPermiso;		
		this.isPermisoPaginacionAltoTipoComisionConfig=isPermiso;		
		this.isPermisoPaginacionTodoTipoComisionConfig=isPermiso;		
		this.isPermisoCopiarTipoComisionConfig=isPermiso;		
		this.isPermisoVerFormTipoComisionConfig=isPermiso;		
		this.isPermisoDuplicarTipoComisionConfig=isPermiso;
		this.isPermisoOrdenTipoComisionConfig=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoComisionConfig(Boolean isPermiso) {
		//this.isPermisoTodoTipoComisionConfig=isPermiso;
		this.isPermisoNuevoTipoComisionConfig=isPermiso;
		this.isPermisoActualizarTipoComisionConfig=isPermiso;
		this.isPermisoActualizarOriginalTipoComisionConfig=isPermiso;
		this.isPermisoEliminarTipoComisionConfig=isPermiso;
		this.isPermisoGuardarCambiosTipoComisionConfig=isPermiso;
		//this.isPermisoConsultaTipoComisionConfig=isPermiso;
		//this.isPermisoBusquedaTipoComisionConfig=isPermiso;
		//this.isPermisoReporteTipoComisionConfig=isPermiso;
		//this.isPermisoOrdenTipoComisionConfig=isPermiso;		
		//this.isPermisoPaginacionMedioTipoComisionConfig=isPermiso;		
		//this.isPermisoPaginacionAltoTipoComisionConfig=isPermiso;		
		//this.isPermisoPaginacionTodoTipoComisionConfig=isPermiso;		
		//this.isPermisoCopiarTipoComisionConfig=isPermiso;		
		//this.isPermisoDuplicarTipoComisionConfig=isPermiso;
		//this.isPermisoOrdenTipoComisionConfig=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoComisionConfigClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ComisionConfigConstantesFunciones.SNOMBREOPCION);
		
		if(TipoComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosComisionConfig=false;
		this.isTienePermisosComisionConfig=this.verificarGetPermisosUsuarioOpcionTipoComisionConfigClaseRelacionada(this.opcionsRelacionadas,ComisionConfigConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoComisionConfig(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoComisionConfigClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosComisionConfig=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoComisionConfigClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoComisionConfigClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoComisionConfigClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosComisionConfig && this.jInternalFrameDetalleFormTipoComisionConfig!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.remove(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoComisionConfig() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoComisionConfigConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoComisionConfig=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoComisionConfig=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoComisionConfig=this.isPermisoActualizarTipoComisionConfig;
			this.isPermisoEliminarTipoComisionConfig=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoComisionConfig=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoComisionConfig=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoComisionConfig=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoComisionConfig=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoComisionConfig=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoComisionConfig=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoComisionConfig=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoComisionConfig=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoComisionConfig=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoComisionConfig=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoComisionConfig=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoComisionConfig=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoComisionConfig=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoComisionConfig.setToolTipText(this.jTableDatosTipoComisionConfig.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoComisionConfig(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoComisionConfig(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoComisionConfig() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosComisionConfig && this.tipocomisionconfigConstantesFunciones.mostrarComisionConfigTipoComisionConfig && !TipoComisionConfigConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Comision Config");
			reporte.setsDescripcion("Comision Config");
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
	public void inicializarCombosForeignKeyTipoComisionConfigListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoComisionConfigListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoComisionConfigJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoComisionConfigListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoComisionConfigListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoComisionConfigParameterReturnGeneral tipocomisionconfigReturnGeneral=new TipoComisionConfigParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocomisionconfigConstantesFunciones.cargarid_empresaTipoComisionConfig)
					 || (this.esRecargarFks && this.tipocomisionconfigConstantesFunciones.cargarid_empresaTipoComisionConfig)) {

					if(!this.tipocomisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocomisionconfigSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocomisionconfigReturnGeneral=tipocomisionconfigLogic.cargarCombosLoteForeignKeyTipoComisionConfig(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocomisionconfigReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoComisionConfig()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocomisionconfigSessionBean==null) {
				this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
			}

			if(!this.tipocomisionconfigSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoComisionConfig()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoComisionConfig(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoComisionConfig()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoComisionConfig();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoComisionConfig(TipoComisionConfig tipocomisionconfig)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoComisionConfig(TipoComisionConfig tipocomisionconfig,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoComisionConfig()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoComisionConfig()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoComisionConfig()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoComisionConfig()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoComisionConfig()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoComisionConfig()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoComisionConfig(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoComisionConfig()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig!=null && this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoComisionConfigBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoComisionConfigBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoComisionConfigBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean(); 
		this.tipocomisionconfigConstantesFunciones=new TipoComisionConfigConstantesFunciones(); 
		this.tipocomisionconfigBean=new TipoComisionConfig();//(this.tipocomisionconfigConstantesFunciones); 		
		this.tipocomisionconfigReturnGeneral=new TipoComisionConfigParameterReturnGeneral(); 
		
		this.tipocomisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoComisionConfigBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoComisionConfigBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoComisionConfigBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoComisionConfig(true);
			
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
			
			this.tipocomisionconfigConstantesFunciones=new TipoComisionConfigConstantesFunciones(); 
			this.tipocomisionconfigBean=new TipoComisionConfig();//this.tipocomisionconfigConstantesFunciones); 			
			this.tipocomisionconfigReturnGeneral=new TipoComisionConfigParameterReturnGeneral(); 
		
			TipoComisionConfigBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Comision Config Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocomisionconfig=new TipoComisionConfig();
			this.tipocomisionconfigs = new ArrayList<TipoComisionConfig>();
			this.tipocomisionconfigsAux = new ArrayList<TipoComisionConfig>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic=new TipoComisionConfigLogic();
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocomisionconfigSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocomisionconfigSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoComisionConfig);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoComisionConfig);	
					}
					
					if(this.jInternalFrameImportacionTipoComisionConfig!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoComisionConfig);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoComisionConfig!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoComisionConfig);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoComisionConfig);
				this.jInternalFrameDetalleFormTipoComisionConfig.setVisible(false);
				this.jInternalFrameDetalleFormTipoComisionConfig.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoComisionConfig);
					this.jInternalFrameReporteDinamicoTipoComisionConfig.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoComisionConfig.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoComisionConfig!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoComisionConfig);
					this.jInternalFrameImportacionTipoComisionConfig.setVisible(false);
					this.jInternalFrameImportacionTipoComisionConfig.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoComisionConfig!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoComisionConfig);
					this.jInternalFrameOrderByTipoComisionConfig.setVisible(false);
					this.jInternalFrameOrderByTipoComisionConfig.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoComisionConfigActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoComisionConfigConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocomisionconfigReturnGeneral=new TipoComisionConfigParameterReturnGeneral();
			
			this.tipocomisionconfigParameterGeneral=new TipoComisionConfigParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocomisionconfigLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoComisionConfigJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ComisionConfigConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoComisionConfigConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado(),this.tipocomisionconfigSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoComisionConfigConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado(),this.tipocomisionconfigSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
			this.isVisibilidadCeldaDuplicarTipoComisionConfig=true;
			this.isVisibilidadCeldaCopiarTipoComisionConfig=true;
			this.isVisibilidadCeldaVerFormTipoComisionConfig=true;
			this.isVisibilidadCeldaOrdenTipoComisionConfig=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
			this.isVisibilidadCeldaModificarTipoComisionConfig=false;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=false;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoComisionConfig();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoComisionConfig(false);
			
			this.setPermisosUsuarioTipoComisionConfig();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocomisionconfigSessionBean.getEsGuardarRelacionado() && this.tipocomisionconfigSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoComisionConfigClasesRelacionadas();
			}
			
			if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoComisionConfigClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoComisionConfig();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoComisionConfig();
			}
			
			if(!this.isPermisoBusquedaTipoComisionConfig) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoComisionConfig,this.isPermisoPaginacionMedioTipoComisionConfig,this.isPermisoPaginacionTodoTipoComisionConfig);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoComisionConfigConstantesFunciones.getTiposSeleccionarTipoComisionConfig());
				
				this.tiposColumnasSelect=TipoComisionConfigConstantesFunciones.getTiposSeleccionarTipoComisionConfig(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoComisionConfig();				
				//this.tiposRelacionesSelect=TipoComisionConfigConstantesFunciones.getTiposRelacionesTipoComisionConfig(true);
				
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
			//if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoComisionConfig();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoComisionConfig(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoComisionConfig(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoComisionConfig() ;
			
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
			
			
			this.comisionconfigLogic=new ComisionConfigLogic(); 
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
				tipocomisionconfigImplementable= (TipoComisionConfigImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoComisionConfigConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocomisionconfigImplementableHome= (TipoComisionConfigImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoComisionConfigConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocomisionconfigs= new ArrayList<TipoComisionConfig>();
			this.tipocomisionconfigsEliminados= new ArrayList<TipoComisionConfig>();
						
			this.isEsNuevoTipoComisionConfig=false;
			this.esParaAccionDesdeFormularioTipoComisionConfig=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoComisionConfig(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoComisionConfig();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoComisionConfigBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoComisionConfigConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoComisionConfig("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoComisionConfig(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoComisionConfig();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoComisionConfig();
			}
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoComisionConfig.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoComisionConfig.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoComisionConfig.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoComisionConfig(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoComisionConfig: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoComisionConfig() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoComisionConfig")) {
				iIndex=this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();	
				
				

				if(sTitle.equals("Comision Configes")) {
					if(!ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoComisionConfig();

						this.cargarParteTabPanelRelacionadaComisionConfig(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoComisionConfig();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaComisionConfig(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoComisionConfig.cargarSessionConBeanSwingJInternalFrameComisionConfig(false,true,iIndex);
		this.jButtonComisionConfigActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaComisionConfig();

		//this.jTabbedPaneRelacionesTipoComisionConfig.updateUI();
		//this.jTabbedPaneRelacionesTipoComisionConfig.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoComisionConfig.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ComisionConfig")) {
				int row=this.jTableDatosTipoComisionConfig.getSelectedRow();
				jButtonComisionConfigActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Comision Config")) {

					if(this.isTienePermisosComisionConfig && this.tipocomisionconfigConstantesFunciones.mostrarComisionConfigTipoComisionConfig && !TipoComisionConfigConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Comision Configes"+"("+ComisionConfigConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Comision Configes");

						if(tipocomisionconfigConstantesFunciones.resaltarComisionConfigTipoComisionConfig!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocomisionconfigConstantesFunciones.resaltarComisionConfigTipoComisionConfig);
						}

						jmenuItem.setEnabled(this.tipocomisionconfigConstantesFunciones.activarComisionConfigTipoComisionConfig);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ComisionConfig"));

						

						this.jInternalFrameDetalleFormTipoComisionConfig.jmenuDetalleTipoComisionConfig.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoComisionConfig(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoComisionConfig(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoComisionConfig(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoComisionConfigListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoComisionConfig();
		
		this.cargarCombosFrameForeignKeyTipoComisionConfig();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoComisionConfig();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoComisionConfig();
		}
	}
	
	
	
	public void jButtonNuevoTipoComisionConfigActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
			
			if(jTableDatosTipoComisionConfig.getRowCount()>=1) {
				jTableDatosTipoComisionConfig.removeRowSelectionInterval(0, jTableDatosTipoComisionConfig.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoComisionConfig=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoComisionConfig(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoComisionConfig(true);			
			//this.tipocomisionconfig=new TipoComisionConfig();
			//this.tipocomisionconfig.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoComisionConfig(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComisionConfig() ;
			
			if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoComisionConfig(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocomisionconfig);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);				
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
			if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoComisionConfig: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoComisionConfigActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoComisionConfig.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoComisionConfig.getSelectedRows().length;			
			}
			
			tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoComisionConfig--;			
				//TipoComisionConfig tipocomisionconfigAux= new TipoComisionConfig();			
				//tipocomisionconfigAux.setId(this.iIdNuevoTipoComisionConfig);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoComisionConfig tipocomisionconfigOrigen=new TipoComisionConfig();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoComisionConfig tipocomisionconfigOrigen : tipocomisionconfigsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocomisionconfigOrigen =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocomisionconfigOrigen =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoComisionConfig();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocomisionconfig.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoComisionConfig(tipocomisionconfigOrigen,this.tipocomisionconfig,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocomisionconfigLogic.getTipoComisionConfigs().add(this.tipocomisionconfigAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocomisionconfigs.add(this.tipocomisionconfigAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoComisionConfig(false);
				
				this.jTableDatosTipoComisionConfig.setRowSelectionInterval(this.getIndiceNuevoTipoComisionConfig(), this.getIndiceNuevoTipoComisionConfig());
				
				int iLastRow =  this.jTableDatosTipoComisionConfig.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoComisionConfig.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoComisionConfig.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoComisionConfig(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();									
		
			TipoComisionConfig tipocomisionconfigOrigen=new TipoComisionConfig();
			TipoComisionConfig tipocomisionconfigDestino=new TipoComisionConfig();
				
			tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoComisionConfig.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocomisionconfigsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoComisionConfig.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomisionconfigOrigen =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocomisionconfigOrigen =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocomisionconfigDestino =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocomisionconfigDestino =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocomisionconfigOrigen =tipocomisionconfigsSeleccionados.get(0);
				tipocomisionconfigDestino =tipocomisionconfigsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoComisionConfig(tipocomisionconfigOrigen,tipocomisionconfigDestino,true,false);
				
				tipocomisionconfigDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocomisionconfigDestino,tipocomisionconfigLogic.getTipoComisionConfigs());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocomisionconfigDestino,tipocomisionconfigs);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoComisionConfig(false);
				
				//this.jTableDatosTipoComisionConfig.setRowSelectionInterval(this.getIndiceNuevoTipoComisionConfig(), this.getIndiceNuevoTipoComisionConfig());
				
				int iLastRow =  this.jTableDatosTipoComisionConfig.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoComisionConfig.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoComisionConfig.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoComisionConfig(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoComisionConfig.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoComisionConfig.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoComisionConfig.setVisible(!isVisible);
			this.jPanelPaginacionTipoComisionConfig.setVisible(!isVisible);
			this.jPanelAccionesTipoComisionConfig.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoComisionConfig();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoComisionConfig();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoComisionConfig();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoComisionConfig();
			
			this.abrirFrameOrderByTipoComisionConfig();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoComisionConfig();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoComisionConfig(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoComisionConfig);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoComisionConfig.isMaximum()) {
					this.jInternalFrameDetalleFormTipoComisionConfig.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoComisionConfig.setSize(this.jInternalFrameDetalleFormTipoComisionConfig.iWidthFormulario,this.jInternalFrameDetalleFormTipoComisionConfig.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoComisionConfig.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoComisionConfig.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoComisionConfig.isMaximum()) {
						this.jInternalFrameDetalleFormTipoComisionConfig.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoComisionConfig.jContentPaneDetalleTipoComisionConfig.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoComisionConfig.jContentPaneDetalleTipoComisionConfig.getWidth(),TipoComisionConfigConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoComisionConfig.jContentPaneDetalleTipoComisionConfig.getWidth(),TipoComisionConfigConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoComisionConfig.jContentPaneDetalleTipoComisionConfig.getWidth(),TipoComisionConfigConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaComisionConfig();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoComisionConfig.setVisible(true);
	        this.jInternalFrameDetalleFormTipoComisionConfig.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoComisionConfig() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoComisionConfig==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComisionConfig,false,this);
				} else {
					this.jInternalFrameOrderByTipoComisionConfig=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoComisionConfig,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoComisionConfig);
				this.jInternalFrameOrderByTipoComisionConfig.setVisible(false);
				this.jInternalFrameOrderByTipoComisionConfig.setSelected(false);
				
				this.jInternalFrameOrderByTipoComisionConfig.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoComisionConfig"));
				
				this.inicializarActualizarBindingTablaOrderByTipoComisionConfig();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoComisionConfig() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoComisionConfig==null) {
				
				this.jInternalFrameImportacionTipoComisionConfig=new ImportacionJInternalFrame(TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoComisionConfig);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoComisionConfig);
				this.jInternalFrameImportacionTipoComisionConfig.setVisible(false);
				this.jInternalFrameImportacionTipoComisionConfig.setSelected(false);


				this.jInternalFrameImportacionTipoComisionConfig.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoComisionConfig"));
				this.jInternalFrameImportacionTipoComisionConfig.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoComisionConfig"));
				this.jInternalFrameImportacionTipoComisionConfig.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoComisionConfig"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoComisionConfig() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoComisionConfig==null) {
				this.jInternalFrameReporteDinamicoTipoComisionConfig=new ReporteDinamicoJInternalFrame(TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoComisionConfig);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoComisionConfig);
				this.jInternalFrameReporteDinamicoTipoComisionConfig.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoComisionConfig.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoComisionConfig"));
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoComisionConfig"));
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoComisionConfig"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoComisionConfig();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaComisionConfig() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoComisionConfig.jContentPaneDetalleTipoComisionConfig.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoComisionConfig() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoComisionConfig);
			
	       	this.jInternalFrameDetalleFormTipoComisionConfig.setVisible(false);
	        this.jInternalFrameDetalleFormTipoComisionConfig.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoComisionConfig.dispose();
			//this.jInternalFrameDetalleFormTipoComisionConfig=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoComisionConfig() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoComisionConfig.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoComisionConfig.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoComisionConfig() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoComisionConfig.setVisible(true);
	        this.jInternalFrameImportacionTipoComisionConfig.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoComisionConfig() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoComisionConfig.setVisible(true);
	        this.jInternalFrameOrderByTipoComisionConfig.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoComisionConfig() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoComisionConfig.setVisible(false);
	        this.jInternalFrameOrderByTipoComisionConfig.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoComisionConfig() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoComisionConfig.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoComisionConfig.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoComisionConfig() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoComisionConfig.setVisible(false);
	        this.jInternalFrameImportacionTipoComisionConfig.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoComisionConfig(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoComisionConfig(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoComisionConfig(true);
			//this.isEsNuevoTipoComisionConfig=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoComisionConfig("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoComisionConfig(false) ;
			
			if(tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getEsGuardarRelacionado() && ComisionConfigJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonComisionConfigActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoComisionConfig(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComisionConfig(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoComisionConfigActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoComisionConfig(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoComisionConfig(true);
			//this.isEsNuevoTipoComisionConfig=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocomisionconfig.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoComisionConfig("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoComisionConfig(false) ;
			
			if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoComisionConfig(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComisionConfig(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoComisionConfig(false);
			
			//if(!this.isEsNuevoTipoComisionConfig) {								
				int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
				
			}
			
			if(this.permiteMantenimiento(this.tipocomisionconfig)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoComisionConfig=true;
					this.inicializarActualizarBindingTablaTipoComisionConfig(false);
					this.isEsNuevoTipoComisionConfig=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoComisionConfig=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoComisionConfig=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoComisionConfig(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoComisionConfig(false);
				
				this.habilitarDeshabilitarControlesTipoComisionConfig(false);
			
												
				
				if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoComisionConfig();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoComisionConfigActionPerformed(evt,tipocomisionconfigSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoComisionConfig(this.tipocomisionconfig,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoComisionConfig.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocomisionconfigSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocomisionconfig.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				this.tipocomisionconfig.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				this.tipocomisionconfig.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocomisionconfig)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoComisionConfigModel) this.jTableDatosTipoComisionConfig.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoComisionConfig=true;
				this.inicializarActualizarBindingTablaTipoComisionConfig(false);
				this.isEsNuevoTipoComisionConfig=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoComisionConfig(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoComisionConfig(false);
				
				this.habilitarDeshabilitarControlesTipoComisionConfig(false);
				
				
				
				if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoComisionConfig();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoComisionConfig.getRowCount()>=1) {
				jTableDatosTipoComisionConfig.removeRowSelectionInterval(0, jTableDatosTipoComisionConfig.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoComisionConfig(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoComisionConfig(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoComisionConfig(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoComisionConfig(false) ;
			
			this.isEsNuevoTipoComisionConfig=false;
			
			if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoComisionConfig();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoComisionConfig(false);
				
				//SI ES MANUAL
				if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoComisionConfig();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoComisionConfig--;			
			//TipoComisionConfig tipocomisionconfigAux= new TipoComisionConfig();			
			//tipocomisionconfigAux.setId(this.iIdNuevoTipoComisionConfig);
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoComisionConfig();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
			
			this.tipocomisionconfig.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocomisionconfigLogic.getTipoComisionConfigs().add(this.tipocomisionconfigAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocomisionconfigs.add(this.tipocomisionconfigAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoComisionConfig(false);
			
			this.jTableDatosTipoComisionConfig.setRowSelectionInterval(this.getIndiceNuevoTipoComisionConfig(), this.getIndiceNuevoTipoComisionConfig());
			
			int iLastRow =  this.jTableDatosTipoComisionConfig.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoComisionConfig.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoComisionConfig.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoComisionConfig(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoComisionConfig(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComisionConfig(false);
			
			//SI ES MANUAL
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoComisionConfig();
			}
			
			//this.abrirFrameTreeTipoComisionConfig();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Comision ConfigES ?", "MANTENIMIENTO DE Tipo Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoComisionConfig.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoComisionConfig();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocomisionconfigReturnGeneral=tipocomisionconfigLogic.procesarImportacionTipoComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocomisionconfigParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoComisionConfigReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoComisionConfig.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoComisionConfig.setFileImportacion(this.jInternalFrameImportacionTipoComisionConfig.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoComisionConfig.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoComisionConfig.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoComisionConfig.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoComisionConfig.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		

		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoComisionConfigBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoComisionConfigBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoComisionConfigConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoComisionConfigConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoComisionConfig.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomisionconfig";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoComisionConfigs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoComisionConfig tipocomisionconfig:tipocomisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocomisionconfig.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoComisionConfig tipocomisionconfig:tipocomisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocomisionconfig.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoComisionConfigConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoComisionConfig tipocomisionconfig:tipocomisionconfigsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocomisionconfig.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoComisionConfig(row);				
			//	iRow++;
			//}				
			
			//for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoComisionConfig(tipocomisionconfigAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComisionConfig(false);
			
			//SI ES MANUAL
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoComisionConfig();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComisionConfig(false);
			
			//SI ES MANUAL
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoComisionConfig();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoComisionConfig(false);
			
			//SI ES MANUAL
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoComisionConfig();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoComisionConfig() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoComisionConfig.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoComisionConfig.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoComisionConfig.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoComisionConfig.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoComisionConfig.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoComisionConfig.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoComisionConfig.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoComisionConfig(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoComisionConfig(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoComisionConfig(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoComisionConfig(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoComisionConfig(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoComisionConfig(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoComisionConfig(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoComisionConfig(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoComisionConfig() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoComisionConfig();
		
		this.inicializarActualizarBindingBotonesManualTipoComisionConfig(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoComisionConfig();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoComisionConfig() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoComisionConfig(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoComisionConfig(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoComisionConfig.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoComisionConfig.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoComisionConfig.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoComisionConfig.jCheckBoxPostAccionNuevoTipoComisionConfig.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoComisionConfig.jCheckBoxPostAccionSinCerrarTipoComisionConfig.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoComisionConfig.jCheckBoxPostAccionSinMensajeTipoComisionConfig.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoComisionConfig.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoComisionConfig.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoComisionConfig.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
				this.jInternalFrameDetalleFormTipoComisionConfig.jCheckBoxPostAccionNuevoTipoComisionConfig.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoComisionConfig.jCheckBoxPostAccionSinCerrarTipoComisionConfig.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoComisionConfig.jCheckBoxPostAccionSinMensajeTipoComisionConfig.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoComisionConfig.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoComisionConfig.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoComisionConfig.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoComisionConfig.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoComisionConfig.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoComisionConfig.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoComisionConfig.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoComisionConfig.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoComisionConfig.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoComisionConfig(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoComisionConfig(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoComisionConfig() throws Exception {
		try	{
			if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoComisionConfig();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoComisionConfig() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoComisionConfig() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoComisionConfig.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoComisionConfig.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoComisionConfig.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoComisionConfig.addItem(reporte);
			}
			
			
			if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoComisionConfig.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoComisionConfig.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoComisionConfig.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoComisionConfig.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoComisionConfig.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoComisionConfig.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoComisionConfig.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoComisionConfig();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoComisionConfig() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoComisionConfig.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoComisionConfig.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoComisionConfig()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoComisionConfig(Boolean esInicializar) throws Exception {				
		if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoComisionConfig();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoComisionConfig() throws Exception {
		this.inicializarActualizarBindingTablaTipoComisionConfig(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoComisionConfig() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoComisionConfigOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfigOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoComisionConfig(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocomisionconfigLogic.getTipoComisionConfigs().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocomisionconfigs.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoComisionConfig.setModel(new TipoComisionConfigModel(this.tipocomisionconfigLogic.getTipoComisionConfigs(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoComisionConfig.setModel(new TipoComisionConfigModel(this.tipocomisionconfigs,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoComisionConfig!=null && this.jInternalFrameOrderByTipoComisionConfig.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoComisionConfig();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfig,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO,tipocomisionconfigConstantesFunciones.resaltarSeleccionarTipoComisionConfig,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoComisionConfigConstantesFunciones.SCLASSWEBTITULO,tipocomisionconfigConstantesFunciones.resaltarSeleccionarTipoComisionConfig,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfig,TipoComisionConfigConstantesFunciones.LABEL_ID));

		if(this.tipocomisionconfigConstantesFunciones.mostraridTipoComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComisionConfigConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocomisionconfigConstantesFunciones.resaltaridTipoComisionConfig,this.tipocomisionconfigConstantesFunciones.activaridTipoComisionConfig,this,true,"idTipoComisionConfig","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomisionconfigConstantesFunciones.resaltaridTipoComisionConfig,this.tipocomisionconfigConstantesFunciones.activaridTipoComisionConfig,this,true,"idTipoComisionConfig","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfig,TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocomisionconfigConstantesFunciones.mostrarid_empresaTipoComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocomisionconfigConstantesFunciones.resaltarid_empresaTipoComisionConfig,this,this.tipocomisionconfigConstantesFunciones.activarid_empresaTipoComisionConfig));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocomisionconfigConstantesFunciones.resaltarid_empresaTipoComisionConfig,this,this.tipocomisionconfigConstantesFunciones.activarid_empresaTipoComisionConfig,false,"id_empresaTipoComisionConfig","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfig,TipoComisionConfigConstantesFunciones.LABEL_CODIGO));

		if(this.tipocomisionconfigConstantesFunciones.mostrarcodigoTipoComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComisionConfigConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocomisionconfigConstantesFunciones.resaltarcodigoTipoComisionConfig,this.tipocomisionconfigConstantesFunciones.activarcodigoTipoComisionConfig,this,true,"codigoTipoComisionConfig","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomisionconfigConstantesFunciones.resaltarcodigoTipoComisionConfig,this.tipocomisionconfigConstantesFunciones.activarcodigoTipoComisionConfig,this,true,"codigoTipoComisionConfig","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfig,TipoComisionConfigConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocomisionconfigConstantesFunciones.mostrarnombreTipoComisionConfig && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoComisionConfigConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocomisionconfigConstantesFunciones.resaltarnombreTipoComisionConfig,this.tipocomisionconfigConstantesFunciones.activarnombreTipoComisionConfig,this,true,"nombreTipoComisionConfig","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocomisionconfigConstantesFunciones.resaltarnombreTipoComisionConfig,this.tipocomisionconfigConstantesFunciones.activarnombreTipoComisionConfig,this,true,"nombreTipoComisionConfig","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoComisionConfigPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosComisionConfig && this.tipocomisionconfigConstantesFunciones.mostrarComisionConfigTipoComisionConfig && !TipoComisionConfigConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Comision Configes");
				tableColumn.setHeaderValue("Comision Configes");
				tableColumn.setCellRenderer(new ComisionConfigTableCell(tipocomisionconfigConstantesFunciones.resaltarComisionConfigTipoComisionConfig,this,this.tipocomisionconfigConstantesFunciones.activarComisionConfigTipoComisionConfig));
				tableColumn.setCellEditor(new ComisionConfigTableCell(tipocomisionconfigConstantesFunciones.resaltarComisionConfigTipoComisionConfig,this,this.tipocomisionconfigConstantesFunciones.activarComisionConfigTipoComisionConfig));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoComisionConfig.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoComisionConfig.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoComisionConfig.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoComisionConfig.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoComisionConfig.addColumn(tableColumn);
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
			
			this.jTableDatosTipoComisionConfig.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoComisionConfig.moveColumn(this.jTableDatosTipoComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoComisionConfig.moveColumn(this.jTableDatosTipoComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoComisionConfig.moveColumn(this.jTableDatosTipoComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoComisionConfig.moveColumn(this.jTableDatosTipoComisionConfig.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoComisionConfig.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoComisionConfig.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoComisionConfig,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoComisionConfig.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoComisionConfig.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoComisionConfig.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoComisionConfig.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocomisionconfigLogic.getTipoComisionConfigs().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocomisionconfigs.size()-1;
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
		//this.jTableDatosTipoComisionConfig.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoComisionConfig.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoComisionConfig();
			
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
				
				//this.isEsNuevoTipoComisionConfig=false;
					
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
				if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoComisionConfig==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoComisionConfig.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoComisionConfig.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocomisionconfig.getsType().equals("DUPLICADO")
				   || this.tipocomisionconfig.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoComisionConfig=true;
				
				} else {
					this.isEsNuevoTipoComisionConfig=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocomisionconfig.getId()>=0 && !this.tipocomisionconfig.getIsNew()) {						
						this.isEsNuevoTipoComisionConfig=false;
						
					} else {
						this.isEsNuevoTipoComisionConfig=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoComisionConfig(esRelaciones);						
				
				this.seleccionarTipoComisionConfig(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocomisionconfig.getId()<0) {
					this.isEsNuevoTipoComisionConfig=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoComisionConfig(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoComisionConfig(evt,rowIndex);
				}	
				
				if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoComisionConfig: " + this.dDif); 
					}
				}								
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoComisionConfig(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocomisionconfig)) {
					if(this.tipocomisionconfig.getId()>0) {
						this.tipocomisionconfig.setIsDeleted(true);
						
						this.tipocomisionconfigsEliminados.add(this.tipocomisionconfig);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocomisionconfigLogic.getTipoComisionConfigs().remove(this.tipocomisionconfig);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocomisionconfigs.remove(this.tipocomisionconfig);				
					}
					
					
					((TipoComisionConfigModel) this.jTableDatosTipoComisionConfig.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoComisionConfig(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoComisionConfig(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoComisionConfig) {
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoComisionConfig.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoComisionConfig.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoComisionConfig(this.tipocomisionconfig);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocomisionconfigConstantesFunciones.cargarid_empresaTipoComisionConfig || this.tipocomisionconfigConstantesFunciones.event_dependid_empresaTipoComisionConfig) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocomisionconfig.getid_empresa());
									//this.inicializarActualizarBindingTipoComisionConfig(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocomisionconfig.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocomisionconfig.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocomisionconfig.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoComisionConfig("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoComisionConfig(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoComisionConfig() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoComisionConfig(TipoComisionConfig tipocomisionconfig) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoComisionConfig(tipocomisionconfig,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoComisionConfig(TipoComisionConfig tipocomisionconfig,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoComisionConfig(tipocomisionconfig);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoComisionConfig(tipocomisionconfig,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoComisionConfig(tipocomisionconfig);
	}
	
	public void setVariablesObjetoActualToFormularioTipoComisionConfig(TipoComisionConfig tipocomisionconfig) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.setText(tipocomisionconfig.getId().toString());
			this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.setText(tipocomisionconfig.getcodigo());
			this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.setText(tipocomisionconfig.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoComisionConfig tipocomisionconfigLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocomisionconfigLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoComisionConfig tipocomisionconfigLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocomisionconfigLocal=this.tipocomisionconfig;
			} else {
				tipocomisionconfigLocal=this.tipocomisionconfigAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocomisionconfigLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoComisionConfig(tipocomisionconfigLocal,true);
					
					if(tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocomisionconfigLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocomisionconfigLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoComisionConfig(TipoComisionConfig tipocomisionconfig,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoComisionConfig(tipocomisionconfig,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(tipocomisionconfig);
	}
	
	public void setVariablesFormularioToObjetoActualTipoComisionConfig(TipoComisionConfig tipocomisionconfig,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoComisionConfig(tipocomisionconfig,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoComisionConfig(TipoComisionConfig tipocomisionconfig,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.getText()==null || this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.getText()=="" || this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.setText("0");
			}

			if(conColumnasBase) {tipocomisionconfig.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComisionConfigConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelIdTipoComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocomisionconfig.setcodigo(this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComisionConfigConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelcodigoTipoComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocomisionconfig.setnombre(this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoComisionConfigConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoComisionConfig.jLabelnombreTipoComisionConfig,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoComisionConfig(TipoComisionConfig tipocomisionconfigBean,TipoComisionConfig tipocomisionconfig,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoComisionConfig(TipoComisionConfig tipocomisionconfigOrigen,TipoComisionConfig tipocomisionconfig,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocomisionconfigOrigen.getId()!=null && !tipocomisionconfigOrigen.getId().equals(0L))) {tipocomisionconfig.setId(tipocomisionconfigOrigen.getId());}}
			if(conDefault || (!conDefault && tipocomisionconfigOrigen.getcodigo()!=null && !tipocomisionconfigOrigen.getcodigo().equals(""))) {tipocomisionconfig.setcodigo(tipocomisionconfigOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocomisionconfigOrigen.getnombre()!=null && !tipocomisionconfigOrigen.getnombre().equals(""))) {tipocomisionconfig.setnombre(tipocomisionconfigOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoComisionConfig(TipoComisionConfig tipocomisionconfig) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.setText(tipocomisionconfig.getId().toString());
			this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.setText(tipocomisionconfig.getcodigo());
			this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.setText(tipocomisionconfig.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoComisionConfig(TipoComisionConfigBean tipocomisionconfigBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.setText(tipocomisionconfigBean.getId().toString());
			this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.setText(tipocomisionconfigBean.getcodigo());
			this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.setText(tipocomisionconfigBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoComisionConfig(TipoComisionConfigParameterReturnGeneral tipocomisionconfigReturnGeneral,TipoComisionConfigBean tipocomisionconfigBean,Boolean conDefault) throws Exception { 
		try {
			TipoComisionConfig tipocomisionconfigLocal=new TipoComisionConfig();
			
			tipocomisionconfigLocal=tipocomisionconfigReturnGeneral.getTipoComisionConfig();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocomisionconfigLocal.getId()!=null && !tipocomisionconfigLocal.getId().equals(0L))) {tipocomisionconfigBean.setId(tipocomisionconfigLocal.getId());}}
			if(conDefault || (!conDefault && tipocomisionconfigLocal.getcodigo()!=null && !tipocomisionconfigLocal.getcodigo().equals(""))) {tipocomisionconfigBean.setcodigo(tipocomisionconfigLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocomisionconfigLocal.getnombre()!=null && !tipocomisionconfigLocal.getnombre().equals(""))) {tipocomisionconfigBean.setnombre(tipocomisionconfigLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoComisionConfigGenerico(Long idTipoComisionConfigSeleccionado,JComboBox jComboBoxTipoComisionConfig,List<TipoComisionConfig> tipocomisionconfigsLocal)throws Exception {
		try {
			TipoComisionConfig  tipocomisionconfigTemp=null;

			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsLocal) {
				if(tipocomisionconfigAux.getId()!=null && tipocomisionconfigAux.getId().equals(idTipoComisionConfigSeleccionado)) {
					tipocomisionconfigTemp=tipocomisionconfigAux;
					break;
				}
			}

			jComboBoxTipoComisionConfig.setSelectedItem(tipocomisionconfigTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoComisionConfigGenerico(JComboBox jComboBoxTipoComisionConfig,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoComisionConfig.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoComisionConfig.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoComisionConfig.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoComisionConfig.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoComisionConfig.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoComisionConfig.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ComisionConfig")) {
			jButtonComisionConfigActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomisionconfig=(TipoComisionConfig) tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocomisionconfig =(TipoComisionConfig) tipocomisionconfigs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocomisionconfig.getIsNew() && !tipocomisionconfig.getIsChanged() && !tipocomisionconfig.getIsDeleted()) {
				sDescripcion=tipocomisionconfig.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocomisionconfig.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoComisionConfig tipocomisionconfigRow=new TipoComisionConfig();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomisionconfigRow=(TipoComisionConfig) tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocomisionconfigRow=(TipoComisionConfig) tipocomisionconfigs.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonComisionConfigActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoComisionConfig tipocomisionconfig) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoComisionConfig==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomisionconfig = (TipoComisionConfig)this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocomisionconfig = (TipoComisionConfig)this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocomisionconfig!=null) {
						this.tipocomisionconfig = tipocomisionconfig;
					} else {
						this.tipocomisionconfig = new TipoComisionConfig();
					}
				}

				if(this.isTienePermisosComisionConfig && this.permiteMantenimiento(this.tipocomisionconfig)) {
					ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFramePopup=new ComisionConfigBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						comisionconfigBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFramePopup;
					} else {
						comisionconfigBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame;
					}

					List<TipoComisionConfig> tipocomisionconfigs=new ArrayList<TipoComisionConfig>();
					tipocomisionconfigs.add(this.tipocomisionconfig);
					if(!esRelacionado) {
						//comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setConGuardarRelaciones(false);
						//comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					comisionconfigBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoComisionConfig.cargarComisionConfigBeanSwingJInternalFrame(tipocomisionconfigs,this.tipocomisionconfig,comisionconfigBeanSwingJInternalFrame,/*conInicializar,*/comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getConGuardarRelaciones(),comisionconfigBeanSwingJInternalFrame.comisionconfigSessionBean.getEsGuardarRelacionado());
					comisionconfigBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						comisionconfigBeanSwingJInternalFrame.actualizarEstadoPanelsComisionConfig("no_relacionado");

						comisionconfigBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ComisionConfigConstantesFunciones.ITAMANIOFILATABLA + (ComisionConfigConstantesFunciones.ITAMANIOFILATABLA/2));

						comisionconfigBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoComisionConfig=(TitledBorder)this.jScrollPanelDatosTipoComisionConfig.getBorder();
						TitledBorder titledBorderComisionConfig=(TitledBorder)comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getBorder();

						titledBorderComisionConfig.setTitle(titledBorderTipoComisionConfig.getTitle() + " -> Comision Config");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,comisionconfigBeanSwingJInternalFrame);
						}

						comisionconfigBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(comisionconfigBeanSwingJInternalFrame);

						comisionconfigBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Comision Config",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoComisionConfig(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig));			
			this.jButtonDuplicarTipoComisionConfig.setVisible((this.isVisibilidadCeldaDuplicarTipoComisionConfig && this.isPermisoDuplicarTipoComisionConfig));			
			this.jButtonCopiarTipoComisionConfig.setVisible((this.isVisibilidadCeldaCopiarTipoComisionConfig && this.isPermisoCopiarTipoComisionConfig));
			this.jButtonVerFormTipoComisionConfig.setVisible((this.isVisibilidadCeldaVerFormTipoComisionConfig && this.isPermisoVerFormTipoComisionConfig));
			
			this.jButtonAbrirOrderByTipoComisionConfig.setVisible((this.isVisibilidadCeldaOrdenTipoComisionConfig && this.isPermisoOrdenTipoComisionConfig));			
			
			this.jButtonNuevoRelacionesTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig));			
			this.jButtonNuevoGuardarCambiosTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarTipoComisionConfig.setVisible((this.isVisibilidadCeldaModificarTipoComisionConfig && this.isPermisoActualizarTipoComisionConfig));	
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarTipoComisionConfig.setVisible((this.isVisibilidadCeldaActualizarTipoComisionConfig && this.isPermisoActualizarTipoComisionConfig));	
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarTipoComisionConfig.setVisible((this.isVisibilidadCeldaEliminarTipoComisionConfig && this.isPermisoEliminarTipoComisionConfig));
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarTipoComisionConfig.setVisible(this.isVisibilidadCeldaCancelarTipoComisionConfig);							
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.setVisible((this.isVisibilidadCeldaGuardarTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoComisionConfig.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig));						
			this.jButtonDuplicarToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaDuplicarTipoComisionConfig && this.isPermisoDuplicarTipoComisionConfig));						
			this.jButtonCopiarToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaCopiarTipoComisionConfig && this.isPermisoCopiarTipoComisionConfig));			
			this.jButtonVerFormToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaVerFormTipoComisionConfig && this.isPermisoVerFormTipoComisionConfig));			
			this.jButtonAbrirOrderByToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaOrdenTipoComisionConfig && this.isPermisoOrdenTipoComisionConfig));
			this.jButtonNuevoRelacionesToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig));			
			this.jButtonNuevoGuardarCambiosToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));			
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaModificarTipoComisionConfig && this.isPermisoActualizarTipoComisionConfig));	
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaActualizarTipoComisionConfig  && this.isPermisoActualizarTipoComisionConfig));	
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaEliminarTipoComisionConfig && this.isPermisoEliminarTipoComisionConfig));
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarToolBarTipoComisionConfig.setVisible(this.isVisibilidadCeldaCancelarTipoComisionConfig);				
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaGuardarTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoComisionConfig.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig));			
			this.jMenuItemDuplicarTipoComisionConfig.setVisible((this.isVisibilidadCeldaDuplicarTipoComisionConfig && this.isPermisoDuplicarTipoComisionConfig));			
			this.jMenuItemCopiarTipoComisionConfig.setVisible((this.isVisibilidadCeldaCopiarTipoComisionConfig && this.isPermisoCopiarTipoComisionConfig));			
			this.jMenuItemVerFormTipoComisionConfig.setVisible((this.isVisibilidadCeldaVerFormTipoComisionConfig && this.isPermisoVerFormTipoComisionConfig));			
			this.jMenuItemAbrirOrderByTipoComisionConfig.setVisible((this.isVisibilidadCeldaOrdenTipoComisionConfig && this.isPermisoOrdenTipoComisionConfig));			
			//this.jMenuItemMostrarOcultarTipoComisionConfig.setVisible((this.isVisibilidadCeldaOrdenTipoComisionConfig && this.isPermisoOrdenTipoComisionConfig));
			this.jMenuItemDetalleAbrirOrderByTipoComisionConfig.setVisible((this.isVisibilidadCeldaOrdenTipoComisionConfig && this.isPermisoOrdenTipoComisionConfig));			
			//this.jMenuItemDetalleMostrarOcultarTipoComisionConfig.setVisible((this.isVisibilidadCeldaOrdenTipoComisionConfig && this.isPermisoOrdenTipoComisionConfig));			
			this.jMenuItemNuevoRelacionesTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig));			
			this.jMenuItemNuevoGuardarCambiosTipoComisionConfig.setVisible((this.isVisibilidadCeldaNuevoTipoComisionConfig && this.isPermisoNuevoTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));									
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemModificarTipoComisionConfig.setVisible((this.isVisibilidadCeldaModificarTipoComisionConfig && this.isPermisoActualizarTipoComisionConfig));	
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemActualizarTipoComisionConfig.setVisible((this.isVisibilidadCeldaActualizarTipoComisionConfig && this.isPermisoActualizarTipoComisionConfig));	
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemEliminarTipoComisionConfig.setVisible((this.isVisibilidadCeldaEliminarTipoComisionConfig && this.isPermisoEliminarTipoComisionConfig));
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemCancelarTipoComisionConfig.setVisible(this.isVisibilidadCeldaCancelarTipoComisionConfig);				
			}
			
			this.jMenuItemGuardarCambiosTipoComisionConfig.setVisible((this.isVisibilidadCeldaGuardarTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));						
			this.jMenuItemGuardarCambiosTablaTipoComisionConfig.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=this.jButtonNuevoTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaDuplicarTipoComisionConfig=this.jButtonDuplicarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaCopiarTipoComisionConfig=this.jButtonCopiarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaVerFormTipoComisionConfig=this.jButtonVerFormTipoComisionConfig.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoComisionConfig=this.jButtonAbrirOrderByTipoComisionConfig.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=this.jButtonNuevoRelacionesTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaModificarTipoComisionConfig=this.jButtonModificarTipoComisionConfig.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.isVisibilidadCeldaActualizarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaEliminarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaCancelarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaGuardarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=this.jButtonGuardarCambiosTablaTipoComisionConfig.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoComisionConfig=this.jButtonNuevoToolBarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=this.jButtonNuevoRelacionesToolBarTipoComisionConfig.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.isVisibilidadCeldaModificarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarToolBarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaActualizarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarToolBarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaEliminarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarToolBarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaCancelarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarToolBarTipoComisionConfig.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoComisionConfig=this.jButtonGuardarCambiosToolBarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=this.jButtonGuardarCambiosTablaToolBarTipoComisionConfig.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoComisionConfig=this.jMenuItemNuevoTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=this.jMenuItemNuevoRelacionesTipoComisionConfig.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.isVisibilidadCeldaModificarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemModificarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaActualizarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemActualizarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaEliminarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemEliminarTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaCancelarTipoComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemCancelarTipoComisionConfig.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoComisionConfig=this.jMenuItemGuardarCambiosTipoComisionConfig.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=this.jMenuItemGuardarCambiosTablaTipoComisionConfig.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoComisionConfig(Boolean esInicializar) {
		if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoComisionConfig();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoComisionConfig(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoComisionConfig() {
		this.jButtonNuevoTipoComisionConfig.setVisible(this.isPermisoNuevoTipoComisionConfig);			
		this.jButtonDuplicarTipoComisionConfig.setVisible(this.isPermisoDuplicarTipoComisionConfig);			
		this.jButtonCopiarTipoComisionConfig.setVisible(this.isPermisoCopiarTipoComisionConfig);			
		this.jButtonVerFormTipoComisionConfig.setVisible(this.isPermisoVerFormTipoComisionConfig);			
		
		this.jButtonAbrirOrderByTipoComisionConfig.setVisible(this.isPermisoOrdenTipoComisionConfig);					
		
		this.jButtonNuevoRelacionesTipoComisionConfig.setVisible(this.isPermisoNuevoTipoComisionConfig);			
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarTipoComisionConfig.setVisible(this.isPermisoActualizarTipoComisionConfig);	
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarTipoComisionConfig.setVisible(this.isPermisoActualizarTipoComisionConfig);	
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarTipoComisionConfig.setVisible(this.isPermisoEliminarTipoComisionConfig);
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarTipoComisionConfig.setVisible(this.isVisibilidadCeldaCancelarTipoComisionConfig);						
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.setVisible(this.isPermisoGuardarCambiosTipoComisionConfig);							
		}
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig.setVisible(this.isPermisoActualizarTipoComisionConfig);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoComisionConfig() {
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarTipoComisionConfig.setVisible(this.isPermisoActualizarTipoComisionConfig);	
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarTipoComisionConfig.setVisible(this.isPermisoActualizarTipoComisionConfig);	
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarTipoComisionConfig.setVisible(this.isPermisoEliminarTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarTipoComisionConfig.setVisible(this.isVisibilidadCeldaCancelarTipoComisionConfig);							
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.setVisible((this.isVisibilidadCeldaGuardarTipoComisionConfig && this.isPermisoGuardarCambiosTipoComisionConfig));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoComisionConfig() {
		if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoComisionConfig();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoComisionConfig() {
	}
	
	public void jTableDatosTipoComisionConfigListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoComisionConfig(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.gettipocomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocomisionconfig==null) {
						this.tipocomisionconfig = new TipoComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
				}

				if(this.tipocomisionconfig.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocomisionconfig.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoComisionConfigUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoComisionConfig(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoComisionConfig.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoComisionConfig.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.gettipocomisionconfig(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocomisionconfigLogic.getConnexion());

				if(this.tipocomisionconfig.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocomisionconfig.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoComisionConfig=(TitledBorder)this.jScrollPanelDatosTipoComisionConfig.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoComisionConfig.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.gettipocomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocomisionconfig==null) {
						this.tipocomisionconfig = new TipoComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
				}

				if(this.tipocomisionconfig.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocomisionconfig.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.gettipocomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocomisionconfig==null) {
						this.tipocomisionconfig = new TipoComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
				}

				if(this.tipocomisionconfig.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocomisionconfig.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoComisionConfigBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.gettipocomisionconfig(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocomisionconfig==null) {
						this.tipocomisionconfig = new TipoComisionConfig();
					}

					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);
				}

				if(this.tipocomisionconfig.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocomisionconfig.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoComisionConfig(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoComisionConfigActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoComisionConfig(false,false);

			this.getTipoComisionConfigsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoComisionConfig(false);

			//if(TipoComisionConfigBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoComisionConfig(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocomisionconfigLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoComisionConfig() {
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
		

		if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
			this.jInternalFrameDetalleFormTipoComisionConfig.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoComisionConfig.dispose();
			this.jInternalFrameDetalleFormTipoComisionConfig=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
			this.jInternalFrameReporteDinamicoTipoComisionConfig.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoComisionConfig.dispose();
			this.jInternalFrameReporteDinamicoTipoComisionConfig=null;
		}
		
		if(this.jInternalFrameImportacionTipoComisionConfig!=null) {
			this.jInternalFrameImportacionTipoComisionConfig.setVisible(false);	    			
			this.jInternalFrameImportacionTipoComisionConfig.dispose();
			this.jInternalFrameImportacionTipoComisionConfig=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoComisionConfig();
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoComisionConfig")) {
				jButtonDuplicarTipoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoComisionConfig")) {
				jButtonCopiarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoComisionConfig")) {
				jButtonVerFormTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoComisionConfig")) {
				jButtonDuplicarTipoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoComisionConfig")) {
				jButtonDuplicarTipoComisionConfigActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoComisionConfig")) {
				jButtonModificarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoComisionConfig")) {
				jButtonModificarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoComisionConfig")) {
				jButtonModificarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoComisionConfig")) {
				jButtonActualizarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoComisionConfig")) {
				jButtonActualizarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoComisionConfig")) {
				jButtonActualizarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoComisionConfig")) {
				jButtonEliminarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoComisionConfig")) {
				jButtonEliminarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoComisionConfig")) {
				jButtonEliminarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoComisionConfig")) {
				jButtonCancelarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoComisionConfig")) {
				jButtonCancelarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoComisionConfig")) {
				jButtonCancelarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoComisionConfig")) {
				jButtonCerrarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoComisionConfig")) {
				jButtonCerrarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoComisionConfig")) {
				jButtonCerrarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoComisionConfig")) {
				jButtonMostrarOcultarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoComisionConfig")) {
				jButtonCancelarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoComisionConfig")) {
				jButtonCopiarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoComisionConfig")) {
				jButtonVerFormTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoComisionConfig")) {
				jButtonCopiarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoComisionConfig")) {
				jButtonVerFormTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoComisionConfig")) {
				jButtonRecargarInformacionTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoComisionConfig")) {
				jButtonRecargarInformacionTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoComisionConfig")) {
				jButtonRecargarInformacionTipoComisionConfigActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoComisionConfig")) {
				jButtonAnterioresTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoComisionConfig")) {
				jButtonAnterioresTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoComisionConfig")) {
				jButtonAnterioresTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoComisionConfig")) {
				jButtonSiguientesTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoComisionConfig")) {
				jButtonSiguientesTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoComisionConfig")) {
				jButtonSiguientesTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoComisionConfig") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoComisionConfig")) {
				jButtonAbrirOrderByTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoComisionConfig") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoComisionConfig")) {
				jButtonMostrarOcultarTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoComisionConfig")) {
				jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoComisionConfig")) {
				jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoComisionConfig")) {
				jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoComisionConfig")) {
				jButtonCerrarReporteDinamicoTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoComisionConfig")) {
				jButtonGenerarReporteDinamicoTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoComisionConfig")) {
				
				jButtonGenerarExcelReporteDinamicoTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoComisionConfig")) {
				jButtonCerrarImportacionTipoComisionConfigActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoComisionConfig")) {
				
				jButtonGenerarImportacionTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoComisionConfig")) {
				
				jButtonAbrirImportacionTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoComisionConfig")) {
				jComboBoxTiposAccionesTipoComisionConfigActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoComisionConfig")) {
				jComboBoxTiposRelacionesTipoComisionConfigActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoComisionConfig")) {
				jComboBoxTiposAccionesTipoComisionConfigActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoComisionConfig")) {
				
				jComboBoxTiposSeleccionarTipoComisionConfigActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoComisionConfig")) {
				jTextFieldValorCampoGeneralTipoComisionConfigActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoComisionConfig")) {
				jButtonAbrirOrderByTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoComisionConfig")) {
				jButtonAbrirOrderByTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoComisionConfig")) {
				jButtonCerrarOrderByTipoComisionConfigActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoComisionConfigBusqueda")) {
				this.jButtonidTipoComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoComisionConfigUpdate")) {
				this.jButtonid_empresaTipoComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoComisionConfigBusqueda")) {
				this.jButtonid_empresaTipoComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoComisionConfigBusqueda")) {
				this.jButtoncodigoTipoComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoComisionConfigBusqueda")) {
				this.jButtonnombreTipoComisionConfigBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoComisionConfig();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComisionConfigActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoComisionConfig tipocomisionconfigLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocomisionconfigLocal=this.tipocomisionconfig;
			} else {
				tipocomisionconfigLocal=this.tipocomisionconfigAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
							
				
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
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
			
			


			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComisionConfigActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
								
						
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
								
				
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
							
				
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComisionConfigActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
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
			
			


			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
								
				
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComisionConfigActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoComisionConfig")) {
					jCheckBoxSeleccionarTodosTipoComisionConfigItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoComisionConfig")) {
					jCheckBoxSeleccionadosTipoComisionConfigItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoComisionConfig")) {
					
				}
				
				


				
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
												
				
				


				
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComisionConfigActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComisionConfigActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
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
			
			


			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoComisionConfigActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocomisionconfig);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocomisionconfig);
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
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
				
				


				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoComisionConfig.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoComisionConfig.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoComisionConfigActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocomisionconfigAnterior =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoComisionConfig")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoComisionConfigListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoComisionConfig.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocomisionconfig =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocomisionconfig);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoComisionConfig")) {
				
				}
				
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoComisionConfig")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoComisionConfig.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoComisionConfig")) {
			
			}
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoComisionConfig();
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
			if(sTipo.equals("NuevoTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoComisionConfig")) {
				jButtonDuplicarTipoComisionConfigActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoComisionConfig")) {
				jButtonCopiarTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoComisionConfig")) {
				jButtonVerFormTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoComisionConfig")) {
				jButtonNuevoTipoComisionConfigActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoComisionConfig")) {
				jButtonModificarTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoComisionConfig")) {
				jButtonActualizarTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoComisionConfig")) {
				jButtonEliminarTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoComisionConfig")) {
				jButtonCancelarTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoComisionConfig")) {
				jButtonCerrarTipoComisionConfigActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoComisionConfig")) {
				jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoComisionConfig")) {
				jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoComisionConfig")) {
				jButtonAbrirOrderByTipoComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoComisionConfig")) {
				jButtonRecargarInformacionTipoComisionConfigActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoComisionConfig")) {
				jButtonAnterioresTipoComisionConfigActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoComisionConfig")) {
				jButtonSiguientesTipoComisionConfigActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoComisionConfigBusqueda")) {
				this.jButtonidTipoComisionConfigBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoComisionConfigUpdate")) {
				this.jButtonid_empresaTipoComisionConfigUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoComisionConfigBusqueda")) {
				this.jButtonid_empresaTipoComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoComisionConfigBusqueda")) {
				this.jButtoncodigoTipoComisionConfigBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoComisionConfigBusqueda")) {
				this.jButtonnombreTipoComisionConfigBusquedaActionPerformed(evt);
			}
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoComisionConfig();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoComisionConfig")) {
				closingInternalFrameTipoComisionConfig();
				
			} else if(sTipo.equals("jButtonCancelarTipoComisionConfig")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoComisionConfig = (JInternalFrameBase)evt.getSource();
	            	
	            TipoComisionConfigBeanSwingJInternalFrame jInternalFrameParent=(TipoComisionConfigBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoComisionConfig.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoComisionConfigActionPerformed(null);
			}
			
			TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocomisionconfig,new Object(),this.tipocomisionconfigParameterGeneral,this.tipocomisionconfigReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoComisionConfig(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoComisionConfig(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoComisionConfig(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocomisionconfig)) {
			if(!esControlTabla) {
				if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);			
				}
				
				if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoComisionConfig(this.tipocomisionconfig,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocomisionconfigReturnGeneral=tipocomisionconfigLogic.procesarEventosTipoComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomisionconfigLogic.getTipoComisionConfigs(),this.tipocomisionconfig,this.tipocomisionconfigParameterGeneral,this.isEsNuevoTipoComisionConfig,classes);//this.tipocomisionconfigLogic.getTipoComisionConfig()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoComisionConfig(this.tipocomisionconfigReturnGeneral,this.tipocomisionconfigBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoComisionConfig(classes,this.tipocomisionconfigReturnGeneral,this.tipocomisionconfigBean,false);
					}
						
					if(this.tipocomisionconfigReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoComisionConfig(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoComisionConfig(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig());	
					}
						
					if(this.tipocomisionconfigReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoComisionConfig(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig(),classes);//this.tipocomisionconfigBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoComisionConfig(this.tipocomisionconfig,classes);//this.tipocomisionconfigBean);									
				}
			
				if(TipoComisionConfigJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoComisionConfig(this.tipocomisionconfig,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoComisionConfig(this.tipocomisionconfig);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocomisionconfigAnterior!=null) {
						this.tipocomisionconfig=this.tipocomisionconfigAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocomisionconfigReturnGeneral=tipocomisionconfigLogic.procesarEventosTipoComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomisionconfigLogic.getTipoComisionConfigs(),this.tipocomisionconfig,this.tipocomisionconfigParameterGeneral,this.isEsNuevoTipoComisionConfig,classes);//this.tipocomisionconfigLogic.getTipoComisionConfig()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocomisionconfigSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocomisionconfigSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig(),tipocomisionconfigLogic.getTipoComisionConfigs());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig(),this.tipocomisionconfigs);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoComisionConfig.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoComisionConfig.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoComisionConfig();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoComisionConfig() throws Exception {
		
		TipoComisionConfigModel tipocomisionconfigModel=(TipoComisionConfigModel)this.jTableDatosTipoComisionConfig.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocomisionconfigModel.tipocomisionconfigs=this.tipocomisionconfigLogic.getTipoComisionConfigs();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocomisionconfigModel.tipocomisionconfigs=this.tipocomisionconfigs;
		}
		
		
		((TipoComisionConfigModel) this.jTableDatosTipoComisionConfig.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoComisionConfig() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocomisionconfigAnterior(),this.tipocomisionconfigLogic.getTipoComisionConfigs());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocomisionconfigAnterior(),this.tipocomisionconfigs);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoComisionConfig();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoComisionConfig(TipoComisionConfig tipocomisionconfig,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionConfig.class)) {
					this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(tipocomisionconfig.getComisionConfigs());
					this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
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
										
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomisionconfig,new Object(),generalEntityParameterGeneral,this.tipocomisionconfigReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoComisionConfigConstantesFunciones.getClassesRelationshipsOfTipoComisionConfig(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoComisionConfigConstantesFunciones.getClassesRelationshipsFromStringsOfTipoComisionConfig(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoComisionConfig(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoComisionConfigBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocomisionconfig,new Object(),generalEntityParameterGeneral,this.tipocomisionconfigReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoComisionConfig(TipoComisionConfigBean tipocomisionconfigBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionConfig.class)) {
					this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.setComisionConfigs(tipocomisionconfig.getComisionConfigs());
					this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoComisionConfig(ArrayList<Classe> classes,TipoComisionConfigReturnGeneral tipocomisionconfigReturnGeneral,TipoComisionConfigBean tipocomisionconfigBean,Boolean conDefault) throws Exception {
		
			this.tipocomisionconfigBean.setComisionConfigs(tipocomisionconfigReturnGeneral.getTipoComisionConfig().getComisionConfigs());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoComisionConfig(TipoComisionConfig tipocomisionconfig,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ComisionConfig.class)) {
					tipocomisionconfig.setComisionConfigs(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigBeanSwingJInternalFrame.comisionconfigLogic.getComisionConfigs());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocomisionconfig)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoComisionConfig = new TipoComisionConfigDetalleFormJInternalFrame(jDesktopPane,this.tipocomisionconfigSessionBean.getConGuardarRelaciones(),this.tipocomisionconfigSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.setVisible(false);
		this.jInternalFrameDetalleFormTipoComisionConfig.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoComisionConfig.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoComisionConfig.tipocomisionconfigLogic=this.tipocomisionconfigLogic;
		
		this.cargarCombosFrameForeignKeyTipoComisionConfig("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoComisionConfig();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoComisionConfig();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoComisionConfig("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoComisionConfig();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoComisionConfig.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoComisionConfig"));
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarTipoComisionConfig"));

		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarToolBarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoComisionConfig"));
					
		this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemModificarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"ActualizarTipoComisionConfig"));
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarToolBarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoComisionConfig"));
						
		this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemActualizarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarTipoComisionConfig"));
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoComisionConfig"));
								
		this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemEliminarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarTipoComisionConfig"));
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoComisionConfig"));
					
		this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemCancelarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoComisionConfig"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemDetalleCerrarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoComisionConfig"));		
		
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoComisionConfig"));
		
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoComisionConfig"));
		
		
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoComisionConfig"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonidTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonid_empresaTipoComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonid_empresaTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtoncodigoTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonnombreTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComisionConfigBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoComisionConfig"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoComisionConfig"));
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoComisionConfig"));
		}
		
		this.jTableDatosTipoComisionConfig.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoComisionConfig"));
		
		this.jTableDatosTipoComisionConfig.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoComisionConfig"));
		
		this.jButtonNuevoTipoComisionConfig.addActionListener(new ButtonActionListener(this,"NuevoTipoComisionConfig"));
		
		this.jButtonDuplicarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"DuplicarTipoComisionConfig"));
		
		this.jButtonCopiarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"CopiarTipoComisionConfig"));
		
		this.jButtonVerFormTipoComisionConfig.addActionListener(new ButtonActionListener(this,"VerFormTipoComisionConfig"));
		
		
		this.jButtonNuevoToolBarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoComisionConfig"));
			
		this.jButtonDuplicarToolBarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoComisionConfig"));
			
		this.jMenuItemNuevoTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoComisionConfig"));
			
		this.jMenuItemDuplicarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoComisionConfig"));		
		
		
		this.jButtonNuevoRelacionesTipoComisionConfig.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoComisionConfig"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoComisionConfig"));
			
		this.jMenuItemNuevoRelacionesTipoComisionConfig.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoComisionConfig"));		
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarTipoComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonModificarToolBarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoComisionConfig"));
			
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemModificarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"ActualizarTipoComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonActualizarToolBarTipoComisionConfig.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoComisionConfig"));
				
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemActualizarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarTipoComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonEliminarToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoComisionConfig"));
						
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemEliminarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarTipoComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonCancelarToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoComisionConfig"));
			
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemCancelarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoComisionConfig"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoComisionConfig"));		
		
		
		this.jButtonCerrarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CerrarTipoComisionConfig"));
		
		
		this.jButtonCerrarToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoComisionConfig"));
			
		this.jMenuItemCerrarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoComisionConfig"));
			
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jMenuItemDetalleCerrarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoComisionConfig"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoComisionConfig"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoComisionConfig"));
		}
		
		this.jButtonCopiarToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoComisionConfig"));
			
		this.jButtonVerFormToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoComisionConfig"));
		
		this.jMenuItemGuardarCambiosTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoComisionConfig"));
			
		this.jMenuItemCopiarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoComisionConfig"));		
		
		this.jMenuItemVerFormTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoComisionConfig"));		
		
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoComisionConfig"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoComisionConfig"));
			
		this.jMenuItemGuardarCambiosTablaTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoComisionConfig"));		
		
		
		
		this.jButtonRecargarInformacionTipoComisionConfig.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoComisionConfig"));
					
		this.jButtonRecargarInformacionToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoComisionConfig"));
		
		this.jMenuItemRecargarInformacionTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoComisionConfig"));		
		
		
		
		this.jButtonAnterioresTipoComisionConfig.addActionListener (new ButtonActionListener(this,"AnterioresTipoComisionConfig"));
		
		
		this.jButtonAnterioresToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoComisionConfig"));
		
		this.jMenuItemAnterioresTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoComisionConfig"));		
		
		
		this.jButtonSiguientesTipoComisionConfig.addActionListener (new ButtonActionListener(this,"SiguientesTipoComisionConfig"));
		
		
		this.jButtonSiguientesToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoComisionConfig"));
			
		this.jMenuItemSiguientesTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoComisionConfig"));
			
		this.jMenuItemAbrirOrderByTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoComisionConfig"));
			
		this.jMenuItemMostrarOcultarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoComisionConfig"));
			
		this.jMenuItemDetalleAbrirOrderByTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoComisionConfig"));
			
		this.jMenuItemDetalleMostarOcultarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoComisionConfig"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoComisionConfig.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoComisionConfig"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoComisionConfig"));
			
		this.jMenuItemNuevoGuardarCambiosTipoComisionConfig.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoComisionConfig"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoComisionConfig.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoComisionConfig"));

		this.jCheckBoxSeleccionadosTipoComisionConfig.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoComisionConfig"));
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoComisionConfig"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoComisionConfig.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoComisionConfig"));
			
		this.jComboBoxTiposAccionesTipoComisionConfig.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoComisionConfig"));
					
		this.jComboBoxTiposSeleccionarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoComisionConfig"));
			
		this.jTextFieldValorCampoGeneralTipoComisionConfig.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoComisionConfig"));		
		
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonidTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonid_empresaTipoComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonid_empresaTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtoncodigoTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonnombreTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComisionConfigBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoComisionConfig!=null) {
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoComisionConfig"));
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoComisionConfig"));
				this.jInternalFrameReporteDinamicoTipoComisionConfig.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoComisionConfig"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoComisionConfig.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoComisionConfig"));				
			//this.jButtonGenerarReporteDinamicoTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoComisionConfig"));
			//this.jButtonGenerarExcelReporteDinamicoTipoComisionConfig.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoComisionConfig"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoComisionConfig!=null) {
				this.jInternalFrameImportacionTipoComisionConfig.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoComisionConfig"));
				this.jInternalFrameImportacionTipoComisionConfig.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoComisionConfig"));
				this.jInternalFrameImportacionTipoComisionConfig.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoComisionConfig"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoComisionConfig.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoComisionConfig"));
			
			this.jButtonAbrirOrderByToolBarTipoComisionConfig.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoComisionConfig"));			
			
			if(this.jInternalFrameOrderByTipoComisionConfig!=null) {
				this.jInternalFrameOrderByTipoComisionConfig.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoComisionConfig"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoComisionConfig.jTabbedPaneRelacionesTipoComisionConfig.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoComisionConfig"));
		
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
            		closingInternalFrameTipoComisionConfig();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoComisionConfig.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoComisionConfig = (JInternalFrameBase)event.getSource();
	            	
	            TipoComisionConfigBeanSwingJInternalFrame jInternalFrameParent=(TipoComisionConfigBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoComisionConfig.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoComisionConfigActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoComisionConfig.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoComisionConfigListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoComisionConfig.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoComisionConfig.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComisionConfigActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComisionConfigActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComisionConfigActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoComisionConfig";
		inputMap = this.jButtonNuevoTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoComisionConfigActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComisionConfigActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComisionConfigActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoComisionConfigActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoComisionConfig";
		inputMap = this.jButtonNuevoRelacionesTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoComisionConfigActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoComisionConfig";
		inputMap = this.jButtonModificarTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoComisionConfig";
		inputMap = this.jButtonActualizarTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoComisionConfig";
		inputMap = this.jButtonEliminarTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoComisionConfig";
		inputMap = this.jButtonCancelarTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoComisionConfig";
		inputMap = this.jButtonCerrarTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoComisionConfig";
		inputMap = this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonGuardarCambiosTipoComisionConfig.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoComisionConfigActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoComisionConfig.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoComisionConfigItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoComisionConfig.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoComisionConfigActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoComisionConfig.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoComisionConfigActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoComisionConfig.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoComisionConfigActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonidTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"idTipoComisionConfigBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonid_empresaTipoComisionConfigUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoComisionConfigUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonid_empresaTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtoncodigoTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoComisionConfigBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoComisionConfig.jButtonnombreTipoComisionConfigBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoComisionConfigBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoComisionConfig.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoComisionConfigActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoComisionConfigActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoComisionConfig.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoComisionConfig(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
					tipocomisionconfigAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigs) {
					tipocomisionconfigAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoComisionConfigItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoComisionConfig(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
						tipocomisionconfigAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigs) {
						tipocomisionconfigAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigs) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoComisionConfig(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoComisionConfig.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoComisionConfig.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfig,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoComisionConfigItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoComisionConfig(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoComisionConfig.getSelectedRows();
			
			TipoComisionConfig tipocomisionconfigLocal=new TipoComisionConfig();
			
			//this.seleccionarTodosTipoComisionConfig(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocomisionconfigLocal =(TipoComisionConfig) this.tipocomisionconfigLogic.getTipoComisionConfigs().toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocomisionconfigLocal =(TipoComisionConfig) this.tipocomisionconfigs.toArray()[this.jTableDatosTipoComisionConfig.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocomisionconfigLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
						tipocomisionconfigAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigs) {
						tipocomisionconfigAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoComisionConfig(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoComisionConfig.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoComisionConfig.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoComisionConfig,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoComisionConfigItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoComisionConfigParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoComisionConfigActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoComisionConfig(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoComisionConfig.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigLogic.getTipoComisionConfigs()) {
				
						if(sTipoSeleccionar.equals(TipoComisionConfigConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocomisionconfigAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocomisionconfigAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigs) {
					
						if(sTipoSeleccionar.equals(TipoComisionConfigConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocomisionconfigAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocomisionconfigAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoComisionConfig(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoComisionConfigActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoComisionConfig(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoComisionConfig=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoComisionConfig.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoComisionConfig) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoComisionConfig(conSplash);
				
					this.generarReporteTipoComisionConfigsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoComisionConfigsSeleccionados();
				//this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoComisionConfigsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoComisionConfigsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoComisionConfig();
				
				this.exportarTipoComisionConfigsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoComisionConfigs();
				//this.importarTipoComisionConfigs();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoComisionConfig();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoComisionConfigsSeleccionados();
				//this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoComisionConfig();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoComisionConfig)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoComisionConfig(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoComisionConfigBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoComisionConfig) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoComisionConfig(conSplash);
					
						//this.actualizarParametrosGeneralTipoComisionConfig();
						
						this.generarReporteProcesoAccionTipoComisionConfigsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoComisionConfigBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Comision ConfigES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Comision Config", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoComisionConfig();
				
						this.actualizarParametrosGeneralTipoComisionConfig();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocomisionconfigReturnGeneral=tipocomisionconfigLogic.procesarAccionTipoComisionConfigsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocomisionconfigLogic.getTipoComisionConfigs(),this.tipocomisionconfigParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoComisionConfigReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoComisionConfig();
					
					TipoComisionConfigBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoComisionConfigReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoComisionConfig.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxTiposAccionesFormularioTipoComisionConfig.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoComisionConfig(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoComisionConfigActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoComisionConfig();
			
			if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
			TipoComisionConfig tipocomisionconfig=new TipoComisionConfig();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoComisionConfig(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoComisionConfig.getSelectedItem();
			
			
			
			
			tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocomisionconfigsSeleccionados.size()==1) {
				for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsSeleccionados) {
					tipocomisionconfig=tipocomisionconfigAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Comision Config")) {
					jButtonComisionConfigActionPerformed(null,rowIndex,true,false,tipocomisionconfig);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoComisionConfig();
			
      		//this.finishProcessTipoComisionConfig(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoComisionConfigReturnGeneral() throws Exception {
		if(this.tipocomisionconfigReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocomisionconfigReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocomisionconfigReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocomisionconfigReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocomisionconfigReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocomisionconfigReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoComisionConfig(false);
		}
		
		if(this.tipocomisionconfigReturnGeneral.getConRetornoLista() || this.tipocomisionconfigReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocomisionconfigReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocomisionconfigLogic.setTipoComisionConfigs(this.tipocomisionconfigReturnGeneral.getTipoComisionConfigs());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocomisionconfigReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocomisionconfigLogic.setTipoComisionConfig(this.tipocomisionconfigReturnGeneral.getTipoComisionConfig());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoComisionConfig(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoComisionConfig() throws Exception {
		
		
	}
	
	public ArrayList<TipoComisionConfig> getTipoComisionConfigsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoComisionConfig) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigLogic.getTipoComisionConfigs()) {
					if(tipocomisionconfigAux.getIsSelected()) {
						tipocomisionconfigsSeleccionados.add(tipocomisionconfigAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoComisionConfig tipocomisionconfigAux:this.tipocomisionconfigs) {
					if(tipocomisionconfigAux.getIsSelected()) {
						tipocomisionconfigsSeleccionados.add(tipocomisionconfigAux);				
					}
				}
			}
			
			if(tipocomisionconfigsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocomisionconfigsSeleccionados.addAll(this.tipocomisionconfigLogic.getTipoComisionConfigs());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocomisionconfigsSeleccionados.addAll(this.tipocomisionconfigs);				
					}
				}
			}
		} else {
			tipocomisionconfigsSeleccionados.add(this.tipocomisionconfig);
		}
		
		return tipocomisionconfigsSeleccionados;
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
	
	public void generarReporteTipoComisionConfigsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoComisionConfigsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoComisionConfigsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoComisionConfigsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoComisionConfigsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoComisionConfigsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Comision Config",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoComisionConfigsSeleccionados() throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoComisionConfigsSeleccionados() throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoComisionConfigsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoComisionConfigsSeleccionados() throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoComisionConfig();
		
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoComisionConfig();
		
		
		//this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigsSeleccionados ,tipocomisionconfigImplementable,tipocomisionconfigImplementableHome);
	}
	
	public void mostrarImportacionTipoComisionConfigs() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoComisionConfig();
		
		this.abrirFrameImportacionTipoComisionConfig();		
		
			
		//this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigsSeleccionados ,tipocomisionconfigImplementable,tipocomisionconfigImplementableHome);
	}
	
	public void importarTipoComisionConfigs() throws Exception {		
	
	}
	
	public void exportarTipoComisionConfigsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoComisionConfigsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoComisionConfigsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoComisionConfigsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Comision Config",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoComisionConfigsSeleccionados() throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomisionconfig."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoComisionConfig(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoComisionConfig(tipocomisionconfigAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocomisionconfigAux.setsDetalleGeneralEntityReporte(tipocomisionconfigAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoComisionConfig(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoComisionConfigConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComisionConfigConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComisionConfigConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoComisionConfigConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoComisionConfig(TipoComisionConfig tipocomisionconfig,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocomisionconfig.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocomisionconfig.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocomisionconfig.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocomisionconfig.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocomisionconfig.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoComisionConfigsSeleccionados() throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomisionconfig.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoComisionConfigs");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoComisionConfig(row);				
				iRow++;
			}				
			
			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoComisionConfig(tipocomisionconfigAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoComisionConfigsSeleccionados() throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();		
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocomisionconfig.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocomisionconfigs");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocomisionconfig");
			//elementRoot.appendChild(element);
		
			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsSeleccionados) {
				element = document.createElement("tipocomisionconfig");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoComisionConfig(tipocomisionconfigAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Comision Config",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoComisionConfig(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoComisionConfig(TipoComisionConfig tipocomisionconfig,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocomisionconfig.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocomisionconfig.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocomisionconfig.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocomisionconfig.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoComisionConfig(TipoComisionConfig tipocomisionconfig,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoComisionConfigConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocomisionconfig.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoComisionConfigConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocomisionconfig.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoComisionConfigConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocomisionconfig.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoComisionConfigConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocomisionconfig.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoComisionConfigConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocomisionconfig.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoComisionConfigsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados=new ArrayList<TipoComisionConfig>();
		
		tipocomisionconfigsSeleccionados=this.getTipoComisionConfigsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoComisionConfig(tipocomisionconfigsSeleccionados);
		
		this.generarReporteTipoComisionConfigs("Todos",tipocomisionconfigsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoComisionConfig(ArrayList<TipoComisionConfig> tipocomisionconfigsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoComisionConfig tipocomisionconfigAux:tipocomisionconfigsSeleccionados) {
				tipocomisionconfigAux.setsDetalleGeneralEntityReporte(tipocomisionconfigAux.toString());
			
				if(sTipoSeleccionar.equals(TipoComisionConfigConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocomisionconfigAux.setsDescripcionGeneralEntityReporte1(tipocomisionconfigAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoComisionConfigConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocomisionconfigAux.setsDescripcionGeneralEntityReporte1(tipocomisionconfigAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoComisionConfigConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocomisionconfigAux.setsDescripcionGeneralEntityReporte1(tipocomisionconfigAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoComisionConfigConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoComisionConfig(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoComisionConfig=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=true;
				this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=true;
			}
			
			this.isVisibilidadCeldaModificarTipoComisionConfig=false;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=false;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
			this.isVisibilidadCeldaModificarTipoComisionConfig=false;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=true;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
			this.isVisibilidadCeldaModificarTipoComisionConfig=false;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=true;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=true;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
			this.isVisibilidadCeldaModificarTipoComisionConfig=false;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=true;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=true;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=true;
			this.isVisibilidadCeldaModificarTipoComisionConfig=false;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=false;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=false;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
			this.isVisibilidadCeldaModificarTipoComisionConfig=true;
			this.isVisibilidadCeldaActualizarTipoComisionConfig=false;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
			this.isVisibilidadCeldaCancelarTipoComisionConfig=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoComisionConfig=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoComisionConfigJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoComisionConfig=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=true;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=true;
		} else {
			this.actualizarEstadoPanelsTipoComisionConfig(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoComisionConfig=false;
			//this.isVisibilidadCeldaVerFormTipoComisionConfig=false;
			this.isVisibilidadCeldaDuplicarTipoComisionConfig=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocomisionconfigSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
			this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			if(!tipocomisionconfigSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;												
			}
			
			this.jButtonCerrarTipoComisionConfig.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoComisionConfig=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocomisionconfig)) {
			this.isVisibilidadCeldaActualizarTipoComisionConfig=false;
			this.isVisibilidadCeldaEliminarTipoComisionConfig=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoComisionConfig() {
		this.isVisibilidadCeldaNuevoTipoComisionConfig=false;
		this.isVisibilidadCeldaGuardarCambiosTipoComisionConfig=false;
	}
	
	public void actualizarEstadoPanelsTipoComisionConfig(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoComisionConfig!=null) {
				this.jScrollPanelDatosEdicionTipoComisionConfig.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComisionConfig!=null) {
				this.jScrollPanelDatosTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComisionConfig!=null) {
				this.jPanelPaginacionTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoComisionConfig!=null) {
				this.jScrollPanelDatosEdicionTipoComisionConfig.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoComisionConfig!=null) {
				this.jScrollPanelDatosTipoComisionConfig.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoComisionConfig!=null) {
				this.jPanelPaginacionTipoComisionConfig.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoComisionConfig!=null) {
				this.jScrollPanelDatosEdicionTipoComisionConfig.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoComisionConfig!=null) {
				this.jScrollPanelDatosTipoComisionConfig.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoComisionConfig!=null) {
				this.jPanelPaginacionTipoComisionConfig.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoComisionConfig!=null) {
				this.jScrollPanelDatosEdicionTipoComisionConfig.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoComisionConfig!=null) {
				this.jScrollPanelDatosTipoComisionConfig.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoComisionConfig!=null) {
				this.jPanelPaginacionTipoComisionConfig.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoComisionConfig!=null) {
				this.jScrollPanelDatosEdicionTipoComisionConfig.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComisionConfig!=null) {
				this.jScrollPanelDatosTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComisionConfig!=null) {
				this.jPanelPaginacionTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoComisionConfig!=null) {
				this.jScrollPanelDatosEdicionTipoComisionConfig.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComisionConfig!=null) {
				this.jScrollPanelDatosTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComisionConfig!=null) {
				this.jPanelPaginacionTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoComisionConfig!=null) {
				this.jScrollPanelDatosEdicionTipoComisionConfig.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoComisionConfig!=null) {
				this.jScrollPanelDatosTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoComisionConfig!=null) {
				this.jPanelPaginacionTipoComisionConfig.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
					this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocomisionconfigSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoComisionConfig!=null) {
				this.jTabbedPaneBusquedasTipoComisionConfig.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoComisionConfig!=null) {
				this.jPanelParametrosReportesTipoComisionConfig.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoComisionConfigParaComisionConfiges() throws Exception {
		Boolean isPaginaPopupComisionConfig=false;

		try {

			if(this.tipocomisionconfigSessionBean==null) {
				this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean==null) {
				this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean=new ComisionConfigSessionBean();
			}

			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean.setsPathNavegacionActual(tipocomisionconfigSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ComisionConfigConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupComisionConfig=this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeComisionConfig(true);
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeComisionConfig(TipoComisionConfigConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionTipoComisionConfig(true);
			this.jInternalFrameDetalleFormTipoComisionConfig.comisionconfigSessionBean.setlidTipoComisionConfigActual(this.idTipoComisionConfigActual);

			tipocomisionconfigSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoComisionConfig(true);
			tipocomisionconfigSessionBean.setlIdTipoComisionConfigActualForeignKey(this.idTipoComisionConfigActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoComisionConfigSessionBean tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
		
		if(this.tipocomisionconfigSessionBean==null) {
			this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
		}
		
		this.tipocomisionconfigSessionBean.setsUltimaBusquedaTipoComisionConfig(this.getsAccionBusqueda());
		this.tipocomisionconfigSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocomisionconfigSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocomisionconfigSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoComisionConfigSessionBean tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
		
		if(this.tipocomisionconfigSessionBean==null) {
			this.tipocomisionconfigSessionBean=new TipoComisionConfigSessionBean();
		}
		
		if(this.tipocomisionconfigSessionBean.getsUltimaBusquedaTipoComisionConfig()!=null&&!this.tipocomisionconfigSessionBean.getsUltimaBusquedaTipoComisionConfig().equals("")) {
			this.setsAccionBusqueda(tipocomisionconfigSessionBean.getsUltimaBusquedaTipoComisionConfig());
			this.setiNumeroPaginacion(tipocomisionconfigSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocomisionconfigSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocomisionconfigSessionBean.getid_empresa());
				tipocomisionconfigSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocomisionconfigSessionBean.setsUltimaBusquedaTipoComisionConfig("");
		this.tipocomisionconfigSessionBean.setiNumeroPaginacion(TipoComisionConfigConstantesFunciones.INUMEROPAGINACION);
		this.tipocomisionconfigSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoComisionConfig(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoComisionConfig() {
		this.updateBorderResaltarBusquedasFormularioTipoComisionConfig();
		this.updateVisibilidadBusquedasFormularioTipoComisionConfig();
		this.updateHabilitarBusquedasFormularioTipoComisionConfig();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoComisionConfig() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoComisionConfig.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoComisionConfig() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoComisionConfig.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoComisionConfig() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoComisionConfig.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoComisionConfig(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoComisionConfig.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoComisionConfig() throws Exception {

		if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoComisionConfig();
		this.updateVisibilidadResaltarControlesFormularioTipoComisionConfig();
		this.updateHabilitarResaltarControlesFormularioTipoComisionConfig();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoComisionConfig() throws Exception {
		if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocomisionconfigConstantesFunciones.resaltaridTipoComisionConfig!=null && this.jInternalFrameDetalleFormTipoComisionConfig!=null) {this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.setBorder(this.tipocomisionconfigConstantesFunciones.resaltaridTipoComisionConfig);}
		if(this.tipocomisionconfigConstantesFunciones.resaltarid_empresaTipoComisionConfig!=null && this.jInternalFrameDetalleFormTipoComisionConfig!=null) {this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setBorder(this.tipocomisionconfigConstantesFunciones.resaltarid_empresaTipoComisionConfig);}
		if(this.tipocomisionconfigConstantesFunciones.resaltarcodigoTipoComisionConfig!=null && this.jInternalFrameDetalleFormTipoComisionConfig!=null) {this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.setBorder(this.tipocomisionconfigConstantesFunciones.resaltarcodigoTipoComisionConfig);}
		if(this.tipocomisionconfigConstantesFunciones.resaltarnombreTipoComisionConfig!=null && this.jInternalFrameDetalleFormTipoComisionConfig!=null) {this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.setBorder(this.tipocomisionconfigConstantesFunciones.resaltarnombreTipoComisionConfig);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoComisionConfig() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
	
		//this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostraridTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jPanelidTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostraridTipoComisionConfig);
		//this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostrarid_empresaTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jPanelid_empresaTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostrarid_empresaTipoComisionConfig);
		//this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostrarcodigoTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jPanelcodigoTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostrarcodigoTipoComisionConfig);
		//this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostrarnombreTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jPanelnombreTipoComisionConfig.setVisible(this.tipocomisionconfigConstantesFunciones.mostrarnombreTipoComisionConfig);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoComisionConfig() throws Exception {
		if(this.jInternalFrameDetalleFormTipoComisionConfig==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoComisionConfig!=null) {
	
		this.jInternalFrameDetalleFormTipoComisionConfig.jLabelidTipoComisionConfig.setEnabled(this.tipocomisionconfigConstantesFunciones.activaridTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jComboBoxid_empresaTipoComisionConfig.setEnabled(this.tipocomisionconfigConstantesFunciones.activarid_empresaTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jTextFieldcodigoTipoComisionConfig.setEnabled(this.tipocomisionconfigConstantesFunciones.activarcodigoTipoComisionConfig);
		this.jInternalFrameDetalleFormTipoComisionConfig.jTextAreanombreTipoComisionConfig.setEnabled(this.tipocomisionconfigConstantesFunciones.activarnombreTipoComisionConfig);
		}
	}
	
		
}