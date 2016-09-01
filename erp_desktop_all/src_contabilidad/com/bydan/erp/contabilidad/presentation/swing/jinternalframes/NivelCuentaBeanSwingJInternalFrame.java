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

import com.bydan.erp.contabilidad.util.NivelCuentaConstantesFunciones;
import com.bydan.erp.contabilidad.util.NivelCuentaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.NivelCuentaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.NivelCuentaBean;
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
public class NivelCuentaBeanSwingJInternalFrame extends NivelCuentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NivelCuentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NivelCuenta> nivelcuentaValidator = new ClassValidator<NivelCuenta>(NivelCuenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NivelCuenta nivelcuenta;	
	public NivelCuenta nivelcuentaAux;
	public NivelCuenta nivelcuentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NivelCuenta nivelcuentaTotales;
	public Long idNivelCuentaActual;
	public Long iIdNuevoNivelCuenta=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCuentaContable=false;

	public Boolean getIsTienePermisosCuentaContable() {
		return isTienePermisosCuentaContable;
	}

	public void setIsTienePermisosCuentaContable(Boolean isTienePermisosCuentaContable) {
		this.isTienePermisosCuentaContable= isTienePermisosCuentaContable;
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
	
	public Boolean isPermisoTodoNivelCuenta;
	public Boolean isPermisoNuevoNivelCuenta;
	public Boolean isPermisoActualizarNivelCuenta;
	public Boolean isPermisoActualizarOriginalNivelCuenta;
	public Boolean isPermisoEliminarNivelCuenta;
	public Boolean isPermisoGuardarCambiosNivelCuenta;
	public Boolean isPermisoConsultaNivelCuenta;
	public Boolean isPermisoBusquedaNivelCuenta;
	public Boolean isPermisoReporteNivelCuenta;
	public Boolean isPermisoPaginacionMedioNivelCuenta;
	public Boolean isPermisoPaginacionAltoNivelCuenta;
	public Boolean isPermisoPaginacionTodoNivelCuenta;
	public Boolean isPermisoCopiarNivelCuenta;
	public Boolean isPermisoVerFormNivelCuenta;
	public Boolean isPermisoDuplicarNivelCuenta;
	public Boolean isPermisoOrdenNivelCuenta;
	
	
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
	
	public NivelCuentaParameterReturnGeneral nivelcuentaReturnGeneral;
	public NivelCuentaParameterReturnGeneral nivelcuentaParameterGeneral;
	
	

	public CuentaContableLogic cuentacontableLogic=null;

	public CuentaContableLogic getCuentaContableLogic() {
		return cuentacontableLogic;
	}

	public void setCuentaContableLogic(CuentaContableLogic cuentacontableLogic) {
		this.cuentacontableLogic = cuentacontableLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNivelCuenta=false;
	public Boolean esParaAccionDesdeFormularioNivelCuenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NivelCuentaSessionBeanAdditional nivelcuentaSessionBeanAdditional=null;
	
	public NivelCuentaSessionBeanAdditional getNivelCuentaSessionBeanAdditional() {
		return this.nivelcuentaSessionBeanAdditional;
	}
	
	public void setNivelCuentaSessionBeanAdditional(NivelCuentaSessionBeanAdditional nivelcuentaSessionBeanAdditional) {
		try {
			this.nivelcuentaSessionBeanAdditional=nivelcuentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NivelCuentaBeanSwingJInternalFrameAdditional nivelcuentaBeanSwingJInternalFrameAdditional=null;
	//public class NivelCuentaBeanSwingJInternalFrame
	
	public NivelCuentaBeanSwingJInternalFrameAdditional getNivelCuentaBeanSwingJInternalFrameAdditional() {
		return this.nivelcuentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setNivelCuentaBeanSwingJInternalFrameAdditional(NivelCuentaBeanSwingJInternalFrameAdditional nivelcuentaBeanSwingJInternalFrameAdditional) {
		try {
			this.nivelcuentaBeanSwingJInternalFrameAdditional=nivelcuentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NivelCuentaLogic nivelcuentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NivelCuenta nivelcuentaBean;
	public NivelCuentaConstantesFunciones nivelcuentaConstantesFunciones;
	//public NivelCuentaParameterReturnGeneral nivelcuentaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<NivelCuenta> nivelcuentas;	
	//public List<NivelCuenta> nivelcuentasEliminados;
	//public List<NivelCuenta> nivelcuentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNivelCuenta=false;
	public Boolean isVisibilidadCeldaDuplicarNivelCuenta=true;
	public Boolean isVisibilidadCeldaCopiarNivelCuenta=true;
	public Boolean isVisibilidadCeldaVerFormNivelCuenta=true;
	public Boolean isVisibilidadCeldaOrdenNivelCuenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
	public Boolean isVisibilidadCeldaModificarNivelCuenta=false;
	public Boolean isVisibilidadCeldaActualizarNivelCuenta=false;
	public Boolean isVisibilidadCeldaEliminarNivelCuenta=false;
	public Boolean isVisibilidadCeldaCancelarNivelCuenta=false;
	public Boolean isVisibilidadCeldaGuardarNivelCuenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNivelCuenta=false;	
	
	
	
	public Long getiIdNuevoNivelCuenta() {
		return this.iIdNuevoNivelCuenta;
	}

	public void setiIdNuevoNivelCuenta(Long iIdNuevoNivelCuenta) {
		this.iIdNuevoNivelCuenta = iIdNuevoNivelCuenta;
	}
	
	public Long getidNivelCuentaActual() {
		return this.idNivelCuentaActual;
	}

	public void setidNivelCuentaActual(Long idNivelCuentaActual) {
		this.idNivelCuentaActual = idNivelCuentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NivelCuenta getnivelcuenta() {
		return this.nivelcuenta;
	}

	public void setnivelcuenta(NivelCuenta nivelcuenta) {
		this.nivelcuenta = nivelcuenta;
	}
	
	public NivelCuenta getnivelcuentaAux() {
		return this.nivelcuentaAux;
	}

	public void setnivelcuentaAux(NivelCuenta nivelcuentaAux) {
		this.nivelcuentaAux = nivelcuentaAux;
	}				
	
	public NivelCuenta getnivelcuentaAnterior() {
		return this.nivelcuentaAnterior;
	}

	public void setnivelcuentaAnterior(NivelCuenta nivelcuentaAnterior) {
		this.nivelcuentaAnterior = nivelcuentaAnterior;
	}	
	
	public NivelCuenta getnivelcuentaTotales() {
		return this.nivelcuentaTotales;
	}

	public void setnivelcuentaTotales(NivelCuenta nivelcuentaTotales) {
		this.nivelcuentaTotales = nivelcuentaTotales;
	}	
	
	public NivelCuenta getnivelcuentaBean() {
		return this.nivelcuentaBean;
	}

	public void setnivelcuentaBean(NivelCuenta nivelcuentaBean) {
		this.nivelcuentaBean = nivelcuentaBean;
	}	
	
	public NivelCuentaParameterReturnGeneral getnivelcuentaReturnGeneral() {
		return this.nivelcuentaReturnGeneral;
	}

	public void setnivelcuentaReturnGeneral(NivelCuentaParameterReturnGeneral nivelcuentaReturnGeneral) {
		this.nivelcuentaReturnGeneral = nivelcuentaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NivelCuentaLogic getNivelCuentaLogic()	{		
		return nivelcuentaLogic;
	}

	public void setNivelCuentaLogic(NivelCuentaLogic nivelcuentaLogic) {
		this.nivelcuentaLogic = nivelcuentaLogic;
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
	
	public Boolean getIsEsNuevoNivelCuenta() {
		return isEsNuevoNivelCuenta;
	}

	public void setIsEsNuevoNivelCuenta(Boolean isEsNuevoNivelCuenta) {
		this.isEsNuevoNivelCuenta = isEsNuevoNivelCuenta;
	}

	public Boolean getEsParaAccionDesdeFormularioNivelCuenta() {
		return esParaAccionDesdeFormularioNivelCuenta;
	}
	
	public void setEsParaAccionDesdeFormularioNivelCuenta(Boolean esParaAccionDesdeFormularioNivelCuenta) {
		this.esParaAccionDesdeFormularioNivelCuenta = esParaAccionDesdeFormularioNivelCuenta;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesNivelCuenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NivelCuentaConstantesFunciones.refrescarForeignKeysDescripcionesNivelCuenta(this.nivelcuentaLogic.getNivelCuentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NivelCuentaConstantesFunciones.refrescarForeignKeysDescripcionesNivelCuenta(this.nivelcuentas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//nivelcuentaLogic.setNivelCuentas(this.nivelcuentas);
			nivelcuentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NivelCuentaParameterReturnGeneral getNivelCuentaParameterGeneral() {
		return this.nivelcuentaParameterGeneral;
	}
	
	public void setNivelCuentaParameterGeneral(NivelCuentaParameterReturnGeneral nivelcuentaParameterGeneral) {
		this.nivelcuentaParameterGeneral = nivelcuentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNivelCuenta() {
		return isPermisoTodoNivelCuenta;
	}

	public void setIsPermisoTodoNivelCuenta(Boolean isPermisoTodoNivelCuenta) {
		this.isPermisoTodoNivelCuenta = isPermisoTodoNivelCuenta;
	}

	public Boolean getIsPermisoNuevoNivelCuenta() {
		return isPermisoNuevoNivelCuenta;
	}

	public void setIsPermisoNuevoNivelCuenta(Boolean isPermisoNuevoNivelCuenta) {
		this.isPermisoNuevoNivelCuenta = isPermisoNuevoNivelCuenta;
	}

	public Boolean getIsPermisoActualizarNivelCuenta() {
		return isPermisoActualizarNivelCuenta;
	}

	public void setIsPermisoActualizarNivelCuenta(Boolean isPermisoActualizarNivelCuenta) {
		this.isPermisoActualizarNivelCuenta = isPermisoActualizarNivelCuenta;
	}

	public Boolean getIsPermisoEliminarNivelCuenta() {
		return isPermisoEliminarNivelCuenta;
	}

	public void setIsPermisoEliminarNivelCuenta(Boolean isPermisoEliminarNivelCuenta) {
		this.isPermisoEliminarNivelCuenta = isPermisoEliminarNivelCuenta;
	}

	public Boolean getIsPermisoGuardarCambiosNivelCuenta() {
		return isPermisoGuardarCambiosNivelCuenta;
	}

	public void setIsPermisoGuardarCambiosNivelCuenta(Boolean isPermisoGuardarCambiosNivelCuenta) {
		this.isPermisoGuardarCambiosNivelCuenta = isPermisoGuardarCambiosNivelCuenta;
	}
	
	public Boolean getIsPermisoConsultaNivelCuenta() {
		return isPermisoConsultaNivelCuenta;
	}

	public void setIsPermisoConsultaNivelCuenta(Boolean isPermisoConsultaNivelCuenta) {
		this.isPermisoConsultaNivelCuenta = isPermisoConsultaNivelCuenta;
	}

	public Boolean getIsPermisoBusquedaNivelCuenta() {
		return isPermisoBusquedaNivelCuenta;
	}

	public void setIsPermisoBusquedaNivelCuenta(Boolean isPermisoBusquedaNivelCuenta) {
		this.isPermisoBusquedaNivelCuenta = isPermisoBusquedaNivelCuenta;
	}

	public Boolean getIsPermisoReporteNivelCuenta() {
		return isPermisoReporteNivelCuenta;
	}

	public void setIsPermisoReporteNivelCuenta(Boolean isPermisoReporteNivelCuenta) {
		this.isPermisoReporteNivelCuenta = isPermisoReporteNivelCuenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioNivelCuenta() {
		return isPermisoPaginacionMedioNivelCuenta;
	}

	public void setIsPermisoPaginacionMedioNivelCuenta(Boolean isPermisoPaginacionMedioNivelCuenta) {
		this.isPermisoPaginacionMedioNivelCuenta = isPermisoPaginacionMedioNivelCuenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoNivelCuenta() {
		return isPermisoPaginacionTodoNivelCuenta;
	}

	public void setIsPermisoPaginacionTodoNivelCuenta(Boolean isPermisoPaginacionTodoNivelCuenta) {
		this.isPermisoPaginacionTodoNivelCuenta = isPermisoPaginacionTodoNivelCuenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoNivelCuenta() {
		return isPermisoPaginacionAltoNivelCuenta;
	}

	public void setIsPermisoPaginacionAltoNivelCuenta(Boolean isPermisoPaginacionAltoNivelCuenta) {
		this.isPermisoPaginacionAltoNivelCuenta = isPermisoPaginacionAltoNivelCuenta;
	}
	
	public Boolean getIsPermisoCopiarNivelCuenta() {
		return isPermisoCopiarNivelCuenta;
	}

	public void setIsPermisoCopiarNivelCuenta(Boolean isPermisoCopiarNivelCuenta) {
		this.isPermisoCopiarNivelCuenta = isPermisoCopiarNivelCuenta;
	}
	
	public Boolean getIsPermisoVerFormNivelCuenta() {
		return isPermisoVerFormNivelCuenta;
	}

	public void setIsPermisoVerFormNivelCuenta(Boolean isPermisoVerFormNivelCuenta) {
		this.isPermisoVerFormNivelCuenta = isPermisoVerFormNivelCuenta;
	}
	
	public Boolean getIsPermisoDuplicarNivelCuenta() {
		return isPermisoDuplicarNivelCuenta;
	}

	public void setIsPermisoDuplicarNivelCuenta(Boolean isPermisoDuplicarNivelCuenta) {
		this.isPermisoDuplicarNivelCuenta = isPermisoDuplicarNivelCuenta;
	}
	
	public Boolean getIsPermisoOrdenNivelCuenta() {
		return isPermisoOrdenNivelCuenta;
	}

	public void setIsPermisoOrdenNivelCuenta(Boolean isPermisoOrdenNivelCuenta) {
		this.isPermisoOrdenNivelCuenta = isPermisoOrdenNivelCuenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNivelCuenta() {
		return isVisibilidadCeldaNuevoNivelCuenta;
	}

	public void setIsVisibilidadCeldaNuevoNivelCuenta(Boolean isVisibilidadCeldaNuevoNivelCuenta) {
		this.isVisibilidadCeldaNuevoNivelCuenta = isVisibilidadCeldaNuevoNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNivelCuenta() {
		return isVisibilidadCeldaDuplicarNivelCuenta;
	}

	public void setIsVisibilidadCeldaDuplicarNivelCuenta(Boolean isVisibilidadCeldaDuplicarNivelCuenta) {
		this.isVisibilidadCeldaDuplicarNivelCuenta = isVisibilidadCeldaDuplicarNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNivelCuenta() {
		return isVisibilidadCeldaCopiarNivelCuenta;
	}

	public void setIsVisibilidadCeldaCopiarNivelCuenta(Boolean isVisibilidadCeldaCopiarNivelCuenta) {
		this.isVisibilidadCeldaCopiarNivelCuenta = isVisibilidadCeldaCopiarNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNivelCuenta() {
		return isVisibilidadCeldaVerFormNivelCuenta;
	}

	public void setIsVisibilidadCeldaVerFormNivelCuenta(Boolean isVisibilidadCeldaVerFormNivelCuenta) {
		this.isVisibilidadCeldaVerFormNivelCuenta = isVisibilidadCeldaVerFormNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNivelCuenta() {
		return isVisibilidadCeldaOrdenNivelCuenta;
	}

	public void setIsVisibilidadCeldaOrdenNivelCuenta(Boolean isVisibilidadCeldaOrdenNivelCuenta) {
		this.isVisibilidadCeldaOrdenNivelCuenta = isVisibilidadCeldaOrdenNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNivelCuenta() {
		return isVisibilidadCeldaNuevoRelacionesNivelCuenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNivelCuenta(Boolean isVisibilidadCeldaNuevoRelacionesNivelCuenta) {
		this.isVisibilidadCeldaNuevoRelacionesNivelCuenta = isVisibilidadCeldaNuevoRelacionesNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNivelCuenta() {
		return isVisibilidadCeldaModificarNivelCuenta;
	}

	public void setIsVisibilidadCeldaModificarNivelCuenta(Boolean isVisibilidadCeldaModificarNivelCuenta) {
		this.isVisibilidadCeldaModificarNivelCuenta = isVisibilidadCeldaModificarNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNivelCuenta() {
		return isVisibilidadCeldaActualizarNivelCuenta;
	}

	public void setIsVisibilidadCeldaActualizarNivelCuenta(Boolean isVisibilidadCeldaActualizarNivelCuenta) {
		this.isVisibilidadCeldaActualizarNivelCuenta = isVisibilidadCeldaActualizarNivelCuenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarNivelCuenta() {
		return isVisibilidadCeldaEliminarNivelCuenta;
	}

	public void setIsVisibilidadCeldaEliminarNivelCuenta(Boolean isVisibilidadCeldaEliminarNivelCuenta) {
		this.isVisibilidadCeldaEliminarNivelCuenta = isVisibilidadCeldaEliminarNivelCuenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarNivelCuenta() {
		return isVisibilidadCeldaCancelarNivelCuenta;
	}

	public void setIsVisibilidadCeldaCancelarNivelCuenta(Boolean isVisibilidadCeldaCancelarNivelCuenta) {
		this.isVisibilidadCeldaCancelarNivelCuenta = isVisibilidadCeldaCancelarNivelCuenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarNivelCuenta() {
		return isVisibilidadCeldaGuardarNivelCuenta;
	}

	public void setIsVisibilidadCeldaGuardarNivelCuenta(Boolean isVisibilidadCeldaGuardarNivelCuenta) {
		this.isVisibilidadCeldaGuardarNivelCuenta = isVisibilidadCeldaGuardarNivelCuenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNivelCuenta() {
		return isVisibilidadCeldaGuardarCambiosNivelCuenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNivelCuenta(Boolean isVisibilidadCeldaGuardarCambiosNivelCuenta) {
		this.isVisibilidadCeldaGuardarCambiosNivelCuenta = isVisibilidadCeldaGuardarCambiosNivelCuenta;
	}
		
	public NivelCuentaSessionBean getnivelcuentaSessionBean() {
		return this.nivelcuentaSessionBean;
	}
	
	public void setnivelcuentaSessionBean(NivelCuentaSessionBean nivelcuentaSessionBean) {
		this.nivelcuentaSessionBean=nivelcuentaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(NivelCuenta nivelcuenta)throws Exception {
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
	
	public void bugActualizarReferenciaActual(NivelCuenta nivelcuenta,NivelCuenta nivelcuentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNivelCuenta(nivelcuenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		nivelcuentaAux.setId(nivelcuenta.getId());
		nivelcuentaAux.setVersionRow(nivelcuenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNivelCuenta();
		
			int intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = nivelcuentaValidator.getInvalidValues(this.nivelcuenta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			nivelcuentaLogic.setDatosCliente(datosCliente);
			nivelcuentaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				nivelcuentaAux=new  NivelCuenta();
				
				nivelcuentaAux.setIsNew(true);
				nivelcuentaAux.setIsChanged(true);
				
				nivelcuentaAux.setNivelCuentaOriginal(this.nivelcuenta);
				
				nivelcuentaAux.setId(this.nivelcuenta.getId());	
				nivelcuentaAux.setVersionRow(this.nivelcuenta.getVersionRow());	
				nivelcuentaAux.setnombre(this.nivelcuenta.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(nivelcuentaAux,nivelcuentaLogic.getNivelCuentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentaAux,nivelcuentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentaLogic.saveNivelCuentas();//WithConnection
						//nivelcuentaLogic.getSetVersionRowNivelCuentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivelcuenta,nivelcuentaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables().addAll(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontables.addAll(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcuentaLogic.saveNivelCuentaRelaciones(nivelcuentaAux,this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());//WithConnection
								//nivelcuentaLogic.getSetVersionRowNivelCuentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivelcuenta,nivelcuentaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(new ArrayList<CuentaContable>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontables= new ArrayList<CuentaContable>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();}
							nivelcuentaAux.setCuentaContables(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivelcuentaAux,nivelcuentaLogic.getNivelCuentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivelcuentaAux,nivelcuentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivelcuenta,nivelcuentaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				nivelcuentaAux=new  NivelCuenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado() 
					|| (this.nivelcuentaSessionBean.getEsGuardarRelacionado() && this.nivelcuenta.getId()>=0)) {
						
					nivelcuentaAux.setIsNew(false);
				}
				
				nivelcuentaAux.setIsDeleted(false);
			
				nivelcuentaAux.setId(this.nivelcuenta.getId());	
				nivelcuentaAux.setVersionRow(this.nivelcuenta.getVersionRow());	
				nivelcuentaAux.setnombre(this.nivelcuenta.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivelcuentaAux,nivelcuentaLogic.getNivelCuentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentaAux,nivelcuentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentaLogic.saveNivelCuentas();//WithConnection
						//nivelcuentaLogic.getSetVersionRowNivelCuentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.nivelcuenta,nivelcuentaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables().addAll(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontables.addAll(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcuentaLogic.saveNivelCuentaRelaciones(nivelcuentaAux,this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());//WithConnection
								//nivelcuentaLogic.getSetVersionRowNivelCuentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.nivelcuenta,nivelcuentaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(new ArrayList<CuentaContable>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontables= new ArrayList<CuentaContable>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();}
							nivelcuentaAux.setCuentaContables(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(nivelcuentaAux,nivelcuentaLogic.getNivelCuentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(nivelcuentaAux,nivelcuentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.nivelcuenta,nivelcuentaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				nivelcuentaAux=new  NivelCuenta();
				
				nivelcuentaAux.setIsNew(false);
				nivelcuentaAux.setIsChanged(false);
				
				nivelcuentaAux.setIsDeleted(true);
				
				nivelcuentaAux.setId(this.nivelcuenta.getId());	
				nivelcuentaAux.setVersionRow(this.nivelcuenta.getVersionRow());	
				nivelcuentaAux.setnombre(this.nivelcuenta.getnombre());	
				
				if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.nivelcuentaAux.getId()>=0) {	
						this.nivelcuentasEliminados.add(nivelcuentaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(nivelcuentaAux,nivelcuentaLogic.getNivelCuentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentaAux,nivelcuentas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentaLogic.saveNivelCuentas();//WithConnection
						//nivelcuentaLogic.getSetVersionRowNivelCuentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables().addAll(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontables.addAll(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontablesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								nivelcuentaLogic.saveNivelCuentaRelaciones(nivelcuentaAux,this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());//WithConnection
								//nivelcuentaLogic.getSetVersionRowNivelCuentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(new ArrayList<CuentaContable>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontables= new ArrayList<CuentaContable>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.quitarFilaTotales();}
							nivelcuentaAux.setCuentaContables(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(nivelcuentaAux,nivelcuentaLogic.getNivelCuentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(nivelcuentaAux,nivelcuentas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.getNivelCuentas().addAll(this.nivelcuentasEliminados);
					
					nivelcuentaLogic.saveNivelCuentas();//WithConnection
					//nivelcuentaLogic.getSetVersionRowNivelCuentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.nivelcuentasEliminados= new ArrayList<NivelCuenta>();		
			}
			
			if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Nivel Cuenta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.nivelcuenta=nivelcuentaAux;
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
      		//this.finishProcessNivelCuenta();
      	}
		
	}	
	
	public void actualizarRelaciones(NivelCuenta nivelcuentaLocal) throws Exception {
		
		if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				nivelcuentaLocal.setCuentaContables(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
			
			} else {
			
				nivelcuentaLocal.setCuentaContables(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontables);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NivelCuenta nivelcuentaLocal) throws Exception {	
		if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarNivelCuentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = nivelcuentaValidator.getInvalidValues(this.nivelcuenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NivelCuenta nivelcuenta,List<NivelCuenta> nivelcuentas) throws Exception {
		try	{		
			NivelCuentaConstantesFunciones.actualizarLista(nivelcuenta,nivelcuentas,this.nivelcuentaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NivelCuenta nivelcuenta,List<NivelCuenta> nivelcuentas) throws Exception {
		try	{			
			NivelCuentaConstantesFunciones.actualizarSelectedLista(nivelcuenta,nivelcuentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NivelCuenta> nivelcuentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				nivelcuentasLocal=this.nivelcuentaLogic.getNivelCuentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				nivelcuentasLocal=this.nivelcuentas;
			}
			//ARCHITECTURE
		
			for(NivelCuenta nivelcuentaLocal:nivelcuentasLocal) {
				if(this.permiteMantenimiento(nivelcuentaLocal) && nivelcuentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NivelCuentaConstantesFunciones.getNivelCuentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NivelCuentaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuenta.jLabelnombreNivelCuenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNivelCuenta.jLabelnombreNivelCuenta,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CuentaContable")) {
			if(this.nivelcuenta==null) {
				this.nivelcuenta= new NivelCuenta();
			}

			if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNivelCuenta
				this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);

				this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.getcuentacontable().setNivelCuenta(this.nivelcuenta);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoNivelCuenta--;	
		
		
		this.nivelcuentaAux=new NivelCuenta();
		
		this.nivelcuentaAux.setId(this.iIdNuevoNivelCuenta);
		this.nivelcuentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.nivelcuentaLogic.getNivelCuentas().add(this.nivelcuentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.nivelcuentas.add(this.nivelcuentaAux);
		}
		//ARCHITECTURE
		
		this.nivelcuenta=this.nivelcuentaAux;
		
		if(NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNivelCuenta(this.nivelcuenta);
			this.setVariablesObjetoActualToFormularioForeignKeyNivelCuenta(this.nivelcuenta);
		}
				
		//this.setDefaultControlesNivelCuenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNivelCuenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNivelCuenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCuenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelCuenta(this.nivelcuentaBean,this.nivelcuenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NivelCuentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
			classes=NivelCuentaConstantesFunciones.getClassesRelationshipsOfNivelCuenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.nivelcuentaReturnGeneral=nivelcuentaLogic.procesarEventosNivelCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcuentaLogic.getNivelCuentas(),this.nivelcuenta,this.nivelcuentaParameterGeneral,this.isEsNuevoNivelCuenta,classes);//this.nivelcuentaLogic.getNivelCuenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNivelCuenta(this.nivelcuentaReturnGeneral,this.nivelcuentaBean,false);
		
		if(this.nivelcuentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNivelCuenta(this.nivelcuentaReturnGeneral.getNivelCuenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNivelCuenta(this.nivelcuentaReturnGeneral.getNivelCuenta());
		}
		
		if(this.nivelcuentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNivelCuenta(this.nivelcuentaReturnGeneral.getNivelCuenta(),classes);//this.nivelcuentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNivelCuenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNivelCuenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelCuentaBeanSwingJInternalFrameAdditional.RecargarFormNivelCuenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNivelCuenta(false);
						
			if(nivelcuentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getEsGuardarRelacionado() && CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCuenta();
			}
			
			this.actualizarVisualTableDatosNivelCuenta();
			
			this.jTableDatosNivelCuenta.setRowSelectionInterval(this.getIndiceNuevoNivelCuenta(), this.getIndiceNuevoNivelCuenta());
			
			this.seleccionarFilaTablaNivelCuentaActual();
						
			this.actualizarEstadoCeldasBotonesNivelCuenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNivelCuenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.setEnabled(isHabilitar && this.nivelcuentaConstantesFunciones.activarnombreNivelCuenta);	
		
	};
	
	public void setDefaultControlesNivelCuenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNivelCuenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.nivelcuentaSessionBean.setConGuardarRelaciones(true);			
			this.nivelcuentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.nivelcuentaSessionBean.setConGuardarRelaciones(false);			
			this.nivelcuentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoNivelCuenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
				if(nivelcuentaAux.getId().equals(this.iIdNuevoNivelCuenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuenta nivelcuentaAux:this.nivelcuentas) {
				if(nivelcuentaAux.getId().equals(this.iIdNuevoNivelCuenta)) {
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
	
	public int getIndiceActualNivelCuenta(NivelCuenta nivelcuenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
				if(nivelcuentaAux.getId().equals(nivelcuenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuenta nivelcuentaAux:this.nivelcuentas) {
				if(nivelcuentaAux.getId().equals(nivelcuenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNivelCuenta(NivelCuenta nivelcuentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
				if(nivelcuentaAux.getNivelCuentaOriginal().getId().equals(nivelcuentaOriginal.getId())) {
					existe=true;
					nivelcuentaOriginal.setId(nivelcuentaAux.getId());
					nivelcuentaOriginal.setVersionRow(nivelcuentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuenta nivelcuentaAux:this.nivelcuentas) {
				if(nivelcuentaAux.getNivelCuentaOriginal().getId().equals(nivelcuentaOriginal.getId())) {
					existe=true;
					nivelcuentaOriginal.setId(nivelcuentaAux.getId());
					nivelcuentaOriginal.setVersionRow(nivelcuentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNivelCuenta(Boolean esParaCancelar) throws Exception {
		nivelcuentasAux=new ArrayList<NivelCuenta>();
		nivelcuentaAux=new NivelCuenta();
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
					if(nivelcuentaAux.getId()<0) {
						nivelcuentasAux.add(nivelcuentaAux);
					}		
				}
				this.iIdNuevoNivelCuenta=0L;
				this.nivelcuentaLogic.getNivelCuentas().removeAll(nivelcuentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuenta nivelcuentaAux:this.nivelcuentas) {
					if(nivelcuentaAux.getId()<0) {
						nivelcuentasAux.add(nivelcuentaAux);
					}		
				}
				this.iIdNuevoNivelCuenta=0L;
				this.nivelcuentas.removeAll(nivelcuentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNivelCuenta 
					&& this.nivelcuentaLogic.getNivelCuentas().size()>0
					) {
					nivelcuentaAux=this.nivelcuentaLogic.getNivelCuentas().get(this.nivelcuentaLogic.getNivelCuentas().size() - 1);
				
					if(nivelcuentaAux.getId()<0) {
						this.nivelcuentaLogic.getNivelCuentas().remove(nivelcuentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNivelCuenta && this.nivelcuentas.size()>0) {
					nivelcuentaAux=this.nivelcuentas.get(this.nivelcuentas.size() - 1);
				
					if(nivelcuentaAux.getId()<0) {
						this.nivelcuentas.remove(nivelcuentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNivelCuenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(nivelcuenta.getId()<0) {
				this.nivelcuentaLogic.getNivelCuentas().remove(this.nivelcuenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(nivelcuenta.getId()<0) {
				this.nivelcuentas.remove(this.nivelcuenta);
			}
		}			
	}
	
	public void setEstadosInicialesNivelCuenta(List<NivelCuenta> nivelcuentasAux) throws Exception {
		NivelCuentaConstantesFunciones.setEstadosInicialesNivelCuenta(nivelcuentasAux);
	}
	
	public void setEstadosInicialesNivelCuenta(NivelCuenta nivelcuentaAux) throws Exception {
		NivelCuentaConstantesFunciones.setEstadosInicialesNivelCuenta(nivelcuentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNivelCuentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNivelCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNivelCuentaActual()) {
				if(!this.isEsNuevoNivelCuenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNivelCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNivelCuenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNivelCuentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Nivel Cuenta ?", "MANTENIMIENTO DE Nivel Cuenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNivelCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NivelCuenta nivelcuenta) throws Exception {
		NivelCuentaConstantesFunciones.seleccionarAsignar(this.nivelcuenta,nivelcuenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNivelCuenta=this.isPermisoActualizarOriginalNivelCuenta;
			
			
			this.seleccionarAsignar(nivelcuenta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NivelCuentaConstantesFunciones.quitarEspaciosNivelCuenta(this.nivelcuenta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNivelCuenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.nivelcuentaSessionBean.setsFuncionBusquedaRapida(this.nivelcuentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNivelCuenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNivelCuenta(esParaCancelar);				
				this.cancelarNuevoNivelCuenta(esParaCancelar);								
			}
			
			this.nivelcuenta=new NivelCuenta();
			
			this.inicializarNivelCuenta();
			
			this.actualizarEstadoCeldasBotonesNivelCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNivelCuenta() throws Exception {
		try {
			NivelCuentaConstantesFunciones.inicializarNivelCuenta(this.nivelcuenta);
			
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
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.nivelcuentaLogic.getNivelCuentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNivelCuentas(String sAccionBusqueda,List<NivelCuenta> nivelcuentasParaReportes) throws Exception {
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
					sPathReporteFinal="NivelCuenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NivelCuentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NivelCuentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NivelCuenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Nivel Cuentas");		
		parameters.put("busquedapor", NivelCuentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CuentaContable.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					NivelCuentaLogic nivelcuentaLogicAuxiliar=new NivelCuentaLogic();
					nivelcuentaLogicAuxiliar.setDatosCliente(nivelcuentaLogic.getDatosCliente());				
					nivelcuentaLogicAuxiliar.setNivelCuentas(nivelcuentasParaReportes);
					
					nivelcuentaLogicAuxiliar.cargarRelacionesLoteForeignKeyNivelCuentaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					nivelcuentasParaReportes=nivelcuentaLogicAuxiliar.getNivelCuentas();
					
					//nivelcuentaLogic.getNewConnexionToDeep();
					
					//for (NivelCuenta nivelcuenta:nivelcuentasParaReportes) {
					//	nivelcuentaLogic.deepLoad(nivelcuenta, false, DeepLoadType.INCLUDE, classes);
					//}						
					//nivelcuentaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//nivelcuentaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCuentaContable = AuxiliarReportes.class.getResourceAsStream("CuentaContableDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentacontable", reportFileCuentaContable);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNivelCuenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NivelCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NivelCuentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNivelCuenta=new JRBeanArrayDataSource(NivelCuentaJInternalFrame.TraerNivelCuentaBeans(nivelcuentasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNivelCuenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NivelCuentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NivelCuentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NivelCuentaBean.TraerNivelCuentaBeans(nivelcuentasParaReportes).toArray()));
							
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
				this.generarExcelReporteNivelCuentas(sAccionBusqueda,sTipoArchivoReporte,nivelcuentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNivelCuentas(sAccionBusqueda,sTipoArchivoReporte,nivelcuentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNivelCuentaActionPerformed(null);
					//this.generarExcelReporteNivelCuentas(sAccionBusqueda,sTipoArchivoReporte,nivelcuentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNivelCuentas(sAccionBusqueda,sTipoArchivoReporte,nivelcuentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNivelCuentas(sAccionBusqueda,sTipoArchivoReporte,nivelcuentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNivelCuentas(sAccionBusqueda,sTipoArchivoReporte,nivelcuentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNivelCuentas(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCuenta> nivelcuentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCuentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelCuenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NivelCuenta nivelcuenta : nivelcuentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NivelCuentaConstantesFunciones.generarExcelReporteDataNivelCuenta("NORMAL",row,workbook,nivelcuenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNivelCuenta(String sTipo,Row row,Workbook workbook) {
		
		NivelCuentaConstantesFunciones.generarExcelReporteHeaderNivelCuenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNivelCuentas(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCuenta> nivelcuentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCuentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NivelCuenta nivelcuenta : nivelcuentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NivelCuentaConstantesFunciones.getNivelCuentaDescripcion(nivelcuenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NivelCuentaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NivelCuentaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(nivelcuenta.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNivelCuentas(String sAccionBusqueda,String sTipoArchivoReporte,List<NivelCuenta> nivelcuentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NivelCuenta> nivelcuentasRespaldo=null;
		
		classes=NivelCuentaConstantesFunciones.getClassesRelationshipsOfNivelCuenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.nivelcuentaLogic.setDatosCliente(this.datosCliente);
		this.nivelcuentaLogic.setDatosDeep(this.datosDeep);
		this.nivelcuentaLogic.setIsConDeep(true);
		
		nivelcuentasRespaldo=this.nivelcuentaLogic.getNivelCuentas();
		
		this.nivelcuentaLogic.setNivelCuentas(nivelcuentasParaReportes);	
		this.nivelcuentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		nivelcuentasParaReportes=this.nivelcuentaLogic.getNivelCuentas();
		this.nivelcuentaLogic.setNivelCuentas(nivelcuentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NivelCuentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNivelCuenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NivelCuenta nivelcuenta : nivelcuentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNivelCuenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NivelCuentaConstantesFunciones.generarExcelReporteDataNivelCuenta("NORMAL",row,workbook,nivelcuenta,cellStyleDataAux);
		
			
			


				//CuentaContable
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaContableConstantesFunciones.SCLASSWEBTITULO))) {

				if(nivelcuenta.getCuentaContables()!=null && nivelcuenta.getCuentaContables().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaContableConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaContableConstantesFunciones.generarExcelReporteHeaderCuentaContable("RELACIONADO",row,workbook);
				}

				if(nivelcuenta.getCuentaContables()!=null) {
					i2=0;
					for(CuentaContable cuentacontable : nivelcuenta.getCuentaContables()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaContableConstantesFunciones.generarExcelReporteDataCuentaContable("RELACIONADO",row,workbook,cuentacontable,cellStyleDataAuxHijo);
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
		cell.setCellValue(NivelCuentaConstantesFunciones.getNivelCuentaDescripcion(nivelcuenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCuenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNivelCuenta() throws Exception {		
		this.startProcessNivelCuenta(true);
	}
	
	public void startProcessNivelCuenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesNivelCuenta, this.jScrollPanelDatosNivelCuenta,this.jPanelPaginacionNivelCuenta, this.jScrollPanelDatosEdicionNivelCuenta, this.jPanelAccionesNivelCuenta,this.jPanelAccionesFormularioNivelCuenta,this.jmenuBarNivelCuenta,this.jmenuBarDetalleNivelCuenta,this.jTtoolBarNivelCuenta,this.jTtoolBarDetalleNivelCuenta);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelCuenta=null; 
		
		final JPanel jPanelParametrosReportesNivelCuenta=this.jPanelParametrosReportesNivelCuenta;
		//final JScrollPane jScrollPanelDatosNivelCuenta=this.jScrollPanelDatosNivelCuenta;
		final JTable jTableDatosNivelCuenta=this.jTableDatosNivelCuenta;		
		final JPanel jPanelPaginacionNivelCuenta=this.jPanelPaginacionNivelCuenta;
		//final JScrollPane jScrollPanelDatosEdicionNivelCuenta=this.jScrollPanelDatosEdicionNivelCuenta;
		final JPanel jPanelAccionesNivelCuenta=this.jPanelAccionesNivelCuenta;
		
		JPanel jPanelCamposAuxiliarNivelCuenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNivelCuenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			jPanelCamposAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jPanelCamposNivelCuenta;
			jPanelAccionesFormularioAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jPanelAccionesFormularioNivelCuenta;
		}
		
		final JPanel jPanelCamposNivelCuenta=jPanelCamposAuxiliarNivelCuenta;
		final JPanel jPanelAccionesFormularioNivelCuenta=jPanelAccionesFormularioAuxiliarNivelCuenta;
		
		
		final JMenuBar jmenuBarNivelCuenta=this.jmenuBarNivelCuenta;
		final JToolBar jTtoolBarNivelCuenta=this.jTtoolBarNivelCuenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNivelCuenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelCuenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			jmenuBarDetalleAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jmenuBarDetalleNivelCuenta;
			jTtoolBarDetalleAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jTtoolBarDetalleNivelCuenta;
		}
		
		final JMenuBar jmenuBarDetalleNivelCuenta=jmenuBarDetalleAuxiliarNivelCuenta;
		final JToolBar jTtoolBarDetalleNivelCuenta=jTtoolBarDetalleAuxiliarNivelCuenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelCuenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelCuenta;
			processRunnable.jTableDatos=jTableDatosNivelCuenta;
			processRunnable.jPanelCampos=jPanelCamposNivelCuenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelCuenta;
			processRunnable.jPanelAcciones=jPanelAccionesNivelCuenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelCuenta;
			
			
			processRunnable.jmenuBar=jmenuBarNivelCuenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelCuenta;
			processRunnable.jTtoolBar=jTtoolBarNivelCuenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelCuenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNivelCuenta ,jPanelParametrosReportesNivelCuenta,jTableDatosNivelCuenta, /*jScrollPanelDatosNivelCuenta,*/jPanelCamposNivelCuenta,jPanelPaginacionNivelCuenta, /*jScrollPanelDatosEdicionNivelCuenta,*/ jPanelAccionesNivelCuenta,jPanelAccionesFormularioNivelCuenta,jmenuBarNivelCuenta,jmenuBarDetalleNivelCuenta,jTtoolBarNivelCuenta,jTtoolBarDetalleNivelCuenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesNivelCuenta, jScrollPanelDatosNivelCuenta,jPanelPaginacionNivelCuenta, jScrollPanelDatosEdicionNivelCuenta, jPanelAccionesNivelCuenta,jPanelAccionesFormularioNivelCuenta,jmenuBarNivelCuenta,jmenuBarDetalleNivelCuenta,jTtoolBarNivelCuenta,jTtoolBarDetalleNivelCuenta);
						
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
	
	public void finishProcessNivelCuenta() {// throws Exception 
		this.finishProcessNivelCuenta(true);
	}
	
	public void finishProcessNivelCuenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesNivelCuenta, this.jScrollPanelDatosNivelCuenta,this.jPanelPaginacionNivelCuenta, this.jScrollPanelDatosEdicionNivelCuenta, this.jPanelAccionesNivelCuenta,this.jPanelAccionesFormularioNivelCuenta,this.jmenuBarNivelCuenta,this.jmenuBarDetalleNivelCuenta,this.jTtoolBarNivelCuenta,this.jTtoolBarDetalleNivelCuenta);		
		
		final JTabbedPane jTabbedPaneBusquedasNivelCuenta=null; 
		
		final JPanel jPanelParametrosReportesNivelCuenta=this.jPanelParametrosReportesNivelCuenta;
		//final JScrollPane jScrollPanelDatosNivelCuenta=this.jScrollPanelDatosNivelCuenta;
		final JTable jTableDatosNivelCuenta=this.jTableDatosNivelCuenta;		
		final JPanel jPanelPaginacionNivelCuenta=this.jPanelPaginacionNivelCuenta;
		//final JScrollPane jScrollPanelDatosEdicionNivelCuenta=this.jScrollPanelDatosEdicionNivelCuenta;
		final JPanel jPanelAccionesNivelCuenta=this.jPanelAccionesNivelCuenta;
		
		JPanel jPanelCamposAuxiliarNivelCuenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNivelCuenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			jPanelCamposAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jPanelCamposNivelCuenta;
			jPanelAccionesFormularioAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jPanelAccionesFormularioNivelCuenta;
		}
		
		final JPanel jPanelCamposNivelCuenta=jPanelCamposAuxiliarNivelCuenta;
		final JPanel jPanelAccionesFormularioNivelCuenta=jPanelAccionesFormularioAuxiliarNivelCuenta;
		
		
		final JMenuBar jmenuBarNivelCuenta=this.jmenuBarNivelCuenta;		
		final JToolBar jTtoolBarNivelCuenta=this.jTtoolBarNivelCuenta;
				
		JMenuBar jmenuBarDetalleAuxiliarNivelCuenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNivelCuenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			jmenuBarDetalleAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jmenuBarDetalleNivelCuenta;
			jTtoolBarDetalleAuxiliarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jTtoolBarDetalleNivelCuenta;		
		}
		
		final JMenuBar jmenuBarDetalleNivelCuenta=jmenuBarDetalleAuxiliarNivelCuenta;
		final JToolBar jTtoolBarDetalleNivelCuenta=jTtoolBarDetalleAuxiliarNivelCuenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNivelCuenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNivelCuenta;
			processRunnable.jTableDatos=jTableDatosNivelCuenta;
			processRunnable.jPanelCampos=jPanelCamposNivelCuenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionNivelCuenta;
			processRunnable.jPanelAcciones=jPanelAccionesNivelCuenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNivelCuenta;
			
			
			processRunnable.jmenuBar=jmenuBarNivelCuenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNivelCuenta;
			processRunnable.jTtoolBar=jTtoolBarNivelCuenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNivelCuenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNivelCuenta ,jPanelParametrosReportesNivelCuenta, jTableDatosNivelCuenta,/*jScrollPanelDatosNivelCuenta,*/jPanelCamposNivelCuenta,jPanelPaginacionNivelCuenta, /*jScrollPanelDatosEdicionNivelCuenta,*/ jPanelAccionesNivelCuenta,jPanelAccionesFormularioNivelCuenta,jmenuBarNivelCuenta,jmenuBarDetalleNivelCuenta,jTtoolBarNivelCuenta,jTtoolBarDetalleNivelCuenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNivelCuenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNivelCuenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNivelCuenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNivelCuenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNivelCuenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNivelCuenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNivelCuenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNivelCuenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNivelCuenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.nivelcuentaConstantesFunciones.getsFinalQueryNivelCuenta();
		String  finalQueryPaginacionTodos=this.nivelcuentaConstantesFunciones.getsFinalQueryNivelCuenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NivelCuentaConstantesFunciones.getArrayColumnasGlobalesNoNivelCuenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NivelCuentaConstantesFunciones.getArrayColumnasGlobalesNivelCuenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NivelCuentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.nivelcuentasEliminados= new ArrayList<NivelCuenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNivelCuenta();
		
				///*NivelCuentaSessionBean*/this.nivelcuentaSessionBean=new NivelCuentaSessionBean();
			
			if(this.nivelcuentaSessionBean==null) {
				this.nivelcuentaSessionBean=new NivelCuentaSessionBean();
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
					this.iNumeroPaginacion=NivelCuentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NivelCuentaConstantesFunciones.getClassesForeignKeysOfNivelCuenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/nivelcuenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			nivelcuentasAux= new ArrayList<NivelCuenta>();
			
				
			nivelcuentaLogic.setDatosCliente(this.datosCliente);
			nivelcuentaLogic.setDatosDeep(this.datosDeep);
			nivelcuentaLogic.setIsConDeep(true);
			
			
			nivelcuentaLogic.getNivelCuentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					nivelcuentaLogic.getTodosNivelCuentas(finalQueryGlobal,pagination);
					
					//nivelcuentaLogic.getTodosNivelCuentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(nivelcuentaLogic.getNivelCuentas()==null|| nivelcuentaLogic.getNivelCuentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcuentasAux= new ArrayList<NivelCuenta>();
							nivelcuentasAux.addAll(nivelcuentaLogic.getNivelCuentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentasAux= new ArrayList<NivelCuenta>();
							nivelcuentasAux.addAll(nivelcuentas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcuentaLogic.getTodosNivelCuentas(finalQueryGlobal+"",this.pagination);												
							
							//nivelcuentaLogic.getTodosNivelCuentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNivelCuentas("Todos",nivelcuentaLogic.getNivelCuentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							nivelcuentaLogic.setNivelCuentas(new ArrayList<NivelCuenta>());					
							nivelcuentaLogic.getNivelCuentas().addAll(nivelcuentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentas=new ArrayList<NivelCuenta>();
							nivelcuentas.addAll(nivelcuentasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNivelCuenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNivelCuenta=this.idActual;
				
				} else if(this.idNivelCuentaActual!=null && this.idNivelCuentaActual!=0L) {
					idNivelCuenta=idNivelCuentaActual;
				}
				
					
				this.sDetalleReporte=NivelCuentaConstantesFunciones.getDetalleIndicePorId(idNivelCuenta);
				
				this.nivelcuentas=new ArrayList<NivelCuenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					nivelcuentaLogic.getEntity(idNivelCuenta);
					
					//nivelcuentaLogic.getEntityWithConnection(idNivelCuenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcuentaLogic.setNivelCuentas(new ArrayList<NivelCuenta>());
					nivelcuentaLogic.getNivelCuentas().add(nivelcuentaLogic.getNivelCuenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcuentas=new ArrayList<NivelCuenta>();
					this.nivelcuentas.add(nivelcuenta);
				}
				
				if(nivelcuentaLogic.getNivelCuenta()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNivelCuenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNivelCuenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivelcuentaLogic.getNivelCuentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcuentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=nivelcuentaLogic.getNivelCuentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=nivelcuentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NivelCuenta nivelcuenta) {
		Boolean permite=true;
		
		if(this.nivelcuenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NivelCuentaConstantesFunciones.getOrderByListaNivelCuenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NivelCuentaConstantesFunciones.getOrderByListaNivelCuenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuenta nivelcuenta:nivelcuentaLogic.getNivelCuentas()) {
				if(nivelcuenta.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentaTotales=nivelcuenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuenta nivelcuenta:this.nivelcuentas) {
				if(nivelcuenta.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentaTotales=nivelcuenta;
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
			this.nivelcuentaAux=new NivelCuenta();
			this.nivelcuentaAux.setsType(Constantes2.S_TOTALES);
			this.nivelcuentaAux.setIsNew(false);
			this.nivelcuentaAux.setIsChanged(false);
			this.nivelcuentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NivelCuentaConstantesFunciones.TotalizarValoresFilaNivelCuenta(this.nivelcuentaLogic.getNivelCuentas(),this.nivelcuentaAux);
				
				this.nivelcuentaLogic.getNivelCuentas().add(this.nivelcuentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NivelCuentaConstantesFunciones.TotalizarValoresFilaNivelCuenta(this.nivelcuentas,this.nivelcuentaAux);
				
				this.nivelcuentas.add(this.nivelcuentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		nivelcuentaTotales=new NivelCuenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivelcuentaLogic.getNivelCuentas().remove(nivelcuentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.nivelcuentas.remove(nivelcuentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		nivelcuentaTotales=new NivelCuenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NivelCuenta nivelcuenta:nivelcuentaLogic.getNivelCuentas()) {
				if(nivelcuenta.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentaTotales=nivelcuenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelCuentaConstantesFunciones.TotalizarValoresFilaNivelCuenta(this.nivelcuentaLogic.getNivelCuentas(),nivelcuentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NivelCuenta nivelcuenta:this.nivelcuentas) {
				if(nivelcuenta.getsType().equals(Constantes2.S_TOTALES)) {
					nivelcuentaTotales=nivelcuenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NivelCuentaConstantesFunciones.TotalizarValoresFilaNivelCuenta(this.nivelcuentas,nivelcuentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNivelCuentaPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getNivelCuentaPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcuentaLogic.getNivelCuentaPorNombre(nombre);
				
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
	
	public void inicializarPermisosNivelCuenta() {
		this.isPermisoTodoNivelCuenta=false;
		this.isPermisoNuevoNivelCuenta=false;
		this.isPermisoActualizarNivelCuenta=false;
		this.isPermisoActualizarOriginalNivelCuenta=false;
		this.isPermisoEliminarNivelCuenta=false;
		this.isPermisoGuardarCambiosNivelCuenta=false;
		this.isPermisoConsultaNivelCuenta=false;
		this.isPermisoBusquedaNivelCuenta=false;
		this.isPermisoReporteNivelCuenta=false;		
		this.isPermisoOrdenNivelCuenta=false;		
		this.isPermisoPaginacionMedioNivelCuenta=false;		
		this.isPermisoPaginacionAltoNivelCuenta=false;
		this.isPermisoPaginacionTodoNivelCuenta=false;
		this.isPermisoCopiarNivelCuenta=false;		
		this.isPermisoVerFormNivelCuenta=false;		
		this.isPermisoDuplicarNivelCuenta=false;		
		this.isPermisoOrdenNivelCuenta=false;		
	}
	
	public void setPermisosUsuarioNivelCuenta(Boolean isPermiso) {
		this.isPermisoTodoNivelCuenta=isPermiso;
		this.isPermisoNuevoNivelCuenta=isPermiso;
		this.isPermisoActualizarNivelCuenta=isPermiso;
		this.isPermisoActualizarOriginalNivelCuenta=isPermiso;
		this.isPermisoEliminarNivelCuenta=isPermiso;
		this.isPermisoGuardarCambiosNivelCuenta=isPermiso;
		this.isPermisoConsultaNivelCuenta=isPermiso;
		this.isPermisoBusquedaNivelCuenta=isPermiso;
		this.isPermisoReporteNivelCuenta=isPermiso;
		this.isPermisoOrdenNivelCuenta=isPermiso;		
		this.isPermisoPaginacionMedioNivelCuenta=isPermiso;		
		this.isPermisoPaginacionAltoNivelCuenta=isPermiso;		
		this.isPermisoPaginacionTodoNivelCuenta=isPermiso;		
		this.isPermisoCopiarNivelCuenta=isPermiso;		
		this.isPermisoVerFormNivelCuenta=isPermiso;		
		this.isPermisoDuplicarNivelCuenta=isPermiso;
		this.isPermisoOrdenNivelCuenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNivelCuenta(Boolean isPermiso) {
		//this.isPermisoTodoNivelCuenta=isPermiso;
		this.isPermisoNuevoNivelCuenta=isPermiso;
		this.isPermisoActualizarNivelCuenta=isPermiso;
		this.isPermisoActualizarOriginalNivelCuenta=isPermiso;
		this.isPermisoEliminarNivelCuenta=isPermiso;
		this.isPermisoGuardarCambiosNivelCuenta=isPermiso;
		//this.isPermisoConsultaNivelCuenta=isPermiso;
		//this.isPermisoBusquedaNivelCuenta=isPermiso;
		//this.isPermisoReporteNivelCuenta=isPermiso;
		//this.isPermisoOrdenNivelCuenta=isPermiso;		
		//this.isPermisoPaginacionMedioNivelCuenta=isPermiso;		
		//this.isPermisoPaginacionAltoNivelCuenta=isPermiso;		
		//this.isPermisoPaginacionTodoNivelCuenta=isPermiso;		
		//this.isPermisoCopiarNivelCuenta=isPermiso;		
		//this.isPermisoDuplicarNivelCuenta=isPermiso;
		//this.isPermisoOrdenNivelCuenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNivelCuentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CuentaContableConstantesFunciones.SNOMBREOPCION);
		
		if(NivelCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCuentaContable=false;
		this.isTienePermisosCuentaContable=this.verificarGetPermisosUsuarioOpcionNivelCuentaClaseRelacionada(this.opcionsRelacionadas,CuentaContableConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebNivelCuenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNivelCuentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCuentaContable=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioNivelCuentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNivelCuentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNivelCuentaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCuentaContable && this.jInternalFrameDetalleFormNivelCuenta!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.remove(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioNivelCuenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NivelCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NivelCuentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNivelCuenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNivelCuenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNivelCuenta=this.isPermisoActualizarNivelCuenta;
			this.isPermisoEliminarNivelCuenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNivelCuenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNivelCuenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNivelCuenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNivelCuenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNivelCuenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelCuenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNivelCuenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNivelCuenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNivelCuenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNivelCuenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNivelCuenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNivelCuenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNivelCuenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNivelCuenta.setToolTipText(this.jTableDatosNivelCuenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNivelCuenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNivelCuenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NivelCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NivelCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNivelCuenta() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCuentaContable && this.nivelcuentaConstantesFunciones.mostrarCuentaContableNivelCuenta && !NivelCuentaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Contable");
			reporte.setsDescripcion("Cuenta Contable");
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
	
		
	public void inicializarCombosForeignKeyNivelCuentaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNivelCuentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NivelCuentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNivelCuentaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyNivelCuentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNivelCuenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyNivelCuenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNivelCuenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNivelCuenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCuenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNivelCuenta(NivelCuenta nivelcuenta)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNivelCuenta(NivelCuenta nivelcuenta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNivelCuenta()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNivelCuenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNivelCuenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNivelCuenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNivelCuenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNivelCuenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNivelCuenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNivelCuenta()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public NivelCuentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NivelCuentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NivelCuentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.nivelcuentaSessionBean=new NivelCuentaSessionBean(); 
		this.nivelcuentaConstantesFunciones=new NivelCuentaConstantesFunciones(); 
		this.nivelcuentaBean=new NivelCuenta();//(this.nivelcuentaConstantesFunciones); 		
		this.nivelcuentaReturnGeneral=new NivelCuentaParameterReturnGeneral(); 
		
		this.nivelcuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NivelCuentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NivelCuentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NivelCuentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNivelCuenta(true);
			
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
			
			this.nivelcuentaConstantesFunciones=new NivelCuentaConstantesFunciones(); 
			this.nivelcuentaBean=new NivelCuenta();//this.nivelcuentaConstantesFunciones); 			
			this.nivelcuentaReturnGeneral=new NivelCuentaParameterReturnGeneral(); 
		
			NivelCuentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Cuenta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.nivelcuenta=new NivelCuenta();
			this.nivelcuentas = new ArrayList<NivelCuenta>();
			this.nivelcuentasAux = new ArrayList<NivelCuenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic=new NivelCuentaLogic();
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			//this.nivelcuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.nivelcuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNivelCuenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelCuenta);	
					}
					
					if(this.jInternalFrameImportacionNivelCuenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelCuenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNivelCuenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNivelCuenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelCuenta);
				this.jInternalFrameDetalleFormNivelCuenta.setVisible(false);
				this.jInternalFrameDetalleFormNivelCuenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelCuenta);
					this.jInternalFrameReporteDinamicoNivelCuenta.setVisible(false);
					this.jInternalFrameReporteDinamicoNivelCuenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNivelCuenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNivelCuenta);
					this.jInternalFrameImportacionNivelCuenta.setVisible(false);
					this.jInternalFrameImportacionNivelCuenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNivelCuenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNivelCuenta);
					this.jInternalFrameOrderByNivelCuenta.setVisible(false);
					this.jInternalFrameOrderByNivelCuenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNivelCuentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NivelCuentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.nivelcuentaReturnGeneral=new NivelCuentaParameterReturnGeneral();
			
			this.nivelcuentaParameterGeneral=new NivelCuentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.nivelcuentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NivelCuentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CuentaContableConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelCuentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivelcuentaSessionBean.getEsGuardarRelacionado(),this.nivelcuentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NivelCuentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.nivelcuentaSessionBean.getEsGuardarRelacionado(),this.nivelcuentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNivelCuenta=false;
			this.isVisibilidadCeldaDuplicarNivelCuenta=true;
			this.isVisibilidadCeldaCopiarNivelCuenta=true;
			this.isVisibilidadCeldaVerFormNivelCuenta=true;
			this.isVisibilidadCeldaOrdenNivelCuenta=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
			this.isVisibilidadCeldaModificarNivelCuenta=false;
			this.isVisibilidadCeldaActualizarNivelCuenta=false;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
			this.isVisibilidadCeldaCancelarNivelCuenta=false;
			this.isVisibilidadCeldaGuardarNivelCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNivelCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNivelCuenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNivelCuenta(false);
			
			this.setPermisosUsuarioNivelCuenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado() 
				|| (this.nivelcuentaSessionBean.getEsGuardarRelacionado() && this.nivelcuentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNivelCuentaClasesRelacionadas();
			}
			
			if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNivelCuentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNivelCuenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNivelCuenta();
			}
			
			if(!this.isPermisoBusquedaNivelCuenta) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNivelCuenta,this.isPermisoPaginacionMedioNivelCuenta,this.isPermisoPaginacionTodoNivelCuenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NivelCuentaConstantesFunciones.getTiposSeleccionarNivelCuenta());
				
				this.tiposColumnasSelect=NivelCuentaConstantesFunciones.getTiposSeleccionarNivelCuenta(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectNivelCuenta();				
				//this.tiposRelacionesSelect=NivelCuentaConstantesFunciones.getTiposRelacionesNivelCuenta(true);
				
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
			//if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNivelCuenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioNivelCuenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioNivelCuenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuenta() ;
			
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
			
			
			this.cuentacontableLogic=new CuentaContableLogic(); 
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
				nivelcuentaImplementable= (NivelCuentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelCuentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				nivelcuentaImplementableHome= (NivelCuentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NivelCuentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.nivelcuentas= new ArrayList<NivelCuenta>();
			this.nivelcuentasEliminados= new ArrayList<NivelCuenta>();
						
			this.isEsNuevoNivelCuenta=false;
			this.esParaAccionDesdeFormularioNivelCuenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNivelCuenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNivelCuenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NivelCuentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NivelCuentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNivelCuenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNivelCuenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNivelCuenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNivelCuenta();
			}
			
			NivelCuentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNivelCuenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NivelCuenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNivelCuenta() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaContableConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesNivelCuenta")) {
				iIndex=this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();	
				
				

				if(sTitle.equals("Cuenta Contables")) {
					if(!CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNivelCuenta();

						this.cargarParteTabPanelRelacionadaCuentaContable(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNivelCuenta();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuentaContable(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNivelCuenta.cargarSessionConBeanSwingJInternalFrameCuentaContable(false,true,iIndex);
		this.jButtonCuentaContableActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaContable();

		//this.jTabbedPaneRelacionesNivelCuenta.updateUI();
		//this.jTabbedPaneRelacionesNivelCuenta.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNivelCuenta.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CuentaContable")) {
				int row=this.jTableDatosNivelCuenta.getSelectedRow();
				jButtonCuentaContableActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cuenta Contable")) {

					if(this.isTienePermisosCuentaContable && this.nivelcuentaConstantesFunciones.mostrarCuentaContableNivelCuenta && !NivelCuentaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Contables"+"("+CuentaContableConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Contables");

						if(nivelcuentaConstantesFunciones.resaltarCuentaContableNivelCuenta!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(nivelcuentaConstantesFunciones.resaltarCuentaContableNivelCuenta);
						}

						jmenuItem.setEnabled(this.nivelcuentaConstantesFunciones.activarCuentaContableNivelCuenta);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaContable"));

						

						this.jInternalFrameDetalleFormNivelCuenta.jmenuDetalleNivelCuenta.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyNivelCuenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNivelCuenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNivelCuenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNivelCuentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNivelCuenta();
		
		this.cargarCombosFrameForeignKeyNivelCuenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNivelCuenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNivelCuenta();
		}
	}
	
	
	
	public void jButtonNuevoNivelCuentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
			
			if(jTableDatosNivelCuenta.getRowCount()>=1) {
				jTableDatosNivelCuenta.removeRowSelectionInterval(0, jTableDatosNivelCuenta.getRowCount()-1);						
			}
			
			this.isEsNuevoNivelCuenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNivelCuenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNivelCuenta(true);			
			//this.nivelcuenta=new NivelCuenta();
			//this.nivelcuenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCuenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuenta() ;
			
			if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCuenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.nivelcuenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);				
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
			if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NivelCuenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNivelCuentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNivelCuenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNivelCuenta.getSelectedRows().length;			
			}
			
			nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNivelCuenta--;			
				//NivelCuenta nivelcuentaAux= new NivelCuenta();			
				//nivelcuentaAux.setId(this.iIdNuevoNivelCuenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NivelCuenta nivelcuentaOrigen=new NivelCuenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NivelCuenta nivelcuentaOrigen : nivelcuentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							nivelcuentaOrigen =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							nivelcuentaOrigen =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNivelCuenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.nivelcuenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNivelCuenta(nivelcuentaOrigen,this.nivelcuenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivelcuentaLogic.getNivelCuentas().add(this.nivelcuentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivelcuentas.add(this.nivelcuentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNivelCuenta(false);
				
				this.jTableDatosNivelCuenta.setRowSelectionInterval(this.getIndiceNuevoNivelCuenta(), this.getIndiceNuevoNivelCuenta());
				
				int iLastRow =  this.jTableDatosNivelCuenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelCuenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelCuenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCuenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();									
		
			NivelCuenta nivelcuentaOrigen=new NivelCuenta();
			NivelCuenta nivelcuentaDestino=new NivelCuenta();
				
			nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNivelCuenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || nivelcuentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNivelCuenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentaOrigen =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivelcuentaOrigen =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						nivelcuentaDestino =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						nivelcuentaDestino =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				nivelcuentaOrigen =nivelcuentasSeleccionados.get(0);
				nivelcuentaDestino =nivelcuentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNivelCuenta(nivelcuentaOrigen,nivelcuentaDestino,true,false);
				
				nivelcuentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(nivelcuentaDestino,nivelcuentaLogic.getNivelCuentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(nivelcuentaDestino,nivelcuentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNivelCuenta(false);
				
				//this.jTableDatosNivelCuenta.setRowSelectionInterval(this.getIndiceNuevoNivelCuenta(), this.getIndiceNuevoNivelCuenta());
				
				int iLastRow =  this.jTableDatosNivelCuenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNivelCuenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNivelCuenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCuenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNivelCuenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNivelCuenta.isVisible();
			
			
			this.jPanelParametrosReportesNivelCuenta.setVisible(!isVisible);
			this.jPanelPaginacionNivelCuenta.setVisible(!isVisible);
			this.jPanelAccionesNivelCuenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNivelCuenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNivelCuenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNivelCuenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNivelCuenta();
			
			this.abrirFrameOrderByNivelCuenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNivelCuenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNivelCuenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelCuenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNivelCuenta.isMaximum()) {
					this.jInternalFrameDetalleFormNivelCuenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNivelCuenta.setSize(this.jInternalFrameDetalleFormNivelCuenta.iWidthFormulario,this.jInternalFrameDetalleFormNivelCuenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNivelCuenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNivelCuenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNivelCuenta.isMaximum()) {
						this.jInternalFrameDetalleFormNivelCuenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNivelCuenta.jContentPaneDetalleNivelCuenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNivelCuenta.jContentPaneDetalleNivelCuenta.getWidth(),NivelCuentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNivelCuenta.jContentPaneDetalleNivelCuenta.getWidth(),NivelCuentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNivelCuenta.jContentPaneDetalleNivelCuenta.getWidth(),NivelCuentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaContable();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNivelCuenta.setVisible(true);
	        this.jInternalFrameDetalleFormNivelCuenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNivelCuenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNivelCuenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNivelCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuenta,false,this);
				} else {
					this.jInternalFrameOrderByNivelCuenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNivelCuenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNivelCuenta);
				this.jInternalFrameOrderByNivelCuenta.setVisible(false);
				this.jInternalFrameOrderByNivelCuenta.setSelected(false);
				
				this.jInternalFrameOrderByNivelCuenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelCuenta"));
				
				this.inicializarActualizarBindingTablaOrderByNivelCuenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNivelCuenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNivelCuenta==null) {
				
				this.jInternalFrameImportacionNivelCuenta=new ImportacionJInternalFrame(NivelCuentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNivelCuenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNivelCuenta);
				this.jInternalFrameImportacionNivelCuenta.setVisible(false);
				this.jInternalFrameImportacionNivelCuenta.setSelected(false);


				this.jInternalFrameImportacionNivelCuenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelCuenta"));
				this.jInternalFrameImportacionNivelCuenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelCuenta"));
				this.jInternalFrameImportacionNivelCuenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelCuenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNivelCuenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNivelCuenta==null) {
				this.jInternalFrameReporteDinamicoNivelCuenta=new ReporteDinamicoJInternalFrame(NivelCuentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNivelCuenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNivelCuenta);
				this.jInternalFrameReporteDinamicoNivelCuenta.setVisible(false);
				this.jInternalFrameReporteDinamicoNivelCuenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNivelCuenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCuenta"));
				this.jInternalFrameReporteDinamicoNivelCuenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCuenta"));
				this.jInternalFrameReporteDinamicoNivelCuenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCuenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCuenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuentaContable() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNivelCuenta.jContentPaneDetalleNivelCuenta.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleNivelCuenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNivelCuenta);
			
	       	this.jInternalFrameDetalleFormNivelCuenta.setVisible(false);
	        this.jInternalFrameDetalleFormNivelCuenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormNivelCuenta.dispose();
			//this.jInternalFrameDetalleFormNivelCuenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNivelCuenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNivelCuenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoNivelCuenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNivelCuenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNivelCuenta.setVisible(true);
	        this.jInternalFrameImportacionNivelCuenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNivelCuenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNivelCuenta.setVisible(true);
	        this.jInternalFrameOrderByNivelCuenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNivelCuenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNivelCuenta.setVisible(false);
	        this.jInternalFrameOrderByNivelCuenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNivelCuenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNivelCuenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoNivelCuenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNivelCuenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNivelCuenta.setVisible(false);
	        this.jInternalFrameImportacionNivelCuenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNivelCuenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNivelCuenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNivelCuenta(true);
			//this.isEsNuevoNivelCuenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNivelCuenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCuenta(false) ;
			
			if(nivelcuentaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getEsGuardarRelacionado() && CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContableActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCuenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNivelCuentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNivelCuenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNivelCuenta(true);
			//this.isEsNuevoNivelCuenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.nivelcuenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNivelCuenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNivelCuenta(false) ;
			
			if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNivelCuenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNivelCuenta(false);
			
			//if(!this.isEsNuevoNivelCuenta) {								
				int intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
				
			}
			
			if(this.permiteMantenimiento(this.nivelcuenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNivelCuenta=true;
					this.inicializarActualizarBindingTablaNivelCuenta(false);
					this.isEsNuevoNivelCuenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNivelCuenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNivelCuenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelCuenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCuenta(false);
				
				this.habilitarDeshabilitarControlesNivelCuenta(false);
			
												
				
				if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNivelCuenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNivelCuentaActionPerformed(evt,nivelcuentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNivelCuenta(this.nivelcuenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNivelCuenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,nivelcuentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.nivelcuenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNivelCuentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				this.nivelcuenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				this.nivelcuenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.nivelcuenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NivelCuentaModel) this.jTableDatosNivelCuenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNivelCuenta=true;
				this.inicializarActualizarBindingTablaNivelCuenta(false);
				this.isEsNuevoNivelCuenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNivelCuenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCuenta(false);
				
				this.habilitarDeshabilitarControlesNivelCuenta(false);
				
				
				
				if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNivelCuenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNivelCuentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNivelCuenta.getRowCount()>=1) {
				jTableDatosNivelCuenta.removeRowSelectionInterval(0, jTableDatosNivelCuenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNivelCuenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNivelCuenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNivelCuenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNivelCuenta(false) ;
			
			this.isEsNuevoNivelCuenta=false;
			
			if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNivelCuenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNivelCuenta(false);
				
				//SI ES MANUAL
				if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNivelCuenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNivelCuenta--;			
			//NivelCuenta nivelcuentaAux= new NivelCuenta();			
			//nivelcuentaAux.setId(this.iIdNuevoNivelCuenta);
			
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNivelCuenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
			
			this.nivelcuenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.nivelcuentaLogic.getNivelCuentas().add(this.nivelcuentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.nivelcuentas.add(this.nivelcuentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNivelCuenta(false);
			
			this.jTableDatosNivelCuenta.setRowSelectionInterval(this.getIndiceNuevoNivelCuenta(), this.getIndiceNuevoNivelCuenta());
			
			int iLastRow =  this.jTableDatosNivelCuenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNivelCuenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNivelCuenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNivelCuenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNivelCuenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuenta(false);
			
			//SI ES MANUAL
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCuenta();
			}
			
			//this.abrirFrameTreeNivelCuenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Nivel CuentaS ?", "MANTENIMIENTO DE Nivel Cuenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNivelCuenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNivelCuenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.nivelcuentaReturnGeneral=nivelcuentaLogic.procesarImportacionNivelCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.nivelcuentaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNivelCuentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNivelCuenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNivelCuenta.setFileImportacion(this.jInternalFrameImportacionNivelCuenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNivelCuenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNivelCuenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNivelCuenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNivelCuenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		

		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NivelCuentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NivelCuentaBaseDesign.jrxml";
			
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
			
			this.generarReporteNivelCuentas("Todos",nivelcuentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelCuentaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoNivelCuenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NivelCuentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NivelCuentaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NivelCuentaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoNivelCuentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NivelCuentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NivelCuentaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NivelCuentaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(NivelCuenta nivelcuenta:nivelcuentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(nivelcuenta.getnombre());
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
			//	this.getFilaCabeceraExportarExcelNivelCuenta(row);				
			//	iRow++;
			//}				
			
			//for(NivelCuenta nivelcuentaAux:nivelcuentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNivelCuenta(nivelcuentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
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
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuenta(false);
			
			//SI ES MANUAL
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNivelCuenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuenta(false);
			
			//SI ES MANUAL
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelCuenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNivelCuentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNivelCuenta(false);
			
			//SI ES MANUAL
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNivelCuenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.nivelcuentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNivelCuenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNivelCuenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNivelCuenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNivelCuenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNivelCuenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNivelCuenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosNivelCuenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosNivelCuenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNivelCuenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNivelCuenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNivelCuenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNivelCuenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNivelCuenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNivelCuenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNivelCuenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNivelCuenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNivelCuenta();
		
		this.inicializarActualizarBindingBotonesManualNivelCuenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNivelCuenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCuenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCuenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNivelCuenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNivelCuenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNivelCuenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNivelCuenta.jCheckBoxPostAccionNuevoNivelCuenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNivelCuenta.jCheckBoxPostAccionSinCerrarNivelCuenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNivelCuenta.jCheckBoxPostAccionSinMensajeNivelCuenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNivelCuenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNivelCuenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNivelCuenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
				this.jInternalFrameDetalleFormNivelCuenta.jCheckBoxPostAccionNuevoNivelCuenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNivelCuenta.jCheckBoxPostAccionSinCerrarNivelCuenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNivelCuenta.jCheckBoxPostAccionSinMensajeNivelCuenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNivelCuenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNivelCuenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNivelCuenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNivelCuenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNivelCuenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNivelCuenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNivelCuenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNivelCuenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNivelCuenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNivelCuenta(Boolean esInicializar) throws Exception {
		try	{	
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNivelCuenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNivelCuenta() throws Exception {
		try	{
			if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelCuenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelCuenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNivelCuenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNivelCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNivelCuenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNivelCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNivelCuenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNivelCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNivelCuenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNivelCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNivelCuenta.addItem(reporte);
			}
			
			
			if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNivelCuenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNivelCuenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNivelCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNivelCuenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNivelCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNivelCuenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNivelCuenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNivelCuenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNivelCuenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCuenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNivelCuenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
				this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
				this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNivelCuenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelCuenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNivelCuenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNivelCuenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNivelCuenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNivelCuenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNivelCuenta(Boolean esInicializar) throws Exception {				
		if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNivelCuenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNivelCuenta() throws Exception {
		this.inicializarActualizarBindingTablaNivelCuenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNivelCuenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NivelCuentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NivelCuentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNivelCuentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NivelCuentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NivelCuentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNivelCuenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=nivelcuentaLogic.getNivelCuentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=nivelcuentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNivelCuenta.setModel(new NivelCuentaModel(this.nivelcuentaLogic.getNivelCuentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNivelCuenta.setModel(new NivelCuentaModel(this.nivelcuentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNivelCuenta!=null && this.jInternalFrameOrderByNivelCuenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNivelCuenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNivelCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NivelCuentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO,nivelcuentaConstantesFunciones.resaltarSeleccionarNivelCuenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO,nivelcuentaConstantesFunciones.resaltarSeleccionarNivelCuenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNivelCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuenta,NivelCuentaConstantesFunciones.LABEL_ID));

		if(this.nivelcuentaConstantesFunciones.mostraridNivelCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCuentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.nivelcuentaConstantesFunciones.resaltaridNivelCuenta,this.nivelcuentaConstantesFunciones.activaridNivelCuenta,this,true,"idNivelCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcuentaConstantesFunciones.resaltaridNivelCuenta,this.nivelcuentaConstantesFunciones.activaridNivelCuenta,this,true,"idNivelCuenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNivelCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNivelCuenta,NivelCuentaConstantesFunciones.LABEL_NOMBRE));

		if(this.nivelcuentaConstantesFunciones.mostrarnombreNivelCuenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NivelCuentaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.nivelcuentaConstantesFunciones.resaltarnombreNivelCuenta,this.nivelcuentaConstantesFunciones.activarnombreNivelCuenta,this,true,"nombreNivelCuenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.nivelcuentaConstantesFunciones.resaltarnombreNivelCuenta,this.nivelcuentaConstantesFunciones.activarnombreNivelCuenta,this,true,"nombreNivelCuenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NivelCuentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCuentaContable && this.nivelcuentaConstantesFunciones.mostrarCuentaContableNivelCuenta && !NivelCuentaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Contables");
				tableColumn.setHeaderValue("Cuenta Contables");
				tableColumn.setCellRenderer(new CuentaContableTableCell(nivelcuentaConstantesFunciones.resaltarCuentaContableNivelCuenta,this,this.nivelcuentaConstantesFunciones.activarCuentaContableNivelCuenta));
				tableColumn.setCellEditor(new CuentaContableTableCell(nivelcuentaConstantesFunciones.resaltarCuentaContableNivelCuenta,this,this.nivelcuentaConstantesFunciones.activarCuentaContableNivelCuenta));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNivelCuenta.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivelcuentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivelcuentaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelCuenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.nivelcuentaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.nivelcuentaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNivelCuenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.nivelcuentaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.nivelcuentaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNivelCuenta.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosNivelCuenta.addColumn(tableColumn);
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
			
			this.jTableDatosNivelCuenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.nivelcuentaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNivelCuenta.moveColumn(this.jTableDatosNivelCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNivelCuenta.moveColumn(this.jTableDatosNivelCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.nivelcuentaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosNivelCuenta.moveColumn(this.jTableDatosNivelCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNivelCuenta.moveColumn(this.jTableDatosNivelCuenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNivelCuenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNivelCuenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNivelCuenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNivelCuenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNivelCuenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNivelCuenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNivelCuenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNivelCuenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=nivelcuentaLogic.getNivelCuentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=nivelcuentas.size()-1;
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
		//this.jTableDatosNivelCuenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNivelCuenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNivelCuenta();
			
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
				
				//this.isEsNuevoNivelCuenta=false;
					
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
				if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNivelCuenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelCuenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelCuenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.nivelcuenta.getsType().equals("DUPLICADO")
				   || this.nivelcuenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNivelCuenta=true;
				
				} else {
					this.isEsNuevoNivelCuenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
					if(this.nivelcuenta.getId()>=0 && !this.nivelcuenta.getIsNew()) {						
						this.isEsNuevoNivelCuenta=false;
						
					} else {
						this.isEsNuevoNivelCuenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNivelCuenta(esRelaciones);						
				
				this.seleccionarNivelCuenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.nivelcuenta.getId()<0) {
					this.isEsNuevoNivelCuenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNivelCuenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNivelCuenta(evt,rowIndex);
				}	
				
				if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NivelCuenta: " + this.dDif); 
					}
				}								
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNivelCuenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.nivelcuenta)) {
					if(this.nivelcuenta.getId()>0) {
						this.nivelcuenta.setIsDeleted(true);
						
						this.nivelcuentasEliminados.add(this.nivelcuenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.nivelcuentaLogic.getNivelCuentas().remove(this.nivelcuenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.nivelcuentas.remove(this.nivelcuenta);				
					}
					
					
					((NivelCuentaModel) this.jTableDatosNivelCuenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNivelCuenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNivelCuenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNivelCuenta) {
			
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNivelCuenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNivelCuenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNivelCuenta(this.nivelcuenta);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNivelCuenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNivelCuenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNivelCuenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelCuenta(NivelCuenta nivelcuenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNivelCuenta(nivelcuenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNivelCuenta(NivelCuenta nivelcuenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNivelCuenta(nivelcuenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNivelCuenta(nivelcuenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNivelCuenta(nivelcuenta);
	}
	
	public void setVariablesObjetoActualToFormularioNivelCuenta(NivelCuenta nivelcuenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.setText(nivelcuenta.getId().toString());
			this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.setText(nivelcuenta.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NivelCuenta nivelcuentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,nivelcuentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NivelCuenta nivelcuentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				nivelcuentaLocal=this.nivelcuenta;
			} else {
				nivelcuentaLocal=this.nivelcuentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(nivelcuentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNivelCuenta(nivelcuentaLocal,true);
					
					if(nivelcuentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(nivelcuentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(nivelcuentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNivelCuenta(NivelCuenta nivelcuenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelCuenta(nivelcuenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(nivelcuenta);
	}
	
	public void setVariablesFormularioToObjetoActualNivelCuenta(NivelCuenta nivelcuenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNivelCuenta(nivelcuenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNivelCuenta(NivelCuenta nivelcuenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.getText()==null || this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.getText()=="" || this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.getText()=="Id") {
				this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.setText("0");
			}

			if(conColumnasBase) {nivelcuenta.setId(Long.parseLong(this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCuentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuenta.jLabelIdNivelCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			nivelcuenta.setnombre(this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NivelCuentaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNivelCuenta.jLabelnombreNivelCuenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNivelCuenta(NivelCuenta nivelcuentaBean,NivelCuenta nivelcuenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNivelCuenta(NivelCuenta nivelcuentaOrigen,NivelCuenta nivelcuenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivelcuentaOrigen.getId()!=null && !nivelcuentaOrigen.getId().equals(0L))) {nivelcuenta.setId(nivelcuentaOrigen.getId());}}
			if(conDefault || (!conDefault && nivelcuentaOrigen.getnombre()!=null && !nivelcuentaOrigen.getnombre().equals(""))) {nivelcuenta.setnombre(nivelcuentaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelCuenta(NivelCuenta nivelcuenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.setText(nivelcuenta.getId().toString());
			this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.setText(nivelcuenta.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNivelCuenta(NivelCuentaBean nivelcuentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.setText(nivelcuentaBean.getId().toString());
			this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.setText(nivelcuentaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNivelCuenta(NivelCuentaParameterReturnGeneral nivelcuentaReturnGeneral,NivelCuentaBean nivelcuentaBean,Boolean conDefault) throws Exception { 
		try {
			NivelCuenta nivelcuentaLocal=new NivelCuenta();
			
			nivelcuentaLocal=nivelcuentaReturnGeneral.getNivelCuenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && nivelcuentaLocal.getId()!=null && !nivelcuentaLocal.getId().equals(0L))) {nivelcuentaBean.setId(nivelcuentaLocal.getId());}}
			if(conDefault || (!conDefault && nivelcuentaLocal.getnombre()!=null && !nivelcuentaLocal.getnombre().equals(""))) {nivelcuentaBean.setnombre(nivelcuentaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNivelCuentaGenerico(Long idNivelCuentaSeleccionado,JComboBox jComboBoxNivelCuenta,List<NivelCuenta> nivelcuentasLocal)throws Exception {
		try {
			NivelCuenta  nivelcuentaTemp=null;

			for(NivelCuenta nivelcuentaAux:nivelcuentasLocal) {
				if(nivelcuentaAux.getId()!=null && nivelcuentaAux.getId().equals(idNivelCuentaSeleccionado)) {
					nivelcuentaTemp=nivelcuentaAux;
					break;
				}
			}

			jComboBoxNivelCuenta.setSelectedItem(nivelcuentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNivelCuentaGenerico(JComboBox jComboBoxNivelCuenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNivelCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNivelCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNivelCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelCuenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNivelCuenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNivelCuenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNivelCuenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNivelCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNivelCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CuentaContable")) {
			jButtonCuentaContableActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcuenta=(NivelCuenta) nivelcuentaLogic.getNivelCuentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivelcuenta =(NivelCuenta) nivelcuentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NivelCuenta nivelcuentaRow=new NivelCuenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcuentaRow=(NivelCuenta) nivelcuentaLogic.getNivelCuentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			nivelcuentaRow=(NivelCuenta) nivelcuentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCuentaContableActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NivelCuenta nivelcuenta) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNivelCuenta==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuenta = (NivelCuenta)this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.nivelcuenta = (NivelCuenta)this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(nivelcuenta!=null) {
						this.nivelcuenta = nivelcuenta;
					} else {
						this.nivelcuenta = new NivelCuenta();
					}
				}

				if(this.isTienePermisosCuentaContable && this.permiteMantenimiento(this.nivelcuenta)) {
					CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFramePopup=new CuentaContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentacontableBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFramePopup;
					} else {
						cuentacontableBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame;
					}

					List<NivelCuenta> nivelcuentas=new ArrayList<NivelCuenta>();
					nivelcuentas.add(this.nivelcuenta);
					if(!esRelacionado) {
						//cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setConGuardarRelaciones(false);
						//cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentacontableBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNivelCuenta.cargarCuentaContableBeanSwingJInternalFrame(nivelcuentas,this.nivelcuenta,cuentacontableBeanSwingJInternalFrame,/*conInicializar,*/cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getConGuardarRelaciones(),cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.getEsGuardarRelacionado());
					cuentacontableBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContable("no_relacionado");

						cuentacontableBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaContableConstantesFunciones.ITAMANIOFILATABLA + (CuentaContableConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentacontableBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNivelCuenta=(TitledBorder)this.jScrollPanelDatosNivelCuenta.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderNivelCuenta.getTitle() + " -> Cuenta Contable");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}

						cuentacontableBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

						cuentacontableBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Contable",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNivelCuenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoNivelCuenta && this.isPermisoNuevoNivelCuenta));			
			this.jButtonDuplicarNivelCuenta.setVisible((this.isVisibilidadCeldaDuplicarNivelCuenta && this.isPermisoDuplicarNivelCuenta));			
			this.jButtonCopiarNivelCuenta.setVisible((this.isVisibilidadCeldaCopiarNivelCuenta && this.isPermisoCopiarNivelCuenta));
			this.jButtonVerFormNivelCuenta.setVisible((this.isVisibilidadCeldaVerFormNivelCuenta && this.isPermisoVerFormNivelCuenta));
			
			this.jButtonAbrirOrderByNivelCuenta.setVisible((this.isVisibilidadCeldaOrdenNivelCuenta && this.isPermisoOrdenNivelCuenta));			
			
			this.jButtonNuevoRelacionesNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCuenta && this.isPermisoNuevoNivelCuenta));			
			this.jButtonNuevoGuardarCambiosNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoNivelCuenta && this.isPermisoNuevoNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));
			
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarNivelCuenta.setVisible((this.isVisibilidadCeldaModificarNivelCuenta && this.isPermisoActualizarNivelCuenta));	
			this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarNivelCuenta.setVisible((this.isVisibilidadCeldaActualizarNivelCuenta && this.isPermisoActualizarNivelCuenta));	
			this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarNivelCuenta.setVisible((this.isVisibilidadCeldaEliminarNivelCuenta && this.isPermisoEliminarNivelCuenta));
			this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarNivelCuenta.setVisible(this.isVisibilidadCeldaCancelarNivelCuenta);							
			this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.setVisible((this.isVisibilidadCeldaGuardarNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaNivelCuenta.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoNivelCuenta && this.isPermisoNuevoNivelCuenta));						
			this.jButtonDuplicarToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaDuplicarNivelCuenta && this.isPermisoDuplicarNivelCuenta));						
			this.jButtonCopiarToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaCopiarNivelCuenta && this.isPermisoCopiarNivelCuenta));			
			this.jButtonVerFormToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaVerFormNivelCuenta && this.isPermisoVerFormNivelCuenta));			
			this.jButtonAbrirOrderByToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaOrdenNivelCuenta && this.isPermisoOrdenNivelCuenta));
			this.jButtonNuevoRelacionesToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCuenta && this.isPermisoNuevoNivelCuenta));			
			this.jButtonNuevoGuardarCambiosToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoNivelCuenta && this.isPermisoNuevoNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));			
			
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaModificarNivelCuenta && this.isPermisoActualizarNivelCuenta));	
			this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaActualizarNivelCuenta  && this.isPermisoActualizarNivelCuenta));	
			this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaEliminarNivelCuenta && this.isPermisoEliminarNivelCuenta));
			this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarToolBarNivelCuenta.setVisible(this.isVisibilidadCeldaCancelarNivelCuenta);				
			this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaGuardarNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNivelCuenta.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoNivelCuenta && this.isPermisoNuevoNivelCuenta));			
			this.jMenuItemDuplicarNivelCuenta.setVisible((this.isVisibilidadCeldaDuplicarNivelCuenta && this.isPermisoDuplicarNivelCuenta));			
			this.jMenuItemCopiarNivelCuenta.setVisible((this.isVisibilidadCeldaCopiarNivelCuenta && this.isPermisoCopiarNivelCuenta));			
			this.jMenuItemVerFormNivelCuenta.setVisible((this.isVisibilidadCeldaVerFormNivelCuenta && this.isPermisoVerFormNivelCuenta));			
			this.jMenuItemAbrirOrderByNivelCuenta.setVisible((this.isVisibilidadCeldaOrdenNivelCuenta && this.isPermisoOrdenNivelCuenta));			
			//this.jMenuItemMostrarOcultarNivelCuenta.setVisible((this.isVisibilidadCeldaOrdenNivelCuenta && this.isPermisoOrdenNivelCuenta));
			this.jMenuItemDetalleAbrirOrderByNivelCuenta.setVisible((this.isVisibilidadCeldaOrdenNivelCuenta && this.isPermisoOrdenNivelCuenta));			
			//this.jMenuItemDetalleMostrarOcultarNivelCuenta.setVisible((this.isVisibilidadCeldaOrdenNivelCuenta && this.isPermisoOrdenNivelCuenta));			
			this.jMenuItemNuevoRelacionesNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesNivelCuenta && this.isPermisoNuevoNivelCuenta));			
			this.jMenuItemNuevoGuardarCambiosNivelCuenta.setVisible((this.isVisibilidadCeldaNuevoNivelCuenta && this.isPermisoNuevoNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));									
			
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemModificarNivelCuenta.setVisible((this.isVisibilidadCeldaModificarNivelCuenta && this.isPermisoActualizarNivelCuenta));	
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemActualizarNivelCuenta.setVisible((this.isVisibilidadCeldaActualizarNivelCuenta && this.isPermisoActualizarNivelCuenta));	
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemEliminarNivelCuenta.setVisible((this.isVisibilidadCeldaEliminarNivelCuenta && this.isPermisoEliminarNivelCuenta));
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemCancelarNivelCuenta.setVisible(this.isVisibilidadCeldaCancelarNivelCuenta);				
			}
			
			this.jMenuItemGuardarCambiosNivelCuenta.setVisible((this.isVisibilidadCeldaGuardarNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));						
			this.jMenuItemGuardarCambiosTablaNivelCuenta.setVisible((this.isVisibilidadCeldaGuardarCambiosNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNivelCuenta=this.jButtonNuevoNivelCuenta.isVisible();
			this.isVisibilidadCeldaDuplicarNivelCuenta=this.jButtonDuplicarNivelCuenta.isVisible();
			this.isVisibilidadCeldaCopiarNivelCuenta=this.jButtonCopiarNivelCuenta.isVisible();
			this.isVisibilidadCeldaVerFormNivelCuenta=this.jButtonVerFormNivelCuenta.isVisible();
			
			this.isVisibilidadCeldaOrdenNivelCuenta=this.jButtonAbrirOrderByNivelCuenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=this.jButtonNuevoRelacionesNivelCuenta.isVisible();
			this.isVisibilidadCeldaModificarNivelCuenta=this.jButtonModificarNivelCuenta.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.isVisibilidadCeldaActualizarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarNivelCuenta.isVisible();
			this.isVisibilidadCeldaEliminarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarNivelCuenta.isVisible();
			this.isVisibilidadCeldaCancelarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarNivelCuenta.isVisible();
			this.isVisibilidadCeldaGuardarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=this.jButtonGuardarCambiosTablaNivelCuenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNivelCuenta=this.jButtonNuevoToolBarNivelCuenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=this.jButtonNuevoRelacionesToolBarNivelCuenta.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.isVisibilidadCeldaModificarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarToolBarNivelCuenta.isVisible();
			this.isVisibilidadCeldaActualizarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarToolBarNivelCuenta.isVisible();
			this.isVisibilidadCeldaEliminarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarToolBarNivelCuenta.isVisible();
			this.isVisibilidadCeldaCancelarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarToolBarNivelCuenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelCuenta=this.jButtonGuardarCambiosToolBarNivelCuenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=this.jButtonGuardarCambiosTablaToolBarNivelCuenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNivelCuenta=this.jMenuItemNuevoNivelCuenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=this.jMenuItemNuevoRelacionesNivelCuenta.isVisible();
			
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.isVisibilidadCeldaModificarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jMenuItemModificarNivelCuenta.isVisible();
			this.isVisibilidadCeldaActualizarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jMenuItemActualizarNivelCuenta.isVisible();
			this.isVisibilidadCeldaEliminarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jMenuItemEliminarNivelCuenta.isVisible();
			this.isVisibilidadCeldaCancelarNivelCuenta=this.jInternalFrameDetalleFormNivelCuenta.jMenuItemCancelarNivelCuenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNivelCuenta=this.jMenuItemGuardarCambiosNivelCuenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=this.jMenuItemGuardarCambiosTablaNivelCuenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNivelCuenta(Boolean esInicializar) {
		if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
				//if(this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNivelCuenta();
			}
			
			this.inicializarActualizarBindingBotonesManualNivelCuenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNivelCuenta() {
		this.jButtonNuevoNivelCuenta.setVisible(this.isPermisoNuevoNivelCuenta);			
		this.jButtonDuplicarNivelCuenta.setVisible(this.isPermisoDuplicarNivelCuenta);			
		this.jButtonCopiarNivelCuenta.setVisible(this.isPermisoCopiarNivelCuenta);			
		this.jButtonVerFormNivelCuenta.setVisible(this.isPermisoVerFormNivelCuenta);			
		
		this.jButtonAbrirOrderByNivelCuenta.setVisible(this.isPermisoOrdenNivelCuenta);					
		
		this.jButtonNuevoRelacionesNivelCuenta.setVisible(this.isPermisoNuevoNivelCuenta);			
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarNivelCuenta.setVisible(this.isPermisoActualizarNivelCuenta);	
			this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarNivelCuenta.setVisible(this.isPermisoActualizarNivelCuenta);	
			this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarNivelCuenta.setVisible(this.isPermisoEliminarNivelCuenta);
			this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarNivelCuenta.setVisible(this.isVisibilidadCeldaCancelarNivelCuenta);						
			this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.setVisible(this.isPermisoGuardarCambiosNivelCuenta);							
		}
		
		this.jButtonGuardarCambiosTablaNivelCuenta.setVisible(this.isPermisoActualizarNivelCuenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelCuenta() {
		this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarNivelCuenta.setVisible(this.isPermisoActualizarNivelCuenta);	
		this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarNivelCuenta.setVisible(this.isPermisoActualizarNivelCuenta);	
		this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarNivelCuenta.setVisible(this.isPermisoEliminarNivelCuenta);
		this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarNivelCuenta.setVisible(this.isVisibilidadCeldaCancelarNivelCuenta);							
		this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.setVisible((this.isVisibilidadCeldaGuardarNivelCuenta && this.isPermisoGuardarCambiosNivelCuenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNivelCuenta() {
		if(NivelCuentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNivelCuenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNivelCuenta() {
	}
	
	public void jTableDatosNivelCuentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNivelCuenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNivelCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCuenta(this.getnivelcuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcuenta==null) {
						this.nivelcuenta = new NivelCuenta();
					}

					this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
				}

				if(this.nivelcuenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.nivelcuenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreNivelCuentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNivelCuenta(this.getnivelcuenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.nivelcuenta==null) {
						this.nivelcuenta = new NivelCuenta();
					}

					this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);
				}

				if(this.nivelcuenta.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.nivelcuenta.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNivelCuenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameNivelCuenta() {
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
		

		if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
			this.jInternalFrameDetalleFormNivelCuenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormNivelCuenta.dispose();
			this.jInternalFrameDetalleFormNivelCuenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
			this.jInternalFrameReporteDinamicoNivelCuenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNivelCuenta.dispose();
			this.jInternalFrameReporteDinamicoNivelCuenta=null;
		}
		
		if(this.jInternalFrameImportacionNivelCuenta!=null) {
			this.jInternalFrameImportacionNivelCuenta.setVisible(false);	    			
			this.jInternalFrameImportacionNivelCuenta.dispose();
			this.jInternalFrameImportacionNivelCuenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNivelCuenta();
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNivelCuenta")) {
				jButtonDuplicarNivelCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNivelCuenta")) {
				jButtonCopiarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormNivelCuenta")) {
				jButtonVerFormNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNivelCuenta")) {
				jButtonDuplicarNivelCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNivelCuenta")) {
				jButtonDuplicarNivelCuentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNivelCuenta")) {
				jButtonModificarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNivelCuenta")) {
				jButtonModificarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNivelCuenta")) {
				jButtonModificarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNivelCuenta")) {
				jButtonActualizarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNivelCuenta")) {
				jButtonActualizarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNivelCuenta")) {
				jButtonActualizarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarNivelCuenta")) {
				jButtonEliminarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNivelCuenta")) {
				jButtonEliminarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNivelCuenta")) {
				jButtonEliminarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarNivelCuenta")) {
				jButtonCancelarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNivelCuenta")) {
				jButtonCancelarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNivelCuenta")) {
				jButtonCancelarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarNivelCuenta")) {
				jButtonCerrarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNivelCuenta")) {
				jButtonCerrarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNivelCuenta")) {
				jButtonCerrarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNivelCuenta")) {
				jButtonMostrarOcultarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNivelCuenta")) {
				jButtonCancelarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNivelCuenta")) {
				jButtonCopiarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNivelCuenta")) {
				jButtonVerFormNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNivelCuenta")) {
				jButtonCopiarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNivelCuenta")) {
				jButtonVerFormNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNivelCuenta")) {
				jButtonRecargarInformacionNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNivelCuenta")) {
				jButtonRecargarInformacionNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNivelCuenta")) {
				jButtonRecargarInformacionNivelCuentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNivelCuenta")) {
				jButtonAnterioresNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNivelCuenta")) {
				jButtonAnterioresNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNivelCuenta")) {
				jButtonAnterioresNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNivelCuenta")) {
				jButtonSiguientesNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNivelCuenta")) {
				jButtonSiguientesNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNivelCuenta")) {
				jButtonSiguientesNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNivelCuenta") || sTipo.equals("MenuItemDetalleAbrirOrderByNivelCuenta")) {
				jButtonAbrirOrderByNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNivelCuenta") || sTipo.equals("MenuItemDetalleMostrarOcultarNivelCuenta")) {
				jButtonMostrarOcultarNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNivelCuenta")) {
				jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNivelCuenta")) {
				jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNivelCuenta")) {
				jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNivelCuenta")) {
				jButtonCerrarReporteDinamicoNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNivelCuenta")) {
				jButtonGenerarReporteDinamicoNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNivelCuenta")) {
				
				jButtonGenerarExcelReporteDinamicoNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNivelCuenta")) {
				jButtonCerrarImportacionNivelCuentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNivelCuenta")) {
				
				jButtonGenerarImportacionNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNivelCuenta")) {
				
				jButtonAbrirImportacionNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNivelCuenta")) {
				jComboBoxTiposAccionesNivelCuentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNivelCuenta")) {
				jComboBoxTiposRelacionesNivelCuentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNivelCuenta")) {
				jComboBoxTiposAccionesNivelCuentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNivelCuenta")) {
				
				jComboBoxTiposSeleccionarNivelCuentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNivelCuenta")) {
				jTextFieldValorCampoGeneralNivelCuentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNivelCuenta")) {
				jButtonAbrirOrderByNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNivelCuenta")) {
				jButtonAbrirOrderByNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNivelCuenta")) {
				jButtonCerrarOrderByNivelCuentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelCuentaBusqueda")) {
				this.jButtonidNivelCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNivelCuentaBusqueda")) {
				this.jButtonnombreNivelCuentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNivelCuenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NivelCuenta nivelcuentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				nivelcuentaLocal=this.nivelcuenta;
			} else {
				nivelcuentaLocal=this.nivelcuentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
							
				
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
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
			
			


			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
								
						
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
								
				
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
							
				
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
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
			
			


			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
								
				
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNivelCuenta")) {
					jCheckBoxSeleccionarTodosNivelCuentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNivelCuenta")) {
					jCheckBoxSeleccionadosNivelCuentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNivelCuenta")) {
					
				}
				
				


				
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
												
				
				


				
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
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
			
			


			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNivelCuentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.nivelcuenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.nivelcuenta);
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
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
				
				


				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NivelCuenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NivelCuenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNivelCuentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.nivelcuentaAnterior =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNivelCuenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNivelCuentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNivelCuenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.nivelcuenta =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.nivelcuenta =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.nivelcuenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNivelCuenta")) {
				
				}
				
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNivelCuenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNivelCuenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNivelCuenta")) {
			
			}
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNivelCuenta();
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
			if(sTipo.equals("NuevoNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNivelCuenta")) {
				jButtonDuplicarNivelCuentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNivelCuenta")) {
				jButtonCopiarNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNivelCuenta")) {
				jButtonVerFormNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNivelCuenta")) {
				jButtonNuevoNivelCuentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNivelCuenta")) {
				jButtonModificarNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNivelCuenta")) {
				jButtonActualizarNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNivelCuenta")) {
				jButtonEliminarNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNivelCuenta")) {
				jButtonCancelarNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNivelCuenta")) {
				jButtonCerrarNivelCuentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNivelCuenta")) {
				jButtonGuardarCambiosNivelCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNivelCuenta")) {
				jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNivelCuenta")) {
				jButtonAbrirOrderByNivelCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNivelCuenta")) {
				jButtonRecargarInformacionNivelCuentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNivelCuenta")) {
				jButtonAnterioresNivelCuentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNivelCuenta")) {
				jButtonSiguientesNivelCuentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNivelCuentaBusqueda")) {
				this.jButtonidNivelCuentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNivelCuentaBusqueda")) {
				this.jButtonnombreNivelCuentaBusquedaActionPerformed(evt);
			}
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNivelCuenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNivelCuenta")) {
				closingInternalFrameNivelCuenta();
				
			} else if(sTipo.equals("jButtonCancelarNivelCuenta")) {
				JInternalFrameBase jInternalFrameDetalleFormNivelCuenta = (JInternalFrameBase)evt.getSource();
	            	
	            NivelCuentaBeanSwingJInternalFrame jInternalFrameParent=(NivelCuentaBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelCuenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNivelCuentaActionPerformed(null);
			}
			
			NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.nivelcuenta,new Object(),this.nivelcuentaParameterGeneral,this.nivelcuentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNivelCuenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNivelCuenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNivelCuenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.nivelcuenta)) {
			if(!esControlTabla) {
				if(NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);			
				}
				
				if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNivelCuenta(this.nivelcuenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivelcuentaReturnGeneral=nivelcuentaLogic.procesarEventosNivelCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuentaLogic.getNivelCuentas(),this.nivelcuenta,this.nivelcuentaParameterGeneral,this.isEsNuevoNivelCuenta,classes);//this.nivelcuentaLogic.getNivelCuenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNivelCuenta(this.nivelcuentaReturnGeneral,this.nivelcuentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNivelCuenta(classes,this.nivelcuentaReturnGeneral,this.nivelcuentaBean,false);
					}
						
					if(this.nivelcuentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNivelCuenta(this.nivelcuentaReturnGeneral.getNivelCuenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNivelCuenta(this.nivelcuentaReturnGeneral.getNivelCuenta());	
					}
						
					if(this.nivelcuentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNivelCuenta(this.nivelcuentaReturnGeneral.getNivelCuenta(),classes);//this.nivelcuentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNivelCuenta(this.nivelcuenta,classes);//this.nivelcuentaBean);									
				}
			
				if(NivelCuentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNivelCuenta(this.nivelcuenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNivelCuenta(this.nivelcuenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.nivelcuentaAnterior!=null) {
						this.nivelcuenta=this.nivelcuentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.nivelcuentaReturnGeneral=nivelcuentaLogic.procesarEventosNivelCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuentaLogic.getNivelCuentas(),this.nivelcuenta,this.nivelcuentaParameterGeneral,this.isEsNuevoNivelCuenta,classes);//this.nivelcuentaLogic.getNivelCuenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.nivelcuentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.nivelcuentaReturnGeneral.getNivelCuenta(),nivelcuentaLogic.getNivelCuentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.nivelcuentaReturnGeneral.getNivelCuenta(),this.nivelcuentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNivelCuenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosNivelCuenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNivelCuenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosNivelCuenta() throws Exception {
		
		NivelCuentaModel nivelcuentaModel=(NivelCuentaModel)this.jTableDatosNivelCuenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			nivelcuentaModel.nivelcuentas=this.nivelcuentaLogic.getNivelCuentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			nivelcuentaModel.nivelcuentas=this.nivelcuentas;
		}
		
		
		((NivelCuentaModel) this.jTableDatosNivelCuenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNivelCuenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnivelcuentaAnterior(),this.nivelcuentaLogic.getNivelCuentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnivelcuentaAnterior(),this.nivelcuentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNivelCuenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNivelCuenta(NivelCuenta nivelcuenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContable.class)) {
					this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(nivelcuenta.getCuentaContables());
					this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
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
										
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuenta,new Object(),generalEntityParameterGeneral,this.nivelcuentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NivelCuentaConstantesFunciones.getClassesRelationshipsOfNivelCuenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NivelCuentaConstantesFunciones.getClassesRelationshipsFromStringsOfNivelCuenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNivelCuenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NivelCuentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.nivelcuenta,new Object(),generalEntityParameterGeneral,this.nivelcuentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNivelCuenta(NivelCuentaBean nivelcuentaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContable.class)) {
					this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.setCuentaContables(nivelcuenta.getCuentaContables());
					this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNivelCuenta(ArrayList<Classe> classes,NivelCuentaReturnGeneral nivelcuentaReturnGeneral,NivelCuentaBean nivelcuentaBean,Boolean conDefault) throws Exception {
		
			this.nivelcuentaBean.setCuentaContables(nivelcuentaReturnGeneral.getNivelCuenta().getCuentaContables());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNivelCuenta(NivelCuenta nivelcuenta,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContable.class)) {
					nivelcuenta.setCuentaContables(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableBeanSwingJInternalFrame.cuentacontableLogic.getCuentaContables());
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
		if(!paraTabla && !this.permiteMantenimiento(this.nivelcuenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNivelCuenta = new NivelCuentaDetalleFormJInternalFrame(jDesktopPane,this.nivelcuentaSessionBean.getConGuardarRelaciones(),this.nivelcuentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNivelCuenta);
		this.jInternalFrameDetalleFormNivelCuenta.setVisible(false);
		this.jInternalFrameDetalleFormNivelCuenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormNivelCuenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNivelCuenta.nivelcuentaLogic=this.nivelcuentaLogic;
		
		this.cargarCombosFrameForeignKeyNivelCuenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNivelCuenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNivelCuenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNivelCuenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNivelCuenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNivelCuenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelCuenta"));
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarNivelCuenta.addActionListener(new ButtonActionListener(this,"ModificarNivelCuenta"));

		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarToolBarNivelCuenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelCuenta"));
					
		this.jInternalFrameDetalleFormNivelCuenta.jMenuItemModificarNivelCuenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarNivelCuenta.addActionListener (new ButtonActionListener(this,"ActualizarNivelCuenta"));
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarToolBarNivelCuenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelCuenta"));
						
		this.jInternalFrameDetalleFormNivelCuenta.jMenuItemActualizarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarNivelCuenta.addActionListener (new ButtonActionListener(this,"EliminarNivelCuenta"));
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelCuenta"));
								
		this.jInternalFrameDetalleFormNivelCuenta.jMenuItemEliminarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarNivelCuenta.addActionListener (new ButtonActionListener(this,"CancelarNivelCuenta"));
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelCuenta"));
					
		this.jInternalFrameDetalleFormNivelCuenta.jMenuItemCancelarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelCuenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jMenuItemDetalleCerrarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelCuenta"));		
		
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCuenta"));
		
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCuenta"));
		
		
		
		this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelCuenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuenta.jButtonidNivelCuentaBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuenta.jButtonnombreNivelCuentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreNivelCuentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelCuenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNivelCuenta"));
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNivelCuenta"));
		}
		
		this.jTableDatosNivelCuenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNivelCuenta"));
		
		this.jTableDatosNivelCuenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNivelCuenta"));
		
		this.jButtonNuevoNivelCuenta.addActionListener(new ButtonActionListener(this,"NuevoNivelCuenta"));
		
		this.jButtonDuplicarNivelCuenta.addActionListener(new ButtonActionListener(this,"DuplicarNivelCuenta"));
		
		this.jButtonCopiarNivelCuenta.addActionListener(new ButtonActionListener(this,"CopiarNivelCuenta"));
		
		this.jButtonVerFormNivelCuenta.addActionListener(new ButtonActionListener(this,"VerFormNivelCuenta"));
		
		
		this.jButtonNuevoToolBarNivelCuenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarNivelCuenta"));
			
		this.jButtonDuplicarToolBarNivelCuenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNivelCuenta"));
			
		this.jMenuItemNuevoNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNivelCuenta"));
			
		this.jMenuItemDuplicarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNivelCuenta"));		
		
		
		this.jButtonNuevoRelacionesNivelCuenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNivelCuenta"));
		
		
		this.jButtonNuevoRelacionesToolBarNivelCuenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNivelCuenta"));
			
		this.jMenuItemNuevoRelacionesNivelCuenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNivelCuenta"));		
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarNivelCuenta.addActionListener(new ButtonActionListener(this,"ModificarNivelCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonModificarToolBarNivelCuenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarNivelCuenta"));
			
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemModificarNivelCuenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarNivelCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarNivelCuenta.addActionListener (new ButtonActionListener(this,"ActualizarNivelCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonActualizarToolBarNivelCuenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNivelCuenta"));
				
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemActualizarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNivelCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarNivelCuenta.addActionListener (new ButtonActionListener(this,"EliminarNivelCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonEliminarToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarNivelCuenta"));
						
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemEliminarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNivelCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarNivelCuenta.addActionListener (new ButtonActionListener(this,"CancelarNivelCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonCancelarToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarNivelCuenta"));
			
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemCancelarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNivelCuenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNivelCuenta"));		
		
		
		this.jButtonCerrarNivelCuenta.addActionListener (new ButtonActionListener(this,"CerrarNivelCuenta"));
		
		
		this.jButtonCerrarToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarNivelCuenta"));
			
		this.jMenuItemCerrarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNivelCuenta"));
			
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jMenuItemDetalleCerrarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNivelCuenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosNivelCuenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNivelCuenta"));
		}
		
		this.jButtonCopiarToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarNivelCuenta"));
			
		this.jButtonVerFormToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarNivelCuenta"));
		
		this.jMenuItemGuardarCambiosNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNivelCuenta"));
			
		this.jMenuItemCopiarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNivelCuenta"));		
		
		this.jMenuItemVerFormNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNivelCuenta"));		
		
		
		this.jButtonGuardarCambiosTablaNivelCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelCuenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNivelCuenta"));
			
		this.jMenuItemGuardarCambiosTablaNivelCuenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNivelCuenta"));		
		
		
		
		this.jButtonRecargarInformacionNivelCuenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionNivelCuenta"));
					
		this.jButtonRecargarInformacionToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNivelCuenta"));
		
		this.jMenuItemRecargarInformacionNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNivelCuenta"));		
		
		
		
		this.jButtonAnterioresNivelCuenta.addActionListener (new ButtonActionListener(this,"AnterioresNivelCuenta"));
		
		
		this.jButtonAnterioresToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNivelCuenta"));
		
		this.jMenuItemAnterioresNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNivelCuenta"));		
		
		
		this.jButtonSiguientesNivelCuenta.addActionListener (new ButtonActionListener(this,"SiguientesNivelCuenta"));
		
		
		this.jButtonSiguientesToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNivelCuenta"));
			
		this.jMenuItemSiguientesNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNivelCuenta"));
			
		this.jMenuItemAbrirOrderByNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNivelCuenta"));
			
		this.jMenuItemMostrarOcultarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNivelCuenta"));
			
		this.jMenuItemDetalleAbrirOrderByNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNivelCuenta"));
			
		this.jMenuItemDetalleMostarOcultarNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNivelCuenta"));		
		
		
		this.jButtonNuevoGuardarCambiosNivelCuenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNivelCuenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNivelCuenta"));
			
		this.jMenuItemNuevoGuardarCambiosNivelCuenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNivelCuenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNivelCuenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNivelCuenta"));

		this.jCheckBoxSeleccionadosNivelCuenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNivelCuenta"));
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNivelCuenta"));
		}
		
		
		this.jComboBoxTiposRelacionesNivelCuenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesNivelCuenta"));
			
		this.jComboBoxTiposAccionesNivelCuenta.addActionListener (new ButtonActionListener(this,"TiposAccionesNivelCuenta"));
					
		this.jComboBoxTiposSeleccionarNivelCuenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNivelCuenta"));
			
		this.jTextFieldValorCampoGeneralNivelCuenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNivelCuenta"));		
		
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuenta.jButtonidNivelCuentaBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuenta.jButtonnombreNivelCuentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreNivelCuentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNivelCuenta!=null) {
				this.jInternalFrameReporteDinamicoNivelCuenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCuenta"));
				this.jInternalFrameReporteDinamicoNivelCuenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCuenta"));
				this.jInternalFrameReporteDinamicoNivelCuenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCuenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoNivelCuenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNivelCuenta"));				
			//this.jButtonGenerarReporteDinamicoNivelCuenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNivelCuenta"));
			//this.jButtonGenerarExcelReporteDinamicoNivelCuenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNivelCuenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNivelCuenta!=null) {
				this.jInternalFrameImportacionNivelCuenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNivelCuenta"));
				this.jInternalFrameImportacionNivelCuenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNivelCuenta"));
				this.jInternalFrameImportacionNivelCuenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNivelCuenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNivelCuenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByNivelCuenta"));
			
			this.jButtonAbrirOrderByToolBarNivelCuenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNivelCuenta"));			
			
			if(this.jInternalFrameOrderByNivelCuenta!=null) {
				this.jInternalFrameOrderByNivelCuenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNivelCuenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNivelCuenta.jTabbedPaneRelacionesNivelCuenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNivelCuenta"));
		
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
            		closingInternalFrameNivelCuenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNivelCuenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNivelCuenta = (JInternalFrameBase)event.getSource();
	            	
	            NivelCuentaBeanSwingJInternalFrame jInternalFrameParent=(NivelCuentaBeanSwingJInternalFrame)jInternalFrameDetalleFormNivelCuenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNivelCuentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNivelCuenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNivelCuentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNivelCuenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNivelCuenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNivelCuenta";
		inputMap = this.jButtonNuevoNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelCuentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNivelCuentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNivelCuenta";
		inputMap = this.jButtonNuevoRelacionesNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNivelCuentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNivelCuenta";
		inputMap = this.jButtonModificarNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNivelCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNivelCuenta";
		inputMap = this.jButtonActualizarNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNivelCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNivelCuenta";
		inputMap = this.jButtonEliminarNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNivelCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNivelCuenta";
		inputMap = this.jButtonCancelarNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNivelCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNivelCuenta";
		inputMap = this.jButtonCerrarNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNivelCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNivelCuenta";
		inputMap = this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNivelCuenta.jButtonGuardarCambiosNivelCuenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNivelCuentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNivelCuenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNivelCuentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNivelCuenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNivelCuentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNivelCuenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNivelCuentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNivelCuenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNivelCuentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuenta.jButtonidNivelCuentaBusqueda.addActionListener(new ButtonActionListener(this,"idNivelCuentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNivelCuenta.jButtonnombreNivelCuentaBusqueda.addActionListener(new ButtonActionListener(this,"nombreNivelCuentaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNivelCuenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNivelCuentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNivelCuentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNivelCuenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNivelCuenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
					nivelcuentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuenta nivelcuentaAux:nivelcuentas) {
					nivelcuentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNivelCuentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelCuenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
						nivelcuentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCuenta nivelcuentaAux:nivelcuentas) {
						nivelcuentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCuenta nivelcuentaAux:nivelcuentas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNivelCuenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelCuenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelCuenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelCuenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNivelCuentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNivelCuenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNivelCuenta.getSelectedRows();
			
			NivelCuenta nivelcuentaLocal=new NivelCuenta();
			
			//this.seleccionarTodosNivelCuenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					nivelcuentaLocal =(NivelCuenta) this.nivelcuentaLogic.getNivelCuentas().toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					nivelcuentaLocal =(NivelCuenta) this.nivelcuentas.toArray()[this.jTableDatosNivelCuenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				nivelcuentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
						nivelcuentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NivelCuenta nivelcuentaAux:nivelcuentas) {
						nivelcuentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNivelCuenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNivelCuenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNivelCuenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNivelCuenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNivelCuentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNivelCuentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNivelCuentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNivelCuenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNivelCuenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NivelCuenta nivelcuentaAux:this.nivelcuentaLogic.getNivelCuentas()) {
				
						if(sTipoSeleccionar.equals(NivelCuentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							nivelcuentaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuenta nivelcuentaAux:nivelcuentas) {
					
						if(sTipoSeleccionar.equals(NivelCuentaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							nivelcuentaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNivelCuenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNivelCuentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNivelCuenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNivelCuenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNivelCuenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNivelCuenta) {				
					conSplash=true;//false;										
					
					//this.startProcessNivelCuenta(conSplash);
				
					this.generarReporteNivelCuentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNivelCuentasSeleccionados();
				//this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelCuentasSeleccionados(false);
				//this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNivelCuentasSeleccionados(true);
				//this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelCuenta();
				
				this.exportarNivelCuentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNivelCuentas();
				//this.importarNivelCuentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNivelCuenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNivelCuentasSeleccionados();
				//this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Nivel Cuenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNivelCuenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNivelCuenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNivelCuenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.setSelectedIndex(0);					
				}	
			} 			
			else if(NivelCuentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNivelCuenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNivelCuenta(conSplash);
					
						//this.actualizarParametrosGeneralNivelCuenta();
						
						this.generarReporteProcesoAccionNivelCuentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NivelCuentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Nivel CuentaS SELECCIONADOS?", "MANTENIMIENTO DE Nivel Cuenta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNivelCuenta();
				
						this.actualizarParametrosGeneralNivelCuenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.nivelcuentaReturnGeneral=nivelcuentaLogic.procesarAccionNivelCuentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.nivelcuentaLogic.getNivelCuentas(),this.nivelcuentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNivelCuentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNivelCuenta();
					
					NivelCuentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNivelCuentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNivelCuenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNivelCuenta.jComboBoxTiposAccionesFormularioNivelCuenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNivelCuenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNivelCuentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNivelCuenta();
			
			if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
			NivelCuenta nivelcuenta=new NivelCuenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNivelCuenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNivelCuenta.getSelectedItem();
			
			
			
			
			nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(nivelcuentasSeleccionados.size()==1) {
				for(NivelCuenta nivelcuentaAux:nivelcuentasSeleccionados) {
					nivelcuenta=nivelcuentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cuenta Contable")) {
					jButtonCuentaContableActionPerformed(null,rowIndex,true,false,nivelcuenta);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNivelCuenta();
			
      		//this.finishProcessNivelCuenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNivelCuentaReturnGeneral() throws Exception {
		if(this.nivelcuentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.nivelcuentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.nivelcuentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.nivelcuentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.nivelcuentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.nivelcuentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNivelCuenta(false);
		}
		
		if(this.nivelcuentaReturnGeneral.getConRetornoLista() || this.nivelcuentaReturnGeneral.getConRetornoObjeto()) {
			if(this.nivelcuentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivelcuentaLogic.setNivelCuentas(this.nivelcuentaReturnGeneral.getNivelCuentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.nivelcuentaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.nivelcuentaLogic.setNivelCuenta(this.nivelcuentaReturnGeneral.getNivelCuenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNivelCuenta(false);
		}
	}
	
	public void actualizarParametrosGeneralNivelCuenta() throws Exception {
		
		
	}
	
	public ArrayList<NivelCuenta> getNivelCuentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNivelCuenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NivelCuenta nivelcuentaAux:nivelcuentaLogic.getNivelCuentas()) {
					if(nivelcuentaAux.getIsSelected()) {
						nivelcuentasSeleccionados.add(nivelcuentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NivelCuenta nivelcuentaAux:this.nivelcuentas) {
					if(nivelcuentaAux.getIsSelected()) {
						nivelcuentasSeleccionados.add(nivelcuentaAux);				
					}
				}
			}
			
			if(nivelcuentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						nivelcuentasSeleccionados.addAll(this.nivelcuentaLogic.getNivelCuentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						nivelcuentasSeleccionados.addAll(this.nivelcuentas);				
					}
				}
			}
		} else {
			nivelcuentasSeleccionados.add(this.nivelcuenta);
		}
		
		return nivelcuentasSeleccionados;
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
	
	public void generarReporteNivelCuentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNivelCuentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNivelCuentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelCuentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNivelCuentasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesNivelCuentasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Nivel Cuenta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNivelCuentasSeleccionados() throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNivelCuentas("Todos",nivelcuentasSeleccionados);
		
	}	
	
	public void generarReporteNormalNivelCuentasSeleccionados() throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNivelCuentas("Todos",nivelcuentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNivelCuentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNivelCuentas("Todos",nivelcuentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNivelCuentasSeleccionados() throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNivelCuenta();
		
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNivelCuenta();
		
		
		//this.generarReporteNivelCuentas("Todos",nivelcuentasSeleccionados ,nivelcuentaImplementable,nivelcuentaImplementableHome);
	}
	
	public void mostrarImportacionNivelCuentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNivelCuenta();
		
		this.abrirFrameImportacionNivelCuenta();		
		
			
		//this.generarReporteNivelCuentas("Todos",nivelcuentasSeleccionados ,nivelcuentaImplementable,nivelcuentaImplementableHome);
	}
	
	public void importarNivelCuentas() throws Exception {		
	
	}
	
	public void exportarNivelCuentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNivelCuentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNivelCuentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNivelCuentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Nivel Cuenta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNivelCuentasSeleccionados() throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNivelCuenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NivelCuenta nivelcuentaAux:nivelcuentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNivelCuenta(nivelcuentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//nivelcuentaAux.setsDetalleGeneralEntityReporte(nivelcuentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNivelCuenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NivelCuentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCuentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NivelCuentaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNivelCuenta(NivelCuenta nivelcuenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=nivelcuenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcuenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=nivelcuenta.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNivelCuentasSeleccionados() throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NivelCuentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNivelCuenta(row);				
				iRow++;
			}				
			
			for(NivelCuenta nivelcuentaAux:nivelcuentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNivelCuenta(nivelcuentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNivelCuentasSeleccionados() throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();		
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"nivelcuenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("nivelcuentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("nivelcuenta");
			//elementRoot.appendChild(element);
		
			for(NivelCuenta nivelcuentaAux:nivelcuentasSeleccionados) {
				element = document.createElement("nivelcuenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNivelCuenta(nivelcuentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Nivel Cuenta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNivelCuenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NivelCuentaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNivelCuenta(NivelCuenta nivelcuenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcuenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(nivelcuenta.getnombre());				
	}
	
	public void setFilaDatosExportarXmlNivelCuenta(NivelCuenta nivelcuenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NivelCuentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(nivelcuenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NivelCuentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(nivelcuenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(NivelCuentaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(nivelcuenta.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoNivelCuentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NivelCuenta> nivelcuentasSeleccionados=new ArrayList<NivelCuenta>();
		
		nivelcuentasSeleccionados=this.getNivelCuentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNivelCuenta(nivelcuentasSeleccionados);
		
		this.generarReporteNivelCuentas("Todos",nivelcuentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNivelCuenta(ArrayList<NivelCuenta> nivelcuentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NivelCuenta nivelcuentaAux:nivelcuentasSeleccionados) {
				nivelcuentaAux.setsDetalleGeneralEntityReporte(nivelcuentaAux.toString());
			
				if(sTipoSeleccionar.equals(NivelCuentaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					nivelcuentaAux.setsDescripcionGeneralEntityReporte1(nivelcuentaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NivelCuentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNivelCuenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNivelCuenta=true;
				this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=true;
				this.isVisibilidadCeldaGuardarCambiosNivelCuenta=true;
			}
			
			this.isVisibilidadCeldaModificarNivelCuenta=false;
			this.isVisibilidadCeldaActualizarNivelCuenta=false;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
			this.isVisibilidadCeldaCancelarNivelCuenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNivelCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
			this.isVisibilidadCeldaModificarNivelCuenta=false;
			this.isVisibilidadCeldaActualizarNivelCuenta=true;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
			this.isVisibilidadCeldaCancelarNivelCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNivelCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
			this.isVisibilidadCeldaModificarNivelCuenta=false;
			this.isVisibilidadCeldaActualizarNivelCuenta=true;
			this.isVisibilidadCeldaEliminarNivelCuenta=true;
			this.isVisibilidadCeldaCancelarNivelCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNivelCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
			this.isVisibilidadCeldaModificarNivelCuenta=false;
			this.isVisibilidadCeldaActualizarNivelCuenta=true;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
			this.isVisibilidadCeldaCancelarNivelCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNivelCuenta=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=true;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=true;
			this.isVisibilidadCeldaModificarNivelCuenta=false;
			this.isVisibilidadCeldaActualizarNivelCuenta=false;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
			this.isVisibilidadCeldaCancelarNivelCuenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuenta=true;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNivelCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
			this.isVisibilidadCeldaActualizarNivelCuenta=false;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
			this.isVisibilidadCeldaCancelarNivelCuenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNivelCuenta=false;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
			this.isVisibilidadCeldaModificarNivelCuenta=true;
			this.isVisibilidadCeldaActualizarNivelCuenta=false;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
			this.isVisibilidadCeldaCancelarNivelCuenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				} else {
					this.isVisibilidadCeldaGuardarNivelCuenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NivelCuentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNivelCuenta=true;
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=true;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=true;
		} else {
			this.actualizarEstadoPanelsNivelCuenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNivelCuenta=false;
			//this.isVisibilidadCeldaVerFormNivelCuenta=false;
			this.isVisibilidadCeldaDuplicarNivelCuenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!nivelcuentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
		} else {
			this.isVisibilidadCeldaNuevoNivelCuenta=false;
			this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			if(!nivelcuentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;												
			}
			
			this.jButtonCerrarNivelCuenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNivelCuenta=false;
		}
		
		if(!this.permiteMantenimiento(this.nivelcuenta)) {
			this.isVisibilidadCeldaActualizarNivelCuenta=false;
			this.isVisibilidadCeldaEliminarNivelCuenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNivelCuenta() {
		this.isVisibilidadCeldaNuevoNivelCuenta=false;
		this.isVisibilidadCeldaGuardarCambiosNivelCuenta=false;
	}
	
	public void actualizarEstadoPanelsNivelCuenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNivelCuenta!=null) {
				this.jScrollPanelDatosEdicionNivelCuenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuenta!=null) {
				this.jScrollPanelDatosNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuenta!=null) {
				this.jPanelPaginacionNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuenta!=null) {
				this.jPanelParametrosReportesNivelCuenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNivelCuenta!=null) {
				this.jScrollPanelDatosEdicionNivelCuenta.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosNivelCuenta!=null) {
				this.jScrollPanelDatosNivelCuenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCuenta!=null) {
				this.jPanelPaginacionNivelCuenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCuenta!=null) {
				this.jPanelParametrosReportesNivelCuenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNivelCuenta!=null) {
				this.jScrollPanelDatosEdicionNivelCuenta.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosNivelCuenta!=null) {
				this.jScrollPanelDatosNivelCuenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCuenta!=null) {
				this.jPanelPaginacionNivelCuenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCuenta!=null) {
				this.jPanelParametrosReportesNivelCuenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNivelCuenta!=null) {
				this.jScrollPanelDatosEdicionNivelCuenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuenta!=null) {
				this.jScrollPanelDatosNivelCuenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionNivelCuenta!=null) {
				this.jPanelPaginacionNivelCuenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNivelCuenta!=null) {
				this.jPanelParametrosReportesNivelCuenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNivelCuenta!=null) {
				this.jScrollPanelDatosEdicionNivelCuenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNivelCuenta!=null) {
				this.jScrollPanelDatosNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuenta!=null) {
				this.jPanelPaginacionNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuenta!=null) {
				this.jPanelParametrosReportesNivelCuenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNivelCuenta!=null) {
				this.jScrollPanelDatosEdicionNivelCuenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosNivelCuenta!=null) {
				this.jScrollPanelDatosNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuenta!=null) {
				this.jPanelPaginacionNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuenta!=null) {
				this.jPanelParametrosReportesNivelCuenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNivelCuenta!=null) {
				this.jScrollPanelDatosEdicionNivelCuenta.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosNivelCuenta!=null) {
				this.jScrollPanelDatosNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionNivelCuenta!=null) {
				this.jPanelPaginacionNivelCuenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNivelCuenta!=null) {
				this.jPanelParametrosReportesNivelCuenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionNivelCuentaParaCuentaContables() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(this.nivelcuentaSessionBean==null) {
				this.nivelcuentaSessionBean=new NivelCuentaSessionBean();
			}

			if(this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean==null) {
				this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean=new CuentaContableSessionBean();
			}

			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean.setsPathNavegacionActual(nivelcuentaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaContable=this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(NivelCuentaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionNivelCuenta(true);
			this.jInternalFrameDetalleFormNivelCuenta.cuentacontableSessionBean.setlidNivelCuentaActual(this.idNivelCuentaActual);

			nivelcuentaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNivelCuenta(true);
			nivelcuentaSessionBean.setlIdNivelCuentaActualForeignKey(this.idNivelCuentaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NivelCuentaSessionBean nivelcuentaSessionBean=new NivelCuentaSessionBean();
		
		if(this.nivelcuentaSessionBean==null) {
			this.nivelcuentaSessionBean=new NivelCuentaSessionBean();
		}
		
		this.nivelcuentaSessionBean.setsUltimaBusquedaNivelCuenta(this.getsAccionBusqueda());
		this.nivelcuentaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.nivelcuentaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NivelCuentaSessionBean nivelcuentaSessionBean=new NivelCuentaSessionBean();
		
		if(this.nivelcuentaSessionBean==null) {
			this.nivelcuentaSessionBean=new NivelCuentaSessionBean();
		}
		
		if(this.nivelcuentaSessionBean.getsUltimaBusquedaNivelCuenta()!=null&&!this.nivelcuentaSessionBean.getsUltimaBusquedaNivelCuenta().equals("")) {
			this.setsAccionBusqueda(nivelcuentaSessionBean.getsUltimaBusquedaNivelCuenta());
			this.setiNumeroPaginacion(nivelcuentaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(nivelcuentaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.nivelcuentaSessionBean.setsUltimaBusquedaNivelCuenta("");
		this.nivelcuentaSessionBean.setiNumeroPaginacion(NivelCuentaConstantesFunciones.INUMEROPAGINACION);
		this.nivelcuentaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNivelCuenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNivelCuenta() {
		this.updateBorderResaltarBusquedasFormularioNivelCuenta();
		this.updateVisibilidadBusquedasFormularioNivelCuenta();
		this.updateHabilitarBusquedasFormularioNivelCuenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioNivelCuenta() {					
	}
	
	public void updateVisibilidadBusquedasFormularioNivelCuenta() {
	}
	
	public void updateHabilitarBusquedasFormularioNivelCuenta() {
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
	
	public void updateControlesFormularioNivelCuenta() throws Exception {

		if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNivelCuenta();
		this.updateVisibilidadResaltarControlesFormularioNivelCuenta();
		this.updateHabilitarResaltarControlesFormularioNivelCuenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioNivelCuenta() throws Exception {
		if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.nivelcuentaConstantesFunciones.resaltaridNivelCuenta!=null && this.jInternalFrameDetalleFormNivelCuenta!=null) {this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.setBorder(this.nivelcuentaConstantesFunciones.resaltaridNivelCuenta);}
		if(this.nivelcuentaConstantesFunciones.resaltarnombreNivelCuenta!=null && this.jInternalFrameDetalleFormNivelCuenta!=null) {this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.setBorder(this.nivelcuentaConstantesFunciones.resaltarnombreNivelCuenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNivelCuenta() throws Exception {		
		if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
	
		//this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.setVisible(this.nivelcuentaConstantesFunciones.mostraridNivelCuenta);
		this.jInternalFrameDetalleFormNivelCuenta.jPanelidNivelCuenta.setVisible(this.nivelcuentaConstantesFunciones.mostraridNivelCuenta);
		//this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.setVisible(this.nivelcuentaConstantesFunciones.mostrarnombreNivelCuenta);
		this.jInternalFrameDetalleFormNivelCuenta.jPanelnombreNivelCuenta.setVisible(this.nivelcuentaConstantesFunciones.mostrarnombreNivelCuenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNivelCuenta() throws Exception {
		if(this.jInternalFrameDetalleFormNivelCuenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNivelCuenta!=null) {
	
		this.jInternalFrameDetalleFormNivelCuenta.jTextFieldidNivelCuenta.setEnabled(this.nivelcuentaConstantesFunciones.activaridNivelCuenta);
		this.jInternalFrameDetalleFormNivelCuenta.jTextAreanombreNivelCuenta.setEnabled(this.nivelcuentaConstantesFunciones.activarnombreNivelCuenta);
		}
	}
	
		
}