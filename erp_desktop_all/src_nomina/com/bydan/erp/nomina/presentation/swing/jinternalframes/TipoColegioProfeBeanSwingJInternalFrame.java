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

import com.bydan.erp.nomina.util.TipoColegioProfeConstantesFunciones;
import com.bydan.erp.nomina.util.TipoColegioProfeParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoColegioProfeParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoColegioProfeBean;
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
public class TipoColegioProfeBeanSwingJInternalFrame extends TipoColegioProfeJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoColegioProfeBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoColegioProfe> tipocolegioprofeValidator = new ClassValidator<TipoColegioProfe>(TipoColegioProfe.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoColegioProfe tipocolegioprofe;	
	public TipoColegioProfe tipocolegioprofeAux;
	public TipoColegioProfe tipocolegioprofeAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoColegioProfe tipocolegioprofeTotales;
	public Long idTipoColegioProfeActual;
	public Long iIdNuevoTipoColegioProfe=0L;
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
	
	public Boolean isPermisoTodoTipoColegioProfe;
	public Boolean isPermisoNuevoTipoColegioProfe;
	public Boolean isPermisoActualizarTipoColegioProfe;
	public Boolean isPermisoActualizarOriginalTipoColegioProfe;
	public Boolean isPermisoEliminarTipoColegioProfe;
	public Boolean isPermisoGuardarCambiosTipoColegioProfe;
	public Boolean isPermisoConsultaTipoColegioProfe;
	public Boolean isPermisoBusquedaTipoColegioProfe;
	public Boolean isPermisoReporteTipoColegioProfe;
	public Boolean isPermisoPaginacionMedioTipoColegioProfe;
	public Boolean isPermisoPaginacionAltoTipoColegioProfe;
	public Boolean isPermisoPaginacionTodoTipoColegioProfe;
	public Boolean isPermisoCopiarTipoColegioProfe;
	public Boolean isPermisoVerFormTipoColegioProfe;
	public Boolean isPermisoDuplicarTipoColegioProfe;
	public Boolean isPermisoOrdenTipoColegioProfe;
	
	
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
	
	public TipoColegioProfeParameterReturnGeneral tipocolegioprofeReturnGeneral;
	public TipoColegioProfeParameterReturnGeneral tipocolegioprofeParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoColegioProfe=false;
	public Boolean esParaAccionDesdeFormularioTipoColegioProfe=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoColegioProfeSessionBeanAdditional tipocolegioprofeSessionBeanAdditional=null;
	
	public TipoColegioProfeSessionBeanAdditional getTipoColegioProfeSessionBeanAdditional() {
		return this.tipocolegioprofeSessionBeanAdditional;
	}
	
	public void setTipoColegioProfeSessionBeanAdditional(TipoColegioProfeSessionBeanAdditional tipocolegioprofeSessionBeanAdditional) {
		try {
			this.tipocolegioprofeSessionBeanAdditional=tipocolegioprofeSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoColegioProfeBeanSwingJInternalFrameAdditional tipocolegioprofeBeanSwingJInternalFrameAdditional=null;
	//public class TipoColegioProfeBeanSwingJInternalFrame
	
	public TipoColegioProfeBeanSwingJInternalFrameAdditional getTipoColegioProfeBeanSwingJInternalFrameAdditional() {
		return this.tipocolegioprofeBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoColegioProfeBeanSwingJInternalFrameAdditional(TipoColegioProfeBeanSwingJInternalFrameAdditional tipocolegioprofeBeanSwingJInternalFrameAdditional) {
		try {
			this.tipocolegioprofeBeanSwingJInternalFrameAdditional=tipocolegioprofeBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoColegioProfeLogic tipocolegioprofeLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoColegioProfe tipocolegioprofeBean;
	public TipoColegioProfeConstantesFunciones tipocolegioprofeConstantesFunciones;
	//public TipoColegioProfeParameterReturnGeneral tipocolegioprofeReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoColegioProfe> tipocolegioprofes;	
	//public List<TipoColegioProfe> tipocolegioprofesEliminados;
	//public List<TipoColegioProfe> tipocolegioprofesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoColegioProfe=false;
	public Boolean isVisibilidadCeldaDuplicarTipoColegioProfe=true;
	public Boolean isVisibilidadCeldaCopiarTipoColegioProfe=true;
	public Boolean isVisibilidadCeldaVerFormTipoColegioProfe=true;
	public Boolean isVisibilidadCeldaOrdenTipoColegioProfe=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
	public Boolean isVisibilidadCeldaModificarTipoColegioProfe=false;
	public Boolean isVisibilidadCeldaActualizarTipoColegioProfe=false;
	public Boolean isVisibilidadCeldaEliminarTipoColegioProfe=false;
	public Boolean isVisibilidadCeldaCancelarTipoColegioProfe=false;
	public Boolean isVisibilidadCeldaGuardarTipoColegioProfe=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoColegioProfe() {
		return this.iIdNuevoTipoColegioProfe;
	}

	public void setiIdNuevoTipoColegioProfe(Long iIdNuevoTipoColegioProfe) {
		this.iIdNuevoTipoColegioProfe = iIdNuevoTipoColegioProfe;
	}
	
	public Long getidTipoColegioProfeActual() {
		return this.idTipoColegioProfeActual;
	}

	public void setidTipoColegioProfeActual(Long idTipoColegioProfeActual) {
		this.idTipoColegioProfeActual = idTipoColegioProfeActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoColegioProfe gettipocolegioprofe() {
		return this.tipocolegioprofe;
	}

	public void settipocolegioprofe(TipoColegioProfe tipocolegioprofe) {
		this.tipocolegioprofe = tipocolegioprofe;
	}
	
	public TipoColegioProfe gettipocolegioprofeAux() {
		return this.tipocolegioprofeAux;
	}

	public void settipocolegioprofeAux(TipoColegioProfe tipocolegioprofeAux) {
		this.tipocolegioprofeAux = tipocolegioprofeAux;
	}				
	
	public TipoColegioProfe gettipocolegioprofeAnterior() {
		return this.tipocolegioprofeAnterior;
	}

	public void settipocolegioprofeAnterior(TipoColegioProfe tipocolegioprofeAnterior) {
		this.tipocolegioprofeAnterior = tipocolegioprofeAnterior;
	}	
	
	public TipoColegioProfe gettipocolegioprofeTotales() {
		return this.tipocolegioprofeTotales;
	}

	public void settipocolegioprofeTotales(TipoColegioProfe tipocolegioprofeTotales) {
		this.tipocolegioprofeTotales = tipocolegioprofeTotales;
	}	
	
	public TipoColegioProfe gettipocolegioprofeBean() {
		return this.tipocolegioprofeBean;
	}

	public void settipocolegioprofeBean(TipoColegioProfe tipocolegioprofeBean) {
		this.tipocolegioprofeBean = tipocolegioprofeBean;
	}	
	
	public TipoColegioProfeParameterReturnGeneral gettipocolegioprofeReturnGeneral() {
		return this.tipocolegioprofeReturnGeneral;
	}

	public void settipocolegioprofeReturnGeneral(TipoColegioProfeParameterReturnGeneral tipocolegioprofeReturnGeneral) {
		this.tipocolegioprofeReturnGeneral = tipocolegioprofeReturnGeneral;
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
	
	
	public TipoColegioProfeLogic getTipoColegioProfeLogic()	{		
		return tipocolegioprofeLogic;
	}

	public void setTipoColegioProfeLogic(TipoColegioProfeLogic tipocolegioprofeLogic) {
		this.tipocolegioprofeLogic = tipocolegioprofeLogic;
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
	
	public Boolean getIsEsNuevoTipoColegioProfe() {
		return isEsNuevoTipoColegioProfe;
	}

	public void setIsEsNuevoTipoColegioProfe(Boolean isEsNuevoTipoColegioProfe) {
		this.isEsNuevoTipoColegioProfe = isEsNuevoTipoColegioProfe;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoColegioProfe() {
		return esParaAccionDesdeFormularioTipoColegioProfe;
	}
	
	public void setEsParaAccionDesdeFormularioTipoColegioProfe(Boolean esParaAccionDesdeFormularioTipoColegioProfe) {
		this.esParaAccionDesdeFormularioTipoColegioProfe = esParaAccionDesdeFormularioTipoColegioProfe;
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

			if(this.tipocolegioprofeSessionBean==null) {
				this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
			}

			if(!this.tipocolegioprofeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipocolegioprofeSessionBean.getlidEmpresaActual());
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

					if(this.tipocolegioprofe!=null) {
						this.tipocolegioprofe.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
						this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoColegioProfe.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
						if(this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoColegioProfeGenerico)throws Exception
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
				jComboBoxid_empresaTipoColegioProfeGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoColegioProfeGenerico!=null && jComboBoxid_empresaTipoColegioProfeGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoColegioProfeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoColegioProfe tipocolegioprofe,JComboBox jComboBoxid_empresaTipoColegioProfeGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoColegioProfeGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoColegioProfeGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipocolegioprofe.setid_empresa(empresaAux.getId());
				tipocolegioprofe.setempresa_descripcion(TipoColegioProfeConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipocolegioprofe.setEmpresa(empresaAux);			}
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

					if(!TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { 
							this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { 
					}

					if(!TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
							this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
							this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoColegioProfe() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoColegioProfeConstantesFunciones.refrescarForeignKeysDescripcionesTipoColegioProfe(this.tipocolegioprofeLogic.getTipoColegioProfes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoColegioProfeConstantesFunciones.refrescarForeignKeysDescripcionesTipoColegioProfe(this.tipocolegioprofes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocolegioprofeLogic.setTipoColegioProfes(this.tipocolegioprofes);
			tipocolegioprofeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoColegioProfeParameterReturnGeneral getTipoColegioProfeParameterGeneral() {
		return this.tipocolegioprofeParameterGeneral;
	}
	
	public void setTipoColegioProfeParameterGeneral(TipoColegioProfeParameterReturnGeneral tipocolegioprofeParameterGeneral) {
		this.tipocolegioprofeParameterGeneral = tipocolegioprofeParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoColegioProfe() {
		return isPermisoTodoTipoColegioProfe;
	}

	public void setIsPermisoTodoTipoColegioProfe(Boolean isPermisoTodoTipoColegioProfe) {
		this.isPermisoTodoTipoColegioProfe = isPermisoTodoTipoColegioProfe;
	}

	public Boolean getIsPermisoNuevoTipoColegioProfe() {
		return isPermisoNuevoTipoColegioProfe;
	}

	public void setIsPermisoNuevoTipoColegioProfe(Boolean isPermisoNuevoTipoColegioProfe) {
		this.isPermisoNuevoTipoColegioProfe = isPermisoNuevoTipoColegioProfe;
	}

	public Boolean getIsPermisoActualizarTipoColegioProfe() {
		return isPermisoActualizarTipoColegioProfe;
	}

	public void setIsPermisoActualizarTipoColegioProfe(Boolean isPermisoActualizarTipoColegioProfe) {
		this.isPermisoActualizarTipoColegioProfe = isPermisoActualizarTipoColegioProfe;
	}

	public Boolean getIsPermisoEliminarTipoColegioProfe() {
		return isPermisoEliminarTipoColegioProfe;
	}

	public void setIsPermisoEliminarTipoColegioProfe(Boolean isPermisoEliminarTipoColegioProfe) {
		this.isPermisoEliminarTipoColegioProfe = isPermisoEliminarTipoColegioProfe;
	}

	public Boolean getIsPermisoGuardarCambiosTipoColegioProfe() {
		return isPermisoGuardarCambiosTipoColegioProfe;
	}

	public void setIsPermisoGuardarCambiosTipoColegioProfe(Boolean isPermisoGuardarCambiosTipoColegioProfe) {
		this.isPermisoGuardarCambiosTipoColegioProfe = isPermisoGuardarCambiosTipoColegioProfe;
	}
	
	public Boolean getIsPermisoConsultaTipoColegioProfe() {
		return isPermisoConsultaTipoColegioProfe;
	}

	public void setIsPermisoConsultaTipoColegioProfe(Boolean isPermisoConsultaTipoColegioProfe) {
		this.isPermisoConsultaTipoColegioProfe = isPermisoConsultaTipoColegioProfe;
	}

	public Boolean getIsPermisoBusquedaTipoColegioProfe() {
		return isPermisoBusquedaTipoColegioProfe;
	}

	public void setIsPermisoBusquedaTipoColegioProfe(Boolean isPermisoBusquedaTipoColegioProfe) {
		this.isPermisoBusquedaTipoColegioProfe = isPermisoBusquedaTipoColegioProfe;
	}

	public Boolean getIsPermisoReporteTipoColegioProfe() {
		return isPermisoReporteTipoColegioProfe;
	}

	public void setIsPermisoReporteTipoColegioProfe(Boolean isPermisoReporteTipoColegioProfe) {
		this.isPermisoReporteTipoColegioProfe = isPermisoReporteTipoColegioProfe;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoColegioProfe() {
		return isPermisoPaginacionMedioTipoColegioProfe;
	}

	public void setIsPermisoPaginacionMedioTipoColegioProfe(Boolean isPermisoPaginacionMedioTipoColegioProfe) {
		this.isPermisoPaginacionMedioTipoColegioProfe = isPermisoPaginacionMedioTipoColegioProfe;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoColegioProfe() {
		return isPermisoPaginacionTodoTipoColegioProfe;
	}

	public void setIsPermisoPaginacionTodoTipoColegioProfe(Boolean isPermisoPaginacionTodoTipoColegioProfe) {
		this.isPermisoPaginacionTodoTipoColegioProfe = isPermisoPaginacionTodoTipoColegioProfe;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoColegioProfe() {
		return isPermisoPaginacionAltoTipoColegioProfe;
	}

	public void setIsPermisoPaginacionAltoTipoColegioProfe(Boolean isPermisoPaginacionAltoTipoColegioProfe) {
		this.isPermisoPaginacionAltoTipoColegioProfe = isPermisoPaginacionAltoTipoColegioProfe;
	}
	
	public Boolean getIsPermisoCopiarTipoColegioProfe() {
		return isPermisoCopiarTipoColegioProfe;
	}

	public void setIsPermisoCopiarTipoColegioProfe(Boolean isPermisoCopiarTipoColegioProfe) {
		this.isPermisoCopiarTipoColegioProfe = isPermisoCopiarTipoColegioProfe;
	}
	
	public Boolean getIsPermisoVerFormTipoColegioProfe() {
		return isPermisoVerFormTipoColegioProfe;
	}

	public void setIsPermisoVerFormTipoColegioProfe(Boolean isPermisoVerFormTipoColegioProfe) {
		this.isPermisoVerFormTipoColegioProfe = isPermisoVerFormTipoColegioProfe;
	}
	
	public Boolean getIsPermisoDuplicarTipoColegioProfe() {
		return isPermisoDuplicarTipoColegioProfe;
	}

	public void setIsPermisoDuplicarTipoColegioProfe(Boolean isPermisoDuplicarTipoColegioProfe) {
		this.isPermisoDuplicarTipoColegioProfe = isPermisoDuplicarTipoColegioProfe;
	}
	
	public Boolean getIsPermisoOrdenTipoColegioProfe() {
		return isPermisoOrdenTipoColegioProfe;
	}

	public void setIsPermisoOrdenTipoColegioProfe(Boolean isPermisoOrdenTipoColegioProfe) {
		this.isPermisoOrdenTipoColegioProfe = isPermisoOrdenTipoColegioProfe;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoColegioProfe() {
		return isVisibilidadCeldaNuevoTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaNuevoTipoColegioProfe(Boolean isVisibilidadCeldaNuevoTipoColegioProfe) {
		this.isVisibilidadCeldaNuevoTipoColegioProfe = isVisibilidadCeldaNuevoTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoColegioProfe() {
		return isVisibilidadCeldaDuplicarTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaDuplicarTipoColegioProfe(Boolean isVisibilidadCeldaDuplicarTipoColegioProfe) {
		this.isVisibilidadCeldaDuplicarTipoColegioProfe = isVisibilidadCeldaDuplicarTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoColegioProfe() {
		return isVisibilidadCeldaCopiarTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaCopiarTipoColegioProfe(Boolean isVisibilidadCeldaCopiarTipoColegioProfe) {
		this.isVisibilidadCeldaCopiarTipoColegioProfe = isVisibilidadCeldaCopiarTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoColegioProfe() {
		return isVisibilidadCeldaVerFormTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaVerFormTipoColegioProfe(Boolean isVisibilidadCeldaVerFormTipoColegioProfe) {
		this.isVisibilidadCeldaVerFormTipoColegioProfe = isVisibilidadCeldaVerFormTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoColegioProfe() {
		return isVisibilidadCeldaOrdenTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaOrdenTipoColegioProfe(Boolean isVisibilidadCeldaOrdenTipoColegioProfe) {
		this.isVisibilidadCeldaOrdenTipoColegioProfe = isVisibilidadCeldaOrdenTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoColegioProfe() {
		return isVisibilidadCeldaNuevoRelacionesTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoColegioProfe(Boolean isVisibilidadCeldaNuevoRelacionesTipoColegioProfe) {
		this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe = isVisibilidadCeldaNuevoRelacionesTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoColegioProfe() {
		return isVisibilidadCeldaModificarTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaModificarTipoColegioProfe(Boolean isVisibilidadCeldaModificarTipoColegioProfe) {
		this.isVisibilidadCeldaModificarTipoColegioProfe = isVisibilidadCeldaModificarTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoColegioProfe() {
		return isVisibilidadCeldaActualizarTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaActualizarTipoColegioProfe(Boolean isVisibilidadCeldaActualizarTipoColegioProfe) {
		this.isVisibilidadCeldaActualizarTipoColegioProfe = isVisibilidadCeldaActualizarTipoColegioProfe;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoColegioProfe() {
		return isVisibilidadCeldaEliminarTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaEliminarTipoColegioProfe(Boolean isVisibilidadCeldaEliminarTipoColegioProfe) {
		this.isVisibilidadCeldaEliminarTipoColegioProfe = isVisibilidadCeldaEliminarTipoColegioProfe;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoColegioProfe() {
		return isVisibilidadCeldaCancelarTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaCancelarTipoColegioProfe(Boolean isVisibilidadCeldaCancelarTipoColegioProfe) {
		this.isVisibilidadCeldaCancelarTipoColegioProfe = isVisibilidadCeldaCancelarTipoColegioProfe;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoColegioProfe() {
		return isVisibilidadCeldaGuardarTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaGuardarTipoColegioProfe(Boolean isVisibilidadCeldaGuardarTipoColegioProfe) {
		this.isVisibilidadCeldaGuardarTipoColegioProfe = isVisibilidadCeldaGuardarTipoColegioProfe;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoColegioProfe() {
		return isVisibilidadCeldaGuardarCambiosTipoColegioProfe;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoColegioProfe(Boolean isVisibilidadCeldaGuardarCambiosTipoColegioProfe) {
		this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe = isVisibilidadCeldaGuardarCambiosTipoColegioProfe;
	}
		
	public TipoColegioProfeSessionBean gettipocolegioprofeSessionBean() {
		return this.tipocolegioprofeSessionBean;
	}
	
	public void settipocolegioprofeSessionBean(TipoColegioProfeSessionBean tipocolegioprofeSessionBean) {
		this.tipocolegioprofeSessionBean=tipocolegioprofeSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(TipoColegioProfe tipocolegioprofe)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipocolegioprofe,null);
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
	
	public void bugActualizarReferenciaActual(TipoColegioProfe tipocolegioprofe,TipoColegioProfe tipocolegioprofeAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoColegioProfe(tipocolegioprofe);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocolegioprofeAux.setId(tipocolegioprofe.getId());
		tipocolegioprofeAux.setVersionRow(tipocolegioprofe.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoColegioProfe();
		
			int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocolegioprofeValidator.getInvalidValues(this.tipocolegioprofe);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocolegioprofeLogic.setDatosCliente(datosCliente);
			tipocolegioprofeLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocolegioprofeAux=new  TipoColegioProfe();
				
				tipocolegioprofeAux.setIsNew(true);
				tipocolegioprofeAux.setIsChanged(true);
				
				tipocolegioprofeAux.setTipoColegioProfeOriginal(this.tipocolegioprofe);
				
				tipocolegioprofeAux.setId(this.tipocolegioprofe.getId());	
				tipocolegioprofeAux.setVersionRow(this.tipocolegioprofe.getVersionRow());	
				tipocolegioprofeAux.setid_empresa(this.tipocolegioprofe.getid_empresa());	
				tipocolegioprofeAux.setcodigo(this.tipocolegioprofe.getcodigo());	
				tipocolegioprofeAux.setnombre(this.tipocolegioprofe.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocolegioprofeAux,tipocolegioprofeLogic.getTipoColegioProfes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocolegioprofeAux,tipocolegioprofes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocolegioprofeLogic.saveTipoColegioProfes();//WithConnection
						//tipocolegioprofeLogic.getSetVersionRowTipoColegioProfes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocolegioprofe,tipocolegioprofeAux);
					
					this.refrescarForeignKeysDescripcionesTipoColegioProfe();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocolegioprofeLogic.saveTipoColegioProfeRelaciones(tipocolegioprofeAux);//WithConnection
								//tipocolegioprofeLogic.getSetVersionRowTipoColegioProfes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocolegioprofe,tipocolegioprofeAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocolegioprofeAux,tipocolegioprofeLogic.getTipoColegioProfes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocolegioprofeAux,tipocolegioprofes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocolegioprofe,tipocolegioprofeAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocolegioprofeAux=new  TipoColegioProfe();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocolegioprofeSessionBean.getEsGuardarRelacionado() && this.tipocolegioprofe.getId()>=0)) {
						
					tipocolegioprofeAux.setIsNew(false);
				}
				
				tipocolegioprofeAux.setIsDeleted(false);
			
				tipocolegioprofeAux.setId(this.tipocolegioprofe.getId());	
				tipocolegioprofeAux.setVersionRow(this.tipocolegioprofe.getVersionRow());	
				tipocolegioprofeAux.setid_empresa(this.tipocolegioprofe.getid_empresa());	
				tipocolegioprofeAux.setcodigo(this.tipocolegioprofe.getcodigo());	
				tipocolegioprofeAux.setnombre(this.tipocolegioprofe.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocolegioprofeAux,tipocolegioprofeLogic.getTipoColegioProfes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocolegioprofeAux,tipocolegioprofes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocolegioprofeLogic.saveTipoColegioProfes();//WithConnection
						//tipocolegioprofeLogic.getSetVersionRowTipoColegioProfes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocolegioprofe,tipocolegioprofeAux);
					
					this.refrescarForeignKeysDescripcionesTipoColegioProfe();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocolegioprofeLogic.saveTipoColegioProfeRelaciones(tipocolegioprofeAux);//WithConnection
								//tipocolegioprofeLogic.getSetVersionRowTipoColegioProfes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipocolegioprofe,tipocolegioprofeAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipocolegioprofeAux,tipocolegioprofeLogic.getTipoColegioProfes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipocolegioprofeAux,tipocolegioprofes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipocolegioprofe,tipocolegioprofeAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocolegioprofeAux=new  TipoColegioProfe();
				
				tipocolegioprofeAux.setIsNew(false);
				tipocolegioprofeAux.setIsChanged(false);
				
				tipocolegioprofeAux.setIsDeleted(true);
				
				tipocolegioprofeAux.setId(this.tipocolegioprofe.getId());	
				tipocolegioprofeAux.setVersionRow(this.tipocolegioprofe.getVersionRow());	
				tipocolegioprofeAux.setid_empresa(this.tipocolegioprofe.getid_empresa());	
				tipocolegioprofeAux.setcodigo(this.tipocolegioprofe.getcodigo());	
				tipocolegioprofeAux.setnombre(this.tipocolegioprofe.getnombre());	
				
				if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocolegioprofeAux.getId()>=0) {	
						this.tipocolegioprofesEliminados.add(tipocolegioprofeAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocolegioprofeAux,tipocolegioprofeLogic.getTipoColegioProfes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocolegioprofeAux,tipocolegioprofes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocolegioprofeLogic.saveTipoColegioProfes();//WithConnection
						//tipocolegioprofeLogic.getSetVersionRowTipoColegioProfes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipocolegioprofeLogic.saveTipoColegioProfeRelaciones(tipocolegioprofeAux);//WithConnection
								//tipocolegioprofeLogic.getSetVersionRowTipoColegioProfes();//WithConnection
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
							if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocolegioprofeAux,tipocolegioprofeLogic.getTipoColegioProfes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocolegioprofeAux,tipocolegioprofes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.getTipoColegioProfes().addAll(this.tipocolegioprofesEliminados);
					
					tipocolegioprofeLogic.saveTipoColegioProfes();//WithConnection
					//tipocolegioprofeLogic.getSetVersionRowTipoColegioProfes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoColegioProfe();
				
				this.tipocolegioprofesEliminados= new ArrayList<TipoColegioProfe>();		
			}
			
			if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Colegio Profe GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocolegioprofe=tipocolegioprofeAux;
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
      		//this.finishProcessTipoColegioProfe();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoColegioProfe tipocolegioprofeLocal) throws Exception {
		
		if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoColegioProfe tipocolegioprofeLocal) throws Exception {	
		if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipocolegioprofeLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoColegioProfeActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocolegioprofeValidator.getInvalidValues(this.tipocolegioprofe);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoColegioProfe tipocolegioprofe,List<TipoColegioProfe> tipocolegioprofes) throws Exception {
		try	{		
			TipoColegioProfeConstantesFunciones.actualizarLista(tipocolegioprofe,tipocolegioprofes,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoColegioProfe tipocolegioprofe,List<TipoColegioProfe> tipocolegioprofes) throws Exception {
		try	{			
			TipoColegioProfeConstantesFunciones.actualizarSelectedLista(tipocolegioprofe,tipocolegioprofes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoColegioProfe> tipocolegioprofesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocolegioprofesLocal=this.tipocolegioprofeLogic.getTipoColegioProfes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocolegioprofesLocal=this.tipocolegioprofes;
			}
			//ARCHITECTURE
		
			for(TipoColegioProfe tipocolegioprofeLocal:tipocolegioprofesLocal) {
				if(this.permiteMantenimiento(tipocolegioprofeLocal) && tipocolegioprofeLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoColegioProfeConstantesFunciones.getTipoColegioProfeLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoColegioProfeConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelid_empresaTipoColegioProfe,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoColegioProfeConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelcodigoTipoColegioProfe,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoColegioProfeConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelnombreTipoColegioProfe,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelid_empresaTipoColegioProfe,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelcodigoTipoColegioProfe,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelnombreTipoColegioProfe,"");
		
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
		this.iIdNuevoTipoColegioProfe--;	
		
		
		this.tipocolegioprofeAux=new TipoColegioProfe();
		
		this.tipocolegioprofeAux.setId(this.iIdNuevoTipoColegioProfe);
		this.tipocolegioprofeAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocolegioprofeLogic.getTipoColegioProfes().add(this.tipocolegioprofeAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocolegioprofes.add(this.tipocolegioprofeAux);
		}
		//ARCHITECTURE
		
		this.tipocolegioprofe=this.tipocolegioprofeAux;
		
		if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoColegioProfe(this.tipocolegioprofe);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoColegioProfe(this.tipocolegioprofe);
		}
				
		//this.setDefaultControlesTipoColegioProfe();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoColegioProfe();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoColegioProfe();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoColegioProfe();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoColegioProfe(this.tipocolegioprofeBean,this.tipocolegioprofe,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoColegioProfeConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
			classes=TipoColegioProfeConstantesFunciones.getClassesRelationshipsOfTipoColegioProfe(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocolegioprofeReturnGeneral=tipocolegioprofeLogic.procesarEventosTipoColegioProfesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocolegioprofeLogic.getTipoColegioProfes(),this.tipocolegioprofe,this.tipocolegioprofeParameterGeneral,this.isEsNuevoTipoColegioProfe,classes);//this.tipocolegioprofeLogic.getTipoColegioProfe()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoColegioProfe(this.tipocolegioprofeReturnGeneral,this.tipocolegioprofeBean,false);
		
		if(this.tipocolegioprofeReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoColegioProfe(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoColegioProfe(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe());
		}
		
		if(this.tipocolegioprofeReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoColegioProfe(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe(),classes);//this.tipocolegioprofeBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoColegioProfe();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoColegioProfe();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.RecargarFormTipoColegioProfe(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoColegioProfe(false);
						
			if(tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoColegioProfe();
			}
			
			this.actualizarVisualTableDatosTipoColegioProfe();
			
			this.jTableDatosTipoColegioProfe.setRowSelectionInterval(this.getIndiceNuevoTipoColegioProfe(), this.getIndiceNuevoTipoColegioProfe());
			
			this.seleccionarFilaTablaTipoColegioProfeActual();
						
			this.actualizarEstadoCeldasBotonesTipoColegioProfe("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoColegioProfe(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.setEnabled(isHabilitar && this.tipocolegioprofeConstantesFunciones.activarcodigoTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.setEnabled(isHabilitar && this.tipocolegioprofeConstantesFunciones.activarnombreTipoColegioProfe);	
		//
		this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setEnabled(isHabilitar && this.tipocolegioprofeConstantesFunciones.activarid_empresaTipoColegioProfe);
	};
	
	public void setDefaultControlesTipoColegioProfe() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoColegioProfe(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocolegioprofeSessionBean.setConGuardarRelaciones(true);			
			this.tipocolegioprofeSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.setVisible(true);
			
					
		} else {
			//this.tipocolegioprofeSessionBean.setConGuardarRelaciones(false);			
			this.tipocolegioprofeSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoColegioProfe() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
				if(tipocolegioprofeAux.getId().equals(this.iIdNuevoTipoColegioProfe)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofes) {
				if(tipocolegioprofeAux.getId().equals(this.iIdNuevoTipoColegioProfe)) {
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
	
	public int getIndiceActualTipoColegioProfe(TipoColegioProfe tipocolegioprofe,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
				if(tipocolegioprofeAux.getId().equals(tipocolegioprofe.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofes) {
				if(tipocolegioprofeAux.getId().equals(tipocolegioprofe.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoColegioProfe(TipoColegioProfe tipocolegioprofeOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
				if(tipocolegioprofeAux.getTipoColegioProfeOriginal().getId().equals(tipocolegioprofeOriginal.getId())) {
					existe=true;
					tipocolegioprofeOriginal.setId(tipocolegioprofeAux.getId());
					tipocolegioprofeOriginal.setVersionRow(tipocolegioprofeAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofes) {
				if(tipocolegioprofeAux.getTipoColegioProfeOriginal().getId().equals(tipocolegioprofeOriginal.getId())) {
					existe=true;
					tipocolegioprofeOriginal.setId(tipocolegioprofeAux.getId());
					tipocolegioprofeOriginal.setVersionRow(tipocolegioprofeAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoColegioProfe(Boolean esParaCancelar) throws Exception {
		tipocolegioprofesAux=new ArrayList<TipoColegioProfe>();
		tipocolegioprofeAux=new TipoColegioProfe();
		
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
					if(tipocolegioprofeAux.getId()<0) {
						tipocolegioprofesAux.add(tipocolegioprofeAux);
					}		
				}
				this.iIdNuevoTipoColegioProfe=0L;
				this.tipocolegioprofeLogic.getTipoColegioProfes().removeAll(tipocolegioprofesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofes) {
					if(tipocolegioprofeAux.getId()<0) {
						tipocolegioprofesAux.add(tipocolegioprofeAux);
					}		
				}
				this.iIdNuevoTipoColegioProfe=0L;
				this.tipocolegioprofes.removeAll(tipocolegioprofesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoColegioProfe 
					&& this.tipocolegioprofeLogic.getTipoColegioProfes().size()>0
					) {
					tipocolegioprofeAux=this.tipocolegioprofeLogic.getTipoColegioProfes().get(this.tipocolegioprofeLogic.getTipoColegioProfes().size() - 1);
				
					if(tipocolegioprofeAux.getId()<0) {
						this.tipocolegioprofeLogic.getTipoColegioProfes().remove(tipocolegioprofeAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoColegioProfe && this.tipocolegioprofes.size()>0) {
					tipocolegioprofeAux=this.tipocolegioprofes.get(this.tipocolegioprofes.size() - 1);
				
					if(tipocolegioprofeAux.getId()<0) {
						this.tipocolegioprofes.remove(tipocolegioprofeAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoColegioProfe(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocolegioprofe.getId()<0) {
				this.tipocolegioprofeLogic.getTipoColegioProfes().remove(this.tipocolegioprofe);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocolegioprofe.getId()<0) {
				this.tipocolegioprofes.remove(this.tipocolegioprofe);
			}
		}			
	}
	
	public void setEstadosInicialesTipoColegioProfe(List<TipoColegioProfe> tipocolegioprofesAux) throws Exception {
		TipoColegioProfeConstantesFunciones.setEstadosInicialesTipoColegioProfe(tipocolegioprofesAux);
	}
	
	public void setEstadosInicialesTipoColegioProfe(TipoColegioProfe tipocolegioprofeAux) throws Exception {
		TipoColegioProfeConstantesFunciones.setEstadosInicialesTipoColegioProfe(tipocolegioprofeAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoColegioProfeActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoColegioProfe("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoColegioProfeActual()) {
				if(!this.isEsNuevoTipoColegioProfe) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoColegioProfe("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoColegioProfe=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoColegioProfeActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Colegio Profe ?", "MANTENIMIENTO DE Tipo Colegio Profe", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoColegioProfe("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoColegioProfe tipocolegioprofe) throws Exception {
		TipoColegioProfeConstantesFunciones.seleccionarAsignar(this.tipocolegioprofe,tipocolegioprofe);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoColegioProfe=this.isPermisoActualizarOriginalTipoColegioProfe;
			
			
			this.seleccionarAsignar(tipocolegioprofe);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoColegioProfeConstantesFunciones.quitarEspaciosTipoColegioProfe(this.tipocolegioprofe,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoColegioProfe("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocolegioprofeSessionBean.setsFuncionBusquedaRapida(this.tipocolegioprofeSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoColegioProfe) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoColegioProfe(esParaCancelar);				
				this.cancelarNuevoTipoColegioProfe(esParaCancelar);								
			}
			
			this.tipocolegioprofe=new TipoColegioProfe();
			
			this.inicializarTipoColegioProfe();
			
			this.actualizarEstadoCeldasBotonesTipoColegioProfe("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoColegioProfe() throws Exception {
		try {
			TipoColegioProfeConstantesFunciones.inicializarTipoColegioProfe(this.tipocolegioprofe);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocolegioprofeLogic.getTipoColegioProfes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoColegioProfes(String sAccionBusqueda,List<TipoColegioProfe> tipocolegioprofesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoColegioProfe"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoColegioProfeMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoColegioProfeMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoColegioProfe"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Colegio Profes");		
		parameters.put("busquedapor", TipoColegioProfeConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoColegioProfe=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoColegioProfeConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoColegioProfeConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoColegioProfe=new JRBeanArrayDataSource(TipoColegioProfeJInternalFrame.TraerTipoColegioProfeBeans(tipocolegioprofesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoColegioProfe);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoColegioProfeConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoColegioProfeConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoColegioProfeBean.TraerTipoColegioProfeBeans(tipocolegioprofesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoColegioProfes(sAccionBusqueda,sTipoArchivoReporte,tipocolegioprofesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoColegioProfes(sAccionBusqueda,sTipoArchivoReporte,tipocolegioprofesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoColegioProfeActionPerformed(null);
					//this.generarExcelReporteTipoColegioProfes(sAccionBusqueda,sTipoArchivoReporte,tipocolegioprofesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoColegioProfes(sAccionBusqueda,sTipoArchivoReporte,tipocolegioprofesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoColegioProfes(sAccionBusqueda,sTipoArchivoReporte,tipocolegioprofesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoColegioProfes(sAccionBusqueda,sTipoArchivoReporte,tipocolegioprofesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoColegioProfes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoColegioProfe> tipocolegioprofesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocolegioprofe";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoColegioProfes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoColegioProfe("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoColegioProfe tipocolegioprofe : tipocolegioprofesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoColegioProfeConstantesFunciones.generarExcelReporteDataTipoColegioProfe("NORMAL",row,workbook,tipocolegioprofe,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoColegioProfe(String sTipo,Row row,Workbook workbook) {
		
		TipoColegioProfeConstantesFunciones.generarExcelReporteHeaderTipoColegioProfe(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoColegioProfes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoColegioProfe> tipocolegioprofesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocolegioprofe_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoColegioProfes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoColegioProfe tipocolegioprofe : tipocolegioprofesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoColegioProfeConstantesFunciones.getTipoColegioProfeDescripcion(tipocolegioprofe));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocolegioprofe.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoColegioProfeConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocolegioprofe.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocolegioprofe.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoColegioProfes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoColegioProfe> tipocolegioprofesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoColegioProfe> tipocolegioprofesRespaldo=null;
		
		classes=TipoColegioProfeConstantesFunciones.getClassesRelationshipsOfTipoColegioProfe(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocolegioprofeLogic.setDatosCliente(this.datosCliente);
		this.tipocolegioprofeLogic.setDatosDeep(this.datosDeep);
		this.tipocolegioprofeLogic.setIsConDeep(true);
		
		tipocolegioprofesRespaldo=this.tipocolegioprofeLogic.getTipoColegioProfes();
		
		this.tipocolegioprofeLogic.setTipoColegioProfes(tipocolegioprofesParaReportes);	
		this.tipocolegioprofeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocolegioprofesParaReportes=this.tipocolegioprofeLogic.getTipoColegioProfes();
		this.tipocolegioprofeLogic.setTipoColegioProfes(tipocolegioprofesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocolegioprofe_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoColegioProfes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoColegioProfe("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoColegioProfe tipocolegioprofe : tipocolegioprofesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoColegioProfe("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoColegioProfeConstantesFunciones.generarExcelReporteDataTipoColegioProfe("NORMAL",row,workbook,tipocolegioprofe,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoColegioProfeConstantesFunciones.getTipoColegioProfeDescripcion(tipocolegioprofe));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoColegioProfe() throws Exception {		
		this.startProcessTipoColegioProfe(true);
	}
	
	public void startProcessTipoColegioProfe(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoColegioProfe ,this.jPanelParametrosReportesTipoColegioProfe, this.jScrollPanelDatosTipoColegioProfe,this.jPanelPaginacionTipoColegioProfe, this.jScrollPanelDatosEdicionTipoColegioProfe, this.jPanelAccionesTipoColegioProfe,this.jPanelAccionesFormularioTipoColegioProfe,this.jmenuBarTipoColegioProfe,this.jmenuBarDetalleTipoColegioProfe,this.jTtoolBarTipoColegioProfe,this.jTtoolBarDetalleTipoColegioProfe);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoColegioProfe=this.jTabbedPaneBusquedasTipoColegioProfe; 
		
		final JPanel jPanelParametrosReportesTipoColegioProfe=this.jPanelParametrosReportesTipoColegioProfe;
		//final JScrollPane jScrollPanelDatosTipoColegioProfe=this.jScrollPanelDatosTipoColegioProfe;
		final JTable jTableDatosTipoColegioProfe=this.jTableDatosTipoColegioProfe;		
		final JPanel jPanelPaginacionTipoColegioProfe=this.jPanelPaginacionTipoColegioProfe;
		//final JScrollPane jScrollPanelDatosEdicionTipoColegioProfe=this.jScrollPanelDatosEdicionTipoColegioProfe;
		final JPanel jPanelAccionesTipoColegioProfe=this.jPanelAccionesTipoColegioProfe;
		
		JPanel jPanelCamposAuxiliarTipoColegioProfe=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoColegioProfe=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			jPanelCamposAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jPanelCamposTipoColegioProfe;
			jPanelAccionesFormularioAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jPanelAccionesFormularioTipoColegioProfe;
		}
		
		final JPanel jPanelCamposTipoColegioProfe=jPanelCamposAuxiliarTipoColegioProfe;
		final JPanel jPanelAccionesFormularioTipoColegioProfe=jPanelAccionesFormularioAuxiliarTipoColegioProfe;
		
		
		final JMenuBar jmenuBarTipoColegioProfe=this.jmenuBarTipoColegioProfe;
		final JToolBar jTtoolBarTipoColegioProfe=this.jTtoolBarTipoColegioProfe;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoColegioProfe=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoColegioProfe=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			jmenuBarDetalleAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jmenuBarDetalleTipoColegioProfe;
			jTtoolBarDetalleAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jTtoolBarDetalleTipoColegioProfe;
		}
		
		final JMenuBar jmenuBarDetalleTipoColegioProfe=jmenuBarDetalleAuxiliarTipoColegioProfe;
		final JToolBar jTtoolBarDetalleTipoColegioProfe=jTtoolBarDetalleAuxiliarTipoColegioProfe;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoColegioProfe;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoColegioProfe;
			processRunnable.jTableDatos=jTableDatosTipoColegioProfe;
			processRunnable.jPanelCampos=jPanelCamposTipoColegioProfe;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoColegioProfe;
			processRunnable.jPanelAcciones=jPanelAccionesTipoColegioProfe;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoColegioProfe;
			
			
			processRunnable.jmenuBar=jmenuBarTipoColegioProfe;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoColegioProfe;
			processRunnable.jTtoolBar=jTtoolBarTipoColegioProfe;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoColegioProfe;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoColegioProfe ,jPanelParametrosReportesTipoColegioProfe,jTableDatosTipoColegioProfe, /*jScrollPanelDatosTipoColegioProfe,*/jPanelCamposTipoColegioProfe,jPanelPaginacionTipoColegioProfe, /*jScrollPanelDatosEdicionTipoColegioProfe,*/ jPanelAccionesTipoColegioProfe,jPanelAccionesFormularioTipoColegioProfe,jmenuBarTipoColegioProfe,jmenuBarDetalleTipoColegioProfe,jTtoolBarTipoColegioProfe,jTtoolBarDetalleTipoColegioProfe);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoColegioProfe ,jPanelParametrosReportesTipoColegioProfe, jScrollPanelDatosTipoColegioProfe,jPanelPaginacionTipoColegioProfe, jScrollPanelDatosEdicionTipoColegioProfe, jPanelAccionesTipoColegioProfe,jPanelAccionesFormularioTipoColegioProfe,jmenuBarTipoColegioProfe,jmenuBarDetalleTipoColegioProfe,jTtoolBarTipoColegioProfe,jTtoolBarDetalleTipoColegioProfe);
						
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
	
	public void finishProcessTipoColegioProfe() {// throws Exception 
		this.finishProcessTipoColegioProfe(true);
	}
	
	public void finishProcessTipoColegioProfe(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoColegioProfe ,this.jPanelParametrosReportesTipoColegioProfe, this.jScrollPanelDatosTipoColegioProfe,this.jPanelPaginacionTipoColegioProfe, this.jScrollPanelDatosEdicionTipoColegioProfe, this.jPanelAccionesTipoColegioProfe,this.jPanelAccionesFormularioTipoColegioProfe,this.jmenuBarTipoColegioProfe,this.jmenuBarDetalleTipoColegioProfe,this.jTtoolBarTipoColegioProfe,this.jTtoolBarDetalleTipoColegioProfe);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoColegioProfe=this.jTabbedPaneBusquedasTipoColegioProfe; 
		
		final JPanel jPanelParametrosReportesTipoColegioProfe=this.jPanelParametrosReportesTipoColegioProfe;
		//final JScrollPane jScrollPanelDatosTipoColegioProfe=this.jScrollPanelDatosTipoColegioProfe;
		final JTable jTableDatosTipoColegioProfe=this.jTableDatosTipoColegioProfe;		
		final JPanel jPanelPaginacionTipoColegioProfe=this.jPanelPaginacionTipoColegioProfe;
		//final JScrollPane jScrollPanelDatosEdicionTipoColegioProfe=this.jScrollPanelDatosEdicionTipoColegioProfe;
		final JPanel jPanelAccionesTipoColegioProfe=this.jPanelAccionesTipoColegioProfe;
		
		JPanel jPanelCamposAuxiliarTipoColegioProfe=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoColegioProfe=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			jPanelCamposAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jPanelCamposTipoColegioProfe;
			jPanelAccionesFormularioAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jPanelAccionesFormularioTipoColegioProfe;
		}
		
		final JPanel jPanelCamposTipoColegioProfe=jPanelCamposAuxiliarTipoColegioProfe;
		final JPanel jPanelAccionesFormularioTipoColegioProfe=jPanelAccionesFormularioAuxiliarTipoColegioProfe;
		
		
		final JMenuBar jmenuBarTipoColegioProfe=this.jmenuBarTipoColegioProfe;		
		final JToolBar jTtoolBarTipoColegioProfe=this.jTtoolBarTipoColegioProfe;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoColegioProfe=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoColegioProfe=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			jmenuBarDetalleAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jmenuBarDetalleTipoColegioProfe;
			jTtoolBarDetalleAuxiliarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jTtoolBarDetalleTipoColegioProfe;		
		}
		
		final JMenuBar jmenuBarDetalleTipoColegioProfe=jmenuBarDetalleAuxiliarTipoColegioProfe;
		final JToolBar jTtoolBarDetalleTipoColegioProfe=jTtoolBarDetalleAuxiliarTipoColegioProfe;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoColegioProfe;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoColegioProfe;
			processRunnable.jTableDatos=jTableDatosTipoColegioProfe;
			processRunnable.jPanelCampos=jPanelCamposTipoColegioProfe;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoColegioProfe;
			processRunnable.jPanelAcciones=jPanelAccionesTipoColegioProfe;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoColegioProfe;
			
			
			processRunnable.jmenuBar=jmenuBarTipoColegioProfe;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoColegioProfe;
			processRunnable.jTtoolBar=jTtoolBarTipoColegioProfe;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoColegioProfe;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoColegioProfe ,jPanelParametrosReportesTipoColegioProfe, jTableDatosTipoColegioProfe,/*jScrollPanelDatosTipoColegioProfe,*/jPanelCamposTipoColegioProfe,jPanelPaginacionTipoColegioProfe, /*jScrollPanelDatosEdicionTipoColegioProfe,*/ jPanelAccionesTipoColegioProfe,jPanelAccionesFormularioTipoColegioProfe,jmenuBarTipoColegioProfe,jmenuBarDetalleTipoColegioProfe,jTtoolBarTipoColegioProfe,jTtoolBarDetalleTipoColegioProfe));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoColegioProfe(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoColegioProfe(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoColegioProfe(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoColegioProfe(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoColegioProfe,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoColegioProfe,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoColegioProfe(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoColegioProfe,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoColegioProfe,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocolegioprofeConstantesFunciones.getsFinalQueryTipoColegioProfe();
		String  finalQueryPaginacionTodos=this.tipocolegioprofeConstantesFunciones.getsFinalQueryTipoColegioProfe();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoColegioProfeConstantesFunciones.getArrayColumnasGlobalesNoTipoColegioProfe(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoColegioProfeConstantesFunciones.getArrayColumnasGlobalesTipoColegioProfe(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoColegioProfeConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocolegioprofesEliminados= new ArrayList<TipoColegioProfe>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoColegioProfe();
		
				///*TipoColegioProfeSessionBean*/this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
			
			if(this.tipocolegioprofeSessionBean==null) {
				this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
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
					this.iNumeroPaginacion=TipoColegioProfeConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoColegioProfeConstantesFunciones.getClassesForeignKeysOfTipoColegioProfe(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocolegioprofe."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocolegioprofesAux= new ArrayList<TipoColegioProfe>();
			
				
			tipocolegioprofeLogic.setDatosCliente(this.datosCliente);
			tipocolegioprofeLogic.setDatosDeep(this.datosDeep);
			tipocolegioprofeLogic.setIsConDeep(true);
			
			
			tipocolegioprofeLogic.getTipoColegioProfeDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocolegioprofeLogic.getTodosTipoColegioProfes(finalQueryGlobal,pagination);
					
					//tipocolegioprofeLogic.getTodosTipoColegioProfesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocolegioprofeLogic.getTipoColegioProfes()==null|| tipocolegioprofeLogic.getTipoColegioProfes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocolegioprofesAux= new ArrayList<TipoColegioProfe>();
							tipocolegioprofesAux.addAll(tipocolegioprofeLogic.getTipoColegioProfes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocolegioprofesAux= new ArrayList<TipoColegioProfe>();
							tipocolegioprofesAux.addAll(tipocolegioprofes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocolegioprofeLogic.getTodosTipoColegioProfes(finalQueryGlobal+"",this.pagination);												
							
							//tipocolegioprofeLogic.getTodosTipoColegioProfesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoColegioProfes("Todos",tipocolegioprofeLogic.getTipoColegioProfes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocolegioprofeLogic.setTipoColegioProfes(new ArrayList<TipoColegioProfe>());					
							tipocolegioprofeLogic.getTipoColegioProfes().addAll(tipocolegioprofesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocolegioprofes=new ArrayList<TipoColegioProfe>();
							tipocolegioprofes.addAll(tipocolegioprofesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoColegioProfe=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoColegioProfe=this.idActual;
				
				} else if(this.idTipoColegioProfeActual!=null && this.idTipoColegioProfeActual!=0L) {
					idTipoColegioProfe=idTipoColegioProfeActual;
				}
				
					
				this.sDetalleReporte=TipoColegioProfeConstantesFunciones.getDetalleIndicePorId(idTipoColegioProfe);
				
				this.tipocolegioprofes=new ArrayList<TipoColegioProfe>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocolegioprofeLogic.getEntity(idTipoColegioProfe);
					
					//tipocolegioprofeLogic.getEntityWithConnection(idTipoColegioProfe);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocolegioprofeLogic.setTipoColegioProfes(new ArrayList<TipoColegioProfe>());
					tipocolegioprofeLogic.getTipoColegioProfes().add(tipocolegioprofeLogic.getTipoColegioProfe());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocolegioprofes=new ArrayList<TipoColegioProfe>();
					this.tipocolegioprofes.add(tipocolegioprofe);
				}
				
				if(tipocolegioprofeLogic.getTipoColegioProfe()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoColegioProfeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipocolegioprofeLogic.getTipoColegioProfesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoColegioProfeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoColegioProfeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipocolegioprofeLogic.getTipoColegioProfes()==null||tipocolegioprofeLogic.getTipoColegioProfes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipocolegioprofes==null|| tipocolegioprofes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocolegioprofesAux=new ArrayList<TipoColegioProfe>();
						tipocolegioprofesAux.addAll(tipocolegioprofeLogic.getTipoColegioProfes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocolegioprofesAux=new ArrayList<TipoColegioProfe>();
							tipocolegioprofesAux.addAll(tipocolegioprofes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipocolegioprofeLogic.getTipoColegioProfesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoColegioProfeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoColegioProfeConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoColegioProfes("FK_IdEmpresa",tipocolegioprofeLogic.getTipoColegioProfes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoColegioProfes("FK_IdEmpresa",tipocolegioprofes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocolegioprofeLogic.setTipoColegioProfes(new ArrayList<TipoColegioProfe>());
						tipocolegioprofeLogic.getTipoColegioProfes().addAll(tipocolegioprofesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocolegioprofes=new ArrayList<TipoColegioProfe>();
							tipocolegioprofes.addAll(tipocolegioprofesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoColegioProfe();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoColegioProfe();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocolegioprofeLogic.getTipoColegioProfes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocolegioprofes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocolegioprofeLogic.getTipoColegioProfes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocolegioprofes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoColegioProfe tipocolegioprofe) {
		Boolean permite=true;
		
		if(this.tipocolegioprofe.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoColegioProfeConstantesFunciones.getOrderByListaTipoColegioProfe();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoColegioProfeConstantesFunciones.getOrderByListaTipoColegioProfe();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoColegioProfe tipocolegioprofe:tipocolegioprofeLogic.getTipoColegioProfes()) {
				if(tipocolegioprofe.getsType().equals(Constantes2.S_TOTALES)) {
					tipocolegioprofeTotales=tipocolegioprofe;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoColegioProfe tipocolegioprofe:this.tipocolegioprofes) {
				if(tipocolegioprofe.getsType().equals(Constantes2.S_TOTALES)) {
					tipocolegioprofeTotales=tipocolegioprofe;
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
			this.tipocolegioprofeAux=new TipoColegioProfe();
			this.tipocolegioprofeAux.setsType(Constantes2.S_TOTALES);
			this.tipocolegioprofeAux.setIsNew(false);
			this.tipocolegioprofeAux.setIsChanged(false);
			this.tipocolegioprofeAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoColegioProfeConstantesFunciones.TotalizarValoresFilaTipoColegioProfe(this.tipocolegioprofeLogic.getTipoColegioProfes(),this.tipocolegioprofeAux);
				
				this.tipocolegioprofeLogic.getTipoColegioProfes().add(this.tipocolegioprofeAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoColegioProfeConstantesFunciones.TotalizarValoresFilaTipoColegioProfe(this.tipocolegioprofes,this.tipocolegioprofeAux);
				
				this.tipocolegioprofes.add(this.tipocolegioprofeAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocolegioprofeTotales=new TipoColegioProfe();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocolegioprofeLogic.getTipoColegioProfes().remove(tipocolegioprofeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocolegioprofes.remove(tipocolegioprofeTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocolegioprofeTotales=new TipoColegioProfe();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoColegioProfe tipocolegioprofe:tipocolegioprofeLogic.getTipoColegioProfes()) {
				if(tipocolegioprofe.getsType().equals(Constantes2.S_TOTALES)) {
					tipocolegioprofeTotales=tipocolegioprofe;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoColegioProfeConstantesFunciones.TotalizarValoresFilaTipoColegioProfe(this.tipocolegioprofeLogic.getTipoColegioProfes(),tipocolegioprofeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoColegioProfe tipocolegioprofe:this.tipocolegioprofes) {
				if(tipocolegioprofe.getsType().equals(Constantes2.S_TOTALES)) {
					tipocolegioprofeTotales=tipocolegioprofe;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoColegioProfeConstantesFunciones.TotalizarValoresFilaTipoColegioProfe(this.tipocolegioprofes,tipocolegioprofeTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoColegioProfesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoColegioProfesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocolegioprofeLogic.getTipoColegioProfesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoColegioProfe() {
		this.isPermisoTodoTipoColegioProfe=false;
		this.isPermisoNuevoTipoColegioProfe=false;
		this.isPermisoActualizarTipoColegioProfe=false;
		this.isPermisoActualizarOriginalTipoColegioProfe=false;
		this.isPermisoEliminarTipoColegioProfe=false;
		this.isPermisoGuardarCambiosTipoColegioProfe=false;
		this.isPermisoConsultaTipoColegioProfe=false;
		this.isPermisoBusquedaTipoColegioProfe=false;
		this.isPermisoReporteTipoColegioProfe=false;		
		this.isPermisoOrdenTipoColegioProfe=false;		
		this.isPermisoPaginacionMedioTipoColegioProfe=false;		
		this.isPermisoPaginacionAltoTipoColegioProfe=false;
		this.isPermisoPaginacionTodoTipoColegioProfe=false;
		this.isPermisoCopiarTipoColegioProfe=false;		
		this.isPermisoVerFormTipoColegioProfe=false;		
		this.isPermisoDuplicarTipoColegioProfe=false;		
		this.isPermisoOrdenTipoColegioProfe=false;		
	}
	
	public void setPermisosUsuarioTipoColegioProfe(Boolean isPermiso) {
		this.isPermisoTodoTipoColegioProfe=isPermiso;
		this.isPermisoNuevoTipoColegioProfe=isPermiso;
		this.isPermisoActualizarTipoColegioProfe=isPermiso;
		this.isPermisoActualizarOriginalTipoColegioProfe=isPermiso;
		this.isPermisoEliminarTipoColegioProfe=isPermiso;
		this.isPermisoGuardarCambiosTipoColegioProfe=isPermiso;
		this.isPermisoConsultaTipoColegioProfe=isPermiso;
		this.isPermisoBusquedaTipoColegioProfe=isPermiso;
		this.isPermisoReporteTipoColegioProfe=isPermiso;
		this.isPermisoOrdenTipoColegioProfe=isPermiso;		
		this.isPermisoPaginacionMedioTipoColegioProfe=isPermiso;		
		this.isPermisoPaginacionAltoTipoColegioProfe=isPermiso;		
		this.isPermisoPaginacionTodoTipoColegioProfe=isPermiso;		
		this.isPermisoCopiarTipoColegioProfe=isPermiso;		
		this.isPermisoVerFormTipoColegioProfe=isPermiso;		
		this.isPermisoDuplicarTipoColegioProfe=isPermiso;
		this.isPermisoOrdenTipoColegioProfe=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoColegioProfe(Boolean isPermiso) {
		//this.isPermisoTodoTipoColegioProfe=isPermiso;
		this.isPermisoNuevoTipoColegioProfe=isPermiso;
		this.isPermisoActualizarTipoColegioProfe=isPermiso;
		this.isPermisoActualizarOriginalTipoColegioProfe=isPermiso;
		this.isPermisoEliminarTipoColegioProfe=isPermiso;
		this.isPermisoGuardarCambiosTipoColegioProfe=isPermiso;
		//this.isPermisoConsultaTipoColegioProfe=isPermiso;
		//this.isPermisoBusquedaTipoColegioProfe=isPermiso;
		//this.isPermisoReporteTipoColegioProfe=isPermiso;
		//this.isPermisoOrdenTipoColegioProfe=isPermiso;		
		//this.isPermisoPaginacionMedioTipoColegioProfe=isPermiso;		
		//this.isPermisoPaginacionAltoTipoColegioProfe=isPermiso;		
		//this.isPermisoPaginacionTodoTipoColegioProfe=isPermiso;		
		//this.isPermisoCopiarTipoColegioProfe=isPermiso;		
		//this.isPermisoDuplicarTipoColegioProfe=isPermiso;
		//this.isPermisoOrdenTipoColegioProfe=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoColegioProfeClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoColegioProfeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoColegioProfe(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoColegioProfeClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoColegioProfeClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoColegioProfeClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoColegioProfeClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoColegioProfe() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoColegioProfeJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoColegioProfeConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoColegioProfe=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoColegioProfe=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoColegioProfe=this.isPermisoActualizarTipoColegioProfe;
			this.isPermisoEliminarTipoColegioProfe=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoColegioProfe=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoColegioProfe=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoColegioProfe=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoColegioProfe=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoColegioProfe=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoColegioProfe=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoColegioProfe=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoColegioProfe=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoColegioProfe=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoColegioProfe=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoColegioProfe=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoColegioProfe=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoColegioProfe=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoColegioProfe.setToolTipText(this.jTableDatosTipoColegioProfe.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoColegioProfe(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoColegioProfe(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoColegioProfeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoColegioProfeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoColegioProfe() throws Exception {
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
	public void inicializarCombosForeignKeyTipoColegioProfeListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoColegioProfeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoColegioProfeJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoColegioProfeListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoColegioProfeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoColegioProfeParameterReturnGeneral tipocolegioprofeReturnGeneral=new TipoColegioProfeParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipocolegioprofeConstantesFunciones.cargarid_empresaTipoColegioProfe)
					 || (this.esRecargarFks && this.tipocolegioprofeConstantesFunciones.cargarid_empresaTipoColegioProfe)) {

					if(!this.tipocolegioprofeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipocolegioprofeSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipocolegioprofeReturnGeneral=tipocolegioprofeLogic.cargarCombosLoteForeignKeyTipoColegioProfe(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipocolegioprofeReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoColegioProfe()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipocolegioprofeSessionBean==null) {
				this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
			}

			if(!this.tipocolegioprofeSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoColegioProfe()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoColegioProfe(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoColegioProfe()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoColegioProfe();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoColegioProfe(TipoColegioProfe tipocolegioprofe)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoColegioProfe(TipoColegioProfe tipocolegioprofe,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoColegioProfe()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoColegioProfe()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoColegioProfe()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoColegioProfe()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoColegioProfe()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoColegioProfe()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoColegioProfe(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoColegioProfe()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe!=null && this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoColegioProfeBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoColegioProfeBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoColegioProfeBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean(); 
		this.tipocolegioprofeConstantesFunciones=new TipoColegioProfeConstantesFunciones(); 
		this.tipocolegioprofeBean=new TipoColegioProfe();//(this.tipocolegioprofeConstantesFunciones); 		
		this.tipocolegioprofeReturnGeneral=new TipoColegioProfeParameterReturnGeneral(); 
		
		this.tipocolegioprofeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocolegioprofeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoColegioProfeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoColegioProfeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoColegioProfeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoColegioProfe(true);
			
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
			
			this.tipocolegioprofeConstantesFunciones=new TipoColegioProfeConstantesFunciones(); 
			this.tipocolegioprofeBean=new TipoColegioProfe();//this.tipocolegioprofeConstantesFunciones); 			
			this.tipocolegioprofeReturnGeneral=new TipoColegioProfeParameterReturnGeneral(); 
		
			TipoColegioProfeBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Colegio Profe Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocolegioprofe=new TipoColegioProfe();
			this.tipocolegioprofes = new ArrayList<TipoColegioProfe>();
			this.tipocolegioprofesAux = new ArrayList<TipoColegioProfe>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic=new TipoColegioProfeLogic();
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocolegioprofeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocolegioprofeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoColegioProfe);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoColegioProfe);	
					}
					
					if(this.jInternalFrameImportacionTipoColegioProfe!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoColegioProfe);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoColegioProfe!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoColegioProfe);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoColegioProfe);
				this.jInternalFrameDetalleFormTipoColegioProfe.setVisible(false);
				this.jInternalFrameDetalleFormTipoColegioProfe.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoColegioProfe);
					this.jInternalFrameReporteDinamicoTipoColegioProfe.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoColegioProfe.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoColegioProfe!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoColegioProfe);
					this.jInternalFrameImportacionTipoColegioProfe.setVisible(false);
					this.jInternalFrameImportacionTipoColegioProfe.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoColegioProfe!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoColegioProfe);
					this.jInternalFrameOrderByTipoColegioProfe.setVisible(false);
					this.jInternalFrameOrderByTipoColegioProfe.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoColegioProfeActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoColegioProfeConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocolegioprofeReturnGeneral=new TipoColegioProfeParameterReturnGeneral();
			
			this.tipocolegioprofeParameterGeneral=new TipoColegioProfeParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocolegioprofeLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoColegioProfeJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoColegioProfeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado(),this.tipocolegioprofeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoColegioProfeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado(),this.tipocolegioprofeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoColegioProfe=false;
			this.isVisibilidadCeldaDuplicarTipoColegioProfe=true;
			this.isVisibilidadCeldaCopiarTipoColegioProfe=true;
			this.isVisibilidadCeldaVerFormTipoColegioProfe=true;
			this.isVisibilidadCeldaOrdenTipoColegioProfe=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
			this.isVisibilidadCeldaModificarTipoColegioProfe=false;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=false;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoColegioProfe("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoColegioProfe();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoColegioProfe(false);
			
			this.setPermisosUsuarioTipoColegioProfe();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocolegioprofeSessionBean.getEsGuardarRelacionado() && this.tipocolegioprofeSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoColegioProfeClasesRelacionadas();
			}
			
			if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoColegioProfeClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoColegioProfe();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoColegioProfe();
			}
			
			if(!this.isPermisoBusquedaTipoColegioProfe) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoColegioProfe,this.isPermisoPaginacionMedioTipoColegioProfe,this.isPermisoPaginacionTodoTipoColegioProfe);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoColegioProfeConstantesFunciones.getTiposSeleccionarTipoColegioProfe());
				
				this.tiposColumnasSelect=TipoColegioProfeConstantesFunciones.getTiposSeleccionarTipoColegioProfe(true);
				
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
			//if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoColegioProfe();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoColegioProfe(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoColegioProfe(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoColegioProfe() ;
			
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
				tipocolegioprofeImplementable= (TipoColegioProfeImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoColegioProfeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocolegioprofeImplementableHome= (TipoColegioProfeImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoColegioProfeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocolegioprofes= new ArrayList<TipoColegioProfe>();
			this.tipocolegioprofesEliminados= new ArrayList<TipoColegioProfe>();
						
			this.isEsNuevoTipoColegioProfe=false;
			this.esParaAccionDesdeFormularioTipoColegioProfe=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoColegioProfe(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoColegioProfe();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoColegioProfeBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoColegioProfeConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoColegioProfe("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoColegioProfe(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoColegioProfe();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoColegioProfe();
			}
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoColegioProfe.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoColegioProfe.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoColegioProfe.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoColegioProfe(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoColegioProfe: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoColegioProfe() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoColegioProfe")) {
				iIndex=this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoColegioProfe();	
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
	
	public void cargarCombosForeignKeyTipoColegioProfe(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoColegioProfe(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoColegioProfe(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoColegioProfeListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoColegioProfe();
		
		this.cargarCombosFrameForeignKeyTipoColegioProfe();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoColegioProfe();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoColegioProfe();
		}
	}
	
	
	
	public void jButtonNuevoTipoColegioProfeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
			
			if(jTableDatosTipoColegioProfe.getRowCount()>=1) {
				jTableDatosTipoColegioProfe.removeRowSelectionInterval(0, jTableDatosTipoColegioProfe.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoColegioProfe=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoColegioProfe(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoColegioProfe(true);			
			//this.tipocolegioprofe=new TipoColegioProfe();
			//this.tipocolegioprofe.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoColegioProfe(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoColegioProfe() ;
			
			if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoColegioProfe(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocolegioprofe);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);				
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
			if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoColegioProfe: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoColegioProfeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoColegioProfe.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoColegioProfe.getSelectedRows().length;			
			}
			
			tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoColegioProfe--;			
				//TipoColegioProfe tipocolegioprofeAux= new TipoColegioProfe();			
				//tipocolegioprofeAux.setId(this.iIdNuevoTipoColegioProfe);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoColegioProfe tipocolegioprofeOrigen=new TipoColegioProfe();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoColegioProfe tipocolegioprofeOrigen : tipocolegioprofesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocolegioprofeOrigen =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocolegioprofeOrigen =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoColegioProfe();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocolegioprofe.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoColegioProfe(tipocolegioprofeOrigen,this.tipocolegioprofe,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocolegioprofeLogic.getTipoColegioProfes().add(this.tipocolegioprofeAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocolegioprofes.add(this.tipocolegioprofeAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoColegioProfe(false);
				
				this.jTableDatosTipoColegioProfe.setRowSelectionInterval(this.getIndiceNuevoTipoColegioProfe(), this.getIndiceNuevoTipoColegioProfe());
				
				int iLastRow =  this.jTableDatosTipoColegioProfe.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoColegioProfe.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoColegioProfe.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoColegioProfe(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();									
		
			TipoColegioProfe tipocolegioprofeOrigen=new TipoColegioProfe();
			TipoColegioProfe tipocolegioprofeDestino=new TipoColegioProfe();
				
			tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoColegioProfe.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocolegioprofesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoColegioProfe.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocolegioprofeOrigen =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocolegioprofeOrigen =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocolegioprofeDestino =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocolegioprofeDestino =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocolegioprofeOrigen =tipocolegioprofesSeleccionados.get(0);
				tipocolegioprofeDestino =tipocolegioprofesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoColegioProfe(tipocolegioprofeOrigen,tipocolegioprofeDestino,true,false);
				
				tipocolegioprofeDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocolegioprofeDestino,tipocolegioprofeLogic.getTipoColegioProfes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocolegioprofeDestino,tipocolegioprofes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoColegioProfe(false);
				
				//this.jTableDatosTipoColegioProfe.setRowSelectionInterval(this.getIndiceNuevoTipoColegioProfe(), this.getIndiceNuevoTipoColegioProfe());
				
				int iLastRow =  this.jTableDatosTipoColegioProfe.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoColegioProfe.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoColegioProfe.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoColegioProfe(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoColegioProfe.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoColegioProfe.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoColegioProfe.setVisible(!isVisible);
			this.jPanelPaginacionTipoColegioProfe.setVisible(!isVisible);
			this.jPanelAccionesTipoColegioProfe.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoColegioProfe();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoColegioProfe();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoColegioProfe();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoColegioProfe();
			
			this.abrirFrameOrderByTipoColegioProfe();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoColegioProfe();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoColegioProfe(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoColegioProfe);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoColegioProfe.isMaximum()) {
					this.jInternalFrameDetalleFormTipoColegioProfe.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoColegioProfe.setSize(this.jInternalFrameDetalleFormTipoColegioProfe.iWidthFormulario,this.jInternalFrameDetalleFormTipoColegioProfe.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoColegioProfe.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoColegioProfe.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoColegioProfe.isMaximum()) {
						this.jInternalFrameDetalleFormTipoColegioProfe.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoColegioProfe.jContentPaneDetalleTipoColegioProfe.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoColegioProfe.jContentPaneDetalleTipoColegioProfe.getWidth(),TipoColegioProfeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoColegioProfe.jContentPaneDetalleTipoColegioProfe.getWidth(),TipoColegioProfeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoColegioProfe.jContentPaneDetalleTipoColegioProfe.getWidth(),TipoColegioProfeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoColegioProfe.setVisible(true);
	        this.jInternalFrameDetalleFormTipoColegioProfe.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoColegioProfe() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoColegioProfe==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoColegioProfe=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoColegioProfe,false,this);
				} else {
					this.jInternalFrameOrderByTipoColegioProfe=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoColegioProfe,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoColegioProfe);
				this.jInternalFrameOrderByTipoColegioProfe.setVisible(false);
				this.jInternalFrameOrderByTipoColegioProfe.setSelected(false);
				
				this.jInternalFrameOrderByTipoColegioProfe.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoColegioProfe"));
				
				this.inicializarActualizarBindingTablaOrderByTipoColegioProfe();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoColegioProfe() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoColegioProfe==null) {
				
				this.jInternalFrameImportacionTipoColegioProfe=new ImportacionJInternalFrame(TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoColegioProfe);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoColegioProfe);
				this.jInternalFrameImportacionTipoColegioProfe.setVisible(false);
				this.jInternalFrameImportacionTipoColegioProfe.setSelected(false);


				this.jInternalFrameImportacionTipoColegioProfe.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoColegioProfe"));
				this.jInternalFrameImportacionTipoColegioProfe.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoColegioProfe"));
				this.jInternalFrameImportacionTipoColegioProfe.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoColegioProfe"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoColegioProfe() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoColegioProfe==null) {
				this.jInternalFrameReporteDinamicoTipoColegioProfe=new ReporteDinamicoJInternalFrame(TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoColegioProfe);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoColegioProfe);
				this.jInternalFrameReporteDinamicoTipoColegioProfe.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoColegioProfe.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoColegioProfe"));
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoColegioProfe"));
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoColegioProfe"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoColegioProfe();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoColegioProfe() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoColegioProfe);
			
	       	this.jInternalFrameDetalleFormTipoColegioProfe.setVisible(false);
	        this.jInternalFrameDetalleFormTipoColegioProfe.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoColegioProfe.dispose();
			//this.jInternalFrameDetalleFormTipoColegioProfe=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoColegioProfe() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoColegioProfe.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoColegioProfe.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoColegioProfe() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoColegioProfe.setVisible(true);
	        this.jInternalFrameImportacionTipoColegioProfe.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoColegioProfe() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoColegioProfe.setVisible(true);
	        this.jInternalFrameOrderByTipoColegioProfe.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoColegioProfe() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoColegioProfe.setVisible(false);
	        this.jInternalFrameOrderByTipoColegioProfe.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoColegioProfe() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoColegioProfe.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoColegioProfe.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoColegioProfe() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoColegioProfe.setVisible(false);
	        this.jInternalFrameImportacionTipoColegioProfe.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoColegioProfe(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoColegioProfe(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoColegioProfe(true);
			//this.isEsNuevoTipoColegioProfe=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoColegioProfe("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoColegioProfe(false) ;
			
			if(tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoColegioProfe(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoColegioProfe(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoColegioProfeActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoColegioProfe(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoColegioProfe(true);
			//this.isEsNuevoTipoColegioProfe=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocolegioprofe.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoColegioProfe("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoColegioProfe(false) ;
			
			if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoColegioProfe(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoColegioProfe(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoColegioProfe(false);
			
			//if(!this.isEsNuevoTipoColegioProfe) {								
				int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
				
			}
			
			if(this.permiteMantenimiento(this.tipocolegioprofe)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoColegioProfe=true;
					this.inicializarActualizarBindingTablaTipoColegioProfe(false);
					this.isEsNuevoTipoColegioProfe=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoColegioProfe=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoColegioProfe=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoColegioProfe(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoColegioProfe(false);
				
				this.habilitarDeshabilitarControlesTipoColegioProfe(false);
			
												
				
				if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoColegioProfe();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoColegioProfeActionPerformed(evt,tipocolegioprofeSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoColegioProfe(this.tipocolegioprofe,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoColegioProfe.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocolegioprofeSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocolegioprofe.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				this.tipocolegioprofe.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				this.tipocolegioprofe.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocolegioprofe)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoColegioProfeModel) this.jTableDatosTipoColegioProfe.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoColegioProfe=true;
				this.inicializarActualizarBindingTablaTipoColegioProfe(false);
				this.isEsNuevoTipoColegioProfe=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoColegioProfe(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoColegioProfe(false);
				
				this.habilitarDeshabilitarControlesTipoColegioProfe(false);
				
				
				
				if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoColegioProfe();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoColegioProfe.getRowCount()>=1) {
				jTableDatosTipoColegioProfe.removeRowSelectionInterval(0, jTableDatosTipoColegioProfe.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoColegioProfe(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoColegioProfe(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoColegioProfe(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoColegioProfe(false) ;
			
			this.isEsNuevoTipoColegioProfe=false;
			
			if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoColegioProfe();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoColegioProfe(false);
				
				//SI ES MANUAL
				if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoColegioProfe();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoColegioProfe--;			
			//TipoColegioProfe tipocolegioprofeAux= new TipoColegioProfe();			
			//tipocolegioprofeAux.setId(this.iIdNuevoTipoColegioProfe);
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoColegioProfe();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
			
			this.tipocolegioprofe.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocolegioprofeLogic.getTipoColegioProfes().add(this.tipocolegioprofeAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocolegioprofes.add(this.tipocolegioprofeAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoColegioProfe(false);
			
			this.jTableDatosTipoColegioProfe.setRowSelectionInterval(this.getIndiceNuevoTipoColegioProfe(), this.getIndiceNuevoTipoColegioProfe());
			
			int iLastRow =  this.jTableDatosTipoColegioProfe.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoColegioProfe.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoColegioProfe.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoColegioProfe(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoColegioProfe(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoColegioProfe(false);
			
			//SI ES MANUAL
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoColegioProfe();
			}
			
			//this.abrirFrameTreeTipoColegioProfe();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Colegio ProfeS ?", "MANTENIMIENTO DE Tipo Colegio Profe", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoColegioProfe.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoColegioProfe();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocolegioprofeReturnGeneral=tipocolegioprofeLogic.procesarImportacionTipoColegioProfesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocolegioprofeParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoColegioProfeReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoColegioProfe.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoColegioProfe.setFileImportacion(this.jInternalFrameImportacionTipoColegioProfe.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoColegioProfe.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoColegioProfe.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoColegioProfe.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoColegioProfe.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		

		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoColegioProfeBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoColegioProfeBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoColegioProfes("Todos",tipocolegioprofesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoColegioProfeConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoColegioProfeConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoColegioProfe.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocolegioprofe";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoColegioProfes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoColegioProfe tipocolegioprofe:tipocolegioprofesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocolegioprofe.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoColegioProfe tipocolegioprofe:tipocolegioprofesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocolegioprofe.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoColegioProfeConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoColegioProfe tipocolegioprofe:tipocolegioprofesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocolegioprofe.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoColegioProfe(row);				
			//	iRow++;
			//}				
			
			//for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoColegioProfe(tipocolegioprofeAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoColegioProfe(false);
			
			//SI ES MANUAL
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoColegioProfe();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoColegioProfe(false);
			
			//SI ES MANUAL
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoColegioProfe();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoColegioProfe(false);
			
			//SI ES MANUAL
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoColegioProfe();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoColegioProfe() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoColegioProfe.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoColegioProfe.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoColegioProfe.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoColegioProfe.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoColegioProfe.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoColegioProfe.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoColegioProfe.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoColegioProfe(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoColegioProfe(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoColegioProfe(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoColegioProfe(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoColegioProfe(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoColegioProfe(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoColegioProfe(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoColegioProfe(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoColegioProfe() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoColegioProfe();
		
		this.inicializarActualizarBindingBotonesManualTipoColegioProfe(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoColegioProfe();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoColegioProfe() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoColegioProfe(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoColegioProfe(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoColegioProfe.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoColegioProfe.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoColegioProfe.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoColegioProfe.jCheckBoxPostAccionNuevoTipoColegioProfe.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoColegioProfe.jCheckBoxPostAccionSinCerrarTipoColegioProfe.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoColegioProfe.jCheckBoxPostAccionSinMensajeTipoColegioProfe.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoColegioProfe.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoColegioProfe.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoColegioProfe.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
				this.jInternalFrameDetalleFormTipoColegioProfe.jCheckBoxPostAccionNuevoTipoColegioProfe.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoColegioProfe.jCheckBoxPostAccionSinCerrarTipoColegioProfe.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoColegioProfe.jCheckBoxPostAccionSinMensajeTipoColegioProfe.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoColegioProfe.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoColegioProfe.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoColegioProfe.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoColegioProfe.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoColegioProfe.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoColegioProfe.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoColegioProfe.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoColegioProfe.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoColegioProfe.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoColegioProfe(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoColegioProfe(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoColegioProfe() throws Exception {
		try	{
			if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoColegioProfe();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoColegioProfe() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoColegioProfe() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoColegioProfe.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoColegioProfe.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoColegioProfe.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoColegioProfe.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoColegioProfe.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoColegioProfe.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoColegioProfe.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoColegioProfe.addItem(reporte);
			}
			
			
			if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoColegioProfe.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoColegioProfe.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoColegioProfe.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoColegioProfe.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoColegioProfe.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoColegioProfe.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoColegioProfe.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoColegioProfe.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoColegioProfe.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoColegioProfe();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoColegioProfe() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoColegioProfe.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoColegioProfe.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoColegioProfe()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoColegioProfe(Boolean esInicializar) throws Exception {				
		if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoColegioProfe();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoColegioProfe() throws Exception {
		this.inicializarActualizarBindingTablaTipoColegioProfe(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoColegioProfe() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoColegioProfeOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfeOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoColegioProfe(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocolegioprofeLogic.getTipoColegioProfes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocolegioprofes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoColegioProfe.setModel(new TipoColegioProfeModel(this.tipocolegioprofeLogic.getTipoColegioProfes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoColegioProfe.setModel(new TipoColegioProfeModel(this.tipocolegioprofes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoColegioProfe!=null && this.jInternalFrameOrderByTipoColegioProfe.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoColegioProfe();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfe,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO,tipocolegioprofeConstantesFunciones.resaltarSeleccionarTipoColegioProfe,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoColegioProfeConstantesFunciones.SCLASSWEBTITULO,tipocolegioprofeConstantesFunciones.resaltarSeleccionarTipoColegioProfe,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfe,TipoColegioProfeConstantesFunciones.LABEL_ID));

		if(this.tipocolegioprofeConstantesFunciones.mostraridTipoColegioProfe && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoColegioProfeConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocolegioprofeConstantesFunciones.resaltaridTipoColegioProfe,this.tipocolegioprofeConstantesFunciones.activaridTipoColegioProfe,this,true,"idTipoColegioProfe","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocolegioprofeConstantesFunciones.resaltaridTipoColegioProfe,this.tipocolegioprofeConstantesFunciones.activaridTipoColegioProfe,this,true,"idTipoColegioProfe","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfe,TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipocolegioprofeConstantesFunciones.mostrarid_empresaTipoColegioProfe && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipocolegioprofeConstantesFunciones.resaltarid_empresaTipoColegioProfe,this,this.tipocolegioprofeConstantesFunciones.activarid_empresaTipoColegioProfe));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipocolegioprofeConstantesFunciones.resaltarid_empresaTipoColegioProfe,this,this.tipocolegioprofeConstantesFunciones.activarid_empresaTipoColegioProfe,false,"id_empresaTipoColegioProfe","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfe,TipoColegioProfeConstantesFunciones.LABEL_CODIGO));

		if(this.tipocolegioprofeConstantesFunciones.mostrarcodigoTipoColegioProfe && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoColegioProfeConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocolegioprofeConstantesFunciones.resaltarcodigoTipoColegioProfe,this.tipocolegioprofeConstantesFunciones.activarcodigoTipoColegioProfe,this,true,"codigoTipoColegioProfe","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocolegioprofeConstantesFunciones.resaltarcodigoTipoColegioProfe,this.tipocolegioprofeConstantesFunciones.activarcodigoTipoColegioProfe,this,true,"codigoTipoColegioProfe","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfe,TipoColegioProfeConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocolegioprofeConstantesFunciones.mostrarnombreTipoColegioProfe && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoColegioProfeConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocolegioprofeConstantesFunciones.resaltarnombreTipoColegioProfe,this.tipocolegioprofeConstantesFunciones.activarnombreTipoColegioProfe,this,true,"nombreTipoColegioProfe","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocolegioprofeConstantesFunciones.resaltarnombreTipoColegioProfe,this.tipocolegioprofeConstantesFunciones.activarnombreTipoColegioProfe,this,true,"nombreTipoColegioProfe","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoColegioProfePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoColegioProfe.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoColegioProfe.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoColegioProfe.addColumn(tableColumn);
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
			
			this.jTableDatosTipoColegioProfe.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoColegioProfe.moveColumn(this.jTableDatosTipoColegioProfe.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoColegioProfe.moveColumn(this.jTableDatosTipoColegioProfe.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoColegioProfe.moveColumn(this.jTableDatosTipoColegioProfe.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoColegioProfe.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoColegioProfe.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoColegioProfe,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoColegioProfe.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoColegioProfe.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoColegioProfe.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoColegioProfe.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocolegioprofeLogic.getTipoColegioProfes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocolegioprofes.size()-1;
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
		//this.jTableDatosTipoColegioProfe.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoColegioProfe.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoColegioProfe();
			
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
				
				//this.isEsNuevoTipoColegioProfe=false;
					
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
				if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoColegioProfe==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoColegioProfe.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoColegioProfe.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocolegioprofe.getsType().equals("DUPLICADO")
				   || this.tipocolegioprofe.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoColegioProfe=true;
				
				} else {
					this.isEsNuevoTipoColegioProfe=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocolegioprofe.getId()>=0 && !this.tipocolegioprofe.getIsNew()) {						
						this.isEsNuevoTipoColegioProfe=false;
						
					} else {
						this.isEsNuevoTipoColegioProfe=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoColegioProfe(esRelaciones);						
				
				this.seleccionarTipoColegioProfe(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocolegioprofe.getId()<0) {
					this.isEsNuevoTipoColegioProfe=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoColegioProfe(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoColegioProfe(evt,rowIndex);
				}	
				
				if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoColegioProfe: " + this.dDif); 
					}
				}								
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoColegioProfe(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocolegioprofe)) {
					if(this.tipocolegioprofe.getId()>0) {
						this.tipocolegioprofe.setIsDeleted(true);
						
						this.tipocolegioprofesEliminados.add(this.tipocolegioprofe);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocolegioprofeLogic.getTipoColegioProfes().remove(this.tipocolegioprofe);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocolegioprofes.remove(this.tipocolegioprofe);				
					}
					
					
					((TipoColegioProfeModel) this.jTableDatosTipoColegioProfe.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoColegioProfe(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoColegioProfe(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoColegioProfe) {
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoColegioProfe.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoColegioProfe.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoColegioProfe(this.tipocolegioprofe);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipocolegioprofeConstantesFunciones.cargarid_empresaTipoColegioProfe || this.tipocolegioprofeConstantesFunciones.event_dependid_empresaTipoColegioProfe) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipocolegioprofe.getid_empresa());
									//this.inicializarActualizarBindingTipoColegioProfe(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipocolegioprofe.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipocolegioprofe.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipocolegioprofe.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoColegioProfe("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoColegioProfe(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoColegioProfe() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoColegioProfe(TipoColegioProfe tipocolegioprofe) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoColegioProfe(tipocolegioprofe,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoColegioProfe(TipoColegioProfe tipocolegioprofe,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoColegioProfe(tipocolegioprofe);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoColegioProfe(tipocolegioprofe,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoColegioProfe(tipocolegioprofe);
	}
	
	public void setVariablesObjetoActualToFormularioTipoColegioProfe(TipoColegioProfe tipocolegioprofe) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.setText(tipocolegioprofe.getId().toString());
			this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.setText(tipocolegioprofe.getcodigo());
			this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.setText(tipocolegioprofe.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoColegioProfe tipocolegioprofeLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocolegioprofeLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoColegioProfe tipocolegioprofeLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocolegioprofeLocal=this.tipocolegioprofe;
			} else {
				tipocolegioprofeLocal=this.tipocolegioprofeAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocolegioprofeLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoColegioProfe(tipocolegioprofeLocal,true);
					
					if(tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocolegioprofeLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocolegioprofeLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoColegioProfe(TipoColegioProfe tipocolegioprofe,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoColegioProfe(tipocolegioprofe,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(tipocolegioprofe);
	}
	
	public void setVariablesFormularioToObjetoActualTipoColegioProfe(TipoColegioProfe tipocolegioprofe,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoColegioProfe(tipocolegioprofe,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoColegioProfe(TipoColegioProfe tipocolegioprofe,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.getText()==null || this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.getText()=="" || this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.setText("0");
			}

			if(conColumnasBase) {tipocolegioprofe.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoColegioProfeConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelIdTipoColegioProfe,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocolegioprofe.setcodigo(this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoColegioProfeConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelcodigoTipoColegioProfe,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocolegioprofe.setnombre(this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoColegioProfeConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoColegioProfe.jLabelnombreTipoColegioProfe,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoColegioProfe(TipoColegioProfe tipocolegioprofeBean,TipoColegioProfe tipocolegioprofe,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoColegioProfe(TipoColegioProfe tipocolegioprofeOrigen,TipoColegioProfe tipocolegioprofe,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocolegioprofeOrigen.getId()!=null && !tipocolegioprofeOrigen.getId().equals(0L))) {tipocolegioprofe.setId(tipocolegioprofeOrigen.getId());}}
			if(conDefault || (!conDefault && tipocolegioprofeOrigen.getcodigo()!=null && !tipocolegioprofeOrigen.getcodigo().equals(""))) {tipocolegioprofe.setcodigo(tipocolegioprofeOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocolegioprofeOrigen.getnombre()!=null && !tipocolegioprofeOrigen.getnombre().equals(""))) {tipocolegioprofe.setnombre(tipocolegioprofeOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoColegioProfe(TipoColegioProfe tipocolegioprofe) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.setText(tipocolegioprofe.getId().toString());
			this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.setText(tipocolegioprofe.getcodigo());
			this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.setText(tipocolegioprofe.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoColegioProfe(TipoColegioProfeBean tipocolegioprofeBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.setText(tipocolegioprofeBean.getId().toString());
			this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.setText(tipocolegioprofeBean.getcodigo());
			this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.setText(tipocolegioprofeBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoColegioProfe(TipoColegioProfeParameterReturnGeneral tipocolegioprofeReturnGeneral,TipoColegioProfeBean tipocolegioprofeBean,Boolean conDefault) throws Exception { 
		try {
			TipoColegioProfe tipocolegioprofeLocal=new TipoColegioProfe();
			
			tipocolegioprofeLocal=tipocolegioprofeReturnGeneral.getTipoColegioProfe();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocolegioprofeLocal.getId()!=null && !tipocolegioprofeLocal.getId().equals(0L))) {tipocolegioprofeBean.setId(tipocolegioprofeLocal.getId());}}
			if(conDefault || (!conDefault && tipocolegioprofeLocal.getcodigo()!=null && !tipocolegioprofeLocal.getcodigo().equals(""))) {tipocolegioprofeBean.setcodigo(tipocolegioprofeLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocolegioprofeLocal.getnombre()!=null && !tipocolegioprofeLocal.getnombre().equals(""))) {tipocolegioprofeBean.setnombre(tipocolegioprofeLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoColegioProfeGenerico(Long idTipoColegioProfeSeleccionado,JComboBox jComboBoxTipoColegioProfe,List<TipoColegioProfe> tipocolegioprofesLocal)throws Exception {
		try {
			TipoColegioProfe  tipocolegioprofeTemp=null;

			for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofesLocal) {
				if(tipocolegioprofeAux.getId()!=null && tipocolegioprofeAux.getId().equals(idTipoColegioProfeSeleccionado)) {
					tipocolegioprofeTemp=tipocolegioprofeAux;
					break;
				}
			}

			jComboBoxTipoColegioProfe.setSelectedItem(tipocolegioprofeTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoColegioProfeGenerico(JComboBox jComboBoxTipoColegioProfe,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoColegioProfe.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoColegioProfe.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoColegioProfe.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoColegioProfe.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoColegioProfe.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoColegioProfe.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocolegioprofe=(TipoColegioProfe) tipocolegioprofeLogic.getTipoColegioProfes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocolegioprofe =(TipoColegioProfe) tipocolegioprofes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipocolegioprofe.getIsNew() && !tipocolegioprofe.getIsChanged() && !tipocolegioprofe.getIsDeleted()) {
				sDescripcion=tipocolegioprofe.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipocolegioprofe.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoColegioProfe tipocolegioprofeRow=new TipoColegioProfe();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocolegioprofeRow=(TipoColegioProfe) tipocolegioprofeLogic.getTipoColegioProfes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocolegioprofeRow=(TipoColegioProfe) tipocolegioprofes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoColegioProfe(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe));			
			this.jButtonDuplicarTipoColegioProfe.setVisible((this.isVisibilidadCeldaDuplicarTipoColegioProfe && this.isPermisoDuplicarTipoColegioProfe));			
			this.jButtonCopiarTipoColegioProfe.setVisible((this.isVisibilidadCeldaCopiarTipoColegioProfe && this.isPermisoCopiarTipoColegioProfe));
			this.jButtonVerFormTipoColegioProfe.setVisible((this.isVisibilidadCeldaVerFormTipoColegioProfe && this.isPermisoVerFormTipoColegioProfe));
			
			this.jButtonAbrirOrderByTipoColegioProfe.setVisible((this.isVisibilidadCeldaOrdenTipoColegioProfe && this.isPermisoOrdenTipoColegioProfe));			
			
			this.jButtonNuevoRelacionesTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe));			
			this.jButtonNuevoGuardarCambiosTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarTipoColegioProfe.setVisible((this.isVisibilidadCeldaModificarTipoColegioProfe && this.isPermisoActualizarTipoColegioProfe));	
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarTipoColegioProfe.setVisible((this.isVisibilidadCeldaActualizarTipoColegioProfe && this.isPermisoActualizarTipoColegioProfe));	
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarTipoColegioProfe.setVisible((this.isVisibilidadCeldaEliminarTipoColegioProfe && this.isPermisoEliminarTipoColegioProfe));
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarTipoColegioProfe.setVisible(this.isVisibilidadCeldaCancelarTipoColegioProfe);							
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.setVisible((this.isVisibilidadCeldaGuardarTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoColegioProfe.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe));						
			this.jButtonDuplicarToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaDuplicarTipoColegioProfe && this.isPermisoDuplicarTipoColegioProfe));						
			this.jButtonCopiarToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaCopiarTipoColegioProfe && this.isPermisoCopiarTipoColegioProfe));			
			this.jButtonVerFormToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaVerFormTipoColegioProfe && this.isPermisoVerFormTipoColegioProfe));			
			this.jButtonAbrirOrderByToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaOrdenTipoColegioProfe && this.isPermisoOrdenTipoColegioProfe));
			this.jButtonNuevoRelacionesToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe));			
			this.jButtonNuevoGuardarCambiosToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));			
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaModificarTipoColegioProfe && this.isPermisoActualizarTipoColegioProfe));	
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaActualizarTipoColegioProfe  && this.isPermisoActualizarTipoColegioProfe));	
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaEliminarTipoColegioProfe && this.isPermisoEliminarTipoColegioProfe));
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarToolBarTipoColegioProfe.setVisible(this.isVisibilidadCeldaCancelarTipoColegioProfe);				
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaGuardarTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoColegioProfe.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe));			
			this.jMenuItemDuplicarTipoColegioProfe.setVisible((this.isVisibilidadCeldaDuplicarTipoColegioProfe && this.isPermisoDuplicarTipoColegioProfe));			
			this.jMenuItemCopiarTipoColegioProfe.setVisible((this.isVisibilidadCeldaCopiarTipoColegioProfe && this.isPermisoCopiarTipoColegioProfe));			
			this.jMenuItemVerFormTipoColegioProfe.setVisible((this.isVisibilidadCeldaVerFormTipoColegioProfe && this.isPermisoVerFormTipoColegioProfe));			
			this.jMenuItemAbrirOrderByTipoColegioProfe.setVisible((this.isVisibilidadCeldaOrdenTipoColegioProfe && this.isPermisoOrdenTipoColegioProfe));			
			//this.jMenuItemMostrarOcultarTipoColegioProfe.setVisible((this.isVisibilidadCeldaOrdenTipoColegioProfe && this.isPermisoOrdenTipoColegioProfe));
			this.jMenuItemDetalleAbrirOrderByTipoColegioProfe.setVisible((this.isVisibilidadCeldaOrdenTipoColegioProfe && this.isPermisoOrdenTipoColegioProfe));			
			//this.jMenuItemDetalleMostrarOcultarTipoColegioProfe.setVisible((this.isVisibilidadCeldaOrdenTipoColegioProfe && this.isPermisoOrdenTipoColegioProfe));			
			this.jMenuItemNuevoRelacionesTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe));			
			this.jMenuItemNuevoGuardarCambiosTipoColegioProfe.setVisible((this.isVisibilidadCeldaNuevoTipoColegioProfe && this.isPermisoNuevoTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));									
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemModificarTipoColegioProfe.setVisible((this.isVisibilidadCeldaModificarTipoColegioProfe && this.isPermisoActualizarTipoColegioProfe));	
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemActualizarTipoColegioProfe.setVisible((this.isVisibilidadCeldaActualizarTipoColegioProfe && this.isPermisoActualizarTipoColegioProfe));	
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemEliminarTipoColegioProfe.setVisible((this.isVisibilidadCeldaEliminarTipoColegioProfe && this.isPermisoEliminarTipoColegioProfe));
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemCancelarTipoColegioProfe.setVisible(this.isVisibilidadCeldaCancelarTipoColegioProfe);				
			}
			
			this.jMenuItemGuardarCambiosTipoColegioProfe.setVisible((this.isVisibilidadCeldaGuardarTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));						
			this.jMenuItemGuardarCambiosTablaTipoColegioProfe.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=this.jButtonNuevoTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaDuplicarTipoColegioProfe=this.jButtonDuplicarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaCopiarTipoColegioProfe=this.jButtonCopiarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaVerFormTipoColegioProfe=this.jButtonVerFormTipoColegioProfe.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoColegioProfe=this.jButtonAbrirOrderByTipoColegioProfe.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=this.jButtonNuevoRelacionesTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaModificarTipoColegioProfe=this.jButtonModificarTipoColegioProfe.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.isVisibilidadCeldaActualizarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaEliminarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaCancelarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaGuardarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=this.jButtonGuardarCambiosTablaTipoColegioProfe.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoColegioProfe=this.jButtonNuevoToolBarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=this.jButtonNuevoRelacionesToolBarTipoColegioProfe.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.isVisibilidadCeldaModificarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarToolBarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaActualizarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarToolBarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaEliminarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarToolBarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaCancelarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarToolBarTipoColegioProfe.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoColegioProfe=this.jButtonGuardarCambiosToolBarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=this.jButtonGuardarCambiosTablaToolBarTipoColegioProfe.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoColegioProfe=this.jMenuItemNuevoTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=this.jMenuItemNuevoRelacionesTipoColegioProfe.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.isVisibilidadCeldaModificarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemModificarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaActualizarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemActualizarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaEliminarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemEliminarTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaCancelarTipoColegioProfe=this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemCancelarTipoColegioProfe.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoColegioProfe=this.jMenuItemGuardarCambiosTipoColegioProfe.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=this.jMenuItemGuardarCambiosTablaTipoColegioProfe.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoColegioProfe(Boolean esInicializar) {
		if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoColegioProfe();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoColegioProfe(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoColegioProfe() {
		this.jButtonNuevoTipoColegioProfe.setVisible(this.isPermisoNuevoTipoColegioProfe);			
		this.jButtonDuplicarTipoColegioProfe.setVisible(this.isPermisoDuplicarTipoColegioProfe);			
		this.jButtonCopiarTipoColegioProfe.setVisible(this.isPermisoCopiarTipoColegioProfe);			
		this.jButtonVerFormTipoColegioProfe.setVisible(this.isPermisoVerFormTipoColegioProfe);			
		
		this.jButtonAbrirOrderByTipoColegioProfe.setVisible(this.isPermisoOrdenTipoColegioProfe);					
		
		this.jButtonNuevoRelacionesTipoColegioProfe.setVisible(this.isPermisoNuevoTipoColegioProfe);			
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarTipoColegioProfe.setVisible(this.isPermisoActualizarTipoColegioProfe);	
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarTipoColegioProfe.setVisible(this.isPermisoActualizarTipoColegioProfe);	
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarTipoColegioProfe.setVisible(this.isPermisoEliminarTipoColegioProfe);
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarTipoColegioProfe.setVisible(this.isVisibilidadCeldaCancelarTipoColegioProfe);						
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.setVisible(this.isPermisoGuardarCambiosTipoColegioProfe);							
		}
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe.setVisible(this.isPermisoActualizarTipoColegioProfe);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoColegioProfe() {
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarTipoColegioProfe.setVisible(this.isPermisoActualizarTipoColegioProfe);	
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarTipoColegioProfe.setVisible(this.isPermisoActualizarTipoColegioProfe);	
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarTipoColegioProfe.setVisible(this.isPermisoEliminarTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarTipoColegioProfe.setVisible(this.isVisibilidadCeldaCancelarTipoColegioProfe);							
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.setVisible((this.isVisibilidadCeldaGuardarTipoColegioProfe && this.isPermisoGuardarCambiosTipoColegioProfe));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoColegioProfe() {
		if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoColegioProfe();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoColegioProfe() {
	}
	
	public void jTableDatosTipoColegioProfeListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoColegioProfe(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoColegioProfeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.gettipocolegioprofe(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocolegioprofe==null) {
						this.tipocolegioprofe = new TipoColegioProfe();
					}

					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
				}

				if(this.tipocolegioprofe.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocolegioprofe.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoColegioProfe(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoColegioProfeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoColegioProfe(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoColegioProfe.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoColegioProfe.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.gettipocolegioprofe(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipocolegioprofeLogic.getConnexion());

				if(this.tipocolegioprofe.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipocolegioprofe.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoColegioProfe=(TitledBorder)this.jScrollPanelDatosTipoColegioProfe.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoColegioProfe.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoColegioProfeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.gettipocolegioprofe(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocolegioprofe==null) {
						this.tipocolegioprofe = new TipoColegioProfe();
					}

					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
				}

				if(this.tipocolegioprofe.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipocolegioprofe.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoColegioProfe(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoColegioProfeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.gettipocolegioprofe(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocolegioprofe==null) {
						this.tipocolegioprofe = new TipoColegioProfe();
					}

					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
				}

				if(this.tipocolegioprofe.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocolegioprofe.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoColegioProfe(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoColegioProfeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.gettipocolegioprofe(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocolegioprofe==null) {
						this.tipocolegioprofe = new TipoColegioProfe();
					}

					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);
				}

				if(this.tipocolegioprofe.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocolegioprofe.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoColegioProfe(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoColegioProfeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoColegioProfe(false,false);

			this.getTipoColegioProfesFK_IdEmpresa();

			this.inicializarActualizarBindingTipoColegioProfe(false);

			//if(TipoColegioProfeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoColegioProfe(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocolegioprofeLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoColegioProfe() {
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
			this.jInternalFrameDetalleFormTipoColegioProfe.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoColegioProfe.dispose();
			this.jInternalFrameDetalleFormTipoColegioProfe=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
			this.jInternalFrameReporteDinamicoTipoColegioProfe.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoColegioProfe.dispose();
			this.jInternalFrameReporteDinamicoTipoColegioProfe=null;
		}
		
		if(this.jInternalFrameImportacionTipoColegioProfe!=null) {
			this.jInternalFrameImportacionTipoColegioProfe.setVisible(false);	    			
			this.jInternalFrameImportacionTipoColegioProfe.dispose();
			this.jInternalFrameImportacionTipoColegioProfe=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoColegioProfe();
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoColegioProfe")) {
				jButtonDuplicarTipoColegioProfeActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoColegioProfe")) {
				jButtonCopiarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoColegioProfe")) {
				jButtonVerFormTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoColegioProfe")) {
				jButtonDuplicarTipoColegioProfeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoColegioProfe")) {
				jButtonDuplicarTipoColegioProfeActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoColegioProfe")) {
				jButtonModificarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoColegioProfe")) {
				jButtonModificarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoColegioProfe")) {
				jButtonModificarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoColegioProfe")) {
				jButtonActualizarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoColegioProfe")) {
				jButtonActualizarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoColegioProfe")) {
				jButtonActualizarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoColegioProfe")) {
				jButtonEliminarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoColegioProfe")) {
				jButtonEliminarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoColegioProfe")) {
				jButtonEliminarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoColegioProfe")) {
				jButtonCancelarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoColegioProfe")) {
				jButtonCancelarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoColegioProfe")) {
				jButtonCancelarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoColegioProfe")) {
				jButtonCerrarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoColegioProfe")) {
				jButtonCerrarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoColegioProfe")) {
				jButtonCerrarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoColegioProfe")) {
				jButtonMostrarOcultarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoColegioProfe")) {
				jButtonCancelarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoColegioProfe")) {
				jButtonCopiarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoColegioProfe")) {
				jButtonVerFormTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoColegioProfe")) {
				jButtonCopiarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoColegioProfe")) {
				jButtonVerFormTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoColegioProfe")) {
				jButtonRecargarInformacionTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoColegioProfe")) {
				jButtonRecargarInformacionTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoColegioProfe")) {
				jButtonRecargarInformacionTipoColegioProfeActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoColegioProfe")) {
				jButtonAnterioresTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoColegioProfe")) {
				jButtonAnterioresTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoColegioProfe")) {
				jButtonAnterioresTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoColegioProfe")) {
				jButtonSiguientesTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoColegioProfe")) {
				jButtonSiguientesTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoColegioProfe")) {
				jButtonSiguientesTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoColegioProfe") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoColegioProfe")) {
				jButtonAbrirOrderByTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoColegioProfe") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoColegioProfe")) {
				jButtonMostrarOcultarTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoColegioProfe")) {
				jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoColegioProfe")) {
				jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoColegioProfe")) {
				jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoColegioProfe")) {
				jButtonCerrarReporteDinamicoTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoColegioProfe")) {
				jButtonGenerarReporteDinamicoTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoColegioProfe")) {
				
				jButtonGenerarExcelReporteDinamicoTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoColegioProfe")) {
				jButtonCerrarImportacionTipoColegioProfeActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoColegioProfe")) {
				
				jButtonGenerarImportacionTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoColegioProfe")) {
				
				jButtonAbrirImportacionTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoColegioProfe")) {
				jComboBoxTiposAccionesTipoColegioProfeActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoColegioProfe")) {
				jComboBoxTiposRelacionesTipoColegioProfeActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoColegioProfe")) {
				jComboBoxTiposAccionesTipoColegioProfeActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoColegioProfe")) {
				
				jComboBoxTiposSeleccionarTipoColegioProfeActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoColegioProfe")) {
				jTextFieldValorCampoGeneralTipoColegioProfeActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoColegioProfe")) {
				jButtonAbrirOrderByTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoColegioProfe")) {
				jButtonAbrirOrderByTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoColegioProfe")) {
				jButtonCerrarOrderByTipoColegioProfeActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoColegioProfeBusqueda")) {
				this.jButtonidTipoColegioProfeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoColegioProfeUpdate")) {
				this.jButtonid_empresaTipoColegioProfeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoColegioProfeBusqueda")) {
				this.jButtonid_empresaTipoColegioProfeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoColegioProfeBusqueda")) {
				this.jButtoncodigoTipoColegioProfeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoColegioProfeBusqueda")) {
				this.jButtonnombreTipoColegioProfeBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoColegioProfe();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoColegioProfeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoColegioProfe tipocolegioprofeLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocolegioprofeLocal=this.tipocolegioprofe;
			} else {
				tipocolegioprofeLocal=this.tipocolegioprofeAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
							
				
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
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
			
			


			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoColegioProfeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
								
						
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
								
				
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
							
				
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoColegioProfeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
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
			
			


			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
								
				
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoColegioProfeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoColegioProfe")) {
					jCheckBoxSeleccionarTodosTipoColegioProfeItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoColegioProfe")) {
					jCheckBoxSeleccionadosTipoColegioProfeItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoColegioProfe")) {
					
				}
				
				


				
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
												
				
				


				
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoColegioProfeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoColegioProfeActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
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
			
			


			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoColegioProfeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocolegioprofe);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocolegioprofe);
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
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
				
				


				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoColegioProfe.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoColegioProfe.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoColegioProfeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocolegioprofeAnterior =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoColegioProfe")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoColegioProfeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoColegioProfe.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocolegioprofe =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocolegioprofe);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoColegioProfe")) {
				
				}
				
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoColegioProfe")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoColegioProfe.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoColegioProfe")) {
			
			}
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoColegioProfe();
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
			if(sTipo.equals("NuevoTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoColegioProfe")) {
				jButtonDuplicarTipoColegioProfeActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoColegioProfe")) {
				jButtonCopiarTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoColegioProfe")) {
				jButtonVerFormTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoColegioProfe")) {
				jButtonNuevoTipoColegioProfeActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoColegioProfe")) {
				jButtonModificarTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoColegioProfe")) {
				jButtonActualizarTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoColegioProfe")) {
				jButtonEliminarTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoColegioProfe")) {
				jButtonCancelarTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoColegioProfe")) {
				jButtonCerrarTipoColegioProfeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoColegioProfe")) {
				jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoColegioProfe")) {
				jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoColegioProfe")) {
				jButtonAbrirOrderByTipoColegioProfeActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoColegioProfe")) {
				jButtonRecargarInformacionTipoColegioProfeActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoColegioProfe")) {
				jButtonAnterioresTipoColegioProfeActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoColegioProfe")) {
				jButtonSiguientesTipoColegioProfeActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoColegioProfeBusqueda")) {
				this.jButtonidTipoColegioProfeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoColegioProfeUpdate")) {
				this.jButtonid_empresaTipoColegioProfeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoColegioProfeBusqueda")) {
				this.jButtonid_empresaTipoColegioProfeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoColegioProfeBusqueda")) {
				this.jButtoncodigoTipoColegioProfeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoColegioProfeBusqueda")) {
				this.jButtonnombreTipoColegioProfeBusquedaActionPerformed(evt);
			}
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoColegioProfe();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoColegioProfe")) {
				closingInternalFrameTipoColegioProfe();
				
			} else if(sTipo.equals("jButtonCancelarTipoColegioProfe")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoColegioProfe = (JInternalFrameBase)evt.getSource();
	            	
	            TipoColegioProfeBeanSwingJInternalFrame jInternalFrameParent=(TipoColegioProfeBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoColegioProfe.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoColegioProfeActionPerformed(null);
			}
			
			TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocolegioprofe,new Object(),this.tipocolegioprofeParameterGeneral,this.tipocolegioprofeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoColegioProfe(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoColegioProfe(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoColegioProfe(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocolegioprofe)) {
			if(!esControlTabla) {
				if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);			
				}
				
				if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoColegioProfe(this.tipocolegioprofe,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocolegioprofeReturnGeneral=tipocolegioprofeLogic.procesarEventosTipoColegioProfesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocolegioprofeLogic.getTipoColegioProfes(),this.tipocolegioprofe,this.tipocolegioprofeParameterGeneral,this.isEsNuevoTipoColegioProfe,classes);//this.tipocolegioprofeLogic.getTipoColegioProfe()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoColegioProfe(this.tipocolegioprofeReturnGeneral,this.tipocolegioprofeBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoColegioProfe(classes,this.tipocolegioprofeReturnGeneral,this.tipocolegioprofeBean,false);
					}
						
					if(this.tipocolegioprofeReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoColegioProfe(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoColegioProfe(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe());	
					}
						
					if(this.tipocolegioprofeReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoColegioProfe(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe(),classes);//this.tipocolegioprofeBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoColegioProfe(this.tipocolegioprofe,classes);//this.tipocolegioprofeBean);									
				}
			
				if(TipoColegioProfeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoColegioProfe(this.tipocolegioprofe,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoColegioProfe(this.tipocolegioprofe);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocolegioprofeAnterior!=null) {
						this.tipocolegioprofe=this.tipocolegioprofeAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocolegioprofeReturnGeneral=tipocolegioprofeLogic.procesarEventosTipoColegioProfesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocolegioprofeLogic.getTipoColegioProfes(),this.tipocolegioprofe,this.tipocolegioprofeParameterGeneral,this.isEsNuevoTipoColegioProfe,classes);//this.tipocolegioprofeLogic.getTipoColegioProfe()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocolegioprofeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocolegioprofeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe(),tipocolegioprofeLogic.getTipoColegioProfes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe(),this.tipocolegioprofes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoColegioProfe.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoColegioProfe.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoColegioProfe();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoColegioProfe() throws Exception {
		
		TipoColegioProfeModel tipocolegioprofeModel=(TipoColegioProfeModel)this.jTableDatosTipoColegioProfe.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocolegioprofeModel.tipocolegioprofes=this.tipocolegioprofeLogic.getTipoColegioProfes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocolegioprofeModel.tipocolegioprofes=this.tipocolegioprofes;
		}
		
		
		((TipoColegioProfeModel) this.jTableDatosTipoColegioProfe.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoColegioProfe() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocolegioprofeAnterior(),this.tipocolegioprofeLogic.getTipoColegioProfes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocolegioprofeAnterior(),this.tipocolegioprofes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoColegioProfe();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoColegioProfe(TipoColegioProfe tipocolegioprofe,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
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
										
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocolegioprofe,new Object(),generalEntityParameterGeneral,this.tipocolegioprofeReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoColegioProfeConstantesFunciones.getClassesRelationshipsOfTipoColegioProfe(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoColegioProfeConstantesFunciones.getClassesRelationshipsFromStringsOfTipoColegioProfe(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoColegioProfe(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoColegioProfeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocolegioprofe,new Object(),generalEntityParameterGeneral,this.tipocolegioprofeReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoColegioProfe(TipoColegioProfeBean tipocolegioprofeBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoColegioProfe(ArrayList<Classe> classes,TipoColegioProfeReturnGeneral tipocolegioprofeReturnGeneral,TipoColegioProfeBean tipocolegioprofeBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoColegioProfe(TipoColegioProfe tipocolegioprofe,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipocolegioprofe)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoColegioProfe = new TipoColegioProfeDetalleFormJInternalFrame(jDesktopPane,this.tipocolegioprofeSessionBean.getConGuardarRelaciones(),this.tipocolegioprofeSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.setVisible(false);
		this.jInternalFrameDetalleFormTipoColegioProfe.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoColegioProfe.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoColegioProfe.tipocolegioprofeLogic=this.tipocolegioprofeLogic;
		
		this.cargarCombosFrameForeignKeyTipoColegioProfe("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoColegioProfe();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoColegioProfe();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoColegioProfe("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoColegioProfe();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoColegioProfe.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoColegioProfe"));
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"ModificarTipoColegioProfe"));

		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarToolBarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoColegioProfe"));
					
		this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemModificarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoColegioProfe"));		
		
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"ActualizarTipoColegioProfe"));
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarToolBarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoColegioProfe"));
						
		this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemActualizarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoColegioProfe"));		
		
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"EliminarTipoColegioProfe"));
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoColegioProfe"));
								
		this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemEliminarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoColegioProfe"));		
		
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CancelarTipoColegioProfe"));
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoColegioProfe"));
					
		this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemCancelarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoColegioProfe"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemDetalleCerrarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoColegioProfe"));		
		
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoColegioProfe"));
		
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoColegioProfe"));
		
		
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoColegioProfe"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonidTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"idTipoColegioProfeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonid_empresaTipoColegioProfeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoColegioProfeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonid_empresaTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoColegioProfeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtoncodigoTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoColegioProfeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonnombreTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoColegioProfeBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoColegioProfe"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoColegioProfe"));
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoColegioProfe"));
		}
		
		this.jTableDatosTipoColegioProfe.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoColegioProfe"));
		
		this.jTableDatosTipoColegioProfe.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoColegioProfe"));
		
		this.jButtonNuevoTipoColegioProfe.addActionListener(new ButtonActionListener(this,"NuevoTipoColegioProfe"));
		
		this.jButtonDuplicarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"DuplicarTipoColegioProfe"));
		
		this.jButtonCopiarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"CopiarTipoColegioProfe"));
		
		this.jButtonVerFormTipoColegioProfe.addActionListener(new ButtonActionListener(this,"VerFormTipoColegioProfe"));
		
		
		this.jButtonNuevoToolBarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoColegioProfe"));
			
		this.jButtonDuplicarToolBarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoColegioProfe"));
			
		this.jMenuItemNuevoTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoColegioProfe"));
			
		this.jMenuItemDuplicarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoColegioProfe"));		
		
		
		this.jButtonNuevoRelacionesTipoColegioProfe.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoColegioProfe"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoColegioProfe"));
			
		this.jMenuItemNuevoRelacionesTipoColegioProfe.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoColegioProfe"));		
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"ModificarTipoColegioProfe"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonModificarToolBarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoColegioProfe"));
			
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemModificarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoColegioProfe"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"ActualizarTipoColegioProfe"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonActualizarToolBarTipoColegioProfe.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoColegioProfe"));
				
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemActualizarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoColegioProfe"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"EliminarTipoColegioProfe"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonEliminarToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoColegioProfe"));
						
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemEliminarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoColegioProfe"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CancelarTipoColegioProfe"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonCancelarToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoColegioProfe"));
			
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemCancelarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoColegioProfe"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoColegioProfe"));		
		
		
		this.jButtonCerrarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CerrarTipoColegioProfe"));
		
		
		this.jButtonCerrarToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoColegioProfe"));
			
		this.jMenuItemCerrarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoColegioProfe"));
			
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jMenuItemDetalleCerrarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoColegioProfe"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoColegioProfe"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoColegioProfe"));
		}
		
		this.jButtonCopiarToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoColegioProfe"));
			
		this.jButtonVerFormToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoColegioProfe"));
		
		this.jMenuItemGuardarCambiosTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoColegioProfe"));
			
		this.jMenuItemCopiarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoColegioProfe"));		
		
		this.jMenuItemVerFormTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoColegioProfe"));		
		
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoColegioProfe"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoColegioProfe"));
			
		this.jMenuItemGuardarCambiosTablaTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoColegioProfe"));		
		
		
		
		this.jButtonRecargarInformacionTipoColegioProfe.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoColegioProfe"));
					
		this.jButtonRecargarInformacionToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoColegioProfe"));
		
		this.jMenuItemRecargarInformacionTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoColegioProfe"));		
		
		
		
		this.jButtonAnterioresTipoColegioProfe.addActionListener (new ButtonActionListener(this,"AnterioresTipoColegioProfe"));
		
		
		this.jButtonAnterioresToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoColegioProfe"));
		
		this.jMenuItemAnterioresTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoColegioProfe"));		
		
		
		this.jButtonSiguientesTipoColegioProfe.addActionListener (new ButtonActionListener(this,"SiguientesTipoColegioProfe"));
		
		
		this.jButtonSiguientesToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoColegioProfe"));
			
		this.jMenuItemSiguientesTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoColegioProfe"));
			
		this.jMenuItemAbrirOrderByTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoColegioProfe"));
			
		this.jMenuItemMostrarOcultarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoColegioProfe"));
			
		this.jMenuItemDetalleAbrirOrderByTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoColegioProfe"));
			
		this.jMenuItemDetalleMostarOcultarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoColegioProfe"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoColegioProfe.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoColegioProfe"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoColegioProfe"));
			
		this.jMenuItemNuevoGuardarCambiosTipoColegioProfe.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoColegioProfe"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoColegioProfe.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoColegioProfe"));

		this.jCheckBoxSeleccionadosTipoColegioProfe.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoColegioProfe"));
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoColegioProfe"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoColegioProfe.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoColegioProfe"));
			
		this.jComboBoxTiposAccionesTipoColegioProfe.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoColegioProfe"));
					
		this.jComboBoxTiposSeleccionarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoColegioProfe"));
			
		this.jTextFieldValorCampoGeneralTipoColegioProfe.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoColegioProfe"));		
		
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonidTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"idTipoColegioProfeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonid_empresaTipoColegioProfeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoColegioProfeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonid_empresaTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoColegioProfeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtoncodigoTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoColegioProfeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonnombreTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoColegioProfeBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoColegioProfe!=null) {
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoColegioProfe"));
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoColegioProfe"));
				this.jInternalFrameReporteDinamicoTipoColegioProfe.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoColegioProfe"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoColegioProfe.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoColegioProfe"));				
			//this.jButtonGenerarReporteDinamicoTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoColegioProfe"));
			//this.jButtonGenerarExcelReporteDinamicoTipoColegioProfe.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoColegioProfe"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoColegioProfe!=null) {
				this.jInternalFrameImportacionTipoColegioProfe.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoColegioProfe"));
				this.jInternalFrameImportacionTipoColegioProfe.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoColegioProfe"));
				this.jInternalFrameImportacionTipoColegioProfe.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoColegioProfe"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoColegioProfe.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoColegioProfe"));
			
			this.jButtonAbrirOrderByToolBarTipoColegioProfe.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoColegioProfe"));			
			
			if(this.jInternalFrameOrderByTipoColegioProfe!=null) {
				this.jInternalFrameOrderByTipoColegioProfe.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoColegioProfe"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoColegioProfe.jTabbedPaneRelacionesTipoColegioProfe.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoColegioProfe"));
		
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
            		closingInternalFrameTipoColegioProfe();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoColegioProfe.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoColegioProfe = (JInternalFrameBase)event.getSource();
	            	
	            TipoColegioProfeBeanSwingJInternalFrame jInternalFrameParent=(TipoColegioProfeBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoColegioProfe.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoColegioProfeActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoColegioProfe.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoColegioProfeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoColegioProfe.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoColegioProfe.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoColegioProfeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoColegioProfeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoColegioProfeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoColegioProfe";
		inputMap = this.jButtonNuevoTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoColegioProfeActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoColegioProfeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoColegioProfeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoColegioProfeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoColegioProfe";
		inputMap = this.jButtonNuevoRelacionesTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoColegioProfeActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoColegioProfe";
		inputMap = this.jButtonModificarTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoColegioProfeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoColegioProfe";
		inputMap = this.jButtonActualizarTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoColegioProfeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoColegioProfe";
		inputMap = this.jButtonEliminarTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoColegioProfeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoColegioProfe";
		inputMap = this.jButtonCancelarTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoColegioProfeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoColegioProfe";
		inputMap = this.jButtonCerrarTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoColegioProfeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoColegioProfe";
		inputMap = this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonGuardarCambiosTipoColegioProfe.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoColegioProfeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoColegioProfe.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoColegioProfeItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoColegioProfe.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoColegioProfeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoColegioProfe.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoColegioProfeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoColegioProfe.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoColegioProfeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonidTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"idTipoColegioProfeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonid_empresaTipoColegioProfeUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoColegioProfeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonid_empresaTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoColegioProfeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtoncodigoTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoColegioProfeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoColegioProfe.jButtonnombreTipoColegioProfeBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoColegioProfeBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoColegioProfe.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoColegioProfeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoColegioProfeActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoColegioProfe.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoColegioProfe(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
					tipocolegioprofeAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofes) {
					tipocolegioprofeAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoColegioProfeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoColegioProfe(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
						tipocolegioprofeAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofes) {
						tipocolegioprofeAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoColegioProfe(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoColegioProfe.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoColegioProfe.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfe,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoColegioProfeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoColegioProfe(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoColegioProfe.getSelectedRows();
			
			TipoColegioProfe tipocolegioprofeLocal=new TipoColegioProfe();
			
			//this.seleccionarTodosTipoColegioProfe(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocolegioprofeLocal =(TipoColegioProfe) this.tipocolegioprofeLogic.getTipoColegioProfes().toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocolegioprofeLocal =(TipoColegioProfe) this.tipocolegioprofes.toArray()[this.jTableDatosTipoColegioProfe.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocolegioprofeLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
						tipocolegioprofeAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofes) {
						tipocolegioprofeAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoColegioProfe(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoColegioProfe.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoColegioProfe.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoColegioProfe,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoColegioProfeItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoColegioProfeParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoColegioProfeActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoColegioProfe(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoColegioProfe.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofeLogic.getTipoColegioProfes()) {
				
						if(sTipoSeleccionar.equals(TipoColegioProfeConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocolegioprofeAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocolegioprofeAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofes) {
					
						if(sTipoSeleccionar.equals(TipoColegioProfeConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocolegioprofeAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocolegioprofeAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoColegioProfe(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoColegioProfeActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoColegioProfe(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoColegioProfe=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoColegioProfe.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoColegioProfe) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoColegioProfe(conSplash);
				
					this.generarReporteTipoColegioProfesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoColegioProfesSeleccionados();
				//this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoColegioProfesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoColegioProfesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoColegioProfe();
				
				this.exportarTipoColegioProfesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoColegioProfes();
				//this.importarTipoColegioProfes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoColegioProfe();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoColegioProfesSeleccionados();
				//this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Colegio Profe", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoColegioProfe();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoColegioProfe)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoColegioProfe(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoColegioProfeBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoColegioProfe) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoColegioProfe(conSplash);
					
						//this.actualizarParametrosGeneralTipoColegioProfe();
						
						this.generarReporteProcesoAccionTipoColegioProfesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoColegioProfeBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Colegio ProfeS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Colegio Profe", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoColegioProfe();
				
						this.actualizarParametrosGeneralTipoColegioProfe();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipocolegioprofeReturnGeneral=tipocolegioprofeLogic.procesarAccionTipoColegioProfesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipocolegioprofeLogic.getTipoColegioProfes(),this.tipocolegioprofeParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoColegioProfeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoColegioProfe();
					
					TipoColegioProfeBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoColegioProfeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoColegioProfe.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxTiposAccionesFormularioTipoColegioProfe.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoColegioProfe(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoColegioProfeActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoColegioProfe();
			
			if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
			TipoColegioProfe tipocolegioprofe=new TipoColegioProfe();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoColegioProfe(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoColegioProfe.getSelectedItem();
			
			
			
			
			tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocolegioprofesSeleccionados.size()==1) {
				for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofesSeleccionados) {
					tipocolegioprofe=tipocolegioprofeAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoColegioProfe();
			
      		//this.finishProcessTipoColegioProfe(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoColegioProfeReturnGeneral() throws Exception {
		if(this.tipocolegioprofeReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocolegioprofeReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocolegioprofeReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocolegioprofeReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocolegioprofeReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocolegioprofeReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoColegioProfe(false);
		}
		
		if(this.tipocolegioprofeReturnGeneral.getConRetornoLista() || this.tipocolegioprofeReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocolegioprofeReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocolegioprofeLogic.setTipoColegioProfes(this.tipocolegioprofeReturnGeneral.getTipoColegioProfes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocolegioprofeReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocolegioprofeLogic.setTipoColegioProfe(this.tipocolegioprofeReturnGeneral.getTipoColegioProfe());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoColegioProfe(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoColegioProfe() throws Exception {
		
		
	}
	
	public ArrayList<TipoColegioProfe> getTipoColegioProfesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoColegioProfe) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofeLogic.getTipoColegioProfes()) {
					if(tipocolegioprofeAux.getIsSelected()) {
						tipocolegioprofesSeleccionados.add(tipocolegioprofeAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoColegioProfe tipocolegioprofeAux:this.tipocolegioprofes) {
					if(tipocolegioprofeAux.getIsSelected()) {
						tipocolegioprofesSeleccionados.add(tipocolegioprofeAux);				
					}
				}
			}
			
			if(tipocolegioprofesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocolegioprofesSeleccionados.addAll(this.tipocolegioprofeLogic.getTipoColegioProfes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocolegioprofesSeleccionados.addAll(this.tipocolegioprofes);				
					}
				}
			}
		} else {
			tipocolegioprofesSeleccionados.add(this.tipocolegioprofe);
		}
		
		return tipocolegioprofesSeleccionados;
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
	
	public void generarReporteTipoColegioProfesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoColegioProfesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoColegioProfesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoColegioProfesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoColegioProfesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Colegio Profe",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoColegioProfesSeleccionados() throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoColegioProfes("Todos",tipocolegioprofesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoColegioProfesSeleccionados() throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoColegioProfes("Todos",tipocolegioprofesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoColegioProfesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoColegioProfes("Todos",tipocolegioprofesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoColegioProfesSeleccionados() throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoColegioProfe();
		
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoColegioProfe();
		
		
		//this.generarReporteTipoColegioProfes("Todos",tipocolegioprofesSeleccionados ,tipocolegioprofeImplementable,tipocolegioprofeImplementableHome);
	}
	
	public void mostrarImportacionTipoColegioProfes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoColegioProfe();
		
		this.abrirFrameImportacionTipoColegioProfe();		
		
			
		//this.generarReporteTipoColegioProfes("Todos",tipocolegioprofesSeleccionados ,tipocolegioprofeImplementable,tipocolegioprofeImplementableHome);
	}
	
	public void importarTipoColegioProfes() throws Exception {		
	
	}
	
	public void exportarTipoColegioProfesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoColegioProfesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoColegioProfesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoColegioProfesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Colegio Profe",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoColegioProfesSeleccionados() throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocolegioprofe."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoColegioProfe(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoColegioProfe(tipocolegioprofeAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocolegioprofeAux.setsDetalleGeneralEntityReporte(tipocolegioprofeAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoColegioProfe(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoColegioProfeConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoColegioProfeConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoColegioProfeConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoColegioProfeConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoColegioProfe(TipoColegioProfe tipocolegioprofe,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocolegioprofe.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocolegioprofe.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocolegioprofe.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocolegioprofe.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocolegioprofe.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoColegioProfesSeleccionados() throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocolegioprofe.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoColegioProfes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoColegioProfe(row);				
				iRow++;
			}				
			
			for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoColegioProfe(tipocolegioprofeAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoColegioProfesSeleccionados() throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();		
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocolegioprofe.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocolegioprofes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocolegioprofe");
			//elementRoot.appendChild(element);
		
			for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofesSeleccionados) {
				element = document.createElement("tipocolegioprofe");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoColegioProfe(tipocolegioprofeAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Colegio Profe",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoColegioProfe(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoColegioProfe(TipoColegioProfe tipocolegioprofe,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocolegioprofe.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocolegioprofe.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocolegioprofe.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocolegioprofe.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoColegioProfe(TipoColegioProfe tipocolegioprofe,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoColegioProfeConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocolegioprofe.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoColegioProfeConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocolegioprofe.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoColegioProfeConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipocolegioprofe.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoColegioProfeConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocolegioprofe.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoColegioProfeConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocolegioprofe.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoColegioProfesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados=new ArrayList<TipoColegioProfe>();
		
		tipocolegioprofesSeleccionados=this.getTipoColegioProfesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoColegioProfe(tipocolegioprofesSeleccionados);
		
		this.generarReporteTipoColegioProfes("Todos",tipocolegioprofesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoColegioProfe(ArrayList<TipoColegioProfe> tipocolegioprofesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoColegioProfe tipocolegioprofeAux:tipocolegioprofesSeleccionados) {
				tipocolegioprofeAux.setsDetalleGeneralEntityReporte(tipocolegioprofeAux.toString());
			
				if(sTipoSeleccionar.equals(TipoColegioProfeConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipocolegioprofeAux.setsDescripcionGeneralEntityReporte1(tipocolegioprofeAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoColegioProfeConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocolegioprofeAux.setsDescripcionGeneralEntityReporte1(tipocolegioprofeAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoColegioProfeConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocolegioprofeAux.setsDescripcionGeneralEntityReporte1(tipocolegioprofeAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoColegioProfeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoColegioProfe(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoColegioProfe=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=true;
				this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=true;
			}
			
			this.isVisibilidadCeldaModificarTipoColegioProfe=false;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=false;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;
			this.isVisibilidadCeldaModificarTipoColegioProfe=false;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=true;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;
			this.isVisibilidadCeldaModificarTipoColegioProfe=false;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=true;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=true;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;
			this.isVisibilidadCeldaModificarTipoColegioProfe=false;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=true;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=true;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=true;
			this.isVisibilidadCeldaModificarTipoColegioProfe=false;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=false;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=false;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;
			this.isVisibilidadCeldaModificarTipoColegioProfe=true;
			this.isVisibilidadCeldaActualizarTipoColegioProfe=false;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
			this.isVisibilidadCeldaCancelarTipoColegioProfe=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoColegioProfe=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoColegioProfeJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoColegioProfe=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=true;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=true;
		} else {
			this.actualizarEstadoPanelsTipoColegioProfe(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoColegioProfe=false;
			//this.isVisibilidadCeldaVerFormTipoColegioProfe=false;
			this.isVisibilidadCeldaDuplicarTipoColegioProfe=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocolegioprofeSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoColegioProfe=false;
			this.isVisibilidadCeldaGuardarCambiosTipoColegioProfe=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			if(!tipocolegioprofeSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;												
			}
			
			this.jButtonCerrarTipoColegioProfe.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoColegioProfe=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocolegioprofe)) {
			this.isVisibilidadCeldaActualizarTipoColegioProfe=false;
			this.isVisibilidadCeldaEliminarTipoColegioProfe=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoColegioProfe() {
	}
	
	public void actualizarEstadoPanelsTipoColegioProfe(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoColegioProfe!=null) {
				this.jScrollPanelDatosEdicionTipoColegioProfe.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoColegioProfe!=null) {
				this.jScrollPanelDatosTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoColegioProfe!=null) {
				this.jPanelPaginacionTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoColegioProfe!=null) {
				this.jScrollPanelDatosEdicionTipoColegioProfe.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoColegioProfe!=null) {
				this.jScrollPanelDatosTipoColegioProfe.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoColegioProfe!=null) {
				this.jPanelPaginacionTipoColegioProfe.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoColegioProfe!=null) {
				this.jScrollPanelDatosEdicionTipoColegioProfe.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoColegioProfe!=null) {
				this.jScrollPanelDatosTipoColegioProfe.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoColegioProfe!=null) {
				this.jPanelPaginacionTipoColegioProfe.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoColegioProfe!=null) {
				this.jScrollPanelDatosEdicionTipoColegioProfe.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoColegioProfe!=null) {
				this.jScrollPanelDatosTipoColegioProfe.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoColegioProfe!=null) {
				this.jPanelPaginacionTipoColegioProfe.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoColegioProfe!=null) {
				this.jScrollPanelDatosEdicionTipoColegioProfe.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoColegioProfe!=null) {
				this.jScrollPanelDatosTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoColegioProfe!=null) {
				this.jPanelPaginacionTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoColegioProfe!=null) {
				this.jScrollPanelDatosEdicionTipoColegioProfe.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoColegioProfe!=null) {
				this.jScrollPanelDatosTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoColegioProfe!=null) {
				this.jPanelPaginacionTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoColegioProfe!=null) {
				this.jScrollPanelDatosEdicionTipoColegioProfe.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoColegioProfe!=null) {
				this.jScrollPanelDatosTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoColegioProfe!=null) {
				this.jPanelPaginacionTipoColegioProfe.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
					this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocolegioprofeSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoColegioProfe!=null) {
				this.jTabbedPaneBusquedasTipoColegioProfe.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoColegioProfe!=null) {
				this.jPanelParametrosReportesTipoColegioProfe.setVisible(true);
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
		
		//TipoColegioProfeSessionBean tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
		
		if(this.tipocolegioprofeSessionBean==null) {
			this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
		}
		
		this.tipocolegioprofeSessionBean.setsUltimaBusquedaTipoColegioProfe(this.getsAccionBusqueda());
		this.tipocolegioprofeSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocolegioprofeSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipocolegioprofeSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoColegioProfeSessionBean tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
		
		if(this.tipocolegioprofeSessionBean==null) {
			this.tipocolegioprofeSessionBean=new TipoColegioProfeSessionBean();
		}
		
		if(this.tipocolegioprofeSessionBean.getsUltimaBusquedaTipoColegioProfe()!=null&&!this.tipocolegioprofeSessionBean.getsUltimaBusquedaTipoColegioProfe().equals("")) {
			this.setsAccionBusqueda(tipocolegioprofeSessionBean.getsUltimaBusquedaTipoColegioProfe());
			this.setiNumeroPaginacion(tipocolegioprofeSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocolegioprofeSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipocolegioprofeSessionBean.getid_empresa());
				tipocolegioprofeSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipocolegioprofeSessionBean.setsUltimaBusquedaTipoColegioProfe("");
		this.tipocolegioprofeSessionBean.setiNumeroPaginacion(TipoColegioProfeConstantesFunciones.INUMEROPAGINACION);
		this.tipocolegioprofeSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoColegioProfe(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoColegioProfe() {
		this.updateBorderResaltarBusquedasFormularioTipoColegioProfe();
		this.updateVisibilidadBusquedasFormularioTipoColegioProfe();
		this.updateHabilitarBusquedasFormularioTipoColegioProfe();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoColegioProfe() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoColegioProfe.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoColegioProfe() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoColegioProfe.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoColegioProfe() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoColegioProfe.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoColegioProfe(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoColegioProfe.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoColegioProfe() throws Exception {

		if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoColegioProfe();
		this.updateVisibilidadResaltarControlesFormularioTipoColegioProfe();
		this.updateHabilitarResaltarControlesFormularioTipoColegioProfe();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoColegioProfe() throws Exception {
		if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocolegioprofeConstantesFunciones.resaltaridTipoColegioProfe!=null && this.jInternalFrameDetalleFormTipoColegioProfe!=null) {this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.setBorder(this.tipocolegioprofeConstantesFunciones.resaltaridTipoColegioProfe);}
		if(this.tipocolegioprofeConstantesFunciones.resaltarid_empresaTipoColegioProfe!=null && this.jInternalFrameDetalleFormTipoColegioProfe!=null) {this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setBorder(this.tipocolegioprofeConstantesFunciones.resaltarid_empresaTipoColegioProfe);}
		if(this.tipocolegioprofeConstantesFunciones.resaltarcodigoTipoColegioProfe!=null && this.jInternalFrameDetalleFormTipoColegioProfe!=null) {this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.setBorder(this.tipocolegioprofeConstantesFunciones.resaltarcodigoTipoColegioProfe);}
		if(this.tipocolegioprofeConstantesFunciones.resaltarnombreTipoColegioProfe!=null && this.jInternalFrameDetalleFormTipoColegioProfe!=null) {this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.setBorder(this.tipocolegioprofeConstantesFunciones.resaltarnombreTipoColegioProfe);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoColegioProfe() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
	
		//this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostraridTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jPanelidTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostraridTipoColegioProfe);
		//this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostrarid_empresaTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jPanelid_empresaTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostrarid_empresaTipoColegioProfe);
		//this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostrarcodigoTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jPanelcodigoTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostrarcodigoTipoColegioProfe);
		//this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostrarnombreTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jPanelnombreTipoColegioProfe.setVisible(this.tipocolegioprofeConstantesFunciones.mostrarnombreTipoColegioProfe);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoColegioProfe() throws Exception {
		if(this.jInternalFrameDetalleFormTipoColegioProfe==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoColegioProfe!=null) {
	
		this.jInternalFrameDetalleFormTipoColegioProfe.jLabelidTipoColegioProfe.setEnabled(this.tipocolegioprofeConstantesFunciones.activaridTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jComboBoxid_empresaTipoColegioProfe.setEnabled(this.tipocolegioprofeConstantesFunciones.activarid_empresaTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jTextFieldcodigoTipoColegioProfe.setEnabled(this.tipocolegioprofeConstantesFunciones.activarcodigoTipoColegioProfe);
		this.jInternalFrameDetalleFormTipoColegioProfe.jTextAreanombreTipoColegioProfe.setEnabled(this.tipocolegioprofeConstantesFunciones.activarnombreTipoColegioProfe);
		}
	}
	
		
}