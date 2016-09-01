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

import com.bydan.erp.cartera.util.TipoNacionalidadConstantesFunciones;
import com.bydan.erp.cartera.util.TipoNacionalidadParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoNacionalidadParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoNacionalidadBean;
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
public class TipoNacionalidadBeanSwingJInternalFrame extends TipoNacionalidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoNacionalidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoNacionalidad> tiponacionalidadValidator = new ClassValidator<TipoNacionalidad>(TipoNacionalidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoNacionalidad tiponacionalidad;	
	public TipoNacionalidad tiponacionalidadAux;
	public TipoNacionalidad tiponacionalidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoNacionalidad tiponacionalidadTotales;
	public Long idTipoNacionalidadActual;
	public Long iIdNuevoTipoNacionalidad=0L;
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
	
	public Boolean isPermisoTodoTipoNacionalidad;
	public Boolean isPermisoNuevoTipoNacionalidad;
	public Boolean isPermisoActualizarTipoNacionalidad;
	public Boolean isPermisoActualizarOriginalTipoNacionalidad;
	public Boolean isPermisoEliminarTipoNacionalidad;
	public Boolean isPermisoGuardarCambiosTipoNacionalidad;
	public Boolean isPermisoConsultaTipoNacionalidad;
	public Boolean isPermisoBusquedaTipoNacionalidad;
	public Boolean isPermisoReporteTipoNacionalidad;
	public Boolean isPermisoPaginacionMedioTipoNacionalidad;
	public Boolean isPermisoPaginacionAltoTipoNacionalidad;
	public Boolean isPermisoPaginacionTodoTipoNacionalidad;
	public Boolean isPermisoCopiarTipoNacionalidad;
	public Boolean isPermisoVerFormTipoNacionalidad;
	public Boolean isPermisoDuplicarTipoNacionalidad;
	public Boolean isPermisoOrdenTipoNacionalidad;
	
	
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
	
	public TipoNacionalidadParameterReturnGeneral tiponacionalidadReturnGeneral;
	public TipoNacionalidadParameterReturnGeneral tiponacionalidadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoNacionalidad=false;
	public Boolean esParaAccionDesdeFormularioTipoNacionalidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoNacionalidadSessionBeanAdditional tiponacionalidadSessionBeanAdditional=null;
	
	public TipoNacionalidadSessionBeanAdditional getTipoNacionalidadSessionBeanAdditional() {
		return this.tiponacionalidadSessionBeanAdditional;
	}
	
	public void setTipoNacionalidadSessionBeanAdditional(TipoNacionalidadSessionBeanAdditional tiponacionalidadSessionBeanAdditional) {
		try {
			this.tiponacionalidadSessionBeanAdditional=tiponacionalidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoNacionalidadBeanSwingJInternalFrameAdditional tiponacionalidadBeanSwingJInternalFrameAdditional=null;
	//public class TipoNacionalidadBeanSwingJInternalFrame
	
	public TipoNacionalidadBeanSwingJInternalFrameAdditional getTipoNacionalidadBeanSwingJInternalFrameAdditional() {
		return this.tiponacionalidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoNacionalidadBeanSwingJInternalFrameAdditional(TipoNacionalidadBeanSwingJInternalFrameAdditional tiponacionalidadBeanSwingJInternalFrameAdditional) {
		try {
			this.tiponacionalidadBeanSwingJInternalFrameAdditional=tiponacionalidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoNacionalidadLogic tiponacionalidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoNacionalidad tiponacionalidadBean;
	public TipoNacionalidadConstantesFunciones tiponacionalidadConstantesFunciones;
	//public TipoNacionalidadParameterReturnGeneral tiponacionalidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoNacionalidad> tiponacionalidads;	
	//public List<TipoNacionalidad> tiponacionalidadsEliminados;
	//public List<TipoNacionalidad> tiponacionalidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoNacionalidad=false;
	public Boolean isVisibilidadCeldaDuplicarTipoNacionalidad=true;
	public Boolean isVisibilidadCeldaCopiarTipoNacionalidad=true;
	public Boolean isVisibilidadCeldaVerFormTipoNacionalidad=true;
	public Boolean isVisibilidadCeldaOrdenTipoNacionalidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
	public Boolean isVisibilidadCeldaModificarTipoNacionalidad=false;
	public Boolean isVisibilidadCeldaActualizarTipoNacionalidad=false;
	public Boolean isVisibilidadCeldaEliminarTipoNacionalidad=false;
	public Boolean isVisibilidadCeldaCancelarTipoNacionalidad=false;
	public Boolean isVisibilidadCeldaGuardarTipoNacionalidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoNacionalidad() {
		return this.iIdNuevoTipoNacionalidad;
	}

	public void setiIdNuevoTipoNacionalidad(Long iIdNuevoTipoNacionalidad) {
		this.iIdNuevoTipoNacionalidad = iIdNuevoTipoNacionalidad;
	}
	
	public Long getidTipoNacionalidadActual() {
		return this.idTipoNacionalidadActual;
	}

	public void setidTipoNacionalidadActual(Long idTipoNacionalidadActual) {
		this.idTipoNacionalidadActual = idTipoNacionalidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoNacionalidad gettiponacionalidad() {
		return this.tiponacionalidad;
	}

	public void settiponacionalidad(TipoNacionalidad tiponacionalidad) {
		this.tiponacionalidad = tiponacionalidad;
	}
	
	public TipoNacionalidad gettiponacionalidadAux() {
		return this.tiponacionalidadAux;
	}

	public void settiponacionalidadAux(TipoNacionalidad tiponacionalidadAux) {
		this.tiponacionalidadAux = tiponacionalidadAux;
	}				
	
	public TipoNacionalidad gettiponacionalidadAnterior() {
		return this.tiponacionalidadAnterior;
	}

	public void settiponacionalidadAnterior(TipoNacionalidad tiponacionalidadAnterior) {
		this.tiponacionalidadAnterior = tiponacionalidadAnterior;
	}	
	
	public TipoNacionalidad gettiponacionalidadTotales() {
		return this.tiponacionalidadTotales;
	}

	public void settiponacionalidadTotales(TipoNacionalidad tiponacionalidadTotales) {
		this.tiponacionalidadTotales = tiponacionalidadTotales;
	}	
	
	public TipoNacionalidad gettiponacionalidadBean() {
		return this.tiponacionalidadBean;
	}

	public void settiponacionalidadBean(TipoNacionalidad tiponacionalidadBean) {
		this.tiponacionalidadBean = tiponacionalidadBean;
	}	
	
	public TipoNacionalidadParameterReturnGeneral gettiponacionalidadReturnGeneral() {
		return this.tiponacionalidadReturnGeneral;
	}

	public void settiponacionalidadReturnGeneral(TipoNacionalidadParameterReturnGeneral tiponacionalidadReturnGeneral) {
		this.tiponacionalidadReturnGeneral = tiponacionalidadReturnGeneral;
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
	
	
	public TipoNacionalidadLogic getTipoNacionalidadLogic()	{		
		return tiponacionalidadLogic;
	}

	public void setTipoNacionalidadLogic(TipoNacionalidadLogic tiponacionalidadLogic) {
		this.tiponacionalidadLogic = tiponacionalidadLogic;
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
	
	public Boolean getIsEsNuevoTipoNacionalidad() {
		return isEsNuevoTipoNacionalidad;
	}

	public void setIsEsNuevoTipoNacionalidad(Boolean isEsNuevoTipoNacionalidad) {
		this.isEsNuevoTipoNacionalidad = isEsNuevoTipoNacionalidad;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoNacionalidad() {
		return esParaAccionDesdeFormularioTipoNacionalidad;
	}
	
	public void setEsParaAccionDesdeFormularioTipoNacionalidad(Boolean esParaAccionDesdeFormularioTipoNacionalidad) {
		this.esParaAccionDesdeFormularioTipoNacionalidad = esParaAccionDesdeFormularioTipoNacionalidad;
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

			if(this.tiponacionalidadSessionBean==null) {
				this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
			}

			if(!this.tiponacionalidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiponacionalidadSessionBean.getlidEmpresaActual());
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

					if(this.tiponacionalidad!=null) {
						this.tiponacionalidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
						this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoNacionalidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
						if(this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoNacionalidadGenerico)throws Exception
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
				jComboBoxid_empresaTipoNacionalidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoNacionalidadGenerico!=null && jComboBoxid_empresaTipoNacionalidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoNacionalidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoNacionalidad tiponacionalidad,JComboBox jComboBoxid_empresaTipoNacionalidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoNacionalidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoNacionalidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiponacionalidad.setid_empresa(empresaAux.getId());
				tiponacionalidad.setempresa_descripcion(TipoNacionalidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiponacionalidad.setEmpresa(empresaAux);			}
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

					if(!TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { 
							this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { 
					}

					if(!TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
							this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
							this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoNacionalidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoNacionalidadConstantesFunciones.refrescarForeignKeysDescripcionesTipoNacionalidad(this.tiponacionalidadLogic.getTipoNacionalidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoNacionalidadConstantesFunciones.refrescarForeignKeysDescripcionesTipoNacionalidad(this.tiponacionalidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiponacionalidadLogic.setTipoNacionalidads(this.tiponacionalidads);
			tiponacionalidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoNacionalidadParameterReturnGeneral getTipoNacionalidadParameterGeneral() {
		return this.tiponacionalidadParameterGeneral;
	}
	
	public void setTipoNacionalidadParameterGeneral(TipoNacionalidadParameterReturnGeneral tiponacionalidadParameterGeneral) {
		this.tiponacionalidadParameterGeneral = tiponacionalidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoNacionalidad() {
		return isPermisoTodoTipoNacionalidad;
	}

	public void setIsPermisoTodoTipoNacionalidad(Boolean isPermisoTodoTipoNacionalidad) {
		this.isPermisoTodoTipoNacionalidad = isPermisoTodoTipoNacionalidad;
	}

	public Boolean getIsPermisoNuevoTipoNacionalidad() {
		return isPermisoNuevoTipoNacionalidad;
	}

	public void setIsPermisoNuevoTipoNacionalidad(Boolean isPermisoNuevoTipoNacionalidad) {
		this.isPermisoNuevoTipoNacionalidad = isPermisoNuevoTipoNacionalidad;
	}

	public Boolean getIsPermisoActualizarTipoNacionalidad() {
		return isPermisoActualizarTipoNacionalidad;
	}

	public void setIsPermisoActualizarTipoNacionalidad(Boolean isPermisoActualizarTipoNacionalidad) {
		this.isPermisoActualizarTipoNacionalidad = isPermisoActualizarTipoNacionalidad;
	}

	public Boolean getIsPermisoEliminarTipoNacionalidad() {
		return isPermisoEliminarTipoNacionalidad;
	}

	public void setIsPermisoEliminarTipoNacionalidad(Boolean isPermisoEliminarTipoNacionalidad) {
		this.isPermisoEliminarTipoNacionalidad = isPermisoEliminarTipoNacionalidad;
	}

	public Boolean getIsPermisoGuardarCambiosTipoNacionalidad() {
		return isPermisoGuardarCambiosTipoNacionalidad;
	}

	public void setIsPermisoGuardarCambiosTipoNacionalidad(Boolean isPermisoGuardarCambiosTipoNacionalidad) {
		this.isPermisoGuardarCambiosTipoNacionalidad = isPermisoGuardarCambiosTipoNacionalidad;
	}
	
	public Boolean getIsPermisoConsultaTipoNacionalidad() {
		return isPermisoConsultaTipoNacionalidad;
	}

	public void setIsPermisoConsultaTipoNacionalidad(Boolean isPermisoConsultaTipoNacionalidad) {
		this.isPermisoConsultaTipoNacionalidad = isPermisoConsultaTipoNacionalidad;
	}

	public Boolean getIsPermisoBusquedaTipoNacionalidad() {
		return isPermisoBusquedaTipoNacionalidad;
	}

	public void setIsPermisoBusquedaTipoNacionalidad(Boolean isPermisoBusquedaTipoNacionalidad) {
		this.isPermisoBusquedaTipoNacionalidad = isPermisoBusquedaTipoNacionalidad;
	}

	public Boolean getIsPermisoReporteTipoNacionalidad() {
		return isPermisoReporteTipoNacionalidad;
	}

	public void setIsPermisoReporteTipoNacionalidad(Boolean isPermisoReporteTipoNacionalidad) {
		this.isPermisoReporteTipoNacionalidad = isPermisoReporteTipoNacionalidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoNacionalidad() {
		return isPermisoPaginacionMedioTipoNacionalidad;
	}

	public void setIsPermisoPaginacionMedioTipoNacionalidad(Boolean isPermisoPaginacionMedioTipoNacionalidad) {
		this.isPermisoPaginacionMedioTipoNacionalidad = isPermisoPaginacionMedioTipoNacionalidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoNacionalidad() {
		return isPermisoPaginacionTodoTipoNacionalidad;
	}

	public void setIsPermisoPaginacionTodoTipoNacionalidad(Boolean isPermisoPaginacionTodoTipoNacionalidad) {
		this.isPermisoPaginacionTodoTipoNacionalidad = isPermisoPaginacionTodoTipoNacionalidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoNacionalidad() {
		return isPermisoPaginacionAltoTipoNacionalidad;
	}

	public void setIsPermisoPaginacionAltoTipoNacionalidad(Boolean isPermisoPaginacionAltoTipoNacionalidad) {
		this.isPermisoPaginacionAltoTipoNacionalidad = isPermisoPaginacionAltoTipoNacionalidad;
	}
	
	public Boolean getIsPermisoCopiarTipoNacionalidad() {
		return isPermisoCopiarTipoNacionalidad;
	}

	public void setIsPermisoCopiarTipoNacionalidad(Boolean isPermisoCopiarTipoNacionalidad) {
		this.isPermisoCopiarTipoNacionalidad = isPermisoCopiarTipoNacionalidad;
	}
	
	public Boolean getIsPermisoVerFormTipoNacionalidad() {
		return isPermisoVerFormTipoNacionalidad;
	}

	public void setIsPermisoVerFormTipoNacionalidad(Boolean isPermisoVerFormTipoNacionalidad) {
		this.isPermisoVerFormTipoNacionalidad = isPermisoVerFormTipoNacionalidad;
	}
	
	public Boolean getIsPermisoDuplicarTipoNacionalidad() {
		return isPermisoDuplicarTipoNacionalidad;
	}

	public void setIsPermisoDuplicarTipoNacionalidad(Boolean isPermisoDuplicarTipoNacionalidad) {
		this.isPermisoDuplicarTipoNacionalidad = isPermisoDuplicarTipoNacionalidad;
	}
	
	public Boolean getIsPermisoOrdenTipoNacionalidad() {
		return isPermisoOrdenTipoNacionalidad;
	}

	public void setIsPermisoOrdenTipoNacionalidad(Boolean isPermisoOrdenTipoNacionalidad) {
		this.isPermisoOrdenTipoNacionalidad = isPermisoOrdenTipoNacionalidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoNacionalidad() {
		return isVisibilidadCeldaNuevoTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaNuevoTipoNacionalidad(Boolean isVisibilidadCeldaNuevoTipoNacionalidad) {
		this.isVisibilidadCeldaNuevoTipoNacionalidad = isVisibilidadCeldaNuevoTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoNacionalidad() {
		return isVisibilidadCeldaDuplicarTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaDuplicarTipoNacionalidad(Boolean isVisibilidadCeldaDuplicarTipoNacionalidad) {
		this.isVisibilidadCeldaDuplicarTipoNacionalidad = isVisibilidadCeldaDuplicarTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoNacionalidad() {
		return isVisibilidadCeldaCopiarTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaCopiarTipoNacionalidad(Boolean isVisibilidadCeldaCopiarTipoNacionalidad) {
		this.isVisibilidadCeldaCopiarTipoNacionalidad = isVisibilidadCeldaCopiarTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoNacionalidad() {
		return isVisibilidadCeldaVerFormTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaVerFormTipoNacionalidad(Boolean isVisibilidadCeldaVerFormTipoNacionalidad) {
		this.isVisibilidadCeldaVerFormTipoNacionalidad = isVisibilidadCeldaVerFormTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoNacionalidad() {
		return isVisibilidadCeldaOrdenTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaOrdenTipoNacionalidad(Boolean isVisibilidadCeldaOrdenTipoNacionalidad) {
		this.isVisibilidadCeldaOrdenTipoNacionalidad = isVisibilidadCeldaOrdenTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoNacionalidad() {
		return isVisibilidadCeldaNuevoRelacionesTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoNacionalidad(Boolean isVisibilidadCeldaNuevoRelacionesTipoNacionalidad) {
		this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad = isVisibilidadCeldaNuevoRelacionesTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoNacionalidad() {
		return isVisibilidadCeldaModificarTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaModificarTipoNacionalidad(Boolean isVisibilidadCeldaModificarTipoNacionalidad) {
		this.isVisibilidadCeldaModificarTipoNacionalidad = isVisibilidadCeldaModificarTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoNacionalidad() {
		return isVisibilidadCeldaActualizarTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaActualizarTipoNacionalidad(Boolean isVisibilidadCeldaActualizarTipoNacionalidad) {
		this.isVisibilidadCeldaActualizarTipoNacionalidad = isVisibilidadCeldaActualizarTipoNacionalidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoNacionalidad() {
		return isVisibilidadCeldaEliminarTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaEliminarTipoNacionalidad(Boolean isVisibilidadCeldaEliminarTipoNacionalidad) {
		this.isVisibilidadCeldaEliminarTipoNacionalidad = isVisibilidadCeldaEliminarTipoNacionalidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoNacionalidad() {
		return isVisibilidadCeldaCancelarTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaCancelarTipoNacionalidad(Boolean isVisibilidadCeldaCancelarTipoNacionalidad) {
		this.isVisibilidadCeldaCancelarTipoNacionalidad = isVisibilidadCeldaCancelarTipoNacionalidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoNacionalidad() {
		return isVisibilidadCeldaGuardarTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaGuardarTipoNacionalidad(Boolean isVisibilidadCeldaGuardarTipoNacionalidad) {
		this.isVisibilidadCeldaGuardarTipoNacionalidad = isVisibilidadCeldaGuardarTipoNacionalidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoNacionalidad() {
		return isVisibilidadCeldaGuardarCambiosTipoNacionalidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoNacionalidad(Boolean isVisibilidadCeldaGuardarCambiosTipoNacionalidad) {
		this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad = isVisibilidadCeldaGuardarCambiosTipoNacionalidad;
	}
		
	public TipoNacionalidadSessionBean gettiponacionalidadSessionBean() {
		return this.tiponacionalidadSessionBean;
	}
	
	public void settiponacionalidadSessionBean(TipoNacionalidadSessionBean tiponacionalidadSessionBean) {
		this.tiponacionalidadSessionBean=tiponacionalidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(TipoNacionalidad tiponacionalidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiponacionalidad,null);
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
	
	public void bugActualizarReferenciaActual(TipoNacionalidad tiponacionalidad,TipoNacionalidad tiponacionalidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoNacionalidad(tiponacionalidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiponacionalidadAux.setId(tiponacionalidad.getId());
		tiponacionalidadAux.setVersionRow(tiponacionalidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoNacionalidad();
		
			int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiponacionalidadValidator.getInvalidValues(this.tiponacionalidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiponacionalidadLogic.setDatosCliente(datosCliente);
			tiponacionalidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiponacionalidadAux=new  TipoNacionalidad();
				
				tiponacionalidadAux.setIsNew(true);
				tiponacionalidadAux.setIsChanged(true);
				
				tiponacionalidadAux.setTipoNacionalidadOriginal(this.tiponacionalidad);
				
				tiponacionalidadAux.setId(this.tiponacionalidad.getId());	
				tiponacionalidadAux.setVersionRow(this.tiponacionalidad.getVersionRow());	
				tiponacionalidadAux.setid_empresa(this.tiponacionalidad.getid_empresa());	
				tiponacionalidadAux.setcodigo(this.tiponacionalidad.getcodigo());	
				tiponacionalidadAux.setnombre(this.tiponacionalidad.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiponacionalidadAux,tiponacionalidadLogic.getTipoNacionalidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponacionalidadAux,tiponacionalidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponacionalidadLogic.saveTipoNacionalidads();//WithConnection
						//tiponacionalidadLogic.getSetVersionRowTipoNacionalidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponacionalidad,tiponacionalidadAux);
					
					this.refrescarForeignKeysDescripcionesTipoNacionalidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponacionalidadLogic.saveTipoNacionalidadRelaciones(tiponacionalidadAux);//WithConnection
								//tiponacionalidadLogic.getSetVersionRowTipoNacionalidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponacionalidad,tiponacionalidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponacionalidadAux,tiponacionalidadLogic.getTipoNacionalidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponacionalidadAux,tiponacionalidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponacionalidad,tiponacionalidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiponacionalidadAux=new  TipoNacionalidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado() 
					|| (this.tiponacionalidadSessionBean.getEsGuardarRelacionado() && this.tiponacionalidad.getId()>=0)) {
						
					tiponacionalidadAux.setIsNew(false);
				}
				
				tiponacionalidadAux.setIsDeleted(false);
			
				tiponacionalidadAux.setId(this.tiponacionalidad.getId());	
				tiponacionalidadAux.setVersionRow(this.tiponacionalidad.getVersionRow());	
				tiponacionalidadAux.setid_empresa(this.tiponacionalidad.getid_empresa());	
				tiponacionalidadAux.setcodigo(this.tiponacionalidad.getcodigo());	
				tiponacionalidadAux.setnombre(this.tiponacionalidad.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponacionalidadAux,tiponacionalidadLogic.getTipoNacionalidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponacionalidadAux,tiponacionalidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponacionalidadLogic.saveTipoNacionalidads();//WithConnection
						//tiponacionalidadLogic.getSetVersionRowTipoNacionalidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiponacionalidad,tiponacionalidadAux);
					
					this.refrescarForeignKeysDescripcionesTipoNacionalidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponacionalidadLogic.saveTipoNacionalidadRelaciones(tiponacionalidadAux);//WithConnection
								//tiponacionalidadLogic.getSetVersionRowTipoNacionalidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiponacionalidad,tiponacionalidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiponacionalidadAux,tiponacionalidadLogic.getTipoNacionalidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiponacionalidadAux,tiponacionalidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiponacionalidad,tiponacionalidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiponacionalidadAux=new  TipoNacionalidad();
				
				tiponacionalidadAux.setIsNew(false);
				tiponacionalidadAux.setIsChanged(false);
				
				tiponacionalidadAux.setIsDeleted(true);
				
				tiponacionalidadAux.setId(this.tiponacionalidad.getId());	
				tiponacionalidadAux.setVersionRow(this.tiponacionalidad.getVersionRow());	
				tiponacionalidadAux.setid_empresa(this.tiponacionalidad.getid_empresa());	
				tiponacionalidadAux.setcodigo(this.tiponacionalidad.getcodigo());	
				tiponacionalidadAux.setnombre(this.tiponacionalidad.getnombre());	
				
				if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiponacionalidadAux.getId()>=0) {	
						this.tiponacionalidadsEliminados.add(tiponacionalidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiponacionalidadAux,tiponacionalidadLogic.getTipoNacionalidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponacionalidadAux,tiponacionalidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponacionalidadLogic.saveTipoNacionalidads();//WithConnection
						//tiponacionalidadLogic.getSetVersionRowTipoNacionalidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiponacionalidadLogic.saveTipoNacionalidadRelaciones(tiponacionalidadAux);//WithConnection
								//tiponacionalidadLogic.getSetVersionRowTipoNacionalidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiponacionalidadAux,tiponacionalidadLogic.getTipoNacionalidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiponacionalidadAux,tiponacionalidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.getTipoNacionalidads().addAll(this.tiponacionalidadsEliminados);
					
					tiponacionalidadLogic.saveTipoNacionalidads();//WithConnection
					//tiponacionalidadLogic.getSetVersionRowTipoNacionalidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoNacionalidad();
				
				this.tiponacionalidadsEliminados= new ArrayList<TipoNacionalidad>();		
			}
			
			if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Nacionalidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiponacionalidad=tiponacionalidadAux;
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
      		//this.finishProcessTipoNacionalidad();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoNacionalidad tiponacionalidadLocal) throws Exception {
		
		if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoNacionalidad tiponacionalidadLocal) throws Exception {	
		if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiponacionalidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoNacionalidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiponacionalidadValidator.getInvalidValues(this.tiponacionalidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoNacionalidad tiponacionalidad,List<TipoNacionalidad> tiponacionalidads) throws Exception {
		try	{		
			TipoNacionalidadConstantesFunciones.actualizarLista(tiponacionalidad,tiponacionalidads,this.tiponacionalidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoNacionalidad tiponacionalidad,List<TipoNacionalidad> tiponacionalidads) throws Exception {
		try	{			
			TipoNacionalidadConstantesFunciones.actualizarSelectedLista(tiponacionalidad,tiponacionalidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoNacionalidad> tiponacionalidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiponacionalidadsLocal=this.tiponacionalidadLogic.getTipoNacionalidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiponacionalidadsLocal=this.tiponacionalidads;
			}
			//ARCHITECTURE
		
			for(TipoNacionalidad tiponacionalidadLocal:tiponacionalidadsLocal) {
				if(this.permiteMantenimiento(tiponacionalidadLocal) && tiponacionalidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoNacionalidadConstantesFunciones.getTipoNacionalidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoNacionalidadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelid_empresaTipoNacionalidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoNacionalidadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelcodigoTipoNacionalidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoNacionalidadConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelnombreTipoNacionalidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelid_empresaTipoNacionalidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelcodigoTipoNacionalidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelnombreTipoNacionalidad,"");
		
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
		this.iIdNuevoTipoNacionalidad--;	
		
		
		this.tiponacionalidadAux=new TipoNacionalidad();
		
		this.tiponacionalidadAux.setId(this.iIdNuevoTipoNacionalidad);
		this.tiponacionalidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiponacionalidadLogic.getTipoNacionalidads().add(this.tiponacionalidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiponacionalidads.add(this.tiponacionalidadAux);
		}
		//ARCHITECTURE
		
		this.tiponacionalidad=this.tiponacionalidadAux;
		
		if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoNacionalidad(this.tiponacionalidad);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNacionalidad(this.tiponacionalidad);
		}
				
		//this.setDefaultControlesTipoNacionalidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoNacionalidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoNacionalidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNacionalidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNacionalidad(this.tiponacionalidadBean,this.tiponacionalidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoNacionalidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
			classes=TipoNacionalidadConstantesFunciones.getClassesRelationshipsOfTipoNacionalidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiponacionalidadReturnGeneral=tiponacionalidadLogic.procesarEventosTipoNacionalidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponacionalidadLogic.getTipoNacionalidads(),this.tiponacionalidad,this.tiponacionalidadParameterGeneral,this.isEsNuevoTipoNacionalidad,classes);//this.tiponacionalidadLogic.getTipoNacionalidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoNacionalidad(this.tiponacionalidadReturnGeneral,this.tiponacionalidadBean,false);
		
		if(this.tiponacionalidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoNacionalidad(this.tiponacionalidadReturnGeneral.getTipoNacionalidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoNacionalidad(this.tiponacionalidadReturnGeneral.getTipoNacionalidad());
		}
		
		if(this.tiponacionalidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoNacionalidad(this.tiponacionalidadReturnGeneral.getTipoNacionalidad(),classes);//this.tiponacionalidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoNacionalidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoNacionalidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.RecargarFormTipoNacionalidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoNacionalidad(false);
						
			if(tiponacionalidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNacionalidad();
			}
			
			this.actualizarVisualTableDatosTipoNacionalidad();
			
			this.jTableDatosTipoNacionalidad.setRowSelectionInterval(this.getIndiceNuevoTipoNacionalidad(), this.getIndiceNuevoTipoNacionalidad());
			
			this.seleccionarFilaTablaTipoNacionalidadActual();
						
			this.actualizarEstadoCeldasBotonesTipoNacionalidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoNacionalidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.setEnabled(isHabilitar && this.tiponacionalidadConstantesFunciones.activarcodigoTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.setEnabled(isHabilitar && this.tiponacionalidadConstantesFunciones.activarnombreTipoNacionalidad);	
		//
		this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setEnabled(isHabilitar && this.tiponacionalidadConstantesFunciones.activarid_empresaTipoNacionalidad);
	};
	
	public void setDefaultControlesTipoNacionalidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoNacionalidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiponacionalidadSessionBean.setConGuardarRelaciones(true);			
			this.tiponacionalidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.setVisible(true);
			
					
		} else {
			//this.tiponacionalidadSessionBean.setConGuardarRelaciones(false);			
			this.tiponacionalidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoNacionalidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
				if(tiponacionalidadAux.getId().equals(this.iIdNuevoTipoNacionalidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidads) {
				if(tiponacionalidadAux.getId().equals(this.iIdNuevoTipoNacionalidad)) {
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
	
	public int getIndiceActualTipoNacionalidad(TipoNacionalidad tiponacionalidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
				if(tiponacionalidadAux.getId().equals(tiponacionalidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidads) {
				if(tiponacionalidadAux.getId().equals(tiponacionalidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoNacionalidad(TipoNacionalidad tiponacionalidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
				if(tiponacionalidadAux.getTipoNacionalidadOriginal().getId().equals(tiponacionalidadOriginal.getId())) {
					existe=true;
					tiponacionalidadOriginal.setId(tiponacionalidadAux.getId());
					tiponacionalidadOriginal.setVersionRow(tiponacionalidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidads) {
				if(tiponacionalidadAux.getTipoNacionalidadOriginal().getId().equals(tiponacionalidadOriginal.getId())) {
					existe=true;
					tiponacionalidadOriginal.setId(tiponacionalidadAux.getId());
					tiponacionalidadOriginal.setVersionRow(tiponacionalidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoNacionalidad(Boolean esParaCancelar) throws Exception {
		tiponacionalidadsAux=new ArrayList<TipoNacionalidad>();
		tiponacionalidadAux=new TipoNacionalidad();
		
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
					if(tiponacionalidadAux.getId()<0) {
						tiponacionalidadsAux.add(tiponacionalidadAux);
					}		
				}
				this.iIdNuevoTipoNacionalidad=0L;
				this.tiponacionalidadLogic.getTipoNacionalidads().removeAll(tiponacionalidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidads) {
					if(tiponacionalidadAux.getId()<0) {
						tiponacionalidadsAux.add(tiponacionalidadAux);
					}		
				}
				this.iIdNuevoTipoNacionalidad=0L;
				this.tiponacionalidads.removeAll(tiponacionalidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoNacionalidad 
					&& this.tiponacionalidadLogic.getTipoNacionalidads().size()>0
					) {
					tiponacionalidadAux=this.tiponacionalidadLogic.getTipoNacionalidads().get(this.tiponacionalidadLogic.getTipoNacionalidads().size() - 1);
				
					if(tiponacionalidadAux.getId()<0) {
						this.tiponacionalidadLogic.getTipoNacionalidads().remove(tiponacionalidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoNacionalidad && this.tiponacionalidads.size()>0) {
					tiponacionalidadAux=this.tiponacionalidads.get(this.tiponacionalidads.size() - 1);
				
					if(tiponacionalidadAux.getId()<0) {
						this.tiponacionalidads.remove(tiponacionalidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoNacionalidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiponacionalidad.getId()<0) {
				this.tiponacionalidadLogic.getTipoNacionalidads().remove(this.tiponacionalidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiponacionalidad.getId()<0) {
				this.tiponacionalidads.remove(this.tiponacionalidad);
			}
		}			
	}
	
	public void setEstadosInicialesTipoNacionalidad(List<TipoNacionalidad> tiponacionalidadsAux) throws Exception {
		TipoNacionalidadConstantesFunciones.setEstadosInicialesTipoNacionalidad(tiponacionalidadsAux);
	}
	
	public void setEstadosInicialesTipoNacionalidad(TipoNacionalidad tiponacionalidadAux) throws Exception {
		TipoNacionalidadConstantesFunciones.setEstadosInicialesTipoNacionalidad(tiponacionalidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoNacionalidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoNacionalidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoNacionalidadActual()) {
				if(!this.isEsNuevoTipoNacionalidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoNacionalidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoNacionalidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoNacionalidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Nacionalidad ?", "MANTENIMIENTO DE Tipo Nacionalidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoNacionalidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoNacionalidad tiponacionalidad) throws Exception {
		TipoNacionalidadConstantesFunciones.seleccionarAsignar(this.tiponacionalidad,tiponacionalidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoNacionalidad=this.isPermisoActualizarOriginalTipoNacionalidad;
			
			
			this.seleccionarAsignar(tiponacionalidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoNacionalidadConstantesFunciones.quitarEspaciosTipoNacionalidad(this.tiponacionalidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoNacionalidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiponacionalidadSessionBean.setsFuncionBusquedaRapida(this.tiponacionalidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoNacionalidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoNacionalidad(esParaCancelar);				
				this.cancelarNuevoTipoNacionalidad(esParaCancelar);								
			}
			
			this.tiponacionalidad=new TipoNacionalidad();
			
			this.inicializarTipoNacionalidad();
			
			this.actualizarEstadoCeldasBotonesTipoNacionalidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoNacionalidad() throws Exception {
		try {
			TipoNacionalidadConstantesFunciones.inicializarTipoNacionalidad(this.tiponacionalidad);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiponacionalidadLogic.getTipoNacionalidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoNacionalidads(String sAccionBusqueda,List<TipoNacionalidad> tiponacionalidadsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoNacionalidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoNacionalidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoNacionalidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoNacionalidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Nacionalidades");		
		parameters.put("busquedapor", TipoNacionalidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoNacionalidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoNacionalidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoNacionalidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoNacionalidad=new JRBeanArrayDataSource(TipoNacionalidadJInternalFrame.TraerTipoNacionalidadBeans(tiponacionalidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoNacionalidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoNacionalidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoNacionalidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoNacionalidadBean.TraerTipoNacionalidadBeans(tiponacionalidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoNacionalidads(sAccionBusqueda,sTipoArchivoReporte,tiponacionalidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoNacionalidads(sAccionBusqueda,sTipoArchivoReporte,tiponacionalidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoNacionalidadActionPerformed(null);
					//this.generarExcelReporteTipoNacionalidads(sAccionBusqueda,sTipoArchivoReporte,tiponacionalidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoNacionalidads(sAccionBusqueda,sTipoArchivoReporte,tiponacionalidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoNacionalidads(sAccionBusqueda,sTipoArchivoReporte,tiponacionalidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoNacionalidads(sAccionBusqueda,sTipoArchivoReporte,tiponacionalidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoNacionalidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNacionalidad> tiponacionalidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponacionalidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNacionalidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNacionalidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoNacionalidad tiponacionalidad : tiponacionalidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoNacionalidadConstantesFunciones.generarExcelReporteDataTipoNacionalidad("NORMAL",row,workbook,tiponacionalidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoNacionalidad(String sTipo,Row row,Workbook workbook) {
		
		TipoNacionalidadConstantesFunciones.generarExcelReporteHeaderTipoNacionalidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoNacionalidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNacionalidad> tiponacionalidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponacionalidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNacionalidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoNacionalidad tiponacionalidad : tiponacionalidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoNacionalidadConstantesFunciones.getTipoNacionalidadDescripcion(tiponacionalidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponacionalidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNacionalidadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponacionalidad.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiponacionalidad.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoNacionalidads(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoNacionalidad> tiponacionalidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoNacionalidad> tiponacionalidadsRespaldo=null;
		
		classes=TipoNacionalidadConstantesFunciones.getClassesRelationshipsOfTipoNacionalidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiponacionalidadLogic.setDatosCliente(this.datosCliente);
		this.tiponacionalidadLogic.setDatosDeep(this.datosDeep);
		this.tiponacionalidadLogic.setIsConDeep(true);
		
		tiponacionalidadsRespaldo=this.tiponacionalidadLogic.getTipoNacionalidads();
		
		this.tiponacionalidadLogic.setTipoNacionalidads(tiponacionalidadsParaReportes);	
		this.tiponacionalidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiponacionalidadsParaReportes=this.tiponacionalidadLogic.getTipoNacionalidads();
		this.tiponacionalidadLogic.setTipoNacionalidads(tiponacionalidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponacionalidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoNacionalidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoNacionalidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoNacionalidad tiponacionalidad : tiponacionalidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoNacionalidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoNacionalidadConstantesFunciones.generarExcelReporteDataTipoNacionalidad("NORMAL",row,workbook,tiponacionalidad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoNacionalidadConstantesFunciones.getTipoNacionalidadDescripcion(tiponacionalidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoNacionalidad() throws Exception {		
		this.startProcessTipoNacionalidad(true);
	}
	
	public void startProcessTipoNacionalidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoNacionalidad ,this.jPanelParametrosReportesTipoNacionalidad, this.jScrollPanelDatosTipoNacionalidad,this.jPanelPaginacionTipoNacionalidad, this.jScrollPanelDatosEdicionTipoNacionalidad, this.jPanelAccionesTipoNacionalidad,this.jPanelAccionesFormularioTipoNacionalidad,this.jmenuBarTipoNacionalidad,this.jmenuBarDetalleTipoNacionalidad,this.jTtoolBarTipoNacionalidad,this.jTtoolBarDetalleTipoNacionalidad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNacionalidad=this.jTabbedPaneBusquedasTipoNacionalidad; 
		
		final JPanel jPanelParametrosReportesTipoNacionalidad=this.jPanelParametrosReportesTipoNacionalidad;
		//final JScrollPane jScrollPanelDatosTipoNacionalidad=this.jScrollPanelDatosTipoNacionalidad;
		final JTable jTableDatosTipoNacionalidad=this.jTableDatosTipoNacionalidad;		
		final JPanel jPanelPaginacionTipoNacionalidad=this.jPanelPaginacionTipoNacionalidad;
		//final JScrollPane jScrollPanelDatosEdicionTipoNacionalidad=this.jScrollPanelDatosEdicionTipoNacionalidad;
		final JPanel jPanelAccionesTipoNacionalidad=this.jPanelAccionesTipoNacionalidad;
		
		JPanel jPanelCamposAuxiliarTipoNacionalidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoNacionalidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			jPanelCamposAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jPanelCamposTipoNacionalidad;
			jPanelAccionesFormularioAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jPanelAccionesFormularioTipoNacionalidad;
		}
		
		final JPanel jPanelCamposTipoNacionalidad=jPanelCamposAuxiliarTipoNacionalidad;
		final JPanel jPanelAccionesFormularioTipoNacionalidad=jPanelAccionesFormularioAuxiliarTipoNacionalidad;
		
		
		final JMenuBar jmenuBarTipoNacionalidad=this.jmenuBarTipoNacionalidad;
		final JToolBar jTtoolBarTipoNacionalidad=this.jTtoolBarTipoNacionalidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoNacionalidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNacionalidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			jmenuBarDetalleAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jmenuBarDetalleTipoNacionalidad;
			jTtoolBarDetalleAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jTtoolBarDetalleTipoNacionalidad;
		}
		
		final JMenuBar jmenuBarDetalleTipoNacionalidad=jmenuBarDetalleAuxiliarTipoNacionalidad;
		final JToolBar jTtoolBarDetalleTipoNacionalidad=jTtoolBarDetalleAuxiliarTipoNacionalidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNacionalidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNacionalidad;
			processRunnable.jTableDatos=jTableDatosTipoNacionalidad;
			processRunnable.jPanelCampos=jPanelCamposTipoNacionalidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNacionalidad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNacionalidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNacionalidad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNacionalidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNacionalidad;
			processRunnable.jTtoolBar=jTtoolBarTipoNacionalidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNacionalidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoNacionalidad ,jPanelParametrosReportesTipoNacionalidad,jTableDatosTipoNacionalidad, /*jScrollPanelDatosTipoNacionalidad,*/jPanelCamposTipoNacionalidad,jPanelPaginacionTipoNacionalidad, /*jScrollPanelDatosEdicionTipoNacionalidad,*/ jPanelAccionesTipoNacionalidad,jPanelAccionesFormularioTipoNacionalidad,jmenuBarTipoNacionalidad,jmenuBarDetalleTipoNacionalidad,jTtoolBarTipoNacionalidad,jTtoolBarDetalleTipoNacionalidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoNacionalidad ,jPanelParametrosReportesTipoNacionalidad, jScrollPanelDatosTipoNacionalidad,jPanelPaginacionTipoNacionalidad, jScrollPanelDatosEdicionTipoNacionalidad, jPanelAccionesTipoNacionalidad,jPanelAccionesFormularioTipoNacionalidad,jmenuBarTipoNacionalidad,jmenuBarDetalleTipoNacionalidad,jTtoolBarTipoNacionalidad,jTtoolBarDetalleTipoNacionalidad);
						
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
	
	public void finishProcessTipoNacionalidad() {// throws Exception 
		this.finishProcessTipoNacionalidad(true);
	}
	
	public void finishProcessTipoNacionalidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoNacionalidad ,this.jPanelParametrosReportesTipoNacionalidad, this.jScrollPanelDatosTipoNacionalidad,this.jPanelPaginacionTipoNacionalidad, this.jScrollPanelDatosEdicionTipoNacionalidad, this.jPanelAccionesTipoNacionalidad,this.jPanelAccionesFormularioTipoNacionalidad,this.jmenuBarTipoNacionalidad,this.jmenuBarDetalleTipoNacionalidad,this.jTtoolBarTipoNacionalidad,this.jTtoolBarDetalleTipoNacionalidad);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoNacionalidad=this.jTabbedPaneBusquedasTipoNacionalidad; 
		
		final JPanel jPanelParametrosReportesTipoNacionalidad=this.jPanelParametrosReportesTipoNacionalidad;
		//final JScrollPane jScrollPanelDatosTipoNacionalidad=this.jScrollPanelDatosTipoNacionalidad;
		final JTable jTableDatosTipoNacionalidad=this.jTableDatosTipoNacionalidad;		
		final JPanel jPanelPaginacionTipoNacionalidad=this.jPanelPaginacionTipoNacionalidad;
		//final JScrollPane jScrollPanelDatosEdicionTipoNacionalidad=this.jScrollPanelDatosEdicionTipoNacionalidad;
		final JPanel jPanelAccionesTipoNacionalidad=this.jPanelAccionesTipoNacionalidad;
		
		JPanel jPanelCamposAuxiliarTipoNacionalidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoNacionalidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			jPanelCamposAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jPanelCamposTipoNacionalidad;
			jPanelAccionesFormularioAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jPanelAccionesFormularioTipoNacionalidad;
		}
		
		final JPanel jPanelCamposTipoNacionalidad=jPanelCamposAuxiliarTipoNacionalidad;
		final JPanel jPanelAccionesFormularioTipoNacionalidad=jPanelAccionesFormularioAuxiliarTipoNacionalidad;
		
		
		final JMenuBar jmenuBarTipoNacionalidad=this.jmenuBarTipoNacionalidad;		
		final JToolBar jTtoolBarTipoNacionalidad=this.jTtoolBarTipoNacionalidad;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoNacionalidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoNacionalidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			jmenuBarDetalleAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jmenuBarDetalleTipoNacionalidad;
			jTtoolBarDetalleAuxiliarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jTtoolBarDetalleTipoNacionalidad;		
		}
		
		final JMenuBar jmenuBarDetalleTipoNacionalidad=jmenuBarDetalleAuxiliarTipoNacionalidad;
		final JToolBar jTtoolBarDetalleTipoNacionalidad=jTtoolBarDetalleAuxiliarTipoNacionalidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoNacionalidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoNacionalidad;
			processRunnable.jTableDatos=jTableDatosTipoNacionalidad;
			processRunnable.jPanelCampos=jPanelCamposTipoNacionalidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoNacionalidad;
			processRunnable.jPanelAcciones=jPanelAccionesTipoNacionalidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoNacionalidad;
			
			
			processRunnable.jmenuBar=jmenuBarTipoNacionalidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoNacionalidad;
			processRunnable.jTtoolBar=jTtoolBarTipoNacionalidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoNacionalidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoNacionalidad ,jPanelParametrosReportesTipoNacionalidad, jTableDatosTipoNacionalidad,/*jScrollPanelDatosTipoNacionalidad,*/jPanelCamposTipoNacionalidad,jPanelPaginacionTipoNacionalidad, /*jScrollPanelDatosEdicionTipoNacionalidad,*/ jPanelAccionesTipoNacionalidad,jPanelAccionesFormularioTipoNacionalidad,jmenuBarTipoNacionalidad,jmenuBarDetalleTipoNacionalidad,jTtoolBarTipoNacionalidad,jTtoolBarDetalleTipoNacionalidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoNacionalidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoNacionalidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoNacionalidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoNacionalidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoNacionalidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoNacionalidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoNacionalidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoNacionalidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoNacionalidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiponacionalidadConstantesFunciones.getsFinalQueryTipoNacionalidad();
		String  finalQueryPaginacionTodos=this.tiponacionalidadConstantesFunciones.getsFinalQueryTipoNacionalidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoNacionalidadConstantesFunciones.getArrayColumnasGlobalesNoTipoNacionalidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoNacionalidadConstantesFunciones.getArrayColumnasGlobalesTipoNacionalidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoNacionalidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiponacionalidadsEliminados= new ArrayList<TipoNacionalidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoNacionalidad();
		
				///*TipoNacionalidadSessionBean*/this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
			
			if(this.tiponacionalidadSessionBean==null) {
				this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
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
					this.iNumeroPaginacion=TipoNacionalidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoNacionalidadConstantesFunciones.getClassesForeignKeysOfTipoNacionalidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiponacionalidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiponacionalidadsAux= new ArrayList<TipoNacionalidad>();
			
				
			tiponacionalidadLogic.setDatosCliente(this.datosCliente);
			tiponacionalidadLogic.setDatosDeep(this.datosDeep);
			tiponacionalidadLogic.setIsConDeep(true);
			
			
			tiponacionalidadLogic.getTipoNacionalidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiponacionalidadLogic.getTodosTipoNacionalidads(finalQueryGlobal,pagination);
					
					//tiponacionalidadLogic.getTodosTipoNacionalidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiponacionalidadLogic.getTipoNacionalidads()==null|| tiponacionalidadLogic.getTipoNacionalidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponacionalidadsAux= new ArrayList<TipoNacionalidad>();
							tiponacionalidadsAux.addAll(tiponacionalidadLogic.getTipoNacionalidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponacionalidadsAux= new ArrayList<TipoNacionalidad>();
							tiponacionalidadsAux.addAll(tiponacionalidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponacionalidadLogic.getTodosTipoNacionalidads(finalQueryGlobal+"",this.pagination);												
							
							//tiponacionalidadLogic.getTodosTipoNacionalidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoNacionalidads("Todos",tiponacionalidadLogic.getTipoNacionalidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiponacionalidadLogic.setTipoNacionalidads(new ArrayList<TipoNacionalidad>());					
							tiponacionalidadLogic.getTipoNacionalidads().addAll(tiponacionalidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponacionalidads=new ArrayList<TipoNacionalidad>();
							tiponacionalidads.addAll(tiponacionalidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoNacionalidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoNacionalidad=this.idActual;
				
				} else if(this.idTipoNacionalidadActual!=null && this.idTipoNacionalidadActual!=0L) {
					idTipoNacionalidad=idTipoNacionalidadActual;
				}
				
					
				this.sDetalleReporte=TipoNacionalidadConstantesFunciones.getDetalleIndicePorId(idTipoNacionalidad);
				
				this.tiponacionalidads=new ArrayList<TipoNacionalidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiponacionalidadLogic.getEntity(idTipoNacionalidad);
					
					//tiponacionalidadLogic.getEntityWithConnection(idTipoNacionalidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponacionalidadLogic.setTipoNacionalidads(new ArrayList<TipoNacionalidad>());
					tiponacionalidadLogic.getTipoNacionalidads().add(tiponacionalidadLogic.getTipoNacionalidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponacionalidads=new ArrayList<TipoNacionalidad>();
					this.tiponacionalidads.add(tiponacionalidad);
				}
				
				if(tiponacionalidadLogic.getTipoNacionalidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoNacionalidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiponacionalidadLogic.getTipoNacionalidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoNacionalidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoNacionalidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiponacionalidadLogic.getTipoNacionalidads()==null||tiponacionalidadLogic.getTipoNacionalidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiponacionalidads==null|| tiponacionalidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponacionalidadsAux=new ArrayList<TipoNacionalidad>();
						tiponacionalidadsAux.addAll(tiponacionalidadLogic.getTipoNacionalidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponacionalidadsAux=new ArrayList<TipoNacionalidad>();
							tiponacionalidadsAux.addAll(tiponacionalidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiponacionalidadLogic.getTipoNacionalidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoNacionalidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoNacionalidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoNacionalidads("FK_IdEmpresa",tiponacionalidadLogic.getTipoNacionalidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoNacionalidads("FK_IdEmpresa",tiponacionalidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponacionalidadLogic.setTipoNacionalidads(new ArrayList<TipoNacionalidad>());
						tiponacionalidadLogic.getTipoNacionalidads().addAll(tiponacionalidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponacionalidads=new ArrayList<TipoNacionalidad>();
							tiponacionalidads.addAll(tiponacionalidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoNacionalidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoNacionalidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponacionalidadLogic.getTipoNacionalidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponacionalidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiponacionalidadLogic.getTipoNacionalidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiponacionalidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoNacionalidad tiponacionalidad) {
		Boolean permite=true;
		
		if(this.tiponacionalidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoNacionalidadConstantesFunciones.getOrderByListaTipoNacionalidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoNacionalidadConstantesFunciones.getOrderByListaTipoNacionalidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNacionalidad tiponacionalidad:tiponacionalidadLogic.getTipoNacionalidads()) {
				if(tiponacionalidad.getsType().equals(Constantes2.S_TOTALES)) {
					tiponacionalidadTotales=tiponacionalidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNacionalidad tiponacionalidad:this.tiponacionalidads) {
				if(tiponacionalidad.getsType().equals(Constantes2.S_TOTALES)) {
					tiponacionalidadTotales=tiponacionalidad;
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
			this.tiponacionalidadAux=new TipoNacionalidad();
			this.tiponacionalidadAux.setsType(Constantes2.S_TOTALES);
			this.tiponacionalidadAux.setIsNew(false);
			this.tiponacionalidadAux.setIsChanged(false);
			this.tiponacionalidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoNacionalidadConstantesFunciones.TotalizarValoresFilaTipoNacionalidad(this.tiponacionalidadLogic.getTipoNacionalidads(),this.tiponacionalidadAux);
				
				this.tiponacionalidadLogic.getTipoNacionalidads().add(this.tiponacionalidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoNacionalidadConstantesFunciones.TotalizarValoresFilaTipoNacionalidad(this.tiponacionalidads,this.tiponacionalidadAux);
				
				this.tiponacionalidads.add(this.tiponacionalidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiponacionalidadTotales=new TipoNacionalidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponacionalidadLogic.getTipoNacionalidads().remove(tiponacionalidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiponacionalidads.remove(tiponacionalidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiponacionalidadTotales=new TipoNacionalidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoNacionalidad tiponacionalidad:tiponacionalidadLogic.getTipoNacionalidads()) {
				if(tiponacionalidad.getsType().equals(Constantes2.S_TOTALES)) {
					tiponacionalidadTotales=tiponacionalidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNacionalidadConstantesFunciones.TotalizarValoresFilaTipoNacionalidad(this.tiponacionalidadLogic.getTipoNacionalidads(),tiponacionalidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoNacionalidad tiponacionalidad:this.tiponacionalidads) {
				if(tiponacionalidad.getsType().equals(Constantes2.S_TOTALES)) {
					tiponacionalidadTotales=tiponacionalidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoNacionalidadConstantesFunciones.TotalizarValoresFilaTipoNacionalidad(this.tiponacionalidads,tiponacionalidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoNacionalidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoNacionalidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponacionalidadLogic.getTipoNacionalidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoNacionalidad() {
		this.isPermisoTodoTipoNacionalidad=false;
		this.isPermisoNuevoTipoNacionalidad=false;
		this.isPermisoActualizarTipoNacionalidad=false;
		this.isPermisoActualizarOriginalTipoNacionalidad=false;
		this.isPermisoEliminarTipoNacionalidad=false;
		this.isPermisoGuardarCambiosTipoNacionalidad=false;
		this.isPermisoConsultaTipoNacionalidad=false;
		this.isPermisoBusquedaTipoNacionalidad=false;
		this.isPermisoReporteTipoNacionalidad=false;		
		this.isPermisoOrdenTipoNacionalidad=false;		
		this.isPermisoPaginacionMedioTipoNacionalidad=false;		
		this.isPermisoPaginacionAltoTipoNacionalidad=false;
		this.isPermisoPaginacionTodoTipoNacionalidad=false;
		this.isPermisoCopiarTipoNacionalidad=false;		
		this.isPermisoVerFormTipoNacionalidad=false;		
		this.isPermisoDuplicarTipoNacionalidad=false;		
		this.isPermisoOrdenTipoNacionalidad=false;		
	}
	
	public void setPermisosUsuarioTipoNacionalidad(Boolean isPermiso) {
		this.isPermisoTodoTipoNacionalidad=isPermiso;
		this.isPermisoNuevoTipoNacionalidad=isPermiso;
		this.isPermisoActualizarTipoNacionalidad=isPermiso;
		this.isPermisoActualizarOriginalTipoNacionalidad=isPermiso;
		this.isPermisoEliminarTipoNacionalidad=isPermiso;
		this.isPermisoGuardarCambiosTipoNacionalidad=isPermiso;
		this.isPermisoConsultaTipoNacionalidad=isPermiso;
		this.isPermisoBusquedaTipoNacionalidad=isPermiso;
		this.isPermisoReporteTipoNacionalidad=isPermiso;
		this.isPermisoOrdenTipoNacionalidad=isPermiso;		
		this.isPermisoPaginacionMedioTipoNacionalidad=isPermiso;		
		this.isPermisoPaginacionAltoTipoNacionalidad=isPermiso;		
		this.isPermisoPaginacionTodoTipoNacionalidad=isPermiso;		
		this.isPermisoCopiarTipoNacionalidad=isPermiso;		
		this.isPermisoVerFormTipoNacionalidad=isPermiso;		
		this.isPermisoDuplicarTipoNacionalidad=isPermiso;
		this.isPermisoOrdenTipoNacionalidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoNacionalidad(Boolean isPermiso) {
		//this.isPermisoTodoTipoNacionalidad=isPermiso;
		this.isPermisoNuevoTipoNacionalidad=isPermiso;
		this.isPermisoActualizarTipoNacionalidad=isPermiso;
		this.isPermisoActualizarOriginalTipoNacionalidad=isPermiso;
		this.isPermisoEliminarTipoNacionalidad=isPermiso;
		this.isPermisoGuardarCambiosTipoNacionalidad=isPermiso;
		//this.isPermisoConsultaTipoNacionalidad=isPermiso;
		//this.isPermisoBusquedaTipoNacionalidad=isPermiso;
		//this.isPermisoReporteTipoNacionalidad=isPermiso;
		//this.isPermisoOrdenTipoNacionalidad=isPermiso;		
		//this.isPermisoPaginacionMedioTipoNacionalidad=isPermiso;		
		//this.isPermisoPaginacionAltoTipoNacionalidad=isPermiso;		
		//this.isPermisoPaginacionTodoTipoNacionalidad=isPermiso;		
		//this.isPermisoCopiarTipoNacionalidad=isPermiso;		
		//this.isPermisoDuplicarTipoNacionalidad=isPermiso;
		//this.isPermisoOrdenTipoNacionalidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoNacionalidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoNacionalidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoNacionalidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoNacionalidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoNacionalidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoNacionalidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoNacionalidadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoNacionalidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoNacionalidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoNacionalidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoNacionalidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoNacionalidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoNacionalidad=this.isPermisoActualizarTipoNacionalidad;
			this.isPermisoEliminarTipoNacionalidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoNacionalidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoNacionalidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoNacionalidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoNacionalidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoNacionalidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNacionalidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoNacionalidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoNacionalidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoNacionalidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoNacionalidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoNacionalidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoNacionalidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoNacionalidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoNacionalidad.setToolTipText(this.jTableDatosTipoNacionalidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoNacionalidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoNacionalidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoNacionalidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoNacionalidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoNacionalidad() throws Exception {
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
	public void inicializarCombosForeignKeyTipoNacionalidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoNacionalidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoNacionalidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoNacionalidadListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoNacionalidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoNacionalidadParameterReturnGeneral tiponacionalidadReturnGeneral=new TipoNacionalidadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiponacionalidadConstantesFunciones.cargarid_empresaTipoNacionalidad)
					 || (this.esRecargarFks && this.tiponacionalidadConstantesFunciones.cargarid_empresaTipoNacionalidad)) {

					if(!this.tiponacionalidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiponacionalidadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiponacionalidadReturnGeneral=tiponacionalidadLogic.cargarCombosLoteForeignKeyTipoNacionalidad(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiponacionalidadReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoNacionalidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiponacionalidadSessionBean==null) {
				this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
			}

			if(!this.tiponacionalidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoNacionalidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoNacionalidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoNacionalidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNacionalidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoNacionalidad(TipoNacionalidad tiponacionalidad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoNacionalidad(TipoNacionalidad tiponacionalidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoNacionalidad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoNacionalidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoNacionalidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoNacionalidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoNacionalidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoNacionalidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoNacionalidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoNacionalidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad!=null && this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoNacionalidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoNacionalidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoNacionalidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean(); 
		this.tiponacionalidadConstantesFunciones=new TipoNacionalidadConstantesFunciones(); 
		this.tiponacionalidadBean=new TipoNacionalidad();//(this.tiponacionalidadConstantesFunciones); 		
		this.tiponacionalidadReturnGeneral=new TipoNacionalidadParameterReturnGeneral(); 
		
		this.tiponacionalidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiponacionalidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoNacionalidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoNacionalidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoNacionalidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoNacionalidad(true);
			
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
			
			this.tiponacionalidadConstantesFunciones=new TipoNacionalidadConstantesFunciones(); 
			this.tiponacionalidadBean=new TipoNacionalidad();//this.tiponacionalidadConstantesFunciones); 			
			this.tiponacionalidadReturnGeneral=new TipoNacionalidadParameterReturnGeneral(); 
		
			TipoNacionalidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Nacionalidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiponacionalidad=new TipoNacionalidad();
			this.tiponacionalidads = new ArrayList<TipoNacionalidad>();
			this.tiponacionalidadsAux = new ArrayList<TipoNacionalidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic=new TipoNacionalidadLogic();
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			//this.tiponacionalidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiponacionalidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoNacionalidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNacionalidad);	
					}
					
					if(this.jInternalFrameImportacionTipoNacionalidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNacionalidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoNacionalidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoNacionalidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNacionalidad);
				this.jInternalFrameDetalleFormTipoNacionalidad.setVisible(false);
				this.jInternalFrameDetalleFormTipoNacionalidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNacionalidad);
					this.jInternalFrameReporteDinamicoTipoNacionalidad.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoNacionalidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoNacionalidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoNacionalidad);
					this.jInternalFrameImportacionTipoNacionalidad.setVisible(false);
					this.jInternalFrameImportacionTipoNacionalidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoNacionalidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoNacionalidad);
					this.jInternalFrameOrderByTipoNacionalidad.setVisible(false);
					this.jInternalFrameOrderByTipoNacionalidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoNacionalidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoNacionalidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiponacionalidadReturnGeneral=new TipoNacionalidadParameterReturnGeneral();
			
			this.tiponacionalidadParameterGeneral=new TipoNacionalidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiponacionalidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoNacionalidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNacionalidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponacionalidadSessionBean.getEsGuardarRelacionado(),this.tiponacionalidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoNacionalidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiponacionalidadSessionBean.getEsGuardarRelacionado(),this.tiponacionalidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoNacionalidad=false;
			this.isVisibilidadCeldaDuplicarTipoNacionalidad=true;
			this.isVisibilidadCeldaCopiarTipoNacionalidad=true;
			this.isVisibilidadCeldaVerFormTipoNacionalidad=true;
			this.isVisibilidadCeldaOrdenTipoNacionalidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
			this.isVisibilidadCeldaModificarTipoNacionalidad=false;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=false;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoNacionalidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoNacionalidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoNacionalidad(false);
			
			this.setPermisosUsuarioTipoNacionalidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado() 
				|| (this.tiponacionalidadSessionBean.getEsGuardarRelacionado() && this.tiponacionalidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoNacionalidadClasesRelacionadas();
			}
			
			if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoNacionalidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoNacionalidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoNacionalidad();
			}
			
			if(!this.isPermisoBusquedaTipoNacionalidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoNacionalidad,this.isPermisoPaginacionMedioTipoNacionalidad,this.isPermisoPaginacionTodoTipoNacionalidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoNacionalidadConstantesFunciones.getTiposSeleccionarTipoNacionalidad());
				
				this.tiposColumnasSelect=TipoNacionalidadConstantesFunciones.getTiposSeleccionarTipoNacionalidad(true);
				
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
			//if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoNacionalidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoNacionalidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoNacionalidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNacionalidad() ;
			
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
				tiponacionalidadImplementable= (TipoNacionalidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNacionalidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiponacionalidadImplementableHome= (TipoNacionalidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoNacionalidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiponacionalidads= new ArrayList<TipoNacionalidad>();
			this.tiponacionalidadsEliminados= new ArrayList<TipoNacionalidad>();
						
			this.isEsNuevoTipoNacionalidad=false;
			this.esParaAccionDesdeFormularioTipoNacionalidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoNacionalidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoNacionalidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoNacionalidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoNacionalidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoNacionalidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoNacionalidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoNacionalidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoNacionalidad();
			}
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoNacionalidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoNacionalidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoNacionalidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoNacionalidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoNacionalidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoNacionalidad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoNacionalidad")) {
				iIndex=this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoNacionalidad();	
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
	
	public void cargarCombosForeignKeyTipoNacionalidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoNacionalidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoNacionalidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoNacionalidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoNacionalidad();
		
		this.cargarCombosFrameForeignKeyTipoNacionalidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoNacionalidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoNacionalidad();
		}
	}
	
	
	
	public void jButtonNuevoTipoNacionalidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
			
			if(jTableDatosTipoNacionalidad.getRowCount()>=1) {
				jTableDatosTipoNacionalidad.removeRowSelectionInterval(0, jTableDatosTipoNacionalidad.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoNacionalidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoNacionalidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoNacionalidad(true);			
			//this.tiponacionalidad=new TipoNacionalidad();
			//this.tiponacionalidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNacionalidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNacionalidad() ;
			
			if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNacionalidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiponacionalidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);				
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
			if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoNacionalidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoNacionalidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoNacionalidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoNacionalidad.getSelectedRows().length;			
			}
			
			tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoNacionalidad--;			
				//TipoNacionalidad tiponacionalidadAux= new TipoNacionalidad();			
				//tiponacionalidadAux.setId(this.iIdNuevoTipoNacionalidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoNacionalidad tiponacionalidadOrigen=new TipoNacionalidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoNacionalidad tiponacionalidadOrigen : tiponacionalidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiponacionalidadOrigen =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiponacionalidadOrigen =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoNacionalidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiponacionalidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoNacionalidad(tiponacionalidadOrigen,this.tiponacionalidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponacionalidadLogic.getTipoNacionalidads().add(this.tiponacionalidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponacionalidads.add(this.tiponacionalidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoNacionalidad(false);
				
				this.jTableDatosTipoNacionalidad.setRowSelectionInterval(this.getIndiceNuevoTipoNacionalidad(), this.getIndiceNuevoTipoNacionalidad());
				
				int iLastRow =  this.jTableDatosTipoNacionalidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNacionalidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNacionalidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNacionalidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();									
		
			TipoNacionalidad tiponacionalidadOrigen=new TipoNacionalidad();
			TipoNacionalidad tiponacionalidadDestino=new TipoNacionalidad();
				
			tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoNacionalidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiponacionalidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoNacionalidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponacionalidadOrigen =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponacionalidadOrigen =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiponacionalidadDestino =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiponacionalidadDestino =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiponacionalidadOrigen =tiponacionalidadsSeleccionados.get(0);
				tiponacionalidadDestino =tiponacionalidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoNacionalidad(tiponacionalidadOrigen,tiponacionalidadDestino,true,false);
				
				tiponacionalidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiponacionalidadDestino,tiponacionalidadLogic.getTipoNacionalidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiponacionalidadDestino,tiponacionalidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoNacionalidad(false);
				
				//this.jTableDatosTipoNacionalidad.setRowSelectionInterval(this.getIndiceNuevoTipoNacionalidad(), this.getIndiceNuevoTipoNacionalidad());
				
				int iLastRow =  this.jTableDatosTipoNacionalidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoNacionalidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoNacionalidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNacionalidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoNacionalidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoNacionalidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoNacionalidad.setVisible(!isVisible);
			this.jPanelPaginacionTipoNacionalidad.setVisible(!isVisible);
			this.jPanelAccionesTipoNacionalidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoNacionalidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoNacionalidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoNacionalidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoNacionalidad();
			
			this.abrirFrameOrderByTipoNacionalidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoNacionalidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoNacionalidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNacionalidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoNacionalidad.isMaximum()) {
					this.jInternalFrameDetalleFormTipoNacionalidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoNacionalidad.setSize(this.jInternalFrameDetalleFormTipoNacionalidad.iWidthFormulario,this.jInternalFrameDetalleFormTipoNacionalidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoNacionalidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoNacionalidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoNacionalidad.isMaximum()) {
						this.jInternalFrameDetalleFormTipoNacionalidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoNacionalidad.jContentPaneDetalleTipoNacionalidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoNacionalidad.jContentPaneDetalleTipoNacionalidad.getWidth(),TipoNacionalidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoNacionalidad.jContentPaneDetalleTipoNacionalidad.getWidth(),TipoNacionalidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoNacionalidad.jContentPaneDetalleTipoNacionalidad.getWidth(),TipoNacionalidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoNacionalidad.setVisible(true);
	        this.jInternalFrameDetalleFormTipoNacionalidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoNacionalidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoNacionalidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoNacionalidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNacionalidad,false,this);
				} else {
					this.jInternalFrameOrderByTipoNacionalidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoNacionalidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoNacionalidad);
				this.jInternalFrameOrderByTipoNacionalidad.setVisible(false);
				this.jInternalFrameOrderByTipoNacionalidad.setSelected(false);
				
				this.jInternalFrameOrderByTipoNacionalidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNacionalidad"));
				
				this.inicializarActualizarBindingTablaOrderByTipoNacionalidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoNacionalidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoNacionalidad==null) {
				
				this.jInternalFrameImportacionTipoNacionalidad=new ImportacionJInternalFrame(TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoNacionalidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoNacionalidad);
				this.jInternalFrameImportacionTipoNacionalidad.setVisible(false);
				this.jInternalFrameImportacionTipoNacionalidad.setSelected(false);


				this.jInternalFrameImportacionTipoNacionalidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNacionalidad"));
				this.jInternalFrameImportacionTipoNacionalidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNacionalidad"));
				this.jInternalFrameImportacionTipoNacionalidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNacionalidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoNacionalidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoNacionalidad==null) {
				this.jInternalFrameReporteDinamicoTipoNacionalidad=new ReporteDinamicoJInternalFrame(TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoNacionalidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoNacionalidad);
				this.jInternalFrameReporteDinamicoTipoNacionalidad.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoNacionalidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNacionalidad"));
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNacionalidad"));
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNacionalidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNacionalidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoNacionalidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoNacionalidad);
			
	       	this.jInternalFrameDetalleFormTipoNacionalidad.setVisible(false);
	        this.jInternalFrameDetalleFormTipoNacionalidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoNacionalidad.dispose();
			//this.jInternalFrameDetalleFormTipoNacionalidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoNacionalidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoNacionalidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoNacionalidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoNacionalidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoNacionalidad.setVisible(true);
	        this.jInternalFrameImportacionTipoNacionalidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoNacionalidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoNacionalidad.setVisible(true);
	        this.jInternalFrameOrderByTipoNacionalidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoNacionalidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoNacionalidad.setVisible(false);
	        this.jInternalFrameOrderByTipoNacionalidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoNacionalidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoNacionalidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoNacionalidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoNacionalidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoNacionalidad.setVisible(false);
	        this.jInternalFrameImportacionTipoNacionalidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoNacionalidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoNacionalidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoNacionalidad(true);
			//this.isEsNuevoTipoNacionalidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoNacionalidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNacionalidad(false) ;
			
			if(tiponacionalidadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNacionalidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNacionalidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoNacionalidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoNacionalidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoNacionalidad(true);
			//this.isEsNuevoTipoNacionalidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiponacionalidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoNacionalidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoNacionalidad(false) ;
			
			if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoNacionalidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNacionalidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoNacionalidad(false);
			
			//if(!this.isEsNuevoTipoNacionalidad) {								
				int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
				
			}
			
			if(this.permiteMantenimiento(this.tiponacionalidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoNacionalidad=true;
					this.inicializarActualizarBindingTablaTipoNacionalidad(false);
					this.isEsNuevoTipoNacionalidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoNacionalidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoNacionalidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNacionalidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNacionalidad(false);
				
				this.habilitarDeshabilitarControlesTipoNacionalidad(false);
			
												
				
				if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoNacionalidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoNacionalidadActionPerformed(evt,tiponacionalidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoNacionalidad(this.tiponacionalidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoNacionalidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiponacionalidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiponacionalidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				this.tiponacionalidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				this.tiponacionalidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiponacionalidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoNacionalidadModel) this.jTableDatosTipoNacionalidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoNacionalidad=true;
				this.inicializarActualizarBindingTablaTipoNacionalidad(false);
				this.isEsNuevoTipoNacionalidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoNacionalidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNacionalidad(false);
				
				this.habilitarDeshabilitarControlesTipoNacionalidad(false);
				
				
				
				if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoNacionalidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoNacionalidad.getRowCount()>=1) {
				jTableDatosTipoNacionalidad.removeRowSelectionInterval(0, jTableDatosTipoNacionalidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoNacionalidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoNacionalidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoNacionalidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoNacionalidad(false) ;
			
			this.isEsNuevoTipoNacionalidad=false;
			
			if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoNacionalidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoNacionalidad(false);
				
				//SI ES MANUAL
				if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoNacionalidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoNacionalidad--;			
			//TipoNacionalidad tiponacionalidadAux= new TipoNacionalidad();			
			//tiponacionalidadAux.setId(this.iIdNuevoTipoNacionalidad);
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoNacionalidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
			
			this.tiponacionalidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiponacionalidadLogic.getTipoNacionalidads().add(this.tiponacionalidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiponacionalidads.add(this.tiponacionalidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoNacionalidad(false);
			
			this.jTableDatosTipoNacionalidad.setRowSelectionInterval(this.getIndiceNuevoTipoNacionalidad(), this.getIndiceNuevoTipoNacionalidad());
			
			int iLastRow =  this.jTableDatosTipoNacionalidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoNacionalidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoNacionalidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoNacionalidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoNacionalidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNacionalidad(false);
			
			//SI ES MANUAL
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNacionalidad();
			}
			
			//this.abrirFrameTreeTipoNacionalidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo NacionalidadES ?", "MANTENIMIENTO DE Tipo Nacionalidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoNacionalidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoNacionalidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiponacionalidadReturnGeneral=tiponacionalidadLogic.procesarImportacionTipoNacionalidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiponacionalidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoNacionalidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoNacionalidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoNacionalidad.setFileImportacion(this.jInternalFrameImportacionTipoNacionalidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoNacionalidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoNacionalidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoNacionalidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoNacionalidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		

		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoNacionalidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoNacionalidadBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoNacionalidads("Todos",tiponacionalidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoNacionalidadConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoNacionalidadConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoNacionalidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponacionalidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoNacionalidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoNacionalidad tiponacionalidad:tiponacionalidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponacionalidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoNacionalidad tiponacionalidad:tiponacionalidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponacionalidad.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoNacionalidadConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoNacionalidad tiponacionalidad:tiponacionalidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiponacionalidad.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoNacionalidad(row);				
			//	iRow++;
			//}				
			
			//for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoNacionalidad(tiponacionalidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNacionalidad(false);
			
			//SI ES MANUAL
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoNacionalidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNacionalidad(false);
			
			//SI ES MANUAL
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNacionalidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoNacionalidad(false);
			
			//SI ES MANUAL
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoNacionalidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoNacionalidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoNacionalidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoNacionalidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoNacionalidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoNacionalidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoNacionalidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoNacionalidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoNacionalidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoNacionalidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoNacionalidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoNacionalidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoNacionalidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoNacionalidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoNacionalidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNacionalidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoNacionalidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoNacionalidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoNacionalidad();
		
		this.inicializarActualizarBindingBotonesManualTipoNacionalidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNacionalidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoNacionalidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNacionalidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNacionalidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoNacionalidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoNacionalidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoNacionalidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoNacionalidad.jCheckBoxPostAccionNuevoTipoNacionalidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoNacionalidad.jCheckBoxPostAccionSinCerrarTipoNacionalidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoNacionalidad.jCheckBoxPostAccionSinMensajeTipoNacionalidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoNacionalidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoNacionalidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoNacionalidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
				this.jInternalFrameDetalleFormTipoNacionalidad.jCheckBoxPostAccionNuevoTipoNacionalidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoNacionalidad.jCheckBoxPostAccionSinCerrarTipoNacionalidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoNacionalidad.jCheckBoxPostAccionSinMensajeTipoNacionalidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoNacionalidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoNacionalidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoNacionalidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoNacionalidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoNacionalidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoNacionalidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoNacionalidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoNacionalidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoNacionalidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoNacionalidad(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoNacionalidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoNacionalidad() throws Exception {
		try	{
			if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNacionalidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNacionalidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoNacionalidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoNacionalidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoNacionalidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoNacionalidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoNacionalidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoNacionalidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoNacionalidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoNacionalidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoNacionalidad.addItem(reporte);
			}
			
			
			if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoNacionalidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoNacionalidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoNacionalidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoNacionalidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoNacionalidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoNacionalidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoNacionalidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoNacionalidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoNacionalidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNacionalidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoNacionalidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoNacionalidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoNacionalidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoNacionalidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoNacionalidad(Boolean esInicializar) throws Exception {				
		if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoNacionalidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoNacionalidad() throws Exception {
		this.inicializarActualizarBindingTablaTipoNacionalidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoNacionalidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoNacionalidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoNacionalidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiponacionalidadLogic.getTipoNacionalidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiponacionalidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoNacionalidad.setModel(new TipoNacionalidadModel(this.tiponacionalidadLogic.getTipoNacionalidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoNacionalidad.setModel(new TipoNacionalidadModel(this.tiponacionalidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoNacionalidad!=null && this.jInternalFrameOrderByTipoNacionalidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoNacionalidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO,tiponacionalidadConstantesFunciones.resaltarSeleccionarTipoNacionalidad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoNacionalidadConstantesFunciones.SCLASSWEBTITULO,tiponacionalidadConstantesFunciones.resaltarSeleccionarTipoNacionalidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidad,TipoNacionalidadConstantesFunciones.LABEL_ID));

		if(this.tiponacionalidadConstantesFunciones.mostraridTipoNacionalidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNacionalidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiponacionalidadConstantesFunciones.resaltaridTipoNacionalidad,this.tiponacionalidadConstantesFunciones.activaridTipoNacionalidad,this,true,"idTipoNacionalidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponacionalidadConstantesFunciones.resaltaridTipoNacionalidad,this.tiponacionalidadConstantesFunciones.activaridTipoNacionalidad,this,true,"idTipoNacionalidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidad,TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiponacionalidadConstantesFunciones.mostrarid_empresaTipoNacionalidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiponacionalidadConstantesFunciones.resaltarid_empresaTipoNacionalidad,this,this.tiponacionalidadConstantesFunciones.activarid_empresaTipoNacionalidad));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiponacionalidadConstantesFunciones.resaltarid_empresaTipoNacionalidad,this,this.tiponacionalidadConstantesFunciones.activarid_empresaTipoNacionalidad,false,"id_empresaTipoNacionalidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidad,TipoNacionalidadConstantesFunciones.LABEL_CODIGO));

		if(this.tiponacionalidadConstantesFunciones.mostrarcodigoTipoNacionalidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNacionalidadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponacionalidadConstantesFunciones.resaltarcodigoTipoNacionalidad,this.tiponacionalidadConstantesFunciones.activarcodigoTipoNacionalidad,this,true,"codigoTipoNacionalidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponacionalidadConstantesFunciones.resaltarcodigoTipoNacionalidad,this.tiponacionalidadConstantesFunciones.activarcodigoTipoNacionalidad,this,true,"codigoTipoNacionalidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidad,TipoNacionalidadConstantesFunciones.LABEL_NOMBRE));

		if(this.tiponacionalidadConstantesFunciones.mostrarnombreTipoNacionalidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoNacionalidadConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiponacionalidadConstantesFunciones.resaltarnombreTipoNacionalidad,this.tiponacionalidadConstantesFunciones.activarnombreTipoNacionalidad,this,true,"nombreTipoNacionalidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiponacionalidadConstantesFunciones.resaltarnombreTipoNacionalidad,this.tiponacionalidadConstantesFunciones.activarnombreTipoNacionalidad,this,true,"nombreTipoNacionalidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoNacionalidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponacionalidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponacionalidadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNacionalidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiponacionalidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiponacionalidadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoNacionalidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiponacionalidadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiponacionalidadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoNacionalidad.addColumn(tableColumn);
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
			
			this.jTableDatosTipoNacionalidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoNacionalidad.moveColumn(this.jTableDatosTipoNacionalidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoNacionalidad.moveColumn(this.jTableDatosTipoNacionalidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoNacionalidad.moveColumn(this.jTableDatosTipoNacionalidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoNacionalidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoNacionalidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoNacionalidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoNacionalidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoNacionalidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoNacionalidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoNacionalidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiponacionalidadLogic.getTipoNacionalidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiponacionalidads.size()-1;
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
		//this.jTableDatosTipoNacionalidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoNacionalidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoNacionalidad();
			
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
				
				//this.isEsNuevoTipoNacionalidad=false;
					
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
				if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoNacionalidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNacionalidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNacionalidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiponacionalidad.getsType().equals("DUPLICADO")
				   || this.tiponacionalidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoNacionalidad=true;
				
				} else {
					this.isEsNuevoTipoNacionalidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
					if(this.tiponacionalidad.getId()>=0 && !this.tiponacionalidad.getIsNew()) {						
						this.isEsNuevoTipoNacionalidad=false;
						
					} else {
						this.isEsNuevoTipoNacionalidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoNacionalidad(esRelaciones);						
				
				this.seleccionarTipoNacionalidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiponacionalidad.getId()<0) {
					this.isEsNuevoTipoNacionalidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoNacionalidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoNacionalidad(evt,rowIndex);
				}	
				
				if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoNacionalidad: " + this.dDif); 
					}
				}								
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoNacionalidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiponacionalidad)) {
					if(this.tiponacionalidad.getId()>0) {
						this.tiponacionalidad.setIsDeleted(true);
						
						this.tiponacionalidadsEliminados.add(this.tiponacionalidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiponacionalidadLogic.getTipoNacionalidads().remove(this.tiponacionalidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiponacionalidads.remove(this.tiponacionalidad);				
					}
					
					
					((TipoNacionalidadModel) this.jTableDatosTipoNacionalidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoNacionalidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoNacionalidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoNacionalidad) {
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoNacionalidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoNacionalidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoNacionalidad(this.tiponacionalidad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiponacionalidadConstantesFunciones.cargarid_empresaTipoNacionalidad || this.tiponacionalidadConstantesFunciones.event_dependid_empresaTipoNacionalidad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiponacionalidad.getid_empresa());
									//this.inicializarActualizarBindingTipoNacionalidad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiponacionalidad.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiponacionalidad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiponacionalidad.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoNacionalidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoNacionalidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoNacionalidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNacionalidad(TipoNacionalidad tiponacionalidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoNacionalidad(tiponacionalidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoNacionalidad(TipoNacionalidad tiponacionalidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoNacionalidad(tiponacionalidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoNacionalidad(tiponacionalidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoNacionalidad(tiponacionalidad);
	}
	
	public void setVariablesObjetoActualToFormularioTipoNacionalidad(TipoNacionalidad tiponacionalidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.setText(tiponacionalidad.getId().toString());
			this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.setText(tiponacionalidad.getcodigo());
			this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.setText(tiponacionalidad.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoNacionalidad tiponacionalidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiponacionalidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoNacionalidad tiponacionalidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiponacionalidadLocal=this.tiponacionalidad;
			} else {
				tiponacionalidadLocal=this.tiponacionalidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiponacionalidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoNacionalidad(tiponacionalidadLocal,true);
					
					if(tiponacionalidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiponacionalidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiponacionalidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoNacionalidad(TipoNacionalidad tiponacionalidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNacionalidad(tiponacionalidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(tiponacionalidad);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNacionalidad(TipoNacionalidad tiponacionalidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoNacionalidad(tiponacionalidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoNacionalidad(TipoNacionalidad tiponacionalidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.getText()==null || this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.getText()=="" || this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.setText("0");
			}

			if(conColumnasBase) {tiponacionalidad.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNacionalidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelIdTipoNacionalidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponacionalidad.setcodigo(this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNacionalidadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelcodigoTipoNacionalidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiponacionalidad.setnombre(this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoNacionalidadConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoNacionalidad.jLabelnombreTipoNacionalidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoNacionalidad(TipoNacionalidad tiponacionalidadBean,TipoNacionalidad tiponacionalidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoNacionalidad(TipoNacionalidad tiponacionalidadOrigen,TipoNacionalidad tiponacionalidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponacionalidadOrigen.getId()!=null && !tiponacionalidadOrigen.getId().equals(0L))) {tiponacionalidad.setId(tiponacionalidadOrigen.getId());}}
			if(conDefault || (!conDefault && tiponacionalidadOrigen.getcodigo()!=null && !tiponacionalidadOrigen.getcodigo().equals(""))) {tiponacionalidad.setcodigo(tiponacionalidadOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiponacionalidadOrigen.getnombre()!=null && !tiponacionalidadOrigen.getnombre().equals(""))) {tiponacionalidad.setnombre(tiponacionalidadOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNacionalidad(TipoNacionalidad tiponacionalidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.setText(tiponacionalidad.getId().toString());
			this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.setText(tiponacionalidad.getcodigo());
			this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.setText(tiponacionalidad.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoNacionalidad(TipoNacionalidadBean tiponacionalidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.setText(tiponacionalidadBean.getId().toString());
			this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.setText(tiponacionalidadBean.getcodigo());
			this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.setText(tiponacionalidadBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoNacionalidad(TipoNacionalidadParameterReturnGeneral tiponacionalidadReturnGeneral,TipoNacionalidadBean tiponacionalidadBean,Boolean conDefault) throws Exception { 
		try {
			TipoNacionalidad tiponacionalidadLocal=new TipoNacionalidad();
			
			tiponacionalidadLocal=tiponacionalidadReturnGeneral.getTipoNacionalidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiponacionalidadLocal.getId()!=null && !tiponacionalidadLocal.getId().equals(0L))) {tiponacionalidadBean.setId(tiponacionalidadLocal.getId());}}
			if(conDefault || (!conDefault && tiponacionalidadLocal.getcodigo()!=null && !tiponacionalidadLocal.getcodigo().equals(""))) {tiponacionalidadBean.setcodigo(tiponacionalidadLocal.getcodigo());}
			if(conDefault || (!conDefault && tiponacionalidadLocal.getnombre()!=null && !tiponacionalidadLocal.getnombre().equals(""))) {tiponacionalidadBean.setnombre(tiponacionalidadLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoNacionalidadGenerico(Long idTipoNacionalidadSeleccionado,JComboBox jComboBoxTipoNacionalidad,List<TipoNacionalidad> tiponacionalidadsLocal)throws Exception {
		try {
			TipoNacionalidad  tiponacionalidadTemp=null;

			for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadsLocal) {
				if(tiponacionalidadAux.getId()!=null && tiponacionalidadAux.getId().equals(idTipoNacionalidadSeleccionado)) {
					tiponacionalidadTemp=tiponacionalidadAux;
					break;
				}
			}

			jComboBoxTipoNacionalidad.setSelectedItem(tiponacionalidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoNacionalidadGenerico(JComboBox jComboBoxTipoNacionalidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNacionalidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoNacionalidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoNacionalidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoNacionalidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoNacionalidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoNacionalidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponacionalidad=(TipoNacionalidad) tiponacionalidadLogic.getTipoNacionalidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponacionalidad =(TipoNacionalidad) tiponacionalidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiponacionalidad.getIsNew() && !tiponacionalidad.getIsChanged() && !tiponacionalidad.getIsDeleted()) {
				sDescripcion=tiponacionalidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiponacionalidad.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoNacionalidad tiponacionalidadRow=new TipoNacionalidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponacionalidadRow=(TipoNacionalidad) tiponacionalidadLogic.getTipoNacionalidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiponacionalidadRow=(TipoNacionalidad) tiponacionalidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoNacionalidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad));			
			this.jButtonDuplicarTipoNacionalidad.setVisible((this.isVisibilidadCeldaDuplicarTipoNacionalidad && this.isPermisoDuplicarTipoNacionalidad));			
			this.jButtonCopiarTipoNacionalidad.setVisible((this.isVisibilidadCeldaCopiarTipoNacionalidad && this.isPermisoCopiarTipoNacionalidad));
			this.jButtonVerFormTipoNacionalidad.setVisible((this.isVisibilidadCeldaVerFormTipoNacionalidad && this.isPermisoVerFormTipoNacionalidad));
			
			this.jButtonAbrirOrderByTipoNacionalidad.setVisible((this.isVisibilidadCeldaOrdenTipoNacionalidad && this.isPermisoOrdenTipoNacionalidad));			
			
			this.jButtonNuevoRelacionesTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad));			
			this.jButtonNuevoGuardarCambiosTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarTipoNacionalidad.setVisible((this.isVisibilidadCeldaModificarTipoNacionalidad && this.isPermisoActualizarTipoNacionalidad));	
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarTipoNacionalidad.setVisible((this.isVisibilidadCeldaActualizarTipoNacionalidad && this.isPermisoActualizarTipoNacionalidad));	
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarTipoNacionalidad.setVisible((this.isVisibilidadCeldaEliminarTipoNacionalidad && this.isPermisoEliminarTipoNacionalidad));
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarTipoNacionalidad.setVisible(this.isVisibilidadCeldaCancelarTipoNacionalidad);							
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.setVisible((this.isVisibilidadCeldaGuardarTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoNacionalidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad));						
			this.jButtonDuplicarToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaDuplicarTipoNacionalidad && this.isPermisoDuplicarTipoNacionalidad));						
			this.jButtonCopiarToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaCopiarTipoNacionalidad && this.isPermisoCopiarTipoNacionalidad));			
			this.jButtonVerFormToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaVerFormTipoNacionalidad && this.isPermisoVerFormTipoNacionalidad));			
			this.jButtonAbrirOrderByToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaOrdenTipoNacionalidad && this.isPermisoOrdenTipoNacionalidad));
			this.jButtonNuevoRelacionesToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad));			
			this.jButtonNuevoGuardarCambiosToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));			
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaModificarTipoNacionalidad && this.isPermisoActualizarTipoNacionalidad));	
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaActualizarTipoNacionalidad  && this.isPermisoActualizarTipoNacionalidad));	
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaEliminarTipoNacionalidad && this.isPermisoEliminarTipoNacionalidad));
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarToolBarTipoNacionalidad.setVisible(this.isVisibilidadCeldaCancelarTipoNacionalidad);				
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaGuardarTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoNacionalidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad));			
			this.jMenuItemDuplicarTipoNacionalidad.setVisible((this.isVisibilidadCeldaDuplicarTipoNacionalidad && this.isPermisoDuplicarTipoNacionalidad));			
			this.jMenuItemCopiarTipoNacionalidad.setVisible((this.isVisibilidadCeldaCopiarTipoNacionalidad && this.isPermisoCopiarTipoNacionalidad));			
			this.jMenuItemVerFormTipoNacionalidad.setVisible((this.isVisibilidadCeldaVerFormTipoNacionalidad && this.isPermisoVerFormTipoNacionalidad));			
			this.jMenuItemAbrirOrderByTipoNacionalidad.setVisible((this.isVisibilidadCeldaOrdenTipoNacionalidad && this.isPermisoOrdenTipoNacionalidad));			
			//this.jMenuItemMostrarOcultarTipoNacionalidad.setVisible((this.isVisibilidadCeldaOrdenTipoNacionalidad && this.isPermisoOrdenTipoNacionalidad));
			this.jMenuItemDetalleAbrirOrderByTipoNacionalidad.setVisible((this.isVisibilidadCeldaOrdenTipoNacionalidad && this.isPermisoOrdenTipoNacionalidad));			
			//this.jMenuItemDetalleMostrarOcultarTipoNacionalidad.setVisible((this.isVisibilidadCeldaOrdenTipoNacionalidad && this.isPermisoOrdenTipoNacionalidad));			
			this.jMenuItemNuevoRelacionesTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad));			
			this.jMenuItemNuevoGuardarCambiosTipoNacionalidad.setVisible((this.isVisibilidadCeldaNuevoTipoNacionalidad && this.isPermisoNuevoTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));									
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemModificarTipoNacionalidad.setVisible((this.isVisibilidadCeldaModificarTipoNacionalidad && this.isPermisoActualizarTipoNacionalidad));	
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemActualizarTipoNacionalidad.setVisible((this.isVisibilidadCeldaActualizarTipoNacionalidad && this.isPermisoActualizarTipoNacionalidad));	
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemEliminarTipoNacionalidad.setVisible((this.isVisibilidadCeldaEliminarTipoNacionalidad && this.isPermisoEliminarTipoNacionalidad));
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemCancelarTipoNacionalidad.setVisible(this.isVisibilidadCeldaCancelarTipoNacionalidad);				
			}
			
			this.jMenuItemGuardarCambiosTipoNacionalidad.setVisible((this.isVisibilidadCeldaGuardarTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));						
			this.jMenuItemGuardarCambiosTablaTipoNacionalidad.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=this.jButtonNuevoTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaDuplicarTipoNacionalidad=this.jButtonDuplicarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaCopiarTipoNacionalidad=this.jButtonCopiarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaVerFormTipoNacionalidad=this.jButtonVerFormTipoNacionalidad.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoNacionalidad=this.jButtonAbrirOrderByTipoNacionalidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=this.jButtonNuevoRelacionesTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaModificarTipoNacionalidad=this.jButtonModificarTipoNacionalidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.isVisibilidadCeldaActualizarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaGuardarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=this.jButtonGuardarCambiosTablaTipoNacionalidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoNacionalidad=this.jButtonNuevoToolBarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=this.jButtonNuevoRelacionesToolBarTipoNacionalidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.isVisibilidadCeldaModificarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarToolBarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaActualizarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarToolBarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarToolBarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarToolBarTipoNacionalidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNacionalidad=this.jButtonGuardarCambiosToolBarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=this.jButtonGuardarCambiosTablaToolBarTipoNacionalidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoNacionalidad=this.jMenuItemNuevoTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=this.jMenuItemNuevoRelacionesTipoNacionalidad.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.isVisibilidadCeldaModificarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemModificarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaActualizarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemActualizarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaEliminarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemEliminarTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaCancelarTipoNacionalidad=this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemCancelarTipoNacionalidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoNacionalidad=this.jMenuItemGuardarCambiosTipoNacionalidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=this.jMenuItemGuardarCambiosTablaTipoNacionalidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoNacionalidad(Boolean esInicializar) {
		if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
				//if(this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNacionalidad();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoNacionalidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoNacionalidad() {
		this.jButtonNuevoTipoNacionalidad.setVisible(this.isPermisoNuevoTipoNacionalidad);			
		this.jButtonDuplicarTipoNacionalidad.setVisible(this.isPermisoDuplicarTipoNacionalidad);			
		this.jButtonCopiarTipoNacionalidad.setVisible(this.isPermisoCopiarTipoNacionalidad);			
		this.jButtonVerFormTipoNacionalidad.setVisible(this.isPermisoVerFormTipoNacionalidad);			
		
		this.jButtonAbrirOrderByTipoNacionalidad.setVisible(this.isPermisoOrdenTipoNacionalidad);					
		
		this.jButtonNuevoRelacionesTipoNacionalidad.setVisible(this.isPermisoNuevoTipoNacionalidad);			
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarTipoNacionalidad.setVisible(this.isPermisoActualizarTipoNacionalidad);	
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarTipoNacionalidad.setVisible(this.isPermisoActualizarTipoNacionalidad);	
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarTipoNacionalidad.setVisible(this.isPermisoEliminarTipoNacionalidad);
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarTipoNacionalidad.setVisible(this.isVisibilidadCeldaCancelarTipoNacionalidad);						
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.setVisible(this.isPermisoGuardarCambiosTipoNacionalidad);							
		}
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad.setVisible(this.isPermisoActualizarTipoNacionalidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNacionalidad() {
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarTipoNacionalidad.setVisible(this.isPermisoActualizarTipoNacionalidad);	
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarTipoNacionalidad.setVisible(this.isPermisoActualizarTipoNacionalidad);	
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarTipoNacionalidad.setVisible(this.isPermisoEliminarTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarTipoNacionalidad.setVisible(this.isVisibilidadCeldaCancelarTipoNacionalidad);							
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.setVisible((this.isVisibilidadCeldaGuardarTipoNacionalidad && this.isPermisoGuardarCambiosTipoNacionalidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoNacionalidad() {
		if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoNacionalidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoNacionalidad() {
	}
	
	public void jTableDatosTipoNacionalidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoNacionalidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoNacionalidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.gettiponacionalidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponacionalidad==null) {
						this.tiponacionalidad = new TipoNacionalidad();
					}

					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
				}

				if(this.tiponacionalidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiponacionalidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNacionalidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoNacionalidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoNacionalidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoNacionalidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoNacionalidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.gettiponacionalidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiponacionalidadLogic.getConnexion());

				if(this.tiponacionalidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiponacionalidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoNacionalidad=(TitledBorder)this.jScrollPanelDatosTipoNacionalidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoNacionalidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoNacionalidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.gettiponacionalidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponacionalidad==null) {
						this.tiponacionalidad = new TipoNacionalidad();
					}

					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
				}

				if(this.tiponacionalidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiponacionalidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNacionalidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoNacionalidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.gettiponacionalidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponacionalidad==null) {
						this.tiponacionalidad = new TipoNacionalidad();
					}

					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
				}

				if(this.tiponacionalidad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiponacionalidad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNacionalidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoNacionalidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.gettiponacionalidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiponacionalidad==null) {
						this.tiponacionalidad = new TipoNacionalidad();
					}

					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);
				}

				if(this.tiponacionalidad.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiponacionalidad.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoNacionalidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoNacionalidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoNacionalidad(false,false);

			this.getTipoNacionalidadsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoNacionalidad(false);

			//if(TipoNacionalidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoNacionalidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiponacionalidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoNacionalidad() {
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
			this.jInternalFrameDetalleFormTipoNacionalidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoNacionalidad.dispose();
			this.jInternalFrameDetalleFormTipoNacionalidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
			this.jInternalFrameReporteDinamicoTipoNacionalidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoNacionalidad.dispose();
			this.jInternalFrameReporteDinamicoTipoNacionalidad=null;
		}
		
		if(this.jInternalFrameImportacionTipoNacionalidad!=null) {
			this.jInternalFrameImportacionTipoNacionalidad.setVisible(false);	    			
			this.jInternalFrameImportacionTipoNacionalidad.dispose();
			this.jInternalFrameImportacionTipoNacionalidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoNacionalidad();
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoNacionalidad")) {
				jButtonDuplicarTipoNacionalidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoNacionalidad")) {
				jButtonCopiarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoNacionalidad")) {
				jButtonVerFormTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoNacionalidad")) {
				jButtonDuplicarTipoNacionalidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoNacionalidad")) {
				jButtonDuplicarTipoNacionalidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoNacionalidad")) {
				jButtonModificarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoNacionalidad")) {
				jButtonModificarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoNacionalidad")) {
				jButtonModificarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoNacionalidad")) {
				jButtonActualizarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoNacionalidad")) {
				jButtonActualizarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoNacionalidad")) {
				jButtonActualizarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoNacionalidad")) {
				jButtonEliminarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoNacionalidad")) {
				jButtonEliminarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoNacionalidad")) {
				jButtonEliminarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoNacionalidad")) {
				jButtonCancelarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoNacionalidad")) {
				jButtonCancelarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoNacionalidad")) {
				jButtonCancelarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoNacionalidad")) {
				jButtonCerrarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoNacionalidad")) {
				jButtonCerrarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoNacionalidad")) {
				jButtonCerrarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoNacionalidad")) {
				jButtonMostrarOcultarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoNacionalidad")) {
				jButtonCancelarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoNacionalidad")) {
				jButtonCopiarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoNacionalidad")) {
				jButtonVerFormTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoNacionalidad")) {
				jButtonCopiarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoNacionalidad")) {
				jButtonVerFormTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoNacionalidad")) {
				jButtonRecargarInformacionTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoNacionalidad")) {
				jButtonRecargarInformacionTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoNacionalidad")) {
				jButtonRecargarInformacionTipoNacionalidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoNacionalidad")) {
				jButtonAnterioresTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoNacionalidad")) {
				jButtonAnterioresTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoNacionalidad")) {
				jButtonAnterioresTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoNacionalidad")) {
				jButtonSiguientesTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoNacionalidad")) {
				jButtonSiguientesTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoNacionalidad")) {
				jButtonSiguientesTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoNacionalidad") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoNacionalidad")) {
				jButtonAbrirOrderByTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoNacionalidad") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoNacionalidad")) {
				jButtonMostrarOcultarTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNacionalidad")) {
				jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoNacionalidad")) {
				jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoNacionalidad")) {
				jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoNacionalidad")) {
				jButtonCerrarReporteDinamicoTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoNacionalidad")) {
				jButtonGenerarReporteDinamicoTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoNacionalidad")) {
				
				jButtonGenerarExcelReporteDinamicoTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoNacionalidad")) {
				jButtonCerrarImportacionTipoNacionalidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoNacionalidad")) {
				
				jButtonGenerarImportacionTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoNacionalidad")) {
				
				jButtonAbrirImportacionTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoNacionalidad")) {
				jComboBoxTiposAccionesTipoNacionalidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoNacionalidad")) {
				jComboBoxTiposRelacionesTipoNacionalidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoNacionalidad")) {
				jComboBoxTiposAccionesTipoNacionalidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoNacionalidad")) {
				
				jComboBoxTiposSeleccionarTipoNacionalidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoNacionalidad")) {
				jTextFieldValorCampoGeneralTipoNacionalidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoNacionalidad")) {
				jButtonAbrirOrderByTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoNacionalidad")) {
				jButtonAbrirOrderByTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoNacionalidad")) {
				jButtonCerrarOrderByTipoNacionalidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNacionalidadBusqueda")) {
				this.jButtonidTipoNacionalidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoNacionalidadUpdate")) {
				this.jButtonid_empresaTipoNacionalidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoNacionalidadBusqueda")) {
				this.jButtonid_empresaTipoNacionalidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNacionalidadBusqueda")) {
				this.jButtoncodigoTipoNacionalidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNacionalidadBusqueda")) {
				this.jButtonnombreTipoNacionalidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoNacionalidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNacionalidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoNacionalidad tiponacionalidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiponacionalidadLocal=this.tiponacionalidad;
			} else {
				tiponacionalidadLocal=this.tiponacionalidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
							
				
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
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
			
			


			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNacionalidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
								
						
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
								
				
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
							
				
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNacionalidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
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
			
			


			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
								
				
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNacionalidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoNacionalidad")) {
					jCheckBoxSeleccionarTodosTipoNacionalidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoNacionalidad")) {
					jCheckBoxSeleccionadosTipoNacionalidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoNacionalidad")) {
					
				}
				
				


				
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
												
				
				


				
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNacionalidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNacionalidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
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
			
			


			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoNacionalidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiponacionalidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiponacionalidad);
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
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
				
				


				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoNacionalidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoNacionalidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoNacionalidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiponacionalidadAnterior =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoNacionalidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoNacionalidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoNacionalidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiponacionalidad =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiponacionalidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoNacionalidad")) {
				
				}
				
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoNacionalidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoNacionalidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoNacionalidad")) {
			
			}
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoNacionalidad();
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
			if(sTipo.equals("NuevoTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoNacionalidad")) {
				jButtonDuplicarTipoNacionalidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoNacionalidad")) {
				jButtonCopiarTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoNacionalidad")) {
				jButtonVerFormTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoNacionalidad")) {
				jButtonNuevoTipoNacionalidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoNacionalidad")) {
				jButtonModificarTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoNacionalidad")) {
				jButtonActualizarTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoNacionalidad")) {
				jButtonEliminarTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoNacionalidad")) {
				jButtonCancelarTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoNacionalidad")) {
				jButtonCerrarTipoNacionalidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoNacionalidad")) {
				jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoNacionalidad")) {
				jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoNacionalidad")) {
				jButtonAbrirOrderByTipoNacionalidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoNacionalidad")) {
				jButtonRecargarInformacionTipoNacionalidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoNacionalidad")) {
				jButtonAnterioresTipoNacionalidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoNacionalidad")) {
				jButtonSiguientesTipoNacionalidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoNacionalidadBusqueda")) {
				this.jButtonidTipoNacionalidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoNacionalidadUpdate")) {
				this.jButtonid_empresaTipoNacionalidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoNacionalidadBusqueda")) {
				this.jButtonid_empresaTipoNacionalidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoNacionalidadBusqueda")) {
				this.jButtoncodigoTipoNacionalidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoNacionalidadBusqueda")) {
				this.jButtonnombreTipoNacionalidadBusquedaActionPerformed(evt);
			}
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoNacionalidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoNacionalidad")) {
				closingInternalFrameTipoNacionalidad();
				
			} else if(sTipo.equals("jButtonCancelarTipoNacionalidad")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoNacionalidad = (JInternalFrameBase)evt.getSource();
	            	
	            TipoNacionalidadBeanSwingJInternalFrame jInternalFrameParent=(TipoNacionalidadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNacionalidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoNacionalidadActionPerformed(null);
			}
			
			TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiponacionalidad,new Object(),this.tiponacionalidadParameterGeneral,this.tiponacionalidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoNacionalidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoNacionalidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoNacionalidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiponacionalidad)) {
			if(!esControlTabla) {
				if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);			
				}
				
				if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoNacionalidad(this.tiponacionalidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponacionalidadReturnGeneral=tiponacionalidadLogic.procesarEventosTipoNacionalidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponacionalidadLogic.getTipoNacionalidads(),this.tiponacionalidad,this.tiponacionalidadParameterGeneral,this.isEsNuevoTipoNacionalidad,classes);//this.tiponacionalidadLogic.getTipoNacionalidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoNacionalidad(this.tiponacionalidadReturnGeneral,this.tiponacionalidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoNacionalidad(classes,this.tiponacionalidadReturnGeneral,this.tiponacionalidadBean,false);
					}
						
					if(this.tiponacionalidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoNacionalidad(this.tiponacionalidadReturnGeneral.getTipoNacionalidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoNacionalidad(this.tiponacionalidadReturnGeneral.getTipoNacionalidad());	
					}
						
					if(this.tiponacionalidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoNacionalidad(this.tiponacionalidadReturnGeneral.getTipoNacionalidad(),classes);//this.tiponacionalidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoNacionalidad(this.tiponacionalidad,classes);//this.tiponacionalidadBean);									
				}
			
				if(TipoNacionalidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoNacionalidad(this.tiponacionalidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoNacionalidad(this.tiponacionalidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiponacionalidadAnterior!=null) {
						this.tiponacionalidad=this.tiponacionalidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiponacionalidadReturnGeneral=tiponacionalidadLogic.procesarEventosTipoNacionalidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponacionalidadLogic.getTipoNacionalidads(),this.tiponacionalidad,this.tiponacionalidadParameterGeneral,this.isEsNuevoTipoNacionalidad,classes);//this.tiponacionalidadLogic.getTipoNacionalidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiponacionalidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiponacionalidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiponacionalidadReturnGeneral.getTipoNacionalidad(),tiponacionalidadLogic.getTipoNacionalidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiponacionalidadReturnGeneral.getTipoNacionalidad(),this.tiponacionalidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoNacionalidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoNacionalidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoNacionalidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoNacionalidad() throws Exception {
		
		TipoNacionalidadModel tiponacionalidadModel=(TipoNacionalidadModel)this.jTableDatosTipoNacionalidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiponacionalidadModel.tiponacionalidads=this.tiponacionalidadLogic.getTipoNacionalidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiponacionalidadModel.tiponacionalidads=this.tiponacionalidads;
		}
		
		
		((TipoNacionalidadModel) this.jTableDatosTipoNacionalidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoNacionalidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiponacionalidadAnterior(),this.tiponacionalidadLogic.getTipoNacionalidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiponacionalidadAnterior(),this.tiponacionalidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoNacionalidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoNacionalidad(TipoNacionalidad tiponacionalidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
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
										
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponacionalidad,new Object(),generalEntityParameterGeneral,this.tiponacionalidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiponacionalidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoNacionalidadConstantesFunciones.getClassesRelationshipsOfTipoNacionalidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoNacionalidadConstantesFunciones.getClassesRelationshipsFromStringsOfTipoNacionalidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoNacionalidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoNacionalidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiponacionalidad,new Object(),generalEntityParameterGeneral,this.tiponacionalidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoNacionalidad(TipoNacionalidadBean tiponacionalidadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoNacionalidad(ArrayList<Classe> classes,TipoNacionalidadReturnGeneral tiponacionalidadReturnGeneral,TipoNacionalidadBean tiponacionalidadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoNacionalidad(TipoNacionalidad tiponacionalidad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiponacionalidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoNacionalidad = new TipoNacionalidadDetalleFormJInternalFrame(jDesktopPane,this.tiponacionalidadSessionBean.getConGuardarRelaciones(),this.tiponacionalidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.setVisible(false);
		this.jInternalFrameDetalleFormTipoNacionalidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoNacionalidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoNacionalidad.tiponacionalidadLogic=this.tiponacionalidadLogic;
		
		this.cargarCombosFrameForeignKeyTipoNacionalidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoNacionalidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoNacionalidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoNacionalidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoNacionalidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoNacionalidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNacionalidad"));
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"ModificarTipoNacionalidad"));

		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarToolBarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNacionalidad"));
					
		this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemModificarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNacionalidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"ActualizarTipoNacionalidad"));
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarToolBarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNacionalidad"));
						
		this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemActualizarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNacionalidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"EliminarTipoNacionalidad"));
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNacionalidad"));
								
		this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemEliminarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNacionalidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CancelarTipoNacionalidad"));
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNacionalidad"));
					
		this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemCancelarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNacionalidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemDetalleCerrarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNacionalidad"));		
		
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNacionalidad"));
		
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNacionalidad"));
		
		
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNacionalidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonidTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNacionalidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonid_empresaTipoNacionalidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoNacionalidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonid_empresaTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoNacionalidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtoncodigoTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNacionalidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonnombreTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNacionalidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNacionalidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoNacionalidad"));
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoNacionalidad"));
		}
		
		this.jTableDatosTipoNacionalidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoNacionalidad"));
		
		this.jTableDatosTipoNacionalidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoNacionalidad"));
		
		this.jButtonNuevoTipoNacionalidad.addActionListener(new ButtonActionListener(this,"NuevoTipoNacionalidad"));
		
		this.jButtonDuplicarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"DuplicarTipoNacionalidad"));
		
		this.jButtonCopiarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"CopiarTipoNacionalidad"));
		
		this.jButtonVerFormTipoNacionalidad.addActionListener(new ButtonActionListener(this,"VerFormTipoNacionalidad"));
		
		
		this.jButtonNuevoToolBarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoNacionalidad"));
			
		this.jButtonDuplicarToolBarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoNacionalidad"));
			
		this.jMenuItemNuevoTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoNacionalidad"));
			
		this.jMenuItemDuplicarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoNacionalidad"));		
		
		
		this.jButtonNuevoRelacionesTipoNacionalidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoNacionalidad"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoNacionalidad"));
			
		this.jMenuItemNuevoRelacionesTipoNacionalidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoNacionalidad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"ModificarTipoNacionalidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonModificarToolBarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoNacionalidad"));
			
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemModificarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoNacionalidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"ActualizarTipoNacionalidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonActualizarToolBarTipoNacionalidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoNacionalidad"));
				
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemActualizarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoNacionalidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"EliminarTipoNacionalidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonEliminarToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoNacionalidad"));
						
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemEliminarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoNacionalidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CancelarTipoNacionalidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonCancelarToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoNacionalidad"));
			
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemCancelarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoNacionalidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoNacionalidad"));		
		
		
		this.jButtonCerrarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CerrarTipoNacionalidad"));
		
		
		this.jButtonCerrarToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoNacionalidad"));
			
		this.jMenuItemCerrarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoNacionalidad"));
			
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jMenuItemDetalleCerrarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoNacionalidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoNacionalidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoNacionalidad"));
		}
		
		this.jButtonCopiarToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoNacionalidad"));
			
		this.jButtonVerFormToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoNacionalidad"));
		
		this.jMenuItemGuardarCambiosTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoNacionalidad"));
			
		this.jMenuItemCopiarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoNacionalidad"));		
		
		this.jMenuItemVerFormTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoNacionalidad"));		
		
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNacionalidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoNacionalidad"));
			
		this.jMenuItemGuardarCambiosTablaTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoNacionalidad"));		
		
		
		
		this.jButtonRecargarInformacionTipoNacionalidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoNacionalidad"));
					
		this.jButtonRecargarInformacionToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoNacionalidad"));
		
		this.jMenuItemRecargarInformacionTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoNacionalidad"));		
		
		
		
		this.jButtonAnterioresTipoNacionalidad.addActionListener (new ButtonActionListener(this,"AnterioresTipoNacionalidad"));
		
		
		this.jButtonAnterioresToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoNacionalidad"));
		
		this.jMenuItemAnterioresTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoNacionalidad"));		
		
		
		this.jButtonSiguientesTipoNacionalidad.addActionListener (new ButtonActionListener(this,"SiguientesTipoNacionalidad"));
		
		
		this.jButtonSiguientesToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoNacionalidad"));
			
		this.jMenuItemSiguientesTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoNacionalidad"));
			
		this.jMenuItemAbrirOrderByTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoNacionalidad"));
			
		this.jMenuItemMostrarOcultarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoNacionalidad"));
			
		this.jMenuItemDetalleAbrirOrderByTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoNacionalidad"));
			
		this.jMenuItemDetalleMostarOcultarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoNacionalidad"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoNacionalidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoNacionalidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoNacionalidad"));
			
		this.jMenuItemNuevoGuardarCambiosTipoNacionalidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoNacionalidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoNacionalidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoNacionalidad"));

		this.jCheckBoxSeleccionadosTipoNacionalidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoNacionalidad"));
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoNacionalidad"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoNacionalidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoNacionalidad"));
			
		this.jComboBoxTiposAccionesTipoNacionalidad.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoNacionalidad"));
					
		this.jComboBoxTiposSeleccionarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoNacionalidad"));
			
		this.jTextFieldValorCampoGeneralTipoNacionalidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoNacionalidad"));		
		
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonidTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNacionalidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonid_empresaTipoNacionalidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoNacionalidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonid_empresaTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoNacionalidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtoncodigoTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNacionalidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonnombreTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNacionalidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoNacionalidad!=null) {
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNacionalidad"));
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNacionalidad"));
				this.jInternalFrameReporteDinamicoTipoNacionalidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNacionalidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoNacionalidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoNacionalidad"));				
			//this.jButtonGenerarReporteDinamicoTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoNacionalidad"));
			//this.jButtonGenerarExcelReporteDinamicoTipoNacionalidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoNacionalidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoNacionalidad!=null) {
				this.jInternalFrameImportacionTipoNacionalidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoNacionalidad"));
				this.jInternalFrameImportacionTipoNacionalidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoNacionalidad"));
				this.jInternalFrameImportacionTipoNacionalidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoNacionalidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoNacionalidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoNacionalidad"));
			
			this.jButtonAbrirOrderByToolBarTipoNacionalidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoNacionalidad"));			
			
			if(this.jInternalFrameOrderByTipoNacionalidad!=null) {
				this.jInternalFrameOrderByTipoNacionalidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoNacionalidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoNacionalidad.jTabbedPaneRelacionesTipoNacionalidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoNacionalidad"));
		
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
            		closingInternalFrameTipoNacionalidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoNacionalidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoNacionalidad = (JInternalFrameBase)event.getSource();
	            	
	            TipoNacionalidadBeanSwingJInternalFrame jInternalFrameParent=(TipoNacionalidadBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoNacionalidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoNacionalidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoNacionalidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoNacionalidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoNacionalidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoNacionalidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNacionalidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNacionalidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNacionalidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoNacionalidad";
		inputMap = this.jButtonNuevoTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNacionalidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNacionalidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNacionalidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoNacionalidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoNacionalidad";
		inputMap = this.jButtonNuevoRelacionesTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoNacionalidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoNacionalidad";
		inputMap = this.jButtonModificarTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoNacionalidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoNacionalidad";
		inputMap = this.jButtonActualizarTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoNacionalidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoNacionalidad";
		inputMap = this.jButtonEliminarTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoNacionalidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoNacionalidad";
		inputMap = this.jButtonCancelarTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoNacionalidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoNacionalidad";
		inputMap = this.jButtonCerrarTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoNacionalidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoNacionalidad";
		inputMap = this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonGuardarCambiosTipoNacionalidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoNacionalidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoNacionalidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoNacionalidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoNacionalidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoNacionalidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoNacionalidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoNacionalidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoNacionalidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoNacionalidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonidTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"idTipoNacionalidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonid_empresaTipoNacionalidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoNacionalidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonid_empresaTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoNacionalidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtoncodigoTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoNacionalidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoNacionalidad.jButtonnombreTipoNacionalidadBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoNacionalidadBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoNacionalidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoNacionalidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoNacionalidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoNacionalidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoNacionalidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
					tiponacionalidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNacionalidad tiponacionalidadAux:tiponacionalidads) {
					tiponacionalidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoNacionalidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNacionalidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
						tiponacionalidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNacionalidad tiponacionalidadAux:tiponacionalidads) {
						tiponacionalidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNacionalidad tiponacionalidadAux:tiponacionalidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNacionalidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNacionalidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNacionalidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoNacionalidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoNacionalidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoNacionalidad.getSelectedRows();
			
			TipoNacionalidad tiponacionalidadLocal=new TipoNacionalidad();
			
			//this.seleccionarTodosTipoNacionalidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiponacionalidadLocal =(TipoNacionalidad) this.tiponacionalidadLogic.getTipoNacionalidads().toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiponacionalidadLocal =(TipoNacionalidad) this.tiponacionalidads.toArray()[this.jTableDatosTipoNacionalidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiponacionalidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
						tiponacionalidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoNacionalidad tiponacionalidadAux:tiponacionalidads) {
						tiponacionalidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoNacionalidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoNacionalidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoNacionalidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoNacionalidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoNacionalidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoNacionalidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoNacionalidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoNacionalidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoNacionalidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidadLogic.getTipoNacionalidads()) {
				
						if(sTipoSeleccionar.equals(TipoNacionalidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponacionalidadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponacionalidadAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNacionalidad tiponacionalidadAux:tiponacionalidads) {
					
						if(sTipoSeleccionar.equals(TipoNacionalidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiponacionalidadAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiponacionalidadAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoNacionalidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoNacionalidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoNacionalidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoNacionalidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoNacionalidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoNacionalidad) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoNacionalidad(conSplash);
				
					this.generarReporteTipoNacionalidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoNacionalidadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNacionalidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoNacionalidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNacionalidad();
				
				this.exportarTipoNacionalidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoNacionalidads();
				//this.importarTipoNacionalidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoNacionalidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoNacionalidadsSeleccionados();
				//this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Nacionalidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoNacionalidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoNacionalidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoNacionalidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoNacionalidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoNacionalidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoNacionalidad(conSplash);
					
						//this.actualizarParametrosGeneralTipoNacionalidad();
						
						this.generarReporteProcesoAccionTipoNacionalidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoNacionalidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo NacionalidadES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Nacionalidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoNacionalidad();
				
						this.actualizarParametrosGeneralTipoNacionalidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiponacionalidadReturnGeneral=tiponacionalidadLogic.procesarAccionTipoNacionalidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiponacionalidadLogic.getTipoNacionalidads(),this.tiponacionalidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoNacionalidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoNacionalidad();
					
					TipoNacionalidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoNacionalidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoNacionalidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxTiposAccionesFormularioTipoNacionalidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoNacionalidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoNacionalidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoNacionalidad();
			
			if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
			TipoNacionalidad tiponacionalidad=new TipoNacionalidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoNacionalidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoNacionalidad.getSelectedItem();
			
			
			
			
			tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiponacionalidadsSeleccionados.size()==1) {
				for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadsSeleccionados) {
					tiponacionalidad=tiponacionalidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoNacionalidad();
			
      		//this.finishProcessTipoNacionalidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoNacionalidadReturnGeneral() throws Exception {
		if(this.tiponacionalidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiponacionalidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiponacionalidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiponacionalidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiponacionalidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiponacionalidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoNacionalidad(false);
		}
		
		if(this.tiponacionalidadReturnGeneral.getConRetornoLista() || this.tiponacionalidadReturnGeneral.getConRetornoObjeto()) {
			if(this.tiponacionalidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponacionalidadLogic.setTipoNacionalidads(this.tiponacionalidadReturnGeneral.getTipoNacionalidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiponacionalidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiponacionalidadLogic.setTipoNacionalidad(this.tiponacionalidadReturnGeneral.getTipoNacionalidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoNacionalidad(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoNacionalidad() throws Exception {
		
		
	}
	
	public ArrayList<TipoNacionalidad> getTipoNacionalidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoNacionalidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadLogic.getTipoNacionalidads()) {
					if(tiponacionalidadAux.getIsSelected()) {
						tiponacionalidadsSeleccionados.add(tiponacionalidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoNacionalidad tiponacionalidadAux:this.tiponacionalidads) {
					if(tiponacionalidadAux.getIsSelected()) {
						tiponacionalidadsSeleccionados.add(tiponacionalidadAux);				
					}
				}
			}
			
			if(tiponacionalidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiponacionalidadsSeleccionados.addAll(this.tiponacionalidadLogic.getTipoNacionalidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiponacionalidadsSeleccionados.addAll(this.tiponacionalidads);				
					}
				}
			}
		} else {
			tiponacionalidadsSeleccionados.add(this.tiponacionalidad);
		}
		
		return tiponacionalidadsSeleccionados;
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
	
	public void generarReporteTipoNacionalidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoNacionalidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoNacionalidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNacionalidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoNacionalidadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Nacionalidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoNacionalidadsSeleccionados() throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoNacionalidads("Todos",tiponacionalidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoNacionalidadsSeleccionados() throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoNacionalidads("Todos",tiponacionalidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoNacionalidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoNacionalidads("Todos",tiponacionalidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoNacionalidadsSeleccionados() throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoNacionalidad();
		
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoNacionalidad();
		
		
		//this.generarReporteTipoNacionalidads("Todos",tiponacionalidadsSeleccionados ,tiponacionalidadImplementable,tiponacionalidadImplementableHome);
	}
	
	public void mostrarImportacionTipoNacionalidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoNacionalidad();
		
		this.abrirFrameImportacionTipoNacionalidad();		
		
			
		//this.generarReporteTipoNacionalidads("Todos",tiponacionalidadsSeleccionados ,tiponacionalidadImplementable,tiponacionalidadImplementableHome);
	}
	
	public void importarTipoNacionalidads() throws Exception {		
	
	}
	
	public void exportarTipoNacionalidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoNacionalidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoNacionalidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoNacionalidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Nacionalidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoNacionalidadsSeleccionados() throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponacionalidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoNacionalidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoNacionalidad(tiponacionalidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiponacionalidadAux.setsDetalleGeneralEntityReporte(tiponacionalidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoNacionalidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoNacionalidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNacionalidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNacionalidadConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoNacionalidadConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoNacionalidad(TipoNacionalidad tiponacionalidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiponacionalidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponacionalidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponacionalidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponacionalidad.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiponacionalidad.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoNacionalidadsSeleccionados() throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponacionalidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoNacionalidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoNacionalidad(row);				
				iRow++;
			}				
			
			for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoNacionalidad(tiponacionalidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoNacionalidadsSeleccionados() throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();		
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiponacionalidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiponacionalidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiponacionalidad");
			//elementRoot.appendChild(element);
		
			for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadsSeleccionados) {
				element = document.createElement("tiponacionalidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoNacionalidad(tiponacionalidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Nacionalidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoNacionalidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoNacionalidad(TipoNacionalidad tiponacionalidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiponacionalidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponacionalidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponacionalidad.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiponacionalidad.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoNacionalidad(TipoNacionalidad tiponacionalidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoNacionalidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiponacionalidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoNacionalidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiponacionalidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoNacionalidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiponacionalidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoNacionalidadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiponacionalidad.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoNacionalidadConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiponacionalidad.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoNacionalidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados=new ArrayList<TipoNacionalidad>();
		
		tiponacionalidadsSeleccionados=this.getTipoNacionalidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoNacionalidad(tiponacionalidadsSeleccionados);
		
		this.generarReporteTipoNacionalidads("Todos",tiponacionalidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoNacionalidad(ArrayList<TipoNacionalidad> tiponacionalidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoNacionalidad tiponacionalidadAux:tiponacionalidadsSeleccionados) {
				tiponacionalidadAux.setsDetalleGeneralEntityReporte(tiponacionalidadAux.toString());
			
				if(sTipoSeleccionar.equals(TipoNacionalidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiponacionalidadAux.setsDescripcionGeneralEntityReporte1(tiponacionalidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoNacionalidadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiponacionalidadAux.setsDescripcionGeneralEntityReporte1(tiponacionalidadAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoNacionalidadConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiponacionalidadAux.setsDescripcionGeneralEntityReporte1(tiponacionalidadAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoNacionalidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoNacionalidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoNacionalidad=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=true;
				this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=true;
			}
			
			this.isVisibilidadCeldaModificarTipoNacionalidad=false;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=false;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;
			this.isVisibilidadCeldaModificarTipoNacionalidad=false;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=true;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;
			this.isVisibilidadCeldaModificarTipoNacionalidad=false;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=true;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=true;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;
			this.isVisibilidadCeldaModificarTipoNacionalidad=false;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=true;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=true;
			this.isVisibilidadCeldaModificarTipoNacionalidad=false;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=false;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=false;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;
			this.isVisibilidadCeldaModificarTipoNacionalidad=true;
			this.isVisibilidadCeldaActualizarTipoNacionalidad=false;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
			this.isVisibilidadCeldaCancelarTipoNacionalidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoNacionalidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoNacionalidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoNacionalidad=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=true;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=true;
		} else {
			this.actualizarEstadoPanelsTipoNacionalidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoNacionalidad=false;
			//this.isVisibilidadCeldaVerFormTipoNacionalidad=false;
			this.isVisibilidadCeldaDuplicarTipoNacionalidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiponacionalidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoNacionalidad=false;
			this.isVisibilidadCeldaGuardarCambiosTipoNacionalidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			if(!tiponacionalidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;												
			}
			
			this.jButtonCerrarTipoNacionalidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoNacionalidad=false;
		}
		
		if(!this.permiteMantenimiento(this.tiponacionalidad)) {
			this.isVisibilidadCeldaActualizarTipoNacionalidad=false;
			this.isVisibilidadCeldaEliminarTipoNacionalidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoNacionalidad() {
	}
	
	public void actualizarEstadoPanelsTipoNacionalidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoNacionalidad!=null) {
				this.jScrollPanelDatosEdicionTipoNacionalidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNacionalidad!=null) {
				this.jScrollPanelDatosTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNacionalidad!=null) {
				this.jPanelPaginacionTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoNacionalidad!=null) {
				this.jScrollPanelDatosEdicionTipoNacionalidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoNacionalidad!=null) {
				this.jScrollPanelDatosTipoNacionalidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNacionalidad!=null) {
				this.jPanelPaginacionTipoNacionalidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoNacionalidad!=null) {
				this.jScrollPanelDatosEdicionTipoNacionalidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNacionalidad!=null) {
				this.jScrollPanelDatosTipoNacionalidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNacionalidad!=null) {
				this.jPanelPaginacionTipoNacionalidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoNacionalidad!=null) {
				this.jScrollPanelDatosEdicionTipoNacionalidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoNacionalidad!=null) {
				this.jScrollPanelDatosTipoNacionalidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoNacionalidad!=null) {
				this.jPanelPaginacionTipoNacionalidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoNacionalidad!=null) {
				this.jScrollPanelDatosEdicionTipoNacionalidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNacionalidad!=null) {
				this.jScrollPanelDatosTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNacionalidad!=null) {
				this.jPanelPaginacionTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoNacionalidad!=null) {
				this.jScrollPanelDatosEdicionTipoNacionalidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNacionalidad!=null) {
				this.jScrollPanelDatosTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNacionalidad!=null) {
				this.jPanelPaginacionTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoNacionalidad!=null) {
				this.jScrollPanelDatosEdicionTipoNacionalidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoNacionalidad!=null) {
				this.jScrollPanelDatosTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoNacionalidad!=null) {
				this.jPanelPaginacionTipoNacionalidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
					this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiponacionalidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoNacionalidad!=null) {
				this.jTabbedPaneBusquedasTipoNacionalidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoNacionalidad!=null) {
				this.jPanelParametrosReportesTipoNacionalidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoNacionalidadSessionBean tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
		
		if(this.tiponacionalidadSessionBean==null) {
			this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
		}
		
		this.tiponacionalidadSessionBean.setsUltimaBusquedaTipoNacionalidad(this.getsAccionBusqueda());
		this.tiponacionalidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiponacionalidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiponacionalidadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoNacionalidadSessionBean tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
		
		if(this.tiponacionalidadSessionBean==null) {
			this.tiponacionalidadSessionBean=new TipoNacionalidadSessionBean();
		}
		
		if(this.tiponacionalidadSessionBean.getsUltimaBusquedaTipoNacionalidad()!=null&&!this.tiponacionalidadSessionBean.getsUltimaBusquedaTipoNacionalidad().equals("")) {
			this.setsAccionBusqueda(tiponacionalidadSessionBean.getsUltimaBusquedaTipoNacionalidad());
			this.setiNumeroPaginacion(tiponacionalidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiponacionalidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiponacionalidadSessionBean.getid_empresa());
				tiponacionalidadSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiponacionalidadSessionBean.setsUltimaBusquedaTipoNacionalidad("");
		this.tiponacionalidadSessionBean.setiNumeroPaginacion(TipoNacionalidadConstantesFunciones.INUMEROPAGINACION);
		this.tiponacionalidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoNacionalidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoNacionalidad() {
		this.updateBorderResaltarBusquedasFormularioTipoNacionalidad();
		this.updateVisibilidadBusquedasFormularioTipoNacionalidad();
		this.updateHabilitarBusquedasFormularioTipoNacionalidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoNacionalidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoNacionalidad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoNacionalidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoNacionalidad.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoNacionalidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoNacionalidad.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoNacionalidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoNacionalidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoNacionalidad() throws Exception {

		if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoNacionalidad();
		this.updateVisibilidadResaltarControlesFormularioTipoNacionalidad();
		this.updateHabilitarResaltarControlesFormularioTipoNacionalidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoNacionalidad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiponacionalidadConstantesFunciones.resaltaridTipoNacionalidad!=null && this.jInternalFrameDetalleFormTipoNacionalidad!=null) {this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.setBorder(this.tiponacionalidadConstantesFunciones.resaltaridTipoNacionalidad);}
		if(this.tiponacionalidadConstantesFunciones.resaltarid_empresaTipoNacionalidad!=null && this.jInternalFrameDetalleFormTipoNacionalidad!=null) {this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setBorder(this.tiponacionalidadConstantesFunciones.resaltarid_empresaTipoNacionalidad);}
		if(this.tiponacionalidadConstantesFunciones.resaltarcodigoTipoNacionalidad!=null && this.jInternalFrameDetalleFormTipoNacionalidad!=null) {this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.setBorder(this.tiponacionalidadConstantesFunciones.resaltarcodigoTipoNacionalidad);}
		if(this.tiponacionalidadConstantesFunciones.resaltarnombreTipoNacionalidad!=null && this.jInternalFrameDetalleFormTipoNacionalidad!=null) {this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.setBorder(this.tiponacionalidadConstantesFunciones.resaltarnombreTipoNacionalidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoNacionalidad() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
	
		//this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostraridTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jPanelidTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostraridTipoNacionalidad);
		//this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostrarid_empresaTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jPanelid_empresaTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostrarid_empresaTipoNacionalidad);
		//this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostrarcodigoTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jPanelcodigoTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostrarcodigoTipoNacionalidad);
		//this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostrarnombreTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jPanelnombreTipoNacionalidad.setVisible(this.tiponacionalidadConstantesFunciones.mostrarnombreTipoNacionalidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoNacionalidad() throws Exception {
		if(this.jInternalFrameDetalleFormTipoNacionalidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoNacionalidad!=null) {
	
		this.jInternalFrameDetalleFormTipoNacionalidad.jLabelidTipoNacionalidad.setEnabled(this.tiponacionalidadConstantesFunciones.activaridTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jComboBoxid_empresaTipoNacionalidad.setEnabled(this.tiponacionalidadConstantesFunciones.activarid_empresaTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jTextFieldcodigoTipoNacionalidad.setEnabled(this.tiponacionalidadConstantesFunciones.activarcodigoTipoNacionalidad);
		this.jInternalFrameDetalleFormTipoNacionalidad.jTextAreanombreTipoNacionalidad.setEnabled(this.tiponacionalidadConstantesFunciones.activarnombreTipoNacionalidad);
		}
	}
	
		
}