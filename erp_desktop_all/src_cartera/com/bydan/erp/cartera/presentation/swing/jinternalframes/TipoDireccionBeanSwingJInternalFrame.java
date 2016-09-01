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

import com.bydan.erp.cartera.util.TipoDireccionConstantesFunciones;
import com.bydan.erp.cartera.util.TipoDireccionParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoDireccionParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoDireccionBean;
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
public class TipoDireccionBeanSwingJInternalFrame extends TipoDireccionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDireccionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDireccion> tipodireccionValidator = new ClassValidator<TipoDireccion>(TipoDireccion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDireccion tipodireccion;	
	public TipoDireccion tipodireccionAux;
	public TipoDireccion tipodireccionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDireccion tipodireccionTotales;
	public Long idTipoDireccionActual;
	public Long iIdNuevoTipoDireccion=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDireccion=false;

	public Boolean getIsTienePermisosDireccion() {
		return isTienePermisosDireccion;
	}

	public void setIsTienePermisosDireccion(Boolean isTienePermisosDireccion) {
		this.isTienePermisosDireccion= isTienePermisosDireccion;
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
	
	public Boolean isPermisoTodoTipoDireccion;
	public Boolean isPermisoNuevoTipoDireccion;
	public Boolean isPermisoActualizarTipoDireccion;
	public Boolean isPermisoActualizarOriginalTipoDireccion;
	public Boolean isPermisoEliminarTipoDireccion;
	public Boolean isPermisoGuardarCambiosTipoDireccion;
	public Boolean isPermisoConsultaTipoDireccion;
	public Boolean isPermisoBusquedaTipoDireccion;
	public Boolean isPermisoReporteTipoDireccion;
	public Boolean isPermisoPaginacionMedioTipoDireccion;
	public Boolean isPermisoPaginacionAltoTipoDireccion;
	public Boolean isPermisoPaginacionTodoTipoDireccion;
	public Boolean isPermisoCopiarTipoDireccion;
	public Boolean isPermisoVerFormTipoDireccion;
	public Boolean isPermisoDuplicarTipoDireccion;
	public Boolean isPermisoOrdenTipoDireccion;
	
	
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
	
	public TipoDireccionParameterReturnGeneral tipodireccionReturnGeneral;
	public TipoDireccionParameterReturnGeneral tipodireccionParameterGeneral;
	
	

	public DireccionLogic direccionLogic=null;

	public DireccionLogic getDireccionLogic() {
		return direccionLogic;
	}

	public void setDireccionLogic(DireccionLogic direccionLogic) {
		this.direccionLogic = direccionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDireccion=false;
	public Boolean esParaAccionDesdeFormularioTipoDireccion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoDireccionSessionBeanAdditional tipodireccionSessionBeanAdditional=null;
	
	public TipoDireccionSessionBeanAdditional getTipoDireccionSessionBeanAdditional() {
		return this.tipodireccionSessionBeanAdditional;
	}
	
	public void setTipoDireccionSessionBeanAdditional(TipoDireccionSessionBeanAdditional tipodireccionSessionBeanAdditional) {
		try {
			this.tipodireccionSessionBeanAdditional=tipodireccionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoDireccionBeanSwingJInternalFrameAdditional tipodireccionBeanSwingJInternalFrameAdditional=null;
	//public class TipoDireccionBeanSwingJInternalFrame
	
	public TipoDireccionBeanSwingJInternalFrameAdditional getTipoDireccionBeanSwingJInternalFrameAdditional() {
		return this.tipodireccionBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoDireccionBeanSwingJInternalFrameAdditional(TipoDireccionBeanSwingJInternalFrameAdditional tipodireccionBeanSwingJInternalFrameAdditional) {
		try {
			this.tipodireccionBeanSwingJInternalFrameAdditional=tipodireccionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDireccionLogic tipodireccionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDireccion tipodireccionBean;
	public TipoDireccionConstantesFunciones tipodireccionConstantesFunciones;
	//public TipoDireccionParameterReturnGeneral tipodireccionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDireccion> tipodireccions;	
	//public List<TipoDireccion> tipodireccionsEliminados;
	//public List<TipoDireccion> tipodireccionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDireccion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDireccion=true;
	public Boolean isVisibilidadCeldaCopiarTipoDireccion=true;
	public Boolean isVisibilidadCeldaVerFormTipoDireccion=true;
	public Boolean isVisibilidadCeldaOrdenTipoDireccion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
	public Boolean isVisibilidadCeldaModificarTipoDireccion=false;
	public Boolean isVisibilidadCeldaActualizarTipoDireccion=false;
	public Boolean isVisibilidadCeldaEliminarTipoDireccion=false;
	public Boolean isVisibilidadCeldaCancelarTipoDireccion=false;
	public Boolean isVisibilidadCeldaGuardarTipoDireccion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDireccion=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoDireccion() {
		return this.iIdNuevoTipoDireccion;
	}

	public void setiIdNuevoTipoDireccion(Long iIdNuevoTipoDireccion) {
		this.iIdNuevoTipoDireccion = iIdNuevoTipoDireccion;
	}
	
	public Long getidTipoDireccionActual() {
		return this.idTipoDireccionActual;
	}

	public void setidTipoDireccionActual(Long idTipoDireccionActual) {
		this.idTipoDireccionActual = idTipoDireccionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDireccion gettipodireccion() {
		return this.tipodireccion;
	}

	public void settipodireccion(TipoDireccion tipodireccion) {
		this.tipodireccion = tipodireccion;
	}
	
	public TipoDireccion gettipodireccionAux() {
		return this.tipodireccionAux;
	}

	public void settipodireccionAux(TipoDireccion tipodireccionAux) {
		this.tipodireccionAux = tipodireccionAux;
	}				
	
	public TipoDireccion gettipodireccionAnterior() {
		return this.tipodireccionAnterior;
	}

	public void settipodireccionAnterior(TipoDireccion tipodireccionAnterior) {
		this.tipodireccionAnterior = tipodireccionAnterior;
	}	
	
	public TipoDireccion gettipodireccionTotales() {
		return this.tipodireccionTotales;
	}

	public void settipodireccionTotales(TipoDireccion tipodireccionTotales) {
		this.tipodireccionTotales = tipodireccionTotales;
	}	
	
	public TipoDireccion gettipodireccionBean() {
		return this.tipodireccionBean;
	}

	public void settipodireccionBean(TipoDireccion tipodireccionBean) {
		this.tipodireccionBean = tipodireccionBean;
	}	
	
	public TipoDireccionParameterReturnGeneral gettipodireccionReturnGeneral() {
		return this.tipodireccionReturnGeneral;
	}

	public void settipodireccionReturnGeneral(TipoDireccionParameterReturnGeneral tipodireccionReturnGeneral) {
		this.tipodireccionReturnGeneral = tipodireccionReturnGeneral;
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
	
	
	public TipoDireccionLogic getTipoDireccionLogic()	{		
		return tipodireccionLogic;
	}

	public void setTipoDireccionLogic(TipoDireccionLogic tipodireccionLogic) {
		this.tipodireccionLogic = tipodireccionLogic;
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
	
	public Boolean getIsEsNuevoTipoDireccion() {
		return isEsNuevoTipoDireccion;
	}

	public void setIsEsNuevoTipoDireccion(Boolean isEsNuevoTipoDireccion) {
		this.isEsNuevoTipoDireccion = isEsNuevoTipoDireccion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDireccion() {
		return esParaAccionDesdeFormularioTipoDireccion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDireccion(Boolean esParaAccionDesdeFormularioTipoDireccion) {
		this.esParaAccionDesdeFormularioTipoDireccion = esParaAccionDesdeFormularioTipoDireccion;
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

			if(this.tipodireccionSessionBean==null) {
				this.tipodireccionSessionBean=new TipoDireccionSessionBean();
			}

			if(!this.tipodireccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodireccionSessionBean.getlidEmpresaActual());
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

					if(this.tipodireccion!=null) {
						this.tipodireccion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
						this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDireccion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
						if(this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDireccionGenerico)throws Exception
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
				jComboBoxid_empresaTipoDireccionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDireccionGenerico!=null && jComboBoxid_empresaTipoDireccionGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDireccionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDireccion tipodireccion,JComboBox jComboBoxid_empresaTipoDireccionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDireccionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDireccionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodireccion.setid_empresa(empresaAux.getId());
				tipodireccion.setempresa_descripcion(TipoDireccionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodireccion.setEmpresa(empresaAux);			}
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

					if(!TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDireccion!=null) { 
							this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDireccion!=null) { 
					}

					if(!TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
							this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
							this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoDireccion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDireccionConstantesFunciones.refrescarForeignKeysDescripcionesTipoDireccion(this.tipodireccionLogic.getTipoDireccions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDireccionConstantesFunciones.refrescarForeignKeysDescripcionesTipoDireccion(this.tipodireccions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodireccionLogic.setTipoDireccions(this.tipodireccions);
			tipodireccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDireccionParameterReturnGeneral getTipoDireccionParameterGeneral() {
		return this.tipodireccionParameterGeneral;
	}
	
	public void setTipoDireccionParameterGeneral(TipoDireccionParameterReturnGeneral tipodireccionParameterGeneral) {
		this.tipodireccionParameterGeneral = tipodireccionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDireccion() {
		return isPermisoTodoTipoDireccion;
	}

	public void setIsPermisoTodoTipoDireccion(Boolean isPermisoTodoTipoDireccion) {
		this.isPermisoTodoTipoDireccion = isPermisoTodoTipoDireccion;
	}

	public Boolean getIsPermisoNuevoTipoDireccion() {
		return isPermisoNuevoTipoDireccion;
	}

	public void setIsPermisoNuevoTipoDireccion(Boolean isPermisoNuevoTipoDireccion) {
		this.isPermisoNuevoTipoDireccion = isPermisoNuevoTipoDireccion;
	}

	public Boolean getIsPermisoActualizarTipoDireccion() {
		return isPermisoActualizarTipoDireccion;
	}

	public void setIsPermisoActualizarTipoDireccion(Boolean isPermisoActualizarTipoDireccion) {
		this.isPermisoActualizarTipoDireccion = isPermisoActualizarTipoDireccion;
	}

	public Boolean getIsPermisoEliminarTipoDireccion() {
		return isPermisoEliminarTipoDireccion;
	}

	public void setIsPermisoEliminarTipoDireccion(Boolean isPermisoEliminarTipoDireccion) {
		this.isPermisoEliminarTipoDireccion = isPermisoEliminarTipoDireccion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDireccion() {
		return isPermisoGuardarCambiosTipoDireccion;
	}

	public void setIsPermisoGuardarCambiosTipoDireccion(Boolean isPermisoGuardarCambiosTipoDireccion) {
		this.isPermisoGuardarCambiosTipoDireccion = isPermisoGuardarCambiosTipoDireccion;
	}
	
	public Boolean getIsPermisoConsultaTipoDireccion() {
		return isPermisoConsultaTipoDireccion;
	}

	public void setIsPermisoConsultaTipoDireccion(Boolean isPermisoConsultaTipoDireccion) {
		this.isPermisoConsultaTipoDireccion = isPermisoConsultaTipoDireccion;
	}

	public Boolean getIsPermisoBusquedaTipoDireccion() {
		return isPermisoBusquedaTipoDireccion;
	}

	public void setIsPermisoBusquedaTipoDireccion(Boolean isPermisoBusquedaTipoDireccion) {
		this.isPermisoBusquedaTipoDireccion = isPermisoBusquedaTipoDireccion;
	}

	public Boolean getIsPermisoReporteTipoDireccion() {
		return isPermisoReporteTipoDireccion;
	}

	public void setIsPermisoReporteTipoDireccion(Boolean isPermisoReporteTipoDireccion) {
		this.isPermisoReporteTipoDireccion = isPermisoReporteTipoDireccion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDireccion() {
		return isPermisoPaginacionMedioTipoDireccion;
	}

	public void setIsPermisoPaginacionMedioTipoDireccion(Boolean isPermisoPaginacionMedioTipoDireccion) {
		this.isPermisoPaginacionMedioTipoDireccion = isPermisoPaginacionMedioTipoDireccion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDireccion() {
		return isPermisoPaginacionTodoTipoDireccion;
	}

	public void setIsPermisoPaginacionTodoTipoDireccion(Boolean isPermisoPaginacionTodoTipoDireccion) {
		this.isPermisoPaginacionTodoTipoDireccion = isPermisoPaginacionTodoTipoDireccion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDireccion() {
		return isPermisoPaginacionAltoTipoDireccion;
	}

	public void setIsPermisoPaginacionAltoTipoDireccion(Boolean isPermisoPaginacionAltoTipoDireccion) {
		this.isPermisoPaginacionAltoTipoDireccion = isPermisoPaginacionAltoTipoDireccion;
	}
	
	public Boolean getIsPermisoCopiarTipoDireccion() {
		return isPermisoCopiarTipoDireccion;
	}

	public void setIsPermisoCopiarTipoDireccion(Boolean isPermisoCopiarTipoDireccion) {
		this.isPermisoCopiarTipoDireccion = isPermisoCopiarTipoDireccion;
	}
	
	public Boolean getIsPermisoVerFormTipoDireccion() {
		return isPermisoVerFormTipoDireccion;
	}

	public void setIsPermisoVerFormTipoDireccion(Boolean isPermisoVerFormTipoDireccion) {
		this.isPermisoVerFormTipoDireccion = isPermisoVerFormTipoDireccion;
	}
	
	public Boolean getIsPermisoDuplicarTipoDireccion() {
		return isPermisoDuplicarTipoDireccion;
	}

	public void setIsPermisoDuplicarTipoDireccion(Boolean isPermisoDuplicarTipoDireccion) {
		this.isPermisoDuplicarTipoDireccion = isPermisoDuplicarTipoDireccion;
	}
	
	public Boolean getIsPermisoOrdenTipoDireccion() {
		return isPermisoOrdenTipoDireccion;
	}

	public void setIsPermisoOrdenTipoDireccion(Boolean isPermisoOrdenTipoDireccion) {
		this.isPermisoOrdenTipoDireccion = isPermisoOrdenTipoDireccion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDireccion() {
		return isVisibilidadCeldaNuevoTipoDireccion;
	}

	public void setIsVisibilidadCeldaNuevoTipoDireccion(Boolean isVisibilidadCeldaNuevoTipoDireccion) {
		this.isVisibilidadCeldaNuevoTipoDireccion = isVisibilidadCeldaNuevoTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDireccion() {
		return isVisibilidadCeldaDuplicarTipoDireccion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDireccion(Boolean isVisibilidadCeldaDuplicarTipoDireccion) {
		this.isVisibilidadCeldaDuplicarTipoDireccion = isVisibilidadCeldaDuplicarTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDireccion() {
		return isVisibilidadCeldaCopiarTipoDireccion;
	}

	public void setIsVisibilidadCeldaCopiarTipoDireccion(Boolean isVisibilidadCeldaCopiarTipoDireccion) {
		this.isVisibilidadCeldaCopiarTipoDireccion = isVisibilidadCeldaCopiarTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDireccion() {
		return isVisibilidadCeldaVerFormTipoDireccion;
	}

	public void setIsVisibilidadCeldaVerFormTipoDireccion(Boolean isVisibilidadCeldaVerFormTipoDireccion) {
		this.isVisibilidadCeldaVerFormTipoDireccion = isVisibilidadCeldaVerFormTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDireccion() {
		return isVisibilidadCeldaOrdenTipoDireccion;
	}

	public void setIsVisibilidadCeldaOrdenTipoDireccion(Boolean isVisibilidadCeldaOrdenTipoDireccion) {
		this.isVisibilidadCeldaOrdenTipoDireccion = isVisibilidadCeldaOrdenTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDireccion() {
		return isVisibilidadCeldaNuevoRelacionesTipoDireccion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDireccion(Boolean isVisibilidadCeldaNuevoRelacionesTipoDireccion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDireccion = isVisibilidadCeldaNuevoRelacionesTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDireccion() {
		return isVisibilidadCeldaModificarTipoDireccion;
	}

	public void setIsVisibilidadCeldaModificarTipoDireccion(Boolean isVisibilidadCeldaModificarTipoDireccion) {
		this.isVisibilidadCeldaModificarTipoDireccion = isVisibilidadCeldaModificarTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDireccion() {
		return isVisibilidadCeldaActualizarTipoDireccion;
	}

	public void setIsVisibilidadCeldaActualizarTipoDireccion(Boolean isVisibilidadCeldaActualizarTipoDireccion) {
		this.isVisibilidadCeldaActualizarTipoDireccion = isVisibilidadCeldaActualizarTipoDireccion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDireccion() {
		return isVisibilidadCeldaEliminarTipoDireccion;
	}

	public void setIsVisibilidadCeldaEliminarTipoDireccion(Boolean isVisibilidadCeldaEliminarTipoDireccion) {
		this.isVisibilidadCeldaEliminarTipoDireccion = isVisibilidadCeldaEliminarTipoDireccion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDireccion() {
		return isVisibilidadCeldaCancelarTipoDireccion;
	}

	public void setIsVisibilidadCeldaCancelarTipoDireccion(Boolean isVisibilidadCeldaCancelarTipoDireccion) {
		this.isVisibilidadCeldaCancelarTipoDireccion = isVisibilidadCeldaCancelarTipoDireccion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDireccion() {
		return isVisibilidadCeldaGuardarTipoDireccion;
	}

	public void setIsVisibilidadCeldaGuardarTipoDireccion(Boolean isVisibilidadCeldaGuardarTipoDireccion) {
		this.isVisibilidadCeldaGuardarTipoDireccion = isVisibilidadCeldaGuardarTipoDireccion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDireccion() {
		return isVisibilidadCeldaGuardarCambiosTipoDireccion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDireccion(Boolean isVisibilidadCeldaGuardarCambiosTipoDireccion) {
		this.isVisibilidadCeldaGuardarCambiosTipoDireccion = isVisibilidadCeldaGuardarCambiosTipoDireccion;
	}
		
	public TipoDireccionSessionBean gettipodireccionSessionBean() {
		return this.tipodireccionSessionBean;
	}
	
	public void settipodireccionSessionBean(TipoDireccionSessionBean tipodireccionSessionBean) {
		this.tipodireccionSessionBean=tipodireccionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(TipoDireccion tipodireccion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodireccion,null);
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
	
	public void bugActualizarReferenciaActual(TipoDireccion tipodireccion,TipoDireccion tipodireccionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDireccion(tipodireccion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodireccionAux.setId(tipodireccion.getId());
		tipodireccionAux.setVersionRow(tipodireccion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDireccion();
		
			int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodireccionValidator.getInvalidValues(this.tipodireccion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodireccionLogic.setDatosCliente(datosCliente);
			tipodireccionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodireccionAux=new  TipoDireccion();
				
				tipodireccionAux.setIsNew(true);
				tipodireccionAux.setIsChanged(true);
				
				tipodireccionAux.setTipoDireccionOriginal(this.tipodireccion);
				
				tipodireccionAux.setId(this.tipodireccion.getId());	
				tipodireccionAux.setVersionRow(this.tipodireccion.getVersionRow());	
				tipodireccionAux.setid_empresa(this.tipodireccion.getid_empresa());	
				tipodireccionAux.setcodigo(this.tipodireccion.getcodigo());	
				tipodireccionAux.setnombre(this.tipodireccion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodireccionAux,tipodireccionLogic.getTipoDireccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodireccionAux,tipodireccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodireccionLogic.saveTipoDireccions();//WithConnection
						//tipodireccionLogic.getSetVersionRowTipoDireccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodireccion,tipodireccionAux);
					
					this.refrescarForeignKeysDescripcionesTipoDireccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions().addAll(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccions.addAll(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodireccionLogic.saveTipoDireccionRelaciones(tipodireccionAux,this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());//WithConnection
								//tipodireccionLogic.getSetVersionRowTipoDireccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodireccion,tipodireccionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(new ArrayList<Direccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccions= new ArrayList<Direccion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodireccionAux.setDireccions(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodireccionAux,tipodireccionLogic.getTipoDireccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodireccionAux,tipodireccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodireccion,tipodireccionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodireccionAux=new  TipoDireccion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodireccionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodireccionSessionBean.getEsGuardarRelacionado() && this.tipodireccion.getId()>=0)) {
						
					tipodireccionAux.setIsNew(false);
				}
				
				tipodireccionAux.setIsDeleted(false);
			
				tipodireccionAux.setId(this.tipodireccion.getId());	
				tipodireccionAux.setVersionRow(this.tipodireccion.getVersionRow());	
				tipodireccionAux.setid_empresa(this.tipodireccion.getid_empresa());	
				tipodireccionAux.setcodigo(this.tipodireccion.getcodigo());	
				tipodireccionAux.setnombre(this.tipodireccion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodireccionAux,tipodireccionLogic.getTipoDireccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodireccionAux,tipodireccions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodireccionLogic.saveTipoDireccions();//WithConnection
						//tipodireccionLogic.getSetVersionRowTipoDireccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodireccion,tipodireccionAux);
					
					this.refrescarForeignKeysDescripcionesTipoDireccion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions().addAll(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccions.addAll(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodireccionLogic.saveTipoDireccionRelaciones(tipodireccionAux,this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());//WithConnection
								//tipodireccionLogic.getSetVersionRowTipoDireccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipodireccion,tipodireccionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(new ArrayList<Direccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccions= new ArrayList<Direccion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodireccionAux.setDireccions(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipodireccionAux,tipodireccionLogic.getTipoDireccions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipodireccionAux,tipodireccions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipodireccion,tipodireccionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodireccionAux=new  TipoDireccion();
				
				tipodireccionAux.setIsNew(false);
				tipodireccionAux.setIsChanged(false);
				
				tipodireccionAux.setIsDeleted(true);
				
				tipodireccionAux.setId(this.tipodireccion.getId());	
				tipodireccionAux.setVersionRow(this.tipodireccion.getVersionRow());	
				tipodireccionAux.setid_empresa(this.tipodireccion.getid_empresa());	
				tipodireccionAux.setcodigo(this.tipodireccion.getcodigo());	
				tipodireccionAux.setnombre(this.tipodireccion.getnombre());	
				
				if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodireccionAux.getId()>=0) {	
						this.tipodireccionsEliminados.add(tipodireccionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodireccionAux,tipodireccionLogic.getTipoDireccions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodireccionAux,tipodireccions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodireccionLogic.saveTipoDireccions();//WithConnection
						//tipodireccionLogic.getSetVersionRowTipoDireccions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions().addAll(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccions.addAll(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipodireccionLogic.saveTipoDireccionRelaciones(tipodireccionAux,this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());//WithConnection
								//tipodireccionLogic.getSetVersionRowTipoDireccions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(new ArrayList<Direccion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccions= new ArrayList<Direccion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodireccionAux.setDireccions(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodireccionAux,tipodireccionLogic.getTipoDireccions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodireccionAux,tipodireccions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.getTipoDireccions().addAll(this.tipodireccionsEliminados);
					
					tipodireccionLogic.saveTipoDireccions();//WithConnection
					//tipodireccionLogic.getSetVersionRowTipoDireccions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDireccion();
				
				this.tipodireccionsEliminados= new ArrayList<TipoDireccion>();		
			}
			
			if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Direccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodireccion=tipodireccionAux;
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
      		//this.finishProcessTipoDireccion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDireccion tipodireccionLocal) throws Exception {
		
		if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipodireccionLocal.setDireccions(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
			
			} else {
			
				tipodireccionLocal.setDireccions(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDireccion tipodireccionLocal) throws Exception {	
		if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodireccionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDireccionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodireccionValidator.getInvalidValues(this.tipodireccion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDireccion tipodireccion,List<TipoDireccion> tipodireccions) throws Exception {
		try	{		
			TipoDireccionConstantesFunciones.actualizarLista(tipodireccion,tipodireccions,this.tipodireccionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDireccion tipodireccion,List<TipoDireccion> tipodireccions) throws Exception {
		try	{			
			TipoDireccionConstantesFunciones.actualizarSelectedLista(tipodireccion,tipodireccions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDireccion> tipodireccionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodireccionsLocal=this.tipodireccionLogic.getTipoDireccions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodireccionsLocal=this.tipodireccions;
			}
			//ARCHITECTURE
		
			for(TipoDireccion tipodireccionLocal:tipodireccionsLocal) {
				if(this.permiteMantenimiento(tipodireccionLocal) && tipodireccionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDireccionConstantesFunciones.getTipoDireccionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDireccionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDireccion.jLabelid_empresaTipoDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDireccionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDireccion.jLabelcodigoTipoDireccion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDireccionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDireccion.jLabelnombreTipoDireccion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDireccion.jLabelid_empresaTipoDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDireccion.jLabelcodigoTipoDireccion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDireccion.jLabelnombreTipoDireccion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Direccion")) {
			if(this.tipodireccion==null) {
				this.tipodireccion= new TipoDireccion();
			}

			if(this.tipodireccionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDireccion
				this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);

				this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.getdireccion().setTipoDireccion(this.tipodireccion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoDireccion--;	
		
		
		this.tipodireccionAux=new TipoDireccion();
		
		this.tipodireccionAux.setId(this.iIdNuevoTipoDireccion);
		this.tipodireccionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodireccionLogic.getTipoDireccions().add(this.tipodireccionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodireccions.add(this.tipodireccionAux);
		}
		//ARCHITECTURE
		
		this.tipodireccion=this.tipodireccionAux;
		
		if(TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDireccion(this.tipodireccion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDireccion(this.tipodireccion);
		}
				
		//this.setDefaultControlesTipoDireccion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDireccion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDireccion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDireccion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDireccion(this.tipodireccionBean,this.tipodireccion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDireccionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
			classes=TipoDireccionConstantesFunciones.getClassesRelationshipsOfTipoDireccion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodireccionReturnGeneral=tipodireccionLogic.procesarEventosTipoDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodireccionLogic.getTipoDireccions(),this.tipodireccion,this.tipodireccionParameterGeneral,this.isEsNuevoTipoDireccion,classes);//this.tipodireccionLogic.getTipoDireccion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDireccion(this.tipodireccionReturnGeneral,this.tipodireccionBean,false);
		
		if(this.tipodireccionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDireccion(this.tipodireccionReturnGeneral.getTipoDireccion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDireccion(this.tipodireccionReturnGeneral.getTipoDireccion());
		}
		
		if(this.tipodireccionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDireccion(this.tipodireccionReturnGeneral.getTipoDireccion(),classes);//this.tipodireccionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDireccion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDireccion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDireccionBeanSwingJInternalFrameAdditional.RecargarFormTipoDireccion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDireccion(false);
						
			if(tipodireccionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionSessionBean.getEsGuardarRelacionado() && DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDireccionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDireccion();
			}
			
			this.actualizarVisualTableDatosTipoDireccion();
			
			this.jTableDatosTipoDireccion.setRowSelectionInterval(this.getIndiceNuevoTipoDireccion(), this.getIndiceNuevoTipoDireccion());
			
			this.seleccionarFilaTablaTipoDireccionActual();
						
			this.actualizarEstadoCeldasBotonesTipoDireccion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDireccion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.setEnabled(isHabilitar && this.tipodireccionConstantesFunciones.activarcodigoTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.setEnabled(isHabilitar && this.tipodireccionConstantesFunciones.activarnombreTipoDireccion);	
		//
		this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setEnabled(isHabilitar && this.tipodireccionConstantesFunciones.activarid_empresaTipoDireccion);
	};
	
	public void setDefaultControlesTipoDireccion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDireccion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodireccionSessionBean.setConGuardarRelaciones(true);			
			this.tipodireccionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipodireccionSessionBean.setConGuardarRelaciones(false);			
			this.tipodireccionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoDireccion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
				if(tipodireccionAux.getId().equals(this.iIdNuevoTipoDireccion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDireccion tipodireccionAux:this.tipodireccions) {
				if(tipodireccionAux.getId().equals(this.iIdNuevoTipoDireccion)) {
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
	
	public int getIndiceActualTipoDireccion(TipoDireccion tipodireccion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
				if(tipodireccionAux.getId().equals(tipodireccion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDireccion tipodireccionAux:this.tipodireccions) {
				if(tipodireccionAux.getId().equals(tipodireccion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDireccion(TipoDireccion tipodireccionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
				if(tipodireccionAux.getTipoDireccionOriginal().getId().equals(tipodireccionOriginal.getId())) {
					existe=true;
					tipodireccionOriginal.setId(tipodireccionAux.getId());
					tipodireccionOriginal.setVersionRow(tipodireccionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDireccion tipodireccionAux:this.tipodireccions) {
				if(tipodireccionAux.getTipoDireccionOriginal().getId().equals(tipodireccionOriginal.getId())) {
					existe=true;
					tipodireccionOriginal.setId(tipodireccionAux.getId());
					tipodireccionOriginal.setVersionRow(tipodireccionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDireccion(Boolean esParaCancelar) throws Exception {
		tipodireccionsAux=new ArrayList<TipoDireccion>();
		tipodireccionAux=new TipoDireccion();
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
					if(tipodireccionAux.getId()<0) {
						tipodireccionsAux.add(tipodireccionAux);
					}		
				}
				this.iIdNuevoTipoDireccion=0L;
				this.tipodireccionLogic.getTipoDireccions().removeAll(tipodireccionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDireccion tipodireccionAux:this.tipodireccions) {
					if(tipodireccionAux.getId()<0) {
						tipodireccionsAux.add(tipodireccionAux);
					}		
				}
				this.iIdNuevoTipoDireccion=0L;
				this.tipodireccions.removeAll(tipodireccionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDireccion 
					&& this.tipodireccionLogic.getTipoDireccions().size()>0
					) {
					tipodireccionAux=this.tipodireccionLogic.getTipoDireccions().get(this.tipodireccionLogic.getTipoDireccions().size() - 1);
				
					if(tipodireccionAux.getId()<0) {
						this.tipodireccionLogic.getTipoDireccions().remove(tipodireccionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDireccion && this.tipodireccions.size()>0) {
					tipodireccionAux=this.tipodireccions.get(this.tipodireccions.size() - 1);
				
					if(tipodireccionAux.getId()<0) {
						this.tipodireccions.remove(tipodireccionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDireccion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodireccion.getId()<0) {
				this.tipodireccionLogic.getTipoDireccions().remove(this.tipodireccion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodireccion.getId()<0) {
				this.tipodireccions.remove(this.tipodireccion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDireccion(List<TipoDireccion> tipodireccionsAux) throws Exception {
		TipoDireccionConstantesFunciones.setEstadosInicialesTipoDireccion(tipodireccionsAux);
	}
	
	public void setEstadosInicialesTipoDireccion(TipoDireccion tipodireccionAux) throws Exception {
		TipoDireccionConstantesFunciones.setEstadosInicialesTipoDireccion(tipodireccionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDireccionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDireccionActual()) {
				if(!this.isEsNuevoTipoDireccion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDireccion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDireccionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Direccion ?", "MANTENIMIENTO DE Tipo Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDireccion tipodireccion) throws Exception {
		TipoDireccionConstantesFunciones.seleccionarAsignar(this.tipodireccion,tipodireccion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDireccion=this.isPermisoActualizarOriginalTipoDireccion;
			
			
			this.seleccionarAsignar(tipodireccion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDireccionConstantesFunciones.quitarEspaciosTipoDireccion(this.tipodireccion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDireccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodireccionSessionBean.setsFuncionBusquedaRapida(this.tipodireccionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDireccion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDireccion(esParaCancelar);				
				this.cancelarNuevoTipoDireccion(esParaCancelar);								
			}
			
			this.tipodireccion=new TipoDireccion();
			
			this.inicializarTipoDireccion();
			
			this.actualizarEstadoCeldasBotonesTipoDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDireccion() throws Exception {
		try {
			TipoDireccionConstantesFunciones.inicializarTipoDireccion(this.tipodireccion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodireccionLogic.getTipoDireccions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDireccions(String sAccionBusqueda,List<TipoDireccion> tipodireccionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDireccion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDireccionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDireccionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDireccion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Direcciones");		
		parameters.put("busquedapor", TipoDireccionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Direccion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoDireccionLogic tipodireccionLogicAuxiliar=new TipoDireccionLogic();
					tipodireccionLogicAuxiliar.setDatosCliente(tipodireccionLogic.getDatosCliente());				
					tipodireccionLogicAuxiliar.setTipoDireccions(tipodireccionsParaReportes);
					
					tipodireccionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoDireccionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipodireccionsParaReportes=tipodireccionLogicAuxiliar.getTipoDireccions();
					
					//tipodireccionLogic.getNewConnexionToDeep();
					
					//for (TipoDireccion tipodireccion:tipodireccionsParaReportes) {
					//	tipodireccionLogic.deepLoad(tipodireccion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipodireccionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipodireccionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDireccion = AuxiliarReportes.class.getResourceAsStream("DireccionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_direccion", reportFileDireccion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDireccion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDireccionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDireccionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDireccion=new JRBeanArrayDataSource(TipoDireccionJInternalFrame.TraerTipoDireccionBeans(tipodireccionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDireccion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDireccionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDireccionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDireccionBean.TraerTipoDireccionBeans(tipodireccionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDireccions(sAccionBusqueda,sTipoArchivoReporte,tipodireccionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDireccions(sAccionBusqueda,sTipoArchivoReporte,tipodireccionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDireccionActionPerformed(null);
					//this.generarExcelReporteTipoDireccions(sAccionBusqueda,sTipoArchivoReporte,tipodireccionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDireccions(sAccionBusqueda,sTipoArchivoReporte,tipodireccionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDireccions(sAccionBusqueda,sTipoArchivoReporte,tipodireccionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDireccions(sAccionBusqueda,sTipoArchivoReporte,tipodireccionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDireccions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDireccion> tipodireccionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodireccion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDireccions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDireccion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDireccion tipodireccion : tipodireccionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDireccionConstantesFunciones.generarExcelReporteDataTipoDireccion("NORMAL",row,workbook,tipodireccion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDireccion(String sTipo,Row row,Workbook workbook) {
		
		TipoDireccionConstantesFunciones.generarExcelReporteHeaderTipoDireccion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDireccions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDireccion> tipodireccionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodireccion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDireccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDireccion tipodireccion : tipodireccionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDireccionConstantesFunciones.getTipoDireccionDescripcion(tipodireccion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDireccionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodireccion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDireccionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodireccion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDireccionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodireccion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDireccions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDireccion> tipodireccionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDireccion> tipodireccionsRespaldo=null;
		
		classes=TipoDireccionConstantesFunciones.getClassesRelationshipsOfTipoDireccion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodireccionLogic.setDatosCliente(this.datosCliente);
		this.tipodireccionLogic.setDatosDeep(this.datosDeep);
		this.tipodireccionLogic.setIsConDeep(true);
		
		tipodireccionsRespaldo=this.tipodireccionLogic.getTipoDireccions();
		
		this.tipodireccionLogic.setTipoDireccions(tipodireccionsParaReportes);	
		this.tipodireccionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodireccionsParaReportes=this.tipodireccionLogic.getTipoDireccions();
		this.tipodireccionLogic.setTipoDireccions(tipodireccionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodireccion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDireccions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDireccion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDireccion tipodireccion : tipodireccionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDireccion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDireccionConstantesFunciones.generarExcelReporteDataTipoDireccion("NORMAL",row,workbook,tipodireccion,cellStyleDataAux);
		
			
			


				//Direccion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DireccionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodireccion.getDireccions()!=null && tipodireccion.getDireccions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DireccionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DireccionConstantesFunciones.generarExcelReporteHeaderDireccion("RELACIONADO",row,workbook);
				}

				if(tipodireccion.getDireccions()!=null) {
					i2=0;
					for(Direccion direccion : tipodireccion.getDireccions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DireccionConstantesFunciones.generarExcelReporteDataDireccion("RELACIONADO",row,workbook,direccion,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoDireccionConstantesFunciones.getTipoDireccionDescripcion(tipodireccion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDireccion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDireccion() throws Exception {		
		this.startProcessTipoDireccion(true);
	}
	
	public void startProcessTipoDireccion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDireccion ,this.jPanelParametrosReportesTipoDireccion, this.jScrollPanelDatosTipoDireccion,this.jPanelPaginacionTipoDireccion, this.jScrollPanelDatosEdicionTipoDireccion, this.jPanelAccionesTipoDireccion,this.jPanelAccionesFormularioTipoDireccion,this.jmenuBarTipoDireccion,this.jmenuBarDetalleTipoDireccion,this.jTtoolBarTipoDireccion,this.jTtoolBarDetalleTipoDireccion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDireccion=this.jTabbedPaneBusquedasTipoDireccion; 
		
		final JPanel jPanelParametrosReportesTipoDireccion=this.jPanelParametrosReportesTipoDireccion;
		//final JScrollPane jScrollPanelDatosTipoDireccion=this.jScrollPanelDatosTipoDireccion;
		final JTable jTableDatosTipoDireccion=this.jTableDatosTipoDireccion;		
		final JPanel jPanelPaginacionTipoDireccion=this.jPanelPaginacionTipoDireccion;
		//final JScrollPane jScrollPanelDatosEdicionTipoDireccion=this.jScrollPanelDatosEdicionTipoDireccion;
		final JPanel jPanelAccionesTipoDireccion=this.jPanelAccionesTipoDireccion;
		
		JPanel jPanelCamposAuxiliarTipoDireccion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDireccion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			jPanelCamposAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jPanelCamposTipoDireccion;
			jPanelAccionesFormularioAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jPanelAccionesFormularioTipoDireccion;
		}
		
		final JPanel jPanelCamposTipoDireccion=jPanelCamposAuxiliarTipoDireccion;
		final JPanel jPanelAccionesFormularioTipoDireccion=jPanelAccionesFormularioAuxiliarTipoDireccion;
		
		
		final JMenuBar jmenuBarTipoDireccion=this.jmenuBarTipoDireccion;
		final JToolBar jTtoolBarTipoDireccion=this.jTtoolBarTipoDireccion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDireccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDireccion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			jmenuBarDetalleAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jmenuBarDetalleTipoDireccion;
			jTtoolBarDetalleAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jTtoolBarDetalleTipoDireccion;
		}
		
		final JMenuBar jmenuBarDetalleTipoDireccion=jmenuBarDetalleAuxiliarTipoDireccion;
		final JToolBar jTtoolBarDetalleTipoDireccion=jTtoolBarDetalleAuxiliarTipoDireccion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDireccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDireccion;
			processRunnable.jTableDatos=jTableDatosTipoDireccion;
			processRunnable.jPanelCampos=jPanelCamposTipoDireccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDireccion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDireccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDireccion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDireccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDireccion;
			processRunnable.jTtoolBar=jTtoolBarTipoDireccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDireccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDireccion ,jPanelParametrosReportesTipoDireccion,jTableDatosTipoDireccion, /*jScrollPanelDatosTipoDireccion,*/jPanelCamposTipoDireccion,jPanelPaginacionTipoDireccion, /*jScrollPanelDatosEdicionTipoDireccion,*/ jPanelAccionesTipoDireccion,jPanelAccionesFormularioTipoDireccion,jmenuBarTipoDireccion,jmenuBarDetalleTipoDireccion,jTtoolBarTipoDireccion,jTtoolBarDetalleTipoDireccion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDireccion ,jPanelParametrosReportesTipoDireccion, jScrollPanelDatosTipoDireccion,jPanelPaginacionTipoDireccion, jScrollPanelDatosEdicionTipoDireccion, jPanelAccionesTipoDireccion,jPanelAccionesFormularioTipoDireccion,jmenuBarTipoDireccion,jmenuBarDetalleTipoDireccion,jTtoolBarTipoDireccion,jTtoolBarDetalleTipoDireccion);
						
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
	
	public void finishProcessTipoDireccion() {// throws Exception 
		this.finishProcessTipoDireccion(true);
	}
	
	public void finishProcessTipoDireccion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDireccion ,this.jPanelParametrosReportesTipoDireccion, this.jScrollPanelDatosTipoDireccion,this.jPanelPaginacionTipoDireccion, this.jScrollPanelDatosEdicionTipoDireccion, this.jPanelAccionesTipoDireccion,this.jPanelAccionesFormularioTipoDireccion,this.jmenuBarTipoDireccion,this.jmenuBarDetalleTipoDireccion,this.jTtoolBarTipoDireccion,this.jTtoolBarDetalleTipoDireccion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDireccion=this.jTabbedPaneBusquedasTipoDireccion; 
		
		final JPanel jPanelParametrosReportesTipoDireccion=this.jPanelParametrosReportesTipoDireccion;
		//final JScrollPane jScrollPanelDatosTipoDireccion=this.jScrollPanelDatosTipoDireccion;
		final JTable jTableDatosTipoDireccion=this.jTableDatosTipoDireccion;		
		final JPanel jPanelPaginacionTipoDireccion=this.jPanelPaginacionTipoDireccion;
		//final JScrollPane jScrollPanelDatosEdicionTipoDireccion=this.jScrollPanelDatosEdicionTipoDireccion;
		final JPanel jPanelAccionesTipoDireccion=this.jPanelAccionesTipoDireccion;
		
		JPanel jPanelCamposAuxiliarTipoDireccion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDireccion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			jPanelCamposAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jPanelCamposTipoDireccion;
			jPanelAccionesFormularioAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jPanelAccionesFormularioTipoDireccion;
		}
		
		final JPanel jPanelCamposTipoDireccion=jPanelCamposAuxiliarTipoDireccion;
		final JPanel jPanelAccionesFormularioTipoDireccion=jPanelAccionesFormularioAuxiliarTipoDireccion;
		
		
		final JMenuBar jmenuBarTipoDireccion=this.jmenuBarTipoDireccion;		
		final JToolBar jTtoolBarTipoDireccion=this.jTtoolBarTipoDireccion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDireccion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDireccion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			jmenuBarDetalleAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jmenuBarDetalleTipoDireccion;
			jTtoolBarDetalleAuxiliarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jTtoolBarDetalleTipoDireccion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDireccion=jmenuBarDetalleAuxiliarTipoDireccion;
		final JToolBar jTtoolBarDetalleTipoDireccion=jTtoolBarDetalleAuxiliarTipoDireccion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDireccion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDireccion;
			processRunnable.jTableDatos=jTableDatosTipoDireccion;
			processRunnable.jPanelCampos=jPanelCamposTipoDireccion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDireccion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDireccion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDireccion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDireccion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDireccion;
			processRunnable.jTtoolBar=jTtoolBarTipoDireccion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDireccion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDireccion ,jPanelParametrosReportesTipoDireccion, jTableDatosTipoDireccion,/*jScrollPanelDatosTipoDireccion,*/jPanelCamposTipoDireccion,jPanelPaginacionTipoDireccion, /*jScrollPanelDatosEdicionTipoDireccion,*/ jPanelAccionesTipoDireccion,jPanelAccionesFormularioTipoDireccion,jmenuBarTipoDireccion,jmenuBarDetalleTipoDireccion,jTtoolBarTipoDireccion,jTtoolBarDetalleTipoDireccion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDireccion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDireccion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDireccion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDireccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDireccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDireccion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDireccion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDireccion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDireccion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodireccionConstantesFunciones.getsFinalQueryTipoDireccion();
		String  finalQueryPaginacionTodos=this.tipodireccionConstantesFunciones.getsFinalQueryTipoDireccion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDireccionConstantesFunciones.getArrayColumnasGlobalesNoTipoDireccion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDireccionConstantesFunciones.getArrayColumnasGlobalesTipoDireccion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDireccionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodireccionsEliminados= new ArrayList<TipoDireccion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDireccion();
		
				///*TipoDireccionSessionBean*/this.tipodireccionSessionBean=new TipoDireccionSessionBean();
			
			if(this.tipodireccionSessionBean==null) {
				this.tipodireccionSessionBean=new TipoDireccionSessionBean();
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
					this.iNumeroPaginacion=TipoDireccionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDireccionConstantesFunciones.getClassesForeignKeysOfTipoDireccion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodireccion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodireccionsAux= new ArrayList<TipoDireccion>();
			
				
			tipodireccionLogic.setDatosCliente(this.datosCliente);
			tipodireccionLogic.setDatosDeep(this.datosDeep);
			tipodireccionLogic.setIsConDeep(true);
			
			
			tipodireccionLogic.getTipoDireccionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodireccionLogic.getTodosTipoDireccions(finalQueryGlobal,pagination);
					
					//tipodireccionLogic.getTodosTipoDireccionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodireccionLogic.getTipoDireccions()==null|| tipodireccionLogic.getTipoDireccions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodireccionsAux= new ArrayList<TipoDireccion>();
							tipodireccionsAux.addAll(tipodireccionLogic.getTipoDireccions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodireccionsAux= new ArrayList<TipoDireccion>();
							tipodireccionsAux.addAll(tipodireccions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodireccionLogic.getTodosTipoDireccions(finalQueryGlobal+"",this.pagination);												
							
							//tipodireccionLogic.getTodosTipoDireccionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDireccions("Todos",tipodireccionLogic.getTipoDireccions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodireccionLogic.setTipoDireccions(new ArrayList<TipoDireccion>());					
							tipodireccionLogic.getTipoDireccions().addAll(tipodireccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodireccions=new ArrayList<TipoDireccion>();
							tipodireccions.addAll(tipodireccionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDireccion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDireccion=this.idActual;
				
				} else if(this.idTipoDireccionActual!=null && this.idTipoDireccionActual!=0L) {
					idTipoDireccion=idTipoDireccionActual;
				}
				
					
				this.sDetalleReporte=TipoDireccionConstantesFunciones.getDetalleIndicePorId(idTipoDireccion);
				
				this.tipodireccions=new ArrayList<TipoDireccion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodireccionLogic.getEntity(idTipoDireccion);
					
					//tipodireccionLogic.getEntityWithConnection(idTipoDireccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodireccionLogic.setTipoDireccions(new ArrayList<TipoDireccion>());
					tipodireccionLogic.getTipoDireccions().add(tipodireccionLogic.getTipoDireccion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodireccions=new ArrayList<TipoDireccion>();
					this.tipodireccions.add(tipodireccion);
				}
				
				if(tipodireccionLogic.getTipoDireccion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodireccionLogic.getTipoDireccionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodireccionLogic.getTipoDireccions()==null||tipodireccionLogic.getTipoDireccions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodireccions==null|| tipodireccions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodireccionsAux=new ArrayList<TipoDireccion>();
						tipodireccionsAux.addAll(tipodireccionLogic.getTipoDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodireccionsAux=new ArrayList<TipoDireccion>();
							tipodireccionsAux.addAll(tipodireccions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodireccionLogic.getTipoDireccionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDireccionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDireccions("FK_IdEmpresa",tipodireccionLogic.getTipoDireccions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDireccions("FK_IdEmpresa",tipodireccions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodireccionLogic.setTipoDireccions(new ArrayList<TipoDireccion>());
						tipodireccionLogic.getTipoDireccions().addAll(tipodireccionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodireccions=new ArrayList<TipoDireccion>();
							tipodireccions.addAll(tipodireccionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDireccion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDireccion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodireccionLogic.getTipoDireccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodireccions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodireccionLogic.getTipoDireccions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodireccions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDireccion tipodireccion) {
		Boolean permite=true;
		
		if(this.tipodireccion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDireccionConstantesFunciones.getOrderByListaTipoDireccion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDireccionConstantesFunciones.getOrderByListaTipoDireccion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDireccion tipodireccion:tipodireccionLogic.getTipoDireccions()) {
				if(tipodireccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodireccionTotales=tipodireccion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDireccion tipodireccion:this.tipodireccions) {
				if(tipodireccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodireccionTotales=tipodireccion;
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
			this.tipodireccionAux=new TipoDireccion();
			this.tipodireccionAux.setsType(Constantes2.S_TOTALES);
			this.tipodireccionAux.setIsNew(false);
			this.tipodireccionAux.setIsChanged(false);
			this.tipodireccionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDireccionConstantesFunciones.TotalizarValoresFilaTipoDireccion(this.tipodireccionLogic.getTipoDireccions(),this.tipodireccionAux);
				
				this.tipodireccionLogic.getTipoDireccions().add(this.tipodireccionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDireccionConstantesFunciones.TotalizarValoresFilaTipoDireccion(this.tipodireccions,this.tipodireccionAux);
				
				this.tipodireccions.add(this.tipodireccionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodireccionTotales=new TipoDireccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodireccionLogic.getTipoDireccions().remove(tipodireccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodireccions.remove(tipodireccionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodireccionTotales=new TipoDireccion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDireccion tipodireccion:tipodireccionLogic.getTipoDireccions()) {
				if(tipodireccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodireccionTotales=tipodireccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDireccionConstantesFunciones.TotalizarValoresFilaTipoDireccion(this.tipodireccionLogic.getTipoDireccions(),tipodireccionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDireccion tipodireccion:this.tipodireccions) {
				if(tipodireccion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodireccionTotales=tipodireccion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDireccionConstantesFunciones.TotalizarValoresFilaTipoDireccion(this.tipodireccions,tipodireccionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDireccionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDireccionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodireccionLogic.getTipoDireccionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoDireccion() {
		this.isPermisoTodoTipoDireccion=false;
		this.isPermisoNuevoTipoDireccion=false;
		this.isPermisoActualizarTipoDireccion=false;
		this.isPermisoActualizarOriginalTipoDireccion=false;
		this.isPermisoEliminarTipoDireccion=false;
		this.isPermisoGuardarCambiosTipoDireccion=false;
		this.isPermisoConsultaTipoDireccion=false;
		this.isPermisoBusquedaTipoDireccion=false;
		this.isPermisoReporteTipoDireccion=false;		
		this.isPermisoOrdenTipoDireccion=false;		
		this.isPermisoPaginacionMedioTipoDireccion=false;		
		this.isPermisoPaginacionAltoTipoDireccion=false;
		this.isPermisoPaginacionTodoTipoDireccion=false;
		this.isPermisoCopiarTipoDireccion=false;		
		this.isPermisoVerFormTipoDireccion=false;		
		this.isPermisoDuplicarTipoDireccion=false;		
		this.isPermisoOrdenTipoDireccion=false;		
	}
	
	public void setPermisosUsuarioTipoDireccion(Boolean isPermiso) {
		this.isPermisoTodoTipoDireccion=isPermiso;
		this.isPermisoNuevoTipoDireccion=isPermiso;
		this.isPermisoActualizarTipoDireccion=isPermiso;
		this.isPermisoActualizarOriginalTipoDireccion=isPermiso;
		this.isPermisoEliminarTipoDireccion=isPermiso;
		this.isPermisoGuardarCambiosTipoDireccion=isPermiso;
		this.isPermisoConsultaTipoDireccion=isPermiso;
		this.isPermisoBusquedaTipoDireccion=isPermiso;
		this.isPermisoReporteTipoDireccion=isPermiso;
		this.isPermisoOrdenTipoDireccion=isPermiso;		
		this.isPermisoPaginacionMedioTipoDireccion=isPermiso;		
		this.isPermisoPaginacionAltoTipoDireccion=isPermiso;		
		this.isPermisoPaginacionTodoTipoDireccion=isPermiso;		
		this.isPermisoCopiarTipoDireccion=isPermiso;		
		this.isPermisoVerFormTipoDireccion=isPermiso;		
		this.isPermisoDuplicarTipoDireccion=isPermiso;
		this.isPermisoOrdenTipoDireccion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDireccion(Boolean isPermiso) {
		//this.isPermisoTodoTipoDireccion=isPermiso;
		this.isPermisoNuevoTipoDireccion=isPermiso;
		this.isPermisoActualizarTipoDireccion=isPermiso;
		this.isPermisoActualizarOriginalTipoDireccion=isPermiso;
		this.isPermisoEliminarTipoDireccion=isPermiso;
		this.isPermisoGuardarCambiosTipoDireccion=isPermiso;
		//this.isPermisoConsultaTipoDireccion=isPermiso;
		//this.isPermisoBusquedaTipoDireccion=isPermiso;
		//this.isPermisoReporteTipoDireccion=isPermiso;
		//this.isPermisoOrdenTipoDireccion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDireccion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDireccion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDireccion=isPermiso;		
		//this.isPermisoCopiarTipoDireccion=isPermiso;		
		//this.isPermisoDuplicarTipoDireccion=isPermiso;
		//this.isPermisoOrdenTipoDireccion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDireccionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DireccionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoDireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDireccion=false;
		this.isTienePermisosDireccion=this.verificarGetPermisosUsuarioOpcionTipoDireccionClaseRelacionada(this.opcionsRelacionadas,DireccionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDireccion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDireccionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDireccion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDireccionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDireccionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDireccionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDireccion && this.jInternalFrameDetalleFormTipoDireccion!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.remove(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoDireccion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDireccionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDireccion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDireccion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDireccion=this.isPermisoActualizarTipoDireccion;
			this.isPermisoEliminarTipoDireccion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDireccion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDireccion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDireccion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDireccion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDireccion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDireccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDireccion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDireccion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDireccion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDireccion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDireccion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDireccion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDireccion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDireccion.setToolTipText(this.jTableDatosTipoDireccion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDireccion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDireccion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDireccion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDireccion && this.tipodireccionConstantesFunciones.mostrarDireccionTipoDireccion && !TipoDireccionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Direccion");
			reporte.setsDescripcion("Direccion");
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
	public void inicializarCombosForeignKeyTipoDireccionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDireccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDireccionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDireccionListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoDireccionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDireccionParameterReturnGeneral tipodireccionReturnGeneral=new TipoDireccionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodireccionConstantesFunciones.cargarid_empresaTipoDireccion)
					 || (this.esRecargarFks && this.tipodireccionConstantesFunciones.cargarid_empresaTipoDireccion)) {

					if(!this.tipodireccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodireccionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodireccionReturnGeneral=tipodireccionLogic.cargarCombosLoteForeignKeyTipoDireccion(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodireccionReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDireccion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodireccionSessionBean==null) {
				this.tipodireccionSessionBean=new TipoDireccionSessionBean();
			}

			if(!this.tipodireccionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoDireccion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDireccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDireccion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDireccion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDireccion(TipoDireccion tipodireccion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDireccion(TipoDireccion tipodireccion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDireccion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDireccion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDireccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDireccion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDireccion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDireccion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDireccion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDireccion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion!=null && this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDireccionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDireccionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDireccionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodireccionSessionBean=new TipoDireccionSessionBean(); 
		this.tipodireccionConstantesFunciones=new TipoDireccionConstantesFunciones(); 
		this.tipodireccionBean=new TipoDireccion();//(this.tipodireccionConstantesFunciones); 		
		this.tipodireccionReturnGeneral=new TipoDireccionParameterReturnGeneral(); 
		
		this.tipodireccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodireccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDireccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDireccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDireccionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDireccion(true);
			
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
			
			this.tipodireccionConstantesFunciones=new TipoDireccionConstantesFunciones(); 
			this.tipodireccionBean=new TipoDireccion();//this.tipodireccionConstantesFunciones); 			
			this.tipodireccionReturnGeneral=new TipoDireccionParameterReturnGeneral(); 
		
			TipoDireccionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Direccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodireccion=new TipoDireccion();
			this.tipodireccions = new ArrayList<TipoDireccion>();
			this.tipodireccionsAux = new ArrayList<TipoDireccion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic=new TipoDireccionLogic();
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodireccionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodireccionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDireccion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDireccion);	
					}
					
					if(this.jInternalFrameImportacionTipoDireccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDireccion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDireccion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDireccion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDireccion);
				this.jInternalFrameDetalleFormTipoDireccion.setVisible(false);
				this.jInternalFrameDetalleFormTipoDireccion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDireccion);
					this.jInternalFrameReporteDinamicoTipoDireccion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDireccion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDireccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDireccion);
					this.jInternalFrameImportacionTipoDireccion.setVisible(false);
					this.jInternalFrameImportacionTipoDireccion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDireccion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDireccion);
					this.jInternalFrameOrderByTipoDireccion.setVisible(false);
					this.jInternalFrameOrderByTipoDireccion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDireccionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDireccionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodireccionReturnGeneral=new TipoDireccionParameterReturnGeneral();
			
			this.tipodireccionParameterGeneral=new TipoDireccionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodireccionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDireccionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DireccionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDireccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodireccionSessionBean.getEsGuardarRelacionado(),this.tipodireccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDireccionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodireccionSessionBean.getEsGuardarRelacionado(),this.tipodireccionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDireccion=false;
			this.isVisibilidadCeldaDuplicarTipoDireccion=true;
			this.isVisibilidadCeldaCopiarTipoDireccion=true;
			this.isVisibilidadCeldaVerFormTipoDireccion=true;
			this.isVisibilidadCeldaOrdenTipoDireccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
			this.isVisibilidadCeldaModificarTipoDireccion=false;
			this.isVisibilidadCeldaActualizarTipoDireccion=false;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
			this.isVisibilidadCeldaCancelarTipoDireccion=false;
			this.isVisibilidadCeldaGuardarTipoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDireccion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDireccion(false);
			
			this.setPermisosUsuarioTipoDireccion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodireccionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodireccionSessionBean.getEsGuardarRelacionado() && this.tipodireccionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDireccionClasesRelacionadas();
			}
			
			if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDireccionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDireccion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDireccion();
			}
			
			if(!this.isPermisoBusquedaTipoDireccion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDireccion,this.isPermisoPaginacionMedioTipoDireccion,this.isPermisoPaginacionTodoTipoDireccion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDireccionConstantesFunciones.getTiposSeleccionarTipoDireccion());
				
				this.tiposColumnasSelect=TipoDireccionConstantesFunciones.getTiposSeleccionarTipoDireccion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoDireccion();				
				//this.tiposRelacionesSelect=TipoDireccionConstantesFunciones.getTiposRelacionesTipoDireccion(true);
				
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
			//if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDireccion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDireccion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDireccion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDireccion() ;
			
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
			
			
			this.direccionLogic=new DireccionLogic(); 
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
				tipodireccionImplementable= (TipoDireccionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDireccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodireccionImplementableHome= (TipoDireccionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDireccionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodireccions= new ArrayList<TipoDireccion>();
			this.tipodireccionsEliminados= new ArrayList<TipoDireccion>();
						
			this.isEsNuevoTipoDireccion=false;
			this.esParaAccionDesdeFormularioTipoDireccion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDireccion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDireccion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoDireccionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDireccionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDireccion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDireccion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDireccion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDireccion();
			}
			
			TipoDireccionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDireccion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDireccion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDireccion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDireccion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDireccion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDireccion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DireccionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DireccionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDireccion")) {
				iIndex=this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();	
				
				

				if(sTitle.equals("Direcciones")) {
					if(!DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDireccion();

						this.cargarParteTabPanelRelacionadaDireccion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDireccion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDireccion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDireccion.cargarSessionConBeanSwingJInternalFrameDireccion(false,true,iIndex);
		this.jButtonDireccionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDireccion();

		//this.jTabbedPaneRelacionesTipoDireccion.updateUI();
		//this.jTabbedPaneRelacionesTipoDireccion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDireccion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Direccion")) {
				int row=this.jTableDatosTipoDireccion.getSelectedRow();
				jButtonDireccionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Direccion")) {

					if(this.isTienePermisosDireccion && this.tipodireccionConstantesFunciones.mostrarDireccionTipoDireccion && !TipoDireccionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Direcciones"+"("+DireccionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Direcciones");

						if(tipodireccionConstantesFunciones.resaltarDireccionTipoDireccion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodireccionConstantesFunciones.resaltarDireccionTipoDireccion);
						}

						jmenuItem.setEnabled(this.tipodireccionConstantesFunciones.activarDireccionTipoDireccion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Direccion"));

						

						this.jInternalFrameDetalleFormTipoDireccion.jmenuDetalleTipoDireccion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoDireccion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDireccion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDireccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDireccionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDireccion();
		
		this.cargarCombosFrameForeignKeyTipoDireccion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDireccion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDireccion();
		}
	}
	
	
	
	public void jButtonNuevoTipoDireccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
			
			if(jTableDatosTipoDireccion.getRowCount()>=1) {
				jTableDatosTipoDireccion.removeRowSelectionInterval(0, jTableDatosTipoDireccion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDireccion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDireccion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDireccion(true);			
			//this.tipodireccion=new TipoDireccion();
			//this.tipodireccion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDireccion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDireccion() ;
			
			if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDireccion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodireccion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);				
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
			if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDireccion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDireccionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDireccion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDireccion.getSelectedRows().length;			
			}
			
			tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDireccion--;			
				//TipoDireccion tipodireccionAux= new TipoDireccion();			
				//tipodireccionAux.setId(this.iIdNuevoTipoDireccion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDireccion tipodireccionOrigen=new TipoDireccion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDireccion tipodireccionOrigen : tipodireccionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodireccionOrigen =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodireccionOrigen =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDireccion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodireccion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDireccion(tipodireccionOrigen,this.tipodireccion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodireccionLogic.getTipoDireccions().add(this.tipodireccionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodireccions.add(this.tipodireccionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDireccion(false);
				
				this.jTableDatosTipoDireccion.setRowSelectionInterval(this.getIndiceNuevoTipoDireccion(), this.getIndiceNuevoTipoDireccion());
				
				int iLastRow =  this.jTableDatosTipoDireccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDireccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDireccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDireccion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();									
		
			TipoDireccion tipodireccionOrigen=new TipoDireccion();
			TipoDireccion tipodireccionDestino=new TipoDireccion();
				
			tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDireccion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodireccionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDireccion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodireccionOrigen =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodireccionOrigen =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodireccionDestino =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodireccionDestino =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodireccionOrigen =tipodireccionsSeleccionados.get(0);
				tipodireccionDestino =tipodireccionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDireccion(tipodireccionOrigen,tipodireccionDestino,true,false);
				
				tipodireccionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodireccionDestino,tipodireccionLogic.getTipoDireccions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodireccionDestino,tipodireccions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDireccion(false);
				
				//this.jTableDatosTipoDireccion.setRowSelectionInterval(this.getIndiceNuevoTipoDireccion(), this.getIndiceNuevoTipoDireccion());
				
				int iLastRow =  this.jTableDatosTipoDireccion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDireccion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDireccion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDireccion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDireccion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDireccion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDireccion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDireccion.setVisible(!isVisible);
			this.jPanelPaginacionTipoDireccion.setVisible(!isVisible);
			this.jPanelAccionesTipoDireccion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDireccion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDireccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDireccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDireccion();
			
			this.abrirFrameOrderByTipoDireccion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDireccion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDireccion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDireccion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDireccion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDireccion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDireccion.setSize(this.jInternalFrameDetalleFormTipoDireccion.iWidthFormulario,this.jInternalFrameDetalleFormTipoDireccion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDireccion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDireccion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDireccion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDireccion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDireccion.jContentPaneDetalleTipoDireccion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDireccion.jContentPaneDetalleTipoDireccion.getWidth(),TipoDireccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDireccion.jContentPaneDetalleTipoDireccion.getWidth(),TipoDireccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDireccion.jContentPaneDetalleTipoDireccion.getWidth(),TipoDireccionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDireccion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDireccion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDireccion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDireccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDireccion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDireccion,false,this);
				} else {
					this.jInternalFrameOrderByTipoDireccion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDireccion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDireccion);
				this.jInternalFrameOrderByTipoDireccion.setVisible(false);
				this.jInternalFrameOrderByTipoDireccion.setSelected(false);
				
				this.jInternalFrameOrderByTipoDireccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDireccion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDireccion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDireccion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDireccion==null) {
				
				this.jInternalFrameImportacionTipoDireccion=new ImportacionJInternalFrame(TipoDireccionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDireccion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDireccion);
				this.jInternalFrameImportacionTipoDireccion.setVisible(false);
				this.jInternalFrameImportacionTipoDireccion.setSelected(false);


				this.jInternalFrameImportacionTipoDireccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDireccion"));
				this.jInternalFrameImportacionTipoDireccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDireccion"));
				this.jInternalFrameImportacionTipoDireccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDireccion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDireccion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDireccion==null) {
				this.jInternalFrameReporteDinamicoTipoDireccion=new ReporteDinamicoJInternalFrame(TipoDireccionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDireccion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDireccion);
				this.jInternalFrameReporteDinamicoTipoDireccion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDireccion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDireccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDireccion"));
				this.jInternalFrameReporteDinamicoTipoDireccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDireccion"));
				this.jInternalFrameReporteDinamicoTipoDireccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDireccion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDireccion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDireccion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDireccion.jContentPaneDetalleTipoDireccion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoDireccion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDireccion);
			
	       	this.jInternalFrameDetalleFormTipoDireccion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDireccion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDireccion.dispose();
			//this.jInternalFrameDetalleFormTipoDireccion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDireccion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDireccion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDireccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDireccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDireccion.setVisible(true);
	        this.jInternalFrameImportacionTipoDireccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDireccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDireccion.setVisible(true);
	        this.jInternalFrameOrderByTipoDireccion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDireccion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDireccion.setVisible(false);
	        this.jInternalFrameOrderByTipoDireccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDireccion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDireccion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDireccion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDireccion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDireccion.setVisible(false);
	        this.jInternalFrameImportacionTipoDireccion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDireccion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDireccion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDireccion(true);
			//this.isEsNuevoTipoDireccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDireccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDireccion(false) ;
			
			if(tipodireccionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionSessionBean.getEsGuardarRelacionado() && DireccionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDireccionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDireccion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDireccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDireccionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDireccion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDireccion(true);
			//this.isEsNuevoTipoDireccion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodireccion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDireccion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDireccion(false) ;
			
			if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDireccion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDireccion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDireccion(false);
			
			//if(!this.isEsNuevoTipoDireccion) {								
				int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
				
			}
			
			if(this.permiteMantenimiento(this.tipodireccion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDireccion=true;
					this.inicializarActualizarBindingTablaTipoDireccion(false);
					this.isEsNuevoTipoDireccion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDireccion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDireccion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDireccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDireccion(false);
				
				this.habilitarDeshabilitarControlesTipoDireccion(false);
			
												
				
				if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDireccion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDireccionActionPerformed(evt,tipodireccionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDireccion(this.tipodireccion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDireccion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodireccionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodireccion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDireccionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				this.tipodireccion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				this.tipodireccion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodireccion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDireccionModel) this.jTableDatosTipoDireccion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDireccion=true;
				this.inicializarActualizarBindingTablaTipoDireccion(false);
				this.isEsNuevoTipoDireccion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDireccion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDireccion(false);
				
				this.habilitarDeshabilitarControlesTipoDireccion(false);
				
				
				
				if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDireccion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDireccionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDireccion.getRowCount()>=1) {
				jTableDatosTipoDireccion.removeRowSelectionInterval(0, jTableDatosTipoDireccion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDireccion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDireccion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDireccion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDireccion(false) ;
			
			this.isEsNuevoTipoDireccion=false;
			
			if(TipoDireccionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDireccion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDireccion(false);
				
				//SI ES MANUAL
				if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDireccion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDireccion--;			
			//TipoDireccion tipodireccionAux= new TipoDireccion();			
			//tipodireccionAux.setId(this.iIdNuevoTipoDireccion);
			
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDireccion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
			
			this.tipodireccion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodireccionLogic.getTipoDireccions().add(this.tipodireccionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodireccions.add(this.tipodireccionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDireccion(false);
			
			this.jTableDatosTipoDireccion.setRowSelectionInterval(this.getIndiceNuevoTipoDireccion(), this.getIndiceNuevoTipoDireccion());
			
			int iLastRow =  this.jTableDatosTipoDireccion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDireccion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDireccion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDireccion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDireccion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDireccion(false);
			
			//SI ES MANUAL
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDireccion();
			}
			
			//this.abrirFrameTreeTipoDireccion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo DireccionES ?", "MANTENIMIENTO DE Tipo Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDireccion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDireccion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodireccionReturnGeneral=tipodireccionLogic.procesarImportacionTipoDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodireccionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDireccionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDireccion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDireccion.setFileImportacion(this.jInternalFrameImportacionTipoDireccion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDireccion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDireccion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDireccion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDireccion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		

		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDireccionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDireccionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDireccions("Todos",tipodireccionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDireccionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDireccionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDireccionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDireccion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDireccionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDireccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDireccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDireccionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDireccionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDireccionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDireccionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDireccionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDireccionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDireccionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodireccion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDireccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDireccionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDireccion tipodireccion:tipodireccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodireccion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDireccionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDireccion tipodireccion:tipodireccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodireccion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDireccionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDireccion tipodireccion:tipodireccionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodireccion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDireccion(row);				
			//	iRow++;
			//}				
			
			//for(TipoDireccion tipodireccionAux:tipodireccionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDireccion(tipodireccionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDireccion(false);
			
			//SI ES MANUAL
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDireccion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDireccion(false);
			
			//SI ES MANUAL
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDireccion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDireccionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDireccion(false);
			
			//SI ES MANUAL
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDireccion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDireccion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDireccion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDireccion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDireccion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDireccion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDireccion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDireccion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDireccion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDireccion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDireccion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDireccion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDireccion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDireccion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDireccion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDireccion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDireccion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDireccion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDireccion();
		
		this.inicializarActualizarBindingBotonesManualTipoDireccion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDireccion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDireccion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDireccion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDireccion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDireccion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDireccion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDireccion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDireccion.jCheckBoxPostAccionNuevoTipoDireccion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDireccion.jCheckBoxPostAccionSinCerrarTipoDireccion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDireccion.jCheckBoxPostAccionSinMensajeTipoDireccion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDireccion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDireccion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDireccion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
				this.jInternalFrameDetalleFormTipoDireccion.jCheckBoxPostAccionNuevoTipoDireccion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDireccion.jCheckBoxPostAccionSinCerrarTipoDireccion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDireccion.jCheckBoxPostAccionSinMensajeTipoDireccion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDireccion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDireccion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDireccion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDireccion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDireccion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDireccion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDireccion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDireccion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDireccion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDireccion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDireccion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDireccion() throws Exception {
		try	{
			if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDireccion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDireccion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDireccion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDireccion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDireccion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDireccion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDireccion.addItem(reporte);
			}
			
			
			if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDireccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDireccion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDireccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDireccion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDireccion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDireccion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDireccion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDireccion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDireccion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
				this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
				this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDireccion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDireccion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDireccion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDireccion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDireccion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDireccion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDireccion(Boolean esInicializar) throws Exception {				
		if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDireccion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDireccion() throws Exception {
		this.inicializarActualizarBindingTablaTipoDireccion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDireccion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDireccionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDireccion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodireccionLogic.getTipoDireccions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodireccions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDireccion.setModel(new TipoDireccionModel(this.tipodireccionLogic.getTipoDireccions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDireccion.setModel(new TipoDireccionModel(this.tipodireccions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDireccion!=null && this.jInternalFrameOrderByTipoDireccion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDireccion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO,tipodireccionConstantesFunciones.resaltarSeleccionarTipoDireccion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDireccionConstantesFunciones.SCLASSWEBTITULO,tipodireccionConstantesFunciones.resaltarSeleccionarTipoDireccion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccion,TipoDireccionConstantesFunciones.LABEL_ID));

		if(this.tipodireccionConstantesFunciones.mostraridTipoDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDireccionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodireccionConstantesFunciones.resaltaridTipoDireccion,this.tipodireccionConstantesFunciones.activaridTipoDireccion,this,true,"idTipoDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodireccionConstantesFunciones.resaltaridTipoDireccion,this.tipodireccionConstantesFunciones.activaridTipoDireccion,this,true,"idTipoDireccion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccion,TipoDireccionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodireccionConstantesFunciones.mostrarid_empresaTipoDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDireccionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodireccionConstantesFunciones.resaltarid_empresaTipoDireccion,this,this.tipodireccionConstantesFunciones.activarid_empresaTipoDireccion));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodireccionConstantesFunciones.resaltarid_empresaTipoDireccion,this,this.tipodireccionConstantesFunciones.activarid_empresaTipoDireccion,false,"id_empresaTipoDireccion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccion,TipoDireccionConstantesFunciones.LABEL_CODIGO));

		if(this.tipodireccionConstantesFunciones.mostrarcodigoTipoDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDireccionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodireccionConstantesFunciones.resaltarcodigoTipoDireccion,this.tipodireccionConstantesFunciones.activarcodigoTipoDireccion,this,true,"codigoTipoDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodireccionConstantesFunciones.resaltarcodigoTipoDireccion,this.tipodireccionConstantesFunciones.activarcodigoTipoDireccion,this,true,"codigoTipoDireccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccion,TipoDireccionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodireccionConstantesFunciones.mostrarnombreTipoDireccion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDireccionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodireccionConstantesFunciones.resaltarnombreTipoDireccion,this.tipodireccionConstantesFunciones.activarnombreTipoDireccion,this,true,"nombreTipoDireccion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodireccionConstantesFunciones.resaltarnombreTipoDireccion,this.tipodireccionConstantesFunciones.activarnombreTipoDireccion,this,true,"nombreTipoDireccion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDireccionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDireccion && this.tipodireccionConstantesFunciones.mostrarDireccionTipoDireccion && !TipoDireccionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Direcciones");
				tableColumn.setHeaderValue("Direcciones");
				tableColumn.setCellRenderer(new DireccionTableCell(tipodireccionConstantesFunciones.resaltarDireccionTipoDireccion,this,this.tipodireccionConstantesFunciones.activarDireccionTipoDireccion));
				tableColumn.setCellEditor(new DireccionTableCell(tipodireccionConstantesFunciones.resaltarDireccionTipoDireccion,this,this.tipodireccionConstantesFunciones.activarDireccionTipoDireccion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDireccion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodireccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodireccionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDireccion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodireccionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodireccionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDireccion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodireccionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodireccionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDireccion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipodireccionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoDireccion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDireccion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodireccionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDireccion.moveColumn(this.jTableDatosTipoDireccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDireccion.moveColumn(this.jTableDatosTipoDireccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodireccionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoDireccion.moveColumn(this.jTableDatosTipoDireccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDireccion.moveColumn(this.jTableDatosTipoDireccion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDireccion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDireccion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDireccion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDireccion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDireccion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDireccion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDireccion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDireccion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodireccionLogic.getTipoDireccions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodireccions.size()-1;
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
		//this.jTableDatosTipoDireccion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDireccion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDireccion();
			
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
				
				//this.isEsNuevoTipoDireccion=false;
					
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
				if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDireccion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDireccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDireccion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodireccion.getsType().equals("DUPLICADO")
				   || this.tipodireccion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDireccion=true;
				
				} else {
					this.isEsNuevoTipoDireccion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodireccion.getId()>=0 && !this.tipodireccion.getIsNew()) {						
						this.isEsNuevoTipoDireccion=false;
						
					} else {
						this.isEsNuevoTipoDireccion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDireccion(esRelaciones);						
				
				this.seleccionarTipoDireccion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodireccion.getId()<0) {
					this.isEsNuevoTipoDireccion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDireccion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDireccion(evt,rowIndex);
				}	
				
				if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDireccion: " + this.dDif); 
					}
				}								
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDireccion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodireccion)) {
					if(this.tipodireccion.getId()>0) {
						this.tipodireccion.setIsDeleted(true);
						
						this.tipodireccionsEliminados.add(this.tipodireccion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodireccionLogic.getTipoDireccions().remove(this.tipodireccion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodireccions.remove(this.tipodireccion);				
					}
					
					
					((TipoDireccionModel) this.jTableDatosTipoDireccion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDireccion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDireccion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDireccion) {
			
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDireccion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDireccion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDireccion(this.tipodireccion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodireccionConstantesFunciones.cargarid_empresaTipoDireccion || this.tipodireccionConstantesFunciones.event_dependid_empresaTipoDireccion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodireccion.getid_empresa());
									//this.inicializarActualizarBindingTipoDireccion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodireccion.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodireccion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodireccion.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDireccion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDireccion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDireccion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDireccion(TipoDireccion tipodireccion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDireccion(tipodireccion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDireccion(TipoDireccion tipodireccion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDireccion(tipodireccion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDireccion(tipodireccion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDireccion(tipodireccion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDireccion(TipoDireccion tipodireccion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.setText(tipodireccion.getId().toString());
			this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.setText(tipodireccion.getcodigo());
			this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.setText(tipodireccion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDireccion tipodireccionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodireccionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDireccion tipodireccionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodireccionLocal=this.tipodireccion;
			} else {
				tipodireccionLocal=this.tipodireccionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodireccionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDireccion(tipodireccionLocal,true);
					
					if(tipodireccionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodireccionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodireccionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDireccion(TipoDireccion tipodireccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDireccion(tipodireccion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(tipodireccion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDireccion(TipoDireccion tipodireccion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDireccion(tipodireccion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDireccion(TipoDireccion tipodireccion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.getText()==null || this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.getText()=="" || this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.setText("0");
			}

			if(conColumnasBase) {tipodireccion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDireccionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDireccion.jLabelIdTipoDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodireccion.setcodigo(this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDireccionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDireccion.jLabelcodigoTipoDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodireccion.setnombre(this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDireccionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDireccion.jLabelnombreTipoDireccion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDireccion(TipoDireccion tipodireccionBean,TipoDireccion tipodireccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDireccion(TipoDireccion tipodireccionOrigen,TipoDireccion tipodireccion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodireccionOrigen.getId()!=null && !tipodireccionOrigen.getId().equals(0L))) {tipodireccion.setId(tipodireccionOrigen.getId());}}
			if(conDefault || (!conDefault && tipodireccionOrigen.getcodigo()!=null && !tipodireccionOrigen.getcodigo().equals(""))) {tipodireccion.setcodigo(tipodireccionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodireccionOrigen.getnombre()!=null && !tipodireccionOrigen.getnombre().equals(""))) {tipodireccion.setnombre(tipodireccionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDireccion(TipoDireccion tipodireccion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.setText(tipodireccion.getId().toString());
			this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.setText(tipodireccion.getcodigo());
			this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.setText(tipodireccion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDireccion(TipoDireccionBean tipodireccionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.setText(tipodireccionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.setText(tipodireccionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.setText(tipodireccionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDireccion(TipoDireccionParameterReturnGeneral tipodireccionReturnGeneral,TipoDireccionBean tipodireccionBean,Boolean conDefault) throws Exception { 
		try {
			TipoDireccion tipodireccionLocal=new TipoDireccion();
			
			tipodireccionLocal=tipodireccionReturnGeneral.getTipoDireccion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodireccionLocal.getId()!=null && !tipodireccionLocal.getId().equals(0L))) {tipodireccionBean.setId(tipodireccionLocal.getId());}}
			if(conDefault || (!conDefault && tipodireccionLocal.getcodigo()!=null && !tipodireccionLocal.getcodigo().equals(""))) {tipodireccionBean.setcodigo(tipodireccionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodireccionLocal.getnombre()!=null && !tipodireccionLocal.getnombre().equals(""))) {tipodireccionBean.setnombre(tipodireccionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDireccionGenerico(Long idTipoDireccionSeleccionado,JComboBox jComboBoxTipoDireccion,List<TipoDireccion> tipodireccionsLocal)throws Exception {
		try {
			TipoDireccion  tipodireccionTemp=null;

			for(TipoDireccion tipodireccionAux:tipodireccionsLocal) {
				if(tipodireccionAux.getId()!=null && tipodireccionAux.getId().equals(idTipoDireccionSeleccionado)) {
					tipodireccionTemp=tipodireccionAux;
					break;
				}
			}

			jComboBoxTipoDireccion.setSelectedItem(tipodireccionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDireccionGenerico(JComboBox jComboBoxTipoDireccion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDireccion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDireccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDireccion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDireccion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDireccion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDireccion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Direccion")) {
			jButtonDireccionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodireccion=(TipoDireccion) tipodireccionLogic.getTipoDireccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodireccion =(TipoDireccion) tipodireccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodireccion.getIsNew() && !tipodireccion.getIsChanged() && !tipodireccion.getIsDeleted()) {
				sDescripcion=tipodireccion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodireccion.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDireccion tipodireccionRow=new TipoDireccion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodireccionRow=(TipoDireccion) tipodireccionLogic.getTipoDireccions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodireccionRow=(TipoDireccion) tipodireccions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDireccionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDireccion tipodireccion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDireccion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodireccion = (TipoDireccion)this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodireccion = (TipoDireccion)this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodireccion!=null) {
						this.tipodireccion = tipodireccion;
					} else {
						this.tipodireccion = new TipoDireccion();
					}
				}

				if(this.isTienePermisosDireccion && this.permiteMantenimiento(this.tipodireccion)) {
					DireccionBeanSwingJInternalFrame direccionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFramePopup=new DireccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						direccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFramePopup;
					} else {
						direccionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame;
					}

					List<TipoDireccion> tipodireccions=new ArrayList<TipoDireccion>();
					tipodireccions.add(this.tipodireccion);
					if(!esRelacionado) {
						//direccionBeanSwingJInternalFrame.direccionSessionBean.setConGuardarRelaciones(false);
						//direccionBeanSwingJInternalFrame.direccionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					direccionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDireccion.cargarDireccionBeanSwingJInternalFrame(tipodireccions,this.tipodireccion,direccionBeanSwingJInternalFrame,/*conInicializar,*/direccionBeanSwingJInternalFrame.direccionSessionBean.getConGuardarRelaciones(),direccionBeanSwingJInternalFrame.direccionSessionBean.getEsGuardarRelacionado());
					direccionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						direccionBeanSwingJInternalFrame.actualizarEstadoPanelsDireccion("no_relacionado");

						direccionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DireccionConstantesFunciones.ITAMANIOFILATABLA + (DireccionConstantesFunciones.ITAMANIOFILATABLA/2));

						direccionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDireccion=(TitledBorder)this.jScrollPanelDatosTipoDireccion.getBorder();
						TitledBorder titledBorderDireccion=(TitledBorder)direccionBeanSwingJInternalFrame.jScrollPanelDatosDireccion.getBorder();

						titledBorderDireccion.setTitle(titledBorderTipoDireccion.getTitle() + " -> Direccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,direccionBeanSwingJInternalFrame);
						}

						direccionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(direccionBeanSwingJInternalFrame);

						direccionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodireccionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Direccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDireccion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoTipoDireccion && this.isPermisoNuevoTipoDireccion));			
			this.jButtonDuplicarTipoDireccion.setVisible((this.isVisibilidadCeldaDuplicarTipoDireccion && this.isPermisoDuplicarTipoDireccion));			
			this.jButtonCopiarTipoDireccion.setVisible((this.isVisibilidadCeldaCopiarTipoDireccion && this.isPermisoCopiarTipoDireccion));
			this.jButtonVerFormTipoDireccion.setVisible((this.isVisibilidadCeldaVerFormTipoDireccion && this.isPermisoVerFormTipoDireccion));
			
			this.jButtonAbrirOrderByTipoDireccion.setVisible((this.isVisibilidadCeldaOrdenTipoDireccion && this.isPermisoOrdenTipoDireccion));			
			
			this.jButtonNuevoRelacionesTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDireccion && this.isPermisoNuevoTipoDireccion));			
			this.jButtonNuevoGuardarCambiosTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoTipoDireccion && this.isPermisoNuevoTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));
			
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarTipoDireccion.setVisible((this.isVisibilidadCeldaModificarTipoDireccion && this.isPermisoActualizarTipoDireccion));	
			this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarTipoDireccion.setVisible((this.isVisibilidadCeldaActualizarTipoDireccion && this.isPermisoActualizarTipoDireccion));	
			this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarTipoDireccion.setVisible((this.isVisibilidadCeldaEliminarTipoDireccion && this.isPermisoEliminarTipoDireccion));
			this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarTipoDireccion.setVisible(this.isVisibilidadCeldaCancelarTipoDireccion);							
			this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.setVisible((this.isVisibilidadCeldaGuardarTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDireccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoTipoDireccion && this.isPermisoNuevoTipoDireccion));						
			this.jButtonDuplicarToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaDuplicarTipoDireccion && this.isPermisoDuplicarTipoDireccion));						
			this.jButtonCopiarToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaCopiarTipoDireccion && this.isPermisoCopiarTipoDireccion));			
			this.jButtonVerFormToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaVerFormTipoDireccion && this.isPermisoVerFormTipoDireccion));			
			this.jButtonAbrirOrderByToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaOrdenTipoDireccion && this.isPermisoOrdenTipoDireccion));
			this.jButtonNuevoRelacionesToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDireccion && this.isPermisoNuevoTipoDireccion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoTipoDireccion && this.isPermisoNuevoTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));			
			
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaModificarTipoDireccion && this.isPermisoActualizarTipoDireccion));	
			this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaActualizarTipoDireccion  && this.isPermisoActualizarTipoDireccion));	
			this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaEliminarTipoDireccion && this.isPermisoEliminarTipoDireccion));
			this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarToolBarTipoDireccion.setVisible(this.isVisibilidadCeldaCancelarTipoDireccion);				
			this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaGuardarTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDireccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoTipoDireccion && this.isPermisoNuevoTipoDireccion));			
			this.jMenuItemDuplicarTipoDireccion.setVisible((this.isVisibilidadCeldaDuplicarTipoDireccion && this.isPermisoDuplicarTipoDireccion));			
			this.jMenuItemCopiarTipoDireccion.setVisible((this.isVisibilidadCeldaCopiarTipoDireccion && this.isPermisoCopiarTipoDireccion));			
			this.jMenuItemVerFormTipoDireccion.setVisible((this.isVisibilidadCeldaVerFormTipoDireccion && this.isPermisoVerFormTipoDireccion));			
			this.jMenuItemAbrirOrderByTipoDireccion.setVisible((this.isVisibilidadCeldaOrdenTipoDireccion && this.isPermisoOrdenTipoDireccion));			
			//this.jMenuItemMostrarOcultarTipoDireccion.setVisible((this.isVisibilidadCeldaOrdenTipoDireccion && this.isPermisoOrdenTipoDireccion));
			this.jMenuItemDetalleAbrirOrderByTipoDireccion.setVisible((this.isVisibilidadCeldaOrdenTipoDireccion && this.isPermisoOrdenTipoDireccion));			
			//this.jMenuItemDetalleMostrarOcultarTipoDireccion.setVisible((this.isVisibilidadCeldaOrdenTipoDireccion && this.isPermisoOrdenTipoDireccion));			
			this.jMenuItemNuevoRelacionesTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDireccion && this.isPermisoNuevoTipoDireccion));			
			this.jMenuItemNuevoGuardarCambiosTipoDireccion.setVisible((this.isVisibilidadCeldaNuevoTipoDireccion && this.isPermisoNuevoTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));									
			
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemModificarTipoDireccion.setVisible((this.isVisibilidadCeldaModificarTipoDireccion && this.isPermisoActualizarTipoDireccion));	
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemActualizarTipoDireccion.setVisible((this.isVisibilidadCeldaActualizarTipoDireccion && this.isPermisoActualizarTipoDireccion));	
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemEliminarTipoDireccion.setVisible((this.isVisibilidadCeldaEliminarTipoDireccion && this.isPermisoEliminarTipoDireccion));
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemCancelarTipoDireccion.setVisible(this.isVisibilidadCeldaCancelarTipoDireccion);				
			}
			
			this.jMenuItemGuardarCambiosTipoDireccion.setVisible((this.isVisibilidadCeldaGuardarTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));						
			this.jMenuItemGuardarCambiosTablaTipoDireccion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDireccion=this.jButtonNuevoTipoDireccion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDireccion=this.jButtonDuplicarTipoDireccion.isVisible();
			this.isVisibilidadCeldaCopiarTipoDireccion=this.jButtonCopiarTipoDireccion.isVisible();
			this.isVisibilidadCeldaVerFormTipoDireccion=this.jButtonVerFormTipoDireccion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDireccion=this.jButtonAbrirOrderByTipoDireccion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=this.jButtonNuevoRelacionesTipoDireccion.isVisible();
			this.isVisibilidadCeldaModificarTipoDireccion=this.jButtonModificarTipoDireccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.isVisibilidadCeldaActualizarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarTipoDireccion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarTipoDireccion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarTipoDireccion.isVisible();
			this.isVisibilidadCeldaGuardarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=this.jButtonGuardarCambiosTablaTipoDireccion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDireccion=this.jButtonNuevoToolBarTipoDireccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=this.jButtonNuevoRelacionesToolBarTipoDireccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.isVisibilidadCeldaModificarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarToolBarTipoDireccion.isVisible();
			this.isVisibilidadCeldaActualizarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarToolBarTipoDireccion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarToolBarTipoDireccion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarToolBarTipoDireccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDireccion=this.jButtonGuardarCambiosToolBarTipoDireccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=this.jButtonGuardarCambiosTablaToolBarTipoDireccion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDireccion=this.jMenuItemNuevoTipoDireccion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=this.jMenuItemNuevoRelacionesTipoDireccion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.isVisibilidadCeldaModificarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jMenuItemModificarTipoDireccion.isVisible();
			this.isVisibilidadCeldaActualizarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jMenuItemActualizarTipoDireccion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jMenuItemEliminarTipoDireccion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDireccion=this.jInternalFrameDetalleFormTipoDireccion.jMenuItemCancelarTipoDireccion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDireccion=this.jMenuItemGuardarCambiosTipoDireccion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=this.jMenuItemGuardarCambiosTablaTipoDireccion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDireccion(Boolean esInicializar) {
		if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDireccion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDireccion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDireccion() {
		this.jButtonNuevoTipoDireccion.setVisible(this.isPermisoNuevoTipoDireccion);			
		this.jButtonDuplicarTipoDireccion.setVisible(this.isPermisoDuplicarTipoDireccion);			
		this.jButtonCopiarTipoDireccion.setVisible(this.isPermisoCopiarTipoDireccion);			
		this.jButtonVerFormTipoDireccion.setVisible(this.isPermisoVerFormTipoDireccion);			
		
		this.jButtonAbrirOrderByTipoDireccion.setVisible(this.isPermisoOrdenTipoDireccion);					
		
		this.jButtonNuevoRelacionesTipoDireccion.setVisible(this.isPermisoNuevoTipoDireccion);			
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarTipoDireccion.setVisible(this.isPermisoActualizarTipoDireccion);	
			this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarTipoDireccion.setVisible(this.isPermisoActualizarTipoDireccion);	
			this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarTipoDireccion.setVisible(this.isPermisoEliminarTipoDireccion);
			this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarTipoDireccion.setVisible(this.isVisibilidadCeldaCancelarTipoDireccion);						
			this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.setVisible(this.isPermisoGuardarCambiosTipoDireccion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDireccion.setVisible(this.isPermisoActualizarTipoDireccion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDireccion() {
		this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarTipoDireccion.setVisible(this.isPermisoActualizarTipoDireccion);	
		this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarTipoDireccion.setVisible(this.isPermisoActualizarTipoDireccion);	
		this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarTipoDireccion.setVisible(this.isPermisoEliminarTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarTipoDireccion.setVisible(this.isVisibilidadCeldaCancelarTipoDireccion);							
		this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.setVisible((this.isVisibilidadCeldaGuardarTipoDireccion && this.isPermisoGuardarCambiosTipoDireccion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDireccion() {
		if(TipoDireccionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDireccion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDireccion() {
	}
	
	public void jTableDatosTipoDireccionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDireccion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDireccion(this.gettipodireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodireccion==null) {
						this.tipodireccion = new TipoDireccion();
					}

					this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
				}

				if(this.tipodireccion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodireccion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDireccionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDireccion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDireccion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDireccion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDireccion(this.gettipodireccion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodireccionLogic.getConnexion());

				if(this.tipodireccion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodireccion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDireccion=(TitledBorder)this.jScrollPanelDatosTipoDireccion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDireccion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDireccion(this.gettipodireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodireccion==null) {
						this.tipodireccion = new TipoDireccion();
					}

					this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
				}

				if(this.tipodireccion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodireccion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDireccion(this.gettipodireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodireccion==null) {
						this.tipodireccion = new TipoDireccion();
					}

					this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
				}

				if(this.tipodireccion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodireccion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDireccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDireccion(this.gettipodireccion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodireccion==null) {
						this.tipodireccion = new TipoDireccion();
					}

					this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);
				}

				if(this.tipodireccion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodireccion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDireccion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoDireccionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDireccion(false,false);

			this.getTipoDireccionsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDireccion(false);

			//if(TipoDireccionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDireccion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodireccionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDireccion() {
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
			this.jInternalFrameDetalleFormTipoDireccion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDireccion.dispose();
			this.jInternalFrameDetalleFormTipoDireccion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
			this.jInternalFrameReporteDinamicoTipoDireccion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDireccion.dispose();
			this.jInternalFrameReporteDinamicoTipoDireccion=null;
		}
		
		if(this.jInternalFrameImportacionTipoDireccion!=null) {
			this.jInternalFrameImportacionTipoDireccion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDireccion.dispose();
			this.jInternalFrameImportacionTipoDireccion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDireccion();
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDireccion")) {
				jButtonDuplicarTipoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDireccion")) {
				jButtonCopiarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDireccion")) {
				jButtonVerFormTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDireccion")) {
				jButtonDuplicarTipoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDireccion")) {
				jButtonDuplicarTipoDireccionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDireccion")) {
				jButtonModificarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDireccion")) {
				jButtonModificarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDireccion")) {
				jButtonModificarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDireccion")) {
				jButtonActualizarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDireccion")) {
				jButtonActualizarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDireccion")) {
				jButtonActualizarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDireccion")) {
				jButtonEliminarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDireccion")) {
				jButtonEliminarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDireccion")) {
				jButtonEliminarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDireccion")) {
				jButtonCancelarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDireccion")) {
				jButtonCancelarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDireccion")) {
				jButtonCancelarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDireccion")) {
				jButtonCerrarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDireccion")) {
				jButtonCerrarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDireccion")) {
				jButtonCerrarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDireccion")) {
				jButtonMostrarOcultarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDireccion")) {
				jButtonCancelarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDireccion")) {
				jButtonCopiarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDireccion")) {
				jButtonVerFormTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDireccion")) {
				jButtonCopiarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDireccion")) {
				jButtonVerFormTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDireccion")) {
				jButtonRecargarInformacionTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDireccion")) {
				jButtonRecargarInformacionTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDireccion")) {
				jButtonRecargarInformacionTipoDireccionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDireccion")) {
				jButtonAnterioresTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDireccion")) {
				jButtonAnterioresTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDireccion")) {
				jButtonAnterioresTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDireccion")) {
				jButtonSiguientesTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDireccion")) {
				jButtonSiguientesTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDireccion")) {
				jButtonSiguientesTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDireccion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDireccion")) {
				jButtonAbrirOrderByTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDireccion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDireccion")) {
				jButtonMostrarOcultarTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDireccion")) {
				jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDireccion")) {
				jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDireccion")) {
				jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDireccion")) {
				jButtonCerrarReporteDinamicoTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDireccion")) {
				jButtonGenerarReporteDinamicoTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDireccion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDireccion")) {
				jButtonCerrarImportacionTipoDireccionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDireccion")) {
				
				jButtonGenerarImportacionTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDireccion")) {
				
				jButtonAbrirImportacionTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDireccion")) {
				jComboBoxTiposAccionesTipoDireccionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDireccion")) {
				jComboBoxTiposRelacionesTipoDireccionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDireccion")) {
				jComboBoxTiposAccionesTipoDireccionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDireccion")) {
				
				jComboBoxTiposSeleccionarTipoDireccionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDireccion")) {
				jTextFieldValorCampoGeneralTipoDireccionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDireccion")) {
				jButtonAbrirOrderByTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDireccion")) {
				jButtonAbrirOrderByTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDireccion")) {
				jButtonCerrarOrderByTipoDireccionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDireccionBusqueda")) {
				this.jButtonidTipoDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDireccionUpdate")) {
				this.jButtonid_empresaTipoDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDireccionBusqueda")) {
				this.jButtonid_empresaTipoDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDireccionBusqueda")) {
				this.jButtoncodigoTipoDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDireccionBusqueda")) {
				this.jButtonnombreTipoDireccionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDireccion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDireccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDireccion tipodireccionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodireccionLocal=this.tipodireccion;
			} else {
				tipodireccionLocal=this.tipodireccionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
							
				
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
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
			
			


			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDireccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
								
						
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
								
				
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
							
				
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDireccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodireccionAnterior =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodireccionAnterior =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
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
			
			


			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
								
				
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDireccionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDireccion")) {
					jCheckBoxSeleccionarTodosTipoDireccionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDireccion")) {
					jCheckBoxSeleccionadosTipoDireccionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDireccion")) {
					
				}
				
				


				
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
												
				
				


				
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDireccionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodireccionAnterior =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodireccionAnterior =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDireccionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
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
			
			


			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDireccionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodireccion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodireccion);
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
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
				
				


				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDireccion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDireccion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDireccionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodireccionAnterior =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDireccion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDireccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDireccion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodireccion =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodireccion =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodireccion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDireccion")) {
				
				}
				
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDireccion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDireccion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDireccion")) {
			
			}
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDireccion();
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDireccion")) {
				jButtonDuplicarTipoDireccionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDireccion")) {
				jButtonCopiarTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDireccion")) {
				jButtonVerFormTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDireccion")) {
				jButtonNuevoTipoDireccionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDireccion")) {
				jButtonModificarTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDireccion")) {
				jButtonActualizarTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDireccion")) {
				jButtonEliminarTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDireccion")) {
				jButtonCancelarTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDireccion")) {
				jButtonCerrarTipoDireccionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDireccion")) {
				jButtonGuardarCambiosTipoDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDireccion")) {
				jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDireccion")) {
				jButtonAbrirOrderByTipoDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDireccion")) {
				jButtonRecargarInformacionTipoDireccionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDireccion")) {
				jButtonAnterioresTipoDireccionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDireccion")) {
				jButtonSiguientesTipoDireccionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDireccionBusqueda")) {
				this.jButtonidTipoDireccionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDireccionUpdate")) {
				this.jButtonid_empresaTipoDireccionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDireccionBusqueda")) {
				this.jButtonid_empresaTipoDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDireccionBusqueda")) {
				this.jButtoncodigoTipoDireccionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDireccionBusqueda")) {
				this.jButtonnombreTipoDireccionBusquedaActionPerformed(evt);
			}
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDireccion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDireccion")) {
				closingInternalFrameTipoDireccion();
				
			} else if(sTipo.equals("jButtonCancelarTipoDireccion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDireccion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDireccionBeanSwingJInternalFrame jInternalFrameParent=(TipoDireccionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDireccion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDireccionActionPerformed(null);
			}
			
			TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodireccion,new Object(),this.tipodireccionParameterGeneral,this.tipodireccionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDireccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDireccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDireccion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodireccion)) {
			if(!esControlTabla) {
				if(TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);			
				}
				
				if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDireccion(this.tipodireccion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodireccionReturnGeneral=tipodireccionLogic.procesarEventosTipoDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodireccionLogic.getTipoDireccions(),this.tipodireccion,this.tipodireccionParameterGeneral,this.isEsNuevoTipoDireccion,classes);//this.tipodireccionLogic.getTipoDireccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDireccion(this.tipodireccionReturnGeneral,this.tipodireccionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDireccion(classes,this.tipodireccionReturnGeneral,this.tipodireccionBean,false);
					}
						
					if(this.tipodireccionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDireccion(this.tipodireccionReturnGeneral.getTipoDireccion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDireccion(this.tipodireccionReturnGeneral.getTipoDireccion());	
					}
						
					if(this.tipodireccionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDireccion(this.tipodireccionReturnGeneral.getTipoDireccion(),classes);//this.tipodireccionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDireccion(this.tipodireccion,classes);//this.tipodireccionBean);									
				}
			
				if(TipoDireccionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDireccion(this.tipodireccion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDireccion(this.tipodireccion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodireccionAnterior!=null) {
						this.tipodireccion=this.tipodireccionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodireccionReturnGeneral=tipodireccionLogic.procesarEventosTipoDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodireccionLogic.getTipoDireccions(),this.tipodireccion,this.tipodireccionParameterGeneral,this.isEsNuevoTipoDireccion,classes);//this.tipodireccionLogic.getTipoDireccion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodireccionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodireccionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodireccionReturnGeneral.getTipoDireccion(),tipodireccionLogic.getTipoDireccions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodireccionReturnGeneral.getTipoDireccion(),this.tipodireccions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDireccion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDireccion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDireccion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDireccion() throws Exception {
		
		TipoDireccionModel tipodireccionModel=(TipoDireccionModel)this.jTableDatosTipoDireccion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodireccionModel.tipodireccions=this.tipodireccionLogic.getTipoDireccions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodireccionModel.tipodireccions=this.tipodireccions;
		}
		
		
		((TipoDireccionModel) this.jTableDatosTipoDireccion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDireccion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodireccionAnterior(),this.tipodireccionLogic.getTipoDireccions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodireccionAnterior(),this.tipodireccions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDireccion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDireccion(TipoDireccion tipodireccion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Direccion.class)) {
					this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(tipodireccion.getDireccions());
					this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDireccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
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
										
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodireccion,new Object(),generalEntityParameterGeneral,this.tipodireccionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodireccionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDireccionConstantesFunciones.getClassesRelationshipsOfTipoDireccion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDireccionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDireccion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDireccion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDireccionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodireccion,new Object(),generalEntityParameterGeneral,this.tipodireccionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDireccion(TipoDireccionBean tipodireccionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Direccion.class)) {
					this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.setDireccions(tipodireccion.getDireccions());
					this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDireccion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDireccion(ArrayList<Classe> classes,TipoDireccionReturnGeneral tipodireccionReturnGeneral,TipoDireccionBean tipodireccionBean,Boolean conDefault) throws Exception {
		
			this.tipodireccionBean.setDireccions(tipodireccionReturnGeneral.getTipoDireccion().getDireccions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDireccion(TipoDireccion tipodireccion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Direccion.class)) {
					tipodireccion.setDireccions(this.jInternalFrameDetalleFormTipoDireccion.direccionBeanSwingJInternalFrame.direccionLogic.getDireccions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipodireccion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDireccion = new TipoDireccionDetalleFormJInternalFrame(jDesktopPane,this.tipodireccionSessionBean.getConGuardarRelaciones(),this.tipodireccionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.setVisible(false);
		this.jInternalFrameDetalleFormTipoDireccion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDireccion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDireccion.tipodireccionLogic=this.tipodireccionLogic;
		
		this.cargarCombosFrameForeignKeyTipoDireccion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDireccion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDireccion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDireccion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDireccion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDireccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDireccion"));
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarTipoDireccion.addActionListener(new ButtonActionListener(this,"ModificarTipoDireccion"));

		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarToolBarTipoDireccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDireccion"));
					
		this.jInternalFrameDetalleFormTipoDireccion.jMenuItemModificarTipoDireccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarTipoDireccion.addActionListener (new ButtonActionListener(this,"ActualizarTipoDireccion"));
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarToolBarTipoDireccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDireccion"));
						
		this.jInternalFrameDetalleFormTipoDireccion.jMenuItemActualizarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarTipoDireccion.addActionListener (new ButtonActionListener(this,"EliminarTipoDireccion"));
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDireccion"));
								
		this.jInternalFrameDetalleFormTipoDireccion.jMenuItemEliminarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarTipoDireccion.addActionListener (new ButtonActionListener(this,"CancelarTipoDireccion"));
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDireccion"));
					
		this.jInternalFrameDetalleFormTipoDireccion.jMenuItemCancelarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDireccion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jMenuItemDetalleCerrarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDireccion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDireccion"));
		
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDireccion"));
		
		
		
		this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDireccion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonidTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDireccion.jButtonid_empresaTipoDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonid_empresaTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtoncodigoTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonnombreTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDireccionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDireccion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDireccion"));
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDireccion"));
		}
		
		this.jTableDatosTipoDireccion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDireccion"));
		
		this.jTableDatosTipoDireccion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDireccion"));
		
		this.jButtonNuevoTipoDireccion.addActionListener(new ButtonActionListener(this,"NuevoTipoDireccion"));
		
		this.jButtonDuplicarTipoDireccion.addActionListener(new ButtonActionListener(this,"DuplicarTipoDireccion"));
		
		this.jButtonCopiarTipoDireccion.addActionListener(new ButtonActionListener(this,"CopiarTipoDireccion"));
		
		this.jButtonVerFormTipoDireccion.addActionListener(new ButtonActionListener(this,"VerFormTipoDireccion"));
		
		
		this.jButtonNuevoToolBarTipoDireccion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDireccion"));
			
		this.jButtonDuplicarToolBarTipoDireccion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDireccion"));
			
		this.jMenuItemNuevoTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDireccion"));
			
		this.jMenuItemDuplicarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDireccion"));		
		
		
		this.jButtonNuevoRelacionesTipoDireccion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDireccion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDireccion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDireccion"));
			
		this.jMenuItemNuevoRelacionesTipoDireccion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDireccion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarTipoDireccion.addActionListener(new ButtonActionListener(this,"ModificarTipoDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonModificarToolBarTipoDireccion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDireccion"));
			
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemModificarTipoDireccion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarTipoDireccion.addActionListener (new ButtonActionListener(this,"ActualizarTipoDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonActualizarToolBarTipoDireccion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDireccion"));
				
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemActualizarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarTipoDireccion.addActionListener (new ButtonActionListener(this,"EliminarTipoDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonEliminarToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDireccion"));
						
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemEliminarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarTipoDireccion.addActionListener (new ButtonActionListener(this,"CancelarTipoDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonCancelarToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDireccion"));
			
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemCancelarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDireccion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDireccion"));		
		
		
		this.jButtonCerrarTipoDireccion.addActionListener (new ButtonActionListener(this,"CerrarTipoDireccion"));
		
		
		this.jButtonCerrarToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDireccion"));
			
		this.jMenuItemCerrarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDireccion"));
			
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jMenuItemDetalleCerrarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDireccion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDireccion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDireccion"));
		}
		
		this.jButtonCopiarToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDireccion"));
			
		this.jButtonVerFormToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDireccion"));
		
		this.jMenuItemGuardarCambiosTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDireccion"));
			
		this.jMenuItemCopiarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDireccion"));		
		
		this.jMenuItemVerFormTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDireccion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDireccion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDireccion"));
			
		this.jMenuItemGuardarCambiosTablaTipoDireccion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDireccion"));		
		
		
		
		this.jButtonRecargarInformacionTipoDireccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDireccion"));
					
		this.jButtonRecargarInformacionToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDireccion"));
		
		this.jMenuItemRecargarInformacionTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDireccion"));		
		
		
		
		this.jButtonAnterioresTipoDireccion.addActionListener (new ButtonActionListener(this,"AnterioresTipoDireccion"));
		
		
		this.jButtonAnterioresToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDireccion"));
		
		this.jMenuItemAnterioresTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDireccion"));		
		
		
		this.jButtonSiguientesTipoDireccion.addActionListener (new ButtonActionListener(this,"SiguientesTipoDireccion"));
		
		
		this.jButtonSiguientesToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDireccion"));
			
		this.jMenuItemSiguientesTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDireccion"));
			
		this.jMenuItemAbrirOrderByTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDireccion"));
			
		this.jMenuItemMostrarOcultarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDireccion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDireccion"));
			
		this.jMenuItemDetalleMostarOcultarTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDireccion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDireccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDireccion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDireccion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDireccion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDireccion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDireccion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDireccion"));

		this.jCheckBoxSeleccionadosTipoDireccion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDireccion"));
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDireccion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDireccion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDireccion"));
			
		this.jComboBoxTiposAccionesTipoDireccion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDireccion"));
					
		this.jComboBoxTiposSeleccionarTipoDireccion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDireccion"));
			
		this.jTextFieldValorCampoGeneralTipoDireccion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDireccion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonidTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDireccion.jButtonid_empresaTipoDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonid_empresaTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtoncodigoTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonnombreTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDireccionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDireccion!=null) {
				this.jInternalFrameReporteDinamicoTipoDireccion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDireccion"));
				this.jInternalFrameReporteDinamicoTipoDireccion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDireccion"));
				this.jInternalFrameReporteDinamicoTipoDireccion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDireccion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDireccion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDireccion"));				
			//this.jButtonGenerarReporteDinamicoTipoDireccion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDireccion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDireccion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDireccion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDireccion!=null) {
				this.jInternalFrameImportacionTipoDireccion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDireccion"));
				this.jInternalFrameImportacionTipoDireccion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDireccion"));
				this.jInternalFrameImportacionTipoDireccion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDireccion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDireccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDireccion"));
			
			this.jButtonAbrirOrderByToolBarTipoDireccion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDireccion"));			
			
			if(this.jInternalFrameOrderByTipoDireccion!=null) {
				this.jInternalFrameOrderByTipoDireccion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDireccion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDireccion.jTabbedPaneRelacionesTipoDireccion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDireccion"));
		
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
            		closingInternalFrameTipoDireccion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDireccion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDireccion = (JInternalFrameBase)event.getSource();
	            	
	            TipoDireccionBeanSwingJInternalFrame jInternalFrameParent=(TipoDireccionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDireccion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDireccionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDireccion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDireccionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDireccion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDireccion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDireccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDireccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDireccionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDireccion";
		inputMap = this.jButtonNuevoTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDireccionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDireccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDireccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDireccionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDireccion";
		inputMap = this.jButtonNuevoRelacionesTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDireccionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDireccion";
		inputMap = this.jButtonModificarTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDireccion";
		inputMap = this.jButtonActualizarTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDireccion";
		inputMap = this.jButtonEliminarTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDireccion";
		inputMap = this.jButtonCancelarTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDireccion";
		inputMap = this.jButtonCerrarTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDireccion";
		inputMap = this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDireccion.jButtonGuardarCambiosTipoDireccion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDireccionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDireccion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDireccionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDireccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDireccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDireccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDireccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDireccion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDireccionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonidTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDireccionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDireccion.jButtonid_empresaTipoDireccionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDireccionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonid_empresaTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtoncodigoTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDireccionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDireccion.jButtonnombreTipoDireccionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDireccionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDireccion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDireccionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDireccionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDireccion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDireccion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
					tipodireccionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDireccion tipodireccionAux:tipodireccions) {
					tipodireccionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDireccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDireccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
						tipodireccionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDireccion tipodireccionAux:tipodireccions) {
						tipodireccionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDireccion tipodireccionAux:tipodireccions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDireccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDireccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDireccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDireccionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDireccion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDireccion.getSelectedRows();
			
			TipoDireccion tipodireccionLocal=new TipoDireccion();
			
			//this.seleccionarTodosTipoDireccion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodireccionLocal =(TipoDireccion) this.tipodireccionLogic.getTipoDireccions().toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodireccionLocal =(TipoDireccion) this.tipodireccions.toArray()[this.jTableDatosTipoDireccion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodireccionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
						tipodireccionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDireccion tipodireccionAux:tipodireccions) {
						tipodireccionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDireccion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDireccion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDireccion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDireccion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDireccionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDireccionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDireccionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDireccion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDireccion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDireccion tipodireccionAux:this.tipodireccionLogic.getTipoDireccions()) {
				
						if(sTipoSeleccionar.equals(TipoDireccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodireccionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDireccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodireccionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDireccion tipodireccionAux:tipodireccions) {
					
						if(sTipoSeleccionar.equals(TipoDireccionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodireccionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDireccionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodireccionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDireccion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDireccionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDireccion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDireccion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDireccion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDireccion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDireccion(conSplash);
				
					this.generarReporteTipoDireccionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDireccionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDireccionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDireccionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDireccion();
				
				this.exportarTipoDireccionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDireccions();
				//this.importarTipoDireccions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDireccion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDireccionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDireccion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDireccion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDireccion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoDireccionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoDireccion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoDireccion(conSplash);
					
						//this.actualizarParametrosGeneralTipoDireccion();
						
						this.generarReporteProcesoAccionTipoDireccionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoDireccionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo DireccionES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Direccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoDireccion();
				
						this.actualizarParametrosGeneralTipoDireccion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipodireccionReturnGeneral=tipodireccionLogic.procesarAccionTipoDireccionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipodireccionLogic.getTipoDireccions(),this.tipodireccionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoDireccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDireccion();
					
					TipoDireccionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoDireccionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoDireccion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoDireccion.jComboBoxTiposAccionesFormularioTipoDireccion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDireccion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDireccionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDireccion();
			
			if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
			TipoDireccion tipodireccion=new TipoDireccion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDireccion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDireccion.getSelectedItem();
			
			
			
			
			tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodireccionsSeleccionados.size()==1) {
				for(TipoDireccion tipodireccionAux:tipodireccionsSeleccionados) {
					tipodireccion=tipodireccionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Direccion")) {
					jButtonDireccionActionPerformed(null,rowIndex,true,false,tipodireccion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDireccion();
			
      		//this.finishProcessTipoDireccion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDireccionReturnGeneral() throws Exception {
		if(this.tipodireccionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodireccionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodireccionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodireccionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodireccionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodireccionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDireccion(false);
		}
		
		if(this.tipodireccionReturnGeneral.getConRetornoLista() || this.tipodireccionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodireccionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodireccionLogic.setTipoDireccions(this.tipodireccionReturnGeneral.getTipoDireccions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodireccionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodireccionLogic.setTipoDireccion(this.tipodireccionReturnGeneral.getTipoDireccion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDireccion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDireccion() throws Exception {
		
		
	}
	
	public ArrayList<TipoDireccion> getTipoDireccionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDireccion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDireccion tipodireccionAux:tipodireccionLogic.getTipoDireccions()) {
					if(tipodireccionAux.getIsSelected()) {
						tipodireccionsSeleccionados.add(tipodireccionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDireccion tipodireccionAux:this.tipodireccions) {
					if(tipodireccionAux.getIsSelected()) {
						tipodireccionsSeleccionados.add(tipodireccionAux);				
					}
				}
			}
			
			if(tipodireccionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodireccionsSeleccionados.addAll(this.tipodireccionLogic.getTipoDireccions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodireccionsSeleccionados.addAll(this.tipodireccions);				
					}
				}
			}
		} else {
			tipodireccionsSeleccionados.add(this.tipodireccion);
		}
		
		return tipodireccionsSeleccionados;
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
	
	public void generarReporteTipoDireccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDireccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDireccionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDireccionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDireccionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoDireccionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Direccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDireccionsSeleccionados() throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDireccions("Todos",tipodireccionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDireccionsSeleccionados() throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDireccions("Todos",tipodireccionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDireccionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDireccions("Todos",tipodireccionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDireccionsSeleccionados() throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDireccion();
		
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDireccion();
		
		
		//this.generarReporteTipoDireccions("Todos",tipodireccionsSeleccionados ,tipodireccionImplementable,tipodireccionImplementableHome);
	}
	
	public void mostrarImportacionTipoDireccions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDireccion();
		
		this.abrirFrameImportacionTipoDireccion();		
		
			
		//this.generarReporteTipoDireccions("Todos",tipodireccionsSeleccionados ,tipodireccionImplementable,tipodireccionImplementableHome);
	}
	
	public void importarTipoDireccions() throws Exception {		
	
	}
	
	public void exportarTipoDireccionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDireccionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDireccionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDireccionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Direccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDireccionsSeleccionados() throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodireccion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDireccion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDireccion tipodireccionAux:tipodireccionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDireccion(tipodireccionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodireccionAux.setsDetalleGeneralEntityReporte(tipodireccionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDireccion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDireccionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDireccionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDireccionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDireccionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDireccionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDireccion(TipoDireccion tipodireccion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodireccion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodireccion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodireccion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodireccion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodireccion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDireccionsSeleccionados() throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodireccion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDireccions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDireccion(row);				
				iRow++;
			}				
			
			for(TipoDireccion tipodireccionAux:tipodireccionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDireccion(tipodireccionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDireccionsSeleccionados() throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();		
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodireccion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodireccions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodireccion");
			//elementRoot.appendChild(element);
		
			for(TipoDireccion tipodireccionAux:tipodireccionsSeleccionados) {
				element = document.createElement("tipodireccion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDireccion(tipodireccionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Direccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDireccion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDireccionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDireccion(TipoDireccion tipodireccion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodireccion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodireccion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodireccion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodireccion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDireccion(TipoDireccion tipodireccion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDireccionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodireccion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDireccionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodireccion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDireccionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodireccion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoDireccionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodireccion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDireccionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodireccion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDireccionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDireccion> tipodireccionsSeleccionados=new ArrayList<TipoDireccion>();
		
		tipodireccionsSeleccionados=this.getTipoDireccionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDireccion(tipodireccionsSeleccionados);
		
		this.generarReporteTipoDireccions("Todos",tipodireccionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDireccion(ArrayList<TipoDireccion> tipodireccionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDireccion tipodireccionAux:tipodireccionsSeleccionados) {
				tipodireccionAux.setsDetalleGeneralEntityReporte(tipodireccionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDireccionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodireccionAux.setsDescripcionGeneralEntityReporte1(tipodireccionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDireccionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodireccionAux.setsDescripcionGeneralEntityReporte1(tipodireccionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDireccionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodireccionAux.setsDescripcionGeneralEntityReporte1(tipodireccionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDireccionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDireccion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDireccion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDireccion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDireccion=false;
			this.isVisibilidadCeldaActualizarTipoDireccion=false;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
			this.isVisibilidadCeldaCancelarTipoDireccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
			this.isVisibilidadCeldaModificarTipoDireccion=false;
			this.isVisibilidadCeldaActualizarTipoDireccion=true;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
			this.isVisibilidadCeldaCancelarTipoDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
			this.isVisibilidadCeldaModificarTipoDireccion=false;
			this.isVisibilidadCeldaActualizarTipoDireccion=true;
			this.isVisibilidadCeldaEliminarTipoDireccion=true;
			this.isVisibilidadCeldaCancelarTipoDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
			this.isVisibilidadCeldaModificarTipoDireccion=false;
			this.isVisibilidadCeldaActualizarTipoDireccion=true;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
			this.isVisibilidadCeldaCancelarTipoDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDireccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=true;
			this.isVisibilidadCeldaModificarTipoDireccion=false;
			this.isVisibilidadCeldaActualizarTipoDireccion=false;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
			this.isVisibilidadCeldaCancelarTipoDireccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDireccion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
			this.isVisibilidadCeldaActualizarTipoDireccion=false;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
			this.isVisibilidadCeldaCancelarTipoDireccion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDireccion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
			this.isVisibilidadCeldaModificarTipoDireccion=true;
			this.isVisibilidadCeldaActualizarTipoDireccion=false;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
			this.isVisibilidadCeldaCancelarTipoDireccion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDireccion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDireccionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDireccion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=true;
		} else {
			this.actualizarEstadoPanelsTipoDireccion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDireccion=false;
			//this.isVisibilidadCeldaVerFormTipoDireccion=false;
			this.isVisibilidadCeldaDuplicarTipoDireccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodireccionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDireccion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodireccionSessionBean.getEsGuardarRelacionado()) {
			if(!tipodireccionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;												
			}
			
			this.jButtonCerrarTipoDireccion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDireccion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodireccion)) {
			this.isVisibilidadCeldaActualizarTipoDireccion=false;
			this.isVisibilidadCeldaEliminarTipoDireccion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDireccion() {
		this.isVisibilidadCeldaNuevoTipoDireccion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoDireccion=false;
	}
	
	public void actualizarEstadoPanelsTipoDireccion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDireccion!=null) {
				this.jScrollPanelDatosEdicionTipoDireccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDireccion!=null) {
				this.jScrollPanelDatosTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDireccion!=null) {
				this.jPanelPaginacionTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDireccion!=null) {
				this.jScrollPanelDatosEdicionTipoDireccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDireccion!=null) {
				this.jScrollPanelDatosTipoDireccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDireccion!=null) {
				this.jPanelPaginacionTipoDireccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDireccion!=null) {
				this.jScrollPanelDatosEdicionTipoDireccion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDireccion!=null) {
				this.jScrollPanelDatosTipoDireccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDireccion!=null) {
				this.jPanelPaginacionTipoDireccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDireccion!=null) {
				this.jScrollPanelDatosEdicionTipoDireccion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDireccion!=null) {
				this.jScrollPanelDatosTipoDireccion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDireccion!=null) {
				this.jPanelPaginacionTipoDireccion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDireccion!=null) {
				this.jScrollPanelDatosEdicionTipoDireccion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDireccion!=null) {
				this.jScrollPanelDatosTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDireccion!=null) {
				this.jPanelPaginacionTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDireccion!=null) {
				this.jScrollPanelDatosEdicionTipoDireccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDireccion!=null) {
				this.jScrollPanelDatosTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDireccion!=null) {
				this.jPanelPaginacionTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDireccion!=null) {
				this.jScrollPanelDatosEdicionTipoDireccion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDireccion!=null) {
				this.jScrollPanelDatosTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDireccion!=null) {
				this.jPanelPaginacionTipoDireccion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
					this.jTabbedPaneBusquedasTipoDireccion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodireccionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDireccion!=null) {
				this.jTabbedPaneBusquedasTipoDireccion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDireccion!=null) {
				this.jPanelParametrosReportesTipoDireccion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoDireccionParaDirecciones() throws Exception {
		Boolean isPaginaPopupDireccion=false;

		try {

			if(this.tipodireccionSessionBean==null) {
				this.tipodireccionSessionBean=new TipoDireccionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean=new DireccionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.setsPathNavegacionActual(tipodireccionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DireccionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDireccion=this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDireccion(false);
			this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDireccion(TipoDireccionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoDireccion(true);
			this.jInternalFrameDetalleFormTipoDireccion.direccionSessionBean.setlidTipoDireccionActual(this.idTipoDireccionActual);

			tipodireccionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDireccion(true);
			tipodireccionSessionBean.setlIdTipoDireccionActualForeignKey(this.idTipoDireccionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDireccionSessionBean tipodireccionSessionBean=new TipoDireccionSessionBean();
		
		if(this.tipodireccionSessionBean==null) {
			this.tipodireccionSessionBean=new TipoDireccionSessionBean();
		}
		
		this.tipodireccionSessionBean.setsUltimaBusquedaTipoDireccion(this.getsAccionBusqueda());
		this.tipodireccionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodireccionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodireccionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDireccionSessionBean tipodireccionSessionBean=new TipoDireccionSessionBean();
		
		if(this.tipodireccionSessionBean==null) {
			this.tipodireccionSessionBean=new TipoDireccionSessionBean();
		}
		
		if(this.tipodireccionSessionBean.getsUltimaBusquedaTipoDireccion()!=null&&!this.tipodireccionSessionBean.getsUltimaBusquedaTipoDireccion().equals("")) {
			this.setsAccionBusqueda(tipodireccionSessionBean.getsUltimaBusquedaTipoDireccion());
			this.setiNumeroPaginacion(tipodireccionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodireccionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodireccionSessionBean.getid_empresa());
				tipodireccionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipodireccionSessionBean.setsUltimaBusquedaTipoDireccion("");
		this.tipodireccionSessionBean.setiNumeroPaginacion(TipoDireccionConstantesFunciones.INUMEROPAGINACION);
		this.tipodireccionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDireccion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDireccion() {
		this.updateBorderResaltarBusquedasFormularioTipoDireccion();
		this.updateVisibilidadBusquedasFormularioTipoDireccion();
		this.updateHabilitarBusquedasFormularioTipoDireccion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDireccion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDireccion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDireccion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDireccion.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDireccion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDireccion.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDireccion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoDireccion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDireccion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDireccion();
		this.updateVisibilidadResaltarControlesFormularioTipoDireccion();
		this.updateHabilitarResaltarControlesFormularioTipoDireccion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDireccion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodireccionConstantesFunciones.resaltaridTipoDireccion!=null && this.jInternalFrameDetalleFormTipoDireccion!=null) {this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.setBorder(this.tipodireccionConstantesFunciones.resaltaridTipoDireccion);}
		if(this.tipodireccionConstantesFunciones.resaltarid_empresaTipoDireccion!=null && this.jInternalFrameDetalleFormTipoDireccion!=null) {this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setBorder(this.tipodireccionConstantesFunciones.resaltarid_empresaTipoDireccion);}
		if(this.tipodireccionConstantesFunciones.resaltarcodigoTipoDireccion!=null && this.jInternalFrameDetalleFormTipoDireccion!=null) {this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.setBorder(this.tipodireccionConstantesFunciones.resaltarcodigoTipoDireccion);}
		if(this.tipodireccionConstantesFunciones.resaltarnombreTipoDireccion!=null && this.jInternalFrameDetalleFormTipoDireccion!=null) {this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.setBorder(this.tipodireccionConstantesFunciones.resaltarnombreTipoDireccion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDireccion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
	
		//this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostraridTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jPanelidTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostraridTipoDireccion);
		//this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostrarid_empresaTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jPanelid_empresaTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostrarid_empresaTipoDireccion);
		//this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostrarcodigoTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jPanelcodigoTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostrarcodigoTipoDireccion);
		//this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostrarnombreTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jPanelnombreTipoDireccion.setVisible(this.tipodireccionConstantesFunciones.mostrarnombreTipoDireccion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDireccion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDireccion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDireccion!=null) {
	
		this.jInternalFrameDetalleFormTipoDireccion.jLabelidTipoDireccion.setEnabled(this.tipodireccionConstantesFunciones.activaridTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jComboBoxid_empresaTipoDireccion.setEnabled(this.tipodireccionConstantesFunciones.activarid_empresaTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jTextFieldcodigoTipoDireccion.setEnabled(this.tipodireccionConstantesFunciones.activarcodigoTipoDireccion);
		this.jInternalFrameDetalleFormTipoDireccion.jTextAreanombreTipoDireccion.setEnabled(this.tipodireccionConstantesFunciones.activarnombreTipoDireccion);
		}
	}
	
		
}