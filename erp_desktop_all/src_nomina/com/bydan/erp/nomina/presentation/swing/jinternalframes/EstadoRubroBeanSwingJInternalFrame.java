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

import com.bydan.erp.nomina.util.EstadoRubroConstantesFunciones;
import com.bydan.erp.nomina.util.EstadoRubroParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EstadoRubroParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EstadoRubroBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class EstadoRubroBeanSwingJInternalFrame extends EstadoRubroJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoRubroBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoRubro> estadorubroValidator = new ClassValidator<EstadoRubro>(EstadoRubro.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoRubro estadorubro;	
	public EstadoRubro estadorubroAux;
	public EstadoRubro estadorubroAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoRubro estadorubroTotales;
	public Long idEstadoRubroActual;
	public Long iIdNuevoEstadoRubro=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosRubroEmpleado=false;

	public Boolean getIsTienePermisosRubroEmpleado() {
		return isTienePermisosRubroEmpleado;
	}

	public void setIsTienePermisosRubroEmpleado(Boolean isTienePermisosRubroEmpleado) {
		this.isTienePermisosRubroEmpleado= isTienePermisosRubroEmpleado;
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
	
	public Boolean isPermisoTodoEstadoRubro;
	public Boolean isPermisoNuevoEstadoRubro;
	public Boolean isPermisoActualizarEstadoRubro;
	public Boolean isPermisoActualizarOriginalEstadoRubro;
	public Boolean isPermisoEliminarEstadoRubro;
	public Boolean isPermisoGuardarCambiosEstadoRubro;
	public Boolean isPermisoConsultaEstadoRubro;
	public Boolean isPermisoBusquedaEstadoRubro;
	public Boolean isPermisoReporteEstadoRubro;
	public Boolean isPermisoPaginacionMedioEstadoRubro;
	public Boolean isPermisoPaginacionAltoEstadoRubro;
	public Boolean isPermisoPaginacionTodoEstadoRubro;
	public Boolean isPermisoCopiarEstadoRubro;
	public Boolean isPermisoVerFormEstadoRubro;
	public Boolean isPermisoDuplicarEstadoRubro;
	public Boolean isPermisoOrdenEstadoRubro;
	
	
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
	
	public EstadoRubroParameterReturnGeneral estadorubroReturnGeneral;
	public EstadoRubroParameterReturnGeneral estadorubroParameterGeneral;
	
	

	public RubroEmpleadoLogic rubroempleadoLogic=null;

	public RubroEmpleadoLogic getRubroEmpleadoLogic() {
		return rubroempleadoLogic;
	}

	public void setRubroEmpleadoLogic(RubroEmpleadoLogic rubroempleadoLogic) {
		this.rubroempleadoLogic = rubroempleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoRubro=false;
	public Boolean esParaAccionDesdeFormularioEstadoRubro=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoRubroSessionBeanAdditional estadorubroSessionBeanAdditional=null;
	
	public EstadoRubroSessionBeanAdditional getEstadoRubroSessionBeanAdditional() {
		return this.estadorubroSessionBeanAdditional;
	}
	
	public void setEstadoRubroSessionBeanAdditional(EstadoRubroSessionBeanAdditional estadorubroSessionBeanAdditional) {
		try {
			this.estadorubroSessionBeanAdditional=estadorubroSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoRubroBeanSwingJInternalFrameAdditional estadorubroBeanSwingJInternalFrameAdditional=null;
	//public class EstadoRubroBeanSwingJInternalFrame
	
	public EstadoRubroBeanSwingJInternalFrameAdditional getEstadoRubroBeanSwingJInternalFrameAdditional() {
		return this.estadorubroBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoRubroBeanSwingJInternalFrameAdditional(EstadoRubroBeanSwingJInternalFrameAdditional estadorubroBeanSwingJInternalFrameAdditional) {
		try {
			this.estadorubroBeanSwingJInternalFrameAdditional=estadorubroBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoRubroLogic estadorubroLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoRubro estadorubroBean;
	public EstadoRubroConstantesFunciones estadorubroConstantesFunciones;
	//public EstadoRubroParameterReturnGeneral estadorubroReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoRubro> estadorubros;	
	//public List<EstadoRubro> estadorubrosEliminados;
	//public List<EstadoRubro> estadorubrosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoRubro=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoRubro=true;
	public Boolean isVisibilidadCeldaCopiarEstadoRubro=true;
	public Boolean isVisibilidadCeldaVerFormEstadoRubro=true;
	public Boolean isVisibilidadCeldaOrdenEstadoRubro=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
	public Boolean isVisibilidadCeldaModificarEstadoRubro=false;
	public Boolean isVisibilidadCeldaActualizarEstadoRubro=false;
	public Boolean isVisibilidadCeldaEliminarEstadoRubro=false;
	public Boolean isVisibilidadCeldaCancelarEstadoRubro=false;
	public Boolean isVisibilidadCeldaGuardarEstadoRubro=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoRubro=false;	
	
	
	
	public Long getiIdNuevoEstadoRubro() {
		return this.iIdNuevoEstadoRubro;
	}

	public void setiIdNuevoEstadoRubro(Long iIdNuevoEstadoRubro) {
		this.iIdNuevoEstadoRubro = iIdNuevoEstadoRubro;
	}
	
	public Long getidEstadoRubroActual() {
		return this.idEstadoRubroActual;
	}

	public void setidEstadoRubroActual(Long idEstadoRubroActual) {
		this.idEstadoRubroActual = idEstadoRubroActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoRubro getestadorubro() {
		return this.estadorubro;
	}

	public void setestadorubro(EstadoRubro estadorubro) {
		this.estadorubro = estadorubro;
	}
	
	public EstadoRubro getestadorubroAux() {
		return this.estadorubroAux;
	}

	public void setestadorubroAux(EstadoRubro estadorubroAux) {
		this.estadorubroAux = estadorubroAux;
	}				
	
	public EstadoRubro getestadorubroAnterior() {
		return this.estadorubroAnterior;
	}

	public void setestadorubroAnterior(EstadoRubro estadorubroAnterior) {
		this.estadorubroAnterior = estadorubroAnterior;
	}	
	
	public EstadoRubro getestadorubroTotales() {
		return this.estadorubroTotales;
	}

	public void setestadorubroTotales(EstadoRubro estadorubroTotales) {
		this.estadorubroTotales = estadorubroTotales;
	}	
	
	public EstadoRubro getestadorubroBean() {
		return this.estadorubroBean;
	}

	public void setestadorubroBean(EstadoRubro estadorubroBean) {
		this.estadorubroBean = estadorubroBean;
	}	
	
	public EstadoRubroParameterReturnGeneral getestadorubroReturnGeneral() {
		return this.estadorubroReturnGeneral;
	}

	public void setestadorubroReturnGeneral(EstadoRubroParameterReturnGeneral estadorubroReturnGeneral) {
		this.estadorubroReturnGeneral = estadorubroReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoRubroLogic getEstadoRubroLogic()	{		
		return estadorubroLogic;
	}

	public void setEstadoRubroLogic(EstadoRubroLogic estadorubroLogic) {
		this.estadorubroLogic = estadorubroLogic;
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
	
	public Boolean getIsEsNuevoEstadoRubro() {
		return isEsNuevoEstadoRubro;
	}

	public void setIsEsNuevoEstadoRubro(Boolean isEsNuevoEstadoRubro) {
		this.isEsNuevoEstadoRubro = isEsNuevoEstadoRubro;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoRubro() {
		return esParaAccionDesdeFormularioEstadoRubro;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoRubro(Boolean esParaAccionDesdeFormularioEstadoRubro) {
		this.esParaAccionDesdeFormularioEstadoRubro = esParaAccionDesdeFormularioEstadoRubro;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoRubro() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoRubroConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRubro(this.estadorubroLogic.getEstadoRubros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoRubroConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRubro(this.estadorubros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadorubroLogic.setEstadoRubros(this.estadorubros);
			estadorubroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoRubroParameterReturnGeneral getEstadoRubroParameterGeneral() {
		return this.estadorubroParameterGeneral;
	}
	
	public void setEstadoRubroParameterGeneral(EstadoRubroParameterReturnGeneral estadorubroParameterGeneral) {
		this.estadorubroParameterGeneral = estadorubroParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoRubro() {
		return isPermisoTodoEstadoRubro;
	}

	public void setIsPermisoTodoEstadoRubro(Boolean isPermisoTodoEstadoRubro) {
		this.isPermisoTodoEstadoRubro = isPermisoTodoEstadoRubro;
	}

	public Boolean getIsPermisoNuevoEstadoRubro() {
		return isPermisoNuevoEstadoRubro;
	}

	public void setIsPermisoNuevoEstadoRubro(Boolean isPermisoNuevoEstadoRubro) {
		this.isPermisoNuevoEstadoRubro = isPermisoNuevoEstadoRubro;
	}

	public Boolean getIsPermisoActualizarEstadoRubro() {
		return isPermisoActualizarEstadoRubro;
	}

	public void setIsPermisoActualizarEstadoRubro(Boolean isPermisoActualizarEstadoRubro) {
		this.isPermisoActualizarEstadoRubro = isPermisoActualizarEstadoRubro;
	}

	public Boolean getIsPermisoEliminarEstadoRubro() {
		return isPermisoEliminarEstadoRubro;
	}

	public void setIsPermisoEliminarEstadoRubro(Boolean isPermisoEliminarEstadoRubro) {
		this.isPermisoEliminarEstadoRubro = isPermisoEliminarEstadoRubro;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoRubro() {
		return isPermisoGuardarCambiosEstadoRubro;
	}

	public void setIsPermisoGuardarCambiosEstadoRubro(Boolean isPermisoGuardarCambiosEstadoRubro) {
		this.isPermisoGuardarCambiosEstadoRubro = isPermisoGuardarCambiosEstadoRubro;
	}
	
	public Boolean getIsPermisoConsultaEstadoRubro() {
		return isPermisoConsultaEstadoRubro;
	}

	public void setIsPermisoConsultaEstadoRubro(Boolean isPermisoConsultaEstadoRubro) {
		this.isPermisoConsultaEstadoRubro = isPermisoConsultaEstadoRubro;
	}

	public Boolean getIsPermisoBusquedaEstadoRubro() {
		return isPermisoBusquedaEstadoRubro;
	}

	public void setIsPermisoBusquedaEstadoRubro(Boolean isPermisoBusquedaEstadoRubro) {
		this.isPermisoBusquedaEstadoRubro = isPermisoBusquedaEstadoRubro;
	}

	public Boolean getIsPermisoReporteEstadoRubro() {
		return isPermisoReporteEstadoRubro;
	}

	public void setIsPermisoReporteEstadoRubro(Boolean isPermisoReporteEstadoRubro) {
		this.isPermisoReporteEstadoRubro = isPermisoReporteEstadoRubro;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoRubro() {
		return isPermisoPaginacionMedioEstadoRubro;
	}

	public void setIsPermisoPaginacionMedioEstadoRubro(Boolean isPermisoPaginacionMedioEstadoRubro) {
		this.isPermisoPaginacionMedioEstadoRubro = isPermisoPaginacionMedioEstadoRubro;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoRubro() {
		return isPermisoPaginacionTodoEstadoRubro;
	}

	public void setIsPermisoPaginacionTodoEstadoRubro(Boolean isPermisoPaginacionTodoEstadoRubro) {
		this.isPermisoPaginacionTodoEstadoRubro = isPermisoPaginacionTodoEstadoRubro;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoRubro() {
		return isPermisoPaginacionAltoEstadoRubro;
	}

	public void setIsPermisoPaginacionAltoEstadoRubro(Boolean isPermisoPaginacionAltoEstadoRubro) {
		this.isPermisoPaginacionAltoEstadoRubro = isPermisoPaginacionAltoEstadoRubro;
	}
	
	public Boolean getIsPermisoCopiarEstadoRubro() {
		return isPermisoCopiarEstadoRubro;
	}

	public void setIsPermisoCopiarEstadoRubro(Boolean isPermisoCopiarEstadoRubro) {
		this.isPermisoCopiarEstadoRubro = isPermisoCopiarEstadoRubro;
	}
	
	public Boolean getIsPermisoVerFormEstadoRubro() {
		return isPermisoVerFormEstadoRubro;
	}

	public void setIsPermisoVerFormEstadoRubro(Boolean isPermisoVerFormEstadoRubro) {
		this.isPermisoVerFormEstadoRubro = isPermisoVerFormEstadoRubro;
	}
	
	public Boolean getIsPermisoDuplicarEstadoRubro() {
		return isPermisoDuplicarEstadoRubro;
	}

	public void setIsPermisoDuplicarEstadoRubro(Boolean isPermisoDuplicarEstadoRubro) {
		this.isPermisoDuplicarEstadoRubro = isPermisoDuplicarEstadoRubro;
	}
	
	public Boolean getIsPermisoOrdenEstadoRubro() {
		return isPermisoOrdenEstadoRubro;
	}

	public void setIsPermisoOrdenEstadoRubro(Boolean isPermisoOrdenEstadoRubro) {
		this.isPermisoOrdenEstadoRubro = isPermisoOrdenEstadoRubro;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoRubro() {
		return isVisibilidadCeldaNuevoEstadoRubro;
	}

	public void setIsVisibilidadCeldaNuevoEstadoRubro(Boolean isVisibilidadCeldaNuevoEstadoRubro) {
		this.isVisibilidadCeldaNuevoEstadoRubro = isVisibilidadCeldaNuevoEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoRubro() {
		return isVisibilidadCeldaDuplicarEstadoRubro;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoRubro(Boolean isVisibilidadCeldaDuplicarEstadoRubro) {
		this.isVisibilidadCeldaDuplicarEstadoRubro = isVisibilidadCeldaDuplicarEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoRubro() {
		return isVisibilidadCeldaCopiarEstadoRubro;
	}

	public void setIsVisibilidadCeldaCopiarEstadoRubro(Boolean isVisibilidadCeldaCopiarEstadoRubro) {
		this.isVisibilidadCeldaCopiarEstadoRubro = isVisibilidadCeldaCopiarEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoRubro() {
		return isVisibilidadCeldaVerFormEstadoRubro;
	}

	public void setIsVisibilidadCeldaVerFormEstadoRubro(Boolean isVisibilidadCeldaVerFormEstadoRubro) {
		this.isVisibilidadCeldaVerFormEstadoRubro = isVisibilidadCeldaVerFormEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoRubro() {
		return isVisibilidadCeldaOrdenEstadoRubro;
	}

	public void setIsVisibilidadCeldaOrdenEstadoRubro(Boolean isVisibilidadCeldaOrdenEstadoRubro) {
		this.isVisibilidadCeldaOrdenEstadoRubro = isVisibilidadCeldaOrdenEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoRubro() {
		return isVisibilidadCeldaNuevoRelacionesEstadoRubro;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoRubro(Boolean isVisibilidadCeldaNuevoRelacionesEstadoRubro) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoRubro = isVisibilidadCeldaNuevoRelacionesEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoRubro() {
		return isVisibilidadCeldaModificarEstadoRubro;
	}

	public void setIsVisibilidadCeldaModificarEstadoRubro(Boolean isVisibilidadCeldaModificarEstadoRubro) {
		this.isVisibilidadCeldaModificarEstadoRubro = isVisibilidadCeldaModificarEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoRubro() {
		return isVisibilidadCeldaActualizarEstadoRubro;
	}

	public void setIsVisibilidadCeldaActualizarEstadoRubro(Boolean isVisibilidadCeldaActualizarEstadoRubro) {
		this.isVisibilidadCeldaActualizarEstadoRubro = isVisibilidadCeldaActualizarEstadoRubro;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoRubro() {
		return isVisibilidadCeldaEliminarEstadoRubro;
	}

	public void setIsVisibilidadCeldaEliminarEstadoRubro(Boolean isVisibilidadCeldaEliminarEstadoRubro) {
		this.isVisibilidadCeldaEliminarEstadoRubro = isVisibilidadCeldaEliminarEstadoRubro;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoRubro() {
		return isVisibilidadCeldaCancelarEstadoRubro;
	}

	public void setIsVisibilidadCeldaCancelarEstadoRubro(Boolean isVisibilidadCeldaCancelarEstadoRubro) {
		this.isVisibilidadCeldaCancelarEstadoRubro = isVisibilidadCeldaCancelarEstadoRubro;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoRubro() {
		return isVisibilidadCeldaGuardarEstadoRubro;
	}

	public void setIsVisibilidadCeldaGuardarEstadoRubro(Boolean isVisibilidadCeldaGuardarEstadoRubro) {
		this.isVisibilidadCeldaGuardarEstadoRubro = isVisibilidadCeldaGuardarEstadoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoRubro() {
		return isVisibilidadCeldaGuardarCambiosEstadoRubro;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoRubro(Boolean isVisibilidadCeldaGuardarCambiosEstadoRubro) {
		this.isVisibilidadCeldaGuardarCambiosEstadoRubro = isVisibilidadCeldaGuardarCambiosEstadoRubro;
	}
		
	public EstadoRubroSessionBean getestadorubroSessionBean() {
		return this.estadorubroSessionBean;
	}
	
	public void setestadorubroSessionBean(EstadoRubroSessionBean estadorubroSessionBean) {
		this.estadorubroSessionBean=estadorubroSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(EstadoRubro estadorubro)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(EstadoRubro estadorubro,EstadoRubro estadorubroAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoRubro(estadorubro);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadorubroAux.setId(estadorubro.getId());
		estadorubroAux.setVersionRow(estadorubro.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoRubro();
		
			int intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadorubroValidator.getInvalidValues(this.estadorubro);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadorubroLogic.setDatosCliente(datosCliente);
			estadorubroLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadorubroAux=new  EstadoRubro();
				
				estadorubroAux.setIsNew(true);
				estadorubroAux.setIsChanged(true);
				
				estadorubroAux.setEstadoRubroOriginal(this.estadorubro);
				
				estadorubroAux.setId(this.estadorubro.getId());	
				estadorubroAux.setVersionRow(this.estadorubro.getVersionRow());	
				estadorubroAux.setcodigo(this.estadorubro.getcodigo());	
				estadorubroAux.setnombre(this.estadorubro.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadorubroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadorubroAux,estadorubroLogic.getEstadoRubros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorubroAux,estadorubros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorubroLogic.saveEstadoRubros();//WithConnection
						//estadorubroLogic.getSetVersionRowEstadoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadorubro,estadorubroAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados().addAll(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleados.addAll(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadorubroLogic.saveEstadoRubroRelaciones(estadorubroAux,this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());//WithConnection
								//estadorubroLogic.getSetVersionRowEstadoRubros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadorubro,estadorubroAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleados= new ArrayList<RubroEmpleado>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadorubroAux.setRubroEmpleados(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadorubroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadorubroAux,estadorubroLogic.getEstadoRubros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadorubroAux,estadorubros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadorubro,estadorubroAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadorubroAux=new  EstadoRubro();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadorubroSessionBean.getEsGuardarRelacionado() 
					|| (this.estadorubroSessionBean.getEsGuardarRelacionado() && this.estadorubro.getId()>=0)) {
						
					estadorubroAux.setIsNew(false);
				}
				
				estadorubroAux.setIsDeleted(false);
			
				estadorubroAux.setId(this.estadorubro.getId());	
				estadorubroAux.setVersionRow(this.estadorubro.getVersionRow());	
				estadorubroAux.setcodigo(this.estadorubro.getcodigo());	
				estadorubroAux.setnombre(this.estadorubro.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadorubroAux,estadorubroLogic.getEstadoRubros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorubroAux,estadorubros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorubroLogic.saveEstadoRubros();//WithConnection
						//estadorubroLogic.getSetVersionRowEstadoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadorubro,estadorubroAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados().addAll(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleados.addAll(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadorubroLogic.saveEstadoRubroRelaciones(estadorubroAux,this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());//WithConnection
								//estadorubroLogic.getSetVersionRowEstadoRubros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadorubro,estadorubroAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleados= new ArrayList<RubroEmpleado>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadorubroAux.setRubroEmpleados(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadorubroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadorubroAux,estadorubroLogic.getEstadoRubros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadorubroAux,estadorubros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadorubro,estadorubroAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadorubroAux=new  EstadoRubro();
				
				estadorubroAux.setIsNew(false);
				estadorubroAux.setIsChanged(false);
				
				estadorubroAux.setIsDeleted(true);
				
				estadorubroAux.setId(this.estadorubro.getId());	
				estadorubroAux.setVersionRow(this.estadorubro.getVersionRow());	
				estadorubroAux.setcodigo(this.estadorubro.getcodigo());	
				estadorubroAux.setnombre(this.estadorubro.getnombre());	
				
				if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadorubroAux.getId()>=0) {	
						this.estadorubrosEliminados.add(estadorubroAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadorubroAux,estadorubroLogic.getEstadoRubros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorubroAux,estadorubros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorubroLogic.saveEstadoRubros();//WithConnection
						//estadorubroLogic.getSetVersionRowEstadoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados().addAll(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleados.addAll(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadorubroLogic.saveEstadoRubroRelaciones(estadorubroAux,this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());//WithConnection
								//estadorubroLogic.getSetVersionRowEstadoRubros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.setRubroEmpleados(new ArrayList<RubroEmpleado>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleados= new ArrayList<RubroEmpleado>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadorubroAux.setRubroEmpleados(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadorubroSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadorubroAux,estadorubroLogic.getEstadoRubros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadorubroAux,estadorubros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.getEstadoRubros().addAll(this.estadorubrosEliminados);
					
					estadorubroLogic.saveEstadoRubros();//WithConnection
					//estadorubroLogic.getSetVersionRowEstadoRubros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadorubrosEliminados= new ArrayList<EstadoRubro>();		
			}
			
			if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Rubro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadorubro=estadorubroAux;
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
      		//this.finishProcessEstadoRubro();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoRubro estadorubroLocal) throws Exception {
		
		if(this.estadorubroSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadorubroLocal.setRubroEmpleados(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());
			
			} else {
			
				estadorubroLocal.setRubroEmpleados(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleados);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoRubro estadorubroLocal) throws Exception {	
		if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoRubroActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadorubroValidator.getInvalidValues(this.estadorubro);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoRubro estadorubro,List<EstadoRubro> estadorubros) throws Exception {
		try	{		
			EstadoRubroConstantesFunciones.actualizarLista(estadorubro,estadorubros,this.estadorubroSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoRubro estadorubro,List<EstadoRubro> estadorubros) throws Exception {
		try	{			
			EstadoRubroConstantesFunciones.actualizarSelectedLista(estadorubro,estadorubros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoRubro> estadorubrosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadorubrosLocal=this.estadorubroLogic.getEstadoRubros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadorubrosLocal=this.estadorubros;
			}
			//ARCHITECTURE
		
			for(EstadoRubro estadorubroLocal:estadorubrosLocal) {
				if(this.permiteMantenimiento(estadorubroLocal) && estadorubroLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoRubroConstantesFunciones.getEstadoRubroLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoRubroConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRubro.jLabelcodigoEstadoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoRubroConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRubro.jLabelnombreEstadoRubro,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRubro.jLabelcodigoEstadoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRubro.jLabelnombreEstadoRubro,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("RubroEmpleado")) {
			if(this.estadorubro==null) {
				this.estadorubro= new EstadoRubro();
			}

			if(this.estadorubroSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoRubro
				this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);

				this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.getrubroempleado().setEstadoRubro(this.estadorubro);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoRubro--;	
		
		
		this.estadorubroAux=new EstadoRubro();
		
		this.estadorubroAux.setId(this.iIdNuevoEstadoRubro);
		this.estadorubroAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadorubroLogic.getEstadoRubros().add(this.estadorubroAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadorubros.add(this.estadorubroAux);
		}
		//ARCHITECTURE
		
		this.estadorubro=this.estadorubroAux;
		
		if(EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoRubro(this.estadorubro);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRubro(this.estadorubro);
		}
				
		//this.setDefaultControlesEstadoRubro();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoRubro();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoRubro();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRubro();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRubro(this.estadorubroBean,this.estadorubro,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoRubroConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
			classes=EstadoRubroConstantesFunciones.getClassesRelationshipsOfEstadoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadorubroReturnGeneral=estadorubroLogic.procesarEventosEstadoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadorubroLogic.getEstadoRubros(),this.estadorubro,this.estadorubroParameterGeneral,this.isEsNuevoEstadoRubro,classes);//this.estadorubroLogic.getEstadoRubro()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoRubro(this.estadorubroReturnGeneral,this.estadorubroBean,false);
		
		if(this.estadorubroReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRubro(this.estadorubroReturnGeneral.getEstadoRubro());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoRubro(this.estadorubroReturnGeneral.getEstadoRubro());
		}
		
		if(this.estadorubroReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoRubro(this.estadorubroReturnGeneral.getEstadoRubro(),classes);//this.estadorubroBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoRubro();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoRubro();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoRubroBeanSwingJInternalFrameAdditional.RecargarFormEstadoRubro(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoRubro(false);
						
			if(estadorubroSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.getEsGuardarRelacionado() && RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRubroEmpleadoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRubro();
			}
			
			this.actualizarVisualTableDatosEstadoRubro();
			
			this.jTableDatosEstadoRubro.setRowSelectionInterval(this.getIndiceNuevoEstadoRubro(), this.getIndiceNuevoEstadoRubro());
			
			this.seleccionarFilaTablaEstadoRubroActual();
						
			this.actualizarEstadoCeldasBotonesEstadoRubro("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoRubro(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.setEnabled(isHabilitar && this.estadorubroConstantesFunciones.activarcodigoEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.setEnabled(isHabilitar && this.estadorubroConstantesFunciones.activarnombreEstadoRubro);	
		
	};
	
	public void setDefaultControlesEstadoRubro() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoRubro(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadorubroSessionBean.setConGuardarRelaciones(true);			
			this.estadorubroSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadorubroSessionBean.setConGuardarRelaciones(false);			
			this.estadorubroSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoRubro() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
				if(estadorubroAux.getId().equals(this.iIdNuevoEstadoRubro)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRubro estadorubroAux:this.estadorubros) {
				if(estadorubroAux.getId().equals(this.iIdNuevoEstadoRubro)) {
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
	
	public int getIndiceActualEstadoRubro(EstadoRubro estadorubro,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
				if(estadorubroAux.getId().equals(estadorubro.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRubro estadorubroAux:this.estadorubros) {
				if(estadorubroAux.getId().equals(estadorubro.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoRubro(EstadoRubro estadorubroOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
				if(estadorubroAux.getEstadoRubroOriginal().getId().equals(estadorubroOriginal.getId())) {
					existe=true;
					estadorubroOriginal.setId(estadorubroAux.getId());
					estadorubroOriginal.setVersionRow(estadorubroAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRubro estadorubroAux:this.estadorubros) {
				if(estadorubroAux.getEstadoRubroOriginal().getId().equals(estadorubroOriginal.getId())) {
					existe=true;
					estadorubroOriginal.setId(estadorubroAux.getId());
					estadorubroOriginal.setVersionRow(estadorubroAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoRubro(Boolean esParaCancelar) throws Exception {
		estadorubrosAux=new ArrayList<EstadoRubro>();
		estadorubroAux=new EstadoRubro();
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
					if(estadorubroAux.getId()<0) {
						estadorubrosAux.add(estadorubroAux);
					}		
				}
				this.iIdNuevoEstadoRubro=0L;
				this.estadorubroLogic.getEstadoRubros().removeAll(estadorubrosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRubro estadorubroAux:this.estadorubros) {
					if(estadorubroAux.getId()<0) {
						estadorubrosAux.add(estadorubroAux);
					}		
				}
				this.iIdNuevoEstadoRubro=0L;
				this.estadorubros.removeAll(estadorubrosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoRubro 
					&& this.estadorubroLogic.getEstadoRubros().size()>0
					) {
					estadorubroAux=this.estadorubroLogic.getEstadoRubros().get(this.estadorubroLogic.getEstadoRubros().size() - 1);
				
					if(estadorubroAux.getId()<0) {
						this.estadorubroLogic.getEstadoRubros().remove(estadorubroAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoRubro && this.estadorubros.size()>0) {
					estadorubroAux=this.estadorubros.get(this.estadorubros.size() - 1);
				
					if(estadorubroAux.getId()<0) {
						this.estadorubros.remove(estadorubroAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoRubro(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadorubro.getId()<0) {
				this.estadorubroLogic.getEstadoRubros().remove(this.estadorubro);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadorubro.getId()<0) {
				this.estadorubros.remove(this.estadorubro);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoRubro(List<EstadoRubro> estadorubrosAux) throws Exception {
		EstadoRubroConstantesFunciones.setEstadosInicialesEstadoRubro(estadorubrosAux);
	}
	
	public void setEstadosInicialesEstadoRubro(EstadoRubro estadorubroAux) throws Exception {
		EstadoRubroConstantesFunciones.setEstadosInicialesEstadoRubro(estadorubroAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoRubroActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoRubroActual()) {
				if(!this.isEsNuevoEstadoRubro) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoRubro=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoRubroActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Rubro ?", "MANTENIMIENTO DE Estado Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoRubro estadorubro) throws Exception {
		EstadoRubroConstantesFunciones.seleccionarAsignar(this.estadorubro,estadorubro);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoRubro=this.isPermisoActualizarOriginalEstadoRubro;
			
			
			this.seleccionarAsignar(estadorubro);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoRubroConstantesFunciones.quitarEspaciosEstadoRubro(this.estadorubro,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadorubroSessionBean.setsFuncionBusquedaRapida(this.estadorubroSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoRubro) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoRubro(esParaCancelar);				
				this.cancelarNuevoEstadoRubro(esParaCancelar);								
			}
			
			this.estadorubro=new EstadoRubro();
			
			this.inicializarEstadoRubro();
			
			this.actualizarEstadoCeldasBotonesEstadoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoRubro() throws Exception {
		try {
			EstadoRubroConstantesFunciones.inicializarEstadoRubro(this.estadorubro);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadorubroLogic.getEstadoRubros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoRubros(String sAccionBusqueda,List<EstadoRubro> estadorubrosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoRubro"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoRubroMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoRubroMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoRubro"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Rubros");		
		parameters.put("busquedapor", EstadoRubroConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(RubroEmpleado.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoRubroLogic estadorubroLogicAuxiliar=new EstadoRubroLogic();
					estadorubroLogicAuxiliar.setDatosCliente(estadorubroLogic.getDatosCliente());				
					estadorubroLogicAuxiliar.setEstadoRubros(estadorubrosParaReportes);
					
					estadorubroLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoRubroWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadorubrosParaReportes=estadorubroLogicAuxiliar.getEstadoRubros();
					
					//estadorubroLogic.getNewConnexionToDeep();
					
					//for (EstadoRubro estadorubro:estadorubrosParaReportes) {
					//	estadorubroLogic.deepLoad(estadorubro, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadorubroLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadorubroLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileRubroEmpleado = AuxiliarReportes.class.getResourceAsStream("RubroEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_rubroempleado", reportFileRubroEmpleado);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoRubro=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoRubro=new JRBeanArrayDataSource(EstadoRubroJInternalFrame.TraerEstadoRubroBeans(estadorubrosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoRubro);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoRubroConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoRubroConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoRubroBean.TraerEstadoRubroBeans(estadorubrosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoRubros(sAccionBusqueda,sTipoArchivoReporte,estadorubrosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoRubros(sAccionBusqueda,sTipoArchivoReporte,estadorubrosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoRubroActionPerformed(null);
					//this.generarExcelReporteEstadoRubros(sAccionBusqueda,sTipoArchivoReporte,estadorubrosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoRubros(sAccionBusqueda,sTipoArchivoReporte,estadorubrosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoRubros(sAccionBusqueda,sTipoArchivoReporte,estadorubrosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoRubros(sAccionBusqueda,sTipoArchivoReporte,estadorubrosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRubro> estadorubrosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorubro";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRubros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRubro("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoRubro estadorubro : estadorubrosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoRubroConstantesFunciones.generarExcelReporteDataEstadoRubro("NORMAL",row,workbook,estadorubro,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoRubro(String sTipo,Row row,Workbook workbook) {
		
		EstadoRubroConstantesFunciones.generarExcelReporteHeaderEstadoRubro(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRubro> estadorubrosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorubro_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRubros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoRubro estadorubro : estadorubrosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoRubroConstantesFunciones.getEstadoRubroDescripcion(estadorubro));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRubroConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadorubro.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRubroConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadorubro.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRubro> estadorubrosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoRubro> estadorubrosRespaldo=null;
		
		classes=EstadoRubroConstantesFunciones.getClassesRelationshipsOfEstadoRubro(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadorubroLogic.setDatosCliente(this.datosCliente);
		this.estadorubroLogic.setDatosDeep(this.datosDeep);
		this.estadorubroLogic.setIsConDeep(true);
		
		estadorubrosRespaldo=this.estadorubroLogic.getEstadoRubros();
		
		this.estadorubroLogic.setEstadoRubros(estadorubrosParaReportes);	
		this.estadorubroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadorubrosParaReportes=this.estadorubroLogic.getEstadoRubros();
		this.estadorubroLogic.setEstadoRubros(estadorubrosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorubro_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRubros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRubro("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoRubro estadorubro : estadorubrosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoRubro("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoRubroConstantesFunciones.generarExcelReporteDataEstadoRubro("NORMAL",row,workbook,estadorubro,cellStyleDataAux);
		
			
			


				//RubroEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadorubro.getRubroEmpleados()!=null && estadorubro.getRubroEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RubroEmpleadoConstantesFunciones.generarExcelReporteHeaderRubroEmpleado("RELACIONADO",row,workbook);
				}

				if(estadorubro.getRubroEmpleados()!=null) {
					i2=0;
					for(RubroEmpleado rubroempleado : estadorubro.getRubroEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RubroEmpleadoConstantesFunciones.generarExcelReporteDataRubroEmpleado("RELACIONADO",row,workbook,rubroempleado,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoRubroConstantesFunciones.getEstadoRubroDescripcion(estadorubro));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRubro.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoRubro() throws Exception {		
		this.startProcessEstadoRubro(true);
	}
	
	public void startProcessEstadoRubro(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoRubro, this.jScrollPanelDatosEstadoRubro,this.jPanelPaginacionEstadoRubro, this.jScrollPanelDatosEdicionEstadoRubro, this.jPanelAccionesEstadoRubro,this.jPanelAccionesFormularioEstadoRubro,this.jmenuBarEstadoRubro,this.jmenuBarDetalleEstadoRubro,this.jTtoolBarEstadoRubro,this.jTtoolBarDetalleEstadoRubro);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRubro=null; 
		
		final JPanel jPanelParametrosReportesEstadoRubro=this.jPanelParametrosReportesEstadoRubro;
		//final JScrollPane jScrollPanelDatosEstadoRubro=this.jScrollPanelDatosEstadoRubro;
		final JTable jTableDatosEstadoRubro=this.jTableDatosEstadoRubro;		
		final JPanel jPanelPaginacionEstadoRubro=this.jPanelPaginacionEstadoRubro;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRubro=this.jScrollPanelDatosEdicionEstadoRubro;
		final JPanel jPanelAccionesEstadoRubro=this.jPanelAccionesEstadoRubro;
		
		JPanel jPanelCamposAuxiliarEstadoRubro=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRubro=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			jPanelCamposAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jPanelCamposEstadoRubro;
			jPanelAccionesFormularioAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jPanelAccionesFormularioEstadoRubro;
		}
		
		final JPanel jPanelCamposEstadoRubro=jPanelCamposAuxiliarEstadoRubro;
		final JPanel jPanelAccionesFormularioEstadoRubro=jPanelAccionesFormularioAuxiliarEstadoRubro;
		
		
		final JMenuBar jmenuBarEstadoRubro=this.jmenuBarEstadoRubro;
		final JToolBar jTtoolBarEstadoRubro=this.jTtoolBarEstadoRubro;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoRubro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRubro=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			jmenuBarDetalleAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jmenuBarDetalleEstadoRubro;
			jTtoolBarDetalleAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jTtoolBarDetalleEstadoRubro;
		}
		
		final JMenuBar jmenuBarDetalleEstadoRubro=jmenuBarDetalleAuxiliarEstadoRubro;
		final JToolBar jTtoolBarDetalleEstadoRubro=jTtoolBarDetalleAuxiliarEstadoRubro;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRubro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRubro;
			processRunnable.jTableDatos=jTableDatosEstadoRubro;
			processRunnable.jPanelCampos=jPanelCamposEstadoRubro;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRubro;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRubro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRubro;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRubro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRubro;
			processRunnable.jTtoolBar=jTtoolBarEstadoRubro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRubro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoRubro ,jPanelParametrosReportesEstadoRubro,jTableDatosEstadoRubro, /*jScrollPanelDatosEstadoRubro,*/jPanelCamposEstadoRubro,jPanelPaginacionEstadoRubro, /*jScrollPanelDatosEdicionEstadoRubro,*/ jPanelAccionesEstadoRubro,jPanelAccionesFormularioEstadoRubro,jmenuBarEstadoRubro,jmenuBarDetalleEstadoRubro,jTtoolBarEstadoRubro,jTtoolBarDetalleEstadoRubro);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoRubro, jScrollPanelDatosEstadoRubro,jPanelPaginacionEstadoRubro, jScrollPanelDatosEdicionEstadoRubro, jPanelAccionesEstadoRubro,jPanelAccionesFormularioEstadoRubro,jmenuBarEstadoRubro,jmenuBarDetalleEstadoRubro,jTtoolBarEstadoRubro,jTtoolBarDetalleEstadoRubro);
						
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
	
	public void finishProcessEstadoRubro() {// throws Exception 
		this.finishProcessEstadoRubro(true);
	}
	
	public void finishProcessEstadoRubro(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoRubro, this.jScrollPanelDatosEstadoRubro,this.jPanelPaginacionEstadoRubro, this.jScrollPanelDatosEdicionEstadoRubro, this.jPanelAccionesEstadoRubro,this.jPanelAccionesFormularioEstadoRubro,this.jmenuBarEstadoRubro,this.jmenuBarDetalleEstadoRubro,this.jTtoolBarEstadoRubro,this.jTtoolBarDetalleEstadoRubro);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRubro=null; 
		
		final JPanel jPanelParametrosReportesEstadoRubro=this.jPanelParametrosReportesEstadoRubro;
		//final JScrollPane jScrollPanelDatosEstadoRubro=this.jScrollPanelDatosEstadoRubro;
		final JTable jTableDatosEstadoRubro=this.jTableDatosEstadoRubro;		
		final JPanel jPanelPaginacionEstadoRubro=this.jPanelPaginacionEstadoRubro;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRubro=this.jScrollPanelDatosEdicionEstadoRubro;
		final JPanel jPanelAccionesEstadoRubro=this.jPanelAccionesEstadoRubro;
		
		JPanel jPanelCamposAuxiliarEstadoRubro=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRubro=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			jPanelCamposAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jPanelCamposEstadoRubro;
			jPanelAccionesFormularioAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jPanelAccionesFormularioEstadoRubro;
		}
		
		final JPanel jPanelCamposEstadoRubro=jPanelCamposAuxiliarEstadoRubro;
		final JPanel jPanelAccionesFormularioEstadoRubro=jPanelAccionesFormularioAuxiliarEstadoRubro;
		
		
		final JMenuBar jmenuBarEstadoRubro=this.jmenuBarEstadoRubro;		
		final JToolBar jTtoolBarEstadoRubro=this.jTtoolBarEstadoRubro;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoRubro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRubro=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			jmenuBarDetalleAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jmenuBarDetalleEstadoRubro;
			jTtoolBarDetalleAuxiliarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jTtoolBarDetalleEstadoRubro;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoRubro=jmenuBarDetalleAuxiliarEstadoRubro;
		final JToolBar jTtoolBarDetalleEstadoRubro=jTtoolBarDetalleAuxiliarEstadoRubro;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRubro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRubro;
			processRunnable.jTableDatos=jTableDatosEstadoRubro;
			processRunnable.jPanelCampos=jPanelCamposEstadoRubro;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRubro;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRubro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRubro;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRubro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRubro;
			processRunnable.jTtoolBar=jTtoolBarEstadoRubro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRubro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoRubro ,jPanelParametrosReportesEstadoRubro, jTableDatosEstadoRubro,/*jScrollPanelDatosEstadoRubro,*/jPanelCamposEstadoRubro,jPanelPaginacionEstadoRubro, /*jScrollPanelDatosEdicionEstadoRubro,*/ jPanelAccionesEstadoRubro,jPanelAccionesFormularioEstadoRubro,jmenuBarEstadoRubro,jmenuBarDetalleEstadoRubro,jTtoolBarEstadoRubro,jTtoolBarDetalleEstadoRubro));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoRubro(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoRubro(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoRubro(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoRubro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoRubro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoRubro,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoRubro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoRubro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoRubro,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadorubroConstantesFunciones.getsFinalQueryEstadoRubro();
		String  finalQueryPaginacionTodos=this.estadorubroConstantesFunciones.getsFinalQueryEstadoRubro();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoRubroConstantesFunciones.getArrayColumnasGlobalesNoEstadoRubro(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoRubroConstantesFunciones.getArrayColumnasGlobalesEstadoRubro(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoRubroConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadorubrosEliminados= new ArrayList<EstadoRubro>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoRubro();
		
				///*EstadoRubroSessionBean*/this.estadorubroSessionBean=new EstadoRubroSessionBean();
			
			if(this.estadorubroSessionBean==null) {
				this.estadorubroSessionBean=new EstadoRubroSessionBean();
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
					this.iNumeroPaginacion=EstadoRubroConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoRubroConstantesFunciones.getClassesForeignKeysOfEstadoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadorubro."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadorubrosAux= new ArrayList<EstadoRubro>();
			
				
			estadorubroLogic.setDatosCliente(this.datosCliente);
			estadorubroLogic.setDatosDeep(this.datosDeep);
			estadorubroLogic.setIsConDeep(true);
			
			
			estadorubroLogic.getEstadoRubroDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadorubroLogic.getTodosEstadoRubros(finalQueryGlobal,pagination);
					
					//estadorubroLogic.getTodosEstadoRubrosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadorubroLogic.getEstadoRubros()==null|| estadorubroLogic.getEstadoRubros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadorubrosAux= new ArrayList<EstadoRubro>();
							estadorubrosAux.addAll(estadorubroLogic.getEstadoRubros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadorubrosAux= new ArrayList<EstadoRubro>();
							estadorubrosAux.addAll(estadorubros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadorubroLogic.getTodosEstadoRubros(finalQueryGlobal+"",this.pagination);												
							
							//estadorubroLogic.getTodosEstadoRubrosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoRubros("Todos",estadorubroLogic.getEstadoRubros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadorubroLogic.setEstadoRubros(new ArrayList<EstadoRubro>());					
							estadorubroLogic.getEstadoRubros().addAll(estadorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadorubros=new ArrayList<EstadoRubro>();
							estadorubros.addAll(estadorubrosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoRubro=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoRubro=this.idActual;
				
				} else if(this.idEstadoRubroActual!=null && this.idEstadoRubroActual!=0L) {
					idEstadoRubro=idEstadoRubroActual;
				}
				
					
				this.sDetalleReporte=EstadoRubroConstantesFunciones.getDetalleIndicePorId(idEstadoRubro);
				
				this.estadorubros=new ArrayList<EstadoRubro>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadorubroLogic.getEntity(idEstadoRubro);
					
					//estadorubroLogic.getEntityWithConnection(idEstadoRubro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadorubroLogic.setEstadoRubros(new ArrayList<EstadoRubro>());
					estadorubroLogic.getEstadoRubros().add(estadorubroLogic.getEstadoRubro());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadorubros=new ArrayList<EstadoRubro>();
					this.estadorubros.add(estadorubro);
				}
				
				if(estadorubroLogic.getEstadoRubro()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoRubro();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoRubro();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadorubroLogic.getEstadoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadorubros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadorubroLogic.getEstadoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadorubros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoRubro estadorubro) {
		Boolean permite=true;
		
		if(this.estadorubro.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoRubroConstantesFunciones.getOrderByListaEstadoRubro();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoRubroConstantesFunciones.getOrderByListaEstadoRubro();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRubro estadorubro:estadorubroLogic.getEstadoRubros()) {
				if(estadorubro.getsType().equals(Constantes2.S_TOTALES)) {
					estadorubroTotales=estadorubro;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRubro estadorubro:this.estadorubros) {
				if(estadorubro.getsType().equals(Constantes2.S_TOTALES)) {
					estadorubroTotales=estadorubro;
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
			this.estadorubroAux=new EstadoRubro();
			this.estadorubroAux.setsType(Constantes2.S_TOTALES);
			this.estadorubroAux.setIsNew(false);
			this.estadorubroAux.setIsChanged(false);
			this.estadorubroAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoRubroConstantesFunciones.TotalizarValoresFilaEstadoRubro(this.estadorubroLogic.getEstadoRubros(),this.estadorubroAux);
				
				this.estadorubroLogic.getEstadoRubros().add(this.estadorubroAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoRubroConstantesFunciones.TotalizarValoresFilaEstadoRubro(this.estadorubros,this.estadorubroAux);
				
				this.estadorubros.add(this.estadorubroAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadorubroTotales=new EstadoRubro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadorubroLogic.getEstadoRubros().remove(estadorubroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadorubros.remove(estadorubroTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadorubroTotales=new EstadoRubro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRubro estadorubro:estadorubroLogic.getEstadoRubros()) {
				if(estadorubro.getsType().equals(Constantes2.S_TOTALES)) {
					estadorubroTotales=estadorubro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRubroConstantesFunciones.TotalizarValoresFilaEstadoRubro(this.estadorubroLogic.getEstadoRubros(),estadorubroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRubro estadorubro:this.estadorubros) {
				if(estadorubro.getsType().equals(Constantes2.S_TOTALES)) {
					estadorubroTotales=estadorubro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRubroConstantesFunciones.TotalizarValoresFilaEstadoRubro(this.estadorubros,estadorubroTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoRubro() {
		this.isPermisoTodoEstadoRubro=false;
		this.isPermisoNuevoEstadoRubro=false;
		this.isPermisoActualizarEstadoRubro=false;
		this.isPermisoActualizarOriginalEstadoRubro=false;
		this.isPermisoEliminarEstadoRubro=false;
		this.isPermisoGuardarCambiosEstadoRubro=false;
		this.isPermisoConsultaEstadoRubro=false;
		this.isPermisoBusquedaEstadoRubro=false;
		this.isPermisoReporteEstadoRubro=false;		
		this.isPermisoOrdenEstadoRubro=false;		
		this.isPermisoPaginacionMedioEstadoRubro=false;		
		this.isPermisoPaginacionAltoEstadoRubro=false;
		this.isPermisoPaginacionTodoEstadoRubro=false;
		this.isPermisoCopiarEstadoRubro=false;		
		this.isPermisoVerFormEstadoRubro=false;		
		this.isPermisoDuplicarEstadoRubro=false;		
		this.isPermisoOrdenEstadoRubro=false;		
	}
	
	public void setPermisosUsuarioEstadoRubro(Boolean isPermiso) {
		this.isPermisoTodoEstadoRubro=isPermiso;
		this.isPermisoNuevoEstadoRubro=isPermiso;
		this.isPermisoActualizarEstadoRubro=isPermiso;
		this.isPermisoActualizarOriginalEstadoRubro=isPermiso;
		this.isPermisoEliminarEstadoRubro=isPermiso;
		this.isPermisoGuardarCambiosEstadoRubro=isPermiso;
		this.isPermisoConsultaEstadoRubro=isPermiso;
		this.isPermisoBusquedaEstadoRubro=isPermiso;
		this.isPermisoReporteEstadoRubro=isPermiso;
		this.isPermisoOrdenEstadoRubro=isPermiso;		
		this.isPermisoPaginacionMedioEstadoRubro=isPermiso;		
		this.isPermisoPaginacionAltoEstadoRubro=isPermiso;		
		this.isPermisoPaginacionTodoEstadoRubro=isPermiso;		
		this.isPermisoCopiarEstadoRubro=isPermiso;		
		this.isPermisoVerFormEstadoRubro=isPermiso;		
		this.isPermisoDuplicarEstadoRubro=isPermiso;
		this.isPermisoOrdenEstadoRubro=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoRubro(Boolean isPermiso) {
		//this.isPermisoTodoEstadoRubro=isPermiso;
		this.isPermisoNuevoEstadoRubro=isPermiso;
		this.isPermisoActualizarEstadoRubro=isPermiso;
		this.isPermisoActualizarOriginalEstadoRubro=isPermiso;
		this.isPermisoEliminarEstadoRubro=isPermiso;
		this.isPermisoGuardarCambiosEstadoRubro=isPermiso;
		//this.isPermisoConsultaEstadoRubro=isPermiso;
		//this.isPermisoBusquedaEstadoRubro=isPermiso;
		//this.isPermisoReporteEstadoRubro=isPermiso;
		//this.isPermisoOrdenEstadoRubro=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoRubro=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoRubro=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoRubro=isPermiso;		
		//this.isPermisoCopiarEstadoRubro=isPermiso;		
		//this.isPermisoDuplicarEstadoRubro=isPermiso;
		//this.isPermisoOrdenEstadoRubro=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRubroClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(RubroEmpleadoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosRubroEmpleado=false;
		this.isTienePermisosRubroEmpleado=this.verificarGetPermisosUsuarioOpcionEstadoRubroClaseRelacionada(this.opcionsRelacionadas,RubroEmpleadoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoRubro(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRubroClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosRubroEmpleado=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoRubroClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoRubroClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoRubroClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosRubroEmpleado && this.jInternalFrameDetalleFormEstadoRubro!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.remove(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoRubro() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoRubroConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoRubro=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoRubro=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoRubro=this.isPermisoActualizarEstadoRubro;
			this.isPermisoEliminarEstadoRubro=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoRubro=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoRubro=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoRubro=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoRubro=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoRubro=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRubro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoRubro=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoRubro=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoRubro=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoRubro=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoRubro=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoRubro=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRubro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoRubro.setToolTipText(this.jTableDatosEstadoRubro.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoRubro(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoRubro(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoRubro() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosRubroEmpleado && this.estadorubroConstantesFunciones.mostrarRubroEmpleadoEstadoRubro && !EstadoRubroConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Rubro Empleado");
			reporte.setsDescripcion("Rubro Empleado");
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
	
		
	public void inicializarCombosForeignKeyEstadoRubroListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoRubroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoRubroJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoRubroListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoRubroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoRubro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoRubro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoRubro(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoRubro()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRubro();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoRubro(EstadoRubro estadorubro)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoRubro(EstadoRubro estadorubro,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoRubro()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRubro()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoRubro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoRubro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoRubro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoRubro()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoRubro(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoRubro()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoRubroBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoRubroBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoRubroBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadorubroSessionBean=new EstadoRubroSessionBean(); 
		this.estadorubroConstantesFunciones=new EstadoRubroConstantesFunciones(); 
		this.estadorubroBean=new EstadoRubro();//(this.estadorubroConstantesFunciones); 		
		this.estadorubroReturnGeneral=new EstadoRubroParameterReturnGeneral(); 
		
		this.estadorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoRubro(true);
			
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
			
			this.estadorubroConstantesFunciones=new EstadoRubroConstantesFunciones(); 
			this.estadorubroBean=new EstadoRubro();//this.estadorubroConstantesFunciones); 			
			this.estadorubroReturnGeneral=new EstadoRubroParameterReturnGeneral(); 
		
			EstadoRubroBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Rubro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadorubro=new EstadoRubro();
			this.estadorubros = new ArrayList<EstadoRubro>();
			this.estadorubrosAux = new ArrayList<EstadoRubro>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic=new EstadoRubroLogic();
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			//this.estadorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoRubro);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRubro);	
					}
					
					if(this.jInternalFrameImportacionEstadoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRubro);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoRubro);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRubro);
				this.jInternalFrameDetalleFormEstadoRubro.setVisible(false);
				this.jInternalFrameDetalleFormEstadoRubro.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRubro);
					this.jInternalFrameReporteDinamicoEstadoRubro.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoRubro.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRubro);
					this.jInternalFrameImportacionEstadoRubro.setVisible(false);
					this.jInternalFrameImportacionEstadoRubro.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRubro);
					this.jInternalFrameOrderByEstadoRubro.setVisible(false);
					this.jInternalFrameOrderByEstadoRubro.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoRubroActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoRubroConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadorubroReturnGeneral=new EstadoRubroParameterReturnGeneral();
			
			this.estadorubroParameterGeneral=new EstadoRubroParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadorubroLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(RubroEmpleadoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRubroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadorubroSessionBean.getEsGuardarRelacionado(),this.estadorubroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRubroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadorubroSessionBean.getEsGuardarRelacionado(),this.estadorubroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoRubro=false;
			this.isVisibilidadCeldaDuplicarEstadoRubro=true;
			this.isVisibilidadCeldaCopiarEstadoRubro=true;
			this.isVisibilidadCeldaVerFormEstadoRubro=true;
			this.isVisibilidadCeldaOrdenEstadoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
			this.isVisibilidadCeldaModificarEstadoRubro=false;
			this.isVisibilidadCeldaActualizarEstadoRubro=false;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
			this.isVisibilidadCeldaCancelarEstadoRubro=false;
			this.isVisibilidadCeldaGuardarEstadoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoRubro();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoRubro(false);
			
			this.setPermisosUsuarioEstadoRubro();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadorubroSessionBean.getEsGuardarRelacionado() 
				|| (this.estadorubroSessionBean.getEsGuardarRelacionado() && this.estadorubroSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoRubroClasesRelacionadas();
			}
			
			if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoRubroClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoRubro();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoRubro();
			}
			
			if(!this.isPermisoBusquedaEstadoRubro) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoRubro,this.isPermisoPaginacionMedioEstadoRubro,this.isPermisoPaginacionTodoEstadoRubro);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoRubroConstantesFunciones.getTiposSeleccionarEstadoRubro());
				
				this.tiposColumnasSelect=EstadoRubroConstantesFunciones.getTiposSeleccionarEstadoRubro(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoRubro();				
				//this.tiposRelacionesSelect=EstadoRubroConstantesFunciones.getTiposRelacionesEstadoRubro(true);
				
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
			//if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoRubro();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoRubro(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoRubro(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRubro() ;
			
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
			
			
			this.rubroempleadoLogic=new RubroEmpleadoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadorubroImplementable= (EstadoRubroImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRubroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadorubroImplementableHome= (EstadoRubroImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRubroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadorubros= new ArrayList<EstadoRubro>();
			this.estadorubrosEliminados= new ArrayList<EstadoRubro>();
						
			this.isEsNuevoEstadoRubro=false;
			this.esParaAccionDesdeFormularioEstadoRubro=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoRubro(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoRubro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoRubroBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoRubroConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoRubro(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoRubro();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoRubro();
			}
			
			EstadoRubroBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoRubro(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoRubro: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoRubro() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoRubro")) {
				iIndex=this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();	
				
				

				if(sTitle.equals("Rubro Empleados")) {
					if(!RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoRubro();

						this.cargarParteTabPanelRelacionadaRubroEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoRubro();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaRubroEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoRubro.cargarSessionConBeanSwingJInternalFrameRubroEmpleado(false,true,iIndex);
		this.jButtonRubroEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRubroEmpleado();

		//this.jTabbedPaneRelacionesEstadoRubro.updateUI();
		//this.jTabbedPaneRelacionesEstadoRubro.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoRubro.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("RubroEmpleado")) {
				int row=this.jTableDatosEstadoRubro.getSelectedRow();
				jButtonRubroEmpleadoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Rubro Empleado")) {

					if(this.isTienePermisosRubroEmpleado && this.estadorubroConstantesFunciones.mostrarRubroEmpleadoEstadoRubro && !EstadoRubroConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Rubro Empleados"+"("+RubroEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Rubro Empleados");

						if(estadorubroConstantesFunciones.resaltarRubroEmpleadoEstadoRubro!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadorubroConstantesFunciones.resaltarRubroEmpleadoEstadoRubro);
						}

						jmenuItem.setEnabled(this.estadorubroConstantesFunciones.activarRubroEmpleadoEstadoRubro);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RubroEmpleado"));

						

						this.jInternalFrameDetalleFormEstadoRubro.jmenuDetalleEstadoRubro.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoRubro(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoRubro(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoRubro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoRubroListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoRubro();
		
		this.cargarCombosFrameForeignKeyEstadoRubro();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoRubro();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoRubro();
		}
	}
	
	
	
	public void jButtonNuevoEstadoRubroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
			
			if(jTableDatosEstadoRubro.getRowCount()>=1) {
				jTableDatosEstadoRubro.removeRowSelectionInterval(0, jTableDatosEstadoRubro.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoRubro=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoRubro(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoRubro(true);			
			//this.estadorubro=new EstadoRubro();
			//this.estadorubro.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRubro(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRubro() ;
			
			if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRubro(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadorubro);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);				
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
			if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoRubro: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoRubroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoRubro.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoRubro.getSelectedRows().length;			
			}
			
			estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoRubro--;			
				//EstadoRubro estadorubroAux= new EstadoRubro();			
				//estadorubroAux.setId(this.iIdNuevoEstadoRubro);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoRubro estadorubroOrigen=new EstadoRubro();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoRubro estadorubroOrigen : estadorubrosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadorubroOrigen =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadorubroOrigen =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoRubro();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadorubro.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoRubro(estadorubroOrigen,this.estadorubro,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadorubroLogic.getEstadoRubros().add(this.estadorubroAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadorubros.add(this.estadorubroAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoRubro(false);
				
				this.jTableDatosEstadoRubro.setRowSelectionInterval(this.getIndiceNuevoEstadoRubro(), this.getIndiceNuevoEstadoRubro());
				
				int iLastRow =  this.jTableDatosEstadoRubro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRubro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRubro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRubro(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();									
		
			EstadoRubro estadorubroOrigen=new EstadoRubro();
			EstadoRubro estadorubroDestino=new EstadoRubro();
				
			estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoRubro.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadorubrosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoRubro.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorubroOrigen =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadorubroOrigen =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadorubroDestino =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadorubroDestino =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadorubroOrigen =estadorubrosSeleccionados.get(0);
				estadorubroDestino =estadorubrosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoRubro(estadorubroOrigen,estadorubroDestino,true,false);
				
				estadorubroDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadorubroDestino,estadorubroLogic.getEstadoRubros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadorubroDestino,estadorubros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoRubro(false);
				
				//this.jTableDatosEstadoRubro.setRowSelectionInterval(this.getIndiceNuevoEstadoRubro(), this.getIndiceNuevoEstadoRubro());
				
				int iLastRow =  this.jTableDatosEstadoRubro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRubro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRubro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRubro(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoRubro.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoRubro.isVisible();
			
			
			this.jPanelParametrosReportesEstadoRubro.setVisible(!isVisible);
			this.jPanelPaginacionEstadoRubro.setVisible(!isVisible);
			this.jPanelAccionesEstadoRubro.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoRubro();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoRubro();
			
			this.abrirFrameOrderByEstadoRubro();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoRubro(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRubro);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoRubro.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoRubro.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoRubro.setSize(this.jInternalFrameDetalleFormEstadoRubro.iWidthFormulario,this.jInternalFrameDetalleFormEstadoRubro.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoRubro.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoRubro.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoRubro.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoRubro.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoRubro.jContentPaneDetalleEstadoRubro.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRubro.jContentPaneDetalleEstadoRubro.getWidth(),EstadoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRubro.jContentPaneDetalleEstadoRubro.getWidth(),EstadoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoRubro.jContentPaneDetalleEstadoRubro.getWidth(),EstadoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRubroEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoRubro.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoRubro.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoRubro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoRubro==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRubro,false,this);
				} else {
					this.jInternalFrameOrderByEstadoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRubro,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRubro);
				this.jInternalFrameOrderByEstadoRubro.setVisible(false);
				this.jInternalFrameOrderByEstadoRubro.setSelected(false);
				
				this.jInternalFrameOrderByEstadoRubro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRubro"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoRubro();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoRubro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoRubro==null) {
				
				this.jInternalFrameImportacionEstadoRubro=new ImportacionJInternalFrame(EstadoRubroConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRubro);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRubro);
				this.jInternalFrameImportacionEstadoRubro.setVisible(false);
				this.jInternalFrameImportacionEstadoRubro.setSelected(false);


				this.jInternalFrameImportacionEstadoRubro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRubro"));
				this.jInternalFrameImportacionEstadoRubro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRubro"));
				this.jInternalFrameImportacionEstadoRubro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRubro"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoRubro() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoRubro==null) {
				this.jInternalFrameReporteDinamicoEstadoRubro=new ReporteDinamicoJInternalFrame(EstadoRubroConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRubro);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRubro);
				this.jInternalFrameReporteDinamicoEstadoRubro.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoRubro.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoRubro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRubro"));
				this.jInternalFrameReporteDinamicoEstadoRubro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRubro"));
				this.jInternalFrameReporteDinamicoEstadoRubro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRubro"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRubro();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaRubroEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.jScrollPanelDatosRubroEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoRubro.jContentPaneDetalleEstadoRubro.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.jScrollPanelDatosRubroEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.jScrollPanelDatosRubroEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.jScrollPanelDatosRubroEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoRubro() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRubro);
			
	       	this.jInternalFrameDetalleFormEstadoRubro.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoRubro.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoRubro.dispose();
			//this.jInternalFrameDetalleFormEstadoRubro=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoRubro() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoRubro.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoRubro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoRubro.setVisible(true);
	        this.jInternalFrameImportacionEstadoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoRubro() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoRubro.setVisible(true);
	        this.jInternalFrameOrderByEstadoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoRubro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoRubro.setVisible(false);
	        this.jInternalFrameOrderByEstadoRubro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoRubro() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoRubro.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoRubro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoRubro() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoRubro.setVisible(false);
	        this.jInternalFrameImportacionEstadoRubro.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoRubro(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoRubro(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoRubro(true);
			//this.isEsNuevoEstadoRubro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRubro(false) ;
			
			if(estadorubroSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.getEsGuardarRelacionado() && RubroEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRubroEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRubro(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRubro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoRubroActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoRubro(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoRubro(true);
			//this.isEsNuevoEstadoRubro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadorubro.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoRubro(false) ;
			
			if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRubro(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRubro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoRubro(false);
			
			//if(!this.isEsNuevoEstadoRubro) {								
				int intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
				
			}
			
			if(this.permiteMantenimiento(this.estadorubro)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoRubro=true;
					this.inicializarActualizarBindingTablaEstadoRubro(false);
					this.isEsNuevoEstadoRubro=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoRubro=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoRubro=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRubro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRubro(false);
				
				this.habilitarDeshabilitarControlesEstadoRubro(false);
			
												
				
				if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoRubro();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoRubroActionPerformed(evt,estadorubroSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoRubro(this.estadorubro,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoRubro.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadorubroSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadorubro.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				this.estadorubro.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				this.estadorubro.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadorubro)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoRubroModel) this.jTableDatosEstadoRubro.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoRubro=true;
				this.inicializarActualizarBindingTablaEstadoRubro(false);
				this.isEsNuevoEstadoRubro=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRubro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRubro(false);
				
				this.habilitarDeshabilitarControlesEstadoRubro(false);
				
				
				
				if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoRubro();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoRubroActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoRubro.getRowCount()>=1) {
				jTableDatosEstadoRubro.removeRowSelectionInterval(0, jTableDatosEstadoRubro.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoRubro(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoRubro(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRubro(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRubro(false) ;
			
			this.isEsNuevoEstadoRubro=false;
			
			if(EstadoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoRubro();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoRubro(false);
				
				//SI ES MANUAL
				if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoRubro();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoRubro--;			
			//EstadoRubro estadorubroAux= new EstadoRubro();			
			//estadorubroAux.setId(this.iIdNuevoEstadoRubro);
			
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoRubro();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
			
			this.estadorubro.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadorubroLogic.getEstadoRubros().add(this.estadorubroAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadorubros.add(this.estadorubroAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoRubro(false);
			
			this.jTableDatosEstadoRubro.setRowSelectionInterval(this.getIndiceNuevoEstadoRubro(), this.getIndiceNuevoEstadoRubro());
			
			int iLastRow =  this.jTableDatosEstadoRubro.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoRubro.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoRubro.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoRubro(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoRubro(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRubro(false);
			
			//SI ES MANUAL
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRubro();
			}
			
			//this.abrirFrameTreeEstadoRubro();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado RubroS ?", "MANTENIMIENTO DE Estado Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoRubro.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoRubro();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadorubroReturnGeneral=estadorubroLogic.procesarImportacionEstadoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadorubroParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoRubroReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoRubro.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoRubro.setFileImportacion(this.jInternalFrameImportacionEstadoRubro.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoRubro.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoRubro.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoRubro.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoRubro.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		

		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoRubroBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoRubroBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoRubros("Todos",estadorubrosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRubroConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoRubroConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoRubro.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoRubroConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoRubroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoRubroConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoRubroConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRubroConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoRubroConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoRubroActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorubro";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoRubros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoRubroConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoRubro estadorubro:estadorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadorubro.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoRubroConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoRubro estadorubro:estadorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadorubro.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoRubro(row);				
			//	iRow++;
			//}				
			
			//for(EstadoRubro estadorubroAux:estadorubrosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoRubro(estadorubroAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRubro(false);
			
			//SI ES MANUAL
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRubro();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRubro(false);
			
			//SI ES MANUAL
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRubro();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRubro(false);
			
			//SI ES MANUAL
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRubro();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoRubro() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoRubro.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoRubro.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoRubro.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoRubro.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoRubro.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoRubro.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoRubro.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoRubro(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoRubro(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoRubro(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoRubro(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoRubro(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoRubro(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRubro(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoRubro(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoRubro() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoRubro();
		
		this.inicializarActualizarBindingBotonesManualEstadoRubro(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRubro();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRubro() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRubro(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRubro(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoRubro.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoRubro.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoRubro.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoRubro.jCheckBoxPostAccionNuevoEstadoRubro.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoRubro.jCheckBoxPostAccionSinCerrarEstadoRubro.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoRubro.jCheckBoxPostAccionSinMensajeEstadoRubro.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoRubro.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoRubro.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoRubro.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
				this.jInternalFrameDetalleFormEstadoRubro.jCheckBoxPostAccionNuevoEstadoRubro.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoRubro.jCheckBoxPostAccionSinCerrarEstadoRubro.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoRubro.jCheckBoxPostAccionSinMensajeEstadoRubro.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoRubro.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoRubro.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoRubro.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoRubro.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoRubro.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoRubro.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoRubro.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoRubro.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoRubro.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoRubro(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRubro(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRubro() throws Exception {
		try	{
			if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRubro();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRubro() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRubro() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoRubro.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoRubro.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoRubro.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoRubro.addItem(reporte);
			}
			
			
			if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoRubro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoRubro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoRubro.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoRubro.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoRubro.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoRubro.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRubro();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRubro() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
				this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
				this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRubro.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRubro.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoRubro.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRubro.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRubro.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoRubro()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoRubro(Boolean esInicializar) throws Exception {				
		if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRubro();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoRubro() throws Exception {
		this.inicializarActualizarBindingTablaEstadoRubro(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoRubro() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoRubroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoRubroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoRubroOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRubroOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoRubroPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoRubroPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoRubro(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadorubroLogic.getEstadoRubros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadorubros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoRubro.setModel(new EstadoRubroModel(this.estadorubroLogic.getEstadoRubros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoRubro.setModel(new EstadoRubroModel(this.estadorubros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoRubro!=null && this.jInternalFrameOrderByEstadoRubro.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoRubro();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRubro,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoRubroPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO,estadorubroConstantesFunciones.resaltarSeleccionarEstadoRubro,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoRubroConstantesFunciones.SCLASSWEBTITULO,estadorubroConstantesFunciones.resaltarSeleccionarEstadoRubro,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRubro,EstadoRubroConstantesFunciones.LABEL_ID));

		if(this.estadorubroConstantesFunciones.mostraridEstadoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRubroConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadorubroConstantesFunciones.resaltaridEstadoRubro,this.estadorubroConstantesFunciones.activaridEstadoRubro,this,true,"idEstadoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadorubroConstantesFunciones.resaltaridEstadoRubro,this.estadorubroConstantesFunciones.activaridEstadoRubro,this,true,"idEstadoRubro","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRubro,EstadoRubroConstantesFunciones.LABEL_CODIGO));

		if(this.estadorubroConstantesFunciones.mostrarcodigoEstadoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRubroConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadorubroConstantesFunciones.resaltarcodigoEstadoRubro,this.estadorubroConstantesFunciones.activarcodigoEstadoRubro,this,true,"codigoEstadoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadorubroConstantesFunciones.resaltarcodigoEstadoRubro,this.estadorubroConstantesFunciones.activarcodigoEstadoRubro,this,true,"codigoEstadoRubro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRubro,EstadoRubroConstantesFunciones.LABEL_NOMBRE));

		if(this.estadorubroConstantesFunciones.mostrarnombreEstadoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRubroConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadorubroConstantesFunciones.resaltarnombreEstadoRubro,this.estadorubroConstantesFunciones.activarnombreEstadoRubro,this,true,"nombreEstadoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadorubroConstantesFunciones.resaltarnombreEstadoRubro,this.estadorubroConstantesFunciones.activarnombreEstadoRubro,this,true,"nombreEstadoRubro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadorubroSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosRubroEmpleado && this.estadorubroConstantesFunciones.mostrarRubroEmpleadoEstadoRubro && !EstadoRubroConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Rubro Empleados");
				tableColumn.setHeaderValue("Rubro Empleados");
				tableColumn.setCellRenderer(new RubroEmpleadoTableCell(estadorubroConstantesFunciones.resaltarRubroEmpleadoEstadoRubro,this,this.estadorubroConstantesFunciones.activarRubroEmpleadoEstadoRubro));
				tableColumn.setCellEditor(new RubroEmpleadoTableCell(estadorubroConstantesFunciones.resaltarRubroEmpleadoEstadoRubro,this,this.estadorubroConstantesFunciones.activarRubroEmpleadoEstadoRubro));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoRubro.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadorubroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadorubroSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRubro.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadorubroSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadorubroSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRubro.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadorubroSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadorubroSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoRubro.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadorubroSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoRubro.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoRubro.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadorubroSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoRubro.moveColumn(this.jTableDatosEstadoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoRubro.moveColumn(this.jTableDatosEstadoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadorubroSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoRubro.moveColumn(this.jTableDatosEstadoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoRubro.moveColumn(this.jTableDatosEstadoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoRubro.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoRubro.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoRubro,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoRubro.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoRubro.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoRubro.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoRubro.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoRubro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadorubroLogic.getEstadoRubros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadorubros.size()-1;
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
		//this.jTableDatosEstadoRubro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoRubro();
			
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
				
				//this.isEsNuevoEstadoRubro=false;
					
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
				if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoRubro==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRubro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRubro.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadorubro.getsType().equals("DUPLICADO")
				   || this.estadorubro.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoRubro=true;
				
				} else {
					this.isEsNuevoEstadoRubro=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadorubroSessionBean.getEsGuardarRelacionado()) {
					if(this.estadorubro.getId()>=0 && !this.estadorubro.getIsNew()) {						
						this.isEsNuevoEstadoRubro=false;
						
					} else {
						this.isEsNuevoEstadoRubro=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoRubro(esRelaciones);						
				
				this.seleccionarEstadoRubro(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadorubro.getId()<0) {
					this.isEsNuevoEstadoRubro=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoRubro(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoRubro(evt,rowIndex);
				}	
				
				if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoRubro: " + this.dDif); 
					}
				}								
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoRubro(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadorubro)) {
					if(this.estadorubro.getId()>0) {
						this.estadorubro.setIsDeleted(true);
						
						this.estadorubrosEliminados.add(this.estadorubro);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadorubroLogic.getEstadoRubros().remove(this.estadorubro);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadorubros.remove(this.estadorubro);				
					}
					
					
					((EstadoRubroModel) this.jTableDatosEstadoRubro.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRubro(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoRubro(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoRubro) {
			
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRubro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRubro.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoRubro(this.estadorubro);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoRubro("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoRubro(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRubro() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRubro(EstadoRubro estadorubro) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoRubro(estadorubro,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRubro(EstadoRubro estadorubro,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoRubro(estadorubro);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoRubro(estadorubro,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoRubro(estadorubro);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoRubro(EstadoRubro estadorubro) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.setText(estadorubro.getId().toString());
			this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.setText(estadorubro.getcodigo());
			this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.setText(estadorubro.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoRubro estadorubroLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadorubroLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoRubro estadorubroLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadorubroLocal=this.estadorubro;
			} else {
				estadorubroLocal=this.estadorubroAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadorubroLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoRubro(estadorubroLocal,true);
					
					if(estadorubroSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadorubroLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadorubroLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoRubro(EstadoRubro estadorubro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRubro(estadorubro,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(estadorubro);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRubro(EstadoRubro estadorubro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRubro(estadorubro,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRubro(EstadoRubro estadorubro,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.getText()==null || this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.getText()=="" || this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.setText("0");
			}

			if(conColumnasBase) {estadorubro.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRubroConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRubro.jLabelIdEstadoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadorubro.setcodigo(this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRubroConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRubro.jLabelcodigoEstadoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadorubro.setnombre(this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRubroConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRubro.jLabelnombreEstadoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRubro(EstadoRubro estadorubroBean,EstadoRubro estadorubro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoRubro(EstadoRubro estadorubroOrigen,EstadoRubro estadorubro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadorubroOrigen.getId()!=null && !estadorubroOrigen.getId().equals(0L))) {estadorubro.setId(estadorubroOrigen.getId());}}
			if(conDefault || (!conDefault && estadorubroOrigen.getcodigo()!=null && !estadorubroOrigen.getcodigo().equals(""))) {estadorubro.setcodigo(estadorubroOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadorubroOrigen.getnombre()!=null && !estadorubroOrigen.getnombre().equals(""))) {estadorubro.setnombre(estadorubroOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRubro(EstadoRubro estadorubro) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.setText(estadorubro.getId().toString());
			this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.setText(estadorubro.getcodigo());
			this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.setText(estadorubro.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRubro(EstadoRubroBean estadorubroBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.setText(estadorubroBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.setText(estadorubroBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.setText(estadorubroBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoRubro(EstadoRubroParameterReturnGeneral estadorubroReturnGeneral,EstadoRubroBean estadorubroBean,Boolean conDefault) throws Exception { 
		try {
			EstadoRubro estadorubroLocal=new EstadoRubro();
			
			estadorubroLocal=estadorubroReturnGeneral.getEstadoRubro();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadorubroLocal.getId()!=null && !estadorubroLocal.getId().equals(0L))) {estadorubroBean.setId(estadorubroLocal.getId());}}
			if(conDefault || (!conDefault && estadorubroLocal.getcodigo()!=null && !estadorubroLocal.getcodigo().equals(""))) {estadorubroBean.setcodigo(estadorubroLocal.getcodigo());}
			if(conDefault || (!conDefault && estadorubroLocal.getnombre()!=null && !estadorubroLocal.getnombre().equals(""))) {estadorubroBean.setnombre(estadorubroLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoRubroGenerico(Long idEstadoRubroSeleccionado,JComboBox jComboBoxEstadoRubro,List<EstadoRubro> estadorubrosLocal)throws Exception {
		try {
			EstadoRubro  estadorubroTemp=null;

			for(EstadoRubro estadorubroAux:estadorubrosLocal) {
				if(estadorubroAux.getId()!=null && estadorubroAux.getId().equals(idEstadoRubroSeleccionado)) {
					estadorubroTemp=estadorubroAux;
					break;
				}
			}

			jComboBoxEstadoRubro.setSelectedItem(estadorubroTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoRubroGenerico(JComboBox jComboBoxEstadoRubro,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRubro.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoRubro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRubro.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoRubro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("RubroEmpleado")) {
			jButtonRubroEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadorubro=(EstadoRubro) estadorubroLogic.getEstadoRubros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadorubro =(EstadoRubro) estadorubros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoRubro estadorubroRow=new EstadoRubro();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadorubroRow=(EstadoRubro) estadorubroLogic.getEstadoRubros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadorubroRow=(EstadoRubro) estadorubros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonRubroEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoRubro estadorubro) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoRubro==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorubro = (EstadoRubro)this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadorubro = (EstadoRubro)this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadorubro!=null) {
						this.estadorubro = estadorubro;
					} else {
						this.estadorubro = new EstadoRubro();
					}
				}

				if(this.isTienePermisosRubroEmpleado && this.permiteMantenimiento(this.estadorubro)) {
					RubroEmpleadoBeanSwingJInternalFrame rubroempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFramePopup=new RubroEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						rubroempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFramePopup;
					} else {
						rubroempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame;
					}

					List<EstadoRubro> estadorubros=new ArrayList<EstadoRubro>();
					estadorubros.add(this.estadorubro);
					if(!esRelacionado) {
						//rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setConGuardarRelaciones(false);
						//rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					rubroempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoRubro.cargarRubroEmpleadoBeanSwingJInternalFrame(estadorubros,this.estadorubro,rubroempleadoBeanSwingJInternalFrame,/*conInicializar,*/rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.getConGuardarRelaciones(),rubroempleadoBeanSwingJInternalFrame.rubroempleadoSessionBean.getEsGuardarRelacionado());
					rubroempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						rubroempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsRubroEmpleado("no_relacionado");

						rubroempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RubroEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (RubroEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						rubroempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoRubro=(TitledBorder)this.jScrollPanelDatosEstadoRubro.getBorder();
						TitledBorder titledBorderRubroEmpleado=(TitledBorder)rubroempleadoBeanSwingJInternalFrame.jScrollPanelDatosRubroEmpleado.getBorder();

						titledBorderRubroEmpleado.setTitle(titledBorderEstadoRubro.getTitle() + " -> Rubro Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,rubroempleadoBeanSwingJInternalFrame);
						}

						rubroempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(rubroempleadoBeanSwingJInternalFrame);

						rubroempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadorubroSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Rubro Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoRubro(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoEstadoRubro && this.isPermisoNuevoEstadoRubro));			
			this.jButtonDuplicarEstadoRubro.setVisible((this.isVisibilidadCeldaDuplicarEstadoRubro && this.isPermisoDuplicarEstadoRubro));			
			this.jButtonCopiarEstadoRubro.setVisible((this.isVisibilidadCeldaCopiarEstadoRubro && this.isPermisoCopiarEstadoRubro));
			this.jButtonVerFormEstadoRubro.setVisible((this.isVisibilidadCeldaVerFormEstadoRubro && this.isPermisoVerFormEstadoRubro));
			
			this.jButtonAbrirOrderByEstadoRubro.setVisible((this.isVisibilidadCeldaOrdenEstadoRubro && this.isPermisoOrdenEstadoRubro));			
			
			this.jButtonNuevoRelacionesEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRubro && this.isPermisoNuevoEstadoRubro));			
			this.jButtonNuevoGuardarCambiosEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoEstadoRubro && this.isPermisoNuevoEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));
			
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarEstadoRubro.setVisible((this.isVisibilidadCeldaModificarEstadoRubro && this.isPermisoActualizarEstadoRubro));	
			this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarEstadoRubro.setVisible((this.isVisibilidadCeldaActualizarEstadoRubro && this.isPermisoActualizarEstadoRubro));	
			this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarEstadoRubro.setVisible((this.isVisibilidadCeldaEliminarEstadoRubro && this.isPermisoEliminarEstadoRubro));
			this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarEstadoRubro.setVisible(this.isVisibilidadCeldaCancelarEstadoRubro);							
			this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.setVisible((this.isVisibilidadCeldaGuardarEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoEstadoRubro && this.isPermisoNuevoEstadoRubro));						
			this.jButtonDuplicarToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaDuplicarEstadoRubro && this.isPermisoDuplicarEstadoRubro));						
			this.jButtonCopiarToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaCopiarEstadoRubro && this.isPermisoCopiarEstadoRubro));			
			this.jButtonVerFormToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaVerFormEstadoRubro && this.isPermisoVerFormEstadoRubro));			
			this.jButtonAbrirOrderByToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaOrdenEstadoRubro && this.isPermisoOrdenEstadoRubro));
			this.jButtonNuevoRelacionesToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRubro && this.isPermisoNuevoEstadoRubro));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoEstadoRubro && this.isPermisoNuevoEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));			
			
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaModificarEstadoRubro && this.isPermisoActualizarEstadoRubro));	
			this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaActualizarEstadoRubro  && this.isPermisoActualizarEstadoRubro));	
			this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaEliminarEstadoRubro && this.isPermisoEliminarEstadoRubro));
			this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarToolBarEstadoRubro.setVisible(this.isVisibilidadCeldaCancelarEstadoRubro);				
			this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaGuardarEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoEstadoRubro && this.isPermisoNuevoEstadoRubro));			
			this.jMenuItemDuplicarEstadoRubro.setVisible((this.isVisibilidadCeldaDuplicarEstadoRubro && this.isPermisoDuplicarEstadoRubro));			
			this.jMenuItemCopiarEstadoRubro.setVisible((this.isVisibilidadCeldaCopiarEstadoRubro && this.isPermisoCopiarEstadoRubro));			
			this.jMenuItemVerFormEstadoRubro.setVisible((this.isVisibilidadCeldaVerFormEstadoRubro && this.isPermisoVerFormEstadoRubro));			
			this.jMenuItemAbrirOrderByEstadoRubro.setVisible((this.isVisibilidadCeldaOrdenEstadoRubro && this.isPermisoOrdenEstadoRubro));			
			//this.jMenuItemMostrarOcultarEstadoRubro.setVisible((this.isVisibilidadCeldaOrdenEstadoRubro && this.isPermisoOrdenEstadoRubro));
			this.jMenuItemDetalleAbrirOrderByEstadoRubro.setVisible((this.isVisibilidadCeldaOrdenEstadoRubro && this.isPermisoOrdenEstadoRubro));			
			//this.jMenuItemDetalleMostrarOcultarEstadoRubro.setVisible((this.isVisibilidadCeldaOrdenEstadoRubro && this.isPermisoOrdenEstadoRubro));			
			this.jMenuItemNuevoRelacionesEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRubro && this.isPermisoNuevoEstadoRubro));			
			this.jMenuItemNuevoGuardarCambiosEstadoRubro.setVisible((this.isVisibilidadCeldaNuevoEstadoRubro && this.isPermisoNuevoEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));									
			
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemModificarEstadoRubro.setVisible((this.isVisibilidadCeldaModificarEstadoRubro && this.isPermisoActualizarEstadoRubro));	
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemActualizarEstadoRubro.setVisible((this.isVisibilidadCeldaActualizarEstadoRubro && this.isPermisoActualizarEstadoRubro));	
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemEliminarEstadoRubro.setVisible((this.isVisibilidadCeldaEliminarEstadoRubro && this.isPermisoEliminarEstadoRubro));
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemCancelarEstadoRubro.setVisible(this.isVisibilidadCeldaCancelarEstadoRubro);				
			}
			
			this.jMenuItemGuardarCambiosEstadoRubro.setVisible((this.isVisibilidadCeldaGuardarEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));						
			this.jMenuItemGuardarCambiosTablaEstadoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoRubro=this.jButtonNuevoEstadoRubro.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoRubro=this.jButtonDuplicarEstadoRubro.isVisible();
			this.isVisibilidadCeldaCopiarEstadoRubro=this.jButtonCopiarEstadoRubro.isVisible();
			this.isVisibilidadCeldaVerFormEstadoRubro=this.jButtonVerFormEstadoRubro.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoRubro=this.jButtonAbrirOrderByEstadoRubro.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=this.jButtonNuevoRelacionesEstadoRubro.isVisible();
			this.isVisibilidadCeldaModificarEstadoRubro=this.jButtonModificarEstadoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.isVisibilidadCeldaActualizarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarEstadoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarEstadoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarEstadoRubro.isVisible();
			this.isVisibilidadCeldaGuardarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=this.jButtonGuardarCambiosTablaEstadoRubro.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoRubro=this.jButtonNuevoToolBarEstadoRubro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=this.jButtonNuevoRelacionesToolBarEstadoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.isVisibilidadCeldaModificarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarToolBarEstadoRubro.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarToolBarEstadoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarToolBarEstadoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarToolBarEstadoRubro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRubro=this.jButtonGuardarCambiosToolBarEstadoRubro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=this.jButtonGuardarCambiosTablaToolBarEstadoRubro.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoRubro=this.jMenuItemNuevoEstadoRubro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=this.jMenuItemNuevoRelacionesEstadoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.isVisibilidadCeldaModificarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jMenuItemModificarEstadoRubro.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jMenuItemActualizarEstadoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jMenuItemEliminarEstadoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRubro=this.jInternalFrameDetalleFormEstadoRubro.jMenuItemCancelarEstadoRubro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRubro=this.jMenuItemGuardarCambiosEstadoRubro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=this.jMenuItemGuardarCambiosTablaEstadoRubro.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoRubro(Boolean esInicializar) {
		if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
				//if(this.estadorubroSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRubro();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoRubro(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoRubro() {
		this.jButtonNuevoEstadoRubro.setVisible(this.isPermisoNuevoEstadoRubro);			
		this.jButtonDuplicarEstadoRubro.setVisible(this.isPermisoDuplicarEstadoRubro);			
		this.jButtonCopiarEstadoRubro.setVisible(this.isPermisoCopiarEstadoRubro);			
		this.jButtonVerFormEstadoRubro.setVisible(this.isPermisoVerFormEstadoRubro);			
		
		this.jButtonAbrirOrderByEstadoRubro.setVisible(this.isPermisoOrdenEstadoRubro);					
		
		this.jButtonNuevoRelacionesEstadoRubro.setVisible(this.isPermisoNuevoEstadoRubro);			
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarEstadoRubro.setVisible(this.isPermisoActualizarEstadoRubro);	
			this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarEstadoRubro.setVisible(this.isPermisoActualizarEstadoRubro);	
			this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarEstadoRubro.setVisible(this.isPermisoEliminarEstadoRubro);
			this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarEstadoRubro.setVisible(this.isVisibilidadCeldaCancelarEstadoRubro);						
			this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.setVisible(this.isPermisoGuardarCambiosEstadoRubro);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoRubro.setVisible(this.isPermisoActualizarEstadoRubro);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRubro() {
		this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarEstadoRubro.setVisible(this.isPermisoActualizarEstadoRubro);	
		this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarEstadoRubro.setVisible(this.isPermisoActualizarEstadoRubro);	
		this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarEstadoRubro.setVisible(this.isPermisoEliminarEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarEstadoRubro.setVisible(this.isVisibilidadCeldaCancelarEstadoRubro);							
		this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.setVisible((this.isVisibilidadCeldaGuardarEstadoRubro && this.isPermisoGuardarCambiosEstadoRubro));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoRubro() {
		if(EstadoRubroJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoRubro();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoRubro() {
	}
	
	public void jTableDatosEstadoRubroListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoRubro(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRubro(this.getestadorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadorubro==null) {
						this.estadorubro = new EstadoRubro();
					}

					this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
				}

				if(this.estadorubro.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadorubro.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRubro(this.getestadorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadorubro==null) {
						this.estadorubro = new EstadoRubro();
					}

					this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
				}

				if(this.estadorubro.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadorubro.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRubro(this.getestadorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadorubro==null) {
						this.estadorubro = new EstadoRubro();
					}

					this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);
				}

				if(this.estadorubro.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadorubro.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoRubro() {
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
			this.jInternalFrameDetalleFormEstadoRubro.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoRubro.dispose();
			this.jInternalFrameDetalleFormEstadoRubro=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
			this.jInternalFrameReporteDinamicoEstadoRubro.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoRubro.dispose();
			this.jInternalFrameReporteDinamicoEstadoRubro=null;
		}
		
		if(this.jInternalFrameImportacionEstadoRubro!=null) {
			this.jInternalFrameImportacionEstadoRubro.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoRubro.dispose();
			this.jInternalFrameImportacionEstadoRubro=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoRubro();
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoRubro")) {
				jButtonDuplicarEstadoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoRubro")) {
				jButtonCopiarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoRubro")) {
				jButtonVerFormEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoRubro")) {
				jButtonDuplicarEstadoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoRubro")) {
				jButtonDuplicarEstadoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoRubro")) {
				jButtonModificarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoRubro")) {
				jButtonModificarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoRubro")) {
				jButtonModificarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoRubro")) {
				jButtonActualizarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoRubro")) {
				jButtonActualizarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoRubro")) {
				jButtonActualizarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoRubro")) {
				jButtonEliminarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoRubro")) {
				jButtonEliminarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoRubro")) {
				jButtonEliminarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoRubro")) {
				jButtonCancelarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoRubro")) {
				jButtonCancelarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoRubro")) {
				jButtonCancelarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoRubro")) {
				jButtonCerrarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoRubro")) {
				jButtonCerrarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoRubro")) {
				jButtonCerrarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoRubro")) {
				jButtonMostrarOcultarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoRubro")) {
				jButtonCancelarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoRubro")) {
				jButtonCopiarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoRubro")) {
				jButtonVerFormEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoRubro")) {
				jButtonCopiarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoRubro")) {
				jButtonVerFormEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoRubro")) {
				jButtonRecargarInformacionEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoRubro")) {
				jButtonRecargarInformacionEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoRubro")) {
				jButtonRecargarInformacionEstadoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoRubro")) {
				jButtonAnterioresEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoRubro")) {
				jButtonAnterioresEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoRubro")) {
				jButtonAnterioresEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoRubro")) {
				jButtonSiguientesEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoRubro")) {
				jButtonSiguientesEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoRubro")) {
				jButtonSiguientesEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoRubro") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoRubro")) {
				jButtonAbrirOrderByEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoRubro") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoRubro")) {
				jButtonMostrarOcultarEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRubro")) {
				jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoRubro")) {
				jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoRubro")) {
				jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoRubro")) {
				jButtonCerrarReporteDinamicoEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoRubro")) {
				jButtonGenerarReporteDinamicoEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoRubro")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoRubro")) {
				jButtonCerrarImportacionEstadoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoRubro")) {
				
				jButtonGenerarImportacionEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoRubro")) {
				
				jButtonAbrirImportacionEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoRubro")) {
				jComboBoxTiposAccionesEstadoRubroActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoRubro")) {
				jComboBoxTiposRelacionesEstadoRubroActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoRubro")) {
				jComboBoxTiposAccionesEstadoRubroActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoRubro")) {
				
				jComboBoxTiposSeleccionarEstadoRubroActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoRubro")) {
				jTextFieldValorCampoGeneralEstadoRubroActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoRubro")) {
				jButtonAbrirOrderByEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoRubro")) {
				jButtonAbrirOrderByEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoRubro")) {
				jButtonCerrarOrderByEstadoRubroActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRubroBusqueda")) {
				this.jButtonidEstadoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRubroBusqueda")) {
				this.jButtoncodigoEstadoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRubroBusqueda")) {
				this.jButtonnombreEstadoRubroBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoRubro();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRubroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoRubro estadorubroLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadorubroLocal=this.estadorubro;
			} else {
				estadorubroLocal=this.estadorubroAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
							
				
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
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
			
			


			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRubroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
								
						
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
								
				
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
							
				
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRubroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorubroAnterior =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadorubroAnterior =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
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
			
			


			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
								
				
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRubroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoRubro")) {
					jCheckBoxSeleccionarTodosEstadoRubroItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoRubro")) {
					jCheckBoxSeleccionadosEstadoRubroItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoRubro")) {
					
				}
				
				


				
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
												
				
				


				
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRubroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadorubroAnterior =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadorubroAnterior =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRubroActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
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
			
			


			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRubroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadorubro);
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
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
				
				


				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRubro.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadorubroAnterior =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoRubro")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoRubroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoRubro.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadorubro =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadorubro =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadorubro);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoRubro")) {
				
				}
				
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoRubro")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoRubro.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoRubro")) {
			
			}
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoRubro();
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoRubro")) {
				jButtonDuplicarEstadoRubroActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoRubro")) {
				jButtonCopiarEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoRubro")) {
				jButtonVerFormEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoRubro")) {
				jButtonNuevoEstadoRubroActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoRubro")) {
				jButtonModificarEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoRubro")) {
				jButtonActualizarEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoRubro")) {
				jButtonEliminarEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoRubro")) {
				jButtonCancelarEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoRubro")) {
				jButtonCerrarEstadoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoRubro")) {
				jButtonGuardarCambiosEstadoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRubro")) {
				jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoRubro")) {
				jButtonAbrirOrderByEstadoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoRubro")) {
				jButtonRecargarInformacionEstadoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoRubro")) {
				jButtonAnterioresEstadoRubroActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoRubro")) {
				jButtonSiguientesEstadoRubroActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRubroBusqueda")) {
				this.jButtonidEstadoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRubroBusqueda")) {
				this.jButtoncodigoEstadoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRubroBusqueda")) {
				this.jButtonnombreEstadoRubroBusquedaActionPerformed(evt);
			}
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoRubro();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoRubro")) {
				closingInternalFrameEstadoRubro();
				
			} else if(sTipo.equals("jButtonCancelarEstadoRubro")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoRubro = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoRubroBeanSwingJInternalFrame jInternalFrameParent=(EstadoRubroBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRubro.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoRubroActionPerformed(null);
			}
			
			EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadorubro,new Object(),this.estadorubroParameterGeneral,this.estadorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoRubro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoRubro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoRubro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadorubro)) {
			if(!esControlTabla) {
				if(EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);			
				}
				
				if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoRubro(this.estadorubro,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadorubroReturnGeneral=estadorubroLogic.procesarEventosEstadoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorubroLogic.getEstadoRubros(),this.estadorubro,this.estadorubroParameterGeneral,this.isEsNuevoEstadoRubro,classes);//this.estadorubroLogic.getEstadoRubro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoRubro(this.estadorubroReturnGeneral,this.estadorubroBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRubro(classes,this.estadorubroReturnGeneral,this.estadorubroBean,false);
					}
						
					if(this.estadorubroReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoRubro(this.estadorubroReturnGeneral.getEstadoRubro());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoRubro(this.estadorubroReturnGeneral.getEstadoRubro());	
					}
						
					if(this.estadorubroReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoRubro(this.estadorubroReturnGeneral.getEstadoRubro(),classes);//this.estadorubroBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoRubro(this.estadorubro,classes);//this.estadorubroBean);									
				}
			
				if(EstadoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoRubro(this.estadorubro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRubro(this.estadorubro);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadorubroAnterior!=null) {
						this.estadorubro=this.estadorubroAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadorubroReturnGeneral=estadorubroLogic.procesarEventosEstadoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorubroLogic.getEstadoRubros(),this.estadorubro,this.estadorubroParameterGeneral,this.isEsNuevoEstadoRubro,classes);//this.estadorubroLogic.getEstadoRubro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadorubroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadorubroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadorubroReturnGeneral.getEstadoRubro(),estadorubroLogic.getEstadoRubros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadorubroReturnGeneral.getEstadoRubro(),this.estadorubros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoRubro.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoRubro.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoRubro();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoRubro() throws Exception {
		
		EstadoRubroModel estadorubroModel=(EstadoRubroModel)this.jTableDatosEstadoRubro.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadorubroModel.estadorubros=this.estadorubroLogic.getEstadoRubros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadorubroModel.estadorubros=this.estadorubros;
		}
		
		
		((EstadoRubroModel) this.jTableDatosEstadoRubro.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoRubro() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadorubroAnterior(),this.estadorubroLogic.getEstadoRubros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadorubroAnterior(),this.estadorubros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoRubro();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoRubro(EstadoRubro estadorubro,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RubroEmpleado.class)) {
					this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.setRubroEmpleados(estadorubro.getRubroEmpleados());
					this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
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
										
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorubro,new Object(),generalEntityParameterGeneral,this.estadorubroReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadorubroSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoRubroConstantesFunciones.getClassesRelationshipsOfEstadoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoRubroConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoRubro(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoRubro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadorubro,new Object(),generalEntityParameterGeneral,this.estadorubroReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoRubro(EstadoRubroBean estadorubroBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RubroEmpleado.class)) {
					this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.setRubroEmpleados(estadorubro.getRubroEmpleados());
					this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmpleado(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRubro(ArrayList<Classe> classes,EstadoRubroReturnGeneral estadorubroReturnGeneral,EstadoRubroBean estadorubroBean,Boolean conDefault) throws Exception {
		
			this.estadorubroBean.setRubroEmpleados(estadorubroReturnGeneral.getEstadoRubro().getRubroEmpleados());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoRubro(EstadoRubro estadorubro,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(RubroEmpleado.class)) {
					estadorubro.setRubroEmpleados(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoBeanSwingJInternalFrame.rubroempleadoLogic.getRubroEmpleados());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadorubro)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRubro = new EstadoRubroDetalleFormJInternalFrame(jDesktopPane,this.estadorubroSessionBean.getConGuardarRelaciones(),this.estadorubroSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.setVisible(false);
		this.jInternalFrameDetalleFormEstadoRubro.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoRubro.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoRubro.estadorubroLogic=this.estadorubroLogic;
		
		this.cargarCombosFrameForeignKeyEstadoRubro("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRubro();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRubro();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoRubro("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoRubro();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoRubro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRubro"));
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarEstadoRubro.addActionListener(new ButtonActionListener(this,"ModificarEstadoRubro"));

		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarToolBarEstadoRubro.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRubro"));
					
		this.jInternalFrameDetalleFormEstadoRubro.jMenuItemModificarEstadoRubro.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarEstadoRubro.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRubro"));
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarToolBarEstadoRubro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRubro"));
						
		this.jInternalFrameDetalleFormEstadoRubro.jMenuItemActualizarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarEstadoRubro.addActionListener (new ButtonActionListener(this,"EliminarEstadoRubro"));
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRubro"));
								
		this.jInternalFrameDetalleFormEstadoRubro.jMenuItemEliminarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarEstadoRubro.addActionListener (new ButtonActionListener(this,"CancelarEstadoRubro"));
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRubro"));
					
		this.jInternalFrameDetalleFormEstadoRubro.jMenuItemCancelarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRubro"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jMenuItemDetalleCerrarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRubro"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRubro"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRubro"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtonidEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtoncodigoEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtonnombreEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRubroBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRubro"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoRubro"));
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRubro"));
		}
		
		this.jTableDatosEstadoRubro.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoRubro"));
		
		this.jTableDatosEstadoRubro.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoRubro"));
		
		this.jButtonNuevoEstadoRubro.addActionListener(new ButtonActionListener(this,"NuevoEstadoRubro"));
		
		this.jButtonDuplicarEstadoRubro.addActionListener(new ButtonActionListener(this,"DuplicarEstadoRubro"));
		
		this.jButtonCopiarEstadoRubro.addActionListener(new ButtonActionListener(this,"CopiarEstadoRubro"));
		
		this.jButtonVerFormEstadoRubro.addActionListener(new ButtonActionListener(this,"VerFormEstadoRubro"));
		
		
		this.jButtonNuevoToolBarEstadoRubro.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoRubro"));
			
		this.jButtonDuplicarToolBarEstadoRubro.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoRubro"));
			
		this.jMenuItemNuevoEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoRubro"));
			
		this.jMenuItemDuplicarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoRubro"));		
		
		
		this.jButtonNuevoRelacionesEstadoRubro.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoRubro"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRubro.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoRubro"));
			
		this.jMenuItemNuevoRelacionesEstadoRubro.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoRubro"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarEstadoRubro.addActionListener(new ButtonActionListener(this,"ModificarEstadoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonModificarToolBarEstadoRubro.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRubro"));
			
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemModificarEstadoRubro.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarEstadoRubro.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonActualizarToolBarEstadoRubro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRubro"));
				
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemActualizarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarEstadoRubro.addActionListener (new ButtonActionListener(this,"EliminarEstadoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonEliminarToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRubro"));
						
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemEliminarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarEstadoRubro.addActionListener (new ButtonActionListener(this,"CancelarEstadoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonCancelarToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRubro"));
			
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemCancelarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRubro"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoRubro"));		
		
		
		this.jButtonCerrarEstadoRubro.addActionListener (new ButtonActionListener(this,"CerrarEstadoRubro"));
		
		
		this.jButtonCerrarToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoRubro"));
			
		this.jMenuItemCerrarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoRubro"));
			
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jMenuItemDetalleCerrarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRubro"));
		}
		
		this.jButtonCopiarToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoRubro"));
			
		this.jButtonVerFormToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoRubro"));
		
		this.jMenuItemGuardarCambiosEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoRubro"));
			
		this.jMenuItemCopiarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoRubro"));		
		
		this.jMenuItemVerFormEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoRubro"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRubro"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoRubro"));
			
		this.jMenuItemGuardarCambiosTablaEstadoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRubro"));		
		
		
		
		this.jButtonRecargarInformacionEstadoRubro.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoRubro"));
					
		this.jButtonRecargarInformacionToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoRubro"));
		
		this.jMenuItemRecargarInformacionEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoRubro"));		
		
		
		
		this.jButtonAnterioresEstadoRubro.addActionListener (new ButtonActionListener(this,"AnterioresEstadoRubro"));
		
		
		this.jButtonAnterioresToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoRubro"));
		
		this.jMenuItemAnterioresEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoRubro"));		
		
		
		this.jButtonSiguientesEstadoRubro.addActionListener (new ButtonActionListener(this,"SiguientesEstadoRubro"));
		
		
		this.jButtonSiguientesToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoRubro"));
			
		this.jMenuItemSiguientesEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoRubro"));
			
		this.jMenuItemAbrirOrderByEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoRubro"));
			
		this.jMenuItemMostrarOcultarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoRubro"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoRubro"));
			
		this.jMenuItemDetalleMostarOcultarEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoRubro"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoRubro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoRubro"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoRubro"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoRubro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoRubro"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoRubro.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoRubro"));

		this.jCheckBoxSeleccionadosEstadoRubro.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoRubro"));
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRubro"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoRubro.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoRubro"));
			
		this.jComboBoxTiposAccionesEstadoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoRubro"));
					
		this.jComboBoxTiposSeleccionarEstadoRubro.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoRubro"));
			
		this.jTextFieldValorCampoGeneralEstadoRubro.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoRubro"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtonidEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtoncodigoEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtonnombreEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRubroBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoRubro!=null) {
				this.jInternalFrameReporteDinamicoEstadoRubro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRubro"));
				this.jInternalFrameReporteDinamicoEstadoRubro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRubro"));
				this.jInternalFrameReporteDinamicoEstadoRubro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRubro"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoRubro.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRubro"));				
			//this.jButtonGenerarReporteDinamicoEstadoRubro.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRubro"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoRubro.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRubro"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoRubro!=null) {
				this.jInternalFrameImportacionEstadoRubro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRubro"));
				this.jInternalFrameImportacionEstadoRubro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRubro"));
				this.jInternalFrameImportacionEstadoRubro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRubro"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoRubro.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoRubro"));
			
			this.jButtonAbrirOrderByToolBarEstadoRubro.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoRubro"));			
			
			if(this.jInternalFrameOrderByEstadoRubro!=null) {
				this.jInternalFrameOrderByEstadoRubro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRubro"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRubro.jTabbedPaneRelacionesEstadoRubro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRubro"));
		
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
            		closingInternalFrameEstadoRubro();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoRubro.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoRubro = (JInternalFrameBase)event.getSource();
	            	
	            EstadoRubroBeanSwingJInternalFrame jInternalFrameParent=(EstadoRubroBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRubro.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoRubroActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoRubro.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoRubroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoRubro.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoRubro.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoRubro";
		inputMap = this.jButtonNuevoEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRubroActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoRubro";
		inputMap = this.jButtonNuevoRelacionesEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRubroActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoRubro";
		inputMap = this.jButtonModificarEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoRubro";
		inputMap = this.jButtonActualizarEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoRubro";
		inputMap = this.jButtonEliminarEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoRubro";
		inputMap = this.jButtonCancelarEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoRubro";
		inputMap = this.jButtonCerrarEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoRubro";
		inputMap = this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoRubro.jButtonGuardarCambiosEstadoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoRubro.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoRubroItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtonidEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtoncodigoEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRubro.jButtonnombreEstadoRubroBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRubroBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoRubroActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoRubro.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoRubro(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
					estadorubroAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRubro estadorubroAux:estadorubros) {
					estadorubroAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoRubroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRubro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
						estadorubroAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRubro estadorubroAux:estadorubros) {
						estadorubroAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRubro estadorubroAux:estadorubros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRubro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRubro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRubro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRubro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoRubroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRubro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoRubro.getSelectedRows();
			
			EstadoRubro estadorubroLocal=new EstadoRubro();
			
			//this.seleccionarTodosEstadoRubro(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadorubroLocal =(EstadoRubro) this.estadorubroLogic.getEstadoRubros().toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadorubroLocal =(EstadoRubro) this.estadorubros.toArray()[this.jTableDatosEstadoRubro.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadorubroLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
						estadorubroAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRubro estadorubroAux:estadorubros) {
						estadorubroAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoRubro(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRubro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRubro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRubro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoRubroItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoRubroParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoRubroActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoRubro(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoRubro.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRubro estadorubroAux:this.estadorubroLogic.getEstadoRubros()) {
				
						if(sTipoSeleccionar.equals(EstadoRubroConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadorubroAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRubroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadorubroAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRubro estadorubroAux:estadorubros) {
					
						if(sTipoSeleccionar.equals(EstadoRubroConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadorubroAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRubroConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadorubroAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRubro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoRubroActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoRubro(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoRubro=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoRubro.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoRubro) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoRubro(conSplash);
				
					this.generarReporteEstadoRubrosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoRubrosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRubrosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRubrosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRubro();
				
				this.exportarEstadoRubrosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoRubros();
				//this.importarEstadoRubros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRubro();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoRubrosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoRubro();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoRubro)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoRubro(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoRubroBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoRubro) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoRubro(conSplash);
					
						//this.actualizarParametrosGeneralEstadoRubro();
						
						this.generarReporteProcesoAccionEstadoRubrosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoRubroBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado RubroS SELECCIONADOS?", "MANTENIMIENTO DE Estado Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoRubro();
				
						this.actualizarParametrosGeneralEstadoRubro();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadorubroReturnGeneral=estadorubroLogic.procesarAccionEstadoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadorubroLogic.getEstadoRubros(),this.estadorubroParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoRubroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoRubro();
					
					EstadoRubroBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoRubroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoRubro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoRubro.jComboBoxTiposAccionesFormularioEstadoRubro.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoRubro(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoRubroActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoRubro();
			
			if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
			EstadoRubro estadorubro=new EstadoRubro();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoRubro(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoRubro.getSelectedItem();
			
			
			
			
			estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadorubrosSeleccionados.size()==1) {
				for(EstadoRubro estadorubroAux:estadorubrosSeleccionados) {
					estadorubro=estadorubroAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Rubro Empleado")) {
					jButtonRubroEmpleadoActionPerformed(null,rowIndex,true,false,estadorubro);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoRubro();
			
      		//this.finishProcessEstadoRubro(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoRubroReturnGeneral() throws Exception {
		if(this.estadorubroReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadorubroReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadorubroReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadorubroReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadorubroReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadorubroReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoRubro(false);
		}
		
		if(this.estadorubroReturnGeneral.getConRetornoLista() || this.estadorubroReturnGeneral.getConRetornoObjeto()) {
			if(this.estadorubroReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadorubroLogic.setEstadoRubros(this.estadorubroReturnGeneral.getEstadoRubros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadorubroReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadorubroLogic.setEstadoRubro(this.estadorubroReturnGeneral.getEstadoRubro());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoRubro(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoRubro() throws Exception {
		
		
	}
	
	public ArrayList<EstadoRubro> getEstadoRubrosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoRubro) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoRubro estadorubroAux:estadorubroLogic.getEstadoRubros()) {
					if(estadorubroAux.getIsSelected()) {
						estadorubrosSeleccionados.add(estadorubroAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRubro estadorubroAux:this.estadorubros) {
					if(estadorubroAux.getIsSelected()) {
						estadorubrosSeleccionados.add(estadorubroAux);				
					}
				}
			}
			
			if(estadorubrosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadorubrosSeleccionados.addAll(this.estadorubroLogic.getEstadoRubros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadorubrosSeleccionados.addAll(this.estadorubros);				
					}
				}
			}
		} else {
			estadorubrosSeleccionados.add(this.estadorubro);
		}
		
		return estadorubrosSeleccionados;
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
	
	public void generarReporteEstadoRubrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoRubrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoRubrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRubrosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRubrosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoRubrosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoRubrosSeleccionados() throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoRubros("Todos",estadorubrosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoRubrosSeleccionados() throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoRubros("Todos",estadorubrosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoRubrosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoRubros("Todos",estadorubrosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoRubrosSeleccionados() throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoRubro();
		
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoRubro();
		
		
		//this.generarReporteEstadoRubros("Todos",estadorubrosSeleccionados ,estadorubroImplementable,estadorubroImplementableHome);
	}
	
	public void mostrarImportacionEstadoRubros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoRubro();
		
		this.abrirFrameImportacionEstadoRubro();		
		
			
		//this.generarReporteEstadoRubros("Todos",estadorubrosSeleccionados ,estadorubroImplementable,estadorubroImplementableHome);
	}
	
	public void importarEstadoRubros() throws Exception {		
	
	}
	
	public void exportarEstadoRubrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoRubrosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoRubrosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoRubrosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoRubrosSeleccionados() throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorubro."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoRubro(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoRubro estadorubroAux:estadorubrosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoRubro(estadorubroAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadorubroAux.setsDetalleGeneralEntityReporte(estadorubroAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoRubro(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoRubroConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRubroConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRubroConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRubroConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoRubro(EstadoRubro estadorubro,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadorubro.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadorubro.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadorubro.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadorubro.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoRubrosSeleccionados() throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorubro.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoRubros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoRubro(row);				
				iRow++;
			}				
			
			for(EstadoRubro estadorubroAux:estadorubrosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoRubro(estadorubroAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoRubrosSeleccionados() throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();		
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadorubro.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadorubros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadorubro");
			//elementRoot.appendChild(element);
		
			for(EstadoRubro estadorubroAux:estadorubrosSeleccionados) {
				element = document.createElement("estadorubro");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoRubro(estadorubroAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoRubro(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRubroConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoRubro(EstadoRubro estadorubro,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadorubro.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadorubro.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadorubro.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoRubro(EstadoRubro estadorubro,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoRubroConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadorubro.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoRubroConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadorubro.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoRubroConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadorubro.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoRubroConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadorubro.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoRubrosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoRubro> estadorubrosSeleccionados=new ArrayList<EstadoRubro>();
		
		estadorubrosSeleccionados=this.getEstadoRubrosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoRubro(estadorubrosSeleccionados);
		
		this.generarReporteEstadoRubros("Todos",estadorubrosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoRubro(ArrayList<EstadoRubro> estadorubrosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoRubro estadorubroAux:estadorubrosSeleccionados) {
				estadorubroAux.setsDetalleGeneralEntityReporte(estadorubroAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoRubroConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadorubroAux.setsDescripcionGeneralEntityReporte1(estadorubroAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoRubroConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadorubroAux.setsDescripcionGeneralEntityReporte1(estadorubroAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoRubro(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoRubro=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoRubro=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoRubro=false;
			this.isVisibilidadCeldaActualizarEstadoRubro=false;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
			this.isVisibilidadCeldaCancelarEstadoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
			this.isVisibilidadCeldaModificarEstadoRubro=false;
			this.isVisibilidadCeldaActualizarEstadoRubro=true;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
			this.isVisibilidadCeldaCancelarEstadoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
			this.isVisibilidadCeldaModificarEstadoRubro=false;
			this.isVisibilidadCeldaActualizarEstadoRubro=true;
			this.isVisibilidadCeldaEliminarEstadoRubro=true;
			this.isVisibilidadCeldaCancelarEstadoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
			this.isVisibilidadCeldaModificarEstadoRubro=false;
			this.isVisibilidadCeldaActualizarEstadoRubro=true;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
			this.isVisibilidadCeldaCancelarEstadoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=true;
			this.isVisibilidadCeldaModificarEstadoRubro=false;
			this.isVisibilidadCeldaActualizarEstadoRubro=false;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
			this.isVisibilidadCeldaCancelarEstadoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
			this.isVisibilidadCeldaActualizarEstadoRubro=false;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
			this.isVisibilidadCeldaCancelarEstadoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
			this.isVisibilidadCeldaModificarEstadoRubro=true;
			this.isVisibilidadCeldaActualizarEstadoRubro=false;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
			this.isVisibilidadCeldaCancelarEstadoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRubro=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoRubroJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=true;
		} else {
			this.actualizarEstadoPanelsEstadoRubro(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoRubro=false;
			//this.isVisibilidadCeldaVerFormEstadoRubro=false;
			this.isVisibilidadCeldaDuplicarEstadoRubro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadorubroSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadorubroSessionBean.getEsGuardarRelacionado()) {
			if(!estadorubroSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;												
			}
			
			this.jButtonCerrarEstadoRubro.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRubro=false;
		}
		
		if(!this.permiteMantenimiento(this.estadorubro)) {
			this.isVisibilidadCeldaActualizarEstadoRubro=false;
			this.isVisibilidadCeldaEliminarEstadoRubro=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRubro() {
		this.isVisibilidadCeldaNuevoEstadoRubro=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoRubro=false;
	}
	
	public void actualizarEstadoPanelsEstadoRubro(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoRubro!=null) {
				this.jScrollPanelDatosEdicionEstadoRubro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRubro!=null) {
				this.jScrollPanelDatosEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRubro!=null) {
				this.jPanelPaginacionEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRubro!=null) {
				this.jPanelParametrosReportesEstadoRubro.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoRubro!=null) {
				this.jScrollPanelDatosEdicionEstadoRubro.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoRubro!=null) {
				this.jScrollPanelDatosEstadoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRubro!=null) {
				this.jPanelPaginacionEstadoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRubro!=null) {
				this.jPanelParametrosReportesEstadoRubro.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoRubro!=null) {
				this.jScrollPanelDatosEdicionEstadoRubro.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoRubro!=null) {
				this.jScrollPanelDatosEstadoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRubro!=null) {
				this.jPanelPaginacionEstadoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRubro!=null) {
				this.jPanelParametrosReportesEstadoRubro.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoRubro!=null) {
				this.jScrollPanelDatosEdicionEstadoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRubro!=null) {
				this.jScrollPanelDatosEstadoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRubro!=null) {
				this.jPanelPaginacionEstadoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRubro!=null) {
				this.jPanelParametrosReportesEstadoRubro.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoRubro!=null) {
				this.jScrollPanelDatosEdicionEstadoRubro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRubro!=null) {
				this.jScrollPanelDatosEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRubro!=null) {
				this.jPanelPaginacionEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRubro!=null) {
				this.jPanelParametrosReportesEstadoRubro.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoRubro!=null) {
				this.jScrollPanelDatosEdicionEstadoRubro.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRubro!=null) {
				this.jScrollPanelDatosEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRubro!=null) {
				this.jPanelPaginacionEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRubro!=null) {
				this.jPanelParametrosReportesEstadoRubro.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoRubro!=null) {
				this.jScrollPanelDatosEdicionEstadoRubro.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRubro!=null) {
				this.jScrollPanelDatosEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRubro!=null) {
				this.jPanelPaginacionEstadoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRubro!=null) {
				this.jPanelParametrosReportesEstadoRubro.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadorubroSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadorubroSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoRubroParaRubroEmpleados() throws Exception {
		Boolean isPaginaPopupRubroEmpleado=false;

		try {

			if(this.estadorubroSessionBean==null) {
				this.estadorubroSessionBean=new EstadoRubroSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean=new RubroEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean.setsPathNavegacionActual(estadorubroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RubroEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRubroEmpleado=this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRubroEmpleado(true);
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRubroEmpleado(EstadoRubroConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRubro(true);
			this.jInternalFrameDetalleFormEstadoRubro.rubroempleadoSessionBean.setlidEstadoRubroActual(this.idEstadoRubroActual);

			estadorubroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoRubro(true);
			estadorubroSessionBean.setlIdEstadoRubroActualForeignKey(this.idEstadoRubroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoRubroSessionBean estadorubroSessionBean=new EstadoRubroSessionBean();
		
		if(this.estadorubroSessionBean==null) {
			this.estadorubroSessionBean=new EstadoRubroSessionBean();
		}
		
		this.estadorubroSessionBean.setsUltimaBusquedaEstadoRubro(this.getsAccionBusqueda());
		this.estadorubroSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadorubroSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoRubroSessionBean estadorubroSessionBean=new EstadoRubroSessionBean();
		
		if(this.estadorubroSessionBean==null) {
			this.estadorubroSessionBean=new EstadoRubroSessionBean();
		}
		
		if(this.estadorubroSessionBean.getsUltimaBusquedaEstadoRubro()!=null&&!this.estadorubroSessionBean.getsUltimaBusquedaEstadoRubro().equals("")) {
			this.setsAccionBusqueda(estadorubroSessionBean.getsUltimaBusquedaEstadoRubro());
			this.setiNumeroPaginacion(estadorubroSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadorubroSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadorubroSessionBean.setsUltimaBusquedaEstadoRubro("");
		this.estadorubroSessionBean.setiNumeroPaginacion(EstadoRubroConstantesFunciones.INUMEROPAGINACION);
		this.estadorubroSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoRubro(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoRubro() {
		this.updateBorderResaltarBusquedasFormularioEstadoRubro();
		this.updateVisibilidadBusquedasFormularioEstadoRubro();
		this.updateHabilitarBusquedasFormularioEstadoRubro();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoRubro() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoRubro() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoRubro() {
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
	
	public void updateControlesFormularioEstadoRubro() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoRubro();
		this.updateVisibilidadResaltarControlesFormularioEstadoRubro();
		this.updateHabilitarResaltarControlesFormularioEstadoRubro();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoRubro() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadorubroConstantesFunciones.resaltaridEstadoRubro!=null && this.jInternalFrameDetalleFormEstadoRubro!=null) {this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.setBorder(this.estadorubroConstantesFunciones.resaltaridEstadoRubro);}
		if(this.estadorubroConstantesFunciones.resaltarcodigoEstadoRubro!=null && this.jInternalFrameDetalleFormEstadoRubro!=null) {this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.setBorder(this.estadorubroConstantesFunciones.resaltarcodigoEstadoRubro);}
		if(this.estadorubroConstantesFunciones.resaltarnombreEstadoRubro!=null && this.jInternalFrameDetalleFormEstadoRubro!=null) {this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.setBorder(this.estadorubroConstantesFunciones.resaltarnombreEstadoRubro);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoRubro() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
	
		//this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.setVisible(this.estadorubroConstantesFunciones.mostraridEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.jPanelidEstadoRubro.setVisible(this.estadorubroConstantesFunciones.mostraridEstadoRubro);
		//this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.setVisible(this.estadorubroConstantesFunciones.mostrarcodigoEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.jPanelcodigoEstadoRubro.setVisible(this.estadorubroConstantesFunciones.mostrarcodigoEstadoRubro);
		//this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.setVisible(this.estadorubroConstantesFunciones.mostrarnombreEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.jPanelnombreEstadoRubro.setVisible(this.estadorubroConstantesFunciones.mostrarnombreEstadoRubro);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoRubro() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRubro!=null) {
	
		this.jInternalFrameDetalleFormEstadoRubro.jTextFieldidEstadoRubro.setEnabled(this.estadorubroConstantesFunciones.activaridEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.jTextFieldcodigoEstadoRubro.setEnabled(this.estadorubroConstantesFunciones.activarcodigoEstadoRubro);
		this.jInternalFrameDetalleFormEstadoRubro.jTextAreanombreEstadoRubro.setEnabled(this.estadorubroConstantesFunciones.activarnombreEstadoRubro);
		}
	}
	
		
}