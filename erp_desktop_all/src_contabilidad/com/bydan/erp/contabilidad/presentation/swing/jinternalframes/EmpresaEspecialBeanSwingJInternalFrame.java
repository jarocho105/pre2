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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.EmpresaEspecialConstantesFunciones;
import com.bydan.erp.contabilidad.util.EmpresaEspecialParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.EmpresaEspecialParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.EmpresaEspecialBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class EmpresaEspecialBeanSwingJInternalFrame extends EmpresaEspecialJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpresaEspecialBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpresaEspecial> empresaespecialValidator = new ClassValidator<EmpresaEspecial>(EmpresaEspecial.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpresaEspecial empresaespecial;	
	public EmpresaEspecial empresaespecialAux;
	public EmpresaEspecial empresaespecialAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpresaEspecial empresaespecialTotales;
	public Long idEmpresaEspecialActual;
	public Long iIdNuevoEmpresaEspecial=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoEmpresaEspecial;
	public Boolean isPermisoNuevoEmpresaEspecial;
	public Boolean isPermisoActualizarEmpresaEspecial;
	public Boolean isPermisoActualizarOriginalEmpresaEspecial;
	public Boolean isPermisoEliminarEmpresaEspecial;
	public Boolean isPermisoGuardarCambiosEmpresaEspecial;
	public Boolean isPermisoConsultaEmpresaEspecial;
	public Boolean isPermisoBusquedaEmpresaEspecial;
	public Boolean isPermisoReporteEmpresaEspecial;
	public Boolean isPermisoPaginacionMedioEmpresaEspecial;
	public Boolean isPermisoPaginacionAltoEmpresaEspecial;
	public Boolean isPermisoPaginacionTodoEmpresaEspecial;
	public Boolean isPermisoCopiarEmpresaEspecial;
	public Boolean isPermisoVerFormEmpresaEspecial;
	public Boolean isPermisoDuplicarEmpresaEspecial;
	public Boolean isPermisoOrdenEmpresaEspecial;
	
	
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
	
	public EmpresaEspecialParameterReturnGeneral empresaespecialReturnGeneral;
	public EmpresaEspecialParameterReturnGeneral empresaespecialParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpresaEspecial=false;
	public Boolean esParaAccionDesdeFormularioEmpresaEspecial=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpresaEspecialSessionBeanAdditional empresaespecialSessionBeanAdditional=null;
	
	public EmpresaEspecialSessionBeanAdditional getEmpresaEspecialSessionBeanAdditional() {
		return this.empresaespecialSessionBeanAdditional;
	}
	
	public void setEmpresaEspecialSessionBeanAdditional(EmpresaEspecialSessionBeanAdditional empresaespecialSessionBeanAdditional) {
		try {
			this.empresaespecialSessionBeanAdditional=empresaespecialSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpresaEspecialBeanSwingJInternalFrameAdditional empresaespecialBeanSwingJInternalFrameAdditional=null;
	//public class EmpresaEspecialBeanSwingJInternalFrame
	
	public EmpresaEspecialBeanSwingJInternalFrameAdditional getEmpresaEspecialBeanSwingJInternalFrameAdditional() {
		return this.empresaespecialBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpresaEspecialBeanSwingJInternalFrameAdditional(EmpresaEspecialBeanSwingJInternalFrameAdditional empresaespecialBeanSwingJInternalFrameAdditional) {
		try {
			this.empresaespecialBeanSwingJInternalFrameAdditional=empresaespecialBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpresaEspecialLogic empresaespecialLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpresaEspecial empresaespecialBean;
	public EmpresaEspecialConstantesFunciones empresaespecialConstantesFunciones;
	//public EmpresaEspecialParameterReturnGeneral empresaespecialReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EmpresaEspecial> empresaespecials;	
	//public List<EmpresaEspecial> empresaespecialsEliminados;
	//public List<EmpresaEspecial> empresaespecialsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpresaEspecial=false;
	public Boolean isVisibilidadCeldaDuplicarEmpresaEspecial=true;
	public Boolean isVisibilidadCeldaCopiarEmpresaEspecial=true;
	public Boolean isVisibilidadCeldaVerFormEmpresaEspecial=true;
	public Boolean isVisibilidadCeldaOrdenEmpresaEspecial=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
	public Boolean isVisibilidadCeldaModificarEmpresaEspecial=false;
	public Boolean isVisibilidadCeldaActualizarEmpresaEspecial=false;
	public Boolean isVisibilidadCeldaEliminarEmpresaEspecial=false;
	public Boolean isVisibilidadCeldaCancelarEmpresaEspecial=false;
	public Boolean isVisibilidadCeldaGuardarEmpresaEspecial=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;	
	
	
	
	public Long getiIdNuevoEmpresaEspecial() {
		return this.iIdNuevoEmpresaEspecial;
	}

	public void setiIdNuevoEmpresaEspecial(Long iIdNuevoEmpresaEspecial) {
		this.iIdNuevoEmpresaEspecial = iIdNuevoEmpresaEspecial;
	}
	
	public Long getidEmpresaEspecialActual() {
		return this.idEmpresaEspecialActual;
	}

	public void setidEmpresaEspecialActual(Long idEmpresaEspecialActual) {
		this.idEmpresaEspecialActual = idEmpresaEspecialActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpresaEspecial getempresaespecial() {
		return this.empresaespecial;
	}

	public void setempresaespecial(EmpresaEspecial empresaespecial) {
		this.empresaespecial = empresaespecial;
	}
	
	public EmpresaEspecial getempresaespecialAux() {
		return this.empresaespecialAux;
	}

	public void setempresaespecialAux(EmpresaEspecial empresaespecialAux) {
		this.empresaespecialAux = empresaespecialAux;
	}				
	
	public EmpresaEspecial getempresaespecialAnterior() {
		return this.empresaespecialAnterior;
	}

	public void setempresaespecialAnterior(EmpresaEspecial empresaespecialAnterior) {
		this.empresaespecialAnterior = empresaespecialAnterior;
	}	
	
	public EmpresaEspecial getempresaespecialTotales() {
		return this.empresaespecialTotales;
	}

	public void setempresaespecialTotales(EmpresaEspecial empresaespecialTotales) {
		this.empresaespecialTotales = empresaespecialTotales;
	}	
	
	public EmpresaEspecial getempresaespecialBean() {
		return this.empresaespecialBean;
	}

	public void setempresaespecialBean(EmpresaEspecial empresaespecialBean) {
		this.empresaespecialBean = empresaespecialBean;
	}	
	
	public EmpresaEspecialParameterReturnGeneral getempresaespecialReturnGeneral() {
		return this.empresaespecialReturnGeneral;
	}

	public void setempresaespecialReturnGeneral(EmpresaEspecialParameterReturnGeneral empresaespecialReturnGeneral) {
		this.empresaespecialReturnGeneral = empresaespecialReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpresaEspecialLogic getEmpresaEspecialLogic()	{		
		return empresaespecialLogic;
	}

	public void setEmpresaEspecialLogic(EmpresaEspecialLogic empresaespecialLogic) {
		this.empresaespecialLogic = empresaespecialLogic;
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
	
	public Boolean getIsEsNuevoEmpresaEspecial() {
		return isEsNuevoEmpresaEspecial;
	}

	public void setIsEsNuevoEmpresaEspecial(Boolean isEsNuevoEmpresaEspecial) {
		this.isEsNuevoEmpresaEspecial = isEsNuevoEmpresaEspecial;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpresaEspecial() {
		return esParaAccionDesdeFormularioEmpresaEspecial;
	}
	
	public void setEsParaAccionDesdeFormularioEmpresaEspecial(Boolean esParaAccionDesdeFormularioEmpresaEspecial) {
		this.esParaAccionDesdeFormularioEmpresaEspecial = esParaAccionDesdeFormularioEmpresaEspecial;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEmpresaEspecial() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpresaEspecialConstantesFunciones.refrescarForeignKeysDescripcionesEmpresaEspecial(this.empresaespecialLogic.getEmpresaEspecials());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpresaEspecialConstantesFunciones.refrescarForeignKeysDescripcionesEmpresaEspecial(this.empresaespecials);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empresaespecialLogic.setEmpresaEspecials(this.empresaespecials);
			empresaespecialLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpresaEspecialParameterReturnGeneral getEmpresaEspecialParameterGeneral() {
		return this.empresaespecialParameterGeneral;
	}
	
	public void setEmpresaEspecialParameterGeneral(EmpresaEspecialParameterReturnGeneral empresaespecialParameterGeneral) {
		this.empresaespecialParameterGeneral = empresaespecialParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpresaEspecial() {
		return isPermisoTodoEmpresaEspecial;
	}

	public void setIsPermisoTodoEmpresaEspecial(Boolean isPermisoTodoEmpresaEspecial) {
		this.isPermisoTodoEmpresaEspecial = isPermisoTodoEmpresaEspecial;
	}

	public Boolean getIsPermisoNuevoEmpresaEspecial() {
		return isPermisoNuevoEmpresaEspecial;
	}

	public void setIsPermisoNuevoEmpresaEspecial(Boolean isPermisoNuevoEmpresaEspecial) {
		this.isPermisoNuevoEmpresaEspecial = isPermisoNuevoEmpresaEspecial;
	}

	public Boolean getIsPermisoActualizarEmpresaEspecial() {
		return isPermisoActualizarEmpresaEspecial;
	}

	public void setIsPermisoActualizarEmpresaEspecial(Boolean isPermisoActualizarEmpresaEspecial) {
		this.isPermisoActualizarEmpresaEspecial = isPermisoActualizarEmpresaEspecial;
	}

	public Boolean getIsPermisoEliminarEmpresaEspecial() {
		return isPermisoEliminarEmpresaEspecial;
	}

	public void setIsPermisoEliminarEmpresaEspecial(Boolean isPermisoEliminarEmpresaEspecial) {
		this.isPermisoEliminarEmpresaEspecial = isPermisoEliminarEmpresaEspecial;
	}

	public Boolean getIsPermisoGuardarCambiosEmpresaEspecial() {
		return isPermisoGuardarCambiosEmpresaEspecial;
	}

	public void setIsPermisoGuardarCambiosEmpresaEspecial(Boolean isPermisoGuardarCambiosEmpresaEspecial) {
		this.isPermisoGuardarCambiosEmpresaEspecial = isPermisoGuardarCambiosEmpresaEspecial;
	}
	
	public Boolean getIsPermisoConsultaEmpresaEspecial() {
		return isPermisoConsultaEmpresaEspecial;
	}

	public void setIsPermisoConsultaEmpresaEspecial(Boolean isPermisoConsultaEmpresaEspecial) {
		this.isPermisoConsultaEmpresaEspecial = isPermisoConsultaEmpresaEspecial;
	}

	public Boolean getIsPermisoBusquedaEmpresaEspecial() {
		return isPermisoBusquedaEmpresaEspecial;
	}

	public void setIsPermisoBusquedaEmpresaEspecial(Boolean isPermisoBusquedaEmpresaEspecial) {
		this.isPermisoBusquedaEmpresaEspecial = isPermisoBusquedaEmpresaEspecial;
	}

	public Boolean getIsPermisoReporteEmpresaEspecial() {
		return isPermisoReporteEmpresaEspecial;
	}

	public void setIsPermisoReporteEmpresaEspecial(Boolean isPermisoReporteEmpresaEspecial) {
		this.isPermisoReporteEmpresaEspecial = isPermisoReporteEmpresaEspecial;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpresaEspecial() {
		return isPermisoPaginacionMedioEmpresaEspecial;
	}

	public void setIsPermisoPaginacionMedioEmpresaEspecial(Boolean isPermisoPaginacionMedioEmpresaEspecial) {
		this.isPermisoPaginacionMedioEmpresaEspecial = isPermisoPaginacionMedioEmpresaEspecial;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpresaEspecial() {
		return isPermisoPaginacionTodoEmpresaEspecial;
	}

	public void setIsPermisoPaginacionTodoEmpresaEspecial(Boolean isPermisoPaginacionTodoEmpresaEspecial) {
		this.isPermisoPaginacionTodoEmpresaEspecial = isPermisoPaginacionTodoEmpresaEspecial;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpresaEspecial() {
		return isPermisoPaginacionAltoEmpresaEspecial;
	}

	public void setIsPermisoPaginacionAltoEmpresaEspecial(Boolean isPermisoPaginacionAltoEmpresaEspecial) {
		this.isPermisoPaginacionAltoEmpresaEspecial = isPermisoPaginacionAltoEmpresaEspecial;
	}
	
	public Boolean getIsPermisoCopiarEmpresaEspecial() {
		return isPermisoCopiarEmpresaEspecial;
	}

	public void setIsPermisoCopiarEmpresaEspecial(Boolean isPermisoCopiarEmpresaEspecial) {
		this.isPermisoCopiarEmpresaEspecial = isPermisoCopiarEmpresaEspecial;
	}
	
	public Boolean getIsPermisoVerFormEmpresaEspecial() {
		return isPermisoVerFormEmpresaEspecial;
	}

	public void setIsPermisoVerFormEmpresaEspecial(Boolean isPermisoVerFormEmpresaEspecial) {
		this.isPermisoVerFormEmpresaEspecial = isPermisoVerFormEmpresaEspecial;
	}
	
	public Boolean getIsPermisoDuplicarEmpresaEspecial() {
		return isPermisoDuplicarEmpresaEspecial;
	}

	public void setIsPermisoDuplicarEmpresaEspecial(Boolean isPermisoDuplicarEmpresaEspecial) {
		this.isPermisoDuplicarEmpresaEspecial = isPermisoDuplicarEmpresaEspecial;
	}
	
	public Boolean getIsPermisoOrdenEmpresaEspecial() {
		return isPermisoOrdenEmpresaEspecial;
	}

	public void setIsPermisoOrdenEmpresaEspecial(Boolean isPermisoOrdenEmpresaEspecial) {
		this.isPermisoOrdenEmpresaEspecial = isPermisoOrdenEmpresaEspecial;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpresaEspecial() {
		return isVisibilidadCeldaNuevoEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaNuevoEmpresaEspecial(Boolean isVisibilidadCeldaNuevoEmpresaEspecial) {
		this.isVisibilidadCeldaNuevoEmpresaEspecial = isVisibilidadCeldaNuevoEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpresaEspecial() {
		return isVisibilidadCeldaDuplicarEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaDuplicarEmpresaEspecial(Boolean isVisibilidadCeldaDuplicarEmpresaEspecial) {
		this.isVisibilidadCeldaDuplicarEmpresaEspecial = isVisibilidadCeldaDuplicarEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpresaEspecial() {
		return isVisibilidadCeldaCopiarEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaCopiarEmpresaEspecial(Boolean isVisibilidadCeldaCopiarEmpresaEspecial) {
		this.isVisibilidadCeldaCopiarEmpresaEspecial = isVisibilidadCeldaCopiarEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpresaEspecial() {
		return isVisibilidadCeldaVerFormEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaVerFormEmpresaEspecial(Boolean isVisibilidadCeldaVerFormEmpresaEspecial) {
		this.isVisibilidadCeldaVerFormEmpresaEspecial = isVisibilidadCeldaVerFormEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpresaEspecial() {
		return isVisibilidadCeldaOrdenEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaOrdenEmpresaEspecial(Boolean isVisibilidadCeldaOrdenEmpresaEspecial) {
		this.isVisibilidadCeldaOrdenEmpresaEspecial = isVisibilidadCeldaOrdenEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpresaEspecial() {
		return isVisibilidadCeldaNuevoRelacionesEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpresaEspecial(Boolean isVisibilidadCeldaNuevoRelacionesEmpresaEspecial) {
		this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial = isVisibilidadCeldaNuevoRelacionesEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpresaEspecial() {
		return isVisibilidadCeldaModificarEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaModificarEmpresaEspecial(Boolean isVisibilidadCeldaModificarEmpresaEspecial) {
		this.isVisibilidadCeldaModificarEmpresaEspecial = isVisibilidadCeldaModificarEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpresaEspecial() {
		return isVisibilidadCeldaActualizarEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaActualizarEmpresaEspecial(Boolean isVisibilidadCeldaActualizarEmpresaEspecial) {
		this.isVisibilidadCeldaActualizarEmpresaEspecial = isVisibilidadCeldaActualizarEmpresaEspecial;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpresaEspecial() {
		return isVisibilidadCeldaEliminarEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaEliminarEmpresaEspecial(Boolean isVisibilidadCeldaEliminarEmpresaEspecial) {
		this.isVisibilidadCeldaEliminarEmpresaEspecial = isVisibilidadCeldaEliminarEmpresaEspecial;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpresaEspecial() {
		return isVisibilidadCeldaCancelarEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaCancelarEmpresaEspecial(Boolean isVisibilidadCeldaCancelarEmpresaEspecial) {
		this.isVisibilidadCeldaCancelarEmpresaEspecial = isVisibilidadCeldaCancelarEmpresaEspecial;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpresaEspecial() {
		return isVisibilidadCeldaGuardarEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaGuardarEmpresaEspecial(Boolean isVisibilidadCeldaGuardarEmpresaEspecial) {
		this.isVisibilidadCeldaGuardarEmpresaEspecial = isVisibilidadCeldaGuardarEmpresaEspecial;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpresaEspecial() {
		return isVisibilidadCeldaGuardarCambiosEmpresaEspecial;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpresaEspecial(Boolean isVisibilidadCeldaGuardarCambiosEmpresaEspecial) {
		this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial = isVisibilidadCeldaGuardarCambiosEmpresaEspecial;
	}
		
	public EmpresaEspecialSessionBean getempresaespecialSessionBean() {
		return this.empresaespecialSessionBean;
	}
	
	public void setempresaespecialSessionBean(EmpresaEspecialSessionBean empresaespecialSessionBean) {
		this.empresaespecialSessionBean=empresaespecialSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(EmpresaEspecial empresaespecial)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EmpresaEspecial empresaespecial,EmpresaEspecial empresaespecialAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpresaEspecial(empresaespecial);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empresaespecialAux.setId(empresaespecial.getId());
		empresaespecialAux.setVersionRow(empresaespecial.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpresaEspecial();
		
			int intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empresaespecialValidator.getInvalidValues(this.empresaespecial);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empresaespecialLogic.setDatosCliente(datosCliente);
			empresaespecialLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empresaespecialAux=new  EmpresaEspecial();
				
				empresaespecialAux.setIsNew(true);
				empresaespecialAux.setIsChanged(true);
				
				empresaespecialAux.setEmpresaEspecialOriginal(this.empresaespecial);
				
				empresaespecialAux.setId(this.empresaespecial.getId());	
				empresaespecialAux.setVersionRow(this.empresaespecial.getVersionRow());	
				empresaespecialAux.setnumero_resolucion(this.empresaespecial.getnumero_resolucion());	
				empresaespecialAux.setfecha_resolucion(this.empresaespecial.getfecha_resolucion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empresaespecialAux,empresaespecialLogic.getEmpresaEspecials());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaespecialAux,empresaespecials);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaespecialLogic.saveEmpresaEspecials();//WithConnection
						//empresaespecialLogic.getSetVersionRowEmpresaEspecials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empresaespecial,empresaespecialAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empresaespecialLogic.saveEmpresaEspecialRelaciones(empresaespecialAux);//WithConnection
								//empresaespecialLogic.getSetVersionRowEmpresaEspecials();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empresaespecial,empresaespecialAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empresaespecialAux,empresaespecialLogic.getEmpresaEspecials());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empresaespecialAux,empresaespecials);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empresaespecial,empresaespecialAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empresaespecialAux=new  EmpresaEspecial();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empresaespecialSessionBean.getEsGuardarRelacionado() 
					|| (this.empresaespecialSessionBean.getEsGuardarRelacionado() && this.empresaespecial.getId()>=0)) {
						
					empresaespecialAux.setIsNew(false);
				}
				
				empresaespecialAux.setIsDeleted(false);
			
				empresaespecialAux.setId(this.empresaespecial.getId());	
				empresaespecialAux.setVersionRow(this.empresaespecial.getVersionRow());	
				empresaespecialAux.setnumero_resolucion(this.empresaespecial.getnumero_resolucion());	
				empresaespecialAux.setfecha_resolucion(this.empresaespecial.getfecha_resolucion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empresaespecialAux,empresaespecialLogic.getEmpresaEspecials());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaespecialAux,empresaespecials);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaespecialLogic.saveEmpresaEspecials();//WithConnection
						//empresaespecialLogic.getSetVersionRowEmpresaEspecials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empresaespecial,empresaespecialAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empresaespecialLogic.saveEmpresaEspecialRelaciones(empresaespecialAux);//WithConnection
								//empresaespecialLogic.getSetVersionRowEmpresaEspecials();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empresaespecial,empresaespecialAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empresaespecialAux,empresaespecialLogic.getEmpresaEspecials());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empresaespecialAux,empresaespecials);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empresaespecial,empresaespecialAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empresaespecialAux=new  EmpresaEspecial();
				
				empresaespecialAux.setIsNew(false);
				empresaespecialAux.setIsChanged(false);
				
				empresaespecialAux.setIsDeleted(true);
				
				empresaespecialAux.setId(this.empresaespecial.getId());	
				empresaespecialAux.setVersionRow(this.empresaespecial.getVersionRow());	
				empresaespecialAux.setnumero_resolucion(this.empresaespecial.getnumero_resolucion());	
				empresaespecialAux.setfecha_resolucion(this.empresaespecial.getfecha_resolucion());	
				
				if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empresaespecialAux.getId()>=0) {	
						this.empresaespecialsEliminados.add(empresaespecialAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empresaespecialAux,empresaespecialLogic.getEmpresaEspecials());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaespecialAux,empresaespecials);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaespecialLogic.saveEmpresaEspecials();//WithConnection
						//empresaespecialLogic.getSetVersionRowEmpresaEspecials();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empresaespecialLogic.saveEmpresaEspecialRelaciones(empresaespecialAux);//WithConnection
								//empresaespecialLogic.getSetVersionRowEmpresaEspecials();//WithConnection
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
							if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empresaespecialAux,empresaespecialLogic.getEmpresaEspecials());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empresaespecialAux,empresaespecials);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.getEmpresaEspecials().addAll(this.empresaespecialsEliminados);
					
					empresaespecialLogic.saveEmpresaEspecials();//WithConnection
					//empresaespecialLogic.getSetVersionRowEmpresaEspecials();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.empresaespecialsEliminados= new ArrayList<EmpresaEspecial>();		
			}
			
			if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empresa Especial GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empresaespecial=empresaespecialAux;
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
      		//this.finishProcessEmpresaEspecial();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpresaEspecial empresaespecialLocal) throws Exception {
		
		if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpresaEspecial empresaespecialLocal) throws Exception {	
		if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEmpresaEspecialActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empresaespecialValidator.getInvalidValues(this.empresaespecial);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpresaEspecial empresaespecial,List<EmpresaEspecial> empresaespecials) throws Exception {
		try	{		
			EmpresaEspecialConstantesFunciones.actualizarLista(empresaespecial,empresaespecials,this.empresaespecialSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpresaEspecial empresaespecial,List<EmpresaEspecial> empresaespecials) throws Exception {
		try	{			
			EmpresaEspecialConstantesFunciones.actualizarSelectedLista(empresaespecial,empresaespecials);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpresaEspecial> empresaespecialsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empresaespecialsLocal=this.empresaespecialLogic.getEmpresaEspecials();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empresaespecialsLocal=this.empresaespecials;
			}
			//ARCHITECTURE
		
			for(EmpresaEspecial empresaespecialLocal:empresaespecialsLocal) {
				if(this.permiteMantenimiento(empresaespecialLocal) && empresaespecialLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpresaEspecialConstantesFunciones.getEmpresaEspecialLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpresaEspecialConstantesFunciones.NUMERORESOLUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresaEspecial.jLabelnumero_resolucionEmpresaEspecial,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpresaEspecialConstantesFunciones.FECHARESOLUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresaEspecial.jLabelfecha_resolucionEmpresaEspecial,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresaEspecial.jLabelnumero_resolucionEmpresaEspecial,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpresaEspecial.jLabelfecha_resolucionEmpresaEspecial,"");
		
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
		this.iIdNuevoEmpresaEspecial--;	
		
		
		this.empresaespecialAux=new EmpresaEspecial();
		
		this.empresaespecialAux.setId(this.iIdNuevoEmpresaEspecial);
		this.empresaespecialAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empresaespecialLogic.getEmpresaEspecials().add(this.empresaespecialAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empresaespecials.add(this.empresaespecialAux);
		}
		//ARCHITECTURE
		
		this.empresaespecial=this.empresaespecialAux;
		
		if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpresaEspecial(this.empresaespecial);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpresaEspecial(this.empresaespecial);
		}
				
		//this.setDefaultControlesEmpresaEspecial();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpresaEspecial();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpresaEspecial();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpresaEspecial();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpresaEspecial(this.empresaespecialBean,this.empresaespecial,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpresaEspecialConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
			classes=EmpresaEspecialConstantesFunciones.getClassesRelationshipsOfEmpresaEspecial(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empresaespecialReturnGeneral=empresaespecialLogic.procesarEventosEmpresaEspecialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empresaespecialLogic.getEmpresaEspecials(),this.empresaespecial,this.empresaespecialParameterGeneral,this.isEsNuevoEmpresaEspecial,classes);//this.empresaespecialLogic.getEmpresaEspecial()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpresaEspecial(this.empresaespecialReturnGeneral,this.empresaespecialBean,false);
		
		if(this.empresaespecialReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpresaEspecial(this.empresaespecialReturnGeneral.getEmpresaEspecial());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpresaEspecial(this.empresaespecialReturnGeneral.getEmpresaEspecial());
		}
		
		if(this.empresaespecialReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpresaEspecial(this.empresaespecialReturnGeneral.getEmpresaEspecial(),classes);//this.empresaespecialBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpresaEspecial();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpresaEspecial();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.RecargarFormEmpresaEspecial(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpresaEspecial(false);
						
			if(empresaespecialSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpresaEspecial();
			}
			
			this.actualizarVisualTableDatosEmpresaEspecial();
			
			this.jTableDatosEmpresaEspecial.setRowSelectionInterval(this.getIndiceNuevoEmpresaEspecial(), this.getIndiceNuevoEmpresaEspecial());
			
			this.seleccionarFilaTablaEmpresaEspecialActual();
						
			this.actualizarEstadoCeldasBotonesEmpresaEspecial("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpresaEspecial(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.setEnabled(isHabilitar && this.empresaespecialConstantesFunciones.activarnumero_resolucionEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.setEnabled(isHabilitar && this.empresaespecialConstantesFunciones.activarfecha_resolucionEmpresaEspecial);	
		
	};
	
	public void setDefaultControlesEmpresaEspecial() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpresaEspecial(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empresaespecialSessionBean.setConGuardarRelaciones(true);			
			this.empresaespecialSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.setVisible(true);
			
					
		} else {
			//this.empresaespecialSessionBean.setConGuardarRelaciones(false);			
			this.empresaespecialSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpresaEspecial() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
				if(empresaespecialAux.getId().equals(this.iIdNuevoEmpresaEspecial)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpresaEspecial empresaespecialAux:this.empresaespecials) {
				if(empresaespecialAux.getId().equals(this.iIdNuevoEmpresaEspecial)) {
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
	
	public int getIndiceActualEmpresaEspecial(EmpresaEspecial empresaespecial,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
				if(empresaespecialAux.getId().equals(empresaespecial.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpresaEspecial empresaespecialAux:this.empresaespecials) {
				if(empresaespecialAux.getId().equals(empresaespecial.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpresaEspecial(EmpresaEspecial empresaespecialOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
				if(empresaespecialAux.getEmpresaEspecialOriginal().getId().equals(empresaespecialOriginal.getId())) {
					existe=true;
					empresaespecialOriginal.setId(empresaespecialAux.getId());
					empresaespecialOriginal.setVersionRow(empresaespecialAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpresaEspecial empresaespecialAux:this.empresaespecials) {
				if(empresaespecialAux.getEmpresaEspecialOriginal().getId().equals(empresaespecialOriginal.getId())) {
					existe=true;
					empresaespecialOriginal.setId(empresaespecialAux.getId());
					empresaespecialOriginal.setVersionRow(empresaespecialAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpresaEspecial(Boolean esParaCancelar) throws Exception {
		empresaespecialsAux=new ArrayList<EmpresaEspecial>();
		empresaespecialAux=new EmpresaEspecial();
		
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
					if(empresaespecialAux.getId()<0) {
						empresaespecialsAux.add(empresaespecialAux);
					}		
				}
				this.iIdNuevoEmpresaEspecial=0L;
				this.empresaespecialLogic.getEmpresaEspecials().removeAll(empresaespecialsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpresaEspecial empresaespecialAux:this.empresaespecials) {
					if(empresaespecialAux.getId()<0) {
						empresaespecialsAux.add(empresaespecialAux);
					}		
				}
				this.iIdNuevoEmpresaEspecial=0L;
				this.empresaespecials.removeAll(empresaespecialsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpresaEspecial 
					&& this.empresaespecialLogic.getEmpresaEspecials().size()>0
					) {
					empresaespecialAux=this.empresaespecialLogic.getEmpresaEspecials().get(this.empresaespecialLogic.getEmpresaEspecials().size() - 1);
				
					if(empresaespecialAux.getId()<0) {
						this.empresaespecialLogic.getEmpresaEspecials().remove(empresaespecialAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpresaEspecial && this.empresaespecials.size()>0) {
					empresaespecialAux=this.empresaespecials.get(this.empresaespecials.size() - 1);
				
					if(empresaespecialAux.getId()<0) {
						this.empresaespecials.remove(empresaespecialAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpresaEspecial(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empresaespecial.getId()<0) {
				this.empresaespecialLogic.getEmpresaEspecials().remove(this.empresaespecial);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empresaespecial.getId()<0) {
				this.empresaespecials.remove(this.empresaespecial);
			}
		}			
	}
	
	public void setEstadosInicialesEmpresaEspecial(List<EmpresaEspecial> empresaespecialsAux) throws Exception {
		EmpresaEspecialConstantesFunciones.setEstadosInicialesEmpresaEspecial(empresaespecialsAux);
	}
	
	public void setEstadosInicialesEmpresaEspecial(EmpresaEspecial empresaespecialAux) throws Exception {
		EmpresaEspecialConstantesFunciones.setEstadosInicialesEmpresaEspecial(empresaespecialAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpresaEspecialActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpresaEspecial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpresaEspecialActual()) {
				if(!this.isEsNuevoEmpresaEspecial) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpresaEspecial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpresaEspecial=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpresaEspecialActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empresa Especial ?", "MANTENIMIENTO DE Empresa Especial", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpresaEspecial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpresaEspecial empresaespecial) throws Exception {
		EmpresaEspecialConstantesFunciones.seleccionarAsignar(this.empresaespecial,empresaespecial);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpresaEspecial=this.isPermisoActualizarOriginalEmpresaEspecial;
			
			
			this.seleccionarAsignar(empresaespecial);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpresaEspecialConstantesFunciones.quitarEspaciosEmpresaEspecial(this.empresaespecial,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpresaEspecial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empresaespecialSessionBean.setsFuncionBusquedaRapida(this.empresaespecialSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpresaEspecial) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpresaEspecial(esParaCancelar);				
				this.cancelarNuevoEmpresaEspecial(esParaCancelar);								
			}
			
			this.empresaespecial=new EmpresaEspecial();
			
			this.inicializarEmpresaEspecial();
			
			this.actualizarEstadoCeldasBotonesEmpresaEspecial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpresaEspecial() throws Exception {
		try {
			EmpresaEspecialConstantesFunciones.inicializarEmpresaEspecial(this.empresaespecial);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empresaespecialLogic.getEmpresaEspecials().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpresaEspecials(String sAccionBusqueda,List<EmpresaEspecial> empresaespecialsParaReportes) throws Exception {
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
					sPathReporteFinal="EmpresaEspecial"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpresaEspecialMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpresaEspecialMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpresaEspecial"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empresa Especiales");		
		parameters.put("busquedapor", EmpresaEspecialConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpresaEspecial=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpresaEspecialConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpresaEspecialConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpresaEspecial=new JRBeanArrayDataSource(EmpresaEspecialJInternalFrame.TraerEmpresaEspecialBeans(empresaespecialsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpresaEspecial);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpresaEspecialConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpresaEspecialConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpresaEspecialBean.TraerEmpresaEspecialBeans(empresaespecialsParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpresaEspecials(sAccionBusqueda,sTipoArchivoReporte,empresaespecialsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpresaEspecials(sAccionBusqueda,sTipoArchivoReporte,empresaespecialsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpresaEspecialActionPerformed(null);
					//this.generarExcelReporteEmpresaEspecials(sAccionBusqueda,sTipoArchivoReporte,empresaespecialsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpresaEspecials(sAccionBusqueda,sTipoArchivoReporte,empresaespecialsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpresaEspecials(sAccionBusqueda,sTipoArchivoReporte,empresaespecialsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpresaEspecials(sAccionBusqueda,sTipoArchivoReporte,empresaespecialsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpresaEspecials(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpresaEspecial> empresaespecialsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresaespecial";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpresaEspecials");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpresaEspecial("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpresaEspecial empresaespecial : empresaespecialsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpresaEspecialConstantesFunciones.generarExcelReporteDataEmpresaEspecial("NORMAL",row,workbook,empresaespecial,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpresaEspecial(String sTipo,Row row,Workbook workbook) {
		
		EmpresaEspecialConstantesFunciones.generarExcelReporteHeaderEmpresaEspecial(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpresaEspecials(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpresaEspecial> empresaespecialsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresaespecial_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpresaEspecials");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpresaEspecial empresaespecial : empresaespecialsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpresaEspecialConstantesFunciones.getEmpresaEspecialDescripcion(empresaespecial));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresaespecial.getnumero_resolucion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empresaespecial.getfecha_resolucion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpresaEspecials(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpresaEspecial> empresaespecialsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpresaEspecial> empresaespecialsRespaldo=null;
		
		classes=EmpresaEspecialConstantesFunciones.getClassesRelationshipsOfEmpresaEspecial(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empresaespecialLogic.setDatosCliente(this.datosCliente);
		this.empresaespecialLogic.setDatosDeep(this.datosDeep);
		this.empresaespecialLogic.setIsConDeep(true);
		
		empresaespecialsRespaldo=this.empresaespecialLogic.getEmpresaEspecials();
		
		this.empresaespecialLogic.setEmpresaEspecials(empresaespecialsParaReportes);	
		this.empresaespecialLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empresaespecialsParaReportes=this.empresaespecialLogic.getEmpresaEspecials();
		this.empresaespecialLogic.setEmpresaEspecials(empresaespecialsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresaespecial_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpresaEspecials");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpresaEspecial("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpresaEspecial empresaespecial : empresaespecialsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpresaEspecial("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpresaEspecialConstantesFunciones.generarExcelReporteDataEmpresaEspecial("NORMAL",row,workbook,empresaespecial,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpresaEspecialConstantesFunciones.getEmpresaEspecialDescripcion(empresaespecial));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpresaEspecial() throws Exception {		
		this.startProcessEmpresaEspecial(true);
	}
	
	public void startProcessEmpresaEspecial(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEmpresaEspecial, this.jScrollPanelDatosEmpresaEspecial,this.jPanelPaginacionEmpresaEspecial, this.jScrollPanelDatosEdicionEmpresaEspecial, this.jPanelAccionesEmpresaEspecial,this.jPanelAccionesFormularioEmpresaEspecial,this.jmenuBarEmpresaEspecial,this.jmenuBarDetalleEmpresaEspecial,this.jTtoolBarEmpresaEspecial,this.jTtoolBarDetalleEmpresaEspecial);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpresaEspecial=null; 
		
		final JPanel jPanelParametrosReportesEmpresaEspecial=this.jPanelParametrosReportesEmpresaEspecial;
		//final JScrollPane jScrollPanelDatosEmpresaEspecial=this.jScrollPanelDatosEmpresaEspecial;
		final JTable jTableDatosEmpresaEspecial=this.jTableDatosEmpresaEspecial;		
		final JPanel jPanelPaginacionEmpresaEspecial=this.jPanelPaginacionEmpresaEspecial;
		//final JScrollPane jScrollPanelDatosEdicionEmpresaEspecial=this.jScrollPanelDatosEdicionEmpresaEspecial;
		final JPanel jPanelAccionesEmpresaEspecial=this.jPanelAccionesEmpresaEspecial;
		
		JPanel jPanelCamposAuxiliarEmpresaEspecial=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpresaEspecial=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			jPanelCamposAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jPanelCamposEmpresaEspecial;
			jPanelAccionesFormularioAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jPanelAccionesFormularioEmpresaEspecial;
		}
		
		final JPanel jPanelCamposEmpresaEspecial=jPanelCamposAuxiliarEmpresaEspecial;
		final JPanel jPanelAccionesFormularioEmpresaEspecial=jPanelAccionesFormularioAuxiliarEmpresaEspecial;
		
		
		final JMenuBar jmenuBarEmpresaEspecial=this.jmenuBarEmpresaEspecial;
		final JToolBar jTtoolBarEmpresaEspecial=this.jTtoolBarEmpresaEspecial;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpresaEspecial=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpresaEspecial=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			jmenuBarDetalleAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jmenuBarDetalleEmpresaEspecial;
			jTtoolBarDetalleAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jTtoolBarDetalleEmpresaEspecial;
		}
		
		final JMenuBar jmenuBarDetalleEmpresaEspecial=jmenuBarDetalleAuxiliarEmpresaEspecial;
		final JToolBar jTtoolBarDetalleEmpresaEspecial=jTtoolBarDetalleAuxiliarEmpresaEspecial;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpresaEspecial;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpresaEspecial;
			processRunnable.jTableDatos=jTableDatosEmpresaEspecial;
			processRunnable.jPanelCampos=jPanelCamposEmpresaEspecial;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpresaEspecial;
			processRunnable.jPanelAcciones=jPanelAccionesEmpresaEspecial;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpresaEspecial;
			
			
			processRunnable.jmenuBar=jmenuBarEmpresaEspecial;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpresaEspecial;
			processRunnable.jTtoolBar=jTtoolBarEmpresaEspecial;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpresaEspecial;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpresaEspecial ,jPanelParametrosReportesEmpresaEspecial,jTableDatosEmpresaEspecial, /*jScrollPanelDatosEmpresaEspecial,*/jPanelCamposEmpresaEspecial,jPanelPaginacionEmpresaEspecial, /*jScrollPanelDatosEdicionEmpresaEspecial,*/ jPanelAccionesEmpresaEspecial,jPanelAccionesFormularioEmpresaEspecial,jmenuBarEmpresaEspecial,jmenuBarDetalleEmpresaEspecial,jTtoolBarEmpresaEspecial,jTtoolBarDetalleEmpresaEspecial);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEmpresaEspecial, jScrollPanelDatosEmpresaEspecial,jPanelPaginacionEmpresaEspecial, jScrollPanelDatosEdicionEmpresaEspecial, jPanelAccionesEmpresaEspecial,jPanelAccionesFormularioEmpresaEspecial,jmenuBarEmpresaEspecial,jmenuBarDetalleEmpresaEspecial,jTtoolBarEmpresaEspecial,jTtoolBarDetalleEmpresaEspecial);
						
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
	
	public void finishProcessEmpresaEspecial() {// throws Exception 
		this.finishProcessEmpresaEspecial(true);
	}
	
	public void finishProcessEmpresaEspecial(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEmpresaEspecial, this.jScrollPanelDatosEmpresaEspecial,this.jPanelPaginacionEmpresaEspecial, this.jScrollPanelDatosEdicionEmpresaEspecial, this.jPanelAccionesEmpresaEspecial,this.jPanelAccionesFormularioEmpresaEspecial,this.jmenuBarEmpresaEspecial,this.jmenuBarDetalleEmpresaEspecial,this.jTtoolBarEmpresaEspecial,this.jTtoolBarDetalleEmpresaEspecial);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpresaEspecial=null; 
		
		final JPanel jPanelParametrosReportesEmpresaEspecial=this.jPanelParametrosReportesEmpresaEspecial;
		//final JScrollPane jScrollPanelDatosEmpresaEspecial=this.jScrollPanelDatosEmpresaEspecial;
		final JTable jTableDatosEmpresaEspecial=this.jTableDatosEmpresaEspecial;		
		final JPanel jPanelPaginacionEmpresaEspecial=this.jPanelPaginacionEmpresaEspecial;
		//final JScrollPane jScrollPanelDatosEdicionEmpresaEspecial=this.jScrollPanelDatosEdicionEmpresaEspecial;
		final JPanel jPanelAccionesEmpresaEspecial=this.jPanelAccionesEmpresaEspecial;
		
		JPanel jPanelCamposAuxiliarEmpresaEspecial=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpresaEspecial=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			jPanelCamposAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jPanelCamposEmpresaEspecial;
			jPanelAccionesFormularioAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jPanelAccionesFormularioEmpresaEspecial;
		}
		
		final JPanel jPanelCamposEmpresaEspecial=jPanelCamposAuxiliarEmpresaEspecial;
		final JPanel jPanelAccionesFormularioEmpresaEspecial=jPanelAccionesFormularioAuxiliarEmpresaEspecial;
		
		
		final JMenuBar jmenuBarEmpresaEspecial=this.jmenuBarEmpresaEspecial;		
		final JToolBar jTtoolBarEmpresaEspecial=this.jTtoolBarEmpresaEspecial;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpresaEspecial=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpresaEspecial=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			jmenuBarDetalleAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jmenuBarDetalleEmpresaEspecial;
			jTtoolBarDetalleAuxiliarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jTtoolBarDetalleEmpresaEspecial;		
		}
		
		final JMenuBar jmenuBarDetalleEmpresaEspecial=jmenuBarDetalleAuxiliarEmpresaEspecial;
		final JToolBar jTtoolBarDetalleEmpresaEspecial=jTtoolBarDetalleAuxiliarEmpresaEspecial;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpresaEspecial;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpresaEspecial;
			processRunnable.jTableDatos=jTableDatosEmpresaEspecial;
			processRunnable.jPanelCampos=jPanelCamposEmpresaEspecial;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpresaEspecial;
			processRunnable.jPanelAcciones=jPanelAccionesEmpresaEspecial;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpresaEspecial;
			
			
			processRunnable.jmenuBar=jmenuBarEmpresaEspecial;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpresaEspecial;
			processRunnable.jTtoolBar=jTtoolBarEmpresaEspecial;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpresaEspecial;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpresaEspecial ,jPanelParametrosReportesEmpresaEspecial, jTableDatosEmpresaEspecial,/*jScrollPanelDatosEmpresaEspecial,*/jPanelCamposEmpresaEspecial,jPanelPaginacionEmpresaEspecial, /*jScrollPanelDatosEdicionEmpresaEspecial,*/ jPanelAccionesEmpresaEspecial,jPanelAccionesFormularioEmpresaEspecial,jmenuBarEmpresaEspecial,jmenuBarDetalleEmpresaEspecial,jTtoolBarEmpresaEspecial,jTtoolBarDetalleEmpresaEspecial));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpresaEspecial(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpresaEspecial(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpresaEspecial(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpresaEspecial(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpresaEspecial,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpresaEspecial,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpresaEspecial(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpresaEspecial,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpresaEspecial,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empresaespecialConstantesFunciones.getsFinalQueryEmpresaEspecial();
		String  finalQueryPaginacionTodos=this.empresaespecialConstantesFunciones.getsFinalQueryEmpresaEspecial();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpresaEspecialConstantesFunciones.getArrayColumnasGlobalesNoEmpresaEspecial(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpresaEspecialConstantesFunciones.getArrayColumnasGlobalesEmpresaEspecial(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpresaEspecialConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empresaespecialsEliminados= new ArrayList<EmpresaEspecial>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpresaEspecial();
		
				///*EmpresaEspecialSessionBean*/this.empresaespecialSessionBean=new EmpresaEspecialSessionBean();
			
			if(this.empresaespecialSessionBean==null) {
				this.empresaespecialSessionBean=new EmpresaEspecialSessionBean();
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
					this.iNumeroPaginacion=EmpresaEspecialConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpresaEspecialConstantesFunciones.getClassesForeignKeysOfEmpresaEspecial(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empresaespecial."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empresaespecialsAux= new ArrayList<EmpresaEspecial>();
			
				
			empresaespecialLogic.setDatosCliente(this.datosCliente);
			empresaespecialLogic.setDatosDeep(this.datosDeep);
			empresaespecialLogic.setIsConDeep(true);
			
			
			empresaespecialLogic.getEmpresaEspecialDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empresaespecialLogic.getTodosEmpresaEspecials(finalQueryGlobal,pagination);
					
					//empresaespecialLogic.getTodosEmpresaEspecialsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empresaespecialLogic.getEmpresaEspecials()==null|| empresaespecialLogic.getEmpresaEspecials().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empresaespecialsAux= new ArrayList<EmpresaEspecial>();
							empresaespecialsAux.addAll(empresaespecialLogic.getEmpresaEspecials());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresaespecialsAux= new ArrayList<EmpresaEspecial>();
							empresaespecialsAux.addAll(empresaespecials);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empresaespecialLogic.getTodosEmpresaEspecials(finalQueryGlobal+"",this.pagination);												
							
							//empresaespecialLogic.getTodosEmpresaEspecialsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpresaEspecials("Todos",empresaespecialLogic.getEmpresaEspecials() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empresaespecialLogic.setEmpresaEspecials(new ArrayList<EmpresaEspecial>());					
							empresaespecialLogic.getEmpresaEspecials().addAll(empresaespecialsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresaespecials=new ArrayList<EmpresaEspecial>();
							empresaespecials.addAll(empresaespecialsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpresaEspecial=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpresaEspecial=this.idActual;
				
				} else if(this.idEmpresaEspecialActual!=null && this.idEmpresaEspecialActual!=0L) {
					idEmpresaEspecial=idEmpresaEspecialActual;
				}
				
					
				this.sDetalleReporte=EmpresaEspecialConstantesFunciones.getDetalleIndicePorId(idEmpresaEspecial);
				
				this.empresaespecials=new ArrayList<EmpresaEspecial>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empresaespecialLogic.getEntity(idEmpresaEspecial);
					
					//empresaespecialLogic.getEntityWithConnection(idEmpresaEspecial);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaespecialLogic.setEmpresaEspecials(new ArrayList<EmpresaEspecial>());
					empresaespecialLogic.getEmpresaEspecials().add(empresaespecialLogic.getEmpresaEspecial());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empresaespecials=new ArrayList<EmpresaEspecial>();
					this.empresaespecials.add(empresaespecial);
				}
				
				if(empresaespecialLogic.getEmpresaEspecial()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpresaEspecial();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpresaEspecial();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empresaespecialLogic.getEmpresaEspecials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empresaespecials.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empresaespecialLogic.getEmpresaEspecials().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empresaespecials.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpresaEspecial empresaespecial) {
		Boolean permite=true;
		
		if(this.empresaespecial.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpresaEspecialConstantesFunciones.getOrderByListaEmpresaEspecial();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpresaEspecialConstantesFunciones.getOrderByListaEmpresaEspecial();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpresaEspecial empresaespecial:empresaespecialLogic.getEmpresaEspecials()) {
				if(empresaespecial.getsType().equals(Constantes2.S_TOTALES)) {
					empresaespecialTotales=empresaespecial;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpresaEspecial empresaespecial:this.empresaespecials) {
				if(empresaespecial.getsType().equals(Constantes2.S_TOTALES)) {
					empresaespecialTotales=empresaespecial;
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
			this.empresaespecialAux=new EmpresaEspecial();
			this.empresaespecialAux.setsType(Constantes2.S_TOTALES);
			this.empresaespecialAux.setIsNew(false);
			this.empresaespecialAux.setIsChanged(false);
			this.empresaespecialAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpresaEspecialConstantesFunciones.TotalizarValoresFilaEmpresaEspecial(this.empresaespecialLogic.getEmpresaEspecials(),this.empresaespecialAux);
				
				this.empresaespecialLogic.getEmpresaEspecials().add(this.empresaespecialAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpresaEspecialConstantesFunciones.TotalizarValoresFilaEmpresaEspecial(this.empresaespecials,this.empresaespecialAux);
				
				this.empresaespecials.add(this.empresaespecialAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empresaespecialTotales=new EmpresaEspecial();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empresaespecialLogic.getEmpresaEspecials().remove(empresaespecialTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empresaespecials.remove(empresaespecialTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empresaespecialTotales=new EmpresaEspecial();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpresaEspecial empresaespecial:empresaespecialLogic.getEmpresaEspecials()) {
				if(empresaespecial.getsType().equals(Constantes2.S_TOTALES)) {
					empresaespecialTotales=empresaespecial;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpresaEspecialConstantesFunciones.TotalizarValoresFilaEmpresaEspecial(this.empresaespecialLogic.getEmpresaEspecials(),empresaespecialTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpresaEspecial empresaespecial:this.empresaespecials) {
				if(empresaespecial.getsType().equals(Constantes2.S_TOTALES)) {
					empresaespecialTotales=empresaespecial;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpresaEspecialConstantesFunciones.TotalizarValoresFilaEmpresaEspecial(this.empresaespecials,empresaespecialTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEmpresaEspecial() {
		this.isPermisoTodoEmpresaEspecial=false;
		this.isPermisoNuevoEmpresaEspecial=false;
		this.isPermisoActualizarEmpresaEspecial=false;
		this.isPermisoActualizarOriginalEmpresaEspecial=false;
		this.isPermisoEliminarEmpresaEspecial=false;
		this.isPermisoGuardarCambiosEmpresaEspecial=false;
		this.isPermisoConsultaEmpresaEspecial=false;
		this.isPermisoBusquedaEmpresaEspecial=false;
		this.isPermisoReporteEmpresaEspecial=false;		
		this.isPermisoOrdenEmpresaEspecial=false;		
		this.isPermisoPaginacionMedioEmpresaEspecial=false;		
		this.isPermisoPaginacionAltoEmpresaEspecial=false;
		this.isPermisoPaginacionTodoEmpresaEspecial=false;
		this.isPermisoCopiarEmpresaEspecial=false;		
		this.isPermisoVerFormEmpresaEspecial=false;		
		this.isPermisoDuplicarEmpresaEspecial=false;		
		this.isPermisoOrdenEmpresaEspecial=false;		
	}
	
	public void setPermisosUsuarioEmpresaEspecial(Boolean isPermiso) {
		this.isPermisoTodoEmpresaEspecial=isPermiso;
		this.isPermisoNuevoEmpresaEspecial=isPermiso;
		this.isPermisoActualizarEmpresaEspecial=isPermiso;
		this.isPermisoActualizarOriginalEmpresaEspecial=isPermiso;
		this.isPermisoEliminarEmpresaEspecial=isPermiso;
		this.isPermisoGuardarCambiosEmpresaEspecial=isPermiso;
		this.isPermisoConsultaEmpresaEspecial=isPermiso;
		this.isPermisoBusquedaEmpresaEspecial=isPermiso;
		this.isPermisoReporteEmpresaEspecial=isPermiso;
		this.isPermisoOrdenEmpresaEspecial=isPermiso;		
		this.isPermisoPaginacionMedioEmpresaEspecial=isPermiso;		
		this.isPermisoPaginacionAltoEmpresaEspecial=isPermiso;		
		this.isPermisoPaginacionTodoEmpresaEspecial=isPermiso;		
		this.isPermisoCopiarEmpresaEspecial=isPermiso;		
		this.isPermisoVerFormEmpresaEspecial=isPermiso;		
		this.isPermisoDuplicarEmpresaEspecial=isPermiso;
		this.isPermisoOrdenEmpresaEspecial=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpresaEspecial(Boolean isPermiso) {
		//this.isPermisoTodoEmpresaEspecial=isPermiso;
		this.isPermisoNuevoEmpresaEspecial=isPermiso;
		this.isPermisoActualizarEmpresaEspecial=isPermiso;
		this.isPermisoActualizarOriginalEmpresaEspecial=isPermiso;
		this.isPermisoEliminarEmpresaEspecial=isPermiso;
		this.isPermisoGuardarCambiosEmpresaEspecial=isPermiso;
		//this.isPermisoConsultaEmpresaEspecial=isPermiso;
		//this.isPermisoBusquedaEmpresaEspecial=isPermiso;
		//this.isPermisoReporteEmpresaEspecial=isPermiso;
		//this.isPermisoOrdenEmpresaEspecial=isPermiso;		
		//this.isPermisoPaginacionMedioEmpresaEspecial=isPermiso;		
		//this.isPermisoPaginacionAltoEmpresaEspecial=isPermiso;		
		//this.isPermisoPaginacionTodoEmpresaEspecial=isPermiso;		
		//this.isPermisoCopiarEmpresaEspecial=isPermiso;		
		//this.isPermisoDuplicarEmpresaEspecial=isPermiso;
		//this.isPermisoOrdenEmpresaEspecial=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpresaEspecialClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpresaEspecialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpresaEspecial(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpresaEspecialClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpresaEspecialClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpresaEspecialClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpresaEspecialClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpresaEspecial() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpresaEspecialJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpresaEspecialConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpresaEspecial=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpresaEspecial=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpresaEspecial=this.isPermisoActualizarEmpresaEspecial;
			this.isPermisoEliminarEmpresaEspecial=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpresaEspecial=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpresaEspecial=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpresaEspecial=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpresaEspecial=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpresaEspecial=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpresaEspecial=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpresaEspecial=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpresaEspecial=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpresaEspecial=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpresaEspecial=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpresaEspecial=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpresaEspecial=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpresaEspecial=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpresaEspecial.setToolTipText(this.jTableDatosEmpresaEspecial.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpresaEspecial(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpresaEspecial(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpresaEspecialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpresaEspecialJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpresaEspecial() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEmpresaEspecialListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpresaEspecialListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpresaEspecialJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpresaEspecialListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEmpresaEspecialListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpresaEspecial()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEmpresaEspecial()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpresaEspecial(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpresaEspecial()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.empresaespecial.setfecha_resolucion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpresaEspecial();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpresaEspecial(EmpresaEspecial empresaespecial)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpresaEspecial(EmpresaEspecial empresaespecial,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpresaEspecial()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpresaEspecial()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpresaEspecial()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpresaEspecial()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpresaEspecial()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpresaEspecial()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpresaEspecial(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpresaEspecial()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EmpresaEspecialBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpresaEspecialBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpresaEspecialBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empresaespecialSessionBean=new EmpresaEspecialSessionBean(); 
		this.empresaespecialConstantesFunciones=new EmpresaEspecialConstantesFunciones(); 
		this.empresaespecialBean=new EmpresaEspecial();//(this.empresaespecialConstantesFunciones); 		
		this.empresaespecialReturnGeneral=new EmpresaEspecialParameterReturnGeneral(); 
		
		this.empresaespecialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empresaespecialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpresaEspecialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpresaEspecialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpresaEspecialBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpresaEspecial(true);
			
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
			
			this.empresaespecialConstantesFunciones=new EmpresaEspecialConstantesFunciones(); 
			this.empresaespecialBean=new EmpresaEspecial();//this.empresaespecialConstantesFunciones); 			
			this.empresaespecialReturnGeneral=new EmpresaEspecialParameterReturnGeneral(); 
		
			EmpresaEspecialBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empresa Especial Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.empresaespecial=new EmpresaEspecial();
			this.empresaespecials = new ArrayList<EmpresaEspecial>();
			this.empresaespecialsAux = new ArrayList<EmpresaEspecial>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic=new EmpresaEspecialLogic();
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			//this.empresaespecialSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empresaespecialSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpresaEspecial);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpresaEspecial);	
					}
					
					if(this.jInternalFrameImportacionEmpresaEspecial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpresaEspecial);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpresaEspecial!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpresaEspecial);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpresaEspecial);
				this.jInternalFrameDetalleFormEmpresaEspecial.setVisible(false);
				this.jInternalFrameDetalleFormEmpresaEspecial.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpresaEspecial);
					this.jInternalFrameReporteDinamicoEmpresaEspecial.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpresaEspecial.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpresaEspecial!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpresaEspecial);
					this.jInternalFrameImportacionEmpresaEspecial.setVisible(false);
					this.jInternalFrameImportacionEmpresaEspecial.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpresaEspecial!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpresaEspecial);
					this.jInternalFrameOrderByEmpresaEspecial.setVisible(false);
					this.jInternalFrameOrderByEmpresaEspecial.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpresaEspecialActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpresaEspecialConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empresaespecialReturnGeneral=new EmpresaEspecialParameterReturnGeneral();
			
			this.empresaespecialParameterGeneral=new EmpresaEspecialParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empresaespecialLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpresaEspecialJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpresaEspecialConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empresaespecialSessionBean.getEsGuardarRelacionado(),this.empresaespecialSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpresaEspecialConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empresaespecialSessionBean.getEsGuardarRelacionado(),this.empresaespecialSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpresaEspecial=false;
			this.isVisibilidadCeldaDuplicarEmpresaEspecial=true;
			this.isVisibilidadCeldaCopiarEmpresaEspecial=true;
			this.isVisibilidadCeldaVerFormEmpresaEspecial=true;
			this.isVisibilidadCeldaOrdenEmpresaEspecial=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
			this.isVisibilidadCeldaModificarEmpresaEspecial=false;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=false;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpresaEspecial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpresaEspecial();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpresaEspecial(false);
			
			this.setPermisosUsuarioEmpresaEspecial();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empresaespecialSessionBean.getEsGuardarRelacionado() 
				|| (this.empresaespecialSessionBean.getEsGuardarRelacionado() && this.empresaespecialSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpresaEspecialClasesRelacionadas();
			}
			
			if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpresaEspecialClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpresaEspecial();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpresaEspecial();
			}
			
			if(!this.isPermisoBusquedaEmpresaEspecial) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpresaEspecial,this.isPermisoPaginacionMedioEmpresaEspecial,this.isPermisoPaginacionTodoEmpresaEspecial);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpresaEspecialConstantesFunciones.getTiposSeleccionarEmpresaEspecial());
				
				this.tiposColumnasSelect=EmpresaEspecialConstantesFunciones.getTiposSeleccionarEmpresaEspecial(true);
				
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
			//if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpresaEspecial();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEmpresaEspecial(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEmpresaEspecial(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpresaEspecial() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empresaespecialImplementable= (EmpresaEspecialImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpresaEspecialConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empresaespecialImplementableHome= (EmpresaEspecialImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpresaEspecialConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empresaespecials= new ArrayList<EmpresaEspecial>();
			this.empresaespecialsEliminados= new ArrayList<EmpresaEspecial>();
						
			this.isEsNuevoEmpresaEspecial=false;
			this.esParaAccionDesdeFormularioEmpresaEspecial=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpresaEspecial(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpresaEspecial();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpresaEspecialBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpresaEspecialConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpresaEspecial("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpresaEspecial(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpresaEspecial();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpresaEspecial();
			}
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpresaEspecial(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpresaEspecial: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpresaEspecial() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpresaEspecial")) {
				iIndex=this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpresaEspecial();	
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
	
	public void cargarCombosForeignKeyEmpresaEspecial(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpresaEspecial(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpresaEspecial(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpresaEspecialListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpresaEspecial();
		
		this.cargarCombosFrameForeignKeyEmpresaEspecial();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpresaEspecial();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpresaEspecial();
		}
	}
	
	
	
	public void jButtonNuevoEmpresaEspecialActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
			
			if(jTableDatosEmpresaEspecial.getRowCount()>=1) {
				jTableDatosEmpresaEspecial.removeRowSelectionInterval(0, jTableDatosEmpresaEspecial.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpresaEspecial=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpresaEspecial(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpresaEspecial(true);			
			//this.empresaespecial=new EmpresaEspecial();
			//this.empresaespecial.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpresaEspecial(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresaEspecial() ;
			
			if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpresaEspecial(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empresaespecial);	
			this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);				
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
			if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpresaEspecial: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpresaEspecialActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpresaEspecial.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpresaEspecial.getSelectedRows().length;			
			}
			
			empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpresaEspecial--;			
				//EmpresaEspecial empresaespecialAux= new EmpresaEspecial();			
				//empresaespecialAux.setId(this.iIdNuevoEmpresaEspecial);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpresaEspecial empresaespecialOrigen=new EmpresaEspecial();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpresaEspecial empresaespecialOrigen : empresaespecialsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empresaespecialOrigen =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empresaespecialOrigen =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpresaEspecial();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empresaespecial.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpresaEspecial(empresaespecialOrigen,this.empresaespecial,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empresaespecialLogic.getEmpresaEspecials().add(this.empresaespecialAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empresaespecials.add(this.empresaespecialAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpresaEspecial(false);
				
				this.jTableDatosEmpresaEspecial.setRowSelectionInterval(this.getIndiceNuevoEmpresaEspecial(), this.getIndiceNuevoEmpresaEspecial());
				
				int iLastRow =  this.jTableDatosEmpresaEspecial.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpresaEspecial.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpresaEspecial.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpresaEspecial(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();									
		
			EmpresaEspecial empresaespecialOrigen=new EmpresaEspecial();
			EmpresaEspecial empresaespecialDestino=new EmpresaEspecial();
				
			empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpresaEspecial.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empresaespecialsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpresaEspecial.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaespecialOrigen =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empresaespecialOrigen =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empresaespecialDestino =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empresaespecialDestino =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empresaespecialOrigen =empresaespecialsSeleccionados.get(0);
				empresaespecialDestino =empresaespecialsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpresaEspecial(empresaespecialOrigen,empresaespecialDestino,true,false);
				
				empresaespecialDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empresaespecialDestino,empresaespecialLogic.getEmpresaEspecials());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empresaespecialDestino,empresaespecials);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpresaEspecial(false);
				
				//this.jTableDatosEmpresaEspecial.setRowSelectionInterval(this.getIndiceNuevoEmpresaEspecial(), this.getIndiceNuevoEmpresaEspecial());
				
				int iLastRow =  this.jTableDatosEmpresaEspecial.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpresaEspecial.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpresaEspecial.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpresaEspecial(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpresaEspecial.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpresaEspecial.isVisible();
			
			
			this.jPanelParametrosReportesEmpresaEspecial.setVisible(!isVisible);
			this.jPanelPaginacionEmpresaEspecial.setVisible(!isVisible);
			this.jPanelAccionesEmpresaEspecial.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpresaEspecial();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpresaEspecial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpresaEspecial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpresaEspecial();
			
			this.abrirFrameOrderByEmpresaEspecial();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpresaEspecial();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpresaEspecial(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpresaEspecial);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpresaEspecial.isMaximum()) {
					this.jInternalFrameDetalleFormEmpresaEspecial.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpresaEspecial.setSize(this.jInternalFrameDetalleFormEmpresaEspecial.iWidthFormulario,this.jInternalFrameDetalleFormEmpresaEspecial.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpresaEspecial.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpresaEspecial.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpresaEspecial.isMaximum()) {
						this.jInternalFrameDetalleFormEmpresaEspecial.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpresaEspecial.jContentPaneDetalleEmpresaEspecial.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpresaEspecial.jContentPaneDetalleEmpresaEspecial.getWidth(),EmpresaEspecialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpresaEspecial.jContentPaneDetalleEmpresaEspecial.getWidth(),EmpresaEspecialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpresaEspecial.jContentPaneDetalleEmpresaEspecial.getWidth(),EmpresaEspecialConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpresaEspecial.setVisible(true);
	        this.jInternalFrameDetalleFormEmpresaEspecial.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpresaEspecial() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpresaEspecial==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpresaEspecial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresaEspecial,false,this);
				} else {
					this.jInternalFrameOrderByEmpresaEspecial=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpresaEspecial,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpresaEspecial);
				this.jInternalFrameOrderByEmpresaEspecial.setVisible(false);
				this.jInternalFrameOrderByEmpresaEspecial.setSelected(false);
				
				this.jInternalFrameOrderByEmpresaEspecial.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpresaEspecial"));
				
				this.inicializarActualizarBindingTablaOrderByEmpresaEspecial();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpresaEspecial() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpresaEspecial==null) {
				
				this.jInternalFrameImportacionEmpresaEspecial=new ImportacionJInternalFrame(EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpresaEspecial);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpresaEspecial);
				this.jInternalFrameImportacionEmpresaEspecial.setVisible(false);
				this.jInternalFrameImportacionEmpresaEspecial.setSelected(false);


				this.jInternalFrameImportacionEmpresaEspecial.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpresaEspecial"));
				this.jInternalFrameImportacionEmpresaEspecial.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpresaEspecial"));
				this.jInternalFrameImportacionEmpresaEspecial.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpresaEspecial"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpresaEspecial() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpresaEspecial==null) {
				this.jInternalFrameReporteDinamicoEmpresaEspecial=new ReporteDinamicoJInternalFrame(EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpresaEspecial);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpresaEspecial);
				this.jInternalFrameReporteDinamicoEmpresaEspecial.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpresaEspecial.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpresaEspecial"));
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpresaEspecial"));
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpresaEspecial"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpresaEspecial();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpresaEspecial() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpresaEspecial);
			
	       	this.jInternalFrameDetalleFormEmpresaEspecial.setVisible(false);
	        this.jInternalFrameDetalleFormEmpresaEspecial.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpresaEspecial.dispose();
			//this.jInternalFrameDetalleFormEmpresaEspecial=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpresaEspecial() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpresaEspecial.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpresaEspecial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpresaEspecial() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpresaEspecial.setVisible(true);
	        this.jInternalFrameImportacionEmpresaEspecial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpresaEspecial() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpresaEspecial.setVisible(true);
	        this.jInternalFrameOrderByEmpresaEspecial.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpresaEspecial() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpresaEspecial.setVisible(false);
	        this.jInternalFrameOrderByEmpresaEspecial.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpresaEspecial() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpresaEspecial.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpresaEspecial.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpresaEspecial() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpresaEspecial.setVisible(false);
	        this.jInternalFrameImportacionEmpresaEspecial.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpresaEspecial(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpresaEspecial(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpresaEspecial(true);
			//this.isEsNuevoEmpresaEspecial=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpresaEspecial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpresaEspecial(false) ;
			
			if(empresaespecialSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpresaEspecial(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresaEspecial(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpresaEspecialActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpresaEspecial(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpresaEspecial(true);
			//this.isEsNuevoEmpresaEspecial=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empresaespecial.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpresaEspecial("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpresaEspecial(false) ;
			
			if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpresaEspecial(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresaEspecial(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpresaEspecial(false);
			
			//if(!this.isEsNuevoEmpresaEspecial) {								
				int intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
				
			}
			
			if(this.permiteMantenimiento(this.empresaespecial)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpresaEspecial=true;
					this.inicializarActualizarBindingTablaEmpresaEspecial(false);
					this.isEsNuevoEmpresaEspecial=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpresaEspecial=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpresaEspecial=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpresaEspecial(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpresaEspecial(false);
				
				this.habilitarDeshabilitarControlesEmpresaEspecial(false);
			
												
				
				if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpresaEspecial();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpresaEspecialActionPerformed(evt,empresaespecialSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpresaEspecial(this.empresaespecial,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpresaEspecial.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empresaespecialSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empresaespecial.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				this.empresaespecial.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				this.empresaespecial.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empresaespecial)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpresaEspecialModel) this.jTableDatosEmpresaEspecial.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpresaEspecial=true;
				this.inicializarActualizarBindingTablaEmpresaEspecial(false);
				this.isEsNuevoEmpresaEspecial=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpresaEspecial(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpresaEspecial(false);
				
				this.habilitarDeshabilitarControlesEmpresaEspecial(false);
				
				
				
				if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpresaEspecial();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpresaEspecial.getRowCount()>=1) {
				jTableDatosEmpresaEspecial.removeRowSelectionInterval(0, jTableDatosEmpresaEspecial.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpresaEspecial(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpresaEspecial(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpresaEspecial(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpresaEspecial(false) ;
			
			this.isEsNuevoEmpresaEspecial=false;
			
			if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpresaEspecial();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpresaEspecial(false);
				
				//SI ES MANUAL
				if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpresaEspecial();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpresaEspecial--;			
			//EmpresaEspecial empresaespecialAux= new EmpresaEspecial();			
			//empresaespecialAux.setId(this.iIdNuevoEmpresaEspecial);
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpresaEspecial();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
			
			this.empresaespecial.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empresaespecialLogic.getEmpresaEspecials().add(this.empresaespecialAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empresaespecials.add(this.empresaespecialAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpresaEspecial(false);
			
			this.jTableDatosEmpresaEspecial.setRowSelectionInterval(this.getIndiceNuevoEmpresaEspecial(), this.getIndiceNuevoEmpresaEspecial());
			
			int iLastRow =  this.jTableDatosEmpresaEspecial.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpresaEspecial.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpresaEspecial.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpresaEspecial(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpresaEspecial(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresaEspecial(false);
			
			//SI ES MANUAL
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpresaEspecial();
			}
			
			//this.abrirFrameTreeEmpresaEspecial();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empresa EspecialES ?", "MANTENIMIENTO DE Empresa Especial", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpresaEspecial.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpresaEspecial();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empresaespecialReturnGeneral=empresaespecialLogic.procesarImportacionEmpresaEspecialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empresaespecialParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpresaEspecialReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpresaEspecial.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpresaEspecial.setFileImportacion(this.jInternalFrameImportacionEmpresaEspecial.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpresaEspecial.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpresaEspecial.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpresaEspecial.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpresaEspecial.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		

		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpresaEspecialBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpresaEspecialBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpresaEspecials("Todos",empresaespecialsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroResolucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroResolucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroResolucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroResolucion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaResolucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaResolucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaResolucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaResolucion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmpresaEspecial.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION:
					sNombreCampoCategoria="numero_resolucion";
					break;

				case EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION:
					sNombreCampoCategoria="fecha_resolucion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION:
					sNombreCampoCategoriaValor="numero_resolucion";
					break;

				case EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION:
					sNombreCampoCategoriaValor="fecha_resolucion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Resolucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_resolucion");
					break;

				case EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Resolucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_resolucion");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresaespecial";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpresaEspecials");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION);
					iRow++;

					for(EmpresaEspecial empresaespecial:empresaespecialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresaespecial.getnumero_resolucion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION);
					iRow++;

					for(EmpresaEspecial empresaespecial:empresaespecialsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empresaespecial.getfecha_resolucion());
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
			//	this.getFilaCabeceraExportarExcelEmpresaEspecial(row);				
			//	iRow++;
			//}				
			
			//for(EmpresaEspecial empresaespecialAux:empresaespecialsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpresaEspecial(empresaespecialAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
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
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresaEspecial(false);
			
			//SI ES MANUAL
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpresaEspecial();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresaEspecial(false);
			
			//SI ES MANUAL
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpresaEspecial();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpresaEspecialActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpresaEspecial(false);
			
			//SI ES MANUAL
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpresaEspecial();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empresaespecialLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpresaEspecial() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpresaEspecial.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpresaEspecial.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpresaEspecial.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpresaEspecial.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpresaEspecial.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpresaEspecial.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpresaEspecial.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpresaEspecial(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpresaEspecial(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpresaEspecial(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpresaEspecial(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpresaEspecial(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpresaEspecial(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpresaEspecial(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpresaEspecial(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpresaEspecial() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpresaEspecial();
		
		this.inicializarActualizarBindingBotonesManualEmpresaEspecial(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpresaEspecial();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpresaEspecial() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpresaEspecial(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpresaEspecial(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpresaEspecial.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpresaEspecial.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpresaEspecial.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpresaEspecial.jCheckBoxPostAccionNuevoEmpresaEspecial.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpresaEspecial.jCheckBoxPostAccionSinCerrarEmpresaEspecial.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpresaEspecial.jCheckBoxPostAccionSinMensajeEmpresaEspecial.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpresaEspecial.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpresaEspecial.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpresaEspecial.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
				this.jInternalFrameDetalleFormEmpresaEspecial.jCheckBoxPostAccionNuevoEmpresaEspecial.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpresaEspecial.jCheckBoxPostAccionSinCerrarEmpresaEspecial.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpresaEspecial.jCheckBoxPostAccionSinMensajeEmpresaEspecial.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpresaEspecial.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpresaEspecial.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpresaEspecial.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpresaEspecial.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpresaEspecial.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpresaEspecial.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpresaEspecial.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpresaEspecial.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpresaEspecial.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpresaEspecial(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpresaEspecial(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpresaEspecial() throws Exception {
		try	{
			if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpresaEspecial();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpresaEspecial() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpresaEspecial() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpresaEspecial.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpresaEspecial.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpresaEspecial.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpresaEspecial.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpresaEspecial.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpresaEspecial.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpresaEspecial.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpresaEspecial.addItem(reporte);
			}
			
			
			if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpresaEspecial.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpresaEspecial.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpresaEspecial.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpresaEspecial.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpresaEspecial.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpresaEspecial.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpresaEspecial.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpresaEspecial.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpresaEspecial.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpresaEspecial();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpresaEspecial() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpresaEspecial.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpresaEspecial.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpresaEspecial()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpresaEspecial(Boolean esInicializar) throws Exception {				
		if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpresaEspecial();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpresaEspecial() throws Exception {
		this.inicializarActualizarBindingTablaEmpresaEspecial(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpresaEspecial() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpresaEspecialPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpresaEspecialPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpresaEspecialOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresaEspecialOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpresaEspecialPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpresaEspecialPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpresaEspecial(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empresaespecialLogic.getEmpresaEspecials().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empresaespecials.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpresaEspecial.setModel(new EmpresaEspecialModel(this.empresaespecialLogic.getEmpresaEspecials(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpresaEspecial.setModel(new EmpresaEspecialModel(this.empresaespecials,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpresaEspecial!=null && this.jInternalFrameOrderByEmpresaEspecial.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpresaEspecial();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpresaEspecial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresaEspecial,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpresaEspecialPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO,empresaespecialConstantesFunciones.resaltarSeleccionarEmpresaEspecial,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpresaEspecialConstantesFunciones.SCLASSWEBTITULO,empresaespecialConstantesFunciones.resaltarSeleccionarEmpresaEspecial,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpresaEspecial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresaEspecial,EmpresaEspecialConstantesFunciones.LABEL_ID));

		if(this.empresaespecialConstantesFunciones.mostraridEmpresaEspecial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaEspecialConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empresaespecialConstantesFunciones.resaltaridEmpresaEspecial,this.empresaespecialConstantesFunciones.activaridEmpresaEspecial,this,true,"idEmpresaEspecial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaespecialConstantesFunciones.resaltaridEmpresaEspecial,this.empresaespecialConstantesFunciones.activaridEmpresaEspecial,this,true,"idEmpresaEspecial","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresaEspecial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresaEspecial,EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION));

		if(this.empresaespecialConstantesFunciones.mostrarnumero_resolucionEmpresaEspecial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empresaespecialConstantesFunciones.resaltarnumero_resolucionEmpresaEspecial,this.empresaespecialConstantesFunciones.activarnumero_resolucionEmpresaEspecial,this,true,"numero_resolucionEmpresaEspecial","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empresaespecialConstantesFunciones.resaltarnumero_resolucionEmpresaEspecial,this.empresaespecialConstantesFunciones.activarnumero_resolucionEmpresaEspecial,this,true,"numero_resolucionEmpresaEspecial","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpresaEspecialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpresaEspecial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpresaEspecial,EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION));

		if(this.empresaespecialConstantesFunciones.mostrarfecha_resolucionEmpresaEspecial && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empresaespecialConstantesFunciones.resaltarfecha_resolucionEmpresaEspecial,this.empresaespecialConstantesFunciones.activarfecha_resolucionEmpresaEspecial,this,true,"fecha_resolucionEmpresaEspecial","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empresaespecialConstantesFunciones.resaltarfecha_resolucionEmpresaEspecial,this.empresaespecialConstantesFunciones.activarfecha_resolucionEmpresaEspecial,this,true,"fecha_resolucionEmpresaEspecial","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpresaEspecialPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empresaespecialSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empresaespecialSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpresaEspecial.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empresaespecialSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empresaespecialSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpresaEspecial.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empresaespecialSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empresaespecialSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpresaEspecial.addColumn(tableColumn);
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
			
			this.jTableDatosEmpresaEspecial.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpresaEspecial.moveColumn(this.jTableDatosEmpresaEspecial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpresaEspecial.moveColumn(this.jTableDatosEmpresaEspecial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpresaEspecial.moveColumn(this.jTableDatosEmpresaEspecial.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpresaEspecial.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpresaEspecial.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpresaEspecial,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpresaEspecial.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpresaEspecial.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpresaEspecial.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpresaEspecial.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpresaEspecial.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empresaespecialLogic.getEmpresaEspecials().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empresaespecials.size()-1;
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
		//this.jTableDatosEmpresaEspecial.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpresaEspecial.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpresaEspecial();
			
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
				
				//this.isEsNuevoEmpresaEspecial=false;
					
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
				if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpresaEspecial==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpresaEspecial.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpresaEspecial.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empresaespecial.getsType().equals("DUPLICADO")
				   || this.empresaespecial.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpresaEspecial=true;
				
				} else {
					this.isEsNuevoEmpresaEspecial=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
					if(this.empresaespecial.getId()>=0 && !this.empresaespecial.getIsNew()) {						
						this.isEsNuevoEmpresaEspecial=false;
						
					} else {
						this.isEsNuevoEmpresaEspecial=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpresaEspecial(esRelaciones);						
				
				this.seleccionarEmpresaEspecial(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empresaespecial.getId()<0) {
					this.isEsNuevoEmpresaEspecial=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpresaEspecial(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpresaEspecial(evt,rowIndex);
				}	
				
				if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpresaEspecial: " + this.dDif); 
					}
				}								
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpresaEspecial(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empresaespecial)) {
					if(this.empresaespecial.getId()>0) {
						this.empresaespecial.setIsDeleted(true);
						
						this.empresaespecialsEliminados.add(this.empresaespecial);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empresaespecialLogic.getEmpresaEspecials().remove(this.empresaespecial);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empresaespecials.remove(this.empresaespecial);				
					}
					
					
					((EmpresaEspecialModel) this.jTableDatosEmpresaEspecial.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpresaEspecial(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpresaEspecial(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpresaEspecial) {
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpresaEspecial.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpresaEspecial.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpresaEspecial(this.empresaespecial);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpresaEspecial("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpresaEspecial(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpresaEspecial() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpresaEspecial(EmpresaEspecial empresaespecial) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpresaEspecial(empresaespecial,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpresaEspecial(EmpresaEspecial empresaespecial,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpresaEspecial(empresaespecial);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpresaEspecial(empresaespecial,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpresaEspecial(empresaespecial);
	}
	
	public void setVariablesObjetoActualToFormularioEmpresaEspecial(EmpresaEspecial empresaespecial) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.setText(empresaespecial.getId().toString());
			this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.setText(empresaespecial.getnumero_resolucion());
			this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.setDate(empresaespecial.getfecha_resolucion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpresaEspecial empresaespecialLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empresaespecialLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpresaEspecial empresaespecialLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empresaespecialLocal=this.empresaespecial;
			} else {
				empresaespecialLocal=this.empresaespecialAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empresaespecialLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpresaEspecial(empresaespecialLocal,true);
					
					if(empresaespecialSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empresaespecialLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empresaespecialLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpresaEspecial(EmpresaEspecial empresaespecial,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpresaEspecial(empresaespecial,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(empresaespecial);
	}
	
	public void setVariablesFormularioToObjetoActualEmpresaEspecial(EmpresaEspecial empresaespecial,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpresaEspecial(empresaespecial,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpresaEspecial(EmpresaEspecial empresaespecial,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.getText()==null || this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.getText()=="" || this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.setText("0");
			}

			if(conColumnasBase) {empresaespecial.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaEspecialConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresaEspecial.jLabelIdEmpresaEspecial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresaespecial.setnumero_resolucion(this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresaEspecial.jLabelnumero_resolucionEmpresaEspecial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empresaespecial.setfecha_resolucion(this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpresaEspecial.jLabelfecha_resolucionEmpresaEspecial,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpresaEspecial(EmpresaEspecial empresaespecialBean,EmpresaEspecial empresaespecial,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpresaEspecial(EmpresaEspecial empresaespecialOrigen,EmpresaEspecial empresaespecial,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empresaespecialOrigen.getId()!=null && !empresaespecialOrigen.getId().equals(0L))) {empresaespecial.setId(empresaespecialOrigen.getId());}}
			if(conDefault || (!conDefault && empresaespecialOrigen.getnumero_resolucion()!=null && !empresaespecialOrigen.getnumero_resolucion().equals(""))) {empresaespecial.setnumero_resolucion(empresaespecialOrigen.getnumero_resolucion());}
			if(conDefault || (!conDefault && empresaespecialOrigen.getfecha_resolucion()!=null && !empresaespecialOrigen.getfecha_resolucion().equals(new Date()))) {empresaespecial.setfecha_resolucion(empresaespecialOrigen.getfecha_resolucion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpresaEspecial(EmpresaEspecial empresaespecial) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.setText(empresaespecial.getId().toString());
			this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.setText(empresaespecial.getnumero_resolucion());
			this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.setDate(empresaespecial.getfecha_resolucion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpresaEspecial(EmpresaEspecialBean empresaespecialBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.setText(empresaespecialBean.getId().toString());
			this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.setText(empresaespecialBean.getnumero_resolucion());
			this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.setDate(empresaespecialBean.getfecha_resolucion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpresaEspecial(EmpresaEspecialParameterReturnGeneral empresaespecialReturnGeneral,EmpresaEspecialBean empresaespecialBean,Boolean conDefault) throws Exception { 
		try {
			EmpresaEspecial empresaespecialLocal=new EmpresaEspecial();
			
			empresaespecialLocal=empresaespecialReturnGeneral.getEmpresaEspecial();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empresaespecialLocal.getId()!=null && !empresaespecialLocal.getId().equals(0L))) {empresaespecialBean.setId(empresaespecialLocal.getId());}}
			if(conDefault || (!conDefault && empresaespecialLocal.getnumero_resolucion()!=null && !empresaespecialLocal.getnumero_resolucion().equals(""))) {empresaespecialBean.setnumero_resolucion(empresaespecialLocal.getnumero_resolucion());}
			if(conDefault || (!conDefault && empresaespecialLocal.getfecha_resolucion()!=null && !empresaespecialLocal.getfecha_resolucion().equals(new Date()))) {empresaespecialBean.setfecha_resolucion(empresaespecialLocal.getfecha_resolucion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpresaEspecialGenerico(Long idEmpresaEspecialSeleccionado,JComboBox jComboBoxEmpresaEspecial,List<EmpresaEspecial> empresaespecialsLocal)throws Exception {
		try {
			EmpresaEspecial  empresaespecialTemp=null;

			for(EmpresaEspecial empresaespecialAux:empresaespecialsLocal) {
				if(empresaespecialAux.getId()!=null && empresaespecialAux.getId().equals(idEmpresaEspecialSeleccionado)) {
					empresaespecialTemp=empresaespecialAux;
					break;
				}
			}

			jComboBoxEmpresaEspecial.setSelectedItem(empresaespecialTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpresaEspecialGenerico(JComboBox jComboBoxEmpresaEspecial,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpresaEspecial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpresaEspecial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpresaEspecial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpresaEspecial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpresaEspecial.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpresaEspecial.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpresaEspecial.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpresaEspecial.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpresaEspecial.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpresaEspecial.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empresaespecial=(EmpresaEspecial) empresaespecialLogic.getEmpresaEspecials().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empresaespecial =(EmpresaEspecial) empresaespecials.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpresaEspecial empresaespecialRow=new EmpresaEspecial();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empresaespecialRow=(EmpresaEspecial) empresaespecialLogic.getEmpresaEspecials().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empresaespecialRow=(EmpresaEspecial) empresaespecials.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpresaEspecial(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial));			
			this.jButtonDuplicarEmpresaEspecial.setVisible((this.isVisibilidadCeldaDuplicarEmpresaEspecial && this.isPermisoDuplicarEmpresaEspecial));			
			this.jButtonCopiarEmpresaEspecial.setVisible((this.isVisibilidadCeldaCopiarEmpresaEspecial && this.isPermisoCopiarEmpresaEspecial));
			this.jButtonVerFormEmpresaEspecial.setVisible((this.isVisibilidadCeldaVerFormEmpresaEspecial && this.isPermisoVerFormEmpresaEspecial));
			
			this.jButtonAbrirOrderByEmpresaEspecial.setVisible((this.isVisibilidadCeldaOrdenEmpresaEspecial && this.isPermisoOrdenEmpresaEspecial));			
			
			this.jButtonNuevoRelacionesEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial));			
			this.jButtonNuevoGuardarCambiosEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarEmpresaEspecial.setVisible((this.isVisibilidadCeldaModificarEmpresaEspecial && this.isPermisoActualizarEmpresaEspecial));	
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarEmpresaEspecial.setVisible((this.isVisibilidadCeldaActualizarEmpresaEspecial && this.isPermisoActualizarEmpresaEspecial));	
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarEmpresaEspecial.setVisible((this.isVisibilidadCeldaEliminarEmpresaEspecial && this.isPermisoEliminarEmpresaEspecial));
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarEmpresaEspecial.setVisible(this.isVisibilidadCeldaCancelarEmpresaEspecial);							
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.setVisible((this.isVisibilidadCeldaGuardarEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpresaEspecial.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial));						
			this.jButtonDuplicarToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaDuplicarEmpresaEspecial && this.isPermisoDuplicarEmpresaEspecial));						
			this.jButtonCopiarToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaCopiarEmpresaEspecial && this.isPermisoCopiarEmpresaEspecial));			
			this.jButtonVerFormToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaVerFormEmpresaEspecial && this.isPermisoVerFormEmpresaEspecial));			
			this.jButtonAbrirOrderByToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaOrdenEmpresaEspecial && this.isPermisoOrdenEmpresaEspecial));
			this.jButtonNuevoRelacionesToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial));			
			this.jButtonNuevoGuardarCambiosToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));			
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaModificarEmpresaEspecial && this.isPermisoActualizarEmpresaEspecial));	
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaActualizarEmpresaEspecial  && this.isPermisoActualizarEmpresaEspecial));	
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaEliminarEmpresaEspecial && this.isPermisoEliminarEmpresaEspecial));
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarToolBarEmpresaEspecial.setVisible(this.isVisibilidadCeldaCancelarEmpresaEspecial);				
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaGuardarEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpresaEspecial.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial));			
			this.jMenuItemDuplicarEmpresaEspecial.setVisible((this.isVisibilidadCeldaDuplicarEmpresaEspecial && this.isPermisoDuplicarEmpresaEspecial));			
			this.jMenuItemCopiarEmpresaEspecial.setVisible((this.isVisibilidadCeldaCopiarEmpresaEspecial && this.isPermisoCopiarEmpresaEspecial));			
			this.jMenuItemVerFormEmpresaEspecial.setVisible((this.isVisibilidadCeldaVerFormEmpresaEspecial && this.isPermisoVerFormEmpresaEspecial));			
			this.jMenuItemAbrirOrderByEmpresaEspecial.setVisible((this.isVisibilidadCeldaOrdenEmpresaEspecial && this.isPermisoOrdenEmpresaEspecial));			
			//this.jMenuItemMostrarOcultarEmpresaEspecial.setVisible((this.isVisibilidadCeldaOrdenEmpresaEspecial && this.isPermisoOrdenEmpresaEspecial));
			this.jMenuItemDetalleAbrirOrderByEmpresaEspecial.setVisible((this.isVisibilidadCeldaOrdenEmpresaEspecial && this.isPermisoOrdenEmpresaEspecial));			
			//this.jMenuItemDetalleMostrarOcultarEmpresaEspecial.setVisible((this.isVisibilidadCeldaOrdenEmpresaEspecial && this.isPermisoOrdenEmpresaEspecial));			
			this.jMenuItemNuevoRelacionesEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial));			
			this.jMenuItemNuevoGuardarCambiosEmpresaEspecial.setVisible((this.isVisibilidadCeldaNuevoEmpresaEspecial && this.isPermisoNuevoEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));									
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemModificarEmpresaEspecial.setVisible((this.isVisibilidadCeldaModificarEmpresaEspecial && this.isPermisoActualizarEmpresaEspecial));	
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemActualizarEmpresaEspecial.setVisible((this.isVisibilidadCeldaActualizarEmpresaEspecial && this.isPermisoActualizarEmpresaEspecial));	
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemEliminarEmpresaEspecial.setVisible((this.isVisibilidadCeldaEliminarEmpresaEspecial && this.isPermisoEliminarEmpresaEspecial));
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemCancelarEmpresaEspecial.setVisible(this.isVisibilidadCeldaCancelarEmpresaEspecial);				
			}
			
			this.jMenuItemGuardarCambiosEmpresaEspecial.setVisible((this.isVisibilidadCeldaGuardarEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));						
			this.jMenuItemGuardarCambiosTablaEmpresaEspecial.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=this.jButtonNuevoEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaDuplicarEmpresaEspecial=this.jButtonDuplicarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaCopiarEmpresaEspecial=this.jButtonCopiarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaVerFormEmpresaEspecial=this.jButtonVerFormEmpresaEspecial.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpresaEspecial=this.jButtonAbrirOrderByEmpresaEspecial.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=this.jButtonNuevoRelacionesEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaModificarEmpresaEspecial=this.jButtonModificarEmpresaEspecial.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.isVisibilidadCeldaActualizarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaEliminarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaCancelarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaGuardarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=this.jButtonGuardarCambiosTablaEmpresaEspecial.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpresaEspecial=this.jButtonNuevoToolBarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=this.jButtonNuevoRelacionesToolBarEmpresaEspecial.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.isVisibilidadCeldaModificarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarToolBarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaActualizarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarToolBarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaEliminarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarToolBarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaCancelarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarToolBarEmpresaEspecial.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpresaEspecial=this.jButtonGuardarCambiosToolBarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=this.jButtonGuardarCambiosTablaToolBarEmpresaEspecial.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpresaEspecial=this.jMenuItemNuevoEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=this.jMenuItemNuevoRelacionesEmpresaEspecial.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.isVisibilidadCeldaModificarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemModificarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaActualizarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemActualizarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaEliminarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemEliminarEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaCancelarEmpresaEspecial=this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemCancelarEmpresaEspecial.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpresaEspecial=this.jMenuItemGuardarCambiosEmpresaEspecial.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=this.jMenuItemGuardarCambiosTablaEmpresaEspecial.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpresaEspecial(Boolean esInicializar) {
		if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
				//if(this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpresaEspecial();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpresaEspecial(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpresaEspecial() {
		this.jButtonNuevoEmpresaEspecial.setVisible(this.isPermisoNuevoEmpresaEspecial);			
		this.jButtonDuplicarEmpresaEspecial.setVisible(this.isPermisoDuplicarEmpresaEspecial);			
		this.jButtonCopiarEmpresaEspecial.setVisible(this.isPermisoCopiarEmpresaEspecial);			
		this.jButtonVerFormEmpresaEspecial.setVisible(this.isPermisoVerFormEmpresaEspecial);			
		
		this.jButtonAbrirOrderByEmpresaEspecial.setVisible(this.isPermisoOrdenEmpresaEspecial);					
		
		this.jButtonNuevoRelacionesEmpresaEspecial.setVisible(this.isPermisoNuevoEmpresaEspecial);			
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarEmpresaEspecial.setVisible(this.isPermisoActualizarEmpresaEspecial);	
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarEmpresaEspecial.setVisible(this.isPermisoActualizarEmpresaEspecial);	
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarEmpresaEspecial.setVisible(this.isPermisoEliminarEmpresaEspecial);
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarEmpresaEspecial.setVisible(this.isVisibilidadCeldaCancelarEmpresaEspecial);						
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.setVisible(this.isPermisoGuardarCambiosEmpresaEspecial);							
		}
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial.setVisible(this.isPermisoActualizarEmpresaEspecial);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpresaEspecial() {
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarEmpresaEspecial.setVisible(this.isPermisoActualizarEmpresaEspecial);	
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarEmpresaEspecial.setVisible(this.isPermisoActualizarEmpresaEspecial);	
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarEmpresaEspecial.setVisible(this.isPermisoEliminarEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarEmpresaEspecial.setVisible(this.isVisibilidadCeldaCancelarEmpresaEspecial);							
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.setVisible((this.isVisibilidadCeldaGuardarEmpresaEspecial && this.isPermisoGuardarCambiosEmpresaEspecial));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpresaEspecial() {
		if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpresaEspecial();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpresaEspecial() {
	}
	
	public void jTableDatosEmpresaEspecialListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpresaEspecial(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpresaEspecialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.getempresaespecial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresaespecial==null) {
						this.empresaespecial = new EmpresaEspecial();
					}

					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
				}

				if(this.empresaespecial.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empresaespecial.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresaEspecial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_resolucionEmpresaEspecialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.getempresaespecial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresaespecial==null) {
						this.empresaespecial = new EmpresaEspecial();
					}

					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
				}

				if(this.empresaespecial.getnumero_resolucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_resolucion like '%"+this.empresaespecial.getnumero_resolucion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresaEspecial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_resolucionEmpresaEspecialBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.getempresaespecial(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empresaespecial==null) {
						this.empresaespecial = new EmpresaEspecial();
					}

					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);
				}

				if(this.empresaespecial.getfecha_resolucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_resolucion = '"+Funciones2.getStringPostgresDate(this.empresaespecial.getfecha_resolucion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpresaEspecial(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEmpresaEspecial() {
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
			this.jInternalFrameDetalleFormEmpresaEspecial.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpresaEspecial.dispose();
			this.jInternalFrameDetalleFormEmpresaEspecial=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
			this.jInternalFrameReporteDinamicoEmpresaEspecial.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpresaEspecial.dispose();
			this.jInternalFrameReporteDinamicoEmpresaEspecial=null;
		}
		
		if(this.jInternalFrameImportacionEmpresaEspecial!=null) {
			this.jInternalFrameImportacionEmpresaEspecial.setVisible(false);	    			
			this.jInternalFrameImportacionEmpresaEspecial.dispose();
			this.jInternalFrameImportacionEmpresaEspecial=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpresaEspecial();
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpresaEspecial")) {
				jButtonDuplicarEmpresaEspecialActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpresaEspecial")) {
				jButtonCopiarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpresaEspecial")) {
				jButtonVerFormEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpresaEspecial")) {
				jButtonDuplicarEmpresaEspecialActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpresaEspecial")) {
				jButtonDuplicarEmpresaEspecialActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpresaEspecial")) {
				jButtonModificarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpresaEspecial")) {
				jButtonModificarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpresaEspecial")) {
				jButtonModificarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpresaEspecial")) {
				jButtonActualizarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpresaEspecial")) {
				jButtonActualizarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpresaEspecial")) {
				jButtonActualizarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpresaEspecial")) {
				jButtonEliminarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpresaEspecial")) {
				jButtonEliminarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpresaEspecial")) {
				jButtonEliminarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpresaEspecial")) {
				jButtonCancelarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpresaEspecial")) {
				jButtonCancelarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpresaEspecial")) {
				jButtonCancelarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpresaEspecial")) {
				jButtonCerrarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpresaEspecial")) {
				jButtonCerrarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpresaEspecial")) {
				jButtonCerrarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpresaEspecial")) {
				jButtonMostrarOcultarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpresaEspecial")) {
				jButtonCancelarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpresaEspecial")) {
				jButtonCopiarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpresaEspecial")) {
				jButtonVerFormEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpresaEspecial")) {
				jButtonCopiarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpresaEspecial")) {
				jButtonVerFormEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpresaEspecial")) {
				jButtonRecargarInformacionEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpresaEspecial")) {
				jButtonRecargarInformacionEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpresaEspecial")) {
				jButtonRecargarInformacionEmpresaEspecialActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpresaEspecial")) {
				jButtonAnterioresEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpresaEspecial")) {
				jButtonAnterioresEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpresaEspecial")) {
				jButtonAnterioresEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpresaEspecial")) {
				jButtonSiguientesEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpresaEspecial")) {
				jButtonSiguientesEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpresaEspecial")) {
				jButtonSiguientesEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpresaEspecial") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpresaEspecial")) {
				jButtonAbrirOrderByEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpresaEspecial") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpresaEspecial")) {
				jButtonMostrarOcultarEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpresaEspecial")) {
				jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpresaEspecial")) {
				jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpresaEspecial")) {
				jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpresaEspecial")) {
				jButtonCerrarReporteDinamicoEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpresaEspecial")) {
				jButtonGenerarReporteDinamicoEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpresaEspecial")) {
				
				jButtonGenerarExcelReporteDinamicoEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpresaEspecial")) {
				jButtonCerrarImportacionEmpresaEspecialActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpresaEspecial")) {
				
				jButtonGenerarImportacionEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpresaEspecial")) {
				
				jButtonAbrirImportacionEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpresaEspecial")) {
				jComboBoxTiposAccionesEmpresaEspecialActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpresaEspecial")) {
				jComboBoxTiposRelacionesEmpresaEspecialActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpresaEspecial")) {
				jComboBoxTiposAccionesEmpresaEspecialActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpresaEspecial")) {
				
				jComboBoxTiposSeleccionarEmpresaEspecialActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpresaEspecial")) {
				jTextFieldValorCampoGeneralEmpresaEspecialActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpresaEspecial")) {
				jButtonAbrirOrderByEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpresaEspecial")) {
				jButtonAbrirOrderByEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpresaEspecial")) {
				jButtonCerrarOrderByEmpresaEspecialActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpresaEspecialBusqueda")) {
				this.jButtonidEmpresaEspecialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_resolucionEmpresaEspecialBusqueda")) {
				this.jButtonnumero_resolucionEmpresaEspecialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_resolucionEmpresaEspecialBusqueda")) {
				this.jButtonfecha_resolucionEmpresaEspecialBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpresaEspecial();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaEspecialActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpresaEspecial empresaespecialLocal=null;
			
			if(!this.getEsControlTabla()) {
				empresaespecialLocal=this.empresaespecial;
			} else {
				empresaespecialLocal=this.empresaespecialAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
							
				
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
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
			
			


			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaEspecialActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
								
						
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
								
				
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
							
				
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaEspecialActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
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
			
			


			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
								
				
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaEspecialActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpresaEspecial")) {
					jCheckBoxSeleccionarTodosEmpresaEspecialItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpresaEspecial")) {
					jCheckBoxSeleccionadosEmpresaEspecialItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpresaEspecial")) {
					
				}
				
				


				
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
												
				
				


				
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaEspecialActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaEspecialActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
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
			
			


			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpresaEspecialActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empresaespecial);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empresaespecial);
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
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
				
				


				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpresaEspecial.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpresaEspecial.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpresaEspecialActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empresaespecialAnterior =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpresaEspecial")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpresaEspecialListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpresaEspecial.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empresaespecial =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empresaespecial =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empresaespecial);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpresaEspecial")) {
				
				}
				
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpresaEspecial")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpresaEspecial.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpresaEspecial")) {
			
			}
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpresaEspecial();
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
			if(sTipo.equals("NuevoEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpresaEspecial")) {
				jButtonDuplicarEmpresaEspecialActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpresaEspecial")) {
				jButtonCopiarEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpresaEspecial")) {
				jButtonVerFormEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpresaEspecial")) {
				jButtonNuevoEmpresaEspecialActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpresaEspecial")) {
				jButtonModificarEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpresaEspecial")) {
				jButtonActualizarEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpresaEspecial")) {
				jButtonEliminarEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpresaEspecial")) {
				jButtonCancelarEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpresaEspecial")) {
				jButtonCerrarEmpresaEspecialActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpresaEspecial")) {
				jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpresaEspecial")) {
				jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpresaEspecial")) {
				jButtonAbrirOrderByEmpresaEspecialActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpresaEspecial")) {
				jButtonRecargarInformacionEmpresaEspecialActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpresaEspecial")) {
				jButtonAnterioresEmpresaEspecialActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpresaEspecial")) {
				jButtonSiguientesEmpresaEspecialActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpresaEspecialBusqueda")) {
				this.jButtonidEmpresaEspecialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_resolucionEmpresaEspecialBusqueda")) {
				this.jButtonnumero_resolucionEmpresaEspecialBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_resolucionEmpresaEspecialBusqueda")) {
				this.jButtonfecha_resolucionEmpresaEspecialBusquedaActionPerformed(evt);
			}
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpresaEspecial();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpresaEspecial")) {
				closingInternalFrameEmpresaEspecial();
				
			} else if(sTipo.equals("jButtonCancelarEmpresaEspecial")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpresaEspecial = (JInternalFrameBase)evt.getSource();
	            	
	            EmpresaEspecialBeanSwingJInternalFrame jInternalFrameParent=(EmpresaEspecialBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpresaEspecial.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpresaEspecialActionPerformed(null);
			}
			
			EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empresaespecial,new Object(),this.empresaespecialParameterGeneral,this.empresaespecialReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpresaEspecial(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpresaEspecial(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpresaEspecial(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empresaespecial)) {
			if(!esControlTabla) {
				if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);			
				}
				
				if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpresaEspecial(this.empresaespecial,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empresaespecialReturnGeneral=empresaespecialLogic.procesarEventosEmpresaEspecialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresaespecialLogic.getEmpresaEspecials(),this.empresaespecial,this.empresaespecialParameterGeneral,this.isEsNuevoEmpresaEspecial,classes);//this.empresaespecialLogic.getEmpresaEspecial()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpresaEspecial(this.empresaespecialReturnGeneral,this.empresaespecialBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpresaEspecial(classes,this.empresaespecialReturnGeneral,this.empresaespecialBean,false);
					}
						
					if(this.empresaespecialReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpresaEspecial(this.empresaespecialReturnGeneral.getEmpresaEspecial());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpresaEspecial(this.empresaespecialReturnGeneral.getEmpresaEspecial());	
					}
						
					if(this.empresaespecialReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpresaEspecial(this.empresaespecialReturnGeneral.getEmpresaEspecial(),classes);//this.empresaespecialBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpresaEspecial(this.empresaespecial,classes);//this.empresaespecialBean);									
				}
			
				if(EmpresaEspecialJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpresaEspecial(this.empresaespecial,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpresaEspecial(this.empresaespecial);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empresaespecialAnterior!=null) {
						this.empresaespecial=this.empresaespecialAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empresaespecialReturnGeneral=empresaespecialLogic.procesarEventosEmpresaEspecialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresaespecialLogic.getEmpresaEspecials(),this.empresaespecial,this.empresaespecialParameterGeneral,this.isEsNuevoEmpresaEspecial,classes);//this.empresaespecialLogic.getEmpresaEspecial()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empresaespecialSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empresaespecialSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empresaespecialReturnGeneral.getEmpresaEspecial(),empresaespecialLogic.getEmpresaEspecials());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empresaespecialReturnGeneral.getEmpresaEspecial(),this.empresaespecials);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpresaEspecial.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpresaEspecial.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpresaEspecial();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpresaEspecial() throws Exception {
		
		EmpresaEspecialModel empresaespecialModel=(EmpresaEspecialModel)this.jTableDatosEmpresaEspecial.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empresaespecialModel.empresaespecials=this.empresaespecialLogic.getEmpresaEspecials();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empresaespecialModel.empresaespecials=this.empresaespecials;
		}
		
		
		((EmpresaEspecialModel) this.jTableDatosEmpresaEspecial.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpresaEspecial() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempresaespecialAnterior(),this.empresaespecialLogic.getEmpresaEspecials());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempresaespecialAnterior(),this.empresaespecials);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpresaEspecial();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpresaEspecial(EmpresaEspecial empresaespecial,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
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
										
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresaespecial,new Object(),generalEntityParameterGeneral,this.empresaespecialReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empresaespecialSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpresaEspecialConstantesFunciones.getClassesRelationshipsOfEmpresaEspecial(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpresaEspecialConstantesFunciones.getClassesRelationshipsFromStringsOfEmpresaEspecial(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpresaEspecial(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpresaEspecialBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empresaespecial,new Object(),generalEntityParameterGeneral,this.empresaespecialReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpresaEspecial(EmpresaEspecialBean empresaespecialBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpresaEspecial(ArrayList<Classe> classes,EmpresaEspecialReturnGeneral empresaespecialReturnGeneral,EmpresaEspecialBean empresaespecialBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpresaEspecial(EmpresaEspecial empresaespecial,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empresaespecial)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpresaEspecial = new EmpresaEspecialDetalleFormJInternalFrame(jDesktopPane,this.empresaespecialSessionBean.getConGuardarRelaciones(),this.empresaespecialSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.setVisible(false);
		this.jInternalFrameDetalleFormEmpresaEspecial.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpresaEspecial.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpresaEspecial.empresaespecialLogic=this.empresaespecialLogic;
		
		this.cargarCombosFrameForeignKeyEmpresaEspecial("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpresaEspecial();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpresaEspecial();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpresaEspecial("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpresaEspecial();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpresaEspecial.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpresaEspecial"));
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"ModificarEmpresaEspecial"));

		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarToolBarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpresaEspecial"));
					
		this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemModificarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpresaEspecial"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"ActualizarEmpresaEspecial"));
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarToolBarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpresaEspecial"));
						
		this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemActualizarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpresaEspecial"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"EliminarEmpresaEspecial"));
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpresaEspecial"));
								
		this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemEliminarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpresaEspecial"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CancelarEmpresaEspecial"));
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpresaEspecial"));
					
		this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemCancelarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpresaEspecial"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemDetalleCerrarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpresaEspecial"));		
		
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpresaEspecial"));
		
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpresaEspecial"));
		
		
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpresaEspecial"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonidEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"idEmpresaEspecialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonnumero_resolucionEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"numero_resolucionEmpresaEspecialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonfecha_resolucionEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"fecha_resolucionEmpresaEspecialBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpresaEspecial"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpresaEspecial"));
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpresaEspecial"));
		}
		
		this.jTableDatosEmpresaEspecial.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpresaEspecial"));
		
		this.jTableDatosEmpresaEspecial.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpresaEspecial"));
		
		this.jButtonNuevoEmpresaEspecial.addActionListener(new ButtonActionListener(this,"NuevoEmpresaEspecial"));
		
		this.jButtonDuplicarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"DuplicarEmpresaEspecial"));
		
		this.jButtonCopiarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"CopiarEmpresaEspecial"));
		
		this.jButtonVerFormEmpresaEspecial.addActionListener(new ButtonActionListener(this,"VerFormEmpresaEspecial"));
		
		
		this.jButtonNuevoToolBarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpresaEspecial"));
			
		this.jButtonDuplicarToolBarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpresaEspecial"));
			
		this.jMenuItemNuevoEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpresaEspecial"));
			
		this.jMenuItemDuplicarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpresaEspecial"));		
		
		
		this.jButtonNuevoRelacionesEmpresaEspecial.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpresaEspecial"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpresaEspecial"));
			
		this.jMenuItemNuevoRelacionesEmpresaEspecial.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpresaEspecial"));		
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"ModificarEmpresaEspecial"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonModificarToolBarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpresaEspecial"));
			
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemModificarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpresaEspecial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"ActualizarEmpresaEspecial"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonActualizarToolBarEmpresaEspecial.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpresaEspecial"));
				
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemActualizarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpresaEspecial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"EliminarEmpresaEspecial"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonEliminarToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpresaEspecial"));
						
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemEliminarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpresaEspecial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CancelarEmpresaEspecial"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonCancelarToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpresaEspecial"));
			
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemCancelarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpresaEspecial"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpresaEspecial"));		
		
		
		this.jButtonCerrarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CerrarEmpresaEspecial"));
		
		
		this.jButtonCerrarToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpresaEspecial"));
			
		this.jMenuItemCerrarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpresaEspecial"));
			
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jMenuItemDetalleCerrarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpresaEspecial"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpresaEspecial"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpresaEspecial"));
		}
		
		this.jButtonCopiarToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpresaEspecial"));
			
		this.jButtonVerFormToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpresaEspecial"));
		
		this.jMenuItemGuardarCambiosEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpresaEspecial"));
			
		this.jMenuItemCopiarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpresaEspecial"));		
		
		this.jMenuItemVerFormEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpresaEspecial"));		
		
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpresaEspecial"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpresaEspecial"));
			
		this.jMenuItemGuardarCambiosTablaEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpresaEspecial"));		
		
		
		
		this.jButtonRecargarInformacionEmpresaEspecial.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpresaEspecial"));
					
		this.jButtonRecargarInformacionToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpresaEspecial"));
		
		this.jMenuItemRecargarInformacionEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpresaEspecial"));		
		
		
		
		this.jButtonAnterioresEmpresaEspecial.addActionListener (new ButtonActionListener(this,"AnterioresEmpresaEspecial"));
		
		
		this.jButtonAnterioresToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpresaEspecial"));
		
		this.jMenuItemAnterioresEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpresaEspecial"));		
		
		
		this.jButtonSiguientesEmpresaEspecial.addActionListener (new ButtonActionListener(this,"SiguientesEmpresaEspecial"));
		
		
		this.jButtonSiguientesToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpresaEspecial"));
			
		this.jMenuItemSiguientesEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpresaEspecial"));
			
		this.jMenuItemAbrirOrderByEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpresaEspecial"));
			
		this.jMenuItemMostrarOcultarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpresaEspecial"));
			
		this.jMenuItemDetalleAbrirOrderByEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpresaEspecial"));
			
		this.jMenuItemDetalleMostarOcultarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpresaEspecial"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpresaEspecial.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpresaEspecial"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpresaEspecial"));
			
		this.jMenuItemNuevoGuardarCambiosEmpresaEspecial.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpresaEspecial"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpresaEspecial.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpresaEspecial"));

		this.jCheckBoxSeleccionadosEmpresaEspecial.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpresaEspecial"));
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpresaEspecial"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpresaEspecial.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpresaEspecial"));
			
		this.jComboBoxTiposAccionesEmpresaEspecial.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpresaEspecial"));
					
		this.jComboBoxTiposSeleccionarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpresaEspecial"));
			
		this.jTextFieldValorCampoGeneralEmpresaEspecial.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpresaEspecial"));		
		
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonidEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"idEmpresaEspecialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonnumero_resolucionEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"numero_resolucionEmpresaEspecialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonfecha_resolucionEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"fecha_resolucionEmpresaEspecialBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpresaEspecial!=null) {
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpresaEspecial"));
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpresaEspecial"));
				this.jInternalFrameReporteDinamicoEmpresaEspecial.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpresaEspecial"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpresaEspecial.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpresaEspecial"));				
			//this.jButtonGenerarReporteDinamicoEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpresaEspecial"));
			//this.jButtonGenerarExcelReporteDinamicoEmpresaEspecial.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpresaEspecial"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpresaEspecial!=null) {
				this.jInternalFrameImportacionEmpresaEspecial.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpresaEspecial"));
				this.jInternalFrameImportacionEmpresaEspecial.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpresaEspecial"));
				this.jInternalFrameImportacionEmpresaEspecial.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpresaEspecial"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpresaEspecial.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpresaEspecial"));
			
			this.jButtonAbrirOrderByToolBarEmpresaEspecial.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpresaEspecial"));			
			
			if(this.jInternalFrameOrderByEmpresaEspecial!=null) {
				this.jInternalFrameOrderByEmpresaEspecial.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpresaEspecial"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpresaEspecial.jTabbedPaneRelacionesEmpresaEspecial.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpresaEspecial"));
		
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
            		closingInternalFrameEmpresaEspecial();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpresaEspecial.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpresaEspecial = (JInternalFrameBase)event.getSource();
	            	
	            EmpresaEspecialBeanSwingJInternalFrame jInternalFrameParent=(EmpresaEspecialBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpresaEspecial.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpresaEspecialActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpresaEspecial.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpresaEspecialListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpresaEspecial.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpresaEspecial.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaEspecialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaEspecialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaEspecialActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpresaEspecial";
		inputMap = this.jButtonNuevoEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpresaEspecialActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaEspecialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaEspecialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpresaEspecialActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpresaEspecial";
		inputMap = this.jButtonNuevoRelacionesEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpresaEspecialActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpresaEspecial";
		inputMap = this.jButtonModificarEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpresaEspecialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpresaEspecial";
		inputMap = this.jButtonActualizarEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpresaEspecialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpresaEspecial";
		inputMap = this.jButtonEliminarEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpresaEspecialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpresaEspecial";
		inputMap = this.jButtonCancelarEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpresaEspecialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpresaEspecial";
		inputMap = this.jButtonCerrarEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpresaEspecialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpresaEspecial";
		inputMap = this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonGuardarCambiosEmpresaEspecial.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpresaEspecialActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpresaEspecial.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpresaEspecialItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpresaEspecial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpresaEspecialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpresaEspecial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpresaEspecialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpresaEspecial.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpresaEspecialActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonidEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"idEmpresaEspecialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonnumero_resolucionEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"numero_resolucionEmpresaEspecialBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpresaEspecial.jButtonfecha_resolucionEmpresaEspecialBusqueda.addActionListener(new ButtonActionListener(this,"fecha_resolucionEmpresaEspecialBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpresaEspecial.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpresaEspecialActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpresaEspecialActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpresaEspecial.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpresaEspecial(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
					empresaespecialAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpresaEspecial empresaespecialAux:empresaespecials) {
					empresaespecialAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpresaEspecialItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpresaEspecial(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
						empresaespecialAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpresaEspecial empresaespecialAux:empresaespecials) {
						empresaespecialAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpresaEspecial empresaespecialAux:empresaespecials) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpresaEspecial(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpresaEspecial.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpresaEspecial.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpresaEspecial,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpresaEspecialItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpresaEspecial(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpresaEspecial.getSelectedRows();
			
			EmpresaEspecial empresaespecialLocal=new EmpresaEspecial();
			
			//this.seleccionarTodosEmpresaEspecial(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaespecialLocal =(EmpresaEspecial) this.empresaespecialLogic.getEmpresaEspecials().toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empresaespecialLocal =(EmpresaEspecial) this.empresaespecials.toArray()[this.jTableDatosEmpresaEspecial.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empresaespecialLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
						empresaespecialAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpresaEspecial empresaespecialAux:empresaespecials) {
						empresaespecialAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpresaEspecial(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpresaEspecial.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpresaEspecial.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpresaEspecial,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpresaEspecialItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpresaEspecialParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpresaEspecialActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpresaEspecial(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpresaEspecial.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpresaEspecial empresaespecialAux:this.empresaespecialLogic.getEmpresaEspecials()) {
				
						if(sTipoSeleccionar.equals(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION)) {
							existe=true;
							empresaespecialAux.setnumero_resolucion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION)) {
							existe=true;
							empresaespecialAux.setfecha_resolucion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpresaEspecial empresaespecialAux:empresaespecials) {
					
						if(sTipoSeleccionar.equals(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION)) {
							existe=true;
							empresaespecialAux.setnumero_resolucion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION)) {
							existe=true;
							empresaespecialAux.setfecha_resolucion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpresaEspecial(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpresaEspecialActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpresaEspecial(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpresaEspecial=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpresaEspecial.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpresaEspecial) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpresaEspecial(conSplash);
				
					this.generarReporteEmpresaEspecialsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpresaEspecialsSeleccionados();
				//this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpresaEspecialsSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpresaEspecialsSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpresaEspecial();
				
				this.exportarEmpresaEspecialsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpresaEspecials();
				//this.importarEmpresaEspecials();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpresaEspecial();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpresaEspecialsSeleccionados();
				//this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empresa Especial", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpresaEspecial();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpresaEspecial)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpresaEspecial(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpresaEspecialBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpresaEspecial) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpresaEspecial(conSplash);
					
						//this.actualizarParametrosGeneralEmpresaEspecial();
						
						this.generarReporteProcesoAccionEmpresaEspecialsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpresaEspecialBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empresa EspecialES SELECCIONADOS?", "MANTENIMIENTO DE Empresa Especial", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpresaEspecial();
				
						this.actualizarParametrosGeneralEmpresaEspecial();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empresaespecialReturnGeneral=empresaespecialLogic.procesarAccionEmpresaEspecialsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empresaespecialLogic.getEmpresaEspecials(),this.empresaespecialParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpresaEspecialReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpresaEspecial();
					
					EmpresaEspecialBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpresaEspecialReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpresaEspecial.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpresaEspecial.jComboBoxTiposAccionesFormularioEmpresaEspecial.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpresaEspecial(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpresaEspecialActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpresaEspecial();
			
			if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
			EmpresaEspecial empresaespecial=new EmpresaEspecial();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpresaEspecial(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpresaEspecial.getSelectedItem();
			
			
			
			
			empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
			//this.sTipoAccion;
			
			if(empresaespecialsSeleccionados.size()==1) {
				for(EmpresaEspecial empresaespecialAux:empresaespecialsSeleccionados) {
					empresaespecial=empresaespecialAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpresaEspecial();
			
      		//this.finishProcessEmpresaEspecial(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpresaEspecialReturnGeneral() throws Exception {
		if(this.empresaespecialReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empresaespecialReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empresaespecialReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empresaespecialReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empresaespecialReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empresaespecialReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpresaEspecial(false);
		}
		
		if(this.empresaespecialReturnGeneral.getConRetornoLista() || this.empresaespecialReturnGeneral.getConRetornoObjeto()) {
			if(this.empresaespecialReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empresaespecialLogic.setEmpresaEspecials(this.empresaespecialReturnGeneral.getEmpresaEspecials());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empresaespecialReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empresaespecialLogic.setEmpresaEspecial(this.empresaespecialReturnGeneral.getEmpresaEspecial());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpresaEspecial(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpresaEspecial() throws Exception {
		
		
	}
	
	public ArrayList<EmpresaEspecial> getEmpresaEspecialsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpresaEspecial) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpresaEspecial empresaespecialAux:empresaespecialLogic.getEmpresaEspecials()) {
					if(empresaespecialAux.getIsSelected()) {
						empresaespecialsSeleccionados.add(empresaespecialAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpresaEspecial empresaespecialAux:this.empresaespecials) {
					if(empresaespecialAux.getIsSelected()) {
						empresaespecialsSeleccionados.add(empresaespecialAux);				
					}
				}
			}
			
			if(empresaespecialsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empresaespecialsSeleccionados.addAll(this.empresaespecialLogic.getEmpresaEspecials());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empresaespecialsSeleccionados.addAll(this.empresaespecials);				
					}
				}
			}
		} else {
			empresaespecialsSeleccionados.add(this.empresaespecial);
		}
		
		return empresaespecialsSeleccionados;
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
	
	public void generarReporteEmpresaEspecialsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpresaEspecialsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpresaEspecialsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpresaEspecialsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpresaEspecialsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empresa Especial",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpresaEspecialsSeleccionados() throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpresaEspecials("Todos",empresaespecialsSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpresaEspecialsSeleccionados() throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpresaEspecials("Todos",empresaespecialsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpresaEspecialsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpresaEspecials("Todos",empresaespecialsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpresaEspecialsSeleccionados() throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpresaEspecial();
		
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpresaEspecial();
		
		
		//this.generarReporteEmpresaEspecials("Todos",empresaespecialsSeleccionados ,empresaespecialImplementable,empresaespecialImplementableHome);
	}
	
	public void mostrarImportacionEmpresaEspecials() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpresaEspecial();
		
		this.abrirFrameImportacionEmpresaEspecial();		
		
			
		//this.generarReporteEmpresaEspecials("Todos",empresaespecialsSeleccionados ,empresaespecialImplementable,empresaespecialImplementableHome);
	}
	
	public void importarEmpresaEspecials() throws Exception {		
	
	}
	
	public void exportarEmpresaEspecialsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpresaEspecialsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpresaEspecialsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpresaEspecialsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empresa Especial",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpresaEspecialsSeleccionados() throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresaespecial."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpresaEspecial(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpresaEspecial empresaespecialAux:empresaespecialsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpresaEspecial(empresaespecialAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empresaespecialAux.setsDetalleGeneralEntityReporte(empresaespecialAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpresaEspecial(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpresaEspecialConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaEspecialConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpresaEspecial(EmpresaEspecial empresaespecial,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empresaespecial.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empresaespecial.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresaespecial.getnumero_resolucion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empresaespecial.getfecha_resolucion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpresaEspecialsSeleccionados() throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresaespecial.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpresaEspecials");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpresaEspecial(row);				
				iRow++;
			}				
			
			for(EmpresaEspecial empresaespecialAux:empresaespecialsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpresaEspecial(empresaespecialAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpresaEspecialsSeleccionados() throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();		
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empresaespecial.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empresaespecials");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empresaespecial");
			//elementRoot.appendChild(element);
		
			for(EmpresaEspecial empresaespecialAux:empresaespecialsSeleccionados) {
				element = document.createElement("empresaespecial");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpresaEspecial(empresaespecialAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empresa Especial",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpresaEspecial(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpresaEspecial(EmpresaEspecial empresaespecial,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empresaespecial.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empresaespecial.getnumero_resolucion());
		cell = row.createCell(iColumn++);cell.setCellValue(empresaespecial.getfecha_resolucion());				
	}
	
	public void setFilaDatosExportarXmlEmpresaEspecial(EmpresaEspecial empresaespecial,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpresaEspecialConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empresaespecial.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpresaEspecialConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empresaespecial.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnumero_resolucion = document.createElement(EmpresaEspecialConstantesFunciones.NUMERORESOLUCION);
		elementnumero_resolucion.appendChild(document.createTextNode(empresaespecial.getnumero_resolucion().trim()));
		element.appendChild(elementnumero_resolucion);

		Element elementfecha_resolucion = document.createElement(EmpresaEspecialConstantesFunciones.FECHARESOLUCION);
		elementfecha_resolucion.appendChild(document.createTextNode(empresaespecial.getfecha_resolucion().toString().trim()));
		element.appendChild(elementfecha_resolucion);
	}
	
	public void generarReporteGroupGenericoEmpresaEspecialsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpresaEspecial> empresaespecialsSeleccionados=new ArrayList<EmpresaEspecial>();
		
		empresaespecialsSeleccionados=this.getEmpresaEspecialsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpresaEspecial(empresaespecialsSeleccionados);
		
		this.generarReporteEmpresaEspecials("Todos",empresaespecialsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpresaEspecial(ArrayList<EmpresaEspecial> empresaespecialsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpresaEspecial empresaespecialAux:empresaespecialsSeleccionados) {
				empresaespecialAux.setsDetalleGeneralEntityReporte(empresaespecialAux.toString());
			
				if(sTipoSeleccionar.equals(EmpresaEspecialConstantesFunciones.LABEL_NUMERORESOLUCION)) {
					existe=true;
					empresaespecialAux.setsDescripcionGeneralEntityReporte1(empresaespecialAux.getnumero_resolucion());
				}
				 else if(sTipoSeleccionar.equals(EmpresaEspecialConstantesFunciones.LABEL_FECHARESOLUCION)) {
					existe=true;
					empresaespecialAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empresaespecialAux.getfecha_resolucion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpresaEspecialConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpresaEspecial(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpresaEspecial=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=true;
				this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=true;
			}
			
			this.isVisibilidadCeldaModificarEmpresaEspecial=false;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=false;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;
			this.isVisibilidadCeldaModificarEmpresaEspecial=false;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=true;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;
			this.isVisibilidadCeldaModificarEmpresaEspecial=false;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=true;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=true;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;
			this.isVisibilidadCeldaModificarEmpresaEspecial=false;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=true;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=true;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=true;
			this.isVisibilidadCeldaModificarEmpresaEspecial=false;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=false;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=false;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;
			this.isVisibilidadCeldaModificarEmpresaEspecial=true;
			this.isVisibilidadCeldaActualizarEmpresaEspecial=false;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
			this.isVisibilidadCeldaCancelarEmpresaEspecial=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpresaEspecial=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpresaEspecialJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpresaEspecial=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=true;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=true;
		} else {
			this.actualizarEstadoPanelsEmpresaEspecial(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpresaEspecial=false;
			//this.isVisibilidadCeldaVerFormEmpresaEspecial=false;
			this.isVisibilidadCeldaDuplicarEmpresaEspecial=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empresaespecialSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpresaEspecial=false;
			this.isVisibilidadCeldaGuardarCambiosEmpresaEspecial=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empresaespecialSessionBean.getEsGuardarRelacionado()) {
			if(!empresaespecialSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;												
			}
			
			this.jButtonCerrarEmpresaEspecial.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpresaEspecial=false;
		}
		
		if(!this.permiteMantenimiento(this.empresaespecial)) {
			this.isVisibilidadCeldaActualizarEmpresaEspecial=false;
			this.isVisibilidadCeldaEliminarEmpresaEspecial=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpresaEspecial() {
	}
	
	public void actualizarEstadoPanelsEmpresaEspecial(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpresaEspecial!=null) {
				this.jScrollPanelDatosEdicionEmpresaEspecial.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpresaEspecial!=null) {
				this.jScrollPanelDatosEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresaEspecial!=null) {
				this.jPanelPaginacionEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresaEspecial!=null) {
				this.jPanelParametrosReportesEmpresaEspecial.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpresaEspecial!=null) {
				this.jScrollPanelDatosEdicionEmpresaEspecial.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpresaEspecial!=null) {
				this.jScrollPanelDatosEmpresaEspecial.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpresaEspecial!=null) {
				this.jPanelPaginacionEmpresaEspecial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpresaEspecial!=null) {
				this.jPanelParametrosReportesEmpresaEspecial.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpresaEspecial!=null) {
				this.jScrollPanelDatosEdicionEmpresaEspecial.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEmpresaEspecial!=null) {
				this.jScrollPanelDatosEmpresaEspecial.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpresaEspecial!=null) {
				this.jPanelPaginacionEmpresaEspecial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpresaEspecial!=null) {
				this.jPanelParametrosReportesEmpresaEspecial.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpresaEspecial!=null) {
				this.jScrollPanelDatosEdicionEmpresaEspecial.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpresaEspecial!=null) {
				this.jScrollPanelDatosEmpresaEspecial.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpresaEspecial!=null) {
				this.jPanelPaginacionEmpresaEspecial.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpresaEspecial!=null) {
				this.jPanelParametrosReportesEmpresaEspecial.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpresaEspecial!=null) {
				this.jScrollPanelDatosEdicionEmpresaEspecial.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpresaEspecial!=null) {
				this.jScrollPanelDatosEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresaEspecial!=null) {
				this.jPanelPaginacionEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresaEspecial!=null) {
				this.jPanelParametrosReportesEmpresaEspecial.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpresaEspecial!=null) {
				this.jScrollPanelDatosEdicionEmpresaEspecial.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEmpresaEspecial!=null) {
				this.jScrollPanelDatosEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresaEspecial!=null) {
				this.jPanelPaginacionEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresaEspecial!=null) {
				this.jPanelParametrosReportesEmpresaEspecial.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpresaEspecial!=null) {
				this.jScrollPanelDatosEdicionEmpresaEspecial.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEmpresaEspecial!=null) {
				this.jScrollPanelDatosEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpresaEspecial!=null) {
				this.jPanelPaginacionEmpresaEspecial.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpresaEspecial!=null) {
				this.jPanelParametrosReportesEmpresaEspecial.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.empresaespecialSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpresaEspecialSessionBean empresaespecialSessionBean=new EmpresaEspecialSessionBean();
		
		if(this.empresaespecialSessionBean==null) {
			this.empresaespecialSessionBean=new EmpresaEspecialSessionBean();
		}
		
		this.empresaespecialSessionBean.setsUltimaBusquedaEmpresaEspecial(this.getsAccionBusqueda());
		this.empresaespecialSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empresaespecialSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpresaEspecialSessionBean empresaespecialSessionBean=new EmpresaEspecialSessionBean();
		
		if(this.empresaespecialSessionBean==null) {
			this.empresaespecialSessionBean=new EmpresaEspecialSessionBean();
		}
		
		if(this.empresaespecialSessionBean.getsUltimaBusquedaEmpresaEspecial()!=null&&!this.empresaespecialSessionBean.getsUltimaBusquedaEmpresaEspecial().equals("")) {
			this.setsAccionBusqueda(empresaespecialSessionBean.getsUltimaBusquedaEmpresaEspecial());
			this.setiNumeroPaginacion(empresaespecialSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empresaespecialSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.empresaespecialSessionBean.setsUltimaBusquedaEmpresaEspecial("");
		this.empresaespecialSessionBean.setiNumeroPaginacion(EmpresaEspecialConstantesFunciones.INUMEROPAGINACION);
		this.empresaespecialSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpresaEspecial(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpresaEspecial() {
		this.updateBorderResaltarBusquedasFormularioEmpresaEspecial();
		this.updateVisibilidadBusquedasFormularioEmpresaEspecial();
		this.updateHabilitarBusquedasFormularioEmpresaEspecial();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpresaEspecial() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEmpresaEspecial() {
	}
	
	public void updateHabilitarBusquedasFormularioEmpresaEspecial() {
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
	
	public void updateControlesFormularioEmpresaEspecial() throws Exception {

		if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpresaEspecial();
		this.updateVisibilidadResaltarControlesFormularioEmpresaEspecial();
		this.updateHabilitarResaltarControlesFormularioEmpresaEspecial();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpresaEspecial() throws Exception {
		if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empresaespecialConstantesFunciones.resaltaridEmpresaEspecial!=null && this.jInternalFrameDetalleFormEmpresaEspecial!=null) {this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.setBorder(this.empresaespecialConstantesFunciones.resaltaridEmpresaEspecial);}
		if(this.empresaespecialConstantesFunciones.resaltarnumero_resolucionEmpresaEspecial!=null && this.jInternalFrameDetalleFormEmpresaEspecial!=null) {this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.setBorder(this.empresaespecialConstantesFunciones.resaltarnumero_resolucionEmpresaEspecial);}
		if(this.empresaespecialConstantesFunciones.resaltarfecha_resolucionEmpresaEspecial!=null && this.jInternalFrameDetalleFormEmpresaEspecial!=null) {this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.setBorder(this.empresaespecialConstantesFunciones.resaltarfecha_resolucionEmpresaEspecial);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpresaEspecial() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
	
		//this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.setVisible(this.empresaespecialConstantesFunciones.mostraridEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.jPanelidEmpresaEspecial.setVisible(this.empresaespecialConstantesFunciones.mostraridEmpresaEspecial);
		//this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.setVisible(this.empresaespecialConstantesFunciones.mostrarnumero_resolucionEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.jPanelnumero_resolucionEmpresaEspecial.setVisible(this.empresaespecialConstantesFunciones.mostrarnumero_resolucionEmpresaEspecial);
		//this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.setVisible(this.empresaespecialConstantesFunciones.mostrarfecha_resolucionEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.jPanelfecha_resolucionEmpresaEspecial.setVisible(this.empresaespecialConstantesFunciones.mostrarfecha_resolucionEmpresaEspecial);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpresaEspecial() throws Exception {
		if(this.jInternalFrameDetalleFormEmpresaEspecial==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpresaEspecial!=null) {
	
		this.jInternalFrameDetalleFormEmpresaEspecial.jLabelidEmpresaEspecial.setEnabled(this.empresaespecialConstantesFunciones.activaridEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.jTextFieldnumero_resolucionEmpresaEspecial.setEnabled(this.empresaespecialConstantesFunciones.activarnumero_resolucionEmpresaEspecial);
		this.jInternalFrameDetalleFormEmpresaEspecial.jDateChooserfecha_resolucionEmpresaEspecial.setEnabled(this.empresaespecialConstantesFunciones.activarfecha_resolucionEmpresaEspecial);
		}
	}
	
		
}